package fk2;

/* loaded from: classes3.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f344986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f344987e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fk2.s0 f344988f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jz5.l f344989g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f344990h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ bm2.h1 f344991i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(android.content.Context context, android.graphics.Bitmap bitmap, fk2.s0 s0Var, jz5.l lVar, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var, bm2.h1 h1Var) {
        super(0);
        this.f344986d = context;
        this.f344987e = bitmap;
        this.f344988f = s0Var;
        this.f344989g = lVar;
        this.f344990h = f0Var;
        this.f344991i = h1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(this.f344986d.getResources(), this.f344987e);
        fk2.s0 s0Var = this.f344988f;
        bitmapDrawable.setBounds(0, 0, ((java.lang.Number) ((jz5.n) s0Var.f345003n).mo141623x754a37bb()).intValue(), ((java.lang.Number) ((jz5.n) s0Var.f345003n).mo141623x754a37bb()).intValue());
        al5.w wVar = new al5.w(bitmapDrawable, 1);
        jz5.l lVar = this.f344989g;
        int intValue = ((java.lang.Number) lVar.f384366d).intValue();
        int intValue2 = ((java.lang.Number) lVar.f384367e).intValue();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = this.f344990h;
        al5.w[] wVarArr = (al5.w[]) f0Var.getSpans(intValue, intValue2, al5.w.class);
        if (wVarArr != null) {
            for (al5.w wVar2 : wVarArr) {
                f0Var.removeSpan(wVar2);
            }
        }
        f0Var.c(wVar, intValue, intValue2, 33);
        bm2.h1 h1Var = this.f344991i;
        h1Var.f103460e.b(f0Var);
        h1Var.f103460e.invalidate();
        return jz5.f0.f384359a;
    }
}
