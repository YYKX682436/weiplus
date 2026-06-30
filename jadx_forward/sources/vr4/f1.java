package vr4;

@j95.b
/* loaded from: classes9.dex */
public class f1 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public int f521253d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f521254e = 0;

    static {
        com.p314xaae8f345.mm.p2802xd031a825.a.h("ForgotPwdProcess", fs4.h.class);
        com.p314xaae8f345.mm.p2802xd031a825.a.h("BindCardProcess", qs4.j.class);
    }

    public f1() {
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(dt4.b.f324761a);
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (m17.a() ? m17.f294799a.F(m17.f294800b) : false) {
            return;
        }
        com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, m17);
        if (m18.a()) {
            m18.f294799a.r(m18.f294800b);
        }
    }

    public static vr4.f1 wi() {
        return (vr4.f1) i95.n0.c(vr4.f1.class);
    }

    public at4.x1 Ai() {
        return ((pg0.a3) i95.n0.c(pg0.a3.class)).fj();
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        gm0.j1.i();
        this.f521253d = ((java.lang.Integer) gm0.j1.u().c().l(339975, 0)).intValue();
        gm0.j1.i();
        this.f521254e = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
        gm0.j1.i();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_AGREE_PAY_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
    }
}
