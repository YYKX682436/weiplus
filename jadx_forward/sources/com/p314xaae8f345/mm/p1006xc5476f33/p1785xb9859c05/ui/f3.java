package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes15.dex */
public class f3 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f224358d = null;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16141x4dcd32b5 f224359e;

    public f3(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16141x4dcd32b5 activityC16141x4dcd32b5) {
        this.f224359e = null;
        this.f224359e = activityC16141x4dcd32b5;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f224358d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        java.util.List list = this.f224358d;
        if (list != null) {
            return list.get(i17);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.e3 e3Var;
        if (view == null) {
            view = ((android.view.LayoutInflater) this.f224359e.getSystemService("layout_inflater")).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570721bm4, viewGroup, false);
            e3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.e3(this, null);
            e3Var.f224326a = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) view.findViewById(com.p314xaae8f345.mm.R.id.knp);
            e3Var.f224327b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.knt);
            e3Var.f224328c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.knu);
            e3Var.f224329d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.knk);
            e3Var.f224330e = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.knl);
            e3Var.f224331f = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.knj);
            view.setTag(e3Var);
        } else {
            e3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.e3) view.getTag();
        }
        r45.p57 p57Var = (r45.p57) getItem(i17);
        if (p57Var == null) {
            return view;
        }
        e3Var.f224327b.setText(p57Var.f464308d);
        e3Var.f224328c.setText(p57Var.f464309e);
        e3Var.f224330e.setText(p57Var.f464311g);
        e3Var.f224329d.setText(p57Var.f464310f);
        e3Var.f224326a.setVisibility(0);
        e3Var.f224326a.m75396xca029dad(p57Var.f464312h);
        if (p57Var.f464313i == 0) {
            e3Var.f224331f.setEnabled(true);
        } else {
            e3Var.f224331f.setEnabled(false);
        }
        e3Var.f224331f.setTag(java.lang.Integer.valueOf(i17));
        e3Var.f224331f.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.d3(this));
        return view;
    }
}
