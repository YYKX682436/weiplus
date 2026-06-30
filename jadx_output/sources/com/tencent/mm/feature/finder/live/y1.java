package com.tencent.mm.feature.finder.live;

/* loaded from: classes8.dex */
public final class y1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s40.s0 f67042d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(s40.s0 s0Var) {
        super(1);
        this.f67042d = s0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.Map hashMap;
        java.util.LinkedList<r45.dl2> list;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar == null) {
            return null;
        }
        int i17 = fVar.f70615a;
        s40.s0 s0Var = this.f67042d;
        if (i17 != 0 || fVar.f70616b != 0) {
            ((com.tencent.mm.plugin.taskbar.ui.e2) s0Var).a(new java.util.HashMap(), 0);
            return fVar;
        }
        r45.ov0 ov0Var = (r45.ov0) fVar.f70618d;
        if (ov0Var == null || (list = ov0Var.getList(1)) == null) {
            hashMap = new java.util.HashMap();
        } else {
            int d17 = kz5.b1.d(kz5.d0.q(list, 10));
            if (d17 < 16) {
                d17 = 16;
            }
            hashMap = new java.util.LinkedHashMap(d17);
            for (r45.dl2 dl2Var : list) {
                java.lang.Long valueOf = java.lang.Long.valueOf(dl2Var.getLong(0));
                r45.nw1 nw1Var = (r45.nw1) dl2Var.getCustom(1);
                hashMap.put(valueOf, java.lang.Integer.valueOf(nw1Var != null ? nw1Var.getInteger(2) : 1));
            }
        }
        ((com.tencent.mm.plugin.taskbar.ui.e2) s0Var).a(hashMap, ((r45.ov0) fVar.f70618d).getInteger(3));
        return fVar;
    }
}
