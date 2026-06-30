package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class o1 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f176630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ViewOnClickListenerC13051xc6cfcc17 f176631e;

    public o1(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ViewOnClickListenerC13051xc6cfcc17 viewOnClickListenerC13051xc6cfcc17, java.util.LinkedList linkedList) {
        this.f176631e = viewOnClickListenerC13051xc6cfcc17;
        this.f176630d = linkedList;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f176630d.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e.AcceptedCardItem) this.f176630d.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.p1 p1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e.AcceptedCardItem acceptedCardItem = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e.AcceptedCardItem) this.f176630d.get(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ViewOnClickListenerC13051xc6cfcc17 viewOnClickListenerC13051xc6cfcc17 = this.f176631e;
        if (view == null) {
            view = android.view.View.inflate(viewOnClickListenerC13051xc6cfcc17, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569832ph, null);
            p1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.p1(viewOnClickListenerC13051xc6cfcc17);
            p1Var.f176644a = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.olg);
            p1Var.f176645b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.olf);
            view.setTag(p1Var);
        } else {
            p1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.p1) view.getTag();
        }
        p1Var.f176644a.setText(acceptedCardItem.f176202d);
        p1Var.f176645b.setText(acceptedCardItem.f176203e + viewOnClickListenerC13051xc6cfcc17.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ask));
        return view;
    }
}
