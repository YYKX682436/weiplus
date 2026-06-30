package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes9.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.k f180456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f180457e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f180458f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f180459g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f180460h;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.k kVar, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        this.f180456d = kVar;
        this.f180457e = str;
        this.f180458f = i17;
        this.f180459g = str2;
        this.f180460h = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.k kVar = this.f180456d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExDeviceSendIotLogic", "send msgid %d", java.lang.Long.valueOf(kVar.f180477a));
        com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2 c10597xb1f0d2 = new com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2();
        c10597xb1f0d2.f148119d = this.f180457e;
        c10597xb1f0d2.f148128p = this.f180458f;
        c10597xb1f0d2.f148127o = true;
        r45.rf4 rf4Var = new r45.rf4();
        long j17 = kVar.f180477a;
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = kVar.f180488l;
        if (j17 == -1) {
            com.p314xaae8f345.mm.p2621x8fb0427b.b9 H6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().H6(this.f180459g);
            r45.tf4 tf4Var = new r45.tf4();
            tf4Var.f467906d = (float) H6.f275309b;
            tf4Var.f467907e = (float) H6.f275310c;
            tf4Var.f467908f = H6.f275311d;
            tf4Var.f467909g = H6.f275312e;
            tf4Var.f467910h = H6.f275313f;
            rf4Var.f466344f = tf4Var;
            rf4Var.f466342d = 2;
            if (kVar.a(rf4Var, c10597xb1f0d2)) {
                return;
            }
            kVar.b(rf4Var, c10597xb1f0d2, u0Var);
            return;
        }
        java.lang.String str = this.f180460h;
        if (str == null) {
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.p.b(rf4Var, null, j17, kVar.f180478b, "") || kVar.a(rf4Var, c10597xb1f0d2)) {
                return;
            }
            kVar.b(rf4Var, c10597xb1f0d2, u0Var);
            return;
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.p.b(rf4Var, null, j17, kVar.f180478b, str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExDeviceSendIotLogic", "genMsg failed");
        } else {
            if (kVar.a(rf4Var, c10597xb1f0d2)) {
                return;
            }
            kVar.b(rf4Var, c10597xb1f0d2, u0Var);
        }
    }
}
