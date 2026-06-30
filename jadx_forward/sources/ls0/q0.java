package ls0;

/* loaded from: classes10.dex */
public final class q0 extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ls0.r0 f402417e;

    public q0(ls0.r0 r0Var) {
        this.f402417e = r0Var;
    }

    @Override // wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "MediaCodecRemuxer#timeoutInvoke";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f402417e.f402449t, "remux error! handing one frame time out ,isInvokeEndCallback:" + this.f402417e.U);
        if (this.f402417e.U) {
            return;
        }
        this.f402417e.i(!r0.f402429e0, true);
    }
}
