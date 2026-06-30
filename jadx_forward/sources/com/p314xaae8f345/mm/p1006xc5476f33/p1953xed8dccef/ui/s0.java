package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* loaded from: classes8.dex */
public class s0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f234879d;

    /* renamed from: e, reason: collision with root package name */
    public xq3.m f234880e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f234881f;

    public s0(android.content.Context context) {
        this.f234879d = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.LinkedList linkedList = this.f234880e.f537637f;
        if (linkedList != null) {
            return linkedList.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (xq3.h) this.f234880e.f537637f.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        xq3.h hVar = (xq3.h) this.f234880e.f537637f.get(i17);
        if (view == null || view.getTag() == null) {
            view = android.view.View.inflate(this.f234879d, com.p314xaae8f345.mm.R.C30864xbddafb2a.cah, null);
        }
        android.widget.CheckBox checkBox = (android.widget.CheckBox) view;
        checkBox.setText(hVar.f537621e);
        checkBox.setEnabled(hVar.f537622f);
        checkBox.setChecked(hVar.f537620d.equals(this.f234881f));
        if (!hVar.f537622f) {
            view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cd6);
        } else if (hVar.f537620d.equals(this.f234881f)) {
            view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cd8);
        } else {
            view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cd7);
        }
        view.setTag(new android.util.Pair(this.f234880e.f537635d, hVar.f537620d));
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i17) {
        return ((xq3.h) this.f234880e.f537637f.get(i17)).f537622f;
    }
}
