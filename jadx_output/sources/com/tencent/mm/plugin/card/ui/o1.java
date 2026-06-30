package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class o1 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f95097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardGiftReceiveUI f95098e;

    public o1(com.tencent.mm.plugin.card.ui.CardGiftReceiveUI cardGiftReceiveUI, java.util.LinkedList linkedList) {
        this.f95098e = cardGiftReceiveUI;
        this.f95097d = linkedList;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f95097d.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.tencent.mm.plugin.card.model.CardGiftInfo.AcceptedCardItem) this.f95097d.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.card.ui.p1 p1Var;
        com.tencent.mm.plugin.card.model.CardGiftInfo.AcceptedCardItem acceptedCardItem = (com.tencent.mm.plugin.card.model.CardGiftInfo.AcceptedCardItem) this.f95097d.get(i17);
        com.tencent.mm.plugin.card.ui.CardGiftReceiveUI cardGiftReceiveUI = this.f95098e;
        if (view == null) {
            view = android.view.View.inflate(cardGiftReceiveUI, com.tencent.mm.R.layout.f488299ph, null);
            p1Var = new com.tencent.mm.plugin.card.ui.p1(cardGiftReceiveUI);
            p1Var.f95111a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.olg);
            p1Var.f95112b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.olf);
            view.setTag(p1Var);
        } else {
            p1Var = (com.tencent.mm.plugin.card.ui.p1) view.getTag();
        }
        p1Var.f95111a.setText(acceptedCardItem.f94669d);
        p1Var.f95112b.setText(acceptedCardItem.f94670e + cardGiftReceiveUI.getContext().getString(com.tencent.mm.R.string.ask));
        return view;
    }
}
