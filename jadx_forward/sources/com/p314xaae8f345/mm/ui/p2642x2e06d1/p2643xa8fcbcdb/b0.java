package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* loaded from: classes11.dex */
public class b0 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b f279325d;

    public b0(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b abstractActivityC21555x39071a9b) {
        this.f279325d = abstractActivityC21555x39071a9b;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        android.widget.ListView listView;
        android.widget.ListView listView2;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var2;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var3;
        android.widget.ListView listView3;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var4;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b abstractActivityC21555x39071a9b = this.f279325d;
        listView = abstractActivityC21555x39071a9b.f39410x32b09e;
        if (i17 < listView.getHeaderViewsCount()) {
            return false;
        }
        listView2 = abstractActivityC21555x39071a9b.f39410x32b09e;
        int headerViewsCount = i17 - listView2.getHeaderViewsCount();
        h0Var = abstractActivityC21555x39071a9b.f39403xbb6ca34f;
        if (headerViewsCount >= h0Var.getCount()) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(headerViewsCount);
            h0Var4 = abstractActivityC21555x39071a9b.f39403xbb6ca34f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b.TAG, "itemlongclick, outofindex, %d, %d", valueOf, java.lang.Integer.valueOf(h0Var4.getCount()));
            return false;
        }
        h0Var2 = abstractActivityC21555x39071a9b.f39403xbb6ca34f;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) h0Var2.getItem(headerViewsCount);
        h0Var3 = abstractActivityC21555x39071a9b.f39403xbb6ca34f;
        listView3 = abstractActivityC21555x39071a9b.f39410x32b09e;
        return abstractActivityC21555x39071a9b.mo60896x898ea874(h0Var3, c21560x1fce98fb, listView3);
    }
}
