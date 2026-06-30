package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment f107713d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment) {
        super(0);
        this.f107713d = finderHomeTabFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        cw2.f8 U6;
        dw2.c0 c0Var;
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment fragment = this.f107713d;
        kotlin.jvm.internal.o.g(fragment, "fragment");
        com.tencent.mm.plugin.finder.viewmodel.component.t80 t80Var = (com.tencent.mm.plugin.finder.viewmodel.component.t80) pf5.z.f353948a.b(fragment).e(com.tencent.mm.plugin.finder.viewmodel.component.t80.class);
        if (t80Var != null && (U6 = t80Var.U6()) != null && (c0Var = U6.f223703n) != null) {
            c0Var.w0("GetCommentDetail");
        }
        return jz5.f0.f302826a;
    }
}
