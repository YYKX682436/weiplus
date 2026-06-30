package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* loaded from: classes8.dex */
public class e0 extends android.widget.BaseAdapter implements android.widget.Filterable {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f234813d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f234814e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f234815f = null;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.Filter f234816g = new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.c0(this);

    public e0(android.content.Context context) {
        this.f234814e = null;
        this.f234813d = context;
        this.f234814e = vq3.e.wi().Bi().f530101a;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f234815f;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Filterable
    public android.widget.Filter getFilter() {
        return this.f234816g;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (java.lang.String) this.f234815f.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.d0 d0Var;
        if (view == null) {
            d0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.d0(this);
            view2 = android.view.LayoutInflater.from(this.f234813d).inflate(android.R.layout.simple_list_item_1, (android.view.ViewGroup) null);
            d0Var.f234810a = (android.widget.TextView) view2.findViewById(android.R.id.text1);
            view2.setTag(d0Var);
        } else {
            view2 = view;
            d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.d0) view.getTag();
        }
        d0Var.f234810a.setText((java.lang.String) this.f234815f.get(i17));
        return view2;
    }
}
