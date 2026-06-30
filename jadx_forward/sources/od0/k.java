package od0;

/* loaded from: classes8.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426084d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f426085e;

    public k(java.lang.String str, byte[] bArr) {
        this.f426084d = str;
        this.f426085e = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PSIR", "[+] report sensor scene info task start running.");
        try {
            w04.l.INSTANCE.kd(this.f426084d, this.f426085e);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PSIR", th6, "[sensor] unexpected exception was thrown.", new java.lang.Object[0]);
        }
    }
}
