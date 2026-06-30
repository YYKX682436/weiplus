package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p1213x3107ab;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.html.CustomURLSpan */
/* loaded from: classes12.dex */
public class C12736x29c08888 extends android.text.style.URLSpan {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f171996d;

    /* renamed from: e, reason: collision with root package name */
    public final kk1.c f171997e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f171998f;

    public C12736x29c08888(java.lang.String str, kk1.c cVar, boolean z17) {
        super(str);
        this.f171996d = str;
        this.f171997e = cVar;
        this.f171998f = z17;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        kk1.c cVar = this.f171997e;
        if (cVar == null) {
            return;
        }
        cVar.a(this.f171996d);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(this.f171998f);
    }
}
