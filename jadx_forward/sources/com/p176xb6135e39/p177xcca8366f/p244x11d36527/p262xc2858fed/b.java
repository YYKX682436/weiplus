package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed;

/* loaded from: classes15.dex */
public class b extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f126128d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f126129e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f126130f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f126131g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.c f126132h;

    public b(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.c cVar, int i17, android.widget.TextView textView, int i18, android.widget.TextView textView2) {
        this.f126132h = cVar;
        this.f126128d = i17;
        this.f126129e = textView;
        this.f126130f = i18;
        this.f126131g = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        android.widget.TextView textView;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.c cVar = this.f126132h;
        cVar.f126141i = this.f126128d;
        cVar.f126139g = null;
        android.widget.TextView textView2 = this.f126129e;
        if (textView2 != null) {
            textView2.setVisibility(4);
            if (this.f126130f != 1 || (textView = cVar.f126145m) == null) {
                return;
            }
            textView.setText((java.lang.CharSequence) null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        android.widget.TextView textView = this.f126131g;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }
}
