package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes9.dex */
public class v6 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.w6 f292376d;

    public v6(com.p314xaae8f345.mm.ui.p2740x696c9db.w6 w6Var, com.p314xaae8f345.mm.ui.p2740x696c9db.t6 t6Var) {
        this.f292376d = w6Var;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.w6 w6Var = this.f292376d;
        return w6Var.f292411s ? w6Var.f292412t.size() + 1 : w6Var.f292412t.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        return (this.f292376d.f292411s && i17 == 0) ? 0 : 1;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.u6 u6Var;
        com.p314xaae8f345.mm.ui.p2740x696c9db.u6 u6Var2;
        com.p314xaae8f345.mm.ui.p2740x696c9db.w6 w6Var = this.f292376d;
        boolean z17 = w6Var.f292411s;
        if (z17 && i17 == 0) {
            if (view == null) {
                view = w6Var.f292409q.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c1j, viewGroup, false);
                u6Var2 = new com.p314xaae8f345.mm.ui.p2740x696c9db.u6(this, null);
                u6Var2.f292346a = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.obc);
                u6Var2.f292347b = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h5n);
                view.setTag(u6Var2);
            } else {
                u6Var2 = (com.p314xaae8f345.mm.ui.p2740x696c9db.u6) view.getTag();
            }
            android.widget.TextView textView = u6Var2.f292346a;
            db5.g4 g4Var = w6Var.f292412t;
            java.lang.CharSequence charSequence = g4Var.f309878e;
            textView.setText((charSequence == null || charSequence.length() == 0) ? w6Var.f291957e.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571885sk) : g4Var.f309878e);
        } else {
            if (z17) {
                i17--;
            }
            if (view == null) {
                view = w6Var.f292409q.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c1i, viewGroup, false);
                u6Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.u6(this, null);
                u6Var.f292346a = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.obc);
                u6Var.f292347b = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h5n);
                u6Var.f292348c = view.findViewById(com.p314xaae8f345.mm.R.id.m7g);
                view.setTag(u6Var);
            } else {
                u6Var = (com.p314xaae8f345.mm.ui.p2740x696c9db.u6) view.getTag();
            }
            android.view.MenuItem item = w6Var.f292412t.getItem(i17);
            u6Var.f292346a.setText(item.getTitle());
            if (item.getIcon() != null) {
                u6Var.f292347b.setVisibility(0);
                u6Var.f292347b.setImageDrawable(item.getIcon());
            } else {
                u6Var.f292347b.setVisibility(8);
            }
            if (i17 == r0.size() - 1) {
                u6Var.f292348c.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b4h);
            } else {
                u6Var.f292348c.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b4g);
            }
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return this.f292376d.f292411s ? 2 : 1;
    }
}
