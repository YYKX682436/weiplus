package el4;

/* loaded from: classes8.dex */
public final class b extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f335535d;

    public b() {
        super(0);
        this.f335535d = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2573x3652ee.C20777xe88bf40()) == 1;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        java.lang.Object m143895xf1229813;
        jm4.c2 c2Var;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5219x1606f522 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5219x1606f522) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.j1 j1Var = event.f135552g;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (j1Var.f88525a == 8) {
            boolean Vi = ((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Vi();
            if (Vi) {
                hm4.c cVar = (hm4.c) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).f478670h.mo141623x754a37bb();
                long j17 = j1Var.f88525a;
                byte[] bArr = j1Var.f88526b;
                if (!cVar.b()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingSyncExtension", "handleNotifySync no need do sync");
                } else if (bArr == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingSyncExtension", "syncOnNotify data is null");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingSyncExtension", "handleNotifySync doSync");
                    w71.m1 a17 = cVar.a();
                    if (a17 != null) {
                        p3380x6a61f93.p3386xf51b86f1.C30596x21b1ccf3.m170142x21b9bbb0(((w71.n1) a17).m105978x2737f10(), j17, bArr);
                    }
                }
            }
            r45.cg4 cg4Var = new r45.cg4();
            cg4Var.mo11468x92b714fd(j1Var.f88526b);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BypListenRedDotNotifyEventListener", "notify from bypListen dataSize = " + j1Var.f88526b.length + ", notifyType = " + cg4Var.f453074d);
            int i17 = cg4Var.f453074d;
            el4.a[] aVarArr = el4.a.f335534d;
            if (i17 == 1) {
                if (!Vi) {
                    if (this.f335535d) {
                        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = cg4Var.f453075e;
                        byte[] g17 = gVar != null ? gVar.g() : null;
                        if (g17 != null) {
                            if (!(g17.length == 0)) {
                                ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).getClass();
                                int i18 = jm4.f4.f381915d;
                                jm4.e4 e4Var = (jm4.e4) p3380x6a61f93.p3381xf512d0a5.C30511x21b9f352.m169477x21b0d463();
                                if (e4Var != null) {
                                    p3380x6a61f93.p3381xf512d0a5.C30511x21b9f352.m169484x21b9865c(((jm4.f4) e4Var).m105978x2737f10(), g17, 3);
                                }
                            }
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BypListenRedDotNotifyEventListener", "try requestSyncItem  syncBuffer is empty");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BypListenRedDotNotifyEventListener", "try requestSyncItem not enable fetch red dot");
                    }
                }
                return true;
            }
            if (i17 == 3 && (c2Var = (jm4.c2) ((jz5.n) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).f478668f).mo141623x754a37bb()) != null) {
                p3380x6a61f93.p3381xf512d0a5.C30485x21b88584.m169273x21b17dfc(((jm4.d2) c2Var).m105978x2737f10(), true, null);
            }
        }
        m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BypListenRedDotNotifyEventListener", m143898xd4a2fc34, "", new java.lang.Object[0]);
        }
        return true;
    }
}
