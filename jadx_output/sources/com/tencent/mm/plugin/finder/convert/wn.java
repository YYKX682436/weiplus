package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class wn extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.k8 f104886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.yn f104887e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn(com.tencent.mm.plugin.finder.feed.k8 k8Var, com.tencent.mm.plugin.finder.convert.yn ynVar) {
        super(0);
        this.f104886d = k8Var;
        this.f104887e = ynVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.tencent.mm.plugin.finder.convert.FinderLongVideoConvert$tmpRecyclerView$2$1$2] */
    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.recyclerview.widget.RecyclerView recyclerView = new androidx.recyclerview.widget.RecyclerView(this.f104886d.getActivity(), null);
        final com.tencent.mm.plugin.finder.convert.yn ynVar = this.f104887e;
        recyclerView.setAdapter(new com.tencent.mm.plugin.finder.convert.vn(new in5.s() { // from class: com.tencent.mm.plugin.finder.convert.FinderLongVideoConvert$tmpRecyclerView$2$1$2
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return com.tencent.mm.plugin.finder.convert.yn.this;
            }
        }, (java.util.ArrayList) ((jz5.n) ynVar.f105028z1).getValue()));
        return recyclerView;
    }
}
