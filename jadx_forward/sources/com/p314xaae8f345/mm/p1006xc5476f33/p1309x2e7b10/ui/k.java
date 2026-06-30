package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class k extends com.p314xaae8f345.mm.ui.z9 implements com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.r4 {

    /* renamed from: o, reason: collision with root package name */
    public final xt1.r f176574o;

    /* renamed from: p, reason: collision with root package name */
    public tt1.k f176575p;

    public k(android.content.Context context, xt1.r rVar) {
        super(context, new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe());
        this.f176574o = rVar;
        r(true);
        this.f176575p = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.l4(context, this);
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe c13038x357affe = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe) obj;
        if (c13038x357affe == null) {
            c13038x357affe = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe();
        }
        if (cursor.isClosed()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardAdapter", "cursor is closed!");
        } else {
            c13038x357affe.mo9015xbf5d97fd(cursor);
        }
        return c13038x357affe;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        return this.f176575p.a(i17, view, viewGroup, (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe) getItem(i17));
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void o() {
        c();
        q();
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void q() {
        c();
        android.database.Cursor y07 = xt1.t0.cj().y0(this.f176574o);
        if (y07 != null) {
            y07.getCount();
        }
        s(y07);
        notifyDataSetChanged();
    }

    public void t() {
        c();
        this.f176575p.mo54459x41012807();
        this.f176575p = null;
    }
}
