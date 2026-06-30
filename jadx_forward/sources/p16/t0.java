package p16;

/* loaded from: classes15.dex */
public class t0 implements java.lang.Comparable, java.util.Map.Entry {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Comparable f432883d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f432884e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p16.w0 f432885f;

    public t0(p16.w0 w0Var, java.lang.Comparable comparable, java.lang.Object obj) {
        this.f432885f = w0Var;
        this.f432883d = comparable;
        this.f432884e = obj;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return this.f432883d.compareTo(((p16.t0) obj).f432883d);
    }

    @Override // java.util.Map.Entry
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object key = entry.getKey();
        java.lang.Comparable comparable = this.f432883d;
        if (comparable == null ? key == null : comparable.equals(key)) {
            java.lang.Object obj2 = this.f432884e;
            java.lang.Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getKey() {
        return this.f432883d;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getValue() {
        return this.f432884e;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        java.lang.Comparable comparable = this.f432883d;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        java.lang.Object obj = this.f432884e;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object obj) {
        this.f432885f.b();
        java.lang.Object obj2 = this.f432884e;
        this.f432884e = obj;
        return obj2;
    }

    /* renamed from: toString */
    public java.lang.String m157725x9616526c() {
        java.lang.String valueOf = java.lang.String.valueOf(this.f432883d);
        java.lang.String valueOf2 = java.lang.String.valueOf(this.f432884e);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb6.append(valueOf);
        sb6.append("=");
        sb6.append(valueOf2);
        return sb6.toString();
    }
}
