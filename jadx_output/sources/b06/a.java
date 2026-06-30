package b06;

/* loaded from: classes7.dex */
public final class a implements b06.d {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f16988a;

    @Override // b06.d
    public void a(java.lang.Object obj, f06.v property, java.lang.Object value) {
        kotlin.jvm.internal.o.g(property, "property");
        kotlin.jvm.internal.o.g(value, "value");
        this.f16988a = value;
    }

    @Override // b06.c
    public java.lang.Object b(java.lang.Object obj, f06.v property) {
        kotlin.jvm.internal.o.g(property, "property");
        java.lang.Object obj2 = this.f16988a;
        if (obj2 != null) {
            return obj2;
        }
        throw new java.lang.IllegalStateException("Property " + property.getName() + " should be initialized before get.");
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("NotNullProperty(");
        if (this.f16988a != null) {
            str = "value=" + this.f16988a;
        } else {
            str = "value not initialized yet";
        }
        sb6.append(str);
        sb6.append(')');
        return sb6.toString();
    }
}
