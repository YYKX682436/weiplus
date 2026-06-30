package sd5;

/* loaded from: classes9.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd5.b f488229d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f488230e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(sd5.b bVar, java.util.List list) {
        super(0);
        this.f488229d = bVar;
        this.f488230e = list;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.List h17;
        sd5.b bVar = this.f488229d;
        int ordinal = bVar.f488232b.ordinal();
        qd5.d dVar = qd5.d.f443438a;
        sd5.o oVar = bVar.f488231a;
        java.util.List list = this.f488230e;
        if (ordinal != 0) {
            if (ordinal != 1) {
                java.lang.String talker = bVar.f488235e;
                if (ordinal == 2) {
                    int max = java.lang.Math.max(0, ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().F2(bVar.f488235e, oVar.e(), ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().p5(talker)) - 1);
                    boolean z17 = max <= 48;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingNormalDataPresenterV2", "ACTION_UPDATE bottomIncCount:%d, shouldLoadBottom:%b", java.lang.Integer.valueOf(max), java.lang.Boolean.valueOf(z17));
                    if (z17) {
                        list.addAll(oVar.l());
                    } else {
                        list.addAll(oVar.m());
                    }
                } else if (ordinal != 3) {
                    if (ordinal == 4) {
                        android.os.Bundle bundle = bVar.f488233c;
                        if (bundle == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingNormalDataPresenterV2", "null == sourceArgs!");
                        } else {
                            boolean z18 = bundle.getBoolean("SELECT_BY_MSG_ID", false);
                            hd5.q qVar = bVar.f488234d;
                            if (z18) {
                                long j17 = bundle.getLong("MSG_ID");
                                java.util.List i17 = bVar.f488231a.i(bundle.getString("MSG_TALKER"), j17, bundle.getBoolean("IS_LOAD_ALL", false), bundle.getBoolean("CLEAR_OLD", false));
                                if (qVar != null) {
                                    qVar.f362169h = j17;
                                }
                                list.addAll(i17);
                            } else if (bundle.getInt("SCENE", 0) == 1) {
                                long j18 = bundle.getLong("MSG_ID");
                                java.util.List i18 = bVar.f488231a.i(bundle.getString("MSG_TALKER"), j18, bundle.getBoolean("IS_LOAD_ALL", false), false);
                                if (qVar != null) {
                                    java.util.Iterator it = i18.iterator();
                                    int i19 = 0;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            i19 = -1;
                                            break;
                                        }
                                        if (((com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next()).m124847x74d37ac6() == j18) {
                                            break;
                                        }
                                        i19++;
                                    }
                                    qVar.f362168g = i19;
                                }
                                list.addAll(i18);
                            } else if (bundle.getInt("SCENE", 0) == 2) {
                                boolean z19 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.p2519x9a3d88b9.C20083x1a8badf6()) == 1;
                                int i27 = bundle.getInt("MSG_POSITION");
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingNormalDataPresenterV2", "handlePositionForTongue[" + z19 + ']');
                                if (z19) {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(talker, "talker");
                                    oVar.getClass();
                                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 a17 = sd5.i.f488252a.a(talker, i27, oVar.c());
                                    if (a17 == null) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingNormalDataPresenterV2", "handlePositionForTongue[" + z19 + "] but load all");
                                        h17 = oVar.h(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().j7(talker) - i27);
                                    } else {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingNormalDataPresenterV2", "handlePositionForTongue[" + z19 + "] load one page");
                                        h17 = bVar.f488231a.i(a17.Q0(), a17.m124847x74d37ac6(), false, false);
                                    }
                                } else {
                                    int j76 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().j7(talker) - i27;
                                    oVar.f488255c.getClass();
                                    h17 = oVar.h(java.lang.Math.max(j76, 16));
                                }
                                list.addAll(h17);
                            }
                            if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.p2522x740fd51b.C20095x98db9225()) == 1) {
                                list.clear();
                                dVar.b(oVar);
                                dVar.c(oVar);
                                list.addAll(oVar.f488256d);
                            }
                        }
                    } else if (ordinal == 7) {
                        if (oVar.f()) {
                            list.addAll(oVar.f488256d);
                        } else if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20544xcfdbf979()) == 1) {
                            list.addAll(dVar.d(oVar));
                        } else {
                            list.addAll(oVar.g());
                        }
                    }
                } else if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20544xcfdbf979()) == 1) {
                    list.addAll(dVar.d(oVar));
                } else {
                    list.addAll(oVar.g());
                }
            } else {
                list.addAll(oVar.j());
            }
        } else if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20544xcfdbf979()) == 1) {
            list.addAll(dVar.e(oVar));
        } else {
            list.addAll(oVar.k());
        }
        return jz5.f0.f384359a;
    }
}
