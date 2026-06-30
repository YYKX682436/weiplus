package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class ph extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderPoiManageUI f110423d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph(com.tencent.mm.plugin.finder.feed.ui.FinderPoiManageUI finderPoiManageUI) {
        super(0);
        this.f110423d = finderPoiManageUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.appcompat.app.AppCompatActivity context = this.f110423d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return xy2.c.e(context);
    }
}
