package com.tencent.mm.plugin.collect.ui;

/* loaded from: classes3.dex */
public class CollectRadioBtnView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f96418d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f96419e;

    public CollectRadioBtnView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public final void a(android.content.Context context) {
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f488636z6, this);
        this.f96418d = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.lhw);
        this.f96419e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf);
    }

    public void setRadioSrc(int i17) {
        this.f96418d.setImageResource(i17);
    }

    public void setTitleText(java.lang.String str) {
        this.f96419e.setText(str);
    }

    public CollectRadioBtnView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a(context);
    }
}
