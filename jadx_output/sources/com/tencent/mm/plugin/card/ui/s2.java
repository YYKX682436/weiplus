package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class s2 extends android.widget.BaseAdapter implements com.tencent.mm.plugin.card.ui.r4 {

    /* renamed from: d, reason: collision with root package name */
    public tt1.k f95154d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f95155e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f95156f = new java.util.ArrayList();

    public s2(android.content.Context context) {
        this.f95154d = new com.tencent.mm.plugin.card.ui.l4(context, this);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f95155e).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.tencent.mm.plugin.card.model.CardInfo) ((java.util.ArrayList) this.f95155e).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.card.model.CardInfo cardInfo = (com.tencent.mm.plugin.card.model.CardInfo) ((java.util.ArrayList) this.f95155e).get(i17);
        cardInfo.getClass();
        android.view.View a17 = ((com.tencent.mm.plugin.card.ui.l4) this.f95154d).a(i17, view, viewGroup, cardInfo);
        ((com.tencent.mm.plugin.card.ui.l4) this.f95154d).b(a17, 8);
        return a17;
    }
}
