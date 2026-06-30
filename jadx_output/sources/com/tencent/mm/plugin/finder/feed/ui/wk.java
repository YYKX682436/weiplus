package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class wk extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI f110705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f110706e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f110707f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk(com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI finderSharePostUI, java.lang.String str, java.lang.String str2) {
        super(0);
        this.f110705d = finderSharePostUI;
        this.f110706e = str;
        this.f110707f = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI finderSharePostUI = this.f110705d;
        db5.e1.G(finderSharePostUI.getContext(), finderSharePostUI.getResources().getString(com.tencent.mm.R.string.f4u), "", false, new com.tencent.mm.plugin.finder.feed.ui.vk(finderSharePostUI, this.f110706e, this.f110707f));
        return jz5.f0.f302826a;
    }
}
