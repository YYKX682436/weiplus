package f26;

/* loaded from: classes16.dex */
public abstract class l extends f26.r {

    /* renamed from: b, reason: collision with root package name */
    public final e26.x f340721b;

    public l(e26.c0 storageManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storageManager, "storageManager");
        e26.u uVar = (e26.u) storageManager;
        this.f340721b = new e26.f(uVar, uVar, new f26.i(this), f26.j.f340710d, new f26.k(this));
    }

    public abstract java.util.Collection c();

    public abstract f26.o0 d();

    public abstract o06.c2 e();

    @Override // f26.c2
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public java.util.List a() {
        return ((f26.h) ((e26.p) this.f340721b).mo152xb9724478()).f340701b;
    }

    public java.util.List g(java.util.List supertypes) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(supertypes, "supertypes");
        return supertypes;
    }
}
