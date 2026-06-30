package e04;

/* loaded from: classes9.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final e04.o f327567a = new e04.o();

    /* renamed from: b, reason: collision with root package name */
    public static int f327568b = -1;

    public final boolean a(int i17, int i18, com.p314xaae8f345.mm.p944x882e457a.m1 scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        if (scene.mo808xfb85f7b0() == 233 || scene.mo808xfb85f7b0() == 106 || scene.mo808xfb85f7b0() == 1061) {
            return i17 == 1 || i17 == 2 || i17 == 3 || i17 == 7 || i17 == 8 || i17 == 9;
        }
        return false;
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17277xe9e90aaf context, java.lang.String showMsg, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(showMsg, "showMsg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineScanManager", "OfflineScan handleNetworkUnconnected needNotifyMessage: %b, context: %s, time: %d", java.lang.Boolean.valueOf(z17), context, java.lang.Long.valueOf(context.f240299m));
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17277xe9e90aaf.f37916x681a0c0c.getClass();
        android.os.Parcel obtain = android.os.Parcel.obtain();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtain, "obtain(...)");
        obtain.setDataPosition(0);
        context.writeToParcel(obtain, 0);
        java.lang.String encodeToString = android.util.Base64.encodeToString(obtain.marshall(), 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encodeToString, "encodeToString(...)");
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineScanManager", "insertOfflineScanMessage");
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            f9Var.u1("notifymessage");
            f9Var.j1(0);
            f9Var.r1(3);
            f9Var.m124850x7650bebc(721420337);
            f9Var.e1(c01.w9.p());
            f9Var.d1(encodeToString);
            c01.w9.x(f9Var);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5172x3d23981 c5172x3d23981 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5172x3d23981();
            c5172x3d23981.f135521g.f87734a = f9Var;
            c5172x3d23981.e();
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_OFFLINE_SCAN_LOCAL_STORAGE_STRING_SYNC;
        java.lang.Object m17 = c17.m(u3Var, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str = (java.lang.String) m17;
        if (str.length() > 0) {
            encodeToString = str + ',' + encodeToString;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineScanManager", "handleNetworkUnconnected toSave string length: %d", java.lang.Integer.valueOf(encodeToString.length()));
        gm0.j1.u().c().x(u3Var, encodeToString);
    }
}
