package pk4;

/* loaded from: classes10.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18689xd498e45c f438025d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18689xd498e45c c18689xd498e45c) {
        super(1);
        this.f438025d = c18689xd498e45c;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18689xd498e45c c18689xd498e45c = this.f438025d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18693x84c11749 c18693x84c11749 = c18689xd498e45c.textureView;
        if (c18693x84c11749 != null) {
            c18693x84c11749.setAlpha(1.0f);
        }
        boolean pauseVideoOnPlay = c18689xd498e45c.getPauseVideoOnPlay();
        java.lang.String str = c18689xd498e45c.f256045d;
        if (pauseVideoOnPlay) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "pauseVideoOnPlay, timestamp:" + longValue);
            pk4.t tVar = c18689xd498e45c.mvMusicProxy;
            if (tVar != null) {
                c18689xd498e45c.lastPauseMvPosition = tVar.mo67281x9746038c();
                kk4.v vVar = c18689xd498e45c.currentPlayer;
                if (vVar != null) {
                    kk4.b.i(vVar, false, false, 3, null);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "removeCompleteTimer");
                kk4.v vVar2 = c18689xd498e45c.currentPlayer;
                if (vVar2 != null) {
                    kk4.b.g(vVar2, null, 0L, 2, null);
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = c18689xd498e45c.playTimer;
                if (n3Var != null) {
                    n3Var.mo50302x6b17ad39(null);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "pause lastPauseMvPosition:" + c18689xd498e45c.lastPauseMvPosition);
            c18689xd498e45c.m71964xa74c6ba(false);
        }
        if (!c18689xd498e45c.getLogFrameRender()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "first frame render");
            c18689xd498e45c.m71959xdbf99881(true);
        }
        if (c18689xd498e45c.A > 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("first frame render cost:");
            long j17 = c18689xd498e45c.A;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(android.os.SystemClock.elapsedRealtime() - j17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            c18689xd498e45c.A = -1L;
        }
        return jz5.f0.f384359a;
    }
}
