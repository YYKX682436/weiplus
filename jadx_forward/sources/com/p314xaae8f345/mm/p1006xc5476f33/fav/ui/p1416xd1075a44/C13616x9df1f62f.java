package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44;

/* renamed from: com.tencent.mm.plugin.fav.ui.widget.FavCapacityPanel */
/* loaded from: classes8.dex */
public class C13616x9df1f62f extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f183055d;

    /* renamed from: e, reason: collision with root package name */
    public long f183056e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f183057f;

    /* renamed from: g, reason: collision with root package name */
    public int f183058g;

    /* renamed from: h, reason: collision with root package name */
    public long f183059h;

    public C13616x9df1f62f(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f183058g = 0;
        w82.a aVar = new w82.a(this);
        this.f183055d = this;
        android.view.View inflate = android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.aby, null);
        inflate.measure(-2, -2);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.dtk);
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.dtl);
        this.f183057f = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.dti);
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams.width = inflate.getMeasuredWidth();
        findViewById.setLayoutParams(layoutParams);
        findViewById2.setOnClickListener(aVar);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        this.f183055d.addView(inflate, layoutParams2);
        this.f183056e = o72.x1.K() / 1048576;
        this.f183059h = o72.x1.a0() / 1048576;
        android.widget.TextView textView = this.f183057f;
        android.content.Context context2 = textView.getContext();
        java.lang.Object[] objArr = new java.lang.Object[2];
        long j17 = this.f183059h - this.f183056e;
        objArr[0] = java.lang.Long.valueOf(j17 <= 0 ? 0L : j17);
        objArr[1] = java.lang.Long.valueOf(this.f183056e);
        textView.setText(context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c9f, objArr));
    }
}
