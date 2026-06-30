package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class x8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.b9 f192579d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 f192580e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.b9 b9Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3) {
        super(0);
        this.f192579d = b9Var;
        this.f192580e = c5445x963cab3;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.b9 b9Var = this.f192579d;
        java.lang.String v17 = b9Var.v();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feedChangeListener ");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3 = this.f192580e;
        sb6.append(c5445x963cab3.f135785g.f88451a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(v17, sb6.toString());
        java.util.ArrayList arrayList = b9Var.f187897u;
        if (arrayList.size() > 0) {
            long mo2128x1ed62e84 = ((so2.j5) arrayList.get(0)).mo2128x1ed62e84();
            am.ia iaVar = c5445x963cab3.f135785g;
            long j17 = iaVar.f88451a;
            if (mo2128x1ed62e84 == j17 && j17 != 0) {
                int i17 = iaVar.f88452b;
                if (i17 == 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var3 = b9Var.f187957g;
                    if (i0Var3 != null) {
                        i0Var3.a().m8152xc67946d3(0, 1, 1);
                    }
                } else if (i17 == 4) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var4 = b9Var.f187957g;
                    if (i0Var4 != null) {
                        i0Var4.a().m8152xc67946d3(0, 1, new jz5.l(3, 1));
                    }
                    if (iaVar.f88461k > 0 && (i0Var = b9Var.f187957g) != null) {
                        i0Var.a().m8152xc67946d3(0, 1, new jz5.l(35, c5445x963cab3));
                    }
                } else if (i17 == 5) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var5 = b9Var.f187957g;
                    if (i0Var5 != null) {
                        i0Var5.a().m8152xc67946d3(0, 1, new jz5.l(4, 1));
                    }
                    if (iaVar.f88461k > 0 && (i0Var2 = b9Var.f187957g) != null) {
                        i0Var2.a().m8152xc67946d3(0, 1, new jz5.l(35, c5445x963cab3));
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
