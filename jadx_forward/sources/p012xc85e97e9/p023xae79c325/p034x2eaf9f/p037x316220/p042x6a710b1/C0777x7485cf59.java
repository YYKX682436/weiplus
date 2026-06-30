package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.impl.utils.Absent */
/* loaded from: classes15.dex */
public final class C0777x7485cf59<T> extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.AbstractC0794xff24af80<T> {

    /* renamed from: sInstance */
    static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0777x7485cf59<java.lang.Object> f1849xbfaed628 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0777x7485cf59<>();

    /* renamed from: serialVersionUID */
    private static final long f1850x3a3ed56c = 0;

    private C0777x7485cf59() {
    }

    /* renamed from: readResolve */
    private java.lang.Object m5778x1555eb76() {
        return f1849xbfaed628;
    }

    /* renamed from: withType */
    public static <T> p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.AbstractC0794xff24af80<T> m5779xc7ede120() {
        return f1849xbfaed628;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.AbstractC0794xff24af80
    /* renamed from: equals */
    public boolean mo5780xb2c87fbf(java.lang.Object obj) {
        return obj == this;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.AbstractC0794xff24af80
    public T get() {
        throw new java.lang.IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.AbstractC0794xff24af80
    /* renamed from: hashCode */
    public int mo5781x8cdac1b() {
        return 2040732332;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.AbstractC0794xff24af80
    /* renamed from: isPresent */
    public boolean mo5782xca78c031() {
        return false;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.AbstractC0794xff24af80
    public T or(T t17) {
        m3.h.d(t17, "use Optional.orNull() instead of Optional.or(null)");
        return t17;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.AbstractC0794xff24af80
    /* renamed from: orNull */
    public T mo5783xc3d59e0a() {
        return null;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.AbstractC0794xff24af80
    /* renamed from: toString */
    public java.lang.String mo5784x9616526c() {
        return "Optional.absent()";
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.AbstractC0794xff24af80
    public T or(m3.i iVar) {
        T t17 = (T) iVar.get();
        m3.h.d(t17, "use Optional.orNull() instead of a Supplier that returns null");
        return t17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.AbstractC0794xff24af80
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.AbstractC0794xff24af80<T> or(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.AbstractC0794xff24af80<? extends T> abstractC0794xff24af80) {
        abstractC0794xff24af80.getClass();
        return abstractC0794xff24af80;
    }
}
