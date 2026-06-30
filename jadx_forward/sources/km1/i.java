package km1;

/* loaded from: classes7.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km1.s f390536d;

    public i(km1.s sVar) {
        this.f390536d = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 c4216x654bedf2 = this.f390536d.f390575v;
            if (c4216x654bedf2 != null) {
                c4216x654bedf2.b();
            }
        } catch (java.lang.Exception unused) {
        }
        this.f390536d.f390575v = null;
        this.f390536d.f390574u = null;
    }
}
