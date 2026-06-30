package od0;

/* loaded from: classes8.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f426091d;

    public m(int i17) {
        this.f426091d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PSIR", "[+] report finder task start running.");
        try {
            w04.l.INSTANCE.xg(this.f426091d);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PSIR", th6, "[finder] unexpected exception was thrown.", new java.lang.Object[0]);
        }
    }
}
