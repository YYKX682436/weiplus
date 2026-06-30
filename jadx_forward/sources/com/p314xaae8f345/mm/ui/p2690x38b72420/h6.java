package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class h6 implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.i6 f288287d;

    public h6(com.p314xaae8f345.mm.ui.p2690x38b72420.i6 i6Var) {
        this.f288287d = i6Var;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        int i17 = vVar.f432691c;
        com.p314xaae8f345.mm.ui.p2690x38b72420.i6 i6Var = this.f288287d;
        p13.u uVar = vVar.f432689a;
        if (i17 == -3 || i17 == -2 || i17 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiSearchContactAdapter", "search query:%s, err:%s", uVar.f432674c, java.lang.Integer.valueOf(i17));
            if (uVar.f432674c.equals(i6Var.f288333u.get(i6Var.f288334v))) {
                i6Var.w();
                return;
            }
            return;
        }
        if (i17 != 0 || i6Var.f288332t == null || vVar.f432692d == null) {
            return;
        }
        java.util.List list = vVar.f432693e;
        java.util.List list2 = i6Var.f288331s;
        if (list2 != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                p13.y yVar = (p13.y) list.get(size);
                if (!list2.contains(yVar.f432720e)) {
                    int i18 = yVar.f432717b;
                    if (i18 == 131072 || i18 == 131075 || i18 == 131076 || i18 == 2097171 || i18 == 2097173 || i18 == 131081) {
                    }
                }
                list.remove(size);
            }
        }
        java.lang.String str = vVar.f432692d.f432662a;
        if (((java.util.HashMap) i6Var.f288326n).get(str) == null) {
            ((java.util.HashMap) i6Var.f288326n).put(str, new java.util.LinkedList());
            if (((java.util.HashMap) i6Var.f288327o).get(str) == null) {
                ((java.util.HashMap) i6Var.f288327o).put(str, java.lang.Boolean.FALSE);
            }
            ((java.util.HashMap) i6Var.f288328p).put(str, vVar.f432692d);
        }
        if (vVar.f432693e.size() > 0) {
            if (((p13.y) vVar.f432693e.get(0)).f432717b != 131072) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiSearchContactAdapter", "not support search type");
            } else {
                ((java.util.List) ((java.util.HashMap) i6Var.f288326n).get(vVar.f432692d.f432662a)).addAll(vVar.f432693e);
            }
        }
        i6Var.A(uVar.f432674c, i6Var.w(), true);
    }
}
