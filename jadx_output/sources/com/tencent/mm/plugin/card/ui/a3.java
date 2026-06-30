package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class a3 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardListSelectedUI f94929d;

    public a3(com.tencent.mm.plugin.card.ui.CardListSelectedUI cardListSelectedUI) {
        this.f94929d = cardListSelectedUI;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f94929d.f94881o.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (xt1.a) this.f94929d.f94881o.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.card.ui.d3 d3Var;
        com.tencent.mm.plugin.card.ui.CardListSelectedUI cardListSelectedUI = this.f94929d;
        xt1.a aVar = (xt1.a) cardListSelectedUI.f94881o.get(i17);
        if (view == null) {
            view = android.view.View.inflate(cardListSelectedUI, com.tencent.mm.R.layout.f488356r2, null);
            d3Var = new com.tencent.mm.plugin.card.ui.d3(cardListSelectedUI);
            d3Var.f94977a = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.iph);
            d3Var.f94978b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.obc);
            d3Var.f94979c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.nqr);
            d3Var.f94980d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.a9l);
            d3Var.f94981e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bdd);
            d3Var.f94982f = view.findViewById(com.tencent.mm.R.id.f483431at5);
            d3Var.f94983g = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bbz);
            view.setTag(d3Var);
        } else {
            d3Var = (com.tencent.mm.plugin.card.ui.d3) view.getTag();
        }
        if (lu1.a0.B(aVar.f456424b)) {
            d3Var.f94978b.setText(aVar.f456427e);
            if (android.text.TextUtils.isEmpty(aVar.f456426d)) {
                d3Var.f94979c.setVisibility(8);
            } else {
                d3Var.f94979c.setVisibility(0);
                d3Var.f94979c.setText(aVar.f456426d);
            }
            if (android.text.TextUtils.isEmpty(aVar.f456428f)) {
                d3Var.f94980d.setVisibility(8);
            } else {
                d3Var.f94980d.setVisibility(0);
                d3Var.f94980d.setText(aVar.f456428f);
            }
            d3Var.f94981e.setVisibility(com.tencent.mm.sdk.platformtools.t8.K0(aVar.f456438p) ? 8 : 0);
            d3Var.f94981e.setText(aVar.f456438p);
            lu1.g0.b(d3Var.f94977a, aVar.f456425c, cardListSelectedUI.getBaseContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480200r6), com.tencent.mm.R.drawable.cbt, true);
            java.lang.Boolean bool = (java.lang.Boolean) cardListSelectedUI.f94882p.get(java.lang.Integer.valueOf(i17));
            if (bool == null || !bool.booleanValue()) {
                d3Var.f94983g.setImageResource(com.tencent.mm.R.drawable.f481097kn);
            } else {
                d3Var.f94983g.setImageResource(com.tencent.mm.R.drawable.f481096km);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardListSelectedUI", "not support type");
        }
        return view;
    }
}
