package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes3.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.uic.o f101909d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.finder.activity.uic.o oVar) {
        super(1);
        this.f101909d = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("FinderActivityEventUIC", "setAnnounceView");
        hc2.i.h(this.f101909d.getContext());
        return jz5.f0.f302826a;
    }
}
