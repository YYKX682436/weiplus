package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class sa implements cw2.b8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.xa f108980a;

    public sa(com.tencent.mm.plugin.finder.feed.xa xaVar) {
        this.f108980a = xaVar;
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
        return this.f108980a.f106180m.getRecyclerView();
    }

    @Override // cw2.b8
    public com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer getData() {
        return this.f108980a.z().f107156e.getDataListJustForAdapter();
    }
}
