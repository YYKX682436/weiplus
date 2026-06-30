package ht2;

/* loaded from: classes2.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.r6 f366372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ht2.y0 f366373e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f366374f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f366375g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f366376h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(zy2.r6 r6Var, ht2.y0 y0Var, yz5.l lVar, android.view.View view, android.view.View view2) {
        super(2);
        this.f366372d = r6Var;
        this.f366373e = y0Var;
        this.f366374f = lVar;
        this.f366375g = view;
        this.f366376h = view2;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yz5.l lVar;
        android.widget.TextView textView = (android.widget.TextView) obj;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b floatPagView = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(floatPagView, "floatPagView");
        if (textView != null) {
            textView.setAlpha(0.0f);
        }
        zy2.r6 r6Var = this.f366372d;
        r6Var.getClass();
        ht2.y0 y0Var = this.f366373e;
        y0Var.tj(floatPagView, r6Var);
        uw2.h0 h0Var = uw2.h0.f513207a;
        java.lang.CharSequence charSequence = r6Var.f559094l;
        android.animation.Animator m17 = uw2.h0.m(h0Var, floatPagView, charSequence == null || r26.n0.N(charSequence) ? r6Var.f559092j : null, 0.0f, 300L, 4, null);
        m17.addListener(new ht2.g0(floatPagView));
        java.lang.CharSequence charSequence2 = r6Var.f559094l;
        android.animation.Animator l17 = uw2.h0.l(h0Var, floatPagView, false, charSequence2 == null || r26.n0.N(charSequence2) ? 400L : 1200L, 300L, 2, null);
        yz5.l lVar2 = ht2.h0.f366368d;
        java.lang.CharSequence charSequence3 = r6Var.f559094l;
        if (charSequence3 == null || r26.n0.N(charSequence3)) {
            lVar = new ht2.z(floatPagView);
        } else {
            ht2.b0 b0Var = new ht2.b0(textView, floatPagView);
            yz5.l c0Var = new ht2.c0(textView);
            l17.addListener(new ht2.d0(textView));
            lVar = b0Var;
            lVar2 = c0Var;
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.addListener(new ht2.e0(lVar, lVar, lVar2));
        animatorSet.playSequentially(m17, l17);
        animatorSet.addListener(new ht2.f0(y0Var, this.f366375g, this.f366376h));
        this.f366374f.mo146xb9724478(animatorSet);
        return jz5.f0.f384359a;
    }
}
