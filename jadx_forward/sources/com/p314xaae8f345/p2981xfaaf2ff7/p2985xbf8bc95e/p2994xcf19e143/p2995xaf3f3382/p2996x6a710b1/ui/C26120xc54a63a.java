package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.ui;

/* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.ui.IconGenerator */
/* loaded from: classes13.dex */
public class C26120xc54a63a {

    /* renamed from: SQUARE_TEXT_VIEW_ID */
    public static final int f49865x349577c5 = new java.util.concurrent.atomic.AtomicInteger(1).get();

    /* renamed from: STYLE_BLUE */
    public static final int f49866x26fe8e48 = 4;

    /* renamed from: STYLE_DEFAULT */
    public static final int f49867x2df60d73 = 1;

    /* renamed from: STYLE_GREEN */
    public static final int f49868xb91c2eb5 = 5;

    /* renamed from: STYLE_ORANGE */
    public static final int f49869x780ebc9c = 7;

    /* renamed from: STYLE_PURPLE */
    public static final int f49870x79f59e2a = 6;

    /* renamed from: STYLE_RED */
    public static final int f49871x11c660c3 = 3;

    /* renamed from: STYLE_WHITE */
    public static final int f49872xb9f92bdb = 2;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f297065a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.ViewGroup f297066b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.k f297067c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f297068d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f297069e;

    /* renamed from: f, reason: collision with root package name */
    public int f297070f;

    /* renamed from: g, reason: collision with root package name */
    public float f297071g = 0.5f;

    /* renamed from: h, reason: collision with root package name */
    public float f297072h = 1.0f;

    public C26120xc54a63a(android.content.Context context) {
        this.f297065a = context;
        android.view.ViewGroup a17 = a();
        this.f297066b = a17;
        this.f297067c = (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.k) a17.getChildAt(0);
        this.f297069e = this.f297068d;
        m100221x53b6de6f(1);
    }

    public static int a(int i17) {
        return (i17 == 3 || i17 == 4 || i17 == 5 || i17 == 6 || i17 == 7) ? 1 : 0;
    }

    /* renamed from: getAnchorU */
    public float m100212xa62d00a() {
        return a(this.f297071g, this.f297072h);
    }

    /* renamed from: getAnchorV */
    public float m100213xa62d00b() {
        return a(this.f297072h, this.f297071g);
    }

    /* renamed from: makeIcon */
    public android.graphics.Bitmap m100215x2650f87(java.lang.CharSequence charSequence) {
        android.widget.TextView textView = this.f297068d;
        if (textView != null) {
            textView.setText(charSequence);
        }
        return m100214x2650f87();
    }

    /* renamed from: setBackground */
    public void m100216xccfd5b30(android.graphics.drawable.Drawable drawable) {
        this.f297066b.setBackgroundDrawable(drawable);
        if (drawable == null) {
            this.f297066b.setPadding(0, 0, 0, 0);
            return;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        drawable.getPadding(rect);
        this.f297066b.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: setContentPadding */
    public void m100217x9bab8a5a(int i17, int i18, int i19, int i27) {
        this.f297069e.setPadding(i17, i18, i19, i27);
    }

    /* renamed from: setContentRotation */
    public void m100218xa9478a55(int i17) {
        this.f297067c.m100097x8327c6c5(i17);
    }

    /* renamed from: setContentView */
    public void m100219x590ab8fc(android.view.View view) {
        this.f297067c.removeAllViews();
        this.f297067c.addView(view);
        this.f297069e = view;
        android.view.View findViewById = this.f297067c.findViewById(f49865x349577c5);
        this.f297068d = findViewById instanceof android.widget.TextView ? (android.widget.TextView) findViewById : null;
    }

    /* renamed from: setRotation */
    public void m100220x742bae00(int i17) {
        this.f297070f = ((i17 + com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3) / 90;
    }

    /* renamed from: setStyle */
    public void m100221x53b6de6f(int i17) {
        m100223x1d8f3e73(this.f297065a, a(i17));
        if (i17 == 0) {
            m100222x1d8f3e73(android.R.style.TextAppearance.Medium, -8421505, 14.0f, 0);
        } else if (i17 == 1) {
            m100222x1d8f3e73(android.R.style.TextAppearance.Medium, -1118482, 14.0f, 0);
        }
    }

    /* renamed from: setTextAppearance */
    public void m100223x1d8f3e73(android.content.Context context, int i17) {
        android.widget.TextView textView = this.f297068d;
        if (textView != null) {
            textView.setTextAppearance(context, i17);
        }
    }

    public final android.view.ViewGroup a() {
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.f297065a);
        linearLayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.k kVar = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.k(this.f297065a);
        this.f297067c = kVar;
        kVar.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        this.f297068d = new android.widget.TextView(this.f297065a);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        this.f297068d.setLayoutParams(layoutParams);
        this.f297068d.setPadding(10, 5, 10, 5);
        this.f297068d.setId(f49865x349577c5);
        this.f297067c.addView(this.f297068d);
        linearLayout.addView(this.f297067c);
        return linearLayout;
    }

    /* renamed from: setTextAppearance */
    public void m100222x1d8f3e73(int i17, int i18, float f17, int i19) {
        m100223x1d8f3e73(this.f297065a, i17);
        this.f297068d.setTextColor(i18);
        this.f297068d.setTextSize(f17);
        android.widget.TextView textView = this.f297068d;
        textView.setTypeface(textView.getTypeface(), i19);
    }

    /* renamed from: makeIcon */
    public android.graphics.Bitmap m100214x2650f87() {
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f297066b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredWidth = this.f297066b.getMeasuredWidth();
        int measuredHeight = this.f297066b.getMeasuredHeight();
        this.f297066b.layout(0, 0, measuredWidth, measuredHeight);
        int i17 = this.f297070f;
        if (i17 == 1 || i17 == 3) {
            measuredHeight = this.f297066b.getMeasuredWidth();
            measuredWidth = this.f297066b.getMeasuredHeight();
        }
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(measuredWidth, measuredHeight, android.graphics.Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(0);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        int i18 = this.f297070f;
        if (i18 != 0) {
            if (i18 == 1) {
                canvas.translate(measuredWidth, 0.0f);
                canvas.rotate(90.0f);
            } else if (i18 == 2) {
                canvas.rotate(180.0f, measuredWidth / 2, measuredHeight / 2);
            } else {
                canvas.translate(0.0f, measuredHeight);
                canvas.rotate(270.0f);
            }
        }
        this.f297066b.draw(canvas);
        return createBitmap;
    }

    public final float a(float f17, float f18) {
        int i17 = this.f297070f;
        if (i17 == 0) {
            return f17;
        }
        if (i17 == 1) {
            return 1.0f - f18;
        }
        if (i17 == 2) {
            return 1.0f - f17;
        }
        if (i17 == 3) {
            return f18;
        }
        throw new java.lang.IllegalStateException();
    }
}
