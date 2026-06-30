package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f156475a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f156476b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f156477c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f156478d;

    public e(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.util.List list) {
        this.f156475a = context;
        this.f156477c = v5Var;
        this.f156478d = list;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, false, 0);
        this.f156476b = k0Var;
        android.view.View z27 = v5Var.z2(context);
        if (z27 != null) {
            k0Var.s(z27, true);
        }
        k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.a(this);
        k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.b(this);
        k0Var.f293407o = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.c(this);
        k0Var.f293417v = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.d(this);
        if (al1.j0.BLACK == v5Var.t1()) {
            k0Var.l(android.graphics.Color.parseColor("#000000"));
        }
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.e eVar, db5.g4 g4Var, boolean z17) {
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u0 u0Var : eVar.f156478d) {
            if (u0Var != null && u0Var.f167527b == z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = eVar.f156477c;
                u0Var.f167530e.a(eVar.f156475a, v5Var, g4Var, v5Var.mo48798x74292566());
            }
        }
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.e eVar, android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u0 u0Var;
        boolean z17;
        eVar.getClass();
        int itemId = menuItem.getItemId();
        java.util.Iterator it = eVar.f156478d.iterator();
        while (true) {
            if (!it.hasNext()) {
                u0Var = null;
                break;
            } else {
                u0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u0) it.next();
                if (u0Var.f167526a == itemId) {
                    break;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = eVar.f156477c;
        java.lang.String mo48798x74292566 = v5Var.mo48798x74292566();
        if (u0Var == null) {
            z17 = false;
        } else {
            u0Var.f167530e.c(eVar.f156475a, v5Var, mo48798x74292566, u0Var);
            z17 = true;
        }
        if (z17) {
            eVar.f156476b.u();
        }
    }
}
