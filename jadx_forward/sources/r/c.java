package r;

/* loaded from: classes16.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.AbstractC11199x9d3689a1 f449479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f449480e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d f449481f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f f449482g;

    public c(com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.AbstractC11199x9d3689a1 abstractC11199x9d3689a1, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f) {
        this.f449479d = abstractC11199x9d3689a1;
        this.f449480e = c0Var;
        this.f449481f = abstractC1104xc1ad431d;
        this.f449482g = activityC1102x9ee2d9f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f449480e;
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d = this.f449481f;
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f = this.f449482g;
        com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.AbstractC11199x9d3689a1 abstractC11199x9d3689a1 = this.f449479d;
        boolean z18 = true;
        try {
            if (abstractC11199x9d3689a1.m7481x7a6e8df6() && !abstractC11199x9d3689a1.m7482xefa32bc() && !abstractC11199x9d3689a1.m7489xb226ab8b()) {
                if (!com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.AbstractC11199x9d3689a1.b(abstractC1104xc1ad431d, abstractC11199x9d3689a1) && !c0Var.f391645d) {
                    z17 = false;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVC.BaseCard", "dismiss fallback lastFragment=" + z17);
                    p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = abstractC1104xc1ad431d.m7630xb2c12e75();
                    m7630xb2c12e75.j(abstractC11199x9d3689a1);
                    m7630xb2c12e75.e();
                    com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.AbstractC11199x9d3689a1.a(activityC1102x9ee2d9f, z17);
                    return;
                }
                z17 = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVC.BaseCard", "dismiss fallback lastFragment=" + z17);
                p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e752 = abstractC1104xc1ad431d.m7630xb2c12e75();
                m7630xb2c12e752.j(abstractC11199x9d3689a1);
                m7630xb2c12e752.e();
                com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.AbstractC11199x9d3689a1.a(activityC1102x9ee2d9f, z17);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVC.BaseCard", "dismiss fallback: fragment not valid, isAdded=" + abstractC11199x9d3689a1.m7481x7a6e8df6() + ", isDetached=" + abstractC11199x9d3689a1.m7482xefa32bc() + ", isRemoving=" + abstractC11199x9d3689a1.m7489xb226ab8b());
            com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.AbstractC11199x9d3689a1.a(activityC1102x9ee2d9f, c0Var.f391645d);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.OVC.BaseCard", th6, "dismiss fallback failed", new java.lang.Object[0]);
            if (!com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.AbstractC11199x9d3689a1.b(abstractC1104xc1ad431d, abstractC11199x9d3689a1) && !c0Var.f391645d) {
                z18 = false;
            }
            com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.AbstractC11199x9d3689a1.a(activityC1102x9ee2d9f, z18);
        }
    }
}
