package yw;

/* loaded from: classes9.dex */
public final class d1 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f547834a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f547835b;

    public d1(java.lang.String str, yz5.l lVar) {
        this.f547834a = str;
        this.f547835b = lVar;
    }

    @Override // c01.o8
    public final void a(java.lang.String retUsername, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(retUsername, "retUsername");
        yw.h1 h1Var = yw.h1.f547865a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterHelper", "flush contact callback, username: %s, success: %b", retUsername, java.lang.Boolean.valueOf(z17));
        java.lang.String str = this.f547834a;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, retUsername);
        yz5.l lVar = this.f547835b;
        if (!b17 || !z17) {
            java.lang.String str2 = this.f547834a;
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            lVar.mo146xb9724478(new com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23516x65d494ce(str2, null, bool, bool, java.lang.Boolean.TRUE, 2, null));
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 != null) {
            java.lang.String str3 = this.f547834a;
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            lVar.mo146xb9724478(new com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23516x65d494ce(str3, c01.a2.e(str), java.lang.Boolean.valueOf(n17.r2()), java.lang.Boolean.valueOf(n17.w2()), java.lang.Boolean.valueOf(c01.e2.P(n17))));
        } else {
            java.lang.String str4 = this.f547834a;
            java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
            lVar.mo146xb9724478(new com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23516x65d494ce(str4, null, bool2, bool2, java.lang.Boolean.TRUE, 2, null));
        }
    }
}
