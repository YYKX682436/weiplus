package ww1;

/* loaded from: classes9.dex */
public final class d2 extends ct1.c implements ct1.x {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f531704h = "PayBypMsgSyncHandler";

    public static final boolean q(ww1.d2 d2Var) {
        d2Var.getClass();
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_revert_byp_notify, false)) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d2Var.f531704h, "revertBypNotify");
        return false;
    }

    @Override // ct1.c
    public int h() {
        return 11;
    }

    @Override // ct1.c
    public int i() {
        return 11;
    }

    @Override // ct1.c
    public vg3.z4 k() {
        return new ww1.c2(this);
    }

    @Override // ct1.c
    public java.lang.String n(r45.w3 rawBypMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rawBypMsg, "rawBypMsg");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5221x93792074 c5221x93792074 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5221x93792074();
        am.l1 l1Var = c5221x93792074.f135554g;
        l1Var.f88741a = 1;
        l1Var.f88744d = 2;
        r45.j4 j4Var = rawBypMsg.f470359d;
        l1Var.f88743c = j4Var.f459101r;
        l1Var.f88747g = x51.j1.g(j4Var != null ? j4Var.f459094h : null);
        r45.j4 j4Var2 = rawBypMsg.f470359d;
        java.lang.String str = "";
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x51.j1.g(j4Var2 != null ? j4Var2.f459094h : null)) ? "1|" : "";
        r45.j4 j4Var3 = rawBypMsg.f470359d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x51.j1.g(j4Var3 != null ? j4Var3.f459091e : null))) {
            str2 = str2 + "2|";
        }
        r45.j4 j4Var4 = rawBypMsg.f470359d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x51.j1.g(j4Var4 != null ? j4Var4.f459092f : null))) {
            str2 = str2 + '3';
        }
        l1Var.f88742b = str2;
        c5221x93792074.e();
        r45.j4 j4Var5 = rawBypMsg.f470359d;
        java.lang.String str3 = j4Var5 != null ? j4Var5.f459099p : null;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3);
        java.lang.String str4 = this.f531704h;
        if (K0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "origin msgsource is null");
            str = "<msgsource><byp_sessionId>" + rawBypMsg + ".msg_session_id</byp_sessionId></msgsource>";
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "origin msgsource is " + str3);
            if (str3 != null) {
                str = r26.i0.t(str3, "</msgsource>", "<byp_sessionId>" + rawBypMsg + ".msg_session_id</byp_sessionId></msgsource>", false);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "target msgsource is " + str);
        return str;
    }
}
