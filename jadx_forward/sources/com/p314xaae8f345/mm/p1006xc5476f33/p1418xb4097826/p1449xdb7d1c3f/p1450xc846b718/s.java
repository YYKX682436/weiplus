package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.t f187365d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187366e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187367f;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.t tVar, java.lang.String str, java.lang.String str2) {
        this.f187365d = tVar;
        this.f187366e = str;
        this.f187367f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        c61.l7 l7Var = (c61.l7) i95.n0.c(c61.l7.class);
        synchronized (l7Var.f120651i) {
            z17 = l7Var.f120651i[0] != null;
        }
        if (!z17 || !gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f187365d.f187400b, "checkPathAndNotify not ready!");
            return;
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb S0 = zy2.ia.S0(this.f187365d.f187399a, this.f187366e, this.f187367f, false, false, 12, null);
            boolean p17 = this.f187365d.f187399a.p(this.f187366e, S0);
            if (S0 != null) {
                r45.f03 I0 = S0.I0(this.f187366e);
                if (I0 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186886a, "checkPathAndNotify", true, this.f187366e, I0, S0, null, p17, 32, null);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186886a.a("checkPathAndNotify_showInfoNull", false, this.f187366e, null, S0, this.f187367f, p17);
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186886a.a("checkPathAndNotify_null", false, this.f187366e, null, null, this.f187367f, p17);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f187365d.f187400b, e17, "checkPathAndNotify exception!", new java.lang.Object[0]);
        }
    }
}
