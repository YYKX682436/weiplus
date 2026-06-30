package o;

/* loaded from: classes15.dex */
public abstract class c0 implements o.k0, o.g0, android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Rect f423222d;

    public static int l(android.widget.ListAdapter listAdapter, android.view.ViewGroup viewGroup, android.content.Context context, int i17) {
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i18 = 0;
        int i19 = 0;
        android.view.View view = null;
        for (int i27 = 0; i27 < count; i27++) {
            int itemViewType = listAdapter.getItemViewType(i27);
            if (itemViewType != i19) {
                view = null;
                i19 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new android.widget.FrameLayout(context);
            }
            view = listAdapter.getView(i27, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i17) {
                return i17;
            }
            if (measuredWidth > i18) {
                i18 = measuredWidth;
            }
        }
        return i18;
    }

    public static boolean t(o.r rVar) {
        int size = rVar.size();
        for (int i17 = 0; i17 < size; i17++) {
            android.view.MenuItem item = rVar.getItem(i17);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // o.g0
    public void d(android.content.Context context, o.r rVar) {
    }

    @Override // o.g0
    /* renamed from: getId */
    public int mo2872x5db1b11() {
        return 0;
    }

    @Override // o.g0
    public boolean h(o.r rVar, o.u uVar) {
        return false;
    }

    @Override // o.g0
    public boolean j(o.r rVar, o.u uVar) {
        return false;
    }

    public abstract void k(o.r rVar);

    public abstract void m(android.view.View view);

    public abstract void n(boolean z17);

    public abstract void o(int i17);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        android.widget.ListAdapter listAdapter = (android.widget.ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof android.widget.HeaderViewListAdapter ? (o.o) ((android.widget.HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (o.o) listAdapter).f423306d.q((android.view.MenuItem) listAdapter.getItem(i17), this, (this instanceof o.l) ^ true ? 0 : 4);
    }

    public abstract void p(int i17);

    public abstract void q(android.widget.PopupWindow.OnDismissListener onDismissListener);

    public abstract void r(boolean z17);

    public abstract void s(int i17);
}
