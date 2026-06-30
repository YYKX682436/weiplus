package iy4;

/* loaded from: classes12.dex */
public class t0 extends wu5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f377539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f377540e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m11.b0 f377541f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ iy4.r0 f377542g;

    public t0(iy4.r0 r0Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, m11.b0 b0Var) {
        this.f377542g = r0Var;
        this.f377539d = f9Var;
        this.f377540e = i17;
        this.f377541f = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f377539d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTerminalSyncMgr", "autoDownload image, msgId=%d, totalLen:%d", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), java.lang.Integer.valueOf(this.f377540e));
        com.p314xaae8f345.mm.p947xba6de98f.s1.fj().f152530u.add("image_" + f9Var.m124847x74d37ac6());
        ((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).c(this.f377541f.f404166a, tg3.l1.a(f9Var), 0, java.lang.Long.valueOf(f9Var.I0()), com.p314xaae8f345.mm.R.C30861xcebc809e.bgs, new iy4.s0(this));
    }
}
