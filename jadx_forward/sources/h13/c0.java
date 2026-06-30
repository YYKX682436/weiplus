package h13;

@j95.b
/* loaded from: classes8.dex */
public final class c0 extends i95.w implements i50.q {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f359650d = "ForceNotifyReport";

    public void Ai(java.lang.String str, java.lang.String sessionId, int i17, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        try {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            int i18 = 0;
            java.lang.String t17 = r26.i0.t(str, "@wxcontact", "", false);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 q57 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5(t17);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[6];
            objArr[0] = t17;
            objArr[1] = java.lang.Integer.valueOf(i17);
            objArr[2] = java.lang.Long.valueOf(q57.mo78012x3fdd41df() / 1000);
            if (!q57.Z2() && !q57.O2()) {
                i18 = q57.A0() == 1 ? 1 : 2;
            }
            objArr[3] = java.lang.Integer.valueOf(i18);
            objArr[4] = sessionId;
            objArr[5] = java.lang.Long.valueOf(j17);
            g0Var.d(16505, objArr);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f359650d, "[_16505] " + e17);
        }
    }

    public void Bi(java.lang.String str, int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16506, str, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
    }

    public void Di(java.lang.String str, int i17, int i18, java.lang.String forcePushId, boolean z17, java.lang.String str2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forcePushId, "forcePushId");
        int i19 = z17 ? 1 : !com.p314xaae8f345.mm.app.w.INSTANCE.f135422n ? 2 : 3;
        long c17 = c01.id.c() / 1000;
        java.lang.String str3 = str2 == null ? "" : str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f359650d, "report16507 toUsername=" + str + ", noticeState=" + i17 + ", receiveTime=" + c17 + ", msgType=" + i18 + ", forcePushId=" + forcePushId + ", receiveState=" + i19 + ", chnlExtra=" + str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16507, str, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(c17), java.lang.Integer.valueOf(i18), forcePushId, java.lang.Integer.valueOf(i19), r26.i0.t(str3, ",", ";", false));
    }

    public void Ni(int i17, int i18, java.lang.String username, int i19, java.lang.String forcePushId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forcePushId, "forcePushId");
        long c17 = c01.id.c() / 1000;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f359650d, "report22430 actionTimeMs=" + c17 + " actType=" + i17 + " msgType=" + i18 + " username=" + username + " msgCount=" + i19 + " forcePushId=" + forcePushId);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(22430, java.lang.Long.valueOf(c17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), username, java.lang.Integer.valueOf(i19), forcePushId);
    }

    public void wi(java.lang.String str, int i17, long j17) {
        i13.j jVar = new i13.j();
        jVar.f66499xaeadb4bb = str;
        if (j13.a.f378710d.get(jVar, new java.lang.String[0])) {
            Ai(str, (jVar.f66495x81959a6e / 1000) + jVar.f66503x11b86abb, i17, j17);
        }
    }
}
