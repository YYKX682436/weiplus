package i06;

/* loaded from: classes15.dex */
public final class d1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.f1 f368153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i06.k1 f368154e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(i06.f1 f1Var, i06.k1 k1Var) {
        super(0);
        this.f368153d = f1Var;
        this.f368154e = k1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        i06.f1 f1Var = this.f368153d;
        java.util.Collection<f26.o0> a17 = f1Var.a().g().a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getSupertypes(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(a17.size());
        for (f26.o0 o0Var : a17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(o0Var);
            arrayList.add(new i06.w3(o0Var, new i06.b1(o0Var, f1Var, this.f368154e)));
        }
        if (!l06.o.I(f1Var.a())) {
            boolean z17 = true;
            if (!arrayList.isEmpty()) {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    o06.h j17 = r16.i.c(((i06.w3) it.next()).f368313d).j();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j17, "getKind(...)");
                    if (!(j17 == o06.h.f423494e || j17 == o06.h.f423497h)) {
                        z17 = false;
                        break;
                    }
                }
            }
            if (z17) {
                f26.z0 f17 = v16.f.e(f1Var.a()).f();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "getAnyType(...)");
                arrayList.add(new i06.w3(f17, i06.c1.f368145d));
            }
        }
        return o26.a.b(arrayList);
    }
}
