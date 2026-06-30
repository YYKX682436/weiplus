package au0;

/* loaded from: classes5.dex */
public abstract class b implements au0.c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f14053a;

    public b(java.lang.Object material) {
        kotlin.jvm.internal.o.g(material, "material");
        this.f14053a = material;
    }

    @Override // au0.c
    public boolean a() {
        return isEnable();
    }
}
