package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes4.dex */
public class j1 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f273261d;

    public j1(android.content.Context context) {
        this.f273261d = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return 2;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return java.lang.Integer.valueOf(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.k1 k1Var;
        if (view == null || view.getTag() == null) {
            view = android.view.LayoutInflater.from(this.f273261d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bav, (android.view.ViewGroup) null);
            k1Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.k1(view);
            view.setTag(k1Var);
        } else {
            k1Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.k1) view.getTag();
        }
        if (i17 == 0) {
            k1Var.f273275a.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ceq);
        } else if (i17 != 1) {
            k1Var.f273275a.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f571919tj);
        } else {
            k1Var.f273275a.setText(com.p314xaae8f345.mm.R.C30867xcad56011.cer);
        }
        return view;
    }
}
