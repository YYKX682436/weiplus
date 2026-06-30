package ho1;

/* loaded from: classes15.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.v f364266d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364267e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f364268f;

    public k(ho1.v vVar, java.lang.String str, long j17) {
        this.f364266d = vVar;
        this.f364267e = str;
        this.f364268f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ro1.g gVar;
        long j17 = this.f364268f;
        java.lang.String str = this.f364267e;
        ho1.v vVar = this.f364266d;
        try {
            gVar = vVar.f364364c;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(vVar.f364362a, th6, "", new java.lang.Object[0]);
        }
        if (gVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mUDiskChannel");
            throw null;
        }
        java.io.OutputStream h17 = gVar.h(str);
        if (h17 != null) {
            vVar.f364367f.put(str, h17);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.t0 t0Var = vVar.f364369h;
            if (t0Var != null) {
                t0Var.w1(j17, 0, str);
                return;
            }
            return;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.t0 t0Var2 = vVar.f364369h;
        if (t0Var2 != null) {
            t0Var2.w1(j17, -1, str);
        }
    }
}
