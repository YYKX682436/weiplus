package l26;

/* loaded from: classes16.dex */
public abstract class o0 implements l26.i {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f396793a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f396794b;

    public o0(java.lang.String str, yz5.l lVar, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f396793a = lVar;
        this.f396794b = "must return " + str;
    }

    @Override // l26.i
    public java.lang.String a(o06.n0 n0Var) {
        return l26.h.a(this, n0Var);
    }

    @Override // l26.i
    public boolean b(o06.n0 functionDescriptor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(functionDescriptor, "functionDescriptor");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(functionDescriptor.mo132801x3df4e080(), this.f396793a.mo146xb9724478(v16.f.e(functionDescriptor)));
    }

    @Override // l26.i
    /* renamed from: getDescription */
    public java.lang.String mo144943x730bcac6() {
        return this.f396794b;
    }
}
