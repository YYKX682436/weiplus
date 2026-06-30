package com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec;

/* loaded from: classes3.dex */
public final class s3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f148443a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148444b;

    public s3(p3325xe03a0797.p3326xc267989b.q qVar, com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4 v4Var, java.lang.String str) {
        this.f148443a = qVar;
        this.f148444b = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.Object obj2;
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        p3325xe03a0797.p3326xc267989b.q qVar = this.f148443a;
        if (i17 == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", "#getFullGameInfo client_local_cache=" + ((r45.hv1) fVar.f152151d).m75933x41a8a7f2(5));
            if (((r45.hv1) fVar.f152151d).m75933x41a8a7f2(5)) {
                if (((mm2.s1) dk2.ef.f314905a.i(mm2.s1.class)) != null) {
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_LAST_POST_MODE_STRING_SYNC, "");
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_LAST_POST_GAME_APPID_STRING_SYNC, "");
                }
                ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
            } else {
                java.util.LinkedList m75941xfb821914 = ((r45.hv1) fVar.f152151d).m75941xfb821914(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getGame_user_info_list(...)");
                java.util.Iterator it = m75941xfb821914.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    r45.n73 n73Var = (r45.n73) obj2;
                    r45.z53 z53Var = (r45.z53) n73Var.m75936x14adae67(1);
                    boolean z17 = false;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z53Var != null ? z53Var.m75945x2fec8307(0) : null)) {
                        r45.z53 z53Var2 = (r45.z53) n73Var.m75936x14adae67(1);
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(z53Var2 != null ? z53Var2.m75945x2fec8307(0) : null, this.f148444b)) {
                            z17 = true;
                        }
                    }
                    if (z17) {
                        break;
                    }
                }
                r45.n73 n73Var2 = (r45.n73) obj2;
                if (n73Var2 != null) {
                    ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(n73Var2));
                    f0Var = f0Var2;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
                }
            }
        } else {
            ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
        }
        return f0Var2;
    }
}
