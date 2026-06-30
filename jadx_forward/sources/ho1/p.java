package ho1;

/* loaded from: classes15.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364308d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ho1.v f364309e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f364310f;

    public p(java.lang.String str, ho1.v vVar, long j17) {
        this.f364308d = str;
        this.f364309e = vVar;
        this.f364310f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j17 = this.f364310f;
        ho1.v vVar = this.f364309e;
        java.lang.String str = this.f364308d;
        if (str != null) {
            ro1.g gVar = vVar.f364364c;
            if (gVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mUDiskChannel");
                throw null;
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.b0 e17 = gVar.e(str);
            if (e17 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f364362a, "Get backup files count: %s", java.lang.Integer.valueOf(e17.f297331d.size()));
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.t0 t0Var = vVar.f364369h;
                if (t0Var != null) {
                    t0Var.P1(j17, 0, e17);
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(vVar.f364362a, "Get backup files failed!");
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.t0 t0Var2 = vVar.f364369h;
        if (t0Var2 != null) {
            t0Var2.P1(j17, -2, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.b0.f297330e);
        }
    }
}
