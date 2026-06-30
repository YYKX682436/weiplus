package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class up extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm.pd f104729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.xp f104730e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up(dm.pd pdVar, com.tencent.mm.plugin.finder.convert.xp xpVar) {
        super(1);
        this.f104729d = pdVar;
        this.f104730e = xpVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.t31 resp = (r45.t31) obj;
        kotlin.jvm.internal.o.g(resp, "resp");
        dm.pd pdVar = this.f104729d;
        pdVar.field_extFlag |= 4;
        cu2.a0 a0Var = cu2.b0.f222371a;
        com.tencent.mm.plugin.finder.convert.xp xpVar = this.f104730e;
        com.tencent.mars.xlog.Log.i(xpVar.f104968i, "requestFinderFollowVerify succ, id:" + pdVar.field_id + ", modify extFlag:" + pdVar.field_extFlag + ", updateDb ret:" + a0Var.l(pdVar, xpVar.f104967h.f103851a));
        return jz5.f0.f302826a;
    }
}
