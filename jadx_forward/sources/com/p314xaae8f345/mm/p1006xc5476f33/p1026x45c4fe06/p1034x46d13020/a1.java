package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes7.dex */
public class a1 implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i11.e f157912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f157913e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.c1 f157914f;

    public a1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.c1 c1Var, i11.e eVar, java.lang.Runnable runnable) {
        this.f157914f = c1Var;
        this.f157912d = eVar;
        this.f157913e = runnable;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandHistoryLogic[collection]", "stop getLocation ");
        ((i11.h) this.f157912d).m(this);
        this.f157914f.f157936i = null;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandHistoryLogic[collection]", "getLocation fail");
            synchronized (this.f157914f) {
                this.f157914f.f157933f = false;
            }
            this.f157913e.run();
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandHistoryLogic[collection]", "fLongitude:%f, fLatitude:%f, locType:%d, speed:%f, accuracy:%f, altitude:%f", java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18), java.lang.Integer.valueOf(i17), java.lang.Double.valueOf(d17), java.lang.Double.valueOf(d18), java.lang.Double.valueOf(d19));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.c1 c1Var = this.f157914f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11711x54208329 c11711x54208329 = c1Var.f157931d;
        c11711x54208329.f157880d = f18;
        c11711x54208329.f157881e = f17;
        c11711x54208329.f157882f = i17;
        c11711x54208329.f157883g = d17;
        c11711x54208329.f157884h = d18;
        c11711x54208329.f157885i = d19;
        i11.e eVar = this.f157912d;
        c11711x54208329.f157886m = ((i11.h) eVar).f368632h;
        c1Var.f157932e = ((i11.h) eVar).h();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158012m.f157879i = this.f157914f.f157931d;
        ik1.h0.a().mo50300x3fa464aa(this.f157914f.f157934g);
        if (this.f157914f.f157933f) {
            this.f157913e.run();
        }
        synchronized (this.f157914f) {
            this.f157914f.f157933f = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandHistoryLogic[collection]", "save Location to temp cache");
        return false;
    }
}
