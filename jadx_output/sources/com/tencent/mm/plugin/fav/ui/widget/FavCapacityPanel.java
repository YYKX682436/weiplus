package com.tencent.mm.plugin.fav.ui.widget;

/* loaded from: classes8.dex */
public class FavCapacityPanel extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f101522d;

    /* renamed from: e, reason: collision with root package name */
    public long f101523e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f101524f;

    /* renamed from: g, reason: collision with root package name */
    public int f101525g;

    /* renamed from: h, reason: collision with root package name */
    public long f101526h;

    public FavCapacityPanel(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f101525g = 0;
        w82.a aVar = new w82.a(this);
        this.f101522d = this;
        android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.aby, null);
        inflate.measure(-2, -2);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.dtk);
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.dtl);
        this.f101524f = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.dti);
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams.width = inflate.getMeasuredWidth();
        findViewById.setLayoutParams(layoutParams);
        findViewById2.setOnClickListener(aVar);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        this.f101522d.addView(inflate, layoutParams2);
        this.f101523e = o72.x1.K() / 1048576;
        this.f101526h = o72.x1.a0() / 1048576;
        android.widget.TextView textView = this.f101524f;
        android.content.Context context2 = textView.getContext();
        java.lang.Object[] objArr = new java.lang.Object[2];
        long j17 = this.f101526h - this.f101523e;
        objArr[0] = java.lang.Long.valueOf(j17 <= 0 ? 0L : j17);
        objArr[1] = java.lang.Long.valueOf(this.f101523e);
        textView.setText(context2.getString(com.tencent.mm.R.string.c9f, objArr));
    }
}
