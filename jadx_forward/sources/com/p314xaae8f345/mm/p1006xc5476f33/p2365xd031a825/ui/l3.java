package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class l3 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f261933d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f261934e = new java.util.ArrayList();

    public l3(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19110xc60f679 activityC19110xc60f679, android.content.Context context) {
        this.f261933d = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f261934e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c) this.f261934e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View inflate = android.view.View.inflate(this.f261933d, com.p314xaae8f345.mm.R.C30864xbddafb2a.d5e, null);
        android.widget.CheckedTextView checkedTextView = (android.widget.CheckedTextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.bt_);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c c19097xe6dc5b4c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c) this.f261934e.get(i17);
        java.lang.String str = c19097xe6dc5b4c.f261181e;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19097xe6dc5b4c.f261198y)) {
            checkedTextView.setEnabled(true);
        } else {
            str = str + "[" + c19097xe6dc5b4c.f261198y + "]";
            checkedTextView.setEnabled(false);
        }
        checkedTextView.setText(str);
        return inflate;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i17) {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c) this.f261934e.get(i17)).f261198y);
    }
}
