package dd4;

/* loaded from: classes4.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f310591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f310592e;

    public t(r45.jj4 jj4Var, java.lang.String str) {
        this.f310591d = jj4Var;
        this.f310592e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper$Companion$getMediaDownloader$1");
        java.util.Iterator it = t21.d3.o(this.f310591d.f459388d).iterator();
        while (it.hasNext()) {
            t21.v2 v2Var = (t21.v2) it.next();
            java.lang.String str = v2Var.B;
            boolean z17 = false;
            if (str != null && r26.n0.B(str, this.f310592e, false)) {
                z17 = true;
            }
            if (z17) {
                dw3.c0.f325715a.j(v2Var.C);
                t21.d3.e(v2Var.d());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlexibleResourceHelper", "delete video info:" + v2Var);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper$Companion$getMediaDownloader$1");
    }
}
