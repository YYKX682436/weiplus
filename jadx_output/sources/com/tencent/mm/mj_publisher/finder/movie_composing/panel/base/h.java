package com.tencent.mm.mj_publisher.finder.movie_composing.panel.base;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel f69237d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel) {
        super(2);
        this.f69237d = baseComposingPanel;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        float floatValue2 = ((java.lang.Number) obj2).floatValue();
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel = this.f69237d;
        java.util.Iterator it = baseComposingPanel.f69209i.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.m) it.next()).a(floatValue, floatValue2, baseComposingPanel);
        }
        return jz5.f0.f302826a;
    }
}
