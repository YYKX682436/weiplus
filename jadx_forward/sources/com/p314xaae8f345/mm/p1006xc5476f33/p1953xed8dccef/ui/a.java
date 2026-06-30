package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* loaded from: classes12.dex */
public class a implements com.p314xaae8f345.mm.sdk.p2603x2137b148.s3 {

    /* renamed from: a, reason: collision with root package name */
    public volatile android.text.Spanned f234796a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234797b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.C16808xf9c47a5d f234798c;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.C16808xf9c47a5d c16808xf9c47a5d, java.lang.String str) {
        this.f234798c = c16808xf9c47a5d;
        this.f234797b = str;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.s3
    public boolean a() {
        this.f234796a = android.text.Html.fromHtml(this.f234797b, null, this.f234798c.f234724d);
        return true;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.s3
    public boolean b() {
        super/*android.widget.TextView*/.setText(this.f234796a, android.widget.TextView.BufferType.SPANNABLE);
        this.f234798c.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        return true;
    }

    /* renamed from: toString */
    public java.lang.String m67609x9616526c() {
        return super.toString() + "|setText";
    }
}
