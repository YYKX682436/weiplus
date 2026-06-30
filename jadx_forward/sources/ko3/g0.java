package ko3;

/* loaded from: classes11.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f391494a;

    static {
        long nanoTime = java.lang.System.nanoTime();
        try {
            boolean a17 = com.p314xaae8f345.mm.p975xc206bf10.C11193xebe3852e.a();
            f391494a = a17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NormalMsgSource.DADH", "CDA, result: %b, time: %d ns", java.lang.Boolean.valueOf(a17), java.lang.Long.valueOf(java.lang.System.nanoTime() - nanoTime));
        } catch (java.lang.Throwable th6) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NormalMsgSource.DADH", th6, "unexpected exception.", new java.lang.Object[0]);
                f391494a = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NormalMsgSource.DADH", "CDA, result: %b, time: %d ns", false, java.lang.Long.valueOf(java.lang.System.nanoTime() - nanoTime));
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NormalMsgSource.DADH", "CDA, result: %b, time: %d ns", java.lang.Boolean.valueOf(f391494a), java.lang.Long.valueOf(java.lang.System.nanoTime() - nanoTime));
                throw th7;
            }
        }
    }
}
