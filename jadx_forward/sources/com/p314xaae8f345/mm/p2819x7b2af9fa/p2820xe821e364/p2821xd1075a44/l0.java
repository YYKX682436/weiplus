package com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44;

/* loaded from: classes15.dex */
public class l0 extends com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.f0 {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.m0 f296100p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.m0 m0Var, android.content.Context context) {
        super(context);
        this.f296100p = m0Var;
    }

    @Override // com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.f0, com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.t1
    public void b(android.view.View view, com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.u1 u1Var, com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.r1 r1Var) {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.m0 m0Var = this.f296100p;
        int[] a17 = m0Var.a(m0Var.f296024a.m83599xfd37656d(), view);
        int i17 = a17[0];
        int i18 = a17[1];
        int ceil = (int) java.lang.Math.ceil(f(java.lang.Math.max(java.lang.Math.abs(i17), java.lang.Math.abs(i18))) / 0.3356d);
        if (ceil > 0) {
            android.view.animation.DecelerateInterpolator decelerateInterpolator = this.f296044i;
            r1Var.f296157a = i17;
            r1Var.f296158b = i18;
            r1Var.f296159c = ceil;
            r1Var.f296161e = decelerateInterpolator;
            r1Var.f296162f = true;
        }
    }

    @Override // com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.f0
    public float e(android.util.DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.f0
    public int f(int i17) {
        return java.lang.Math.min(100, super.f(i17));
    }
}
