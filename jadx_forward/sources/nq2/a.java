package nq2;

/* loaded from: classes2.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f420509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f420510e;

    public a(r45.qt2 qt2Var, java.util.LinkedList linkedList) {
        this.f420509d = qt2Var;
        this.f420510e = linkedList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nq2.d dVar = nq2.d.f420513a;
        if (!dVar.b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("NearbyPreloadManager", "startPreloadNearbyLiveTabPages return for enableNearbyLivePagesPreload:" + dVar.b());
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startPreloadNearbyLiveTabPages tabList:");
        java.util.LinkedList<r45.dd2> linkedList = this.f420510e;
        sb6.append(linkedList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyPreloadManager", sb6.toString());
        for (r45.dd2 dd2Var : linkedList) {
            java.util.HashMap hashMap = nq2.d.f420515c;
            if (hashMap.containsKey(java.lang.Integer.valueOf(dd2Var.m75939xb282bd08(0)))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("NearbyPreloadManager", "startPreloadNearbyLiveTabPages return for map contains tab:[" + dd2Var.m75939xb282bd08(0) + ", " + dd2Var.m75945x2fec8307(1) + ']');
            } else {
                java.util.Iterator it = nq2.d.f420517e.iterator();
                int i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    } else if (((r45.dd2) it.next()).m75939xb282bd08(0) == dd2Var.m75939xb282bd08(0)) {
                        break;
                    } else {
                        i17++;
                    }
                }
                if (i17 != -1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("NearbyPreloadManager", "startPreloadNearbyLiveTabPages return for tab page rendered tab:[" + dd2Var.m75939xb282bd08(0) + ", " + dd2Var.m75945x2fec8307(1) + ']');
                } else if (dd2Var.m75933x41a8a7f2(2)) {
                    nq2.d dVar2 = nq2.d.f420513a;
                    int m75939xb282bd08 = dd2Var.m75939xb282bd08(0);
                    int a17 = dVar2.a(m75939xb282bd08);
                    pq2.e d17 = dVar2.d(a17, m75939xb282bd08, 12);
                    r45.qt2 contextObj = this.f420509d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
                    d17.k();
                    d17.f439124r = contextObj;
                    d17.h();
                    hashMap.put(java.lang.Integer.valueOf(m75939xb282bd08), d17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyPreloadManager", "startAndPutTargetNearbyLiveSquareTabPagePreload PagePreloadMap commentScene " + a17 + " TabId: " + m75939xb282bd08 + " memoryType: " + (m75939xb282bd08 + 1005000 + dVar2.a(m75939xb282bd08)));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("NearbyPreloadManager", "startPreloadNearbyLiveTabPages return for tab disable preload:[" + dd2Var.m75939xb282bd08(0) + ", " + dd2Var.m75945x2fec8307(1) + ']');
                }
            }
        }
    }
}
