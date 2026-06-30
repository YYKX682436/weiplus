package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes8.dex */
public final class hb implements gp1.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f280690a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f280691b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f280692c;

    public hb(int i17, boolean z17, long j17) {
        this.f280690a = i17;
        this.f280691b = z17;
        this.f280692c = j17;
    }

    @Override // gp1.t
    public final void a(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallComponent", "onChattingResume fromScene: %d, canShowMessageFloatBall: %b, addMessageBallResult: %d", java.lang.Integer.valueOf(this.f280690a), java.lang.Boolean.valueOf(this.f280691b), java.lang.Integer.valueOf(i17));
        gp1.s Ai = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Ai();
        if (Ai != null) {
            Ai.a(this.f280692c, i17);
        }
    }
}
