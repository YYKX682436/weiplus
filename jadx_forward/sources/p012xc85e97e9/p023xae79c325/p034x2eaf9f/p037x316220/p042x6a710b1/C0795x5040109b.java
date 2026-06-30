package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1;

/* renamed from: androidx.camera.core.impl.utils.Present */
/* loaded from: classes15.dex */
final class C0795x5040109b<T> extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.AbstractC0794xff24af80<T> {

    /* renamed from: serialVersionUID */
    private static final long f1968x3a3ed56c = 0;

    /* renamed from: mReference */
    private final T f1969x4392895e;

    public C0795x5040109b(T t17) {
        this.f1969x4392895e = t17;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.AbstractC0794xff24af80
    /* renamed from: equals */
    public boolean mo5780xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0795x5040109b) {
            return this.f1969x4392895e.equals(((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0795x5040109b) obj).f1969x4392895e);
        }
        return false;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.AbstractC0794xff24af80
    public T get() {
        return this.f1969x4392895e;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.AbstractC0794xff24af80
    /* renamed from: hashCode */
    public int mo5781x8cdac1b() {
        return this.f1969x4392895e.hashCode() + 1502476572;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.AbstractC0794xff24af80
    /* renamed from: isPresent */
    public boolean mo5782xca78c031() {
        return true;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.AbstractC0794xff24af80
    public T or(T t17) {
        m3.h.d(t17, "use Optional.orNull() instead of Optional.or(null)");
        return this.f1969x4392895e;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.AbstractC0794xff24af80
    /* renamed from: orNull */
    public T mo5783xc3d59e0a() {
        return this.f1969x4392895e;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.AbstractC0794xff24af80
    /* renamed from: toString */
    public java.lang.String mo5784x9616526c() {
        return "Optional.of(" + this.f1969x4392895e + ")";
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.AbstractC0794xff24af80
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.AbstractC0794xff24af80<T> or(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.AbstractC0794xff24af80<? extends T> abstractC0794xff24af80) {
        abstractC0794xff24af80.getClass();
        return this;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.AbstractC0794xff24af80
    public T or(m3.i iVar) {
        iVar.getClass();
        return this.f1969x4392895e;
    }
}
