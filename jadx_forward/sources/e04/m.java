package e04;

/* loaded from: classes9.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f327555d;

    public m(java.lang.Object obj) {
        this.f327555d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj = this.f327555d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.String");
        java.util.List<java.lang.String> f07 = r26.n0.f0((java.lang.String) obj, new java.lang.String[]{","}, false, 0, 6, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineScanManager", "notifyMessage localStr: %d, context size: %d", java.lang.Integer.valueOf(((java.lang.String) obj).length()), java.lang.Integer.valueOf(f07.size()));
        for (java.lang.String str : f07) {
            if (str.length() > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineScanManager", "insertOfflineScanMessage");
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                f9Var.u1("notifymessage");
                f9Var.j1(0);
                f9Var.r1(3);
                f9Var.m124850x7650bebc(721420337);
                f9Var.e1(c01.w9.p());
                f9Var.d1(str);
                c01.w9.x(f9Var);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5172x3d23981 c5172x3d23981 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5172x3d23981();
                c5172x3d23981.f135521g.f87734a = f9Var;
                c5172x3d23981.e();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineScanManager", "notifyOfflineScanMessage context is empty, ignore");
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineScanManager", "clearOfflineScanMessage");
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_OFFLINE_SCAN_LOCAL_STORAGE_STRING_SYNC, null);
    }
}
