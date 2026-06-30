package sf2;

/* loaded from: classes5.dex */
public final class h1 implements ek2.q2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f488689a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f488690b;

    public h1(int i17, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f488689a = i17;
        this.f488690b = qVar;
    }

    @Override // ek2.q2
    public void a(int i17, int i18, java.lang.String str, r45.rd2 resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        p3325xe03a0797.p3326xc267989b.q qVar = this.f488690b;
        int i19 = this.f488689a;
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNormalRoomSingRequestHelper", "updateSongList " + i19 + " success");
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(resp));
            return;
        }
        if (i18 == -200431) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNormalRoomSingRequestHelper", "updateSongList " + i19 + " success (no change)");
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(resp));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveNormalRoomSingRequestHelper", "updateSongList " + i19 + " failed: errType=" + i17 + ", errCode=" + i18);
        qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
    }
}
