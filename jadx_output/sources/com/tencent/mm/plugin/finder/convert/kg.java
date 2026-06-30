package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class kg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.a2 f103831d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qg f103832e;

    public kg(so2.a2 a2Var, com.tencent.mm.plugin.finder.convert.qg qgVar) {
        this.f103831d = a2Var;
        this.f103832e = qgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103831d.f410250g.f410345a = -1;
        com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView finderHomeTabRedDotTipsBubbleView = this.f103832e.f104390r;
        if (finderHomeTabRedDotTipsBubbleView != null) {
            com.tencent.mm.plugin.finder.view.gb gbVar = com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView.f131137h;
            finderHomeTabRedDotTipsBubbleView.a(true);
        }
    }
}
