package qe5;

/* loaded from: classes12.dex */
public final class l2 implements i40.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qe5.m2 f443675a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f443676b;

    public l2(qe5.m2 m2Var, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        this.f443675a = m2Var;
        this.f443676b = activityC0065xcd7aa112;
    }

    @Override // i40.a
    public void a(long j17, long j18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.RecordFileDownloadUIC", "progressDownloadCallBack onDownloadProgress, offset: " + j17 + ", totalLen: " + j18);
        qe5.m2 m2Var = this.f443675a;
        kd5.e U6 = m2Var.U6();
        if (U6 != null) {
            U6.f388421s = (int) ((j17 / java.lang.Math.max(1.0d, j18)) * 100);
        }
        j75.f Q6 = m2Var.Q6();
        if (Q6 != null) {
            Q6.B3(new kd5.u(2, 0));
        }
    }

    @Override // i40.a
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.RecordFileDownloadUIC", "progressDownloadCallBack onDownloadSucceed");
        qe5.m2 m2Var = this.f443675a;
        kd5.e U6 = m2Var.U6();
        if (U6 != null) {
            U6.G = true;
        }
        j75.f Q6 = m2Var.Q6();
        if (Q6 != null) {
            Q6.B3(new kd5.u(6, 0));
        }
        kd5.e U62 = m2Var.U6();
        if (U62 != null) {
            U62.K = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = m2Var.P6();
        if (!(P6 != null && P6.isFinishing())) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = m2Var.P6();
            if (!(P62 != null && P62.isDestroyed())) {
                pm0.v.X(new qe5.k2(this.f443676b, m2Var));
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.RecordFileDownloadUIC", "activity is finishing or destroyed");
    }

    @Override // i40.a
    public void d(int i17, int i18, java.lang.String errMsg, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.RecordFileDownloadUIC", "progressDownloadCallBack onDownloadFailed, errorType: " + i17 + ", errorCode: " + i18 + ", errMsg: " + errMsg + ", isCdnOutOfTime: " + z17);
        int i19 = z17 ? 5 : 4;
        j75.f Q6 = this.f443675a.Q6();
        if (Q6 != null) {
            Q6.B3(new kd5.u(i19, 0));
        }
    }

    @Override // i40.a
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.RecordFileDownloadUIC", "progressDownloadCallBack onDownloadCanceled");
        j75.f Q6 = this.f443675a.Q6();
        if (Q6 != null) {
            Q6.B3(new kd5.u(3, 0));
        }
    }
}
