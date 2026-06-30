package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes3.dex */
public class fa extends android.widget.TextView {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f89711d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f89712e;

    public fa(com.tencent.mm.plugin.appbrand.ui.ga gaVar, android.content.Context context) {
        super(context);
        setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        setTextSize(1, 12.0f);
        setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_9));
    }

    public final void a() {
        setText(java.lang.String.format("%s: %s", this.f89711d, this.f89712e));
    }
}
