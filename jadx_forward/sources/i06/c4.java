package i06;

/* loaded from: classes12.dex */
public class c4 extends i06.e4 implements yz5.a {

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f368148e;

    /* renamed from: f, reason: collision with root package name */
    public volatile java.lang.ref.SoftReference f368149f;

    public c4(java.lang.Object obj, yz5.a aVar) {
        if (aVar == null) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
        }
        this.f368149f = null;
        this.f368148e = aVar;
        if (obj != null) {
            this.f368149f = new java.lang.ref.SoftReference(obj);
        }
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object obj;
        java.lang.ref.SoftReference softReference = this.f368149f;
        java.lang.Object obj2 = i06.e4.f368162d;
        if (softReference != null && (obj = softReference.get()) != null) {
            if (obj == obj2) {
                return null;
            }
            return obj;
        }
        java.lang.Object mo152xb9724478 = this.f368148e.mo152xb9724478();
        if (mo152xb9724478 != null) {
            obj2 = mo152xb9724478;
        }
        this.f368149f = new java.lang.ref.SoftReference(obj2);
        return mo152xb9724478;
    }
}
