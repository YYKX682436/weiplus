package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui;

/* renamed from: com.tencent.mm.plugin.profile.ui.ProfileNormalItemView */
/* loaded from: classes8.dex */
public class C16865xbd41bc48 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19648xec05501 {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f235310e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.CharSequence f235311f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View.OnClickListener f235312g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f235313h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f235314i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f235315m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f235316n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.LinearLayout f235317o;

    public C16865xbd41bc48(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f235313h = false;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rj.t.f477689f);
        this.f235310e = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19648xec05501
    public void a() {
        this.f235314i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cep);
        this.f235315m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ceo);
        this.f235316n = findViewById(com.p314xaae8f345.mm.R.id.m38);
        this.f235317o = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.f567995uv1);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19648xec05501
    /* renamed from: getLayout */
    public int mo67643x22f21e20() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570901cb3;
    }

    public C16865xbd41bc48(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f235313h = false;
    }
}
