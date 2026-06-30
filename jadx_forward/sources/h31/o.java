package h31;

/* loaded from: classes9.dex */
public final class o implements m31.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h31.r f359956a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 f359957b;

    public o(h31.r rVar, com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5) {
        this.f359956a = rVar;
        this.f359957b = c11158xe7d16ed5;
    }

    @Override // m31.c1
    public void a(int i17, java.util.List resultData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultData, "resultData");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandSubscribeMsgRequestController", "showSubscribeRequestDialog onEvent: %s, result size: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(resultData.size()));
        int i18 = 3;
        if (i17 == 1 || i17 == 2 || i17 == 3) {
            com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5 = this.f359957b;
            java.util.ArrayList arrayList = c11158xe7d16ed5.f153318h;
            h31.r rVar = this.f359956a;
            rVar.getClass();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int i19 = 0;
            for (java.lang.Object obj : resultData) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d3 = (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) arrayList.get(i19);
                if (((m31.q0) obj).f404733a) {
                    c11159x8f55e6d3.f153338h = 1;
                } else {
                    c11159x8f55e6d3.f153338h = 0;
                }
                arrayList2.add(c11159x8f55e6d3);
                i19 = i27;
            }
            arrayList.clear();
            arrayList.addAll(arrayList2);
            rVar.f359968i = c11158xe7d16ed5.f153318h;
            rVar.f359961b = h31.s.b(rVar.f359961b);
            rVar.f359975p = c11158xe7d16ed5.f153325r;
            com.p314xaae8f345.mm.p965xc41bc71e.a aVar = com.p314xaae8f345.mm.p965xc41bc71e.C11157x9b46987e.f153306g;
            java.util.List V0 = kz5.n0.V0(resultData);
            m31.p1 p1Var = rVar.f359971l;
            rVar.f359976q = aVar.a(i17, V0, p1Var != null ? p1Var.A.isChecked() : false);
            h31.s sVar = h31.s.f359979a;
            rVar.c();
            boolean z17 = c11158xe7d16ed5.f153319i;
            j31.b bVar = rVar.f359978s;
            if (z17) {
                bVar.f378901f = 2;
            } else {
                m31.p1 p1Var2 = rVar.f359971l;
                bVar.f378901f = (p1Var2 == null || !p1Var2.A.isChecked()) ? 0 : 1;
            }
            if (i17 == 1) {
                i18 = 2;
            } else if (i17 != 2) {
                i18 = i17 != 3 ? 0 : 4;
            }
            j31.e.f378925a.c(i18, bVar);
        }
    }

    @Override // m31.c1
    public void b(m31.b1 b1Var, boolean z17, m31.q0 item, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(b1Var, "switch");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
    }
}
