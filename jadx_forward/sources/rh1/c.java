package rh1;

/* loaded from: classes7.dex */
public class c extends jk3.v {

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f477160x;

    public c(ak3.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        super(cVar);
        this.f477160x = o6Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMultiTaskHelper", "create, runtime:%s", java.lang.Integer.valueOf(o6Var.hashCode()));
    }

    @Override // jk3.b
    public void B(boolean z17) {
        j();
        super.B(z17);
    }

    @Override // jk3.b
    public boolean F(int i17) {
        return i17 != 3;
    }

    @Override // jk3.v
    public boolean U(int i17, boolean z17) {
        j();
        return super.U(i17, z17);
    }

    @Override // jk3.b, jk3.e
    public boolean c(int i17) {
        return i17 != 3;
    }

    @Override // jk3.b, jk3.e
    public void j() {
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07 = this.f477160x.u0();
            if (u07 != null) {
                this.f381610a.v0().set(5, u07.f158813f);
                this.f381610a.v0().set(0, u07.f158812e);
                if (this.f477160x.f156338p.f158814g == 1) {
                    this.f381610a.v0().set(8, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571574j9));
                } else if (this.f477160x.f156338p.f158814g == 2) {
                    this.f381610a.v0().set(8, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571573j8));
                } else {
                    this.f381610a.v0().set(8, null);
                }
                r45.n8 n8Var = new r45.n8();
                n8Var.set(0, u07.f158811d);
                n8Var.set(1, u07.f128811x);
                n8Var.set(2, java.lang.Integer.valueOf(u07.f158814g));
                n8Var.set(3, java.lang.Integer.valueOf(u07.f128817z));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMultiTaskHelper", "fillMultiTaskInfo username:%s,appid:%s,versionType:%d", n8Var.m75945x2fec8307(1), n8Var.m75945x2fec8307(0), java.lang.Integer.valueOf(n8Var.m75939xb282bd08(2)));
                this.f381610a.f66790x225a93cf = n8Var.mo14344x5f01b1f6();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandMultiTaskHelper", "onMenuMultiTaskSelected error, ex = " + e17.getMessage());
        }
    }

    @Override // jk3.b
    public boolean v() {
        return false;
    }

    @Override // jk3.b
    public boolean x() {
        return ((rh1.e) this.f381644d).g();
    }

    @Override // jk3.v, jk3.b
    public void y(int i17, java.lang.String str) {
        super.y(i17, str);
    }
}
