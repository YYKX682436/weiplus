package b26;

/* loaded from: classes15.dex */
public abstract class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final k16.g f99070a;

    /* renamed from: b, reason: collision with root package name */
    public final k16.k f99071b;

    /* renamed from: c, reason: collision with root package name */
    public final o06.x1 f99072c;

    public x0(k16.g gVar, k16.k kVar, o06.x1 x1Var, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f99070a = gVar;
        this.f99071b = kVar;
        this.f99072c = x1Var;
    }

    public abstract n16.c a();

    /* renamed from: toString */
    public java.lang.String m9693x9616526c() {
        return getClass().getSimpleName() + ": " + a();
    }
}
