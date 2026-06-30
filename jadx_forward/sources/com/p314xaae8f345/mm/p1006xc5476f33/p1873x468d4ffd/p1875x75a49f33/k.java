package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33;

/* loaded from: classes10.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f230581d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.ActivityC16536xd4e3d45b f230582e;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.ActivityC16536xd4e3d45b activityC16536xd4e3d45b, long j17) {
        this.f230582e = activityC16536xd4e3d45b;
        this.f230581d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightEditUI", "connect cost %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - this.f230581d));
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8.m66802x9cf0d20b() != null) {
            wo.v1.a(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8.m66802x9cf0d20b().m66811xad307fc());
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.ActivityC16536xd4e3d45b.f230390t;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.ActivityC16536xd4e3d45b activityC16536xd4e3d45b = this.f230582e;
        activityC16536xd4e3d45b.getClass();
        if (com.p314xaae8f345.mm.ui.bl.f(activityC16536xd4e3d45b)) {
            activityC16536xd4e3d45b.m78582xfed654b2(-637534208);
            activityC16536xd4e3d45b.m78583x85ccfe01(0);
        }
        activityC16536xd4e3d45b.f230391d = (android.view.ViewGroup) activityC16536xd4e3d45b.findViewById(com.p314xaae8f345.mm.R.id.m7g);
        activityC16536xd4e3d45b.f230392e = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4) activityC16536xd4e3d45b.findViewById(com.p314xaae8f345.mm.R.id.ozt);
        activityC16536xd4e3d45b.f230393f = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16556x73b8f72) activityC16536xd4e3d45b.findViewById(com.p314xaae8f345.mm.R.id.p09);
        activityC16536xd4e3d45b.f230393f.m66979x1c5c5ff4(activityC16536xd4e3d45b.getIntent().getStringExtra("key_text_color"));
        activityC16536xd4e3d45b.f230394g = activityC16536xd4e3d45b.getIntent().getStringExtra("key_video_path");
        activityC16536xd4e3d45b.f230396i = (com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d) activityC16536xd4e3d45b.getIntent().getParcelableExtra("key_video_para");
        activityC16536xd4e3d45b.f230400p = activityC16536xd4e3d45b.getIntent().getBooleanExtra("key_need_clip_video_first", false);
        activityC16536xd4e3d45b.f230401q = activityC16536xd4e3d45b.getIntent().getBooleanExtra("key_need_remux_video", true);
        int intExtra = activityC16536xd4e3d45b.getIntent().getIntExtra("key_max_duration_seconds", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightEditUI", "maxDurationSeconds: %s", java.lang.Integer.valueOf(intExtra));
        if (!activityC16536xd4e3d45b.f230401q) {
            activityC16536xd4e3d45b.f230400p = true;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16536xd4e3d45b.f230394g)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightEditUI", "error!, videoPath is null!!");
            return;
        }
        if (activityC16536xd4e3d45b.f230396i == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightEditUI", "videoTransPara is null!, use SnsAlbumVideoTransPara");
            activityC16536xd4e3d45b.f230396i = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8.m66802x9cf0d20b().m66818xc616d71a();
        }
        if (activityC16536xd4e3d45b.f230396i == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightEditUI", "videoTransPara still null!!!");
            activityC16536xd4e3d45b.f230396i = new com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d();
        }
        if (intExtra > 0) {
            activityC16536xd4e3d45b.f230396i.f152728h = intExtra;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightEditUI", "videoTransPara: %s", activityC16536xd4e3d45b.f230396i);
        activityC16536xd4e3d45b.f230392e.setAlpha(0.0f);
        activityC16536xd4e3d45b.f230392e.mo69327xab3268fe(activityC16536xd4e3d45b.f230394g);
        activityC16536xd4e3d45b.f230392e.mo69317x764cf626(true);
        activityC16536xd4e3d45b.f230392e.m75828x772f3ddc(true);
        activityC16536xd4e3d45b.f230392e.mo69326x360a109e(activityC16536xd4e3d45b.f230403s);
        activityC16536xd4e3d45b.f230398n = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8.m66802x9cf0d20b().m66807x1efd7235() + "vsg_output_" + java.lang.System.currentTimeMillis() + ".mp4";
        activityC16536xd4e3d45b.f230399o = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8.m66802x9cf0d20b().m66807x1efd7235() + "vsg_thumb_" + java.lang.System.currentTimeMillis() + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG;
        if (com.p314xaae8f345.mm.ui.bl.f(activityC16536xd4e3d45b)) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) activityC16536xd4e3d45b.f230393f.getLayoutParams();
            marginLayoutParams.bottomMargin += com.p314xaae8f345.mm.ui.bl.c(activityC16536xd4e3d45b);
            activityC16536xd4e3d45b.f230393f.setLayoutParams(marginLayoutParams);
        }
    }
}
