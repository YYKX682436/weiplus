package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class uk extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI f110619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f110620e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f110621f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk(com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI finderSharePostUI, java.lang.String str, java.lang.String str2) {
        super(0);
        this.f110619d = finderSharePostUI;
        this.f110620e = str;
        this.f110621f = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI finderSharePostUI = this.f110619d;
        db5.e1.G(finderSharePostUI.getContext(), finderSharePostUI.getResources().getString(com.tencent.mm.R.string.f4v), "", false, new com.tencent.mm.plugin.finder.feed.ui.tk(finderSharePostUI, this.f110620e, this.f110621f));
        return jz5.f0.f302826a;
    }
}
