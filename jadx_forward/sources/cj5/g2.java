package cj5;

/* loaded from: classes.dex */
public final class g2 implements in5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.l2 f123658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f123659e;

    public g2(cj5.l2 l2Var, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        this.f123658d = l2Var;
        this.f123659e = activityC0065xcd7aa112;
    }

    @Override // in5.u
    public void g(android.view.View itemView, in5.c cVar, int i17) {
        cj5.l2 l2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6;
        j75.f m67437x4bd5310;
        ri5.j data = (ri5.j) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (data.f477658v || data.f477648l1 || (P6 = (l2Var = this.f123658d).P6()) == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onItemClickListener data.type=");
        int i18 = data.f477643e;
        sb6.append(i18);
        sb6.append(" position=");
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactMainRecycleViewUIC", sb6.toString());
        if (i18 == ri5.j.f477638J) {
            m67437x4bd5310.B3(new wi5.l(data, i17));
            return;
        }
        boolean contains = ri5.j.f477641y0.contains(java.lang.Integer.valueOf(i18));
        java.lang.String str = data.f477644f;
        if (contains) {
            if (i18 == ri5.j.K || i18 == ri5.j.N) {
                m67437x4bd5310.B3(new wi5.h(data));
                return;
            }
            if (i18 == ri5.j.L) {
                m67437x4bd5310.B3(new wi5.j(str, false, 5L, 2, null));
                m67437x4bd5310.B3(new wi5.i(str, i17));
                return;
            } else {
                if (i18 == ri5.j.M) {
                    m67437x4bd5310.B3(new wi5.g(data));
                    return;
                }
                return;
            }
        }
        if (i18 == ri5.j.P) {
            m67437x4bd5310.B3(new wi5.c0(kz5.b0.c(str), -1));
            return;
        }
        if (!((java.util.HashSet) c01.e2.f118650a).contains(str)) {
            if ((((wi5.n0) m67437x4bd5310.mo140437x75286adb()).f527847g & 2097152) > 0) {
                m67437x4bd5310.B3(new wi5.e0(str, data));
                return;
            }
            if (((wi5.n0) m67437x4bd5310.mo140437x75286adb()).e()) {
                m67437x4bd5310.B3(new wi5.t0(data, i17, 1));
                return;
            } else if (i18 == ri5.j.R) {
                m67437x4bd5310.B3(new wi5.s0(str, -1));
                return;
            } else {
                m67437x4bd5310.B3(new wi5.c0(kz5.b0.c(str), -1));
                return;
            }
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "conversationboxservice");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f123659e;
        if (b17) {
            rd0.e1 e1Var = (rd0.e1) i95.n0.c(rd0.e1.class);
            java.lang.String string = activityC0065xcd7aa112.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572552bl5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            android.content.Intent Bi = ((qd0.q0) e1Var).Bi(activityC0065xcd7aa112, string, ((wi5.n0) m67437x4bd5310.mo140437x75286adb()).e(), ((wi5.n0) m67437x4bd5310.mo140437x75286adb()).f527852o);
            cj5.l2.U6(l2Var, Bi);
            activityC0065xcd7aa112.startActivityForResult(Bi, 2306836);
            return;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "opencustomerservicemsg")) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "message_fold")) {
                l2Var.Z6();
            }
        } else {
            rd0.e1 e1Var2 = (rd0.e1) i95.n0.c(rd0.e1.class);
            java.lang.String string2 = activityC0065xcd7aa112.getString(com.p314xaae8f345.mm.R.C30867xcad56011.her);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            android.content.Intent Di = ((qd0.q0) e1Var2).Di(activityC0065xcd7aa112, string2, ((wi5.n0) m67437x4bd5310.mo140437x75286adb()).e(), ((wi5.n0) m67437x4bd5310.mo140437x75286adb()).f527852o);
            cj5.l2.U6(l2Var, Di);
            activityC0065xcd7aa112.startActivityForResult(Di, 2306837);
        }
    }
}
