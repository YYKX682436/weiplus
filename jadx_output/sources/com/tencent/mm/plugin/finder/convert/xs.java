package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class xs {
    public xs(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127994w0).getValue()).r()).booleanValue();
    }

    public final boolean b(com.tencent.mm.plugin.finder.model.BaseFinderFeed item) {
        kotlin.jvm.internal.o.g(item, "item");
        if (a()) {
            nv2.o oVar = nv2.o.f340558e;
            return nv2.o.f340558e.b(item.getFeedObject().getFeedObject()) == 0;
        }
        nv2.h1 h1Var = nv2.n1.f340550g;
        return item.getFeedObject().canHideLike() && nv2.n1.f340551h.l(item.getFeedObject().getFeedObject()) == 0;
    }
}
