package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class o3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f104148e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f104149f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f104150g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(in5.s0 s0Var, java.lang.String str, so2.y0 y0Var, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        super(1);
        this.f104147d = s0Var;
        this.f104148e = str;
        this.f104149f = y0Var;
        this.f104150g = finderJumpInfo;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        qs2.e eVar = new qs2.e(((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.E8).getValue()).r()).intValue() == 1 ? 2 : 1, 48, 25);
        eVar.f366265g = this.f104148e;
        com.tencent.mm.plugin.finder.storage.yj0 yj0Var = this.f104149f.f410703d;
        eVar.f366262d = yj0Var.field_feedId;
        eVar.f366263e = yj0Var.field_dupFlag;
        eVar.f366275q = true;
        xc2.y2.f453343a.y(this.f104150g);
        i95.m c17 = i95.n0.c(w40.e.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        android.content.Context context = this.f104147d.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        w40.e.Df((w40.e) c17, context, eVar, null, 4, null);
        return jz5.f0.f302826a;
    }
}
