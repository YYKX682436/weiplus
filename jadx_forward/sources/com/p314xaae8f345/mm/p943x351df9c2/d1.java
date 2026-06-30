package com.p314xaae8f345.mm.p943x351df9c2;

@j95.b
/* loaded from: classes11.dex */
public class d1 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p943x351df9c2.s0 f151968d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p943x351df9c2.z f151969e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p943x351df9c2.r f151970f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p943x351df9c2.o0 f151971g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f151972h = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(gm0.j1.e().a(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p943x351df9c2.c1(this), false);

    public static com.p314xaae8f345.mm.p943x351df9c2.z Ai() {
        gm0.j1.b().c();
        if (Bi().f151969e == null) {
            Bi().f151969e = new com.p314xaae8f345.mm.p943x351df9c2.z();
        }
        return Bi().f151969e;
    }

    public static com.p314xaae8f345.mm.p943x351df9c2.d1 Bi() {
        return (com.p314xaae8f345.mm.p943x351df9c2.d1) i95.n0.c(com.p314xaae8f345.mm.p943x351df9c2.d1.class);
    }

    public static com.p314xaae8f345.mm.p943x351df9c2.o0 Di() {
        gm0.j1.b().c();
        if (Bi().f151971g == null) {
            Bi().f151971g = new com.p314xaae8f345.mm.p943x351df9c2.o0(gm0.j1.u().f354686f);
        }
        return Bi().f151971g;
    }

    public static com.p314xaae8f345.mm.p943x351df9c2.s0 Ni() {
        gm0.j1.b().c();
        if (Bi().f151968d == null) {
            Bi().f151968d = new com.p314xaae8f345.mm.p943x351df9c2.s0(gm0.j1.u().f354686f);
        }
        return Bi().f151968d;
    }

    public static com.p314xaae8f345.mm.p943x351df9c2.r wi() {
        gm0.j1.b().c();
        if (Bi().f151970f == null) {
            Bi().f151970f = new com.p314xaae8f345.mm.p943x351df9c2.r();
        }
        return Bi().f151970f;
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        if (gm0.j1.b().f354777g.f354790a) {
            gm0.j1.u().c().w(90113, java.lang.Boolean.TRUE);
        }
        this.f151972h.c(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
        q25.b.b(new hn1.c(), "//avatar");
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
        this.f151972h.d();
        if (Bi().f151969e != null && com.p314xaae8f345.mm.p943x351df9c2.z.f152110d == null) {
            com.p314xaae8f345.mm.p943x351df9c2.z.f152110d = new com.p314xaae8f345.mm.p943x351df9c2.a(100);
        }
        com.p314xaae8f345.mm.p943x351df9c2.r rVar = Bi().f151970f;
        if (rVar != null) {
            gm0.j1.d().q(123, rVar);
        }
        com.p314xaae8f345.mm.p943x351df9c2.s0 s0Var = Bi().f151968d;
        if (s0Var != null) {
            ((lt0.f) s0Var.f152073e).mo143584x5a5b64d();
        }
        q25.b.c("//avatar");
    }
}
