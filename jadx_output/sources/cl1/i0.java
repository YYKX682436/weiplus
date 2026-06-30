package cl1;

/* loaded from: classes5.dex */
public class i0 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f42875d;

    /* renamed from: e, reason: collision with root package name */
    public int f42876e;

    /* renamed from: f, reason: collision with root package name */
    public int f42877f;

    /* renamed from: g, reason: collision with root package name */
    public int f42878g;

    /* renamed from: h, reason: collision with root package name */
    public int f42879h;

    /* renamed from: i, reason: collision with root package name */
    public int f42880i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f42881m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f42882n;

    public i0(android.content.Context context) {
        super(context);
        setOrientation(0);
        setOrientation(1);
        setGravity(17);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
    }

    public void a() {
        if (this.f42882n.getTextSize() > 0.0f) {
            com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView.F = java.lang.Math.min(com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView.F, this.f42882n.getTextSize());
            if (this.f42882n.getTextSize() <= com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView.F || android.os.Build.VERSION.SDK_INT < 26) {
                return;
            }
            this.f42882n.setAutoSizeTextTypeUniformWithConfiguration(1, (int) com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView.F, 1, 0);
        }
    }

    public void b(boolean z17) {
        this.f42881m.setImageResource(z17 ? this.f42876e : this.f42875d);
        setBackgroundResource(z17 ? this.f42880i : this.f42879h);
        this.f42882n.setText(z17 ? this.f42878g : this.f42877f);
    }

    public void c(int i17, int i18, int i19, int i27, int i28, int i29) {
        this.f42875d = i17;
        this.f42876e = i18;
        this.f42877f = i19;
        this.f42878g = i27;
        this.f42879h = i28;
        this.f42880i = i29;
        setBackgroundResource(i28);
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(getContext());
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        addView(relativeLayout, layoutParams);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(getContext());
        weImageView.setImageResource(i17);
        weImageView.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.width = (int) (i65.a.f(getContext(), com.tencent.mm.R.dimen.f479704cz) * cl1.k.a(getContext()));
        layoutParams2.height = (int) (i65.a.f(getContext(), com.tencent.mm.R.dimen.f479704cz) * cl1.k.a(getContext()));
        layoutParams2.addRule(12);
        layoutParams2.addRule(14);
        weImageView.setIconColor(-1);
        weImageView.setLayoutParams(layoutParams2);
        this.f42881m = weImageView;
        relativeLayout.addView(weImageView);
        android.widget.RelativeLayout relativeLayout2 = new android.widget.RelativeLayout(getContext());
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-1, 0);
        layoutParams3.weight = 1.0f;
        relativeLayout2.setPadding(i65.a.b(getContext(), 4), 0, i65.a.b(getContext(), 4), i65.a.b(getContext(), 4));
        addView(relativeLayout2, layoutParams3);
        android.widget.TextView textView = new android.widget.TextView(getContext());
        textView.setText(i19);
        textView.setTextSize(1, cl1.k.a(getContext()) * 12.0f);
        textView.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.f479549ab0));
        textView.setPadding(0, i65.a.b(getContext(), 2), 0, 0);
        textView.setGravity(49);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(1, (int) (cl1.k.a(getContext()) * 12.0f), 1, 1);
        }
        textView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        this.f42882n = textView;
        relativeLayout2.addView(textView);
    }
}
