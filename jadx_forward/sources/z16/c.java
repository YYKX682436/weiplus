package z16;

/* loaded from: classes16.dex */
public final class c extends z16.a implements z16.f {

    /* renamed from: b, reason: collision with root package name */
    public final o06.b f550949b;

    /* renamed from: c, reason: collision with root package name */
    public final n16.g f550950c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o06.b declarationDescriptor, f26.o0 receiverType, n16.g gVar, z16.g gVar2) {
        super(receiverType, gVar2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(declarationDescriptor, "declarationDescriptor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiverType, "receiverType");
        this.f550949b = declarationDescriptor;
        this.f550950c = gVar;
    }

    @Override // z16.f
    public n16.g a() {
        return this.f550950c;
    }

    /* renamed from: toString */
    public java.lang.String m178314x9616526c() {
        return "Cxt { " + this.f550949b + " }";
    }
}
