package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes2.dex */
public final class o3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.extension.reddot.o3 f105737d = new com.tencent.mm.plugin.finder.extension.reddot.o3();

    public o3() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        boolean z17;
        boolean z18 = false;
        r45.vs2 vs2Var = (r45.vs2) ((r45.gz2) obj).getCustom(0);
        if (vs2Var != null && (linkedList = vs2Var.f388489g) != null) {
            if (!linkedList.isEmpty()) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    if (kotlin.jvm.internal.o.b(((r45.f03) it.next()).f373892i, "FinderEntrance")) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            if (z17) {
                z18 = true;
            }
        }
        return java.lang.Boolean.valueOf(z18);
    }
}
