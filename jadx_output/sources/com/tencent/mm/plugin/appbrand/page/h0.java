package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class h0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.y9 f86648d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f86649e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86650f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader f86651g;

    public h0(com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader appBrandMenuHeader, r45.y9 y9Var, yz5.a aVar, java.lang.String str) {
        this.f86651g = appBrandMenuHeader;
        this.f86648d = y9Var;
        this.f86649e = aVar;
        this.f86650f = str;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        java.util.LinkedList linkedList = this.f86648d.f390874e.f374415d;
        com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader appBrandMenuHeader = this.f86651g;
        float dimension = appBrandMenuHeader.f86348e.getContext().getResources().getDimension(com.tencent.mm.R.dimen.aif) * i65.a.q(appBrandMenuHeader.f86348e.getContext());
        android.text.TextPaint textPaint = new android.text.TextPaint();
        textPaint.setTextSize(dimension);
        float dimensionPixelSize = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a).f197135a - appBrandMenuHeader.f86348e.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9);
        float f17 = 0.0f;
        for (int i17 = 0; i17 < linkedList.size(); i17++) {
            java.lang.String str = ((r45.ba) linkedList.get(i17)).f370644e;
            if (str == null) {
                str = "";
            }
            f17 += textPaint.measureText(str) + appBrandMenuHeader.f86348e.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479693cs);
            if (f17 > dimensionPixelSize) {
                return i17;
            }
        }
        return linkedList.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        ((com.tencent.mm.plugin.appbrand.page.b1) k3Var).f86422d.setText(((r45.ba) this.f86648d.f390874e.f374415d.get(i17)).f370644e);
        k3Var.itemView.setOnClickListener(new com.tencent.mm.plugin.appbrand.page.g0(this));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader appBrandMenuHeader = this.f86651g;
        return new com.tencent.mm.plugin.appbrand.page.b1(appBrandMenuHeader, android.view.LayoutInflater.from(appBrandMenuHeader.f86348e.getContext()).inflate(com.tencent.mm.R.layout.cb_, viewGroup, false));
    }
}
