package lt5;

/* loaded from: classes8.dex */
public class c implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lt5.d f402828d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f402829e;

    public c(lt5.d dVar, android.content.Context context) {
        this.f402828d = dVar;
        this.f402829e = context;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "msa-init-waiter";
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ((ku5.t0) ku5.t0.f394148d).j(new lt5.b(this), "sn-msa-init-fetcher").get(10L, java.util.concurrent.TimeUnit.SECONDS);
        } catch (java.util.concurrent.TimeoutException unused) {
            lt5.e.d();
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.w("MicroMsg.MsaIdManager", "[!] asyncInit, timeout.");
        } catch (java.lang.Throwable th6) {
            lt5.e.d();
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e("MicroMsg.MsaIdManager", th6, "[-] asyncInit failure.");
        }
    }
}
