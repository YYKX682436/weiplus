package sf2;

/* loaded from: classes5.dex */
public final class w implements ek2.q2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f488859a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f488860b;

    public w(p3325xe03a0797.p3326xc267989b.q qVar, int i17) {
        this.f488859a = qVar;
        this.f488860b = i17;
    }

    @Override // ek2.q2
    public void a(int i17, int i18, java.lang.String str, r45.rd2 resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        p3325xe03a0797.p3326xc267989b.q qVar = this.f488859a;
        if (!((p3325xe03a0797.p3326xc267989b.r) qVar).n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicSingSongController", "updateSongList: continuation is not active, skip result");
            return;
        }
        int i19 = this.f488860b;
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicSingSongController", "updateSongList " + i19 + " success");
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new sf2.h3(resp)));
            return;
        }
        if (i18 == -200431) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicSingSongController", "updateSongList " + i19 + " success (no change)");
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new sf2.h3(resp)));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveAnchorMusicSingSongController", "updateSongList " + i19 + " failed: errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str);
        qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new sf2.g3(i18, str)));
    }
}
