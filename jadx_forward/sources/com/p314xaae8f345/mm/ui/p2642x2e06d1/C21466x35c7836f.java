package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.AnimImageView */
/* loaded from: classes12.dex */
public class C21466x35c7836f extends android.widget.TextView {

    /* renamed from: d, reason: collision with root package name */
    public boolean f278757d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f278758e;

    /* renamed from: f, reason: collision with root package name */
    public int f278759f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.animation.AlphaAnimation f278760g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.drawable.AnimationDrawable f278761h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.drawable.AnimationDrawable f278762i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.drawable.AnimationDrawable f278763m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f278764n;

    public C21466x35c7836f(android.content.Context context) {
        super(context);
        this.f278757d = false;
        this.f278758e = false;
        this.f278759f = 1;
        this.f278764n = false;
    }

    public final void a() {
        if (this.f278764n) {
            return;
        }
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.1f, 1.0f);
        this.f278760g = alphaAnimation;
        alphaAnimation.setDuration(1000L);
        this.f278760g.setRepeatCount(-1);
        this.f278760g.setRepeatMode(2);
        this.f278761h = new ig5.a();
        android.graphics.drawable.Drawable d17 = com.p314xaae8f345.mm.ui.zk.d(getContext(), com.p314xaae8f345.mm.R.C30857x2dd9f1.f559672bn);
        d17.setBounds(0, 0, d17.getIntrinsicWidth(), d17.getIntrinsicHeight());
        this.f278761h.addFrame(d17, 300);
        android.graphics.drawable.Drawable d18 = com.p314xaae8f345.mm.ui.zk.d(getContext(), com.p314xaae8f345.mm.R.C30857x2dd9f1.f559673bo);
        d18.setBounds(0, 0, d18.getIntrinsicWidth(), d18.getIntrinsicHeight());
        this.f278761h.addFrame(d18, 300);
        android.graphics.drawable.Drawable d19 = com.p314xaae8f345.mm.ui.zk.d(getContext(), com.p314xaae8f345.mm.R.C30857x2dd9f1.f559674bp);
        d19.setBounds(0, 0, d19.getIntrinsicWidth(), d19.getIntrinsicHeight());
        this.f278761h.addFrame(d19, 300);
        this.f278761h.setOneShot(false);
        this.f278761h.setVisible(true, true);
        this.f278762i = new ig5.a();
        android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f78817xbd1a255);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f278762i.addFrame(drawable, 300);
        android.graphics.drawable.Drawable drawable2 = getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f78818xbd1a256);
        drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
        this.f278762i.addFrame(drawable2, 300);
        android.graphics.drawable.Drawable drawable3 = getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f78819xbd1a257);
        drawable3.setBounds(0, 0, drawable3.getIntrinsicWidth(), drawable3.getIntrinsicHeight());
        this.f278762i.addFrame(drawable3, 300);
        this.f278762i.setOneShot(false);
        this.f278762i.setVisible(true, true);
        this.f278763m = new ig5.a();
        android.graphics.drawable.Drawable e17 = com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f78817xbd1a255, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        e17.setBounds(0, 0, e17.getIntrinsicWidth(), e17.getIntrinsicHeight());
        this.f278763m.addFrame(e17, 300);
        android.graphics.drawable.Drawable e18 = com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f78818xbd1a256, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        e18.setBounds(0, 0, e18.getIntrinsicWidth(), e18.getIntrinsicHeight());
        this.f278763m.addFrame(e18, 300);
        android.graphics.drawable.Drawable e19 = com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f78819xbd1a257, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        e19.setBounds(0, 0, e19.getIntrinsicWidth(), e19.getIntrinsicHeight());
        this.f278763m.addFrame(e19, 300);
        this.f278763m.setOneShot(false);
        this.f278763m.setVisible(true, true);
        this.f278764n = true;
    }

    public void b() {
        a();
        int i17 = this.f278759f;
        if (i17 == 0) {
            if (this.f278758e) {
                setBackgroundDrawable(i65.a.i(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.f562714mh));
            } else {
                setBackgroundDrawable(i65.a.i(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.o_));
            }
            setAnimation(this.f278760g);
            this.f278760g.startNow();
            return;
        }
        if (i17 == 1) {
            if (this.f278757d) {
                return;
            }
            this.f278757d = true;
            if (this.f278758e) {
                setCompoundDrawablesWithIntrinsicBounds(this.f278761h, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
                this.f278761h.stop();
                this.f278761h.start();
                return;
            } else {
                setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, this.f278762i, (android.graphics.drawable.Drawable) null);
                this.f278762i.stop();
                this.f278762i.start();
                return;
            }
        }
        if (i17 != 2) {
            if (i17 != 3) {
                return;
            }
        } else if (this.f278758e) {
            setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560297gk);
        } else {
            setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560298gl);
        }
        if (this.f278757d) {
            return;
        }
        this.f278757d = true;
        if (this.f278758e) {
            setCompoundDrawablesWithIntrinsicBounds(this.f278761h, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
            this.f278761h.stop();
            this.f278761h.start();
        } else {
            setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, this.f278763m, (android.graphics.drawable.Drawable) null);
            this.f278763m.stop();
            this.f278763m.start();
        }
    }

    public void c() {
        a();
        android.view.animation.AlphaAnimation alphaAnimation = this.f278760g;
        if (alphaAnimation != null && alphaAnimation.isInitialized()) {
            setAnimation(null);
        }
        int i17 = this.f278759f;
        if (i17 == 1 || i17 == 2 || i17 == 3) {
            this.f278757d = false;
            setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
            this.f278761h.stop();
            this.f278762i.stop();
            this.f278763m.stop();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int getBaseline() {
        try {
            return super.getBaseline();
        } catch (java.lang.Throwable unused) {
            return -1;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        try {
            super.onMeasure(i17, i18);
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // android.widget.TextView, android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        try {
            return super.onPreDraw();
        } catch (java.lang.Throwable unused) {
            return true;
        }
    }

    /* renamed from: setCustomDuration */
    public void m78865x97bd7127(int i17) {
        android.graphics.drawable.AnimationDrawable animationDrawable = this.f278761h;
        if (animationDrawable != null) {
            ((ig5.a) animationDrawable).a(i17);
        }
        android.graphics.drawable.AnimationDrawable animationDrawable2 = this.f278762i;
        if (animationDrawable2 != null) {
            ((ig5.a) animationDrawable2).a(i17);
        }
    }

    /* renamed from: setFromGroup */
    public void m78866x5f3d5ab3(boolean z17) {
    }

    /* renamed from: setFromVoice */
    public void m78867x600f4566(boolean z17) {
        this.f278758e = z17;
    }

    /* renamed from: setType */
    public void m78868x7650bebc(int i17) {
        this.f278759f = i17;
        if (this.f278758e) {
            if (i17 == 2) {
                setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560297gk);
                return;
            } else if (i17 == 3) {
                setBackgroundDrawable(null);
                return;
            } else {
                setBackgroundDrawable(i65.a.i(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.f562714mh));
                return;
            }
        }
        if (i17 == 2) {
            setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560298gl);
        } else if (i17 == 3) {
            setBackgroundDrawable(null);
        } else {
            setBackgroundDrawable(i65.a.i(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.o_));
        }
    }

    public C21466x35c7836f(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f278757d = false;
        this.f278758e = false;
        this.f278759f = 1;
        this.f278764n = false;
    }

    public C21466x35c7836f(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f278757d = false;
        this.f278758e = false;
        this.f278759f = 1;
        this.f278764n = false;
    }
}
