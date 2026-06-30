package bn2;

/* loaded from: classes14.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bn2.x f22900d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(bn2.x xVar) {
        super(1);
        this.f22900d = xVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        hn0.f fVar;
        java.lang.Object obj2;
        java.lang.String str;
        lo0.k0 item = (lo0.k0) obj;
        kotlin.jvm.internal.o.g(item, "item");
        lo0.b bVar = item.f320041g;
        if (bVar != null) {
            bVar.d();
            dk2.ug.f234218a.e(bVar);
        }
        lo0.p0 b17 = ko0.l0.f309878a.b();
        b17.getClass();
        b17.f320063d = item;
        tn0.w0 w0Var = dk2.ef.f233378d;
        if (w0Var != null && (fVar = w0Var.f420773t) != null) {
            lo0.g0 g0Var = this.f22900d.f22902b.f447231e;
            lo0.b0 b0Var = g0Var.f319994c;
            kotlin.jvm.internal.o.g(b0Var, "<set-?>");
            g0Var.f319996e = b0Var;
            hn0.p pVar = (hn0.p) fVar;
            go0.f0 f0Var = pVar.f282400b;
            f0Var.getClass();
            f0Var.l(new go0.b0(f0Var, g0Var.f319994c));
            java.util.List<lo0.h0> list = item.f320040f;
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((lo0.h0) obj2).f320002f) {
                    break;
                }
            }
            lo0.h0 h0Var = (lo0.h0) obj2;
            if (h0Var == null || (str = h0Var.f320000d) == null) {
                str = "";
            }
            pVar.b();
            pVar.f282400b.l(new hn0.n(pVar, item.f320039e, str));
            for (lo0.h0 h0Var2 : list) {
                pVar.f(h0Var2.f320001e, h0Var2.f320006j);
            }
            if (h0Var != null) {
                hn0.f.a(fVar, h0Var.f320006j, false, false, 4, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
