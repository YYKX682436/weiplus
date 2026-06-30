package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class m1 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ViewOnClickListenerC13051xc6cfcc17 f176608d;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ViewOnClickListenerC13051xc6cfcc17 viewOnClickListenerC13051xc6cfcc17) {
        this.f176608d = viewOnClickListenerC13051xc6cfcc17;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f176608d.f176355f.N.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e.AccepterItem) this.f176608d.f176355f.N.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.n1 n1Var;
        android.widget.ImageView imageView;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ViewOnClickListenerC13051xc6cfcc17 viewOnClickListenerC13051xc6cfcc17 = this.f176608d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e.AccepterItem accepterItem = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e.AccepterItem) viewOnClickListenerC13051xc6cfcc17.f176355f.N.get(i17);
        if (view == null) {
            view = android.view.View.inflate(viewOnClickListenerC13051xc6cfcc17, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569833pi, null);
            n1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.n1(viewOnClickListenerC13051xc6cfcc17);
            n1Var.f176618a = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.hah);
            n1Var.f176619b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.okr);
            n1Var.f176620c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.okt);
            n1Var.f176621d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.oks);
            view.setTag(n1Var);
        } else {
            n1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.n1) view.getTag();
        }
        if (accepterItem != null) {
            java.lang.String str = accepterItem.f176207g;
            if (str != null && (imageView = n1Var.f176618a) != null && !android.text.TextUtils.isEmpty(str)) {
                if (android.text.TextUtils.isEmpty(str)) {
                    imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cbt);
                } else {
                    o11.f fVar = new o11.f();
                    fVar.f423616g = lp0.b.D();
                    fVar.f423615f = xt1.q.m(str);
                    fVar.f423611b = true;
                    fVar.f423629t = true;
                    fVar.f423630u = 3;
                    fVar.f423610a = true;
                    fVar.f423620k = 34;
                    fVar.f423619j = 34;
                    fVar.f423624o = com.p314xaae8f345.mm.R.C30861xcebc809e.cbt;
                    n11.a.b().h(str, imageView, fVar.a());
                }
            }
            n1Var.f176619b.setText(accepterItem.f176206f);
            n1Var.f176620c.setText(accepterItem.f176204d);
            n1Var.f176621d.setText(accepterItem.f176205e + viewOnClickListenerC13051xc6cfcc17.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ask));
        }
        return view;
    }
}
