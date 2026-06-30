package com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1343xd1075a44.p1344xc35232d7;

/* renamed from: com.tencent.mm.plugin.component.editor.widget.voiceview.EditorVoiceBaseView */
/* loaded from: classes12.dex */
public class C13161x2b1227db extends android.widget.TextView implements rx1.c, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f178177d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.animation.AlphaAnimation f178178e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.drawable.AnimationDrawable f178179f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f178180g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f178181h;

    public C13161x2b1227db(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f178177d = false;
        this.f178181h = "";
        this.f178180g = context;
        f();
    }

    public static void e(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1343xd1075a44.p1344xc35232d7.C13161x2b1227db c13161x2b1227db) {
        c13161x2b1227db.getClass();
        if (!rx1.d.b().d(c13161x2b1227db.f178181h, 0)) {
            dp.a.m125853x26a183b(c13161x2b1227db.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f572753ce1, 1).show();
        } else {
            if (c13161x2b1227db.f178177d) {
                return;
            }
            c13161x2b1227db.f178177d = true;
            c13161x2b1227db.setCompoundDrawablesWithIntrinsicBounds(c13161x2b1227db.f178179f, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
            c13161x2b1227db.f178179f.stop();
            c13161x2b1227db.f178179f.start();
        }
    }

    @Override // rx1.c
    public void a() {
    }

    @Override // rx1.c
    public void b(java.lang.String str) {
    }

    @Override // rx1.c
    public void c() {
        g();
    }

    @Override // rx1.c
    public void d(java.lang.String str) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        if (str.equals(this.f178181h)) {
            return;
        }
        g();
    }

    public final void f() {
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.1f, 1.0f);
        this.f178178e = alphaAnimation;
        alphaAnimation.setDuration(1000L);
        this.f178178e.setRepeatCount(-1);
        this.f178178e.setRepeatMode(2);
        this.f178179f = new ig5.a();
        android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f78787x4ae29485);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f178179f.addFrame(drawable, 300);
        android.graphics.drawable.Drawable drawable2 = getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f78788x4ae29486);
        drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
        this.f178179f.addFrame(drawable2, 300);
        android.graphics.drawable.Drawable drawable3 = getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f78789x4ae29487);
        drawable3.setBounds(0, 0, drawable3.getIntrinsicWidth(), drawable3.getIntrinsicHeight());
        this.f178179f.addFrame(drawable3, 300);
        this.f178179f.setOneShot(false);
        this.f178179f.setVisible(true, true);
    }

    public void g() {
        android.view.animation.AlphaAnimation alphaAnimation = this.f178178e;
        if (alphaAnimation != null && alphaAnimation.isInitialized()) {
            setAnimation(null);
        }
        this.f178177d = false;
        setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f78786xc14a1285), (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        this.f178179f.stop();
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(new rx1.a(this));
    }

    public C13161x2b1227db(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f178177d = false;
        this.f178181h = "";
        this.f178180g = context;
        f();
    }
}
