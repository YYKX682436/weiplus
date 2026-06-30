package sw4;

/* loaded from: classes3.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.ipc.ActivityC19268x2f81ee00 f495015d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.ipc.ActivityC19268x2f81ee00 activityC19268x2f81ee00) {
        this.f495015d = activityC19268x2f81ee00;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View decorView;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.ipc.ActivityC19268x2f81ee00.f263762d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.ipc.ActivityC19268x2f81ee00 activityC19268x2f81ee00 = this.f495015d;
        boolean z17 = false;
        boolean booleanExtra = activityC19268x2f81ee00.getIntent().getBooleanExtra("key_gaussian_ui_fullscreen", false);
        k91.x2 x2Var = k91.x2.f387350e;
        k91.v2 v2Var = k91.v2.f387323d;
        if ("dragBar".equals(activityC19268x2f81ee00.getIntent().getStringExtra("key_gaussian_ui_style"))) {
            x2Var = k91.x2.f387349d;
            v2Var = k91.v2.f387324e;
            z17 = true;
        }
        k91.x2 x2Var2 = x2Var;
        k91.v2 v2Var2 = v2Var;
        boolean z18 = z17;
        l81.b1 b1Var = new l81.b1();
        b1Var.f398547b = activityC19268x2f81ee00.getIntent().getStringExtra("key_gaussian_ui_appid");
        b1Var.f398545a = activityC19268x2f81ee00.getIntent().getStringExtra("key_gaussian_ui_username");
        b1Var.f398555f = activityC19268x2f81ee00.getIntent().getStringExtra("key_gaussian_ui_path");
        b1Var.f398565k = activityC19268x2f81ee00.getIntent().getIntExtra("key_gaussian_ui_scene", bb1.b.f4179x366c91de);
        android.content.Intent intent = activityC19268x2f81ee00.getIntent();
        android.view.Window window = activityC19268x2f81ee00.getWindow();
        boolean z19 = true;
        k91.s2 s2Var = null;
        boolean z27 = true;
        b1Var.G = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1(z19, intent.getIntExtra("key_gaussian_ui_height", (((window == null || (decorView = window.getDecorView()) == null) ? activityC19268x2f81ee00.getResources().getDisplayMetrics().heightPixels : decorView.getHeight()) * 3) / 4), s2Var, z27, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.BackgroundShapeConfig(activityC19268x2f81ee00.mo55332x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9), true, true, false, false), false, null, k91.t2.f387300e, booleanExtra, true, null, k91.y2.f387360d, false, false, null, false, 0, null, 0, 0, 0, false, false, false, x2Var2, false, null, 0, z18, null, false, 0, false, false, booleanExtra, booleanExtra, v2Var2, null, null, false, null, null, false, -287345564, 2019, null);
        b1Var.L = new sw4.b(new java.lang.ref.WeakReference(activityC19268x2f81ee00));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(activityC19268x2f81ee00.mo55332x76847179(), b1Var);
    }
}
