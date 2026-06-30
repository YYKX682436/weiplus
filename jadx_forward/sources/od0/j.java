package od0;

/* loaded from: classes8.dex */
public class j implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PSIR", "[+] report yap task start running.");
        try {
            w04.l.INSTANCE.Q3();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PSIR", th6, "[yap] unexpected exception was thrown.", new java.lang.Object[0]);
        }
    }
}
