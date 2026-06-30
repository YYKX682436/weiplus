package y75;

/* loaded from: classes15.dex */
public final class d extends lr.p {
    public d(int i17) {
        super(i17, null, null, 6, null);
    }

    @Override // lr.p, lr.k0
    public void b(android.view.View view, android.content.Context context, int i17, ir.u0 u0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (u0Var == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick: ");
        sb6.append(i17);
        sb6.append(", ");
        ir.g gVar = (ir.g) u0Var;
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = gVar.f375369b;
        sb6.append(interfaceC4987x84e327cb.mo42933xb5885648());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SimilarEmoji", sb6.toString());
        if (gVar.f375370c == 103) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1257L, 5L);
            if (com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(interfaceC4987x84e327cb.mo42933xb5885648()) == null) {
                com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().mo880xb970c2b9((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) interfaceC4987x84e327cb);
            }
        }
    }
}
