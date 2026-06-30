package od0;

/* loaded from: classes8.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f426088d;

    public l(byte[] bArr) {
        this.f426088d = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PSIR", "[+] report turing owner task start running.");
        try {
            w04.l.INSTANCE.C2(this.f426088d);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PSIR", th6, "[TuringOwner] unexpected exception was thrown.", new java.lang.Object[0]);
        }
    }
}
