package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class o5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s82.g f182850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f182851e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p5 f182852f;

    public o5(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p5 p5Var, s82.g gVar, int i17) {
        this.f182852f = p5Var;
        this.f182850d = gVar;
        this.f182851e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        s82.g gVar = this.f182850d;
        int i18 = gVar.f486307a.f67657x2262335f;
        long j17 = gVar.f486307a.f67645x88be67a1;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p5 p5Var = this.f182852f;
        if (p5Var.f182868d.E.size() == 0) {
            p5Var.f182868d.E = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().v0();
        }
        if (p5Var.f182868d.E.size() != 0) {
            java.util.Iterator it = p5Var.f182868d.E.iterator();
            i17 = 1;
            while (it.hasNext() && ((java.lang.Long) it.next()).longValue() != j17) {
                i17++;
            }
        } else {
            i17 = 1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        int i19 = 3;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(gVar.f486307a.f67657x2262335f);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257 activityC13570xd6b9f257 = p5Var.f182868d;
        int size = activityC13570xd6b9f257.f181942w.size();
        int size2 = activityC13570xd6b9f257.f181943x.size();
        int size3 = activityC13570xd6b9f257.f181944y.size();
        if (size == 0 && size2 == 0 && size3 > 0) {
            i19 = 2;
        } else if (size != 0 || size2 <= 0 || size3 != 0) {
            i19 = (size > 0 && size2 == 0 && size3 == 0) ? 1 : 4;
        }
        objArr[1] = java.lang.Integer.valueOf(i19);
        if (p5Var.f182868d.E.size() == 0) {
            i17 = this.f182851e;
        }
        objArr[2] = java.lang.Integer.valueOf(i17);
        g0Var.d(12746, objArr);
    }
}
