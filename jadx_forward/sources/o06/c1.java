package o06;

/* loaded from: classes15.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final e26.c0 f423467a;

    /* renamed from: b, reason: collision with root package name */
    public final o06.v0 f423468b;

    /* renamed from: c, reason: collision with root package name */
    public final e26.v f423469c;

    /* renamed from: d, reason: collision with root package name */
    public final e26.v f423470d;

    public c1(e26.c0 storageManager, o06.v0 module) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storageManager, "storageManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(module, "module");
        this.f423467a = storageManager;
        this.f423468b = module;
        this.f423469c = ((e26.u) storageManager).c(new o06.b1(this));
        this.f423470d = ((e26.u) storageManager).c(new o06.a1(this));
    }

    public final o06.g a(n16.b classId, java.util.List typeParametersCount) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classId, "classId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeParametersCount, "typeParametersCount");
        return (o06.g) ((e26.r) this.f423470d).mo146xb9724478(new o06.y0(classId, typeParametersCount));
    }
}
