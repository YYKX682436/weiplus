package n74;

/* loaded from: classes4.dex */
public class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f416973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f416974e;

    public u1(java.lang.String str, r45.jj4 jj4Var) {
        this.f416973d = str;
        this.f416974e = jj4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.jj4 jj4Var = this.f416974e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$7");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TimeLineAdPreloadHelper", "startPreloadBigImage, snsId=" + this.f416973d + ", mediaId=" + jj4Var.f459388d);
            ca4.s0 s0Var = new ca4.s0(jj4Var);
            s0Var.d(3);
            s0Var.e(jj4Var.f459388d);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj().d(jj4Var, jj4Var.f459389e == 6 ? 5 : 1, s0Var, com.p314xaae8f345.mm.p2621x8fb0427b.s7.f276840k);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TimeLineAdPreloadHelper", "startPreloadBigImage exp=" + th6.toString());
            ca4.q.c("TimeLineAdPreloadHelper, startPreloadBigImage", th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$7");
    }
}
