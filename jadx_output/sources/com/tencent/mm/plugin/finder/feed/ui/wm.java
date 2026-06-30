package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class wm extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderTingAudioCollectionUI f110709d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wm(com.tencent.mm.plugin.finder.feed.ui.FinderTingAudioCollectionUI finderTingAudioCollectionUI) {
        super(0);
        this.f110709d = finderTingAudioCollectionUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f110709d.getIntent().getBooleanExtra("KEY_FINDER_SELF_FLAG", false));
    }
}
