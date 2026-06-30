package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui;

/* renamed from: com.tencent.mm.plugin.location.ui.TipSayingWidget */
/* loaded from: classes.dex */
public class C16291x2f212556 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f226201d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f226202e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f226203f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f226204g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Chronometer f226205h;

    public C16291x2f212556(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f226201d = context;
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.d18, this);
        this.f226202e = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.m_5);
        this.f226203f = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.m_7);
        this.f226205h = (android.widget.Chronometer) findViewById(com.p314xaae8f345.mm.R.id.bwf);
    }

    /* renamed from: setCurSaying */
    public void m65952x4dd9c035(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Bi(this.f226202e, str, true);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f226204g)) {
            this.f226204g = c01.z1.r();
        }
        boolean equals = this.f226204g.equals(str);
        android.content.Context context = this.f226201d;
        if (equals) {
            this.f226203f.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k1s, str));
            this.f226205h.setVisibility(0);
        } else {
            this.f226203f.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k1s, str));
            this.f226205h.setVisibility(8);
        }
    }
}
