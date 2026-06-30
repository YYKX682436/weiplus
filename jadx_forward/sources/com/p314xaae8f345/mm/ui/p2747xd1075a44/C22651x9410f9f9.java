package com.p314xaae8f345.mm.ui.p2747xd1075a44;

/* renamed from: com.tencent.mm.ui.widget.ThreeDotsLoadingView */
/* loaded from: classes7.dex */
public class C22651x9410f9f9 extends android.widget.FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    public static int f292979o = -16777216;

    /* renamed from: d, reason: collision with root package name */
    public int f292980d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f292981e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f292982f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f292983g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f292984h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f292985i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f292986m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Runnable f292987n;

    public C22651x9410f9f9(android.content.Context context) {
        super(context);
        this.f292980d = f292979o;
        this.f292981e = false;
        this.f292982f = false;
        this.f292987n = new al5.q3(this);
        a(context, null);
    }

    public final void a(android.content.Context context, android.util.AttributeSet attributeSet) {
        this.f292983g = (android.view.ViewGroup) android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bpi, (android.view.ViewGroup) this, true);
        int color = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5);
        f292979o = color;
        this.f292980d = color;
        this.f292984h = (android.widget.ImageView) this.f292983g.findViewById(com.p314xaae8f345.mm.R.id.ily);
        this.f292985i = (android.widget.ImageView) this.f292983g.findViewById(com.p314xaae8f345.mm.R.id.ilz);
        this.f292986m = (android.widget.ImageView) this.f292983g.findViewById(com.p314xaae8f345.mm.R.id.f567212im0);
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.l0.f173287c);
            this.f292980d = obtainStyledAttributes.getColor(0, f292979o);
            obtainStyledAttributes.recycle();
        }
        d();
    }

    public final android.graphics.drawable.AnimationDrawable b(int i17, float[] fArr) {
        android.graphics.drawable.AnimationDrawable animationDrawable = new android.graphics.drawable.AnimationDrawable();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ThreeDotsLoadingView", "AnimationDrawable hash:" + animationDrawable.hashCode());
        animationDrawable.setOneShot(false);
        for (float f17 : fArr) {
            animationDrawable.addFrame(c(i17, f17), 300);
        }
        return animationDrawable;
    }

    public final android.graphics.drawable.Drawable c(int i17, float f17) {
        android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.OvalShape());
        shapeDrawable.setIntrinsicHeight(32);
        shapeDrawable.setIntrinsicWidth(32);
        shapeDrawable.getPaint().setColor(i17);
        shapeDrawable.getPaint().setAlpha((int) (f17 * 255.0f));
        return shapeDrawable;
    }

    public final void d() {
        this.f292984h.setImageDrawable(c(this.f292980d, 0.5f));
        this.f292985i.setImageDrawable(c(this.f292980d, 0.4f));
        this.f292986m.setImageDrawable(c(this.f292980d, 0.3f));
    }

    public void e() {
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (!n3.x0.b(this)) {
            this.f292982f = true;
        } else {
            if (this.f292981e) {
                return;
            }
            this.f292981e = true;
            d();
            postDelayed(this.f292987n, 300L);
        }
    }

    public void f() {
        this.f292982f = false;
        if (this.f292981e) {
            this.f292981e = false;
            removeCallbacks(this.f292987n);
            if (this.f292984h.getDrawable() instanceof android.graphics.drawable.AnimationDrawable) {
                ((android.graphics.drawable.AnimationDrawable) this.f292984h.getDrawable()).stop();
                ((android.graphics.drawable.AnimationDrawable) this.f292985i.getDrawable()).stop();
                ((android.graphics.drawable.AnimationDrawable) this.f292986m.getDrawable()).stop();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f292982f) {
            this.f292982f = false;
            e();
        }
    }

    @Override // android.view.View
    public void setAlpha(float f17) {
        this.f292984h.setAlpha(f17);
        this.f292985i.setAlpha(f17);
        this.f292986m.setAlpha(f17);
        if (getBackground() != null) {
            getBackground().setAlpha(java.lang.Math.round(f17 * 255.0f));
        }
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        if (8 == i17 || 4 == i17) {
            f();
        }
        super.setVisibility(i17);
    }

    public C22651x9410f9f9(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f292980d = f292979o;
        this.f292981e = false;
        this.f292982f = false;
        this.f292987n = new al5.q3(this);
        a(context, attributeSet);
    }

    public C22651x9410f9f9(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f292980d = f292979o;
        this.f292981e = false;
        this.f292982f = false;
        this.f292987n = new al5.q3(this);
        a(context, attributeSet);
    }
}
