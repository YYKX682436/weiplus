package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f283100a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f283101b = new java.util.ArrayList();

    public y0(int i17, java.util.List list) {
        this.f283100a = i17;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.c1 c1Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.c1) it.next();
                if (c1Var != null) {
                    this.f283101b.add(c1Var);
                }
            }
        }
    }

    public final void a() {
        java.util.List list = this.f283101b;
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.c1) it.next()).mo79584x6761d4f();
        }
        java.util.Iterator it6 = ((java.util.ArrayList) list).iterator();
        int i17 = 0;
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.c1 c1Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.c1) it6.next();
            i17 += c1Var.mo79583x755bd410();
            c1Var.mo79583x755bd410();
            c1Var.mo79582x3662b71a();
        }
        int i18 = this.f283100a;
        if (i17 <= i18) {
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        if (arrayList.size() > 1) {
            kz5.g0.t(arrayList, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.x0());
        }
        java.util.Iterator it7 = ((java.util.ArrayList) list).iterator();
        while (it7.hasNext()) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.c1 c1Var2 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.c1) it7.next();
            if (i17 - i18 <= 0) {
                return;
            }
            int mo79583x755bd410 = c1Var2.mo79583x755bd410();
            if (mo79583x755bd410 - c1Var2.mo79581x29d8f80a() > 0) {
                i17 -= mo79583x755bd410 - c1Var2.a();
                c1Var2.mo79582x3662b71a();
                c1Var2.mo79583x755bd410();
            }
        }
    }
}
