package fk2;

/* loaded from: classes3.dex */
public final class v0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f345028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f345029e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fk2.x0 f345030f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f345031g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bm2.h1 f345032h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(android.content.Context context, android.graphics.Bitmap bitmap, fk2.x0 x0Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var, bm2.h1 h1Var) {
        super(0);
        this.f345028d = context;
        this.f345029e = bitmap;
        this.f345030f = x0Var;
        this.f345031g = f0Var;
        this.f345032h = h1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(this.f345028d.getResources(), this.f345029e);
        fk2.x0 x0Var = this.f345030f;
        bitmapDrawable.setBounds(0, 0, ((java.lang.Number) ((jz5.n) x0Var.f345045n).mo141623x754a37bb()).intValue(), ((java.lang.Number) ((jz5.n) x0Var.f345045n).mo141623x754a37bb()).intValue());
        al5.w wVar = new al5.w(bitmapDrawable, 1);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = this.f345031g;
        al5.w[] wVarArr = (al5.w[]) f0Var.getSpans(f0Var.length() - 1, f0Var.length(), al5.w.class);
        if (wVarArr != null) {
            for (al5.w wVar2 : wVarArr) {
                f0Var.removeSpan(wVar2);
            }
        }
        f0Var.c(wVar, f0Var.length() - 1, f0Var.length(), 33);
        bm2.h1 h1Var = this.f345032h;
        h1Var.f103460e.b(f0Var);
        h1Var.f103460e.invalidate();
        return jz5.f0.f384359a;
    }
}
