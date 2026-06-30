package ho1;

/* loaded from: classes15.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ho1.v f364191e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f364192f;

    public e(java.lang.String str, ho1.v vVar, long j17) {
        this.f364190d = str;
        this.f364191e = vVar;
        this.f364192f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean i17;
        long j17 = this.f364192f;
        ho1.v vVar = this.f364191e;
        java.lang.String str = this.f364190d;
        if (str != null) {
            try {
                ro1.g gVar = vVar.f364364c;
                if (gVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mUDiskChannel");
                    throw null;
                }
                i17 = gVar.i(str);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(vVar.f364362a, th6, "", new java.lang.Object[0]);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.t0 t0Var = vVar.f364369h;
                if (t0Var != null) {
                    t0Var.h1(j17, -1);
                    return;
                }
                return;
            }
        } else {
            i17 = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f364362a, "[deleteFileAsync] delete successfully, filePath=" + str);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.t0 t0Var2 = vVar.f364369h;
        if (t0Var2 != null) {
            t0Var2.h1(j17, i17 ? 0 : -2);
        }
    }
}
