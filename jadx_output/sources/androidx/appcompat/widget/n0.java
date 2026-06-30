package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class n0 implements android.widget.ListAdapter, android.widget.SpinnerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.SpinnerAdapter f9656d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ListAdapter f9657e;

    public n0(android.widget.SpinnerAdapter spinnerAdapter, android.content.res.Resources.Theme theme) {
        this.f9656d = spinnerAdapter;
        if (spinnerAdapter instanceof android.widget.ListAdapter) {
            this.f9657e = (android.widget.ListAdapter) spinnerAdapter;
        }
        if (theme == null || !(spinnerAdapter instanceof android.widget.ThemedSpinnerAdapter)) {
            return;
        }
        android.widget.ThemedSpinnerAdapter themedSpinnerAdapter = (android.widget.ThemedSpinnerAdapter) spinnerAdapter;
        if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    @Override // android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        android.widget.ListAdapter listAdapter = this.f9657e;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        android.widget.SpinnerAdapter spinnerAdapter = this.f9656d;
        if (spinnerAdapter == null) {
            return 0;
        }
        return spinnerAdapter.getCount();
    }

    @Override // android.widget.SpinnerAdapter
    public android.view.View getDropDownView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.widget.SpinnerAdapter spinnerAdapter = this.f9656d;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getDropDownView(i17, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        android.widget.SpinnerAdapter spinnerAdapter = this.f9656d;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getItem(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        android.widget.SpinnerAdapter spinnerAdapter = this.f9656d;
        if (spinnerAdapter == null) {
            return -1L;
        }
        return spinnerAdapter.getItemId(i17);
    }

    @Override // android.widget.Adapter
    public int getItemViewType(int i17) {
        return 0;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        return getDropDownView(i17, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public int getViewTypeCount() {
        return 1;
    }

    @Override // android.widget.Adapter
    public boolean hasStableIds() {
        android.widget.SpinnerAdapter spinnerAdapter = this.f9656d;
        return spinnerAdapter != null && spinnerAdapter.hasStableIds();
    }

    @Override // android.widget.Adapter
    public boolean isEmpty() {
        return getCount() == 0;
    }

    @Override // android.widget.ListAdapter
    public boolean isEnabled(int i17) {
        android.widget.ListAdapter listAdapter = this.f9657e;
        if (listAdapter != null) {
            return listAdapter.isEnabled(i17);
        }
        return true;
    }

    @Override // android.widget.Adapter
    public void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        android.widget.SpinnerAdapter spinnerAdapter = this.f9656d;
        if (spinnerAdapter != null) {
            spinnerAdapter.registerDataSetObserver(dataSetObserver);
        }
    }

    @Override // android.widget.Adapter
    public void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        android.widget.SpinnerAdapter spinnerAdapter = this.f9656d;
        if (spinnerAdapter != null) {
            spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
        }
    }
}
