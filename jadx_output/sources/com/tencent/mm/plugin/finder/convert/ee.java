package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ee implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.tips.TrackTipsFrameLayout f103251d;

    public ee(com.tencent.mm.plugin.finder.feed.tips.TrackTipsFrameLayout trackTipsFrameLayout) {
        this.f103251d = trackTipsFrameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103251d.setVisibility(8);
    }
}
