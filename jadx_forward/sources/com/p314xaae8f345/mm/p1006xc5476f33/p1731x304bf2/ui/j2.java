package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes14.dex */
public final class j2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.e1 f222969d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.e1 e1Var) {
        super(1);
        this.f222969d = e1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.v0 item = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.v0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.String str = item.f223326a;
        int hashCode = str.hashCode();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.e1 e1Var = this.f222969d;
        if (hashCode != -1651158469) {
            if (hashCode != -1185862858) {
                if (hashCode == -390731183 && str.equals("reddot_mock")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.j1 j1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.j1.f222968b;
                    e1Var.getClass();
                    e1Var.f222904a.add(j1Var);
                }
            } else if (str.equals("reddot_control")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.i1 i1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.i1.f222948b;
                e1Var.getClass();
                e1Var.f222904a.add(i1Var);
            }
        } else if (str.equals("reddot_switch")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.k1 k1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.k1.f222976b;
            e1Var.getClass();
            e1Var.f222904a.add(k1Var);
        }
        return jz5.f0.f384359a;
    }
}
