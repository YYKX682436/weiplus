package tb5;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public java.util.Map f498582a;

    public f(java.util.Map data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f498582a = data;
    }

    /* renamed from: equals */
    public boolean m166120xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tb5.f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f498582a, ((tb5.f) obj).f498582a);
    }

    /* renamed from: hashCode */
    public int m166121x8cdac1b() {
        return this.f498582a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m166122x9616526c() {
        return "MethodCostInfo(data=" + this.f498582a + ')';
    }
}
