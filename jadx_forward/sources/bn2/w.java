package bn2;

/* loaded from: classes14.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bn2.x f104433d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(bn2.x xVar) {
        super(1);
        this.f104433d = xVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        hn0.f fVar;
        java.lang.Object obj2;
        java.lang.String str;
        lo0.k0 item = (lo0.k0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        lo0.b bVar = item.f401574g;
        if (bVar != null) {
            bVar.d();
            dk2.ug.f315751a.e(bVar);
        }
        lo0.p0 b17 = ko0.l0.f391411a.b();
        b17.getClass();
        b17.f401596d = item;
        tn0.w0 w0Var = dk2.ef.f314911d;
        if (w0Var != null && (fVar = w0Var.f502306t) != null) {
            lo0.g0 g0Var = this.f104433d.f104435b.f528764e;
            lo0.b0 b0Var = g0Var.f401527c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(b0Var, "<set-?>");
            g0Var.f401529e = b0Var;
            hn0.p pVar = (hn0.p) fVar;
            go0.f0 f0Var = pVar.f363933b;
            f0Var.getClass();
            f0Var.l(new go0.b0(f0Var, g0Var.f401527c));
            java.util.List<lo0.h0> list = item.f401573f;
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((lo0.h0) obj2).f401535f) {
                    break;
                }
            }
            lo0.h0 h0Var = (lo0.h0) obj2;
            if (h0Var == null || (str = h0Var.f401533d) == null) {
                str = "";
            }
            pVar.b();
            pVar.f363933b.l(new hn0.n(pVar, item.f401572e, str));
            for (lo0.h0 h0Var2 : list) {
                pVar.f(h0Var2.f401534e, h0Var2.f401539j);
            }
            if (h0Var != null) {
                hn0.f.a(fVar, h0Var.f401539j, false, false, 4, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
