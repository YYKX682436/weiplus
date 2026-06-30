package com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.p2455xc35232d7;

/* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteEditorVoiceBaseView */
/* loaded from: classes12.dex */
public class C19531x32539689 extends android.widget.TextView implements uz4.c, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f269818d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.animation.AlphaAnimation f269819e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.drawable.AnimationDrawable f269820f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f269821g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f269822h;

    /* renamed from: i, reason: collision with root package name */
    public int f269823i;

    /* renamed from: m, reason: collision with root package name */
    public uz4.d f269824m;

    public C19531x32539689(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f269818d = false;
        this.f269822h = "";
        this.f269821g = context;
        f();
    }

    public static void e(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.p2455xc35232d7.C19531x32539689 c19531x32539689) {
        if (!c19531x32539689.f269824m.g(c19531x32539689.f269822h, c19531x32539689.f269823i)) {
            dp.a.m125853x26a183b(c19531x32539689.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f572753ce1, 1).show();
        } else {
            if (c19531x32539689.f269818d) {
                return;
            }
            c19531x32539689.f269818d = true;
            c19531x32539689.setCompoundDrawablesWithIntrinsicBounds(c19531x32539689.f269820f, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
            c19531x32539689.f269820f.stop();
            c19531x32539689.f269820f.start();
        }
    }

    @Override // uz4.c
    public void a() {
    }

    @Override // uz4.c
    public void b(java.lang.String str) {
    }

    @Override // uz4.c
    public void c() {
        g();
    }

    @Override // uz4.c
    public void d(java.lang.String str) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        if (str.equals(this.f269822h)) {
            return;
        }
        g();
    }

    public final void f() {
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.1f, 1.0f);
        this.f269819e = alphaAnimation;
        alphaAnimation.setDuration(1000L);
        this.f269819e.setRepeatCount(-1);
        this.f269819e.setRepeatMode(2);
        this.f269820f = new ig5.a();
        android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f78787x4ae29485);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f269820f.addFrame(drawable, 300);
        android.graphics.drawable.Drawable drawable2 = getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f78788x4ae29486);
        drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
        this.f269820f.addFrame(drawable2, 300);
        android.graphics.drawable.Drawable drawable3 = getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f78789x4ae29487);
        drawable3.setBounds(0, 0, drawable3.getIntrinsicWidth(), drawable3.getIntrinsicHeight());
        this.f269820f.addFrame(drawable3, 300);
        this.f269820f.setOneShot(false);
        this.f269820f.setVisible(true, true);
    }

    public void g() {
        android.view.animation.AlphaAnimation alphaAnimation = this.f269819e;
        if (alphaAnimation != null && alphaAnimation.isInitialized()) {
            setAnimation(null);
        }
        this.f269818d = false;
        setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f78786xc14a1285), (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        this.f269820f.stop();
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(new uz4.a(this));
    }

    /* renamed from: setVoiceHelper */
    public void m74992x591869be(uz4.d dVar) {
        this.f269824m = dVar;
        dVar.b(this);
    }

    public C19531x32539689(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f269818d = false;
        this.f269822h = "";
        this.f269821g = context;
        f();
    }
}
