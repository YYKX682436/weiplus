package ko3;

/* loaded from: classes9.dex */
public enum l0 {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f391518d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public android.hardware.display.DisplayManager f391519e = null;

    l0() {
    }

    public r45.lw4 h() {
        try {
            byte[] j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("normsg_sri").j("sris");
            if (j17 != null && j17.length != 0) {
                r45.mw4 mw4Var = new r45.mw4();
                mw4Var.mo11468x92b714fd(j17);
                java.util.Collections.sort(mw4Var.f462400d, new ko3.C29041x608481d());
                return (r45.lw4) mw4Var.f462400d.get(0);
            }
            return null;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SRD", "get sri error:" + th6);
            return null;
        }
    }

    public final void i() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("normsg_sri");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f391518d;
        if (concurrentHashMap.isEmpty()) {
            M.W("sris");
            return;
        }
        try {
            r45.mw4 mw4Var = new r45.mw4();
            mw4Var.f462400d = new java.util.LinkedList(concurrentHashMap.values());
            if (M.H("sris", mw4Var.mo14344x5f01b1f6())) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SRD", "encode sri failed");
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SRD", "update mmkv error: " + e17);
        }
    }
}
