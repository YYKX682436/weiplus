package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* renamed from: com.tencent.mm.plugin.fav.ui.FavChatVoiceView */
/* loaded from: classes12.dex */
public class C13562xb95b8344 extends android.widget.TextView implements z30.a0, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f181832d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.animation.AlphaAnimation f181833e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.drawable.AnimationDrawable f181834f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f181835g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f181836h;

    /* renamed from: i, reason: collision with root package name */
    public int f181837i;

    /* renamed from: m, reason: collision with root package name */
    public o72.q3 f181838m;

    public C13562xb95b8344(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f181832d = false;
        this.f181836h = "";
        this.f181835g = context;
        c();
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.C13562xb95b8344 c13562xb95b8344) {
        if (!c13562xb95b8344.f181838m.e(c13562xb95b8344.f181836h, c13562xb95b8344.f181837i)) {
            dp.a.m125853x26a183b(c13562xb95b8344.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f572753ce1, 1).show();
        } else {
            if (c13562xb95b8344.f181832d) {
                return;
            }
            c13562xb95b8344.f181832d = true;
            c13562xb95b8344.setCompoundDrawablesWithIntrinsicBounds(c13562xb95b8344.f181834f, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
            c13562xb95b8344.f181834f.stop();
            c13562xb95b8344.f181834f.start();
        }
    }

    @Override // z30.a0
    public void a(java.lang.String str, int i17) {
        if (this.f181836h.equals(str)) {
            return;
        }
        d();
    }

    public final void c() {
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.1f, 1.0f);
        this.f181833e = alphaAnimation;
        alphaAnimation.setDuration(1000L);
        this.f181833e.setRepeatCount(-1);
        this.f181833e.setRepeatMode(2);
        this.f181834f = new ig5.a();
        android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f78787x4ae29485);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f181834f.addFrame(drawable, 300);
        android.graphics.drawable.Drawable drawable2 = getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f78788x4ae29486);
        drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
        this.f181834f.addFrame(drawable2, 300);
        android.graphics.drawable.Drawable drawable3 = getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f78789x4ae29487);
        drawable3.setBounds(0, 0, drawable3.getIntrinsicWidth(), drawable3.getIntrinsicHeight());
        this.f181834f.addFrame(drawable3, 300);
        this.f181834f.setOneShot(false);
        this.f181834f.setVisible(true, true);
    }

    public void d() {
        android.view.animation.AlphaAnimation alphaAnimation = this.f181833e;
        if (alphaAnimation != null && alphaAnimation.isInitialized()) {
            setAnimation(null);
        }
        this.f181832d = false;
        setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f78786xc14a1285), (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        this.f181834f.stop();
        this.f181838m.f();
    }

    @Override // z30.a0
    /* renamed from: onFinish */
    public void mo55316x42fe6352() {
        d();
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.r0(this));
    }

    @Override // z30.a0
    /* renamed from: onPause */
    public void mo55317xb01dfb57() {
        d();
    }

    /* renamed from: setVoiceHelper */
    public void m55318x591869be(o72.q3 q3Var) {
        this.f181838m = q3Var;
        java.util.List list = q3Var.f424988o;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (this == ((z30.a0) it.next())) {
                return;
            }
        }
        ((java.util.LinkedList) list).add(this);
    }

    public C13562xb95b8344(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f181832d = false;
        this.f181836h = "";
        this.f181835g = context;
        c();
    }
}
