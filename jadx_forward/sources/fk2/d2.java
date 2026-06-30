package fk2;

/* loaded from: classes3.dex */
public final class d2 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bm2.h1 f344878a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f344879b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f344880c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk2.f2 f344881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f344882e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f344883f;

    public d2(bm2.h1 h1Var, dk2.zf zfVar, android.content.Context context, fk2.f2 f2Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var, int i17) {
        this.f344878a = h1Var;
        this.f344879b = zfVar;
        this.f344880c = context;
        this.f344881d = f2Var;
        this.f344882e = f0Var;
        this.f344883f = i17;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        bm2.h1 h1Var = this.f344878a;
        java.lang.Object tag = h1Var.f3639x46306858.getTag();
        dk2.zf zfVar = this.f344879b;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag, java.lang.Long.valueOf(zfVar.m()))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CommentItemNotify", "onBindNotifyMsg tag:" + h1Var.f3639x46306858.getTag() + ", seq:" + zfVar.m());
            return;
        }
        if (bitmap != null) {
            pm0.v.X(new fk2.c2(this.f344880c, bitmap, this.f344881d, this.f344882e, this.f344883f, this.f344878a));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CommentItemNotify", "onBindNotifyMsg " + zfVar.m() + " resource is null!");
    }
}
