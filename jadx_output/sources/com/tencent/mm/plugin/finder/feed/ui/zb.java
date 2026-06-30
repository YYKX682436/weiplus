package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes11.dex */
public final class zb extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSelectContactUI f110798d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSelectContactUI finderLivePostSelectContactUI) {
        super(1);
        this.f110798d = finderLivePostSelectContactUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(this.f110798d.G.contains(it));
    }
}
