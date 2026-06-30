package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes8.dex */
public class h0 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.m0 f224375d;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.m0 m0Var) {
        this.f224375d = m0Var;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.m0 m0Var = this.f224375d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.j3 j3Var = m0Var.f224463b;
        if (j3Var.f224413q == null) {
            j3Var.t();
        }
        android.widget.ListView listView = (android.widget.ListView) adapterView;
        s83.l lVar = (s83.l) m0Var.f224463b.f224413q.get(i17 - listView.getHeaderViewsCount());
        int headerViewsCount = i17 - listView.getHeaderViewsCount();
        if (lVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16128x168466e3 activityC16128x168466e3 = m0Var.f224465d;
            android.view.LayoutInflater.from(activityC16128x168466e3);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC16128x168466e3, 1, false);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            new java.util.ArrayList();
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.k0 k0Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.k0(m0Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l0 l0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l0(m0Var, lVar, headerViewsCount);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                db5.h4 h4Var = (db5.h4) ((android.view.MenuItem) it.next());
                h4Var.f309914y = null;
                h4Var.f309915z = null;
            }
            arrayList.clear();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            db5.h4 h4Var2 = new db5.h4(activityC16128x168466e3, 0, 0);
            h4Var2.f309909t = com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0;
            arrayList2.add(h4Var2);
            if (arrayList2.size() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
            } else {
                k0Var.f293405n = k0Var2;
                k0Var.f293414s = l0Var;
                k0Var.f293387d = null;
                k0Var.G = null;
                k0Var.v();
            }
        }
        return true;
    }
}
