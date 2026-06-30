package km5;

/* loaded from: classes7.dex */
public class k implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.util.Pair f390859a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f390860b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.RuntimeException f390861c;

    public k(km5.q qVar, android.util.Pair pair, java.lang.Object obj, java.lang.RuntimeException runtimeException) {
        this.f390859a = pair;
        this.f390860b = obj;
        this.f390861c = runtimeException;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        try {
            ((km5.f) this.f390859a.first).a(this.f390860b);
            return null;
        } catch (java.lang.ClassCastException e17) {
            java.lang.RuntimeException runtimeException = this.f390861c;
            if (runtimeException.getCause() != null) {
                throw runtimeException;
            }
            runtimeException.initCause(e17);
            throw runtimeException;
        }
    }
}
