package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes8.dex */
public final class uw implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f104744a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f104745b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RefreshLoadMoreLayout f104746c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f104747d;

    public uw(kotlin.jvm.internal.h0 h0Var, java.util.ArrayList arrayList, com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout, android.content.Context context) {
        this.f104744a = h0Var;
        this.f104745b = arrayList;
        this.f104746c = refreshLoadMoreLayout;
        this.f104747d = context;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.LinkedList list;
        java.util.LinkedList list2;
        java.util.LinkedList<r45.pg2> list3;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            r45.n81 n81Var = (r45.n81) fVar.f70618d;
            this.f104744a.f310123d = n81Var.getByteString(2);
            java.util.ArrayList arrayList = this.f104745b;
            int size = arrayList.size();
            r45.wg2 wg2Var = (r45.wg2) ((r45.n81) fVar.f70618d).getCustom(1);
            int i17 = 0;
            if (wg2Var != null && (list3 = wg2Var.getList(0)) != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (r45.pg2 pg2Var : list3) {
                    cu2.a0 a0Var = cu2.b0.f222371a;
                    kotlin.jvm.internal.o.d(pg2Var);
                    arrayList2.add(a0Var.k(1, pg2Var, xy2.c.e(this.f104747d)));
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(new so2.y((dm.pd) it.next()));
                }
                arrayList.addAll(arrayList3);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadmore mentionList: ");
            r45.wg2 wg2Var2 = (r45.wg2) ((r45.n81) fVar.f70618d).getCustom(1);
            sb6.append((wg2Var2 == null || (list2 = wg2Var2.getList(0)) == null) ? null : java.lang.Integer.valueOf(list2.size()));
            com.tencent.mars.xlog.Log.i("FinderSupportAggregatedMsgConvert", sb6.toString());
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f104746c;
            androidx.recyclerview.widget.f2 adapter = refreshLoadMoreLayout.getRecyclerView().getAdapter();
            if (adapter != null) {
                adapter.notifyItemRangeInserted(size, arrayList.size() - size);
            }
            if (n81Var.getInteger(6) == 1) {
                r45.wg2 wg2Var3 = (r45.wg2) n81Var.getCustom(1);
                if (wg2Var3 != null && (list = wg2Var3.getList(0)) != null) {
                    i17 = list.size();
                }
                refreshLoadMoreLayout.N(i17);
            } else {
                com.tencent.mm.view.RefreshLoadMoreLayout.I(refreshLoadMoreLayout, null, 1, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
