package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class vm extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderTingAudioCollectionUI f110672d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm(com.tencent.mm.plugin.finder.feed.ui.FinderTingAudioCollectionUI finderTingAudioCollectionUI) {
        super(0);
        this.f110672d = finderTingAudioCollectionUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.appcompat.app.AppCompatActivity context = this.f110672d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return java.lang.Boolean.valueOf(((com.tencent.mm.plugin.finder.profile.uic.p2) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).isSelf());
    }
}
