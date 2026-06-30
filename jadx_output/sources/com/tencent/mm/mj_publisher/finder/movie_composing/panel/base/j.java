package com.tencent.mm.mj_publisher.finder.movie_composing.panel.base;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k f69239d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k kVar) {
        super(0);
        this.f69239d = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel = this.f69239d.f69240i;
        if (baseComposingPanel != null) {
            return baseComposingPanel.getChildPanelNavigation();
        }
        return null;
    }
}
