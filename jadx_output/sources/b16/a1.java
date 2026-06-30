package b16;

/* loaded from: classes16.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b16.f1 f17132d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(b16.f1 f1Var) {
        super(1);
        this.f17132d = f1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n16.g name = (n16.g) obj;
        kotlin.jvm.internal.o.g(name, "name");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        b16.f1 f1Var = this.f17132d;
        o26.a.a(arrayList, ((e26.q) f1Var.f17168g).invoke(name));
        f1Var.n(name, arrayList);
        o06.m q17 = f1Var.q();
        int i17 = r16.i.f368658a;
        if (r16.i.o(q17, o06.h.f341964h)) {
            return kz5.n0.S0(arrayList);
        }
        a16.l lVar = f1Var.f17163b;
        return kz5.n0.S0(lVar.f649a.f632r.c(lVar, arrayList));
    }
}
