package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui;

/* renamed from: com.tencent.mm.plugin.location.ui.PoiHeaderView */
/* loaded from: classes3.dex */
public class C16284xdd776c9c extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f226158d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f226159e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f226160f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.C16290x262da0ee f226161g;

    public C16284xdd776c9c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f226159e = "";
        this.f226160f = "";
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.c_1, this);
        this.f226158d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.gz9);
        this.f226161g = (com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.C16290x262da0ee) inflate.findViewById(com.p314xaae8f345.mm.R.id.gyt);
        this.f226158d.setVisibility(8);
        this.f226161g.setVisibility(8);
        setVisibility(8);
        setOnClickListener(new za3.k(this));
    }

    /* renamed from: setViewUrl */
    public void m65941xcc515dc8(java.lang.String str) {
        this.f226160f = str;
    }
}
