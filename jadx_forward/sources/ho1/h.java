package ho1;

/* loaded from: classes15.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.v f364229d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364230e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f364231f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f364232g;

    public h(ho1.v vVar, java.lang.String str, long j17, long j18) {
        this.f364229d = vVar;
        this.f364230e = str;
        this.f364231f = j17;
        this.f364232g = j18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        ho1.v vVar = this.f364229d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = vVar.f364368g;
        java.lang.String str = this.f364230e;
        java.io.InputStream inputStream = (java.io.InputStream) concurrentHashMap.get(str);
        long j17 = this.f364231f;
        if (inputStream != null) {
            long j18 = this.f364232g;
            int i18 = (int) j18;
            byte[] bArr = new byte[i18];
            try {
                if (inputStream.read(bArr) != i18) {
                    java.io.InputStream inputStream2 = (java.io.InputStream) vVar.f364368g.remove(str);
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                    i17 = 1;
                } else {
                    i17 = 0;
                }
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.t0 t0Var = vVar.f364369h;
                if (t0Var != null) {
                    t0Var.D0(j17, i17, bArr);
                    return;
                }
                return;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(vVar.f364362a, th6, "fail to read, taskId=" + j17 + ", readSize=" + j18 + ", e=" + th6, new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.t0 t0Var2 = vVar.f364369h;
        if (t0Var2 != null) {
            t0Var2.D0(j17, -1, new byte[0]);
        }
    }
}
