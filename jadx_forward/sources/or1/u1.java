package or1;

/* loaded from: classes9.dex */
public class u1 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f429120d;

    public u1(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12982x2657907a activityC12982x2657907a) {
        this.f429120d = new java.lang.ref.WeakReference(activityC12982x2657907a);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        try {
            if (this.f429120d.get() != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12982x2657907a activityC12982x2657907a = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12982x2657907a) this.f429120d.get();
                if (activityC12982x2657907a.isFinishing()) {
                    return;
                }
                or1.t1 t1Var = new or1.t1(this, activityC12982x2657907a, (r45.gb3) ((com.p314xaae8f345.mm.p944x882e457a.o) m1Var.mo47948x7f0c4558()).f152244b.f152233a);
                int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12982x2657907a.f175561m;
                ((ku5.t0) ku5.t0.f394148d).B(t1Var);
            }
        } catch (java.lang.Throwable unused) {
        }
    }
}
