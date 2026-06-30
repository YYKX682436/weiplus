package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s82.g f101157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f101158e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.j2 f101159f;

    public i2(com.tencent.mm.plugin.fav.ui.j2 j2Var, s82.g gVar, int i17) {
        this.f101159f = j2Var;
        this.f101157d = gVar;
        this.f101158e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        s82.g gVar = this.f101157d;
        int i18 = gVar.f404774a.field_type;
        long j17 = gVar.f404774a.field_localId;
        com.tencent.mm.plugin.fav.ui.j2 j2Var = this.f101159f;
        if (j2Var.f101193d.f100343w.size() == 0) {
            j2Var.f101193d.f100343w = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().v0();
        }
        if (j2Var.f101193d.f100343w.size() != 0) {
            java.util.Iterator it = j2Var.f101193d.f100343w.iterator();
            i17 = 1;
            while (it.hasNext() && ((java.lang.Long) it.next()).longValue() != j17) {
                i17++;
            }
        } else {
            i17 = 1;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        int i19 = 3;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(gVar.f404774a.field_type);
        com.tencent.mm.plugin.fav.ui.FavFilterUI favFilterUI = j2Var.f101193d;
        int size = ((java.util.LinkedList) favFilterUI.f100339s).size();
        int size2 = ((java.util.LinkedList) favFilterUI.f100340t).size();
        int size3 = ((java.util.LinkedList) favFilterUI.f100341u).size();
        if (size == 0 && size2 == 0 && size3 > 0) {
            i19 = 2;
        } else if (size != 0 || size2 <= 0 || size3 != 0) {
            i19 = (size > 0 && size2 == 0 && size3 == 0) ? 1 : 4;
        }
        objArr[1] = java.lang.Integer.valueOf(i19);
        if (j2Var.f101193d.f100343w.size() == 0) {
            i17 = this.f101158e;
        }
        objArr[2] = java.lang.Integer.valueOf(i17);
        g0Var.d(12746, objArr);
    }
}
