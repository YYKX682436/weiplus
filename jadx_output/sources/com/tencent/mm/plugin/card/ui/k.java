package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class k extends com.tencent.mm.ui.z9 implements com.tencent.mm.plugin.card.ui.r4 {

    /* renamed from: o, reason: collision with root package name */
    public final xt1.r f95041o;

    /* renamed from: p, reason: collision with root package name */
    public tt1.k f95042p;

    public k(android.content.Context context, xt1.r rVar) {
        super(context, new com.tencent.mm.plugin.card.model.CardInfo());
        this.f95041o = rVar;
        r(true);
        this.f95042p = new com.tencent.mm.plugin.card.ui.l4(context, this);
    }

    @Override // com.tencent.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        com.tencent.mm.plugin.card.model.CardInfo cardInfo = (com.tencent.mm.plugin.card.model.CardInfo) obj;
        if (cardInfo == null) {
            cardInfo = new com.tencent.mm.plugin.card.model.CardInfo();
        }
        if (cursor.isClosed()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardAdapter", "cursor is closed!");
        } else {
            cardInfo.convertFrom(cursor);
        }
        return cardInfo;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        return this.f95042p.a(i17, view, viewGroup, (com.tencent.mm.plugin.card.model.CardInfo) getItem(i17));
    }

    @Override // com.tencent.mm.ui.z9
    public void o() {
        c();
        q();
    }

    @Override // com.tencent.mm.ui.z9
    public void q() {
        c();
        android.database.Cursor y07 = xt1.t0.cj().y0(this.f95041o);
        if (y07 != null) {
            y07.getCount();
        }
        s(y07);
        notifyDataSetChanged();
    }

    public void t() {
        c();
        this.f95042p.release();
        this.f95042p = null;
    }
}
