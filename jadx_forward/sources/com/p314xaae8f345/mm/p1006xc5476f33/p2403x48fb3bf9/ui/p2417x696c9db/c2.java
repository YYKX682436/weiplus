package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes7.dex */
public final class c2 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f265559d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.LayoutInflater f265560e;

    public c2(android.content.Context context, java.util.LinkedList linkedList) {
        this.f265560e = android.view.LayoutInflater.from(context);
        this.f265559d = linkedList;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.LinkedList linkedList = this.f265559d;
        if (linkedList == null) {
            return 0;
        }
        return linkedList.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        if (i17 >= 0) {
            java.util.LinkedList linkedList = this.f265559d;
            if (i17 < linkedList.size()) {
                return (r45.px4) linkedList.get(i17);
            }
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b2 b2Var;
        android.view.View view2 = null;
        java.util.LinkedList linkedList = this.f265559d;
        if (linkedList != null && linkedList.size() > 0) {
            r45.px4 px4Var = (i17 < 0 || i17 >= linkedList.size()) ? null : (r45.px4) linkedList.get(i17);
            if (px4Var == null) {
                return view;
            }
            if (view == null) {
                b2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b2(null);
                view2 = this.f265560e.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cik, (android.view.ViewGroup) null, false);
                b2Var.f265454a = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.f564614w2);
                b2Var.f265455b = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.f564612w0);
                view2.setTag(b2Var);
            } else {
                view2 = view;
                b2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b2) view.getTag();
            }
            int i18 = px4Var.f464993f;
            if (i18 == 1) {
                b2Var.f265454a.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562792or);
            } else if (i18 == 3) {
                b2Var.f265454a.setImageResource(com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.raw.f78845xd3326bb6 : com.p314xaae8f345.mm.R.raw.f78846x90800d4f);
            } else {
                b2Var.f265454a.setImageResource(com.p314xaae8f345.mm.R.raw.f78851xab463e5f);
            }
            b2Var.f265455b.setText(px4Var.f464992e);
            android.widget.ImageView imageView = b2Var.f265454a;
            imageView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.a2(this, px4Var, imageView));
        }
        return view2;
    }
}
