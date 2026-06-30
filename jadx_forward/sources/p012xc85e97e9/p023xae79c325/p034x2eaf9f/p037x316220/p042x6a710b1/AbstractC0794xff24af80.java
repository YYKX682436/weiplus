package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1;

/* renamed from: androidx.camera.core.impl.utils.Optional */
/* loaded from: classes15.dex */
public abstract class AbstractC0794xff24af80<T> implements java.io.Serializable {

    /* renamed from: serialVersionUID */
    private static final long f1967x3a3ed56c = 0;

    /* renamed from: absent */
    public static <T> p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.AbstractC0794xff24af80<T> m5930xab20e339() {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0777x7485cf59.m5779xc7ede120();
    }

    /* renamed from: fromNullable */
    public static <T> p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.AbstractC0794xff24af80<T> m5931xfdda712b(T t17) {
        return t17 == null ? m5930xab20e339() : new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0795x5040109b(t17);
    }

    public static <T> p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.AbstractC0794xff24af80<T> of(T t17) {
        t17.getClass();
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0795x5040109b(t17);
    }

    /* renamed from: equals */
    public abstract boolean mo5780xb2c87fbf(java.lang.Object obj);

    public abstract T get();

    /* renamed from: hashCode */
    public abstract int mo5781x8cdac1b();

    /* renamed from: isPresent */
    public abstract boolean mo5782xca78c031();

    public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.AbstractC0794xff24af80<T> or(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.AbstractC0794xff24af80<? extends T> abstractC0794xff24af80);

    public abstract T or(T t17);

    public abstract T or(m3.i iVar);

    /* renamed from: orNull */
    public abstract T mo5783xc3d59e0a();

    /* renamed from: toString */
    public abstract java.lang.String mo5784x9616526c();
}
