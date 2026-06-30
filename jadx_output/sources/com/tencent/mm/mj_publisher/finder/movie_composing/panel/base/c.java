package com.tencent.mm.mj_publisher.finder.movie_composing.panel.base;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f69226d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel f69227e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f69228f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(yz5.a aVar, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel, boolean z17) {
        super(0);
        this.f69226d = aVar;
        this.f69227e = baseComposingPanel;
        this.f69228f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.a aVar = this.f69226d;
        if (aVar != null) {
            aVar.invoke();
        }
        int i17 = com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel.f69203z;
        this.f69227e.v(this.f69228f);
        return jz5.f0.f302826a;
    }
}
