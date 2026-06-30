package ng1;

/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f418458a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f418459b;

    /* renamed from: c, reason: collision with root package name */
    public final k91.d5 f418460c;

    public g(java.lang.String str, java.lang.String str2, k91.d5 cgiSyncExtraParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiSyncExtraParams, "cgiSyncExtraParams");
        this.f418458a = str;
        this.f418459b = str2;
        this.f418460c = cgiSyncExtraParams;
    }

    /* renamed from: equals */
    public boolean m149550xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng1.g)) {
            return false;
        }
        ng1.g gVar = (ng1.g) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f418458a, gVar.f418458a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f418459b, gVar.f418459b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f418460c, gVar.f418460c);
    }

    /* renamed from: hashCode */
    public int m149551x8cdac1b() {
        java.lang.String str = this.f418458a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f418459b;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f418460c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m149552x9616526c() {
        return "WAContactFetcherParams(username=" + this.f418458a + ", appId=" + this.f418459b + ", cgiSyncExtraParams=" + this.f418460c + ')';
    }
}
