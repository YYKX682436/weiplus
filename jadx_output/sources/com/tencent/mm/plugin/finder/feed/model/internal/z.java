package com.tencent.mm.plugin.finder.feed.model.internal;

/* loaded from: classes2.dex */
public final class z extends androidx.recyclerview.widget.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f108074a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f108075b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.a0 f108076c;

    public z(com.tencent.mm.plugin.finder.feed.model.internal.a0 a0Var, java.util.List oldList, java.util.List newList) {
        kotlin.jvm.internal.o.g(oldList, "oldList");
        kotlin.jvm.internal.o.g(newList, "newList");
        this.f108076c = a0Var;
        this.f108074a = oldList;
        this.f108075b = newList;
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean a(int i17, int i18) {
        return this.f108076c.areContentsTheSame((com.tencent.mm.plugin.finder.feed.model.internal.r0) this.f108074a.get(i17), (com.tencent.mm.plugin.finder.feed.model.internal.r0) this.f108075b.get(i18));
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean b(int i17, int i18) {
        return this.f108076c.areItemsTheSame((com.tencent.mm.plugin.finder.feed.model.internal.r0) this.f108074a.get(i17), (com.tencent.mm.plugin.finder.feed.model.internal.r0) this.f108075b.get(i18));
    }

    @Override // androidx.recyclerview.widget.b0
    public java.lang.Object c(int i17, int i18) {
        return this.f108076c.getChangePayload((com.tencent.mm.plugin.finder.feed.model.internal.r0) this.f108074a.get(i17), (com.tencent.mm.plugin.finder.feed.model.internal.r0) this.f108075b.get(i18));
    }

    @Override // androidx.recyclerview.widget.b0
    public int d() {
        return this.f108075b.size();
    }

    @Override // androidx.recyclerview.widget.b0
    public int e() {
        return this.f108074a.size();
    }
}
