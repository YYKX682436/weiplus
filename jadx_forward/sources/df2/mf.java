package df2;

/* loaded from: classes3.dex */
public final class mf implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.qf f312310d;

    public mf(df2.qf qfVar) {
        this.f312310d = qfVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        mm2.d2 trans = (mm2.d2) obj;
        df2.qf qfVar = this.f312310d;
        boolean U6 = qfVar.U6();
        boolean a86 = ((mm2.c1) qfVar.m56788xbba4bfc0(mm2.c1.class)).a8();
        java.lang.String str = qfVar.f312694m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "observeDanmakuTransChange landsscape:" + U6 + ", liveStart:" + a86 + ", trans:" + trans + '!');
        if (U6 && a86) {
            mm2.y1 P6 = ((mm2.j2) qfVar.m56788xbba4bfc0(mm2.j2.class)).P6();
            if (trans == (P6 != null ? P6.f411087c.f411133b : null)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "updateCommentConfig but newTrans:" + trans + " same with old value");
            } else {
                mm2.y1 P62 = ((mm2.j2) qfVar.m56788xbba4bfc0(mm2.j2.class)).P6();
                if (P62 != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(trans, "trans");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveDanmakuSlice", "saveDanmakuMode trans:" + trans);
                    int ordinal = trans.ordinal();
                    if (ordinal == 0) {
                        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_DANMAKU_COMMENT_TRANS_INT_SYNC, 2);
                    } else if (ordinal != 1) {
                        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_DANMAKU_COMMENT_TRANS_INT_SYNC, 0);
                    } else {
                        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_DANMAKU_COMMENT_TRANS_INT_SYNC, 1);
                    }
                    mm2.z1 z1Var = P62.f411087c;
                    z1Var.getClass();
                    z1Var.f411133b = trans;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "update danmaku trans baseConfig:" + ((mm2.j2) qfVar.m56788xbba4bfc0(mm2.j2.class)).P6());
                mm2.y1 P63 = ((mm2.j2) qfVar.m56788xbba4bfc0(mm2.j2.class)).P6();
                if (P63 != null) {
                    df2.qf.c7(qfVar, P63, false, 2, null);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
