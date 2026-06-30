package e95;

/* loaded from: classes12.dex */
public final class s extends e95.b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e95.t f331985h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(e95.t tVar) {
        super(true);
        this.f331985h = tVar;
    }

    @Override // e95.b
    public e95.a c() {
        e95.g gVar = this.f331985h.A;
        if (gVar != null) {
            return ((e95.n) gVar).a();
        }
        return null;
    }

    @Override // e95.b
    public java.util.ArrayList i(java.util.ArrayList data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        e95.g gVar = this.f331985h.A;
        if (gVar != null) {
            return ((e95.n) gVar).b(data);
        }
        return null;
    }
}
