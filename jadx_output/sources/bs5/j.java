package bs5;

/* loaded from: classes13.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bs5.k f24041d;

    public j(bs5.k kVar) {
        this.f24041d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        tr5.g0 f17 = tr5.l.f(this.f24041d.f24044f);
        if (((fs5.c) f17.f421493e).f266358m.f24029i == 2) {
            gs5.f.a("HDNSLookupAsyncRetry", f17);
        } else {
            gs5.f.a("HDNSLookupAsync", f17);
        }
    }
}
