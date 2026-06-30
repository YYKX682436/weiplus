package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class ky implements cw2.b8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ct f107258a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f107259b;

    public ky(com.tencent.mm.plugin.finder.feed.ct ctVar, com.tencent.mm.plugin.finder.feed.pz pzVar) {
        this.f107258a = ctVar;
        this.f107259b = pzVar;
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
        return ((com.tencent.mm.plugin.finder.feed.v00) this.f107258a).getRecyclerView();
    }

    @Override // cw2.b8
    public com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer getData() {
        return this.f107259b.C.getDataListJustForAdapter();
    }
}
