package ai4;

/* loaded from: classes11.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f86694d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f86695e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.sm0 f86696f;

    public k(int i17, int i18, bw5.sm0 sm0Var) {
        this.f86694d = i17;
        this.f86695e = i18;
        this.f86696f = sm0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (java.util.Map.Entry entry : kz5.c1.s(ai4.m.f86701b).entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            try {
                ((xj4.f) ((ai4.i) entry.getValue())).a(this.f86694d, this.f86695e, this.f86696f);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.StatusStorageEventBridge", th6, "dispatch: observer subId=" + str + " throws", new java.lang.Object[0]);
            }
        }
    }
}
