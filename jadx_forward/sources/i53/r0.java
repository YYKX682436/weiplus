package i53;

/* loaded from: classes15.dex */
public class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f370236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i53.v0 f370237e;

    public r0(i53.v0 v0Var, int i17) {
        this.f370237e = v0Var;
        this.f370236d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        i53.v0 v0Var = this.f370237e;
        java.util.LinkedList linkedList = new java.util.LinkedList(v0Var.f370282a);
        java.util.Set set = v0Var.f370283b;
        set.addAll(linkedList);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.i4 bj6 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.bj();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.n0 n0Var = v0Var.f370292k;
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = bj6.f264470d;
        if (copyOnWriteArraySet != null && n0Var != null && !copyOnWriteArraySet.contains(n0Var)) {
            copyOnWriteArraySet.add(n0Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.bj().b(v0Var.f370291j);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameHaowanUploadTask", "upload, list : %s", linkedList.toString());
        v0Var.f370285d = false;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            int i17 = this.f370236d;
            if (i17 == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameHaowanUploadTask", "upload image");
                if (!i53.v0.a(v0Var, str, 20301, 215, 2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameHaowanUploadTask", "upload, ret is false, remove: %s", str);
                    ((java.util.HashSet) set).remove(str);
                    m33.o1 o1Var = v0Var.f370286e;
                    if (o1Var != null) {
                        ((u93.m) o1Var).a(false, -1, null, null, null, null);
                    }
                    i53.v0.b(v0Var);
                    return;
                }
            } else if (i17 != 2) {
                continue;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameHaowanUploadTask", "upload video");
                if (v0Var.f370290i.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameHaowanUploadTask", "thumbLocalId is empty");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().b(str);
                    if (b17 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Haowan.GameHaowanUploadTask", "get webview file chooser item  by local id failed : %s", str);
                        m33.o1 o1Var2 = v0Var.f370286e;
                        if (o1Var2 != null) {
                            ((u93.m) o1Var2).a(false, -2, null, null, null, null);
                            return;
                        }
                        return;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 b18 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().b(v0Var.f370290i);
                    if (b18 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Haowan.GameHaowanUploadTask", "get thumb webview file chooser item  by local id failed : %s", v0Var.f370290i);
                        m33.o1 o1Var3 = v0Var.f370286e;
                        if (o1Var3 != null) {
                            ((u93.m) o1Var3).a(false, -2, null, null, null, null);
                            return;
                        }
                        return;
                    }
                    java.lang.String str2 = b18.f264271g;
                    b17.f264270f = str2;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameHaowanUploadTask", "item.thumFilePath:%s", str2);
                }
                if (!i53.v0.a(v0Var, str, 20302, 214, 2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameHaowanUploadTask", "upload, ret is false, remove: %s", str);
                    ((java.util.HashSet) set).remove(str);
                    m33.o1 o1Var4 = v0Var.f370286e;
                    if (o1Var4 != null) {
                        ((u93.m) o1Var4).a(false, -1, null, null, null, null);
                    }
                    i53.v0.b(v0Var);
                    return;
                }
            }
        }
        v0Var.f370285d = true;
    }
}
