package xd4;

/* loaded from: classes4.dex */
public final class m implements z35.d0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19719xa864b110 f535213d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xd4.z f535214e;

    public m(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19719xa864b110 c19719xa864b110, xd4.z zVar) {
        this.f535213d = c19719xa864b110;
        this.f535214e = zVar;
    }

    @Override // z35.d0
    public void D0(android.widget.SeekBar seekBar, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStopTrackingTouch", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initControlBar$5");
        xd4.z zVar = this.f535214e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d f17 = xd4.z.f(zVar);
        if (f17 != null) {
            f17.Z((int) (this.f535213d.c(i17) / 1000), true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d f18 = xd4.z.f(zVar);
        if (f18 != null) {
            f18.m70641xcbc2dc9b(true);
        }
        xd4.h e17 = xd4.z.e(zVar);
        e17.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dispose", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$DelaySeekTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getUiMainHandler$p", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = e17.f535177f.f535262j;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getUiMainHandler$p", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        n3Var.mo50300x3fa464aa(e17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispose", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$DelaySeekTask");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19716x17d12db2 g17 = xd4.z.g(zVar);
        if (g17 != null) {
            g17.m75632x51053e11(0);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19716x17d12db2 g18 = xd4.z.g(zVar);
        if (g18 != null) {
            g18.m75633xfc4b3492(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStopTrackingTouch", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initControlBar$5");
    }

    @Override // z35.d0
    public void g6(android.widget.SeekBar seekBar, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartTrackingTouch", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initControlBar$5");
        xd4.z zVar = this.f535214e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d f17 = xd4.z.f(zVar);
        if (f17 != null) {
            f17.F();
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19716x17d12db2 g17 = xd4.z.g(zVar);
        if (g17 != null) {
            g17.m75632x51053e11(4);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19716x17d12db2 g18 = xd4.z.g(zVar);
        if (g18 != null) {
            g18.m75633xfc4b3492(false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartTrackingTouch", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initControlBar$5");
    }

    @Override // z35.d0
    /* renamed from: onProgressChanged */
    public void mo129341x95ed2be8(android.widget.SeekBar seekBar, int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onProgressChanged", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initControlBar$5");
        if (z17) {
            xd4.z.e(this.f535214e).a((int) (this.f535213d.c(i17) / 1000));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onProgressChanged", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initControlBar$5");
    }
}
