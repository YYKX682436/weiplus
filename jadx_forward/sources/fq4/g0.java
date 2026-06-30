package fq4;

/* loaded from: classes15.dex */
public class g0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public fq4.f0 f347128d;

    /* renamed from: e, reason: collision with root package name */
    public int f347129e = -1;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f347130f = null;

    public g0(fq4.f0 f0Var) {
        this.f347128d = null;
        c01.d9.e().a(611, this);
        c01.d9.e().a(613, this);
        this.f347128d = f0Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 != 0 && i18 != 0) {
            if (i18 == -34) {
                fq4.f0 f0Var = this.f347128d;
                if (f0Var != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18849x3feb382a activityC18849x3feb382a = (com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18849x3feb382a) f0Var;
                    activityC18849x3feb382a.f257701h.m72725xca0261a3(com.p314xaae8f345.mm.R.C30867xcad56011.k9n);
                    activityC18849x3feb382a.f257701h.c();
                    return;
                }
                return;
            }
            fq4.f0 f0Var2 = this.f347128d;
            if (f0Var2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18849x3feb382a activityC18849x3feb382a2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18849x3feb382a) f0Var2;
                activityC18849x3feb382a2.f257701h.m72725xca0261a3(com.p314xaae8f345.mm.R.C30867xcad56011.k9u);
                activityC18849x3feb382a2.f257701h.c();
                return;
            }
            return;
        }
        if (m1Var.mo808xfb85f7b0() == 611) {
            fq4.e eVar = (fq4.e) m1Var;
            this.f347129e = eVar.f347123g;
            java.lang.String str2 = eVar.f347122f;
            this.f347130f = str2;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            fq4.f0 f0Var3 = this.f347128d;
            if (f0Var3 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18849x3feb382a activityC18849x3feb382a3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18849x3feb382a) f0Var3;
                activityC18849x3feb382a3.f257705o = str2;
                activityC18849x3feb382a3.f257701h.d();
                activityC18849x3feb382a3.f257701h.m72728x63103da6(str2);
                activityC18849x3feb382a3.T6();
                activityC18849x3feb382a3.f257698e.setEnabled(true);
            }
        }
        if (m1Var.mo808xfb85f7b0() == 613) {
            if (((fq4.q) m1Var).f347174n == 0) {
                fq4.f0 f0Var4 = this.f347128d;
                if (f0Var4 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18849x3feb382a) f0Var4).Z6(true);
                    return;
                }
                return;
            }
            fq4.f0 f0Var5 = this.f347128d;
            if (f0Var5 != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18849x3feb382a) f0Var5).Z6(false);
            }
        }
    }
}
