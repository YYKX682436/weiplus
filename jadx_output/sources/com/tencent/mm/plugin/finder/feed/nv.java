package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class nv extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.xv f108600d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv(com.tencent.mm.plugin.finder.feed.xv xvVar) {
        super(1);
        this.f108600d = xvVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse it = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (it.getPullType() != 2) {
            r45.lw0 lw0Var = (r45.lw0) ((com.tencent.mm.plugin.finder.feed.model.o8) it).f108230a;
            com.tencent.mm.plugin.finder.feed.xv xvVar = this.f108600d;
            xvVar.f111112n = lw0Var;
            xvVar.f();
        }
        return jz5.f0.f302826a;
    }
}
