package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class ip extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.kr f107047d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip(com.tencent.mm.plugin.finder.feed.kr krVar) {
        super(0);
        this.f107047d = krVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.recyclerview.widget.f2 adapter;
        com.tencent.mm.plugin.finder.feed.xr xrVar = this.f107047d.f107247x;
        if (xrVar != null && (adapter = xrVar.getRecyclerView().getAdapter()) != null) {
            adapter.notifyItemChanged(0, new jz5.l(12, null));
        }
        return jz5.f0.f302826a;
    }
}
