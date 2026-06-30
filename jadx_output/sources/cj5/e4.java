package cj5;

/* loaded from: classes.dex */
public final class e4 implements in5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.k4 f42112d;

    public e4(cj5.k4 k4Var) {
        this.f42112d = k4Var;
    }

    @Override // in5.u
    public void g(android.view.View itemView, in5.c cVar, int i17) {
        cj5.k4 k4Var;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6;
        j75.f stateCenter;
        java.util.HashMap hashMap;
        ri5.j data = (ri5.j) cVar;
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onItemClick: isAlwaysCheck=");
        sb6.append(data.f396125v);
        sb6.append(", isAlwaysExcludeToCheck=");
        sb6.append(data.f396115l1);
        sb6.append(", type=");
        int i18 = data.f396110e;
        sb6.append(i18);
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactSearchMvvmListUIC", sb6.toString());
        if (data.f396125v || data.f396115l1 || (P6 = (k4Var = this.f42112d).P6()) == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        if (i18 == ri5.j.M) {
            stateCenter.B3(new wi5.g(data));
            return;
        }
        int i19 = ri5.j.L;
        java.lang.String str = data.f396111f;
        if (i18 == i19) {
            stateCenter.B3(new wi5.j(str, false, 6L, 2, null));
            stateCenter.B3(new wi5.i(str, i17));
            return;
        }
        if (i18 == ri5.j.V) {
            stateCenter.B3(new wi5.f());
            return;
        }
        if (i18 == ri5.j.X) {
            stateCenter.B3(new wi5.x(data, k4Var.f42168h));
        } else {
            if ((((wi5.n0) stateCenter.getState()).f446314g & 2097152) > 0) {
                stateCenter.B3(new wi5.e0(str, data));
            } else if (((wi5.n0) stateCenter.getState()).e()) {
                stateCenter.B3(new wi5.t0(data, i17, 5));
            } else {
                wi5.n0 n0Var = (wi5.n0) stateCenter.getState();
                if (n0Var != null && (hashMap = n0Var.E) != null) {
                    wi5.l0 l0Var = new wi5.l0();
                    l0Var.f446305a = 5;
                }
                stateCenter.B3(new wi5.c0(kz5.b0.c(str), -1));
            }
        }
        stateCenter.B3(new wi5.a0(str, data));
    }
}
