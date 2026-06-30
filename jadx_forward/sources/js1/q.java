package js1;

/* loaded from: classes4.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final js1.q f383030d = new js1.q();

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TransferRequestTokenManager", "[transferRequest] h5Auth onGetTokenFailed");
        js1.s.f383035d = false;
        js1.s sVar = js1.s.f383032a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransferRequestTokenManager", "clearToken");
        ((ku5.t0) ku5.t0.f394148d).h(js1.n.f383026d, "TransferRequestTokenManager");
        java.util.Iterator it = js1.s.f383034c.iterator();
        while (it.hasNext()) {
            ((js1.a) it.next()).a(null, false);
        }
        js1.s.f383034c.clear();
    }
}
