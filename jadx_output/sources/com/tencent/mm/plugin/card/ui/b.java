package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class b extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f94931d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f94932e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public android.content.Context f94933f;

    public b(android.content.Context context) {
        this.f94933f = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f94931d).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.tencent.mm.plugin.card.model.CardInfo) ((java.util.ArrayList) this.f94931d).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.card.ui.a aVar;
        com.tencent.mm.plugin.card.model.CardInfo cardInfo = (com.tencent.mm.plugin.card.model.CardInfo) ((java.util.ArrayList) this.f94931d).get(i17);
        if (view == null) {
            view = android.view.View.inflate(this.f94933f, com.tencent.mm.R.layout.f488271op, null);
            aVar = new com.tencent.mm.plugin.card.ui.a(this);
            aVar.f94918a = (android.widget.RelativeLayout) view.findViewById(com.tencent.mm.R.id.b99);
            aVar.f94919b = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.b_w);
            aVar.f94920c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.b8b);
            aVar.f94921d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483577bb0);
            aVar.f94925h = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.nrk);
            aVar.f94926i = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483578bb1);
            aVar.f94922e = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bat);
            aVar.f94923f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.b9b);
            aVar.f94924g = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483587bc4);
            view.setTag(aVar);
        } else {
            aVar = (com.tencent.mm.plugin.card.ui.a) view.getTag();
        }
        if (cardInfo.c()) {
            aVar.f94919b.setVisibility(0);
            aVar.f94921d.setVisibility(0);
            aVar.f94925h.setVisibility(0);
            aVar.f94926i.setVisibility(8);
            aVar.f94920c.setVisibility(0);
            aVar.f94920c.setText(cardInfo.s0().f388552m);
            if (!cardInfo.X()) {
                aVar.f94921d.setText(cardInfo.s0().f388553n);
            } else if (cardInfo.s0().f388560s != null && cardInfo.s0().f388560s.size() == 1) {
                aVar.f94921d.setText(((r45.w50) cardInfo.s0().f388560s.get(0)).f388878d);
            } else if (cardInfo.s0().f388560s != null && cardInfo.s0().f388560s.size() == 2) {
                aVar.f94921d.setText(((r45.w50) cardInfo.s0().f388560s.get(0)).f388878d + "-" + ((r45.w50) cardInfo.s0().f388560s.get(1)).f388878d);
            }
            if (cardInfo.s0().U == 1) {
                aVar.f94922e.setVisibility(0);
            } else {
                aVar.f94922e.setVisibility(8);
            }
            long j17 = cardInfo.field_begin_time;
            long j18 = cardInfo.field_end_time;
            if (j18 > 0 && j17 > 0) {
                aVar.f94925h.setText(this.f94933f.getString(com.tencent.mm.R.string.aw6, lu1.a0.f(j17) + "  -  " + lu1.a0.f(cardInfo.field_end_time)));
                aVar.f94925h.setVisibility(0);
            } else if (j18 > 0) {
                aVar.f94925h.setText(this.f94933f.getString(com.tencent.mm.R.string.f490813aw5, lu1.a0.f(j18)));
                aVar.f94925h.setVisibility(0);
            } else {
                aVar.f94925h.setText("");
                aVar.f94925h.setVisibility(8);
            }
            lu1.g0.b(aVar.f94919b, cardInfo.s0().f388546e, this.f94933f.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480185qr), com.tencent.mm.R.drawable.cbt, true);
            if (cardInfo.s0().S == 1) {
                aVar.f94919b.setAlpha(255);
                aVar.f94924g.setVisibility(8);
                aVar.f94921d.setTextColor(this.f94933f.getResources().getColor(com.tencent.mm.R.color.f478781h1));
                aVar.f94920c.setTextColor(this.f94933f.getResources().getColor(com.tencent.mm.R.color.f478781h1));
                aVar.f94925h.setTextColor(this.f94933f.getResources().getColor(com.tencent.mm.R.color.f479211sz));
            } else {
                aVar.f94924g.setText(cardInfo.s0().T);
                aVar.f94919b.setAlpha(90);
                aVar.f94924g.setVisibility(0);
                aVar.f94921d.setTextColor(this.f94933f.getResources().getColor(com.tencent.mm.R.color.f479211sz));
                aVar.f94920c.setTextColor(this.f94933f.getResources().getColor(com.tencent.mm.R.color.f479211sz));
                aVar.f94925h.setTextColor(this.f94933f.getResources().getColor(com.tencent.mm.R.color.f479211sz));
            }
            int intValue = ((java.lang.Integer) this.f94932e.get(cardInfo.field_card_tp_id)).intValue();
            if (intValue == 1) {
                aVar.f94923f.setText("");
                aVar.f94923f.setVisibility(8);
            } else {
                aVar.f94923f.setText("x" + intValue);
                aVar.f94923f.setVisibility(0);
            }
        } else {
            aVar.f94919b.setVisibility(8);
            aVar.f94921d.setVisibility(8);
            aVar.f94920c.setVisibility(8);
            aVar.f94925h.setVisibility(8);
            aVar.f94924g.setVisibility(8);
            aVar.f94923f.setVisibility(8);
            aVar.f94926i.setVisibility(0);
            aVar.f94918a.setBackgroundColor(this.f94933f.getResources().getColor(com.tencent.mm.R.color.f478791hb));
            aVar.f94926i.setText(this.f94933f.getResources().getString(com.tencent.mm.R.string.auh));
        }
        return view;
    }
}
