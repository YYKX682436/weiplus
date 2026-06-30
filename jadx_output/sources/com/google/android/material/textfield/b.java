package com.google.android.material.textfield;

/* loaded from: classes15.dex */
public class b extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f44595d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f44596e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f44597f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f44598g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.textfield.c f44599h;

    public b(com.google.android.material.textfield.c cVar, int i17, android.widget.TextView textView, int i18, android.widget.TextView textView2) {
        this.f44599h = cVar;
        this.f44595d = i17;
        this.f44596e = textView;
        this.f44597f = i18;
        this.f44598g = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        android.widget.TextView textView;
        com.google.android.material.textfield.c cVar = this.f44599h;
        cVar.f44608i = this.f44595d;
        cVar.f44606g = null;
        android.widget.TextView textView2 = this.f44596e;
        if (textView2 != null) {
            textView2.setVisibility(4);
            if (this.f44597f != 1 || (textView = cVar.f44612m) == null) {
                return;
            }
            textView.setText((java.lang.CharSequence) null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        android.widget.TextView textView = this.f44598g;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }
}
