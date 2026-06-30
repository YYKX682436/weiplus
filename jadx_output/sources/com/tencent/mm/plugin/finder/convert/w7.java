package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public abstract class w7 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final tc2.b f104851e = new tc2.b(this, n());

    @Override // in5.r
    public void j(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.j(recyclerView);
        tc2.b bVar = this.f104851e;
        bVar.getClass();
        pm0.v.X(new tc2.a(bVar));
    }

    public java.util.List n() {
        return kz5.b0.c(sb2.a.class);
    }

    public void o(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed item, int i17, int i18, boolean z17, java.util.List list) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        this.f104851e.d(holder, item, i17, i18, z17, list);
    }

    public boolean p() {
        return false;
    }
}
