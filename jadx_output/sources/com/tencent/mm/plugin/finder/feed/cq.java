package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class cq extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.kr f106500d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq(com.tencent.mm.plugin.finder.feed.kr krVar) {
        super(2);
        this.f106500d = krVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        ((java.lang.Number) obj2).intValue();
        com.tencent.mm.plugin.finder.feed.xr xrVar = this.f106500d.f107247x;
        if (xrVar != null) {
            androidx.recyclerview.widget.RecyclerView recyclerView = xrVar.getRecyclerView();
            recyclerView.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.plugin.finder.feed.bq(recyclerView, intValue, recyclerView));
        }
        return jz5.f0.f302826a;
    }
}
