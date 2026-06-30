package n74;

/* loaded from: classes4.dex */
public class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f416940d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f416941e;

    public o1(java.lang.String str, r45.jj4 jj4Var) {
        this.f416940d = str;
        this.f416941e = jj4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.jj4 jj4Var = this.f416941e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$1");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TimeLineAdPreloadHelper", "adVideoPreload, timeline offlineVideo, snsId=" + this.f416940d + ", mediaId=" + jj4Var.f459388d);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj().d(jj4Var, 4, null, com.p314xaae8f345.mm.p2621x8fb0427b.s7.f276840k);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1697, 33);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TimeLineAdPreloadHelper", "adVideoPreload, timeline offlineVideo exp=" + th6.toString());
            ca4.q.c("TimeLineAdPreloadHelper, adVideoPreload", th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$1");
    }
}
