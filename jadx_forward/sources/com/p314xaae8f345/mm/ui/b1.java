package com.p314xaae8f345.mm.ui;

/* loaded from: classes9.dex */
public class b1 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.d1 f278736a;

    public b1(com.p314xaae8f345.mm.ui.d1 d1Var) {
        this.f278736a = d1Var;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public void mo2289xd6191dc1(boolean z17) {
        com.p314xaae8f345.mm.ui.d1 d1Var = this.f278736a;
        com.p314xaae8f345.mm.ui.c1 c1Var = d1Var.f289854b;
        if (c1Var != null) {
            com.p314xaae8f345.mm.ui.a1 a1Var = d1Var.f289853a;
            com.p314xaae8f345.mm.ui.z0 z0Var = (com.p314xaae8f345.mm.ui.z0) c1Var;
            if (a1Var == null) {
                z0Var.getClass();
                return;
            }
            com.p314xaae8f345.mm.ui.f1 f1Var = z0Var.f294129a;
            java.util.Iterator it = f1Var.f289941e.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.ui.a1 a1Var2 = (com.p314xaae8f345.mm.ui.a1) it.next();
                if (a1Var2 != null) {
                    java.lang.String str = a1Var2.f278645a;
                    boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (str == null) {
                        str = "";
                    }
                    if (str.equals(a1Var.f278645a)) {
                        boolean z19 = a1Var.f278648d;
                        java.util.LinkedList linkedList = f1Var.f289942f;
                        if (z19 != z17) {
                            linkedList.add(a1Var2);
                            return;
                        } else {
                            linkedList.remove(a1Var2);
                            return;
                        }
                    }
                }
            }
        }
    }
}
