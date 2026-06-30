package bs5;

/* loaded from: classes13.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tr5.f0 f24046d;

    public l(bs5.m mVar, tr5.f0 f0Var) {
        this.f24046d = f0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        tr5.g0 f17 = tr5.l.f(this.f24046d);
        if (((fs5.c) f17.f421493e).f266358m.f24029i == 2) {
            gs5.f.a("HDNSLookupAsyncRetry", f17);
        } else {
            gs5.f.a("HDNSLookupAsync", f17);
        }
    }
}
