package sf2;

/* loaded from: classes.dex */
public final class g1 implements ek2.g1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f488679a;

    public g1(p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f488679a = qVar;
    }

    @Override // ek2.g1
    public void a(int i17, int i18, java.lang.String str, r45.tt1 resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        p3325xe03a0797.p3326xc267989b.q qVar = this.f488679a;
        if (i17 == 0 && i18 == 0) {
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(resp));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveNormalRoomSingRequestHelper", "getSongList failed: errType=" + i17 + ", errCode=" + i18);
        qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
    }
}
