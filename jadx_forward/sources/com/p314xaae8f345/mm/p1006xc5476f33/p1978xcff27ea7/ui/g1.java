package com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui;

/* loaded from: classes9.dex */
public class g1 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f236719d = null;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16960x141f579b f236720e;

    public g1(com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16960x141f579b activityC16960x141f579b, com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.x0 x0Var) {
        this.f236720e = activityC16960x141f579b;
    }

    public void a(int i17) {
        for (int i18 = 0; i18 < this.f236719d.size(); i18++) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.p1979x633fb29.C16957xf1da7b74) this.f236719d.get(i18)).f236613q = false;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.p1979x633fb29.C16957xf1da7b74) this.f236719d.get(i17)).f236613q = true;
    }

    public void c(java.util.List list) {
        this.f236719d = list;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f236719d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.p1979x633fb29.C16957xf1da7b74) this.f236719d.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.widget.CheckedTextView checkedTextView = (android.widget.CheckedTextView) android.view.View.inflate(this.f236720e, com.p314xaae8f345.mm.R.C30864xbddafb2a.ccq, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.p1979x633fb29.C16957xf1da7b74 c16957xf1da7b74 = (com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.p1979x633fb29.C16957xf1da7b74) this.f236719d.get(i17);
        checkedTextView.setText(c16957xf1da7b74.f236606g);
        checkedTextView.setEnabled(c16957xf1da7b74.a());
        if (c16957xf1da7b74.f236613q) {
            checkedTextView.setChecked(true);
        } else {
            checkedTextView.setChecked(false);
        }
        return checkedTextView;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i17) {
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.p1979x633fb29.C16957xf1da7b74) this.f236719d.get(i17)).a()) {
            return super.isEnabled(i17);
        }
        return false;
    }
}
