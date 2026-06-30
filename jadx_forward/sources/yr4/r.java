package yr4;

/* loaded from: classes9.dex */
public class r extends yr4.t {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yr4.u f546642c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(yr4.u uVar, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e, np5.b0 b0Var) {
        super(uVar, abstractActivityC22902xe37969e, b0Var);
        this.f546642c = uVar;
    }

    @Override // np5.g
    public java.lang.CharSequence a(int i17) {
        return this.f420366a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kzs);
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var;
        java.lang.String str;
        at4.z0 z0Var = (at4.z0) objArr[0];
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05) this.f546642c.f295334c.getParcelable("key_orders");
        if (z0Var == null || c19099x8d444f05 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CgiManager", "empty verify or orders");
            m1Var = null;
        } else {
            com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = z0Var.f95568n;
            if (c19760x34448d56 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiManager", "get reqKey from payInfo");
                str = c19760x34448d56.f273647m;
            } else {
                str = "";
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiManager", "get reqKey from orders");
                str = c19099x8d444f05.f261208e;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiManager", "empty reqKey!");
                m1Var = new es4.j(z0Var, c19099x8d444f05);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiManager", "verifyreg reqKey: %s", str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiManager", "verifyreg go new split cgi");
                m1Var = str.startsWith("sns_aa_") ? new es4.a(z0Var, c19099x8d444f05) : str.startsWith("sns_tf_") ? new es4.h(z0Var, c19099x8d444f05) : str.startsWith("sns_ff_") ? new es4.c(z0Var, c19099x8d444f05) : str.startsWith("ts_") ? new es4.d(z0Var, c19099x8d444f05) : str.startsWith("sns_") ? new es4.f(z0Var, c19099x8d444f05) : str.startsWith("up_") ? new es4.i(z0Var, c19099x8d444f05) : str.startsWith("seb_ff_") ? new es4.e(z0Var, c19099x8d444f05) : str.startsWith("tax_") ? new es4.g(z0Var, c19099x8d444f05) : str.startsWith("dc_") ? new es4.b(z0Var, c19099x8d444f05) : new es4.j(z0Var, c19099x8d444f05);
            }
        }
        if (m1Var != null) {
            this.f420367b.d(m1Var, true);
        }
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (!(m1Var instanceof es4.j) || i17 != 0 || i18 != 0) {
            return false;
        }
        es4.j jVar = (es4.j) m1Var;
        boolean z17 = jVar.f39883x9cd69705;
        yr4.u uVar = this.f546642c;
        if (z17) {
            uVar.f295334c.putParcelable("key_orders", jVar.f337958x);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1 c19088xa4b300c1 = jVar.f295594s;
        if (c19088xa4b300c1 != null) {
            uVar.f295334c.putParcelable("key_realname_guide_helper", c19088xa4b300c1);
        }
        uVar.o(this.f420366a, 0, uVar.f295334c);
        return true;
    }
}
