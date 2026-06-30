package qo1;

/* loaded from: classes5.dex */
public final /* synthetic */ class b1 extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.a {
    public b1(java.lang.Object obj) {
        super(0, obj, qo1.c1.class, "buildRestoreTaskInfo", "buildRestoreTaskInfo()I", 0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        qo1.c1 c1Var = (qo1.c1) this.f72685xcfcbe9ef;
        java.lang.Object obj = c1Var.f447025r;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar = obj instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g ? (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g) obj : null;
        if (gVar == null) {
            i17 = 256;
        } else {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.h1 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.b(gVar.f297362d);
            if (b17 == null) {
                i17 = 257;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
                b17.b(0L, java.lang.System.currentTimeMillis(), new qo1.y0(f0Var, c1Var, new qo1.a1(f0Var, c1Var, b17)));
                i17 = 0;
            }
        }
        return java.lang.Integer.valueOf(i17);
    }
}
