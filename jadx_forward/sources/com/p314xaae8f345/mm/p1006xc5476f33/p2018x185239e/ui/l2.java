package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public final class l2 {
    public l2(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("remittance_recv_account_choose_setting");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M, "getMMKV(...)");
        return M;
    }

    public final int b(int i17, java.lang.String str) {
        java.lang.String str2;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str2 = java.lang.String.valueOf(i17);
        } else {
            str2 = i17 + '_' + str;
        }
        int i18 = a().getInt(str2, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "getRemittanceRecvAccountChooseSetting: " + i18 + " key: " + str2);
        return i18;
    }

    public final int c() {
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WX_PAY_REMITTANCE_RECV_ACCOUNT_LAST_CHOICE_INT_SYNC, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Int");
        return ((java.lang.Integer) m17).intValue();
    }

    public final java.lang.String d() {
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WX_PAY_REMITTANCE_RECV_ACCOUNT_LAST_CHOICE_BIND_SERIAL_STRING_SYNC, "");
        java.lang.String str = m17 instanceof java.lang.String ? (java.lang.String) m17 : null;
        return str == null ? "" : str;
    }

    public final void e(int i17, int i18, java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(27731, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), 0, 0, "");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(27731, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), 0, 0, str);
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.a f(java.lang.String str, java.lang.String str2) {
        boolean z17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        boolean z18 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2);
        return (z17 || z18) ? z17 != z18 ? com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.a.f239153f : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, str2) ? com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.a.f239152e : com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.a.f239154g : com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.a.f239151d;
    }
}
