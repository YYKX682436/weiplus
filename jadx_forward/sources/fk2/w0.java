package fk2;

/* loaded from: classes3.dex */
public final class w0 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bm2.h1 f345036a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345037b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fk2.x0 f345038c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f345039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f345040e;

    public w0(bm2.h1 h1Var, java.lang.String str, fk2.x0 x0Var, android.content.Context context, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var) {
        this.f345036a = h1Var;
        this.f345037b = str;
        this.f345038c = x0Var;
        this.f345039d = context;
        this.f345040e = f0Var;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        bm2.h1 h1Var = this.f345036a;
        java.lang.Object tag = h1Var.f3639x46306858.getTag();
        java.lang.String str = this.f345037b;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag, str);
        fk2.x0 x0Var = this.f345038c;
        if (b17) {
            if (bitmap != null) {
                pm0.v.X(new fk2.v0(this.f345039d, bitmap, x0Var, this.f345040e, this.f345036a));
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x0Var.f345044m, "CommentItemGiftWall resource is null!");
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x0Var.f345044m, "onBind tag:" + h1Var.f3639x46306858.getTag() + ", old tag:" + str);
    }
}
