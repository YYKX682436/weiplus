package v61;

/* loaded from: classes12.dex */
public final class n implements com.p314xaae8f345.mm.p944x882e457a.u0, com.p314xaae8f345.mm.p944x882e457a.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f514994d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f514995e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f514996f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.m1 f514997g;

    /* renamed from: h, reason: collision with root package name */
    public final v61.m f514998h;

    public n(android.content.Context context, v61.m mVar) {
        this.f514995e = context;
        this.f514998h = mVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.v0
    public void S(long j17, long j18, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        this.f514994d.mo50293x3498a0(new v61.l(this, j18 != 0 ? (int) ((j17 * 100) / j18) : 0));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var.mo808xfb85f7b0() == 139) {
            gm0.j1.d().q(139, this);
        } else if (m1Var.mo808xfb85f7b0() == 138) {
            gm0.j1.d().q(138, this);
        }
        v61.m mVar = this.f514998h;
        if (i18 == 0 && i17 == 0) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.mi) mVar).a(true);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DoInit", "do init failed, err=" + i17 + "," + i18);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.mi) mVar).a(false);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f514996f;
        if (u3Var != null) {
            u3Var.dismiss();
        }
    }
}
