package qr3;

/* loaded from: classes9.dex */
public class x implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f447654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f447655e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1961xba7262a1.ActivityC16884xbfaa2323 f447656f;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1961xba7262a1.ActivityC16884xbfaa2323 activityC16884xbfaa2323, boolean z17, java.lang.String str) {
        this.f447656f = activityC16884xbfaa2323;
        this.f447654d = z17;
        this.f447655e = str;
    }

    @Override // c01.da
    public boolean a() {
        return this.f447656f.f235723w;
    }

    @Override // c01.da
    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1961xba7262a1.ActivityC16884xbfaa2323 activityC16884xbfaa2323 = this.f447656f;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC16884xbfaa2323.f235722v;
        if (u3Var != null) {
            u3Var.dismiss();
            activityC16884xbfaa2323.f235722v = null;
        }
        if (this.f447654d) {
            com.p314xaae8f345.mm.p2621x8fb0427b.w Ai = ((r01.s1) ((r01.x2) i95.n0.c(r01.x2.class))).Ai();
            Ai.getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
            com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.l4(this.f447655e);
            l4Var.T1("officialaccounts");
            Ai.a(l4Var, Di);
        }
    }
}
