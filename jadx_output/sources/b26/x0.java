package b26;

/* loaded from: classes15.dex */
public abstract class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final k16.g f17537a;

    /* renamed from: b, reason: collision with root package name */
    public final k16.k f17538b;

    /* renamed from: c, reason: collision with root package name */
    public final o06.x1 f17539c;

    public x0(k16.g gVar, k16.k kVar, o06.x1 x1Var, kotlin.jvm.internal.i iVar) {
        this.f17537a = gVar;
        this.f17538b = kVar;
        this.f17539c = x1Var;
    }

    public abstract n16.c a();

    public java.lang.String toString() {
        return getClass().getSimpleName() + ": " + a();
    }
}
