package com.p314xaae8f345.mm.p2818xd0d82df3;

/* loaded from: classes.dex */
public final class b0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f295889d;

    public b0() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (!gm0.j1.a()) {
            return false;
        }
        int i17 = event.f135586g.f89292a;
        if (i17 != 108 && i17 != 109) {
            return false;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(event.f135586g.f89293b);
        am.r2 r2Var = event.f135586g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XNET.XNetLibResUpdateCacheFileEvent", "xnet lib update coming. resType: %d subtype: %d, file path: %s, file version: %d, isArm64: %b", valueOf, valueOf2, r2Var.f89294c, java.lang.Integer.valueOf(r2Var.f89295d), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274648k));
        am.r2 r2Var2 = event.f135586g;
        java.lang.String str = r2Var2.f89294c;
        java.lang.String str2 = str == null ? "" : str;
        java.lang.String str3 = r2Var2.f89297f;
        java.lang.String str4 = str3 == null ? "" : str3;
        int i18 = r2Var2.f89295d;
        int i19 = r2Var2.f89292a;
        int i27 = r2Var2.f89293b;
        com.p314xaae8f345.mm.p2818xd0d82df3.p pVar = com.p314xaae8f345.mm.p2818xd0d82df3.p.f295903d;
        if (!str2.equals("")) {
            ((ku5.t0) ku5.t0.f394148d).b(new com.p314xaae8f345.mm.p2818xd0d82df3.a0(str2, str4, i18, i19, i27, pVar), "XNetLibResHelper#processXnetSoResourceUpdate");
        }
        f295889d = true;
        return true;
    }
}
