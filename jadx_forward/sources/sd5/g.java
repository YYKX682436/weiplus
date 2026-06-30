package sd5;

/* loaded from: classes9.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd5.h f488244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f488245e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(sd5.h hVar, java.util.List list) {
        super(0);
        this.f488244d = hVar;
        this.f488245e = list;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        sd5.h hVar = this.f488244d;
        int ordinal = hVar.f488248c.ordinal();
        qd5.d dVar = qd5.d.f443438a;
        sd5.o oVar = hVar.f488247b;
        java.util.List list = this.f488245e;
        if (ordinal != 0) {
            if (ordinal != 1) {
                java.lang.String str = hVar.f488251f;
                if (ordinal == 2) {
                    int max = java.lang.Math.max(0, ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().F2(hVar.f488251f, oVar.e(), ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().p5(str)) - 1);
                    boolean z17 = max <= 48;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingSearchDataPresenterV2", "ACTION_UPDATE bottomIncCount:%d, shouldLoadBottom:%b", java.lang.Integer.valueOf(max), java.lang.Boolean.valueOf(z17));
                    if (z17) {
                        list.addAll(oVar.l());
                    } else {
                        list.addAll(oVar.m());
                    }
                } else if (ordinal == 3 || ordinal == 4) {
                    android.os.Bundle bundle = hVar.f488249d;
                    if (bundle == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingSearchDataPresenterV2", "null == sourceArgs!");
                    } else {
                        long j17 = bundle.getLong("MSG_ID");
                        java.lang.String string = bundle.getString("MSG_TALKER");
                        java.util.List i17 = hVar.f488247b.i(string == null || string.length() == 0 ? str : string, j17, bundle.getBoolean("IS_LOAD_ALL", false), false);
                        java.util.Iterator it = i17.iterator();
                        int i18 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i18 = -1;
                                break;
                            }
                            if (((com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next()).m124847x74d37ac6() == j17) {
                                break;
                            }
                            i18++;
                        }
                        hd5.q qVar = hVar.f488250e;
                        if (qVar != null) {
                            qVar.f362169h = j17;
                        }
                        int m17 = hVar.f488246a.m();
                        if (qVar != null) {
                            if (i18 >= 0) {
                                m17 += i18;
                            }
                            qVar.f362168g = m17;
                        }
                        list.addAll(i17);
                        list.clear();
                        dVar.b(oVar);
                        dVar.c(oVar);
                        list.addAll(oVar.f488256d);
                    }
                } else if (ordinal == 7) {
                    if (oVar.f()) {
                        list.addAll(oVar.f488256d);
                    } else {
                        list.addAll(dVar.d(oVar));
                    }
                }
            } else {
                list.addAll(oVar.j());
            }
        } else {
            list.addAll(dVar.e(oVar));
        }
        return jz5.f0.f384359a;
    }
}
