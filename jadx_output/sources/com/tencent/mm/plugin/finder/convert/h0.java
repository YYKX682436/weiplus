package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f103533a;

    public h0(com.tencent.mm.plugin.finder.convert.n0 n0Var, in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed item) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new com.tencent.mm.plugin.finder.ui.f2(holder, item));
        arrayList.add(new com.tencent.mm.plugin.finder.ui.d2(holder, item, n0Var.f104052g));
        arrayList.add(new com.tencent.mm.plugin.finder.ui.b2(holder, item));
        arrayList.add(new com.tencent.mm.plugin.finder.convert.g0(holder, item, n0Var.f104051f, null, 8, null));
        if (!item.getFeedObject().isLive()) {
            arrayList.add(new com.tencent.mm.plugin.finder.ui.a2(holder, item, n0Var.f104051f, n0Var.f104052g));
        }
        this.f103533a = arrayList;
    }
}
