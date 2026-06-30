package cl1;

/* loaded from: classes5.dex */
public class i0 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f124408d;

    /* renamed from: e, reason: collision with root package name */
    public int f124409e;

    /* renamed from: f, reason: collision with root package name */
    public int f124410f;

    /* renamed from: g, reason: collision with root package name */
    public int f124411g;

    /* renamed from: h, reason: collision with root package name */
    public int f124412h;

    /* renamed from: i, reason: collision with root package name */
    public int f124413i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f124414m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f124415n;

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
        if (this.f124415n.getTextSize() > 0.0f) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12768x381d68c7.F = java.lang.Math.min(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12768x381d68c7.F, this.f124415n.getTextSize());
            if (this.f124415n.getTextSize() <= com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12768x381d68c7.F || android.os.Build.VERSION.SDK_INT < 26) {
                return;
            }
            this.f124415n.setAutoSizeTextTypeUniformWithConfiguration(1, (int) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12768x381d68c7.F, 1, 0);
        }
    }

    public void b(boolean z17) {
        this.f124414m.setImageResource(z17 ? this.f124409e : this.f124408d);
        setBackgroundResource(z17 ? this.f124413i : this.f124412h);
        this.f124415n.setText(z17 ? this.f124411g : this.f124410f);
    }

    public void c(int i17, int i18, int i19, int i27, int i28, int i29) {
        this.f124408d = i17;
        this.f124409e = i18;
        this.f124410f = i19;
        this.f124411g = i27;
        this.f124412h = i28;
        this.f124413i = i29;
        setBackgroundResource(i28);
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(getContext());
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        addView(relativeLayout, layoutParams);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(getContext());
        c22699x3dcdb352.setImageResource(i17);
        c22699x3dcdb352.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.width = (int) (i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz) * cl1.k.a(getContext()));
        layoutParams2.height = (int) (i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz) * cl1.k.a(getContext()));
        layoutParams2.addRule(12);
        layoutParams2.addRule(14);
        c22699x3dcdb352.m82040x7541828(-1);
        c22699x3dcdb352.setLayoutParams(layoutParams2);
        this.f124414m = c22699x3dcdb352;
        relativeLayout.addView(c22699x3dcdb352);
        android.widget.RelativeLayout relativeLayout2 = new android.widget.RelativeLayout(getContext());
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-1, 0);
        layoutParams3.weight = 1.0f;
        relativeLayout2.setPadding(i65.a.b(getContext(), 4), 0, i65.a.b(getContext(), 4), i65.a.b(getContext(), 4));
        addView(relativeLayout2, layoutParams3);
        android.widget.TextView textView = new android.widget.TextView(getContext());
        textView.setText(i19);
        textView.setTextSize(1, cl1.k.a(getContext()) * 12.0f);
        textView.setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
        textView.setPadding(0, i65.a.b(getContext(), 2), 0, 0);
        textView.setGravity(49);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(1, (int) (cl1.k.a(getContext()) * 12.0f), 1, 1);
        }
        textView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        this.f124415n = textView;
        relativeLayout2.addView(textView);
    }
}
