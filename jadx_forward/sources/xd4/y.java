package xd4;

/* loaded from: classes4.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xd4.z f535251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f535252e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(xd4.z zVar, long j17) {
        super(0);
        this.f535251d = zVar;
        this.f535252e = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.res.Resources resources;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$refreshBarByTotalTime$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$refreshBarByTotalTime$1");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19716x17d12db2 g17 = xd4.z.g(this.f535251d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g17);
        g17.m75623x9dd15644().m75689x457bdbf5(this.f535252e);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19716x17d12db2 g18 = xd4.z.g(this.f535251d);
        boolean z17 = true;
        if (g18 != null) {
            g18.m75631x8fc0e6e1(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsVideoExpandSeekBarDurationMs", "com.tencent.mm.plugin.sns.ui.SnsVideoPlayConfig");
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_video_expand_seekbar_duration, 15000);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoConfig", "getSnsVideoExpandSeekBarDurationMs: " + Ni);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsVideoExpandSeekBarDurationMs", "com.tencent.mm.plugin.sns.ui.SnsVideoPlayConfig");
        xd4.z zVar = this.f535251d;
        if (!ca4.z0.g0() && this.f535252e < Ni) {
            z17 = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setBarExpanded$p", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        zVar.f535255c = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setBarExpanded$p", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19716x17d12db2 g19 = xd4.z.g(this.f535251d);
        if (g19 != null) {
            xd4.z zVar2 = this.f535251d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$isBarExpanded$p", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
            boolean z18 = zVar2.f535255c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$isBarExpanded$p", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
            g19.d(z18, false);
        }
        xd4.z zVar3 = this.f535251d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getActivityContext$p", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        android.app.Activity activity = zVar3.f535256d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getActivityContext$p", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        zVar3.mo175369x50e1c15d((activity == null || (resources = activity.getResources()) == null) ? null : resources.getConfiguration());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$refreshBarByTotalTime$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$refreshBarByTotalTime$1");
        return f0Var;
    }
}
