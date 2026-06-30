package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class j3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f107075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f107076e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f107077f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(java.util.LinkedList linkedList, com.tencent.mm.plugin.finder.feed.a7 a7Var, so2.y0 y0Var) {
        super(1);
        this.f107075d = linkedList;
        this.f107076e = a7Var;
        this.f107077f = y0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        fp0.r task = (fp0.r) obj;
        kotlin.jvm.internal.o.g(task, "task");
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.i3(this.f107075d, this.f107076e, task, this.f107077f));
        return jz5.f0.f302826a;
    }
}
