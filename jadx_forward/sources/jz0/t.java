package jz0;

/* loaded from: classes5.dex */
public final class t implements com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnPlaybackDidFinish {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.sns.p923x5525d53f.ui.C11022x6fd7187b f384154a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ az0.a0 f384155b;

    public t(com.p314xaae8f345.mm.p916x4268f0dc.sns.p923x5525d53f.ui.C11022x6fd7187b c11022x6fd7187b, az0.a0 a0Var) {
        this.f384154a = c11022x6fd7187b;
        this.f384155b = a0Var;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnPlaybackDidFinish
    /* renamed from: onFinished */
    public final void mo33255x7cf2e371() {
        java.lang.String str = this.f384154a.f151351d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("playbackDidFinishCallback: curState=");
        az0.a0 a0Var = this.f384155b;
        sb6.append(a0Var.f96842a.m33238xb7d72d0e());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        p3325xe03a0797.p3326xc267989b.l.d(a0Var.f96843b, null, null, new az0.s(a0Var, null), 3, null);
    }
}
