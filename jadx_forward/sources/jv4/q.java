package jv4;

/* loaded from: classes12.dex */
public abstract class q implements jv4.j, jv4.n {

    /* renamed from: a, reason: collision with root package name */
    public final jv4.m f383797a;

    public q(jv4.m type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        this.f383797a = type;
    }

    @Override // jv4.j
    /* renamed from: getItems */
    public java.util.List mo141453x749b8e0a() {
        return kz5.b0.c(this);
    }

    @Override // jv4.n
    /* renamed from: getType */
    public jv4.m mo141457xfb85f7b0() {
        return this.f383797a;
    }
}
