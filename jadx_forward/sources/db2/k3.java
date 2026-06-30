package db2;

/* loaded from: classes2.dex */
public final class k3 implements db2.e3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f309572a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ db2.n3 f309573b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f309574c;

    public k3(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, db2.n3 n3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f309572a = c0Var;
        this.f309573b = n3Var;
        this.f309574c = interfaceC29045xdcb5ca57;
    }

    public void a(int i17, int i18, java.lang.String str, r45.ny3 ny3Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f309572a;
        if (c0Var.f391645d) {
            return;
        }
        db2.n3 n3Var = this.f309573b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(n3Var.A, "runTask: onConcurrentError tabType = " + n3Var.f309612d + ", pullType = " + n3Var.f309613e);
        db2.c3 c3Var = new db2.c3();
        c3Var.f309456n = 3;
        this.f309574c.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(c3Var));
        c0Var.f391645d = true;
    }
}
