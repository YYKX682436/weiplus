package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes4.dex */
public final class z8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a9 f281895d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281896e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a9 a9Var, java.lang.String str) {
        super(0);
        this.f281895d = a9Var;
        this.f281896e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String talkerUsername = this.f281896e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(talkerUsername, "$talkerUsername");
        java.lang.String str = this.f281895d.f280146e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "clearVoipReadMsg");
        android.database.Cursor cursor = null;
        try {
            try {
                cursor = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().T7(talkerUsername, 50, 10);
                while (cursor.moveToNext()) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                    f9Var.mo9015xbf5d97fd(cursor);
                    f9Var.r1(6);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(f9Var.m124847x74d37ac6(), f9Var, true);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "do update msg " + f9Var.m124847x74d37ac6() + " status");
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e17, "clearVoipReadMsg error", new java.lang.Object[0]);
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(cursor);
            return jz5.f0.f384359a;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(cursor);
            throw th6;
        }
    }
}
