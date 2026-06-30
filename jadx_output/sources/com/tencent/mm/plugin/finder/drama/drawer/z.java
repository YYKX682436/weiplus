package com.tencent.mm.plugin.finder.drama.drawer;

/* loaded from: classes2.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.drama.drawer.e0 f105287d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qj2 f105288e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.plugin.finder.drama.drawer.e0 e0Var, r45.qj2 qj2Var) {
        super(1);
        this.f105287d = e0Var;
        this.f105288e = qj2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.drama.drawer.e0 e0Var;
        r45.yj2 resp = (r45.yj2) obj;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.util.Iterator it = resp.getList(1).iterator();
        int i17 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            e0Var = this.f105287d;
            if (!hasNext) {
                break;
            }
            int i18 = i17 + 1;
            r45.kt4 kt4Var = (r45.kt4) it.next();
            java.util.LinkedList list = kt4Var.getList(3);
            if (list != null) {
                pm0.v.d0(list, new com.tencent.mm.plugin.finder.drama.drawer.y(this.f105288e));
            }
            if (!(list == null || list.isEmpty())) {
                java.util.ArrayList arrayList = e0Var.f105227q;
                int integer = kt4Var.getInteger(0);
                java.lang.String string = integer != 1 ? integer != 2 ? "" : e0Var.getContext().getString(com.tencent.mm.R.string.oxe) : e0Var.getContext().getString(com.tencent.mm.R.string.oxd);
                kotlin.jvm.internal.o.d(string);
                arrayList.add(new zb2.d(null, true, string, i17, kt4Var.getInteger(0)));
                java.util.ArrayList arrayList2 = e0Var.f105227q;
                kotlin.jvm.internal.o.d(list);
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list, 10));
                java.util.Iterator it6 = list.iterator();
                while (it6.hasNext()) {
                    arrayList3.add(new zb2.d((r45.fl5) it6.next(), false, "", 0L, kt4Var.getInteger(0)));
                }
                arrayList2.addAll(arrayList3);
            }
            i17 = i18;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = e0Var.f105223m;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recommendRv");
            throw null;
        }
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        return jz5.f0.f302826a;
    }
}
