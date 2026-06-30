package n0;

/* loaded from: classes14.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.h f415041d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f415042e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(n0.h hVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(1);
        this.f415041d = hVar;
        this.f415042e = h0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        n0.h hVar = this.f415041d;
        java.lang.Object obj2 = hVar.f415054e;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f415042e;
        synchronized (obj2) {
            java.util.List list = hVar.f415056g;
            java.lang.Object obj3 = h0Var.f391656d;
            if (obj3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("awaiter");
                throw null;
            }
            list.remove((n0.f) obj3);
        }
        return jz5.f0.f384359a;
    }
}
