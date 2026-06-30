package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes2.dex */
public final class z0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f106040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f106041e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(int i17, java.util.HashSet hashSet) {
        super(1);
        this.f106040d = i17;
        this.f106041e = hashSet;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.extension.reddot.jb target = (com.tencent.mm.plugin.finder.extension.reddot.jb) obj;
        kotlin.jvm.internal.o.g(target, "target");
        int i17 = this.f106040d;
        java.util.HashSet hashSet = this.f106041e;
        boolean z17 = false;
        if (i17 == 1024) {
            java.lang.String field_tipsId = target.field_tipsId;
            kotlin.jvm.internal.o.f(field_tipsId, "field_tipsId");
            z17 = r26.n0.B(field_tipsId, "local_finder_msg_count", false);
            if (z17) {
                hashSet.add(target);
            }
        } else if ((target.getType() != 2 && target.getType() != 1) || target.N.getInteger(25) == 0) {
            com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = new com.tencent.mm.plugin.finder.extension.reddot.jb();
            jbVar.field_tipsId = target.field_tipsId;
            jbVar.field_ctrType = target.field_ctrType;
            r45.vs2 vs2Var = new r45.vs2();
            vs2Var.f388487e = target.field_ctrType;
            jbVar.field_ctrInfo = vs2Var;
            java.util.LinkedList linkedList = target.field_ctrInfo.f388489g;
            if (linkedList != null) {
                vs2Var.f388489g.addAll(linkedList);
            }
            hashSet.add(jbVar);
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
