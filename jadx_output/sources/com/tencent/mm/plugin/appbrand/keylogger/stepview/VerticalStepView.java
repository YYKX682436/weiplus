package com.tencent.mm.plugin.appbrand.keylogger.stepview;

/* loaded from: classes5.dex */
public class VerticalStepView extends android.widget.LinearLayout implements lg1.d {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.RelativeLayout f84173d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.keylogger.stepview.VerticalStepViewIndicator f84174e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f84175f;

    /* renamed from: g, reason: collision with root package name */
    public final int f84176g;

    /* renamed from: h, reason: collision with root package name */
    public final int f84177h;

    /* renamed from: i, reason: collision with root package name */
    public final int f84178i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f84179m;

    public VerticalStepView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a() {
        android.widget.RelativeLayout relativeLayout = this.f84173d;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
            java.util.List<java.lang.Float> circleCenterPointPositionList = this.f84174e.getCircleCenterPointPositionList();
            if (this.f84175f == null || circleCenterPointPositionList == null || circleCenterPointPositionList.size() <= 0) {
                return;
            }
            for (int i17 = 0; i17 < this.f84175f.size(); i17++) {
                android.widget.TextView textView = new android.widget.TextView(getContext());
                this.f84179m = textView;
                textView.setTextSize(2, this.f84178i);
                this.f84179m.setText(((lg1.b) this.f84175f.get(i17)).f318552a);
                this.f84179m.setY(circleCenterPointPositionList.get(i17).floatValue() - (this.f84174e.getCircleRadius() / 2.0f));
                this.f84179m.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
                if (i17 <= 0) {
                    this.f84179m.setTypeface(null, 1);
                    this.f84179m.setTextColor(this.f84177h);
                } else {
                    this.f84179m.setTextColor(this.f84176g);
                }
                this.f84173d.addView(this.f84179m);
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
    }

    public VerticalStepView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f84176g = b3.l.getColor(getContext(), com.tencent.mm.R.color.a9r);
        this.f84177h = b3.l.getColor(getContext(), android.R.color.white);
        this.f84178i = 14;
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.d_h, this);
        com.tencent.mm.plugin.appbrand.keylogger.stepview.VerticalStepViewIndicator verticalStepViewIndicator = (com.tencent.mm.plugin.appbrand.keylogger.stepview.VerticalStepViewIndicator) inflate.findViewById(com.tencent.mm.R.id.nid);
        this.f84174e = verticalStepViewIndicator;
        verticalStepViewIndicator.setOnDrawListener(this);
        this.f84173d = (android.widget.RelativeLayout) inflate.findViewById(com.tencent.mm.R.id.m6n);
    }
}
