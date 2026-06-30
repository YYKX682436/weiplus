package be4;

/* loaded from: classes4.dex */
public class b implements lt3.f {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f19556a;

    /* renamed from: b, reason: collision with root package name */
    public r45.hi0 f19557b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.background.VideoMixer$MixConfig f19558c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f19559d;

    /* renamed from: e, reason: collision with root package name */
    public final be4.a f19560e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19561f = true;

    public b(com.tencent.mm.ui.MMActivity mMActivity, be4.a aVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsFakeVLogHelper", "SnsFakeVLogHelper");
        this.f19556a = mMActivity;
        this.f19560e = aVar;
    }

    @Override // lt3.f
    public void a(java.lang.String str, boolean z17, com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsFakeVLogHelper", "onFinish,success:%b taskId:%s", java.lang.Boolean.valueOf(z17), str);
        if (str == null || !str.equals(this.f19559d)) {
            str2 = "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper";
        } else {
            this.f19561f = true;
            lt3.e.f321209a.c(7, this);
            dw3.c0 c0Var = dw3.c0.f244182a;
            if (captureDataManager$CaptureVideoNormalModel != null && captureDataManager$CaptureVideoNormalModel.f155660d.booleanValue() && gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_WEIXIN_CAMERASAVEVIDEO_STATE_BOOLEAN, true)) {
                ((ku5.t0) ku5.t0.f312615d).h(new dw3.w(captureDataManager$CaptureVideoNormalModel), "mux_save_work");
            }
            com.tencent.mm.plugin.sns.ui.i6 i6Var = (com.tencent.mm.plugin.sns.ui.i6) this.f19560e;
            i6Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            i6Var.f168572k = captureDataManager$CaptureVideoNormalModel.f155661e;
            i6Var.f168570j = captureDataManager$CaptureVideoNormalModel.f155662f;
            com.tencent.mm.ui.MMActivity mMActivity = i6Var.f169957c;
            mMActivity.getIntent().putExtra("KSightThumbPath", i6Var.f168570j);
            mMActivity.getIntent().putExtra("KSightPath", i6Var.f168572k);
            i6Var.f168574l = com.tencent.mm.vfs.w6.p(captureDataManager$CaptureVideoNormalModel.f155661e);
            com.tencent.mm.ui.widget.dialog.u3 u3Var = i6Var.f168557J;
            if (u3Var == null || !u3Var.isShowing()) {
                str3 = "com.tencent.mm.plugin.sns.ui.NewSightWidget";
                str4 = "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper";
            } else {
                i6Var.f168557J.dismiss();
                str4 = "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper";
                str3 = "com.tencent.mm.plugin.sns.ui.NewSightWidget";
                i6Var.c(i6Var.f168560c0, i6Var.f168561d0, i6Var.f168562e0, i6Var.f168563f0, i6Var.f168565g0, i6Var.f168567h0, i6Var.f168569i0, i6Var.f168571j0, i6Var.f168573k0, i6Var.f168575l0, i6Var.f168577m0, i6Var.f168579n0, i6Var.f168581o0, i6Var.f168583p0);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinish", str3);
            str2 = str4;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinish", str2);
    }

    @Override // lt3.f
    public void b(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onInit", "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsFakeVLogHelper", "onInit, taskId:%s", str);
        java.lang.String str2 = lt3.n.f321260a.b(str).t0().f382372o;
        lt3.v.f321277a.b();
        this.f19559d = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInit", "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper");
    }

    @Override // lt3.f
    public void c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onWait", "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsFakeVLogHelper", "onWait, taskId:%s", str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onWait", "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper");
    }

    @Override // lt3.f
    public void d(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onRun", "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsFakeVLogHelper", "onRun, taskId:%s", str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRun", "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper");
    }
}
