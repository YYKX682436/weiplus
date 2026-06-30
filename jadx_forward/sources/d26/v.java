package d26;

/* loaded from: classes16.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d26.x f307584d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(d26.x xVar) {
        super(0);
        this.f307584d = xVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        d26.x xVar = this.f307584d;
        xVar.getClass();
        o06.t0 t0Var = o06.t0.f423519f;
        kz5.p0 p0Var = kz5.p0.f395529d;
        if (xVar.f307590o != t0Var) {
            return p0Var;
        }
        java.util.List<java.lang.Integer> list = xVar.f307586h.A;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
        if (!(!list.isEmpty())) {
            if (xVar.f() != t0Var) {
                return p0Var;
            }
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            o06.m e17 = xVar.e();
            if (e17 instanceof o06.d1) {
                r16.b.a(xVar, linkedHashSet, ((o06.d1) e17).V(), false);
            }
            y16.s z17 = xVar.z();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(z17, "getUnsubstitutedInnerClassesScope(...)");
            r16.b.a(xVar, linkedHashSet, z17, true);
            return kz5.n0.F0(linkedHashSet, new r16.a());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Integer num : list) {
            b26.t tVar = xVar.f307593r;
            b26.q qVar = tVar.f99048a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
            o06.g b17 = qVar.b(b26.t0.a(tVar.f99049b, num.intValue()));
            if (b17 != null) {
                arrayList.add(b17);
            }
        }
        return arrayList;
    }
}
