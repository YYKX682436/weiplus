package ls0;

/* loaded from: classes10.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.r0 f402489d;

    public x(ls0.r0 r0Var) {
        this.f402489d = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f402489d.f402449t, "decode end after 1000, isFinishEncode:" + this.f402489d.f402435h0);
        if (this.f402489d.f402435h0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxEndWithFrameNumberCheckTimeout");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 91L, 1L);
        this.f402489d.f();
    }
}
