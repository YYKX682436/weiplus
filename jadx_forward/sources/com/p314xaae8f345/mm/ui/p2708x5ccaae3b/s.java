package com.p314xaae8f345.mm.ui.p2708x5ccaae3b;

/* loaded from: classes15.dex */
public class s extends android.widget.BaseAdapter implements com.p314xaae8f345.mm.ui.p2708x5ccaae3b.b {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ListAdapter f290292d;

    public s(android.widget.ListAdapter listAdapter) {
        com.p314xaae8f345.mm.ui.p2708x5ccaae3b.r rVar = new com.p314xaae8f345.mm.ui.p2708x5ccaae3b.r(this);
        this.f290292d = listAdapter;
        listAdapter.registerDataSetObserver(rVar);
    }

    @Override // com.p314xaae8f345.mm.ui.p2708x5ccaae3b.b
    public int b(int i17) {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.ui.p2708x5ccaae3b.b
    public int e() {
        return 0;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f290292d.getCount();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f290292d.getItem(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return this.f290292d.getItemId(i17);
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        return this.f290292d.getView(i17, view, viewGroup);
    }

    @Override // com.p314xaae8f345.mm.ui.p2708x5ccaae3b.b
    public android.view.View i(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        return null;
    }
}
