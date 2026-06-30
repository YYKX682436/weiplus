package com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui;

/* renamed from: com.tencent.mm.plugin.collect.ui.CollectRadioBtnView */
/* loaded from: classes3.dex */
public class C13146xb837d0d0 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f177951d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f177952e;

    public C13146xb837d0d0(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public final void a(android.content.Context context) {
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570169z6, this);
        this.f177951d = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.lhw);
        this.f177952e = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
    }

    /* renamed from: setRadioSrc */
    public void m54564x74b50a6b(int i17) {
        this.f177951d.setImageResource(i17);
    }

    /* renamed from: setTitleText */
    public void m54565xdc742163(java.lang.String str) {
        this.f177952e.setText(str);
    }

    public C13146xb837d0d0(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a(context);
    }
}
