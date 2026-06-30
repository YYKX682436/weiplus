package p10;

/* loaded from: classes7.dex */
public final class a0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p10.c0 f432461d;

    public a0(p10.c0 c0Var) {
        this.f432461d = c0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsNirvanaLoadingComponent", "scheduleDelayedLoading, cancel loading by user");
        p10.l0 l0Var = (p10.l0) this.f432461d.f432467c;
        l0Var.f432501a.setResult(0);
        bw5.d5 d5Var = bw5.d5.EcsNirvanaUILaunchResult;
        bw5.s7 s7Var = l0Var.f432501a.f147375n;
        ((ku5.t0) ku5.t0.f394148d).h(new q10.o(s7Var, d5Var, 1), "MicroMsg.EcsNirvanaReportUtil");
        l0Var.f432501a.finish();
    }
}
