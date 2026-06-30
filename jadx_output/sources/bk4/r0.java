package bk4;

/* loaded from: classes4.dex */
public final class r0 extends al5.w {

    /* renamed from: h, reason: collision with root package name */
    public static final int f21550h = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 4);

    /* renamed from: f, reason: collision with root package name */
    public final mj4.h f21551f;

    /* renamed from: g, reason: collision with root package name */
    public final bi4.c f21552g;

    public r0(android.graphics.drawable.Drawable drawable, int i17, mj4.h hVar, bi4.c cVar) {
        super(drawable, i17);
        this.f21551f = hVar;
        this.f21552g = cVar;
    }

    @Override // al5.w, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(paint, "paint");
        super.draw(canvas, charSequence, i17, i18, f17 + f21550h, i19, i27, i28, paint);
    }

    @Override // al5.w, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i17, int i18, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        kotlin.jvm.internal.o.g(paint, "paint");
        return super.getSize(paint, charSequence, i17, i18, fontMetricsInt) + f21550h;
    }

    @Override // al5.w
    public void onClick(android.view.View view) {
        bi4.c cVar;
        mj4.h hVar = this.f21551f;
        if (hVar == null || (cVar = this.f21552g) == null || cVar != bi4.c.SNS_FEED) {
            return;
        }
        mj4.k kVar = (mj4.k) hVar;
        if (kotlin.jvm.internal.o.b(kVar.h(), "2021")) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", kVar.o());
            j45.l.j(view != null ? view.getContext() : null, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        }
    }
}
