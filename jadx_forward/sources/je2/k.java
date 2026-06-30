package je2;

/* loaded from: classes3.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.vq1 f380773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ je2.n f380774e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r45.vq1 vq1Var, je2.n nVar) {
        super(0);
        this.f380773d = vq1Var;
        this.f380774e = nVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object obj;
        r45.vq1 vq1Var = this.f380773d;
        java.lang.String m75945x2fec8307 = vq1Var.m75945x2fec8307(0);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) vq1Var.m75936x14adae67(1);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) vq1Var.m75936x14adae67(1);
        jz5.f0 f0Var = null;
        java.lang.String m76489xefafd82 = c19786x6a1e28622 != null ? c19786x6a1e28622.m76489xefafd82() : null;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        je2.n nVar = this.f380774e;
        if (m75945x2fec8307 != null && c19786x6a1e2862 != null && m76489xefafd82 != null) {
            r45.wq1 O6 = nVar.O6(m76489xefafd82);
            java.lang.String str = nVar.f380778f;
            if (O6 != null) {
                java.util.Iterator it = nVar.Q6().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((je2.j) obj).f380770a, m75945x2fec8307)) {
                        break;
                    }
                }
                je2.j jVar = (je2.j) obj;
                p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var = nVar.f380783n;
                if (jVar != null) {
                    if (O6.m75942xfb822ef2(2) > jVar.f380771b.m75942xfb822ef2(2)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "FinderLiveGameDataBannerData update game data:" + jVar + " to version:" + O6.m75942xfb822ef2(2) + '!');
                        jVar.f380771b = O6;
                        jVar.f380772c = c19786x6a1e2862;
                        if (jVar.a()) {
                            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) i2Var).e(java.lang.Boolean.TRUE);
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "FinderLiveGameDataBannerData addGameDataBanner fail, old game data:" + jVar + " \n new game version:" + O6.m75942xfb822ef2(2) + '!');
                    }
                    f0Var = f0Var2;
                }
                if (f0Var == null) {
                    je2.j jVar2 = new je2.j(m75945x2fec8307, O6, c19786x6a1e2862);
                    nVar.Q6().add(jVar2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "FinderLiveGameDataBannerData add game data " + jVar2 + '!');
                    if (jVar2.a()) {
                        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) i2Var).e(java.lang.Boolean.TRUE);
                    }
                }
                f0Var = f0Var2;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "FinderLiveGameDataBannerData add game data fail,remote ext_info:" + m76489xefafd82 + " can't convert!");
            }
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(nVar.f380778f, "FinderLiveGameDataBannerData addGameData fail,id:" + vq1Var.m75945x2fec8307(0));
        }
        return f0Var2;
    }
}
