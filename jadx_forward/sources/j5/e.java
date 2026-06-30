package j5;

/* loaded from: classes13.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f379265a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Long f379266b;

    public e(java.lang.String str, long j17) {
        this.f379265a = str;
        this.f379266b = java.lang.Long.valueOf(j17);
    }

    /* renamed from: equals */
    public boolean m140343xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5.e)) {
            return false;
        }
        j5.e eVar = (j5.e) obj;
        if (!this.f379265a.equals(eVar.f379265a)) {
            return false;
        }
        java.lang.Long l17 = eVar.f379266b;
        java.lang.Long l18 = this.f379266b;
        return l18 != null ? l18.equals(l17) : l17 == null;
    }

    /* renamed from: hashCode */
    public int m140344x8cdac1b() {
        int hashCode = this.f379265a.hashCode() * 31;
        java.lang.Long l17 = this.f379266b;
        return hashCode + (l17 != null ? l17.hashCode() : 0);
    }
}
