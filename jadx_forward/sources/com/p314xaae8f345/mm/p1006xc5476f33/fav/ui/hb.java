package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes9.dex */
public class hb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f182678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f182679e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f182680f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182681g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f182682h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182683i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f182684m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a f182685n;

    public hb(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a activityC13579xef51058a, double d17, double d18, int i17, java.lang.String str, java.lang.CharSequence charSequence, java.lang.String str2, java.util.ArrayList arrayList) {
        this.f182685n = activityC13579xef51058a;
        this.f182678d = d17;
        this.f182679e = d18;
        this.f182680f = i17;
        this.f182681g = str;
        this.f182682h = charSequence;
        this.f182683i = str2;
        this.f182684m = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.pp0 pp0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a activityC13579xef51058a = this.f182685n;
        activityC13579xef51058a.f181800e = true;
        r45.pp0 pp0Var2 = new r45.pp0();
        pp0Var2.t(this.f182681g);
        pp0Var2.u(this.f182678d);
        pp0Var2.w(this.f182679e);
        pp0Var2.E(this.f182680f);
        pp0Var2.C(this.f182683i);
        o72.r2 r2Var = new o72.r2();
        r2Var.f67657x2262335f = 6;
        r2Var.f67651x76e81a5a = 6;
        r2Var.f67640x5ab01132.j(pp0Var2);
        java.lang.CharSequence charSequence = this.f182682h;
        if (charSequence != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(charSequence.toString())) {
            r45.bq0 bq0Var = r2Var.f67640x5ab01132;
            bq0Var.f452503o = charSequence.toString();
            bq0Var.f452504p = true;
            r45.bq0 bq0Var2 = r2Var.f67640x5ab01132;
            bq0Var2.f452509u = java.lang.System.currentTimeMillis();
            bq0Var2.f452510v = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10873, 6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.d4.f(r2Var);
        java.util.ArrayList<java.lang.String> arrayList = this.f182684m;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (java.lang.String str : arrayList) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    java.util.Iterator it = r2Var.f67653xef67d413.f466629e.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (str.equals((java.lang.String) it.next())) {
                                break;
                            }
                        } else {
                            r2Var.f67653xef67d413.f466629e.add(str);
                            break;
                        }
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.a0.a(r2Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10648, 3, 0);
        long j17 = r2Var.f67645x88be67a1;
        o72.x1.f425051d = j17;
        o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(j17);
        if (F == null || (pp0Var = F.f67640x5ab01132.f452499h) == null) {
            return;
        }
        o72.x1.N0(j17, F, pp0Var, "", "", new java.util.ArrayList(), activityC13579xef51058a.mo55332x76847179(), true, true);
    }
}
