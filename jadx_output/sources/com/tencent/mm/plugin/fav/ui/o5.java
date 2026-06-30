package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class o5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s82.g f101317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f101318e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.p5 f101319f;

    public o5(com.tencent.mm.plugin.fav.ui.p5 p5Var, s82.g gVar, int i17) {
        this.f101319f = p5Var;
        this.f101317d = gVar;
        this.f101318e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        s82.g gVar = this.f101317d;
        int i18 = gVar.f404774a.field_type;
        long j17 = gVar.f404774a.field_localId;
        com.tencent.mm.plugin.fav.ui.p5 p5Var = this.f101319f;
        if (p5Var.f101335d.E.size() == 0) {
            p5Var.f101335d.E = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().v0();
        }
        if (p5Var.f101335d.E.size() != 0) {
            java.util.Iterator it = p5Var.f101335d.E.iterator();
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
        com.tencent.mm.plugin.fav.ui.FavSearchUI favSearchUI = p5Var.f101335d;
        int size = favSearchUI.f100409w.size();
        int size2 = favSearchUI.f100410x.size();
        int size3 = favSearchUI.f100411y.size();
        if (size == 0 && size2 == 0 && size3 > 0) {
            i19 = 2;
        } else if (size != 0 || size2 <= 0 || size3 != 0) {
            i19 = (size > 0 && size2 == 0 && size3 == 0) ? 1 : 4;
        }
        objArr[1] = java.lang.Integer.valueOf(i19);
        if (p5Var.f101335d.E.size() == 0) {
            i17 = this.f101318e;
        }
        objArr[2] = java.lang.Integer.valueOf(i17);
        g0Var.d(12746, objArr);
    }
}
