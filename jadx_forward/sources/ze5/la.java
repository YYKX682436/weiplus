package ze5;

/* loaded from: classes9.dex */
public class la extends rd5.d {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Class f553605m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la(we5.a params, java.lang.Class cls) {
        super(params);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        this.f553605m = cls;
    }

    @Override // rd5.d, xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // rd5.a
    public boolean i() {
        return true;
    }

    @Override // rd5.d
    public we5.b o() {
        java.lang.Class cls = this.f553605m;
        if (cls != null) {
            return (we5.b) cls.newInstance();
        }
        return null;
    }
}
