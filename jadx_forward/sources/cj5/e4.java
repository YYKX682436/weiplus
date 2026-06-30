package cj5;

/* loaded from: classes.dex */
public final class e4 implements in5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.k4 f123645d;

    public e4(cj5.k4 k4Var) {
        this.f123645d = k4Var;
    }

    @Override // in5.u
    public void g(android.view.View itemView, in5.c cVar, int i17) {
        cj5.k4 k4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6;
        j75.f m67437x4bd5310;
        java.util.HashMap hashMap;
        ri5.j data = (ri5.j) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onItemClick: isAlwaysCheck=");
        sb6.append(data.f477658v);
        sb6.append(", isAlwaysExcludeToCheck=");
        sb6.append(data.f477648l1);
        sb6.append(", type=");
        int i18 = data.f477643e;
        sb6.append(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactSearchMvvmListUIC", sb6.toString());
        if (data.f477658v || data.f477648l1 || (P6 = (k4Var = this.f123645d).P6()) == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) {
            return;
        }
        if (i18 == ri5.j.M) {
            m67437x4bd5310.B3(new wi5.g(data));
            return;
        }
        int i19 = ri5.j.L;
        java.lang.String str = data.f477644f;
        if (i18 == i19) {
            m67437x4bd5310.B3(new wi5.j(str, false, 6L, 2, null));
            m67437x4bd5310.B3(new wi5.i(str, i17));
            return;
        }
        if (i18 == ri5.j.V) {
            m67437x4bd5310.B3(new wi5.f());
            return;
        }
        if (i18 == ri5.j.X) {
            m67437x4bd5310.B3(new wi5.x(data, k4Var.f123701h));
        } else {
            if ((((wi5.n0) m67437x4bd5310.mo140437x75286adb()).f527847g & 2097152) > 0) {
                m67437x4bd5310.B3(new wi5.e0(str, data));
            } else if (((wi5.n0) m67437x4bd5310.mo140437x75286adb()).e()) {
                m67437x4bd5310.B3(new wi5.t0(data, i17, 5));
            } else {
                wi5.n0 n0Var = (wi5.n0) m67437x4bd5310.mo140437x75286adb();
                if (n0Var != null && (hashMap = n0Var.E) != null) {
                    wi5.l0 l0Var = new wi5.l0();
                    l0Var.f527838a = 5;
                }
                m67437x4bd5310.B3(new wi5.c0(kz5.b0.c(str), -1));
            }
        }
        m67437x4bd5310.B3(new wi5.a0(str, data));
    }
}
