package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class j4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.k {

    /* renamed from: q, reason: collision with root package name */
    public tt1.k f176568q;

    /* renamed from: r, reason: collision with root package name */
    public final xt1.r f176569r;

    /* renamed from: s, reason: collision with root package name */
    public int f176570s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.ArrayList f176571t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.ArrayList f176572u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.ArrayList f176573v;

    public j4(android.content.Context context, xt1.r rVar) {
        super(context, rVar);
        this.f176570s = 0;
        this.f176569r = rVar;
        this.f176568q = new ku1.k0(context, this);
        this.f176571t = new java.util.ArrayList();
        this.f176572u = new java.util.ArrayList();
        this.f176573v = new java.util.ArrayList();
    }

    @Override // com.p314xaae8f345.mm.ui.z9, android.widget.Adapter
    public int getCount() {
        java.util.ArrayList arrayList = this.f176571t;
        return arrayList.isEmpty() ? super.getCount() : arrayList.size();
    }

    @Override // com.p314xaae8f345.mm.ui.z9, android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe) this.f176571t.get(i17);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe c13038x357affe = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe) this.f176571t.get(i17);
        if (c13038x357affe.f67736x95970a65.equals("PRIVATE_TICKET_TITLE") || c13038x357affe.f67736x95970a65.equals("PRIVATE_INVOICE_TITLE")) {
            return 0;
        }
        return c13038x357affe.m0() ? 2 : 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.k, android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        return ((ku1.k0) this.f176568q).a(i17, view, viewGroup, (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe) this.f176571t.get(i17));
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 3;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.k, com.p314xaae8f345.mm.ui.z9
    public void o() {
        c();
        q();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.k, com.p314xaae8f345.mm.ui.z9
    public void q() {
        c();
        android.database.Cursor y07 = xt1.t0.cj().y0(this.f176569r);
        if (y07 != null) {
            this.f176570s = y07.getCount();
        }
        s(y07);
        java.util.ArrayList arrayList = this.f176571t;
        arrayList.clear();
        java.util.ArrayList arrayList2 = this.f176572u;
        arrayList2.clear();
        java.util.ArrayList arrayList3 = this.f176573v;
        arrayList3.clear();
        for (int i17 = 0; i17 < this.f176570s; i17++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe c13038x357affe = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe) super.getItem(i17);
            if (c13038x357affe != null) {
                if (c13038x357affe.m0()) {
                    arrayList3.add(c13038x357affe);
                } else {
                    arrayList2.add(c13038x357affe);
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe c13038x357affe2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe();
            c13038x357affe2.f67736x95970a65 = "PRIVATE_TICKET_TITLE";
            arrayList.add(c13038x357affe2);
            arrayList.addAll(arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe c13038x357affe3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe();
            c13038x357affe3.f67736x95970a65 = "PRIVATE_INVOICE_TITLE";
            arrayList.add(c13038x357affe3);
            arrayList.addAll(arrayList3);
        }
        this.f176570s = arrayList.size();
        notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.k
    public void t() {
        c();
        this.f176568q.mo54459x41012807();
        this.f176568q = null;
    }
}
