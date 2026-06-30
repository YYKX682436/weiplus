package bh5;

/* loaded from: classes8.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.HalfScreenTransparentActivity f20938d;

    public i(com.tencent.mm.ui.halfscreen.HalfScreenTransparentActivity halfScreenTransparentActivity) {
        this.f20938d = halfScreenTransparentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = com.tencent.mm.ui.halfscreen.HalfScreenTransparentActivity.f208799g;
        com.tencent.mm.ui.halfscreen.HalfScreenTransparentActivity halfScreenTransparentActivity = this.f20938d;
        halfScreenTransparentActivity.getClass();
        try {
            dh5.a halfScreenParam = (dh5.a) ((jz5.n) halfScreenTransparentActivity.f208801e).getValue();
            bh5.j jVar = new bh5.j(halfScreenTransparentActivity);
            kotlin.jvm.internal.o.g(halfScreenParam, "halfScreenParam");
            java.lang.Class cls = halfScreenParam.f232619e;
            halfScreenParam.f232620f = jVar;
            com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment mMHalfScreenDialogFragment = (com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment) cls.getDeclaredConstructor(android.content.Context.class, dh5.a.class).newInstance(halfScreenTransparentActivity, halfScreenParam);
            if (mMHalfScreenDialogFragment != null) {
                try {
                    mMHalfScreenDialogFragment.show(halfScreenTransparentActivity.getSupportFragmentManager(), "halfScreenDialog");
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.HalfScreenActivityHelper", th6, "createHalfScreenDialogFragmentAndShow err", new java.lang.Object[0]);
                }
            }
            halfScreenTransparentActivity.f208800d = mMHalfScreenDialogFragment;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MMHalfScreen.TransparentActivity", "showHalfScreen: %s", e17.toString());
        }
    }
}
