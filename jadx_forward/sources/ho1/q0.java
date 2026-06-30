package ho1;

/* loaded from: classes5.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.a1 f364318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f364319e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(ho1.a1 a1Var, long j17) {
        super(1);
        this.f364318d = a1Var;
        this.f364319e = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.content.Context viewContext = (android.content.Context) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewContext, "viewContext");
        java.lang.String str = this.f364318d.f364155a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Enter RoamBackupActivity from force notify. pkgId=");
        long j17 = this.f364319e;
        sb6.append(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        mv.b0 b0Var = mv.b0.f413010e;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1) ((mv.y) i95.n0.c(mv.y.class))).Zi(viewContext, kz5.c1.j(new jz5.l("home", null), new jz5.l("edit_package", kz5.c1.l(new jz5.l("packageId", java.lang.Long.valueOf(j17))))));
        return jz5.f0.f384359a;
    }
}
