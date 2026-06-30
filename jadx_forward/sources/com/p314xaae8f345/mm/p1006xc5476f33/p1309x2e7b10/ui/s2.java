package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class s2 extends android.widget.BaseAdapter implements com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.r4 {

    /* renamed from: d, reason: collision with root package name */
    public tt1.k f176687d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f176688e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f176689f = new java.util.ArrayList();

    public s2(android.content.Context context) {
        this.f176687d = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.l4(context, this);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f176688e).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe) ((java.util.ArrayList) this.f176688e).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe c13038x357affe = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe) ((java.util.ArrayList) this.f176688e).get(i17);
        c13038x357affe.getClass();
        android.view.View a17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.l4) this.f176687d).a(i17, view, viewGroup, c13038x357affe);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.l4) this.f176687d).b(a17, 8);
        return a17;
    }
}
