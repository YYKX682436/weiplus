package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public final class h9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s82.g f101141d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.da f101142e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f101143f;

    public h9(s82.g gVar, com.tencent.mm.plugin.fav.ui.da daVar, int i17) {
        this.f101141d = gVar;
        this.f101142e = daVar;
        this.f101143f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        s82.g gVar = this.f101141d;
        com.tencent.mars.xlog.Log.i("MicroMsg.FavSearchManager", "type %s", java.lang.Integer.valueOf(gVar.f404774a.field_type));
        long j17 = gVar.f404774a.field_localId;
        com.tencent.mm.plugin.fav.ui.da daVar = this.f101142e;
        if (daVar.f100589t.isEmpty()) {
            java.util.List v07 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().v0();
            kotlin.jvm.internal.o.f(v07, "getFavLocalIdList(...)");
            daVar.f100589t = v07;
        }
        if (!daVar.f100589t.isEmpty()) {
            java.util.Iterator it = daVar.f100589t.iterator();
            i17 = 1;
            while (it.hasNext() && ((java.lang.Number) it.next()).longValue() != j17) {
                i17++;
            }
        } else {
            i17 = 1;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(gVar.f404774a.field_type);
        if (daVar.f100589t.isEmpty()) {
            i17 = this.f101143f;
        }
        objArr[1] = java.lang.Integer.valueOf(i17);
        g0Var.d(12746, objArr);
    }
}
