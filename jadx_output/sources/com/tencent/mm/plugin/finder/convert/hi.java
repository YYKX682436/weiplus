package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class hi implements zy2.ub {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f103591d;

    public hi(java.lang.ref.WeakReference weakConvert) {
        kotlin.jvm.internal.o.g(weakConvert, "weakConvert");
        this.f103591d = weakConvert;
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public /* bridge */ /* synthetic */ void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        bool.booleanValue();
    }

    @Override // zy2.ub
    public void e3(int i17, int i18) {
        cw2.da daVar;
        cw2.wa f130607n;
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        com.tencent.mm.plugin.finder.convert.oj ojVar = (com.tencent.mm.plugin.finder.convert.oj) this.f103591d.get();
        if (ojVar == null || (daVar = ojVar.C) == null || (f130607n = daVar.getF130607n()) == null || (feedData = f130607n.f224099f) == null) {
            return;
        }
        long feedId = feedData.getFeedId();
        long currentPlayMs = daVar.getCurrentPlayMs();
        long videoDurationMs = daVar.getVideoDurationMs();
        int i19 = (int) ((((float) currentPlayMs) / ((float) videoDurationMs)) * 500);
        if (currentPlayMs < 0 || videoDurationMs <= 0) {
            return;
        }
        ey2.v2 v2Var = (ey2.v2) ((jz5.n) ojVar.D).getValue();
        kotlin.jvm.internal.o.f(v2Var, "<get-videoStateVM>(...)");
        v2Var.W6(feedId, 4, i19, currentPlayMs, videoDurationMs, 1.0f, (r28 & 64) != 0 ? 1 : 0, (r28 & 128) != 0 ? false : false, (r28 & 256) != 0 ? ey2.t2.f257523p : ey2.t2.f257518h);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
    }
}
