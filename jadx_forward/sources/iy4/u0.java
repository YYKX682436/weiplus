package iy4;

/* loaded from: classes12.dex */
public class u0 extends wu5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f377544d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f377545e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ iy4.r0 f377546f;

    public u0(iy4.r0 r0Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17) {
        this.f377546f = r0Var;
        this.f377544d = f9Var;
        this.f377545e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f377544d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTerminalSyncMgr", "autoDownload video, msgId=%d, totalLen:%d", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), java.lang.Integer.valueOf(this.f377545e));
        this.f377546f.f377523e.put(f9Var.z0(), f9Var);
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String z07 = f9Var.z0();
        ((vf0.y1) x1Var).getClass();
        t21.d3.L(z07);
        com.p314xaae8f345.mm.p947xba6de98f.s1.fj().f152530u.add("video_" + f9Var.m124847x74d37ac6());
    }
}
