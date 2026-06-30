package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ng implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView f104096d;

    public ng(com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView finderHomeTabRedDotTipsBubbleView) {
        this.f104096d = finderHomeTabRedDotTipsBubbleView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f104096d.requestLayout();
    }
}
