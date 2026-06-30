package or1;

/* loaded from: classes9.dex */
public class h0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f429034d;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12979xbcc07f40 activityC12979xbcc07f40) {
        this.f429034d = new java.lang.ref.WeakReference(activityC12979xbcc07f40);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        try {
            if (this.f429034d.get() != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12979xbcc07f40 activityC12979xbcc07f40 = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12979xbcc07f40) this.f429034d.get();
                if (activityC12979xbcc07f40.isFinishing()) {
                    return;
                }
                r45.gb3 gb3Var = (r45.gb3) ((com.p314xaae8f345.mm.p944x882e457a.o) m1Var.mo47948x7f0c4558()).f152244b.f152233a;
                ((ku5.t0) ku5.t0.f394148d).B(new or1.g0(this, activityC12979xbcc07f40, gb3Var));
            }
        } catch (java.lang.Throwable unused) {
        }
    }
}
