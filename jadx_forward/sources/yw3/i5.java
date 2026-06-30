package yw3;

/* loaded from: classes11.dex */
public final class i5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI f548303d;

    public i5(com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI repairerPatchDemoUI) {
        this.f548303d = repairerPatchDemoUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI repairerPatchDemoUI = this.f548303d;
        java.lang.String str = repairerPatchDemoUI.d;
        ((wv.a0) ((xv.i0) i95.n0.c(xv.i0.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb c16114x800e8cdb = new com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb((r45.j35) null);
        c16114x800e8cdb.f223956v = true;
        c16114x800e8cdb.f223949o = "12354";
        xv.i0 i0Var = (xv.i0) i95.n0.c(xv.i0.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        ((wv.a0) i0Var).getClass();
        ((x73.g) x73.c.a(context).f533974a).a("/storage/emulated/0/Android/data/com.tencent.mm/MicroMsg/WebNetFile/tmp_test.patch", c16114x800e8cdb, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(repairerPatchDemoUI.d, "newApkMd5 = %s", c16114x800e8cdb.f223949o);
    }
}
