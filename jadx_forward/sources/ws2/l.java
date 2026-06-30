package ws2;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public f25.m0 f530620a;

    public final void a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayAudioManager", str + " AudioFocus gain!");
        dt2.a0 a0Var = ws2.k1.f530599r.a().f530616o;
        if (a0Var == null || (c14932xfc4acec9 = a0Var.f324691a) == null) {
            return;
        }
        c14932xfc4acec9.mo56709x764d819b(false);
    }

    public final void b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayAudioManager", str + " AudioFocus lossTransient!");
        dt2.a0 a0Var = ws2.k1.f530599r.a().f530616o;
        if (a0Var == null || (c14932xfc4acec9 = a0Var.f324691a) == null) {
            return;
        }
        c14932xfc4acec9.mo56709x764d819b(true);
    }
}
