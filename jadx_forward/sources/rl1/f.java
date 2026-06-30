package rl1;

/* loaded from: classes13.dex */
public class f extends android.widget.FrameLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final int f478700p = android.graphics.Color.parseColor("#000000");

    /* renamed from: q, reason: collision with root package name */
    public static final int f478701q;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f478702d;

    /* renamed from: e, reason: collision with root package name */
    public int f478703e;

    /* renamed from: f, reason: collision with root package name */
    public int f478704f;

    /* renamed from: g, reason: collision with root package name */
    public int f478705g;

    /* renamed from: h, reason: collision with root package name */
    public int f478706h;

    /* renamed from: i, reason: collision with root package name */
    public int f478707i;

    /* renamed from: m, reason: collision with root package name */
    public int f478708m;

    /* renamed from: n, reason: collision with root package name */
    public float f478709n;

    /* renamed from: o, reason: collision with root package name */
    public float f478710o;

    static {
        android.graphics.Color.parseColor("#000000");
        f478701q = android.graphics.Color.parseColor("#000000");
    }

    public f(android.content.Context context) {
        super(context);
        this.f478703e = 0;
        this.f478704f = 0;
        this.f478709n = 0.0f;
        this.f478710o = 0.0f;
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        this.f478702d = new android.widget.TextView(context);
        this.f478702d.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        addView(this.f478702d);
    }

    public void a() {
        m162695x765074af("");
        m162698x3abfd950(12);
        m162696x1c5c5ff4(f478700p);
        m162697xe1b8c62(0);
        m162694xc1f6fb8c("center");
        int i17 = f478701q;
        b(0, 0, i17, i17);
    }

    public void b(int i17, int i18, int i19, int i27) {
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setCornerRadius(i17);
        gradientDrawable.setStroke(i18, i19);
        gradientDrawable.setColor(i27);
        this.f478702d.setBackgroundDrawable(gradientDrawable);
    }

    /* renamed from: getAnchorX */
    public float m162692xa62d00d() {
        return this.f478709n;
    }

    /* renamed from: getAnchorY */
    public float m162693xa62d00e() {
        return this.f478710o;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) getChildAt(0).getLayoutParams();
        int i28 = this.f478703e;
        if (i28 >= 0 && this.f478704f >= 0) {
            layoutParams.gravity = 85;
        } else if (i28 >= 0 && this.f478704f <= 0) {
            layoutParams.gravity = 53;
        } else if (i28 <= 0 && this.f478704f >= 0) {
            layoutParams.gravity = 83;
        } else if (i28 <= 0 && this.f478704f <= 0) {
            layoutParams.gravity = 51;
        }
        super.onLayout(z17, i17, i18, i19, i27);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        this.f478705g = getMeasuredWidth();
        this.f478706h = getMeasuredHeight();
        int i19 = this.f478705g;
        int i27 = -i19;
        int i28 = this.f478703e;
        if (i27 < i28 && i28 < 0) {
            this.f478707i = i19;
            this.f478709n = java.lang.Math.abs(i28) / (this.f478705g * 1.0f);
        } else if (i28 >= 0) {
            this.f478707i = i19 + java.lang.Math.abs(i28);
            this.f478709n = 0.0f;
        } else {
            this.f478707i = java.lang.Math.abs(i28);
            this.f478709n = 1.0f;
        }
        int i29 = this.f478706h;
        int i37 = -i29;
        int i38 = this.f478704f;
        if (i37 < i38 && i38 < 0) {
            this.f478708m = i29;
            this.f478710o = java.lang.Math.abs(i38) / (this.f478706h * 1.0f);
        } else if (i38 >= 0) {
            this.f478708m = i29 + java.lang.Math.abs(i38);
            this.f478710o = 0.0f;
        } else {
            this.f478708m = java.lang.Math.abs(i38);
            this.f478710o = 1.0f;
        }
        setMeasuredDimension(this.f478707i, this.f478708m);
    }

    /* renamed from: setGravity */
    public void m162694xc1f6fb8c(java.lang.String str) {
        this.f478702d.setGravity(17);
    }

    /* renamed from: setText */
    public void m162695x765074af(java.lang.String str) {
        this.f478702d.setText(str);
    }

    /* renamed from: setTextColor */
    public void m162696x1c5c5ff4(int i17) {
        this.f478702d.setTextColor(i17);
    }

    /* renamed from: setTextPadding */
    public void m162697xe1b8c62(int i17) {
        this.f478702d.setPadding(i17, i17, i17, i17);
    }

    /* renamed from: setTextSize */
    public void m162698x3abfd950(int i17) {
        this.f478702d.setTextSize(i17);
    }

    /* renamed from: setX */
    public void m162699x35d036(int i17) {
        this.f478703e = i17;
    }

    /* renamed from: setY */
    public void m162700x35d037(int i17) {
        this.f478704f = i17;
    }
}
