package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class lc extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.mc f85483d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f85484e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc(com.tencent.mm.plugin.appbrand.mc mcVar, com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
        super(0);
        this.f85483d = mcVar;
        this.f85484e = n7Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.mc mcVar = this.f85483d;
        if (!mcVar.f85744g) {
            mcVar.f85744g = true;
            com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f85484e;
            al1.n P3 = n7Var.P3();
            kotlin.jvm.internal.o.d(P3);
            int foregroundColor = P3.getForegroundColor();
            int color = n7Var.getF147807d().getResources().getColor(com.tencent.mm.R.color.f478532ac);
            al1.n P32 = n7Var.P3();
            kotlin.jvm.internal.o.d(P32);
            android.animation.ObjectAnimator ofInt = android.animation.ObjectAnimator.ofInt(P32.getSecurityTipsTextView(), "textColor", foregroundColor, color);
            ofInt.setDuration(100L);
            ofInt.setEvaluator(new android.animation.ArgbEvaluator());
            ofInt.addListener(new com.tencent.mm.plugin.appbrand.kc(ofInt, this.f85484e, color, foregroundColor, this.f85483d));
            java.lang.Object systemService = n7Var.getF147807d().getSystemService("vibrator");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
            ((android.os.Vibrator) systemService).vibrate(20L);
            ofInt.start();
        }
        return jz5.f0.f302826a;
    }
}
