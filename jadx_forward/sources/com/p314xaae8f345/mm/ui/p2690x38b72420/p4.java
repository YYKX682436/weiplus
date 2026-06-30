package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public abstract class p4 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2690x38b72420.l4 f288609d;

    /* renamed from: e, reason: collision with root package name */
    public final android.util.SparseArray f288610e = new android.util.SparseArray();

    /* renamed from: f, reason: collision with root package name */
    public boolean f288611f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f288612g;

    /* renamed from: h, reason: collision with root package name */
    public final int f288613h;

    public p4(com.p314xaae8f345.mm.ui.p2690x38b72420.l4 l4Var, boolean z17, int i17, boolean z18) {
        this.f288609d = l4Var;
        this.f288611f = z17;
        this.f288613h = i17;
        this.f288612g = z18;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return -1L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        if (getItem(i17) != null) {
            return getItem(i17).f288365a;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSelectContactAdapter", "getItemViewType: get data item fail, return unkown Type, totalCount=%d | position = %s", java.lang.Integer.valueOf(getCount()), java.lang.Integer.valueOf(i17));
        return -1;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d item = getItem(i17);
        com.p314xaae8f345.mm.ui.p2690x38b72420.l4 l4Var = this.f288609d;
        if (view == null) {
            view = item.b().a(l4Var.mo8774x19263085(), viewGroup, view);
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.b bVar = (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.b) view.getTag();
        iz5.a.d(null, bVar);
        if (!item.f288368d) {
            item.a(l4Var.mo8774x19263085(), bVar);
            item.f288368d = true;
        }
        item.f288369e = p();
        item.f288370f = l4Var.W5(item);
        item.f288380p = l4Var.A2(item);
        item.b().c(l4Var.mo8774x19263085(), bVar, item, l4Var.p5(item), l4Var.t4(item));
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 10;
    }

    public void h() {
        android.util.SparseArray sparseArray = this.f288610e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public abstract com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d j(int i17);

    public void k() {
        h();
    }

    @Override // android.widget.Adapter
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d getItem(int i17) {
        android.util.SparseArray sparseArray = this.f288610e;
        if (sparseArray.indexOfKey(i17) >= 0) {
            return (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d) sparseArray.get(i17);
        }
        if (i17 < 0 || i17 >= getCount()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSelectContactAdapter", "getItem Occur error !!!!!!!!! position = %d", java.lang.Integer.valueOf(i17));
            return null;
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d j17 = j(i17);
        if (j17 != null) {
            j17.f288373i = o(j17);
            sparseArray.put(i17, j17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSelectContactAdapter", "createDataItem Occur error !!!!!!!!! position = %d", java.lang.Integer.valueOf(i17));
        }
        return j17;
    }

    public int m() {
        return 0;
    }

    public boolean n(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        return false;
    }

    public boolean o(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        return false;
    }

    public boolean p() {
        return this.f288611f;
    }

    public void q(boolean z17) {
        this.f288611f = z17;
        notifyDataSetChanged();
    }
}
