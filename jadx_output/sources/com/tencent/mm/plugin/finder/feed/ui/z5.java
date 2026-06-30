package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class z5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.a6 f110792a;

    public z5(com.tencent.mm.plugin.finder.feed.ui.a6 a6Var) {
        this.f110792a = a6Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.finder.feed.ui.a6 a6Var = this.f110792a;
        int i17 = fVar.f70616b;
        int i18 = fVar.f70615a;
        java.util.LinkedList list = ((r45.ou2) fVar.f70618d).getList(1);
        kotlin.jvm.internal.o.f(list, "getObject_list(...)");
        com.tencent.mm.plugin.finder.feed.ui.a6.c(a6Var, i17, i18, list, ((r45.ou2) fVar.f70618d).getInteger(2), ((r45.ou2) fVar.f70618d).getByteString(3));
        return jz5.f0.f302826a;
    }
}
