package b06;

/* loaded from: classes7.dex */
public abstract class b implements b06.d {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f16989a;

    public b(java.lang.Object obj) {
        this.f16989a = obj;
    }

    @Override // b06.d
    public void a(java.lang.Object obj, f06.v property, java.lang.Object obj2) {
        kotlin.jvm.internal.o.g(property, "property");
        java.lang.Object obj3 = this.f16989a;
        if (d(property, obj3, obj2)) {
            this.f16989a = obj2;
            c(property, obj3, obj2);
        }
    }

    @Override // b06.c
    public java.lang.Object b(java.lang.Object obj, f06.v property) {
        kotlin.jvm.internal.o.g(property, "property");
        return this.f16989a;
    }

    public void c(f06.v property, java.lang.Object obj, java.lang.Object obj2) {
        kotlin.jvm.internal.o.g(property, "property");
    }

    public boolean d(f06.v property, java.lang.Object obj, java.lang.Object obj2) {
        kotlin.jvm.internal.o.g(property, "property");
        return true;
    }

    public java.lang.String toString() {
        return "ObservableProperty(value=" + this.f16989a + ')';
    }
}
