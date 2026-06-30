package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes8.dex */
public abstract class d extends android.widget.BaseAdapter {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f222884i = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f222885d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f222886e;

    /* renamed from: f, reason: collision with root package name */
    public kk.j f222887f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f222888g = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.b(this), false);

    /* renamed from: h, reason: collision with root package name */
    public final l75.q0 f222889h;

    public d(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.c cVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.c(this);
        this.f222889h = cVar;
        this.f222885d = context;
        this.f222886e = new java.util.LinkedList();
        this.f222887f = new jt0.i(20, getClass());
        ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
        zo3.p.Ri().add(cVar);
    }

    public void a(java.util.LinkedList linkedList) {
        if (linkedList == null) {
            return;
        }
        this.f222886e.addAll(linkedList);
        super.notifyDataSetChanged();
    }

    public void c(java.util.LinkedList linkedList) {
        if (linkedList == null) {
            return;
        }
        this.f222886e = linkedList;
        super.notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f222886e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f222886e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }
}
