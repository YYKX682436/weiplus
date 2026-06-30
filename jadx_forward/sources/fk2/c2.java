package fk2;

/* loaded from: classes3.dex */
public final class c2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f344866d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f344867e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fk2.f2 f344868f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f344869g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f344870h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ bm2.h1 f344871i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(android.content.Context context, android.graphics.Bitmap bitmap, fk2.f2 f2Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var, int i17, bm2.h1 h1Var) {
        super(0);
        this.f344866d = context;
        this.f344867e = bitmap;
        this.f344868f = f2Var;
        this.f344869g = f0Var;
        this.f344870h = i17;
        this.f344871i = h1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(this.f344866d.getResources(), this.f344867e);
        fk2.f2 f2Var = this.f344868f;
        bitmapDrawable.setBounds(0, 0, ((java.lang.Number) ((jz5.n) f2Var.f344915n).mo141623x754a37bb()).intValue(), ((java.lang.Number) ((jz5.n) f2Var.f344915n).mo141623x754a37bb()).intValue());
        al5.w wVar = new al5.w(bitmapDrawable, 1);
        int i17 = this.f344870h;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = this.f344869g;
        f0Var.c(wVar, i17, i17 + 1, 33);
        bm2.h1 h1Var = this.f344871i;
        h1Var.f103460e.b(f0Var);
        h1Var.f103460e.invalidate();
        return jz5.f0.f384359a;
    }
}
