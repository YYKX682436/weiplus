package lp3;

/* loaded from: classes5.dex */
public class i implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lp3.l f401821d;

    public i(lp3.l lVar) {
        this.f401821d = lVar;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        r45.k55 e17;
        r45.l55 Ui;
        if (message.what == 291) {
            op3.c cVar = (op3.c) message.obj;
            android.util.Pair pair = cVar.f428791e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PatMsgExtension", "send pat msg, msgId:%d, createTime:%d scene:%d, talker:%s, patUser:%s", pair.first, pair.second, java.lang.Integer.valueOf(cVar.f428788b), cVar.f428789c, cVar.f428790d);
            int i17 = cVar.f428788b;
            android.util.Pair pair2 = cVar.f428791e;
            boolean z17 = cVar.f428792f;
            java.lang.String str = cVar.f428789c;
            lp3.l lVar = this.f401821d;
            lVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PatMsgExtension", "send pat, scene %d, msg (%d,%d)", java.lang.Integer.valueOf(i17), pair2.first, pair2.second);
            if (((lp3.r) i95.n0.c(lp3.r.class)).Di()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(str, ((java.lang.Long) pair2.first).longValue());
                if (Li.m124847x74d37ac6() == ((java.lang.Long) pair2.first).longValue() && (Ui = lVar.Ui((e17 = bm5.d1.e(Li.j())), ((java.lang.Long) pair2.second).longValue())) != null) {
                    if (lVar.wi(i17, e17.f459918d, Ui.f460686e)) {
                        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6857x603256ba c6857x603256ba = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6857x603256ba();
                        c6857x603256ba.f141750d = i17;
                        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(e17.f459918d)) {
                            c6857x603256ba.f141754h = c6857x603256ba.b("ChatroomName", e17.f459918d, true);
                        }
                        c6857x603256ba.f141756j = ((java.lang.Long) pair2.second).longValue() - ((lp3.l) ((mp3.j) i95.n0.c(mp3.j.class))).Ri(e17.f459918d, pair2);
                        c6857x603256ba.f141758l = lVar.hj(e17.f459918d, pair2) ? 1 : 0;
                        c6857x603256ba.f141759m = lVar.Vi(e17, ((java.lang.Long) pair2.second).longValue()) + 1;
                        c6857x603256ba.f141752f = c6857x603256ba.b("Username", Ui.f460685d, true);
                        c6857x603256ba.f141753g = c6857x603256ba.b("PattedUserName", Ui.f460686e, true);
                        c6857x603256ba.f141751e = Ui.f460688g;
                        c6857x603256ba.f141760n = c6857x603256ba.b("PatSuffix", lp3.p.a(Ui.f460686e), true);
                        c6857x603256ba.f141763q = z17 ? 1 : 0;
                        op3.b bVar = new op3.b(pair2, e17.f459918d, Ui.f460686e, 0);
                        bVar.f428786g = c6857x603256ba;
                        gm0.j1.d().g(bVar);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PatMsgExtension", "cannot pat, scene %d, talker %s, patUser %s", java.lang.Integer.valueOf(i17), e17.f459918d, Ui.f460686e);
                    }
                }
            }
        }
        return false;
    }
}
