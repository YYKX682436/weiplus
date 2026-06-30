package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.WxaBindBizInfoView */
/* loaded from: classes.dex */
public class C12758xaddc4889 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f172551d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f172552e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f172553f;

    static {
        i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 15);
        i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 30);
    }

    public C12758xaddc4889(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a();
    }

    public final void a() {
        this.f172551d = new java.util.LinkedList();
        android.view.View inflate = android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f569611gd, this);
        this.f172552e = inflate.findViewById(com.p314xaae8f345.mm.R.id.g6m);
        this.f172553f = inflate.findViewById(com.p314xaae8f345.mm.R.id.jqk);
    }

    /* renamed from: getWxaEntryInfoList */
    public java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11826x30fe0b2d> m53331x314f4ab4() {
        return this.f172551d;
    }

    public C12758xaddc4889(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }
}
