package ho1;

/* loaded from: classes15.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.v f364239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f364240e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364241f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f364242g;

    public i(ho1.v vVar, long j17, java.lang.String str, long j18) {
        this.f364239d = vVar;
        this.f364240e = j17;
        this.f364241f = str;
        this.f364242g = j18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ro1.g gVar;
        ho1.v vVar = this.f364239d;
        java.lang.String str = vVar.f364362a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fileStreamReadBeginAsync, before open, taskId=");
        long j17 = this.f364240e;
        sb6.append(j17);
        sb6.append(", remotePath=");
        java.lang.String str2 = this.f364241f;
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        try {
            gVar = vVar.f364364c;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(vVar.f364362a, th6, "Failed to read. taskId = " + j17 + ", remotePath = " + str2 + ", readSize = " + this.f364242g, new java.lang.Object[0]);
        }
        if (gVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mUDiskChannel");
            throw null;
        }
        java.io.InputStream g17 = gVar.g(str2);
        if (g17 != null) {
            java.lang.String str3 = this.f364241f;
            long j18 = this.f364240e;
            vVar.f364368g.put(str3, g17);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.t0 t0Var = vVar.f364369h;
            if (t0Var != null) {
                t0Var.I0(j18, 0, str3, new byte[0]);
                return;
            }
            return;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.t0 t0Var2 = vVar.f364369h;
        if (t0Var2 != null) {
            t0Var2.I0(this.f364240e, -2, this.f364241f, new byte[0]);
        }
    }
}
