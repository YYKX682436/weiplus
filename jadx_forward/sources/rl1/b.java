package rl1;

/* loaded from: classes5.dex */
public class b extends android.widget.LinearLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final int f478688e = android.graphics.Color.parseColor("#000000");

    /* renamed from: f, reason: collision with root package name */
    public static final int f478689f = android.graphics.Color.parseColor("#000000");

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f478690d;

    public b(android.content.Context context) {
        super(context);
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        setOrientation(1);
        setGravity(17);
        android.widget.TextView textView = new android.widget.TextView(context);
        this.f478690d = textView;
        textView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        addView(this.f478690d);
    }

    public void a(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39) {
        setPadding(i18, i18, i18, i18);
        rl1.a aVar = new rl1.a();
        aVar.f478684f = i17;
        aVar.f478679a.setColor(i27);
        aVar.f478685g = i18;
        aVar.f478687i = (i18 / 3) + aVar.f478686h;
        android.graphics.Paint paint = aVar.f478680b;
        paint.setColor(i19);
        if (i38 > 0) {
            paint.setShadowLayer(i39 <= 0 ? 1.0f : i39, i29, i37, i28);
        }
        setBackgroundDrawable(aVar);
    }

    /* renamed from: setGravity */
    public void m162686xc1f6fb8c(java.lang.String str) {
        if (str.equals("left")) {
            this.f478690d.setGravity(3);
            return;
        }
        if (str.equals("right")) {
            this.f478690d.setGravity(5);
        } else if (str.equals("center")) {
            this.f478690d.setGravity(17);
        } else {
            this.f478690d.setGravity(17);
        }
    }

    /* renamed from: setText */
    public void m162687x765074af(java.lang.String str) {
        this.f478690d.setText(str);
    }

    /* renamed from: setTextColor */
    public void m162688x1c5c5ff4(int i17) {
        this.f478690d.setTextColor(i17);
    }

    /* renamed from: setTextSize */
    public void m162689x3abfd950(int i17) {
        this.f478690d.setTextSize(i17);
    }

    /* renamed from: setTitlePadding */
    public void m162690x92ad6c1b(int i17) {
        this.f478690d.setPadding(i17, i17, i17, i17);
    }
}
