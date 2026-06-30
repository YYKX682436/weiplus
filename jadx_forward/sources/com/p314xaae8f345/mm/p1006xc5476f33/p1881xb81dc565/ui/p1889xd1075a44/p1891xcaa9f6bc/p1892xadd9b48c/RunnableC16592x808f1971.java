package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.p1892xadd9b48c;

/* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.projector.bubble.BubbleView */
/* loaded from: classes4.dex */
public class RunnableC16592x808f1971 extends android.widget.RelativeLayout implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f231915d;

    /* renamed from: e, reason: collision with root package name */
    public android.content.Context f231916e;

    /* renamed from: f, reason: collision with root package name */
    public vj3.a f231917f;

    /* renamed from: g, reason: collision with root package name */
    public float f231918g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.RelativeLayout f231919h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f231920i;

    /* renamed from: m, reason: collision with root package name */
    public int f231921m;

    /* renamed from: n, reason: collision with root package name */
    public float f231922n;

    /* renamed from: o, reason: collision with root package name */
    public float f231923o;

    /* renamed from: p, reason: collision with root package name */
    public float f231924p;

    /* renamed from: q, reason: collision with root package name */
    public int f231925q;

    public RunnableC16592x808f1971(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f231922n = 0.0f;
        this.f231923o = 0.0f;
        this.f231924p = 0.0f;
        this.f231925q = -1;
        a(context, attributeSet, 0);
    }

    /* renamed from: setCurDirection */
    private void m67105xa43abaa1(int i17) {
        if (i17 == 1) {
            this.f231917f = vj3.a.LEFT;
            return;
        }
        if (i17 == 2) {
            this.f231917f = vj3.a.TOP;
        } else if (i17 == 3) {
            this.f231917f = vj3.a.RIGHT;
        } else {
            if (i17 != 4) {
                return;
            }
            this.f231917f = vj3.a.BOTTOM;
        }
    }

    /* renamed from: setRelativePosition */
    private void m67106xb3246897(float f17) {
        if (f17 < 0.2f) {
            this.f231918g = 0.2f;
        } else if (f17 > 0.8f) {
            this.f231918g = 0.8f;
        } else {
            this.f231918g = f17;
        }
    }

    public final void a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        int i18;
        this.f231916e = context;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xi3.a.f536265a);
        float dimension = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f231921m = obtainStyledAttributes.getColor(4, 0);
        this.f231922n = obtainStyledAttributes.getDimension(2, 0.0f);
        this.f231923o = obtainStyledAttributes.getDimension(0, 0.0f);
        int color = obtainStyledAttributes.getColor(7, 0);
        float dimension2 = obtainStyledAttributes.getDimension(8, 0.0f);
        java.lang.String string = obtainStyledAttributes.getString(6);
        this.f231925q = obtainStyledAttributes.getResourceId(1, -1);
        m67105xa43abaa1(obtainStyledAttributes.getInt(3, 3));
        m67106xb3246897(obtainStyledAttributes.getFraction(12, 1, 1, 0.3f));
        m67108xf5cf9e86(color);
        this.f231924p = obtainStyledAttributes.getDimension(10, 0.0f);
        obtainStyledAttributes.recycle();
        int i19 = this.f231921m;
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(this.f231916e);
        this.f231919h = relativeLayout;
        relativeLayout.setId(android.view.View.generateViewId());
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, (int) this.f231924p);
        this.f231919h.setBackground(new vj3.b(i19, dimension));
        android.widget.TextView textView = new android.widget.TextView(this.f231916e);
        this.f231915d = textView;
        textView.setId(android.view.View.generateViewId());
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(17);
        int i27 = sj3.i1.f490091c;
        layoutParams2.setMarginStart(i27);
        layoutParams2.setMarginEnd(i27);
        layoutParams2.topMargin = i27;
        layoutParams2.bottomMargin = i27;
        this.f231915d.setLayoutParams(layoutParams2);
        this.f231915d.setTextColor(color);
        this.f231915d.setTextSize(com.p314xaae8f345.mm.ui.zk.b(this.f231916e, (int) dimension2));
        this.f231915d.setText(string);
        this.f231919h.addView(this.f231915d);
        android.widget.ImageView imageView = new android.widget.ImageView(this.f231916e);
        this.f231920i = imageView;
        imageView.setId(android.view.View.generateViewId());
        android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams((int) this.f231922n, (int) this.f231923o);
        int ordinal = this.f231917f.ordinal();
        if (ordinal == 0) {
            layoutParams.addRule(17, this.f231920i.getId());
            i18 = 90;
        } else if (ordinal == 1) {
            layoutParams.addRule(3, this.f231920i.getId());
            i18 = 180;
        } else if (ordinal != 3) {
            layoutParams3.addRule(17, this.f231919h.getId());
            i18 = 270;
        } else {
            layoutParams3.addRule(3, this.f231919h.getId());
            i18 = 0;
        }
        android.content.Context context2 = this.f231916e;
        android.graphics.drawable.Drawable e17 = com.p314xaae8f345.mm.ui.uk.e(context2, this.f231925q, context2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        int i28 = (int) this.f231922n;
        int i29 = (int) this.f231923o;
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i29));
        arrayList.add(java.lang.Integer.valueOf(i28));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/bubble/BubbleView", "getBitmapFromDrawable", "(Landroid/graphics/drawable/Drawable;FF)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/multitalk/ui/widget/projector/bubble/BubbleView", "getBitmapFromDrawable", "(Landroid/graphics/drawable/Drawable;FF)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        e17.setBounds(0, 0, i28, i29);
        e17.draw(canvas);
        this.f231920i.setImageDrawable(new android.graphics.drawable.BitmapDrawable(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(createBitmap, i18)));
        addView(this.f231920i, layoutParams3);
        addView(this.f231919h, layoutParams);
        this.f231919h.post(this);
        setClickable(true);
    }

    /* renamed from: getRelative */
    public float m67107x5ace3842() {
        return this.f231918g;
    }

    @Override // java.lang.Runnable
    public void run() {
        int width = this.f231919h.getWidth();
        int height = this.f231919h.getHeight();
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f231920i.getLayoutParams();
        int ordinal = this.f231917f.ordinal();
        if (ordinal == 1 || ordinal == 3) {
            layoutParams.setMargins((int) ((width * this.f231918g) - (this.f231920i.getWidth() / 2)), 0, 0, 0);
        } else {
            layoutParams.setMargins(0, (int) ((height * this.f231918g) - (this.f231920i.getHeight() / 2)), 0, 0);
        }
        this.f231920i.setLayoutParams(layoutParams);
    }

    /* renamed from: setCurThemeStyle */
    public void m67108xf5cf9e86(int i17) {
    }

    public RunnableC16592x808f1971(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f231922n = 0.0f;
        this.f231923o = 0.0f;
        this.f231924p = 0.0f;
        this.f231925q = -1;
        a(context, attributeSet, i17);
    }
}
