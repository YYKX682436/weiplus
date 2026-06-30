package da5;

/* loaded from: classes15.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final da5.r f309350a = new da5.r();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.CountDownLatch f309351b = new java.util.concurrent.CountDownLatch(1);

    /* JADX WARN: Code restructure failed: missing block: B:39:0x010c, code lost:
    
        if (r9.equals("3G") == false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: da5.r.a():boolean");
    }

    public final boolean b() {
        return f309351b.getCount() > 0;
    }

    public final void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UDRAffStartListener", "call udr startInitUDR");
        synchronized (this) {
            java.util.concurrent.CountDownLatch countDownLatch = f309351b;
            if (countDownLatch.getCount() == 0) {
                return;
            }
            f309350a.a();
            countDownLatch.countDown();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UDRAffStartListener", "call udr startInitUDR end");
        }
    }
}
