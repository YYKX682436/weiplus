package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* loaded from: classes15.dex */
public class u0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f234891d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f234892e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.AdapterView.OnItemClickListener f234893f;

    public u0(android.content.Context context) {
        this.f234891d = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f234892e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (wq3.v) this.f234892e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.t0 t0Var;
        wq3.v vVar = (wq3.v) this.f234892e.get(i17);
        if (view == null || view.getTag() == null) {
            t0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.t0(this);
            android.content.Context context = this.f234891d;
            android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.cal, null);
            t0Var.f234886a = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ja9);
            t0Var.f234887b = (com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.C16819xef82346f) inflate.findViewById(com.p314xaae8f345.mm.R.id.ja8);
            t0Var.f234888c = new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.v0(context);
            inflate.setTag(t0Var);
            view = inflate;
        } else {
            t0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.t0) view.getTag();
        }
        t0Var.f234886a.setText(vVar.f530144a);
        t0Var.f234887b.setOnItemClickListener(this.f234893f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.v0 v0Var = t0Var.f234888c;
        v0Var.f234895e = vVar.f530145b;
        v0Var.notifyDataSetChanged();
        t0Var.f234887b.setAdapter((android.widget.ListAdapter) t0Var.f234888c);
        return view;
    }
}
