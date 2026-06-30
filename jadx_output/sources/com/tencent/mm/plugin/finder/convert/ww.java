package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes8.dex */
public final class ww extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f104910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f104911e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RefreshLoadMoreLayout f104912f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f104913g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f104914h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f104915i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f104916m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww(com.tencent.mm.modelbase.f fVar, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout, android.view.View view, android.content.Context context, com.tencent.mm.ui.widget.dialog.y1 y1Var, java.util.ArrayList arrayList) {
        super(0);
        this.f104910d = fVar;
        this.f104911e = h0Var;
        this.f104912f = refreshLoadMoreLayout;
        this.f104913g = view;
        this.f104914h = context;
        this.f104915i = y1Var;
        this.f104916m = arrayList;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList list;
        java.util.LinkedList list2;
        java.util.LinkedList<r45.pg2> list3;
        com.tencent.mm.modelbase.f fVar = this.f104910d;
        int i17 = fVar.f70615a;
        android.content.Context context = this.f104914h;
        if (i17 == 0 && fVar.f70616b == 0) {
            r45.n81 n81Var = (r45.n81) fVar.f70618d;
            this.f104911e.f310123d = n81Var.getByteString(2);
            r45.wg2 wg2Var = (r45.wg2) ((r45.n81) fVar.f70618d).getCustom(1);
            int i18 = 0;
            if (wg2Var != null && (list3 = wg2Var.getList(0)) != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (r45.pg2 pg2Var : list3) {
                    cu2.a0 a0Var = cu2.b0.f222371a;
                    kotlin.jvm.internal.o.d(pg2Var);
                    arrayList.add(a0Var.k(1, pg2Var, xy2.c.e(context)));
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new so2.y((dm.pd) it.next()));
                }
                this.f104916m.addAll(arrayList2);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refresh mentionList: ");
            r45.wg2 wg2Var2 = (r45.wg2) ((r45.n81) fVar.f70618d).getCustom(1);
            sb6.append((wg2Var2 == null || (list2 = wg2Var2.getList(0)) == null) ? null : java.lang.Integer.valueOf(list2.size()));
            com.tencent.mars.xlog.Log.i("FinderSupportAggregatedMsgConvert", sb6.toString());
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f104912f;
            androidx.recyclerview.widget.f2 adapter = refreshLoadMoreLayout.getRecyclerView().getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
            android.view.View view = this.f104913g;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderSupportAggregatedMsgConvert$showAggregatedMentionList$1$5$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/FinderSupportAggregatedMsgConvert$showAggregatedMentionList$1$5$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (n81Var.getInteger(6) == 1) {
                r45.wg2 wg2Var3 = (r45.wg2) n81Var.getCustom(1);
                if (wg2Var3 != null && (list = wg2Var3.getList(0)) != null) {
                    i18 = list.size();
                }
                refreshLoadMoreLayout.P(i18);
            } else {
                com.tencent.mm.view.RefreshLoadMoreLayout.I(refreshLoadMoreLayout, null, 1, null);
            }
        } else {
            db5.t7.m(context, fVar.f70617c);
            this.f104915i.q();
        }
        return jz5.f0.f302826a;
    }
}
