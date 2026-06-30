package r0;

/* loaded from: classes.dex */
public class b implements java.util.Map.Entry, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f449491d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f449492e;

    public b(java.lang.Object obj, java.lang.Object obj2) {
        this.f449491d = obj;
        this.f449492e = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(java.lang.Object obj) {
        java.util.Map.Entry entry = obj instanceof java.util.Map.Entry ? (java.util.Map.Entry) obj : null;
        return entry != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(entry.getKey(), this.f449491d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getKey() {
        return this.f449491d;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getValue() {
        return this.f449492e;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        java.lang.Object obj = this.f449491d;
        int hashCode = obj != null ? obj.hashCode() : 0;
        java.lang.Object value = getValue();
        return (value != null ? value.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: toString */
    public java.lang.String m161169x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f449491d);
        sb6.append('=');
        sb6.append(getValue());
        return sb6.toString();
    }
}
