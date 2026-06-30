package t21;

/* loaded from: classes12.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f496391d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f496392e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t21.r0 f496393f;

    public p0(t21.r0 r0Var, boolean z17, int i17) {
        this.f496393f = r0Var;
        this.f496391d = z17;
        this.f496392e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean N;
        t21.r0 r0Var = this.f496393f;
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(r0Var.f496442m.g(), "msg", null);
        if (d17 != null) {
            t21.o2.Ui().B(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f104104s, r0Var.f496438f, false), (java.lang.String) d17.get(".msg.videomsg.$cdnvideourl"), (java.lang.String) d17.get(".msg.videomsg.$aeskey"));
        }
        int i17 = this.f496392e;
        boolean z17 = this.f496391d;
        if (z17) {
            N = t21.d3.N(r0Var.f496438f, i17);
            if (r0Var.f496441i) {
                t21.d3.H(r0Var.f496438f);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDownloadVideo", "sceneEndproc, isHadHevcLocalFile");
            }
        } else if (r0Var.f496441i) {
            t21.d3.G(r0Var.f496438f);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(354L, 138L, 1L, false);
            N = false;
        } else {
            N = t21.d3.N(r0Var.f496438f, i17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDownloadVideo", "%s ashutest::cdntra !FIN! file:%s svrid:%d human:%s user:%s updatedbsucc:%b  MediaCheckDuplicationStorage MD5:%s SIZE:%d renameFlag %b needRename %b", r0Var.J(), r0Var.f496438f, java.lang.Long.valueOf(r0Var.f496442m.f496537c), r0Var.f496442m.e(), r0Var.f496442m.h(), java.lang.Boolean.valueOf(N), r0Var.f496450u, java.lang.Integer.valueOf(r0Var.f496451v), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(r0Var.f496449t));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0Var.f496450u) && r0Var.f496451v > 0) {
            ((com.p314xaae8f345.mm.p2621x8fb0427b.w8) ((g90.o0) ((h90.b0) i95.n0.c(h90.b0.class))).wi()).i(r0Var.f496450u, r0Var.f496451v, ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f104104s, r0Var.f496438f, false));
        }
        if (r0Var.f496442m.f496559x == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(198L, 38L, r2.f496541f, false);
            g0Var.mo68477x336bdfd8(198L, 40L, r0Var.f496442m.f496548m, false);
            g0Var.mo68477x336bdfd8(198L, 41L, 1L, false);
            g0Var.mo68477x336bdfd8(198L, com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(r0Var.f496442m.h()) ? 43L : 42L, 1L, false);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var2.mo68477x336bdfd8(198L, 31L, r2.f496541f, false);
            g0Var2.mo68477x336bdfd8(198L, 33L, r0Var.f496442m.f496548m, false);
            g0Var2.mo68477x336bdfd8(198L, 34L, 1L, false);
            g0Var2.mo68477x336bdfd8(198L, com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(r0Var.f496442m.h()) ? 36L : 35L, 1L, false);
        }
        r0Var.f496436d.mo815x76e0bfae(0, 0, "", r0Var);
    }
}
