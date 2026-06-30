package hy4;

/* loaded from: classes8.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f367706a = "";

    /* renamed from: b, reason: collision with root package name */
    public int f367707b = 1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f367708c;

    /* renamed from: d, reason: collision with root package name */
    public long f367709d;

    /* renamed from: e, reason: collision with root package name */
    public long f367710e;

    public final void a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (this.f367710e <= this.f367709d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewRecentForwardReporter", "bottomSheetDismissTiming <= zeroMenuAppearTiming");
            return;
        }
        if (!(context instanceof com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewRecentForwardReporter", "getRecentForwardReportInfo, context: " + context);
        }
        r45.pk5 pk5Var = (r45.pk5) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ai(context, 14, r45.pk5.class);
        if (pk5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewRecentForwardReporter", "tryReport, recentForwardReportInfo is null");
            return;
        }
        pk5Var.f464670i = this.f367708c ? 3 : 2;
        pk5Var.f464671m = "49";
        pk5Var.f464672n = "5";
        pk5Var.f464675q = this.f367706a;
        pk5Var.f464665d = this.f367707b;
        pk5Var.f464673o = (int) (this.f367710e - this.f367709d);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        l35.a.f396976a.a(context);
        this.f367706a = "";
        this.f367707b = 1;
        this.f367708c = false;
        this.f367709d = 0L;
        this.f367710e = 0L;
    }
}
