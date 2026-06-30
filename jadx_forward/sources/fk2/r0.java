package fk2;

/* loaded from: classes3.dex */
public final class r0 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.di1 f344993a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bm2.h1 f344994b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fk2.s0 f344995c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f344996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jz5.l f344997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f344998f;

    public r0(r45.di1 di1Var, bm2.h1 h1Var, fk2.s0 s0Var, android.content.Context context, jz5.l lVar, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var) {
        this.f344993a = di1Var;
        this.f344994b = h1Var;
        this.f344995c = s0Var;
        this.f344996d = context;
        this.f344997e = lVar;
        this.f344998f = f0Var;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        r45.di1 di1Var = this.f344993a;
        sb6.append(di1Var.m75945x2fec8307(0));
        sb6.append('_');
        sb6.append(di1Var.m75945x2fec8307(1));
        sb6.append('_');
        sb6.append(di1Var.m75939xb282bd08(2));
        java.lang.String sb7 = sb6.toString();
        bm2.h1 h1Var = this.f344994b;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h1Var.f3639x46306858.getTag(), sb7);
        fk2.s0 s0Var = this.f344995c;
        if (b17) {
            if (bitmap != null) {
                pm0.v.X(new fk2.q0(this.f344996d, bitmap, s0Var, this.f344997e, this.f344998f, this.f344994b));
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(s0Var.f345002m, "CommentItemGiftFund resource is null!");
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(s0Var.f345002m, "onBind tag:" + h1Var.f3639x46306858.getTag() + ", old tag:" + sb7);
    }
}
