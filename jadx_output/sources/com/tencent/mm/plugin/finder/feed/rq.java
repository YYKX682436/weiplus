package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class rq implements cw2.b8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.kr f108939a;

    public rq(com.tencent.mm.plugin.finder.feed.kr krVar) {
        this.f108939a = krVar;
    }

    @Override // cw2.b8
    public boolean a() {
        return true;
    }

    @Override // cw2.b8
    public dw2.b0 b() {
        return new dw2.o();
    }

    @Override // cw2.b8
    public boolean c() {
        return true;
    }

    @Override // cw2.b8
    public androidx.recyclerview.widget.RecyclerView d() {
        com.tencent.mm.plugin.finder.feed.xr xrVar = this.f108939a.f107247x;
        kotlin.jvm.internal.o.d(xrVar);
        return xrVar.getRecyclerView();
    }

    @Override // cw2.b8
    public com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer getData() {
        return this.f108939a.m().getDataList();
    }
}
