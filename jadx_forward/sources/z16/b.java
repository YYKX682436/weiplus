package z16;

/* loaded from: classes16.dex */
public final class b extends z16.a implements z16.f {

    /* renamed from: b, reason: collision with root package name */
    public final o06.g f550947b;

    /* renamed from: c, reason: collision with root package name */
    public final n16.g f550948c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(o06.g classDescriptor, f26.o0 receiverType, n16.g gVar, z16.g gVar2) {
        super(receiverType, gVar2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classDescriptor, "classDescriptor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiverType, "receiverType");
        this.f550947b = classDescriptor;
        this.f550948c = gVar;
    }

    @Override // z16.f
    public n16.g a() {
        return this.f550948c;
    }

    /* renamed from: toString */
    public java.lang.String m178313x9616526c() {
        return mo150381xfb85f7b0() + ": Ctx { " + this.f550947b + " }";
    }
}
