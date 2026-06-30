package yw3;

/* loaded from: classes11.dex */
public final class n5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI f548361d;

    public n5(com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI repairerPatchDemoUI) {
        this.f548361d = repairerPatchDemoUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((wv.i0) ((xv.o0) i95.n0.c(xv.o0.class))).getClass();
        r45.mm6 m17 = c83.e.m();
        if (m17 == null) {
            this.f548361d.getClass();
            dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "更新数据为空，dialog = null", 1).show();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f548361d.d, "have tinker update dialogInfo is null.");
        } else {
            if (!((wv.i0) ((xv.o0) i95.n0.c(xv.o0.class))).wi()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f548361d.d, "have tinker UpdateUtil.isNeedShowTinkerDialog() = " + ((wv.i0) ((xv.o0) i95.n0.c(xv.o0.class))).wi());
                return;
            }
            com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI repairerPatchDemoUI = this.f548361d;
            repairerPatchDemoUI.getClass();
            ((ku5.t0) ku5.t0.f394148d).g(new yw3.g5(repairerPatchDemoUI, m17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f548361d.d, "have tinker update.");
        }
    }
}
