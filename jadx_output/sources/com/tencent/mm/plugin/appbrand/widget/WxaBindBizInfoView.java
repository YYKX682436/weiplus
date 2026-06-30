package com.tencent.mm.plugin.appbrand.widget;

/* loaded from: classes.dex */
public class WxaBindBizInfoView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f91018d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f91019e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f91020f;

    static {
        i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 15);
        i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 30);
    }

    public WxaBindBizInfoView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a();
    }

    public final void a() {
        this.f91018d = new java.util.LinkedList();
        android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f488078gd, this);
        this.f91019e = inflate.findViewById(com.tencent.mm.R.id.g6m);
        this.f91020f = inflate.findViewById(com.tencent.mm.R.id.jqk);
    }

    public java.util.List<com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaEntryInfo> getWxaEntryInfoList() {
        return this.f91018d;
    }

    public WxaBindBizInfoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }
}
