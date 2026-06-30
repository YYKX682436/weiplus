package com.p314xaae8f345.mm.ui.p2708x5ccaae3b;

/* loaded from: classes15.dex */
public class h extends android.widget.BaseAdapter {

    /* renamed from: n, reason: collision with root package name */
    public static boolean f290273n;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2708x5ccaae3b.b f290274d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f290275e;

    /* renamed from: f, reason: collision with root package name */
    public int f290276f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2708x5ccaae3b.C22410xc19c546b f290277g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f290278h;

    /* renamed from: i, reason: collision with root package name */
    public int f290279i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View[] f290280m;

    public h(android.content.Context context, com.p314xaae8f345.mm.ui.p2708x5ccaae3b.C22410xc19c546b c22410xc19c546b, com.p314xaae8f345.mm.ui.p2708x5ccaae3b.b bVar) {
        com.p314xaae8f345.mm.ui.p2708x5ccaae3b.c cVar = new com.p314xaae8f345.mm.ui.p2708x5ccaae3b.c(this);
        this.f290278h = new java.util.ArrayList();
        this.f290279i = 1;
        this.f290275e = context;
        this.f290274d = bVar;
        this.f290277g = c22410xc19c546b;
        bVar.registerDataSetObserver(cVar);
    }

    public long a(int i17) {
        return c(i17).f290266a;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    public com.p314xaae8f345.mm.ui.p2708x5ccaae3b.f c(int i17) {
        com.p314xaae8f345.mm.ui.p2708x5ccaae3b.b bVar = this.f290274d;
        int e17 = bVar.e();
        if (e17 == 0) {
            return i17 >= bVar.getCount() ? new com.p314xaae8f345.mm.ui.p2708x5ccaae3b.f(this, -1, 0) : new com.p314xaae8f345.mm.ui.p2708x5ccaae3b.f(this, i17, 0);
        }
        int i18 = i17;
        int i19 = 0;
        while (i19 < e17) {
            int b17 = bVar.b(i19);
            if (i17 == 0) {
                return new com.p314xaae8f345.mm.ui.p2708x5ccaae3b.f(this, -2, i19);
            }
            int i27 = this.f290279i;
            int i28 = i17 - i27;
            if (i28 < 0) {
                return new com.p314xaae8f345.mm.ui.p2708x5ccaae3b.f(this, -1, i19);
            }
            int i29 = i18 - i27;
            if (i28 < b17) {
                return new com.p314xaae8f345.mm.ui.p2708x5ccaae3b.f(this, i29, i19);
            }
            int b18 = bVar.b(i19);
            int i37 = this.f290279i;
            int i38 = b18 % i37;
            int i39 = i38 == 0 ? 0 : i37 - i38;
            i18 = i29 - i39;
            i17 = i28 - (b17 + i39);
            i19++;
        }
        return new com.p314xaae8f345.mm.ui.p2708x5ccaae3b.f(this, -1, i19);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        this.f290276f = 0;
        com.p314xaae8f345.mm.ui.p2708x5ccaae3b.b bVar = this.f290274d;
        int e17 = bVar.e();
        if (e17 == 0) {
            return bVar.getCount();
        }
        for (int i17 = 0; i17 < e17; i17++) {
            int i18 = this.f290276f;
            int b17 = bVar.b(i17);
            int b18 = bVar.b(i17);
            int i19 = this.f290279i;
            int i27 = b18 % i19;
            this.f290276f = i18 + b17 + (i27 == 0 ? 0 : i19 - i27) + i19;
        }
        return this.f290276f;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        int i18 = c(i17).f290267b;
        if (i18 == -1 || i18 == -2) {
            return null;
        }
        return this.f290274d.getItem(i18);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        int i18 = c(i17).f290267b;
        if (i18 == -2) {
            return -1L;
        }
        if (i18 == -1) {
            return -2L;
        }
        return this.f290274d.getItemId(i18);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        int i18 = c(i17).f290267b;
        if (i18 == -2) {
            return 1;
        }
        if (i18 == -1) {
            return 0;
        }
        int itemViewType = this.f290274d.getItemViewType(i18);
        return itemViewType == -1 ? itemViewType : itemViewType + 2;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.ui.p2708x5ccaae3b.g gVar;
        android.view.View view2;
        if (view instanceof com.p314xaae8f345.mm.ui.p2708x5ccaae3b.g) {
            com.p314xaae8f345.mm.ui.p2708x5ccaae3b.g gVar2 = (com.p314xaae8f345.mm.ui.p2708x5ccaae3b.g) view;
            gVar = gVar2;
            view = gVar2.getChildAt(0);
        } else {
            gVar = null;
        }
        com.p314xaae8f345.mm.ui.p2708x5ccaae3b.f c17 = c(i17);
        com.p314xaae8f345.mm.ui.p2708x5ccaae3b.b bVar = this.f290274d;
        android.content.Context context = this.f290275e;
        int i18 = c17.f290267b;
        if (i18 == -2) {
            com.p314xaae8f345.mm.ui.p2708x5ccaae3b.e eVar = new com.p314xaae8f345.mm.ui.p2708x5ccaae3b.e(this, context);
            eVar.m80677xb65aa577(this.f290277g.getWidth());
            int i19 = c17.f290266a;
            eVar.m80676x34191b0a(i19);
            eVar.setTag(bVar.i(i19, (android.view.View) eVar.getTag(), viewGroup));
            view2 = eVar;
        } else if (i18 == -1) {
            com.p314xaae8f345.mm.ui.p2708x5ccaae3b.d dVar = (com.p314xaae8f345.mm.ui.p2708x5ccaae3b.d) view;
            view2 = dVar;
            if (dVar == null) {
                view2 = new com.p314xaae8f345.mm.ui.p2708x5ccaae3b.d(this, context);
            }
        } else {
            view2 = bVar.getView(i18, view, viewGroup);
        }
        if (gVar == null) {
            gVar = new com.p314xaae8f345.mm.ui.p2708x5ccaae3b.g(this, context);
        }
        gVar.removeAllViews();
        gVar.addView(view2);
        gVar.m80680xa32537ab(i17);
        gVar.m80679xadeea779(this.f290279i);
        android.view.View[] viewArr = this.f290280m;
        int i27 = i17 % this.f290279i;
        viewArr[i27] = gVar;
        if (i27 == 0) {
            f290273n = true;
            int i28 = 1;
            while (true) {
                android.view.View[] viewArr2 = this.f290280m;
                if (i28 >= viewArr2.length) {
                    break;
                }
                viewArr2[i28] = getView(i17 + i28, null, viewGroup);
                i28++;
            }
            f290273n = false;
        }
        gVar.m80681xa3891029(this.f290280m);
        if (!f290273n) {
            int i29 = this.f290279i;
            if (i17 % i29 == i29 - 1 || i17 == getCount() - 1) {
                android.view.View[] viewArr3 = new android.view.View[this.f290279i];
                this.f290280m = viewArr3;
                java.util.Arrays.fill(viewArr3, (java.lang.Object) null);
            }
        }
        return gVar;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return this.f290274d.getViewTypeCount() + 2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return this.f290274d.hasStableIds();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean isEmpty() {
        return this.f290274d.isEmpty();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i17) {
        int i18 = c(i17).f290267b;
        if (i18 == -1 || i18 == -2) {
            return false;
        }
        return this.f290274d.isEnabled(i18);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        this.f290274d.registerDataSetObserver(dataSetObserver);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        this.f290274d.unregisterDataSetObserver(dataSetObserver);
    }
}
