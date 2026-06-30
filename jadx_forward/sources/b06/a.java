package b06;

/* loaded from: classes7.dex */
public final class a implements b06.d {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f98521a;

    @Override // b06.d
    public void a(java.lang.Object obj, f06.v property, java.lang.Object value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(property, "property");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        this.f98521a = value;
    }

    @Override // b06.c
    public java.lang.Object b(java.lang.Object obj, f06.v property) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(property, "property");
        java.lang.Object obj2 = this.f98521a;
        if (obj2 != null) {
            return obj2;
        }
        throw new java.lang.IllegalStateException("Property " + property.mo9624xfb82e301() + " should be initialized before get.");
    }

    /* renamed from: toString */
    public java.lang.String m9552x9616526c() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("NotNullProperty(");
        if (this.f98521a != null) {
            str = "value=" + this.f98521a;
        } else {
            str = "value not initialized yet";
        }
        sb6.append(str);
        sb6.append(')');
        return sb6.toString();
    }
}
