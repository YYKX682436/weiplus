package vw3;

/* loaded from: classes.dex */
public final class o3 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerMsgResendUI f522583d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f522584e;

    public o3(com.tencent.mm.plugin.repairer.ui.RepairerMsgResendUI repairerMsgResendUI, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f522583d = repairerMsgResendUI;
        this.f522584e = f9Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        this.f522583d.mo55332x76847179();
        vw3.m3[] m3VarArr = vw3.m3.f522564d;
        boolean z17 = false;
        g4Var.l(0, "随机SvrId", com.p314xaae8f345.mm.R.raw.f79887x15f6a8c3, false);
        vw3.m3[] m3VarArr2 = vw3.m3.f522564d;
        g4Var.l(1, "刷新消息时间", com.p314xaae8f345.mm.R.raw.f79887x15f6a8c3, false);
        vw3.m3[] m3VarArr3 = vw3.m3.f522564d;
        g4Var.l(2, "推送", com.p314xaae8f345.mm.R.raw.f79902x4225bfc7, false);
        vw3.m3[] m3VarArr4 = vw3.m3.f522564d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f522584e;
        if (f9Var != null && f9Var.mo78013xfb85f7b0() == 43) {
            z17 = true;
        }
        g4Var.l(3, "视频过期", com.p314xaae8f345.mm.R.raw.f79697xe8d412c3, !z17);
    }
}
