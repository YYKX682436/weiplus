package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class a0 implements cw2.b8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.c0 f106172a;

    public a0(com.tencent.mm.plugin.finder.feed.c0 c0Var) {
        this.f106172a = c0Var;
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
        com.tencent.mm.plugin.finder.feed.i0 i0Var = this.f106172a.f106424g;
        kotlin.jvm.internal.o.d(i0Var);
        return i0Var.getRecyclerView();
    }

    @Override // cw2.b8
    public com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer getData() {
        return this.f106172a.y();
    }
}
