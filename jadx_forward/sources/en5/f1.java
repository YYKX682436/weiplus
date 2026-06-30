package en5;

/* loaded from: classes14.dex */
public final class f1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f336941d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f336942e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(java.util.ArrayList arrayList, yz5.l lVar) {
        super(4);
        this.f336941d = arrayList;
        this.f336942e = lVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        e0.g items = (e0.g) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        n0.o oVar = (n0.o) obj3;
        int intValue2 = ((java.lang.Number) obj4).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "$this$items");
        if ((intValue2 & 112) == 0) {
            intValue2 |= ((n0.y0) oVar).c(intValue) ? 32 : 16;
        }
        if ((intValue2 & 721) == 144) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        java.lang.Object obj5 = n0.e1.f415025a;
        java.util.ArrayList arrayList = this.f336941d;
        en5.i1.d(((aq.v0) arrayList.get(intValue)).f94519a, new en5.e1(this.f336942e, arrayList, intValue), oVar, 0);
        if (intValue < arrayList.size() - 1) {
            int i17 = z0.t.f550455q1;
            z0.p pVar = z0.p.f550454d;
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            z0.t c17 = a0.b.c(pVar, rz0.a.b(com.p314xaae8f345.mm.R.C30859x5a72f63.f560805up, context), null, 2, null);
            n0.y0 y0Var2 = (n0.y0) oVar;
            y0Var2.U(733328855);
            int i18 = z0.d.f550436a;
            s1.t0 c18 = d0.y.c(z0.a.f550422a, false, y0Var2, 0);
            y0Var2.U(-1323940314);
            p2.f fVar = (p2.f) y0Var2.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92179e);
            p2.s sVar = (p2.s) y0Var2.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92185k);
            p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4 k4Var = (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4) y0Var2.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92189o);
            u1.g.f505127i1.getClass();
            yz5.a aVar = u1.f.f505120b;
            yz5.q a17 = s1.g0.a(c17);
            if (!(y0Var2.f415294b instanceof n0.e)) {
                n0.l.a();
                throw null;
            }
            y0Var2.X();
            if (y0Var2.L) {
                y0Var2.j(aVar);
            } else {
                y0Var2.i0();
            }
            y0Var2.f415317y = false;
            n0.i5.a(y0Var2, c18, u1.f.f505123e);
            n0.i5.a(y0Var2, fVar, u1.f.f505122d);
            n0.i5.a(y0Var2, sVar, u1.f.f505124f);
            n0.i5.a(y0Var2, k4Var, u1.f.f505125g);
            y0Var2.n();
            ((u0.i) a17).mo147xb9724478(new n0.i4(y0Var2), y0Var2, 0);
            y0Var2.U(2058660585);
            y0Var2.U(-2137368960);
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            l0.a0.a(null, rz0.a.b(com.p314xaae8f345.mm.R.C30859x5a72f63.f77667x8113c229, context2), (float) 0.5d, ((float) 2.13d) * 8, y0Var2, 3456, 1);
            y0Var2.o(false);
            y0Var2.o(false);
            y0Var2.o(true);
            y0Var2.o(false);
            y0Var2.o(false);
        }
        return jz5.f0.f384359a;
    }
}
