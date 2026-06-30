package ho1;

/* loaded from: classes5.dex */
public final class t0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.a1 f364347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f364348e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f364349f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f364350g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(ho1.a1 a1Var, long j17, int i17, android.content.Context context) {
        super(1);
        this.f364347d = a1Var;
        this.f364348e = j17;
        this.f364349f = i17;
        this.f364350g = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.content.Context viewContext = (android.content.Context) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewContext, "viewContext");
        java.lang.String str = this.f364347d.f364155a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Enter RoamBackupActivity from force notify. pkgId=");
        long j17 = this.f364348e;
        sb6.append(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (this.f364349f == 0) {
            mv.y yVar = (mv.y) i95.n0.c(mv.y.class);
            android.content.Context context = this.f364350g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1) yVar).aj(context, null, mv.b0.f413010e);
        } else {
            mv.b0 b0Var = mv.b0.f413010e;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1) ((mv.y) i95.n0.c(mv.y.class))).Zi(viewContext, kz5.c1.j(new jz5.l("home", null), new jz5.l("edit_package", kz5.c1.l(new jz5.l("packageId", java.lang.Long.valueOf(j17))))));
        }
        return jz5.f0.f384359a;
    }
}
