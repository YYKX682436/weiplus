package te1;

/* loaded from: classes13.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedHashMap f499376a = new java.util.LinkedHashMap(8, 0.75f);

    public synchronized void a(java.lang.String str, te1.s sVar) {
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f499376a.get(str);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            this.f499376a.put(str, arrayList);
            ve1.g.p(3, "RequestManager", "add videoRequest:" + sVar, null);
        }
        arrayList.add(sVar);
    }

    public void b(java.lang.String str, te1.s sVar) {
        java.util.ArrayList c17 = c(str, 10);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = c17.iterator();
        while (it.hasNext()) {
            te1.s sVar2 = (te1.s) it.next();
            if (sVar2.a(0)) {
                arrayList.add(sVar2);
            }
        }
        java.lang.String str2 = "VideoProxy/" + sVar.f499359f + "/RequestManager";
        ve1.g.p(4, str2, "cancelPreloadRequestsSync, videoKey:" + str + ", count:" + arrayList.size(), null);
        if (arrayList.size() > 0) {
            java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(arrayList.size());
            ve1.g.p(5, str2, "start auto cancel preload requests, request count=" + countDownLatch.getCount(), null);
            te1.u uVar = new te1.u(this, countDownLatch);
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                te1.s sVar3 = (te1.s) it6.next();
                sVar3.f499357d = uVar;
                if (sVar3.f499354a != null) {
                    if (sVar3.u(0, 1) && qe1.a.a().f443550b) {
                        ve1.g.p(3, sVar3.f(), "cancel start, seq=" + sVar3.f499359f, null);
                    }
                    sVar3.s(1);
                    sVar3.f499354a.cancel(true);
                }
            }
            try {
                countDownLatch.await(2000, java.util.concurrent.TimeUnit.MILLISECONDS);
                if (c(str, 10).size() == 0) {
                    ve1.g.p(5, str2, "auto cancel preload requests success", null);
                } else {
                    ve1.g.p(5, str2, "auto cancel preload requests timeout, max wait time is 2000 seconds", null);
                }
            } catch (java.lang.InterruptedException e17) {
                ve1.g.p(5, str2, "auto cancel preload requests interrupted " + e17.toString(), null);
            }
        }
    }

    public synchronized java.util.ArrayList c(java.lang.String str, int i17) {
        java.util.ArrayList arrayList;
        arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f499376a.entrySet().iterator();
        while (it.hasNext()) {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) ((java.util.Map.Entry) it.next()).getValue();
            if (arrayList2.size() > 0) {
                te1.s sVar = (te1.s) arrayList2.get(0);
                if (str.equals(sVar.f499367n)) {
                    if (i17 == -1) {
                        arrayList.addAll(arrayList2);
                    } else if (i17 == sVar.f499361h) {
                        arrayList.addAll(arrayList2);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized void d(te1.s sVar) {
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f499376a.get(sVar.f499368o);
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (sVar.equals((te1.s) it.next())) {
                    if (qe1.a.a().f443550b) {
                        ve1.g.p(3, "RequestManager", "remove videoRequest:" + sVar, null);
                    }
                    it.remove();
                }
            }
        }
    }

    /* renamed from: toString */
    public synchronized java.lang.String m166300x9616526c() {
        java.lang.String str;
        str = super.toString() + "[";
        java.util.Iterator it = this.f499376a.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Iterator it6 = ((java.util.ArrayList) ((java.util.Map.Entry) it.next()).getValue()).iterator();
            while (it6.hasNext()) {
                str = (str + ((te1.s) it6.next()).m166299x9616526c()) + ",\n";
            }
        }
        return str + "]";
    }
}
