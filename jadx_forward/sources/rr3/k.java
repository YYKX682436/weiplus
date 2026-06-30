package rr3;

/* loaded from: classes3.dex */
public final class k extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f480727d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f480728e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f480729f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f480730g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f480727d = jz5.h.b(new rr3.f(activity));
        this.f480728e = jz5.h.b(new rr3.j(activity));
        this.f480729f = jz5.h.b(new rr3.g(activity));
        this.f480730g = jz5.h.b(new rr3.i(activity));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("Contact_Nick");
        kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
        jz5.g gVar = this.f480730g;
        java.lang.String U6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1961xba7262a1.p1962x2ddda8.ActivityC16886xa16edb76) ((jz5.n) gVar).mo141623x754a37bb()).U6();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) c0Var).getClass();
        android.graphics.Bitmap a17 = com.p314xaae8f345.mm.p943x351df9c2.g.a(U6);
        if (a17 != null) {
            ((android.widget.ImageView) ((jz5.n) this.f480727d).mo141623x754a37bb()).setImageBitmap(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(a17, false, a17.getWidth() * 0.5f));
        }
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f480729f).mo141623x754a37bb();
        android.text.TextPaint paint = textView != null ? textView.getPaint() : null;
        if (paint != null) {
            paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        }
        android.text.TextPaint paint2 = textView != null ? textView.getPaint() : null;
        if (paint2 != null) {
            paint2.setStrokeWidth(0.8f);
        }
        if (x51.t1.b(stringExtra) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stringExtra, ((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1961xba7262a1.p1962x2ddda8.ActivityC16886xa16edb76) ((jz5.n) gVar).mo141623x754a37bb()).U6())) {
            ((c01.k7) c01.n8.a()).b(((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1961xba7262a1.p1962x2ddda8.ActivityC16886xa16edb76) ((jz5.n) gVar).mo141623x754a37bb()).U6(), 5, new rr3.h(this, stringExtra));
        } else {
            ((android.widget.TextView) ((jz5.n) this.f480728e).mo141623x754a37bb()).setText(stringExtra);
        }
    }
}
