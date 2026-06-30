package ai4;

/* loaded from: classes11.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5161d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5162e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.sm0 f5163f;

    public k(int i17, int i18, bw5.sm0 sm0Var) {
        this.f5161d = i17;
        this.f5162e = i18;
        this.f5163f = sm0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (java.util.Map.Entry entry : kz5.c1.s(ai4.m.f5168b).entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            try {
                ((xj4.f) ((ai4.i) entry.getValue())).a(this.f5161d, this.f5162e, this.f5163f);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.StatusStorageEventBridge", th6, "dispatch: observer subId=" + str + " throws", new java.lang.Object[0]);
            }
        }
    }
}
