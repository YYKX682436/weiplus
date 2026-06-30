package xk1;

/* loaded from: classes7.dex */
public abstract class f implements xk1.e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.TreeMap f536540a = new java.util.TreeMap(java.lang.String.CASE_INSENSITIVE_ORDER);

    public java.lang.String a(java.lang.String str) {
        java.lang.String str2 = (java.lang.String) this.f536540a.get(str);
        return str2 == null ? "" : str2;
    }

    public void b(java.lang.String str, java.lang.String str2) {
        this.f536540a.put(str, str2);
    }
}
