package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class w6 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f229168d;

    /* renamed from: e, reason: collision with root package name */
    public int f229169e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16370x5a91dd69 f229170f;

    public w6(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16370x5a91dd69 activityC16370x5a91dd69) {
        this.f229170f = activityC16370x5a91dd69;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f229168d.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (java.lang.String) this.f229168d.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.widget.CheckedTextView checkedTextView = (android.widget.CheckedTextView) android.view.LayoutInflater.from(this.f229170f.mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571158d70, viewGroup, false);
        checkedTextView.setText((java.lang.String) this.f229168d.get(i17));
        if (i17 == this.f229169e) {
            checkedTextView.setChecked(true);
        } else {
            checkedTextView.setChecked(false);
        }
        return checkedTextView;
    }
}
