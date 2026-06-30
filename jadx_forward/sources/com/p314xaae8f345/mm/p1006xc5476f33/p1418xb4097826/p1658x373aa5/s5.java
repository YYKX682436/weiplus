package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class s5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f214550d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f214551e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f214552f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 f214553g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f214554h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15269x718714b0 f214555i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f214556m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f214557n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(yz5.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a34, android.widget.FrameLayout frameLayout, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15269x718714b0 c15269x718714b0, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f214552f = lVar;
        this.f214553g = c15270x6d877a34;
        this.f214554h = frameLayout;
        this.f214555i = c15269x718714b0;
        this.f214556m = charSequence;
        this.f214557n = charSequence2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s5 s5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s5(this.f214552f, this.f214553g, this.f214554h, this.f214555i, this.f214556m, this.f214557n, interfaceC29045xdcb5ca57);
        s5Var.f214551e = obj;
        return s5Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.f1 b17;
        java.lang.Object k17;
        java.lang.Object k18;
        android.view.View view;
        android.view.View view2;
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f214550d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f214551e;
            p3325xe03a0797.p3326xc267989b.f1 b18 = p3325xe03a0797.p3326xc267989b.l.b(y0Var, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.q5(this.f214553g, this.f214554h, this.f214555i, this.f214556m, null), 3, null);
            b17 = p3325xe03a0797.p3326xc267989b.l.b(y0Var, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p5(this.f214553g, this.f214554h, this.f214555i, this.f214557n, null), 3, null);
            this.f214551e = b17;
            this.f214550d = 1;
            k17 = ((p3325xe03a0797.p3326xc267989b.g1) b18).k(this);
            if (k17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                android.view.View view3 = (android.view.View) this.f214551e;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                k18 = obj;
                view = view3;
                view2 = (android.view.View) k18;
                f0Var = jz5.f0.f384359a;
                if (view != null || view2 == null) {
                    java.util.Objects.toString(view);
                    java.util.Objects.toString(view2);
                    return f0Var;
                }
                android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.setInterpolator(new android.view.animation.PathInterpolator(0.65f, 0.0f, 0.35f, 1.0f));
                ofFloat.setDuration(200L);
                ofFloat.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.m5(view));
                android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.setInterpolator(new android.view.animation.PathInterpolator(0.65f, 0.0f, 0.35f, 1.0f));
                ofFloat2.setDuration(200L);
                ofFloat2.setStartDelay(100L);
                ofFloat2.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.n5(view2));
                android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15269x718714b0 c15269x718714b0 = this.f214555i;
                java.lang.CharSequence charSequence = this.f214557n;
                android.widget.FrameLayout frameLayout = this.f214554h;
                animatorSet.playTogether(ofFloat, ofFloat2);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.o5 o5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.o5(c15269x718714b0, charSequence, frameLayout, view2, view);
                animatorSet.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.r5(o5Var, o5Var, c15269x718714b0));
                this.f214552f.mo146xb9724478(animatorSet);
                return f0Var;
            }
            b17 = (p3325xe03a0797.p3326xc267989b.f1) this.f214551e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            k17 = obj;
        }
        android.view.View view4 = (android.view.View) k17;
        this.f214551e = view4;
        this.f214550d = 2;
        k18 = b17.k(this);
        if (k18 == aVar) {
            return aVar;
        }
        view = view4;
        view2 = (android.view.View) k18;
        f0Var = jz5.f0.f384359a;
        if (view != null) {
        }
        java.util.Objects.toString(view);
        java.util.Objects.toString(view2);
        return f0Var;
    }
}
