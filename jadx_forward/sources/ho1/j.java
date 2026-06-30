package ho1;

/* loaded from: classes15.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.v f364252d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364253e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f364254f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ byte[] f364255g;

    public j(ho1.v vVar, java.lang.String str, long j17, byte[] bArr) {
        this.f364252d = vVar;
        this.f364253e = str;
        this.f364254f = j17;
        this.f364255g = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ho1.v vVar = this.f364252d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = vVar.f364367f;
        java.lang.String str = this.f364253e;
        java.io.OutputStream outputStream = (java.io.OutputStream) concurrentHashMap.get(str);
        long j17 = this.f364254f;
        if (outputStream != null) {
            byte[] bArr = this.f364255g;
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f364362a, "Enter fileStreamWriteAsync, before write, taskId: " + j17 + ", context: " + str);
                outputStream.write(bArr);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.t0 t0Var = vVar.f364369h;
                if (t0Var != null) {
                    t0Var.g0(j17, 0);
                    return;
                }
                return;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(vVar.f364362a, th6, "fail to write buf. context = " + str + ", taskId: " + j17 + ", buf.size=" + bArr.length + ", e=" + th6, new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.t0 t0Var2 = vVar.f364369h;
        if (t0Var2 != null) {
            t0Var2.g0(j17, -1);
        }
    }
}
