package od0;

/* loaded from: classes8.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f426099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f426100e;

    public o(int i17, byte[] bArr) {
        this.f426099d = i17;
        this.f426100e = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PSIR", "[+] report task start running.");
        try {
            w04.l.INSTANCE.a8(this.f426099d, 1008, 0, 0, this.f426100e, false);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PSIR", th6, "unexpected exception was thrown.", new java.lang.Object[0]);
        }
    }
}
