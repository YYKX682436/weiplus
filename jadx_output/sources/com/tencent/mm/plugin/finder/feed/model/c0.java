package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.l0 f107741d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.tencent.mm.plugin.finder.feed.model.l0 l0Var) {
        super(0);
        this.f107741d = l0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.appcompat.app.AppCompatActivity activity = this.f107741d.f108125g;
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        pm0.v.V(500L, new com.tencent.mm.plugin.finder.feed.model.b0(((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) a17).getActiveFragment()));
        return jz5.f0.f302826a;
    }
}
