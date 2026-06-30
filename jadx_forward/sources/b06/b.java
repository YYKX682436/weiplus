package b06;

/* loaded from: classes7.dex */
public abstract class b implements b06.d {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f98522a;

    public b(java.lang.Object obj) {
        this.f98522a = obj;
    }

    @Override // b06.d
    public void a(java.lang.Object obj, f06.v property, java.lang.Object obj2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(property, "property");
        java.lang.Object obj3 = this.f98522a;
        if (d(property, obj3, obj2)) {
            this.f98522a = obj2;
            c(property, obj3, obj2);
        }
    }

    @Override // b06.c
    public java.lang.Object b(java.lang.Object obj, f06.v property) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(property, "property");
        return this.f98522a;
    }

    public void c(f06.v property, java.lang.Object obj, java.lang.Object obj2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(property, "property");
    }

    public boolean d(f06.v property, java.lang.Object obj, java.lang.Object obj2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(property, "property");
        return true;
    }

    /* renamed from: toString */
    public java.lang.String m9553x9616526c() {
        return "ObservableProperty(value=" + this.f98522a + ')';
    }
}
