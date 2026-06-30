package rz1;

/* loaded from: classes.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f483322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.datareport.sample.CgiReportDebugUI f483323e;

    public b(int i17, com.tencent.mm.plugin.datareport.sample.CgiReportDebugUI cgiReportDebugUI) {
        this.f483322d = i17;
        this.f483323e = cgiReportDebugUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i17 = 0; i17 < this.f483322d; i17++) {
            java.lang.Thread.sleep(100L);
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            ((cy1.a) rVar).yj("garencliu_test", null, kz5.b1.e(new jz5.l("testCnt", java.lang.Integer.valueOf(i17))), 3, this.f483323e.h);
        }
    }
}
