package sf2;

/* loaded from: classes10.dex */
public final class k implements ek2.g1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f488715a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sf2.x f488716b;

    public k(p3325xe03a0797.p3326xc267989b.q qVar, sf2.x xVar) {
        this.f488715a = qVar;
        this.f488716b = xVar;
    }

    @Override // ek2.g1
    public void a(int i17, int i18, java.lang.String str, r45.tt1 resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        p3325xe03a0797.p3326xc267989b.q qVar = this.f488715a;
        if (!((p3325xe03a0797.p3326xc267989b.r) qVar).n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicSingSongController", "continuation is not active, skip new song list cgi result");
            return;
        }
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0 && i18 == 0) {
            sf2.x xVar = this.f488716b;
            ((mm2.m6) xVar.m56788xbba4bfc0(mm2.m6.class)).f410782q.a(resp);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicSingSongController", "new song list cgi callback with list count: " + ((mm2.m6) xVar.m56788xbba4bfc0(mm2.m6.class)).f410782q.f315618a.size());
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveAnchorMusicSingSongController", "getNewSingSongList failed: errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str);
        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var));
    }
}
