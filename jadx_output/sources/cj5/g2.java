package cj5;

/* loaded from: classes.dex */
public final class g2 implements in5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.l2 f42125d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f42126e;

    public g2(cj5.l2 l2Var, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        this.f42125d = l2Var;
        this.f42126e = appCompatActivity;
    }

    @Override // in5.u
    public void g(android.view.View itemView, in5.c cVar, int i17) {
        cj5.l2 l2Var;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6;
        j75.f stateCenter;
        ri5.j data = (ri5.j) cVar;
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(data, "data");
        if (data.f396125v || data.f396115l1 || (P6 = (l2Var = this.f42125d).P6()) == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onItemClickListener data.type=");
        int i18 = data.f396110e;
        sb6.append(i18);
        sb6.append(" position=");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactMainRecycleViewUIC", sb6.toString());
        if (i18 == ri5.j.f396105J) {
            stateCenter.B3(new wi5.l(data, i17));
            return;
        }
        boolean contains = ri5.j.f396108y0.contains(java.lang.Integer.valueOf(i18));
        java.lang.String str = data.f396111f;
        if (contains) {
            if (i18 == ri5.j.K || i18 == ri5.j.N) {
                stateCenter.B3(new wi5.h(data));
                return;
            }
            if (i18 == ri5.j.L) {
                stateCenter.B3(new wi5.j(str, false, 5L, 2, null));
                stateCenter.B3(new wi5.i(str, i17));
                return;
            } else {
                if (i18 == ri5.j.M) {
                    stateCenter.B3(new wi5.g(data));
                    return;
                }
                return;
            }
        }
        if (i18 == ri5.j.P) {
            stateCenter.B3(new wi5.c0(kz5.b0.c(str), -1));
            return;
        }
        if (!((java.util.HashSet) c01.e2.f37117a).contains(str)) {
            if ((((wi5.n0) stateCenter.getState()).f446314g & 2097152) > 0) {
                stateCenter.B3(new wi5.e0(str, data));
                return;
            }
            if (((wi5.n0) stateCenter.getState()).e()) {
                stateCenter.B3(new wi5.t0(data, i17, 1));
                return;
            } else if (i18 == ri5.j.R) {
                stateCenter.B3(new wi5.s0(str, -1));
                return;
            } else {
                stateCenter.B3(new wi5.c0(kz5.b0.c(str), -1));
                return;
            }
        }
        boolean b17 = kotlin.jvm.internal.o.b(str, "conversationboxservice");
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f42126e;
        if (b17) {
            rd0.e1 e1Var = (rd0.e1) i95.n0.c(rd0.e1.class);
            java.lang.String string = appCompatActivity.getString(com.tencent.mm.R.string.f491019bl5);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            android.content.Intent Bi = ((qd0.q0) e1Var).Bi(appCompatActivity, string, ((wi5.n0) stateCenter.getState()).e(), ((wi5.n0) stateCenter.getState()).f446319o);
            cj5.l2.U6(l2Var, Bi);
            appCompatActivity.startActivityForResult(Bi, 2306836);
            return;
        }
        if (!kotlin.jvm.internal.o.b(str, "opencustomerservicemsg")) {
            if (kotlin.jvm.internal.o.b(str, "message_fold")) {
                l2Var.Z6();
            }
        } else {
            rd0.e1 e1Var2 = (rd0.e1) i95.n0.c(rd0.e1.class);
            java.lang.String string2 = appCompatActivity.getString(com.tencent.mm.R.string.her);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            android.content.Intent Di = ((qd0.q0) e1Var2).Di(appCompatActivity, string2, ((wi5.n0) stateCenter.getState()).e(), ((wi5.n0) stateCenter.getState()).f446319o);
            cj5.l2.U6(l2Var, Di);
            appCompatActivity.startActivityForResult(Di, 2306837);
        }
    }
}
