package ho1;

/* loaded from: classes15.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.v f364274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364275e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f364276f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ byte[] f364277g;

    public l(ho1.v vVar, java.lang.String str, long j17, byte[] bArr) {
        this.f364274d = vVar;
        this.f364275e = str;
        this.f364276f = j17;
        this.f364277g = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ho1.v vVar = this.f364274d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = vVar.f364367f;
        java.lang.String str = this.f364275e;
        java.io.OutputStream outputStream = (java.io.OutputStream) concurrentHashMap.remove(str);
        long j17 = this.f364276f;
        if (outputStream != null) {
            byte[] bArr = this.f364277g;
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f364362a, "fileStreamWriteEndAsync before write, taskId=" + j17 + " context=" + str);
                if (!(bArr.length == 0)) {
                    outputStream.write(bArr);
                }
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.t0 t0Var = vVar.f364369h;
                if (t0Var != null) {
                    t0Var.E0(j17, 0);
                }
                vz5.b.a(outputStream, null);
                return;
            } catch (java.lang.Throwable th6) {
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(vVar.f364362a, th6, "fail to write buf. context = " + str + ", taskId=" + j17 + ", buf.size=" + bArr.length + ", tr=" + th6, new java.lang.Object[0]);
                    vz5.b.a(outputStream, null);
                } catch (java.lang.Throwable th7) {
                    try {
                        throw th7;
                    } catch (java.lang.Throwable th8) {
                        vz5.b.a(outputStream, th7);
                        throw th8;
                    }
                }
            }
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.t0 t0Var2 = vVar.f364369h;
        if (t0Var2 != null) {
            t0Var2.E0(j17, -1);
        }
    }
}
