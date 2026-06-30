package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class a3 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13056x715f08fd f176462d;

    public a3(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13056x715f08fd activityC13056x715f08fd) {
        this.f176462d = activityC13056x715f08fd;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f176462d.f176414o.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (xt1.a) this.f176462d.f176414o.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.d3 d3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13056x715f08fd activityC13056x715f08fd = this.f176462d;
        xt1.a aVar = (xt1.a) activityC13056x715f08fd.f176414o.get(i17);
        if (view == null) {
            view = android.view.View.inflate(activityC13056x715f08fd, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569889r2, null);
            d3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.d3(activityC13056x715f08fd);
            d3Var.f176510a = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.iph);
            d3Var.f176511b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.obc);
            d3Var.f176512c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.nqr);
            d3Var.f176513d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.a9l);
            d3Var.f176514e = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.bdd);
            d3Var.f176515f = view.findViewById(com.p314xaae8f345.mm.R.id.f564964at5);
            d3Var.f176516g = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.bbz);
            view.setTag(d3Var);
        } else {
            d3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.d3) view.getTag();
        }
        if (lu1.a0.B(aVar.f537957b)) {
            d3Var.f176511b.setText(aVar.f537960e);
            if (android.text.TextUtils.isEmpty(aVar.f537959d)) {
                d3Var.f176512c.setVisibility(8);
            } else {
                d3Var.f176512c.setVisibility(0);
                d3Var.f176512c.setText(aVar.f537959d);
            }
            if (android.text.TextUtils.isEmpty(aVar.f537961f)) {
                d3Var.f176513d.setVisibility(8);
            } else {
                d3Var.f176513d.setVisibility(0);
                d3Var.f176513d.setText(aVar.f537961f);
            }
            d3Var.f176514e.setVisibility(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f537971p) ? 8 : 0);
            d3Var.f176514e.setText(aVar.f537971p);
            lu1.g0.b(d3Var.f176510a, aVar.f537958c, activityC13056x715f08fd.getBaseContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561733r6), com.p314xaae8f345.mm.R.C30861xcebc809e.cbt, true);
            java.lang.Boolean bool = (java.lang.Boolean) activityC13056x715f08fd.f176415p.get(java.lang.Integer.valueOf(i17));
            if (bool == null || !bool.booleanValue()) {
                d3Var.f176516g.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562630kn);
            } else {
                d3Var.f176516g.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562629km);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardListSelectedUI", "not support type");
        }
        return view;
    }
}
