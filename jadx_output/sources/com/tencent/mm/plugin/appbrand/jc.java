package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class jc extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.ObjectAnimator f78477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f78478e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f78479f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f78480g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.mc f78481h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc(android.animation.ObjectAnimator objectAnimator, com.tencent.mm.plugin.appbrand.page.n7 n7Var, int i17, int i18, com.tencent.mm.plugin.appbrand.mc mcVar) {
        super(0);
        this.f78477d = objectAnimator;
        this.f78478e = n7Var;
        this.f78479f = i17;
        this.f78480g = i18;
        this.f78481h = mcVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f78477d.cancel();
        al1.n P3 = this.f78478e.P3();
        kotlin.jvm.internal.o.d(P3);
        android.animation.ObjectAnimator ofInt = android.animation.ObjectAnimator.ofInt(P3.getSecurityTipsTextView(), "textColor", this.f78479f, this.f78480g);
        ofInt.setEvaluator(new android.animation.ArgbEvaluator());
        ofInt.setDuration(300L);
        ofInt.addListener(new com.tencent.mm.plugin.appbrand.ic(ofInt, this.f78481h));
        ofInt.start();
        return jz5.f0.f302826a;
    }
}
