package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* renamed from: com.tencent.mm.plugin.record.ui.RecordVoiceBaseView */
/* loaded from: classes12.dex */
public class C16974xc8e7af77 extends android.widget.TextView implements bt3.z2, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f236865d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.animation.AlphaAnimation f236866e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.drawable.AnimationDrawable f236867f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f236868g;

    /* renamed from: h, reason: collision with root package name */
    public bt3.a3 f236869h;

    /* renamed from: i, reason: collision with root package name */
    public int f236870i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f236871m;

    /* renamed from: n, reason: collision with root package name */
    public int f236872n;

    public C16974xc8e7af77(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f236865d = false;
        this.f236870i = -1;
        this.f236871m = "";
        this.f236868g = context;
        b();
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.C16974xc8e7af77 c16974xc8e7af77) {
        if (!c16974xc8e7af77.f236869h.b(c16974xc8e7af77.f236871m, c16974xc8e7af77.f236872n)) {
            dp.a.m125853x26a183b(c16974xc8e7af77.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f572753ce1, 1).show();
        } else {
            if (c16974xc8e7af77.f236865d) {
                return;
            }
            c16974xc8e7af77.f236865d = true;
            c16974xc8e7af77.setCompoundDrawablesWithIntrinsicBounds(c16974xc8e7af77.f236867f, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
            c16974xc8e7af77.f236867f.stop();
            c16974xc8e7af77.f236867f.start();
        }
    }

    public final void b() {
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.1f, 1.0f);
        this.f236866e = alphaAnimation;
        alphaAnimation.setDuration(1000L);
        this.f236866e.setRepeatCount(-1);
        this.f236866e.setRepeatMode(2);
        this.f236867f = new ig5.a();
        android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f78787x4ae29485);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f236867f.addFrame(drawable, 300);
        android.graphics.drawable.Drawable drawable2 = getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f78788x4ae29486);
        drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
        this.f236867f.addFrame(drawable2, 300);
        android.graphics.drawable.Drawable drawable3 = getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f78789x4ae29487);
        drawable3.setBounds(0, 0, drawable3.getIntrinsicWidth(), drawable3.getIntrinsicHeight());
        this.f236867f.addFrame(drawable3, 300);
        this.f236867f.setOneShot(false);
        this.f236867f.setVisible(true, true);
    }

    public void c() {
        android.view.animation.AlphaAnimation alphaAnimation = this.f236866e;
        if (alphaAnimation != null && alphaAnimation.isInitialized()) {
            setAnimation(null);
        }
        this.f236865d = false;
        setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f78786xc14a1285), (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        this.f236867f.stop();
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.h2(this));
    }

    /* renamed from: setVoiceHelper */
    public void m67870x591869be(bt3.a3 a3Var) {
        this.f236869h = a3Var;
        java.util.List list = a3Var.f105737o;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (this == ((bt3.z2) it.next())) {
                return;
            }
        }
        ((java.util.LinkedList) list).add(this);
    }

    public C16974xc8e7af77(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f236865d = false;
        this.f236870i = -1;
        this.f236871m = "";
        this.f236868g = context;
        b();
    }
}
