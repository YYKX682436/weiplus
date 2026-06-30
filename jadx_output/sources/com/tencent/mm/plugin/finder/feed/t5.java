package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class t5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f109038d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f109039e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(com.tencent.mm.plugin.finder.feed.a7 a7Var, int i17) {
        super(1);
        this.f109038d = a7Var;
        this.f109039e = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.jb4 info = (r45.jb4) obj;
        kotlin.jvm.internal.o.g(info, "info");
        r45.ac4 ac4Var = new r45.ac4();
        r45.my0 my0Var = (r45.my0) info.getCustom(2);
        ac4Var.set(1, my0Var != null ? (com.tencent.mm.protocal.protobuf.FinderJumpInfo) my0Var.getCustom(2) : null);
        ac4Var.set(4, 1);
        r45.my0 my0Var2 = (r45.my0) info.getCustom(2);
        com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f109038d;
        com.tencent.mm.plugin.finder.feed.a7.z(a7Var, my0Var2, true);
        if (this.f109039e == 40) {
            android.content.Context context = a7Var.f106207d;
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            com.tencent.mm.plugin.finder.report.s0.f125340b = nyVar != null ? nyVar.f135382p : null;
        }
        i95.m c17 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.yb.Yi((c61.yb) c17, a7Var.f106207d, ac4Var, null, null, 8, null);
        return jz5.f0.f302826a;
    }
}
