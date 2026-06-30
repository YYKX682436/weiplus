package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.p1134x5534fb71;

/* renamed from: com.tencent.mm.plugin.appbrand.keylogger.stepview.VerticalStepView */
/* loaded from: classes5.dex */
public class C12312x14b5a947 extends android.widget.LinearLayout implements lg1.d {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.RelativeLayout f165706d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.p1134x5534fb71.C12313xeff8b488 f165707e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f165708f;

    /* renamed from: g, reason: collision with root package name */
    public final int f165709g;

    /* renamed from: h, reason: collision with root package name */
    public final int f165710h;

    /* renamed from: i, reason: collision with root package name */
    public final int f165711i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f165712m;

    public C12312x14b5a947(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a() {
        android.widget.RelativeLayout relativeLayout = this.f165706d;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
            java.util.List<java.lang.Float> m51587xf20f749c = this.f165707e.m51587xf20f749c();
            if (this.f165708f == null || m51587xf20f749c == null || m51587xf20f749c.size() <= 0) {
                return;
            }
            for (int i17 = 0; i17 < this.f165708f.size(); i17++) {
                android.widget.TextView textView = new android.widget.TextView(getContext());
                this.f165712m = textView;
                textView.setTextSize(2, this.f165711i);
                this.f165712m.setText(((lg1.b) this.f165708f.get(i17)).f400085a);
                this.f165712m.setY(m51587xf20f749c.get(i17).floatValue() - (this.f165707e.m51588xcee5cbf8() / 2.0f));
                this.f165712m.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
                if (i17 <= 0) {
                    this.f165712m.setTypeface(null, 1);
                    this.f165712m.setTextColor(this.f165710h);
                } else {
                    this.f165712m.setTextColor(this.f165709g);
                }
                this.f165706d.addView(this.f165712m);
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
    }

    public C12312x14b5a947(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f165709g = b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.a9r);
        this.f165710h = b3.l.m9702x7444d5ad(getContext(), android.R.color.white);
        this.f165711i = 14;
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d_h, this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.p1134x5534fb71.C12313xeff8b488 c12313xeff8b488 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.p1134x5534fb71.C12313xeff8b488) inflate.findViewById(com.p314xaae8f345.mm.R.id.nid);
        this.f165707e = c12313xeff8b488;
        c12313xeff8b488.m51595x4ac79299(this);
        this.f165706d = (android.widget.RelativeLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.m6n);
    }
}
