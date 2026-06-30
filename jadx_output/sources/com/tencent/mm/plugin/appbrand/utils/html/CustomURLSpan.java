package com.tencent.mm.plugin.appbrand.utils.html;

/* loaded from: classes12.dex */
public class CustomURLSpan extends android.text.style.URLSpan {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f90463d;

    /* renamed from: e, reason: collision with root package name */
    public final kk1.c f90464e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f90465f;

    public CustomURLSpan(java.lang.String str, kk1.c cVar, boolean z17) {
        super(str);
        this.f90463d = str;
        this.f90464e = cVar;
        this.f90465f = z17;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        kk1.c cVar = this.f90464e;
        if (cVar == null) {
            return;
        }
        cVar.a(this.f90463d);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(this.f90465f);
    }
}
