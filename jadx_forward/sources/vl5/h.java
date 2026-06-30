package vl5;

/* loaded from: classes15.dex */
public class h extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ListAdapter f519459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 f519460e;

    public h(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 c22722xd3be5395, android.widget.ListAdapter listAdapter, vl5.e eVar) {
        this.f519460e = c22722xd3be5395;
        this.f519459d = listAdapter;
        listAdapter.registerDataSetObserver(new vl5.g(this, c22722xd3be5395));
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return this.f519459d.areAllItemsEnabled();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f519459d.getCount();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f519459d.getItem(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return this.f519459d.getItemId(i17);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        return this.f519459d.getItemViewType(i17);
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        vl5.c cVar;
        android.widget.ListAdapter listAdapter = this.f519459d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 c22722xd3be5395 = this.f519460e;
        if (view == null || !(view instanceof vl5.c)) {
            android.view.View view2 = listAdapter.getView(i17, null, c22722xd3be5395);
            vl5.c dVar = view2 instanceof android.widget.Checkable ? new vl5.d(c22722xd3be5395.getContext()) : new vl5.c(c22722xd3be5395.getContext());
            dVar.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
            dVar.addView(view2);
            cVar = dVar;
        } else {
            cVar = (vl5.c) view;
            android.view.View childAt = cVar.getChildAt(0);
            android.view.View view3 = listAdapter.getView(i17, childAt, c22722xd3be5395);
            if (view3 != childAt) {
                if (childAt != null) {
                    cVar.removeViewAt(0);
                }
                cVar.addView(view3);
            }
        }
        int headerViewsCount = i17 + c22722xd3be5395.getHeaderViewsCount();
        int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395.I1;
        c22722xd3be5395.c(headerViewsCount, cVar, true);
        return cVar;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return this.f519459d.getViewTypeCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return this.f519459d.hasStableIds();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean isEmpty() {
        return this.f519459d.isEmpty();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i17) {
        return this.f519459d.isEnabled(i17);
    }
}
