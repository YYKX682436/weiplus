package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public final class h9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s82.g f182674d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da f182675e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f182676f;

    public h9(s82.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da daVar, int i17) {
        this.f182674d = gVar;
        this.f182675e = daVar;
        this.f182676f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        s82.g gVar = this.f182674d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSearchManager", "type %s", java.lang.Integer.valueOf(gVar.f486307a.f67657x2262335f));
        long j17 = gVar.f486307a.f67645x88be67a1;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da daVar = this.f182675e;
        if (daVar.f182122t.isEmpty()) {
            java.util.List v07 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().v0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(v07, "getFavLocalIdList(...)");
            daVar.f182122t = v07;
        }
        if (!daVar.f182122t.isEmpty()) {
            java.util.Iterator it = daVar.f182122t.iterator();
            i17 = 1;
            while (it.hasNext() && ((java.lang.Number) it.next()).longValue() != j17) {
                i17++;
            }
        } else {
            i17 = 1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(gVar.f486307a.f67657x2262335f);
        if (daVar.f182122t.isEmpty()) {
            i17 = this.f182676f;
        }
        objArr[1] = java.lang.Integer.valueOf(i17);
        g0Var.d(12746, objArr);
    }
}
