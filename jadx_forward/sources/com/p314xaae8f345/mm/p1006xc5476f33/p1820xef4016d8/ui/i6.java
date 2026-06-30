package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public abstract class i6 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f228550d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final android.view.LayoutInflater f228551e;

    public i6(android.content.Context context) {
        this.f228551e = android.view.LayoutInflater.from(context);
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o4 getItem(int i17) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o4) this.f228550d.get(i17);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f228550d.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }
}
