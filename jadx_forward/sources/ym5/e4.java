package ym5;

/* loaded from: classes2.dex */
public final class e4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f544797d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f544798e;

    public e4(com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00, boolean z17) {
        this.f544797d = c22801x87cbdc00;
        this.f544798e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.e0();
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f544797d;
        e0Var.f391648d = c22801x87cbdc00.getTranslationY();
        p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.e0();
        e0Var2.f391648d = c22801x87cbdc00.getTranslationY();
        c22801x87cbdc00.q(this.f544798e, new ym5.c4(e0Var, c22801x87cbdc00, e0Var2), new ym5.d4(c22801x87cbdc00, e0Var, e0Var2));
    }
}
