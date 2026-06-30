package b16;

/* loaded from: classes16.dex */
public final class a1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b16.f1 f98665d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(b16.f1 f1Var) {
        super(1);
        this.f98665d = f1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        n16.g name = (n16.g) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        b16.f1 f1Var = this.f98665d;
        o26.a.a(arrayList, ((e26.q) f1Var.f98701g).mo146xb9724478(name));
        f1Var.n(name, arrayList);
        o06.m q17 = f1Var.q();
        int i17 = r16.i.f450191a;
        if (r16.i.o(q17, o06.h.f423497h)) {
            return kz5.n0.S0(arrayList);
        }
        a16.l lVar = f1Var.f98696b;
        return kz5.n0.S0(lVar.f82182a.f82165r.c(lVar, arrayList));
    }
}
