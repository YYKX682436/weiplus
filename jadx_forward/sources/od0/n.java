package od0;

/* loaded from: classes8.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f426094d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426095e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f426096f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f426097g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426098h;

    public n(int i17, java.lang.String str, long j17, int i18, java.lang.String str2) {
        this.f426094d = i17;
        this.f426095e = str;
        this.f426096f = j17;
        this.f426097g = i18;
        this.f426098h = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PSIR", "[+] report sre start running.");
        try {
            w04.l.INSTANCE.k4(this.f426094d, this.f426095e, this.f426096f, this.f426097g, this.f426098h);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PSIR", th6, "[sre] unexpected exception was thrown.", new java.lang.Object[0]);
        }
    }
}
