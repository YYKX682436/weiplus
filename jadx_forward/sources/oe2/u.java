package oe2;

/* loaded from: classes8.dex */
public final class u extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public u() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        java.lang.String str;
        rl2.v b17;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5501xff9ef911 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5501xff9ef911) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.ec ecVar = event.f135833g;
        if (ecVar != null && (str = ecVar.f88082b) != null) {
            oe2.x xVar = oe2.x.f426319a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveTipsBarDataEventReceiver", "tipsBarEventListener recv type:" + ecVar.f88081a + ", chatRoomId:" + str);
            int i17 = ecVar.f88081a;
            if (i17 == 1) {
                r45.g92 g92Var = ecVar.f88083c;
                if (g92Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveTipsBarDataEventReceiver", "tipsBarEventListener ADD_APPMSG finderShareObject null");
                } else {
                    oe2.x xVar2 = oe2.x.f426319a;
                    java.lang.String anchorWxUsername = ecVar.f88084d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(anchorWxUsername, "anchorWxUsername");
                    dm.s4 s4Var = new dm.s4();
                    s4Var.f68258x41d5e0c = pm0.v.Z(g92Var.m75945x2fec8307(0));
                    s4Var.f68257x7560f783 = str;
                    s4Var.f68261x9c2463f1 = c01.id.e();
                    s4Var.f68254x123da011 = anchorWxUsername;
                    s4Var.f68253xf5ec756 = g92Var.m75945x2fec8307(26);
                    s4Var.f68252x236be6ee = g92Var.m75945x2fec8307(25);
                    s4Var.f68256x6a75a8e5 = pm0.v.Z(g92Var.m75945x2fec8307(2));
                    s4Var.f68255xb362ffdf = g92Var.m75945x2fec8307(12);
                    s4Var.f68260x76e81a5a = g92Var.m75939xb282bd08(15);
                    if (s4Var.f68258x41d5e0c == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveTipsBarDataEventReceiver", "liveId invalid");
                        s4Var = null;
                    }
                    if (s4Var != null) {
                        oe2.x.a(xVar2, s4Var);
                    }
                }
            } else if (i17 == 2 && (b17 = oe2.x.b(oe2.x.f426319a)) != null) {
                int mo70514xb06685ab = b17.f478750d.mo70514xb06685ab("FinderLiveTipsBar", "hostRoomId= ? ", new java.lang.String[]{str});
                if (mo70514xb06685ab < 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderLiveTipsBarStorage", "deleteByHostRoomId failed, hostRoomId:" + str + ", result:" + mo70514xb06685ab);
                } else {
                    java.util.Vector vector = rl2.v.f478747g;
                    synchronized (vector) {
                        pm0.v.c0(vector, new rl2.o(str));
                    }
                    java.util.Iterator it = ((fs.e) ((fs.c) fs.g.f(ps5.f.class)).all()).iterator();
                    while (true) {
                        fs.f fVar = (fs.f) it;
                        if (!fVar.hasNext()) {
                            break;
                        }
                        fs.q qVar = (fs.q) fVar.next();
                        if (fs.g.d(fs.g.f347619c, qVar)) {
                            ((yj5.w) ((ps5.f) ((fs.n) qVar.get()))).b(str);
                        }
                    }
                    b17.J0(str);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveTipsBarStorage", "deleteByHostRoomId, hostRoomId:" + str + ", result:" + mo70514xb06685ab);
                }
            }
        }
        return false;
    }
}
