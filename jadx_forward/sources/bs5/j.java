package bs5;

/* loaded from: classes13.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bs5.k f105574d;

    public j(bs5.k kVar) {
        this.f105574d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        tr5.g0 f17 = tr5.l.f(this.f105574d.f105577f);
        if (((fs5.c) f17.f503026e).f347891m.f105562i == 2) {
            gs5.f.a("HDNSLookupAsyncRetry", f17);
        } else {
            gs5.f.a("HDNSLookupAsync", f17);
        }
    }
}
