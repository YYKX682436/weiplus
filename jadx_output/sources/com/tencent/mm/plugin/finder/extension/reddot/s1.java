package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class s1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.w1 f105836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.jb f105837e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(com.tencent.mm.plugin.finder.extension.reddot.w1 w1Var, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar) {
        super(0);
        this.f105836d = w1Var;
        this.f105837e = jbVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        zy2.fa aj6 = this.f105836d.aj();
        r45.vs2 vs2Var = new r45.vs2();
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = this.f105837e;
        vs2Var.parseFrom(jbVar.field_ctrInfo.toByteArray());
        java.util.LinkedList linkedList = vs2Var.f388489g;
        r45.f03 f03Var = new r45.f03();
        f03Var.f373887d = 1;
        f03Var.f373891h = 1;
        f03Var.f373892i = "Discovery";
        f03Var.f373906z = jbVar.field_username;
        linkedList.add(f03Var);
        aj6.w(vs2Var, "Finder.NewDiscoveryRedDotHandler");
        return jz5.f0.f302826a;
    }
}
