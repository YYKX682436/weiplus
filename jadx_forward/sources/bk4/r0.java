package bk4;

/* loaded from: classes4.dex */
public final class r0 extends al5.w {

    /* renamed from: h, reason: collision with root package name */
    public static final int f103083h = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 4);

    /* renamed from: f, reason: collision with root package name */
    public final mj4.h f103084f;

    /* renamed from: g, reason: collision with root package name */
    public final bi4.c f103085g;

    public r0(android.graphics.drawable.Drawable drawable, int i17, mj4.h hVar, bi4.c cVar) {
        super(drawable, i17);
        this.f103084f = hVar;
        this.f103085g = cVar;
    }

    @Override // al5.w, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        super.draw(canvas, charSequence, i17, i18, f17 + f103083h, i19, i27, i28, paint);
    }

    @Override // al5.w, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i17, int i18, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        return super.getSize(paint, charSequence, i17, i18, fontMetricsInt) + f103083h;
    }

    @Override // al5.w
    /* renamed from: onClick */
    public void mo2318xaf6b9ae9(android.view.View view) {
        bi4.c cVar;
        mj4.h hVar = this.f103084f;
        if (hVar == null || (cVar = this.f103085g) == null || cVar != bi4.c.SNS_FEED) {
            return;
        }
        mj4.k kVar = (mj4.k) hVar;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(kVar.h(), "2021")) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", kVar.o());
            j45.l.j(view != null ? view.getContext() : null, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
        }
    }
}
