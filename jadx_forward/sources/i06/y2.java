package i06;

/* loaded from: classes16.dex */
public class y2 extends i06.q3 implements f06.s {

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f368333t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(i06.u1 container, o06.o1 descriptor) {
        super(container, descriptor);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(descriptor, "descriptor");
        jz5.i iVar = jz5.i.f384363e;
        this.f368333t = jz5.h.a(iVar, new i06.w2(this));
        jz5.h.a(iVar, new i06.x2(this));
    }

    @Override // f06.v
    public f06.q c() {
        return (i06.v2) this.f368333t.mo141623x754a37bb();
    }

    @Override // f06.s
    public java.lang.Object get() {
        return ((i06.v2) this.f368333t.mo141623x754a37bb()).mo128633x2e7a5e(new java.lang.Object[0]);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        return get();
    }

    @Override // i06.q3
    public i06.k3 r() {
        return (i06.v2) this.f368333t.mo141623x754a37bb();
    }

    @Override // f06.v
    public f06.r c() {
        return (i06.v2) this.f368333t.mo141623x754a37bb();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(i06.u1 container, java.lang.String name, java.lang.String signature, java.lang.Object obj) {
        super(container, name, signature, obj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(signature, "signature");
        jz5.i iVar = jz5.i.f384363e;
        this.f368333t = jz5.h.a(iVar, new i06.w2(this));
        jz5.h.a(iVar, new i06.x2(this));
    }
}
