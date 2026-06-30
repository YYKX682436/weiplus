package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes3.dex */
public class u7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f154370d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f154371e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda f154372f;

    public u7(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda activityC11355x7bcfecda, android.widget.TextView textView, android.widget.TextView textView2) {
        this.f154372f = activityC11355x7bcfecda;
        this.f154370d = textView;
        this.f154371e = textView2;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.TextView textView = this.f154370d;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.topMargin = this.f154371e.getHeight() + i65.a.b(this.f154372f.mo55332x76847179(), 10);
        textView.setLayoutParams(layoutParams);
    }
}
