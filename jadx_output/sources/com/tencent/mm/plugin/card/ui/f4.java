package com.tencent.mm.plugin.card.ui;

/* loaded from: classes4.dex */
public class f4 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardShopUI f95006d;

    public f4(com.tencent.mm.plugin.card.ui.CardShopUI cardShopUI, com.tencent.mm.plugin.card.ui.y3 y3Var) {
        this.f95006d = cardShopUI;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f95006d.f94904f.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (r45.nu) this.f95006d.f94904f.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.card.ui.e4 e4Var;
        com.tencent.mm.plugin.card.ui.CardShopUI cardShopUI = this.f95006d;
        if (view == null) {
            view = android.view.View.inflate(cardShopUI.getContext(), com.tencent.mm.R.layout.f488360r6, null);
            e4Var = new com.tencent.mm.plugin.card.ui.e4(this);
            e4Var.f94998a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.mu6);
            e4Var.f94999b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f486902mu2);
            e4Var.f95000c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.mtz);
            e4Var.f95001d = view.findViewById(com.tencent.mm.R.id.mu9);
            view.setTag(e4Var);
        } else {
            e4Var = (com.tencent.mm.plugin.card.ui.e4) view.getTag();
        }
        r45.nu nuVar = (r45.nu) cardShopUI.f94904f.get(i17);
        if (nuVar == null) {
            e4Var.f94998a.setText("");
            e4Var.f94999b.setText("");
            e4Var.f95000c.setText("");
            return view;
        }
        e4Var.f94998a.setText(nuVar.f381672d);
        if (nuVar.f381679n <= 0.0f) {
            e4Var.f94999b.setVisibility(8);
        } else {
            e4Var.f94999b.setText(lu1.a0.D(cardShopUI.getBaseContext(), nuVar.f381679n));
            e4Var.f94999b.setVisibility(0);
        }
        e4Var.f95000c.setText(nuVar.f381676h + nuVar.f381677i + nuVar.f381678m);
        e4Var.f95001d.setOnClickListener(cardShopUI.f94913r);
        e4Var.f95001d.setTag(nuVar);
        return view;
    }
}
