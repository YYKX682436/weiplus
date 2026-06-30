package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5;

/* loaded from: classes2.dex */
public final class h2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l2 f207598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f207599e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f207600f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f207601g;

    public h2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l2 l2Var, int i17, int i18, int i19) {
        this.f207598d = l2Var;
        this.f207599e = i17;
        this.f207600f = i18;
        this.f207601g = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l2 l2Var = this.f207598d;
        java.util.Iterator it = l2Var.f207651i.iterator();
        while (it.hasNext()) {
            java.lang.Long l17 = (java.lang.Long) it.next();
            r45.rv0 rv0Var = new r45.rv0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
            rv0Var.set(0, java.lang.Long.valueOf(l17.longValue()));
            linkedList.add(rv0Var);
        }
        l2Var.f207650h = null;
        l2Var.f207651i.clear();
        this.f207598d.Di(this.f207599e, this.f207600f, linkedList, this.f207601g, true);
    }
}
