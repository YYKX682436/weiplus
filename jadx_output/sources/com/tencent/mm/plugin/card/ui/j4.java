package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class j4 extends com.tencent.mm.plugin.card.ui.k {

    /* renamed from: q, reason: collision with root package name */
    public tt1.k f95035q;

    /* renamed from: r, reason: collision with root package name */
    public final xt1.r f95036r;

    /* renamed from: s, reason: collision with root package name */
    public int f95037s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.ArrayList f95038t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.ArrayList f95039u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.ArrayList f95040v;

    public j4(android.content.Context context, xt1.r rVar) {
        super(context, rVar);
        this.f95037s = 0;
        this.f95036r = rVar;
        this.f95035q = new ku1.k0(context, this);
        this.f95038t = new java.util.ArrayList();
        this.f95039u = new java.util.ArrayList();
        this.f95040v = new java.util.ArrayList();
    }

    @Override // com.tencent.mm.ui.z9, android.widget.Adapter
    public int getCount() {
        java.util.ArrayList arrayList = this.f95038t;
        return arrayList.isEmpty() ? super.getCount() : arrayList.size();
    }

    @Override // com.tencent.mm.ui.z9, android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.tencent.mm.plugin.card.model.CardInfo) this.f95038t.get(i17);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        com.tencent.mm.plugin.card.model.CardInfo cardInfo = (com.tencent.mm.plugin.card.model.CardInfo) this.f95038t.get(i17);
        if (cardInfo.field_card_id.equals("PRIVATE_TICKET_TITLE") || cardInfo.field_card_id.equals("PRIVATE_INVOICE_TITLE")) {
            return 0;
        }
        return cardInfo.m0() ? 2 : 1;
    }

    @Override // com.tencent.mm.plugin.card.ui.k, android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        return ((ku1.k0) this.f95035q).a(i17, view, viewGroup, (com.tencent.mm.plugin.card.model.CardInfo) this.f95038t.get(i17));
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 3;
    }

    @Override // com.tencent.mm.plugin.card.ui.k, com.tencent.mm.ui.z9
    public void o() {
        c();
        q();
    }

    @Override // com.tencent.mm.plugin.card.ui.k, com.tencent.mm.ui.z9
    public void q() {
        c();
        android.database.Cursor y07 = xt1.t0.cj().y0(this.f95036r);
        if (y07 != null) {
            this.f95037s = y07.getCount();
        }
        s(y07);
        java.util.ArrayList arrayList = this.f95038t;
        arrayList.clear();
        java.util.ArrayList arrayList2 = this.f95039u;
        arrayList2.clear();
        java.util.ArrayList arrayList3 = this.f95040v;
        arrayList3.clear();
        for (int i17 = 0; i17 < this.f95037s; i17++) {
            com.tencent.mm.plugin.card.model.CardInfo cardInfo = (com.tencent.mm.plugin.card.model.CardInfo) super.getItem(i17);
            if (cardInfo != null) {
                if (cardInfo.m0()) {
                    arrayList3.add(cardInfo);
                } else {
                    arrayList2.add(cardInfo);
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            com.tencent.mm.plugin.card.model.CardInfo cardInfo2 = new com.tencent.mm.plugin.card.model.CardInfo();
            cardInfo2.field_card_id = "PRIVATE_TICKET_TITLE";
            arrayList.add(cardInfo2);
            arrayList.addAll(arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            com.tencent.mm.plugin.card.model.CardInfo cardInfo3 = new com.tencent.mm.plugin.card.model.CardInfo();
            cardInfo3.field_card_id = "PRIVATE_INVOICE_TITLE";
            arrayList.add(cardInfo3);
            arrayList.addAll(arrayList3);
        }
        this.f95037s = arrayList.size();
        notifyDataSetChanged();
    }

    @Override // com.tencent.mm.plugin.card.ui.k
    public void t() {
        c();
        this.f95035q.release();
        this.f95035q = null;
    }
}
