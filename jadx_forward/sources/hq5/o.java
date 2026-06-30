package hq5;

/* loaded from: classes5.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq5.r f364786d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(hq5.r rVar) {
        super(1);
        this.f364786d = rVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        eq5.h state = (eq5.h) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        eq5.i iVar = (eq5.i) state.a(eq5.i.class);
        jq5.l lVar = jq5.n.f382815a;
        hq5.r rVar = this.f364786d;
        if (iVar != null) {
            com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2814x373aa5.C22930x873617e1 U6 = rVar.U6();
            if (U6 != null) {
                U6.setVisibility(8);
            }
            rVar.f364795g = false;
            int i17 = iVar.f337455b;
            if (i17 == 14) {
                com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2814x373aa5.C22930x873617e1 U62 = rVar.U6();
                if (U62 != null) {
                    U62.setVisibility(0);
                }
                if (rVar.f364794f) {
                    rVar.V6();
                } else {
                    rVar.f364794f = true;
                    com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2814x373aa5.C22930x873617e1 U63 = rVar.U6();
                    if (U63 != null) {
                        iq5.a b17 = lVar.b(rVar.m80379x76847179());
                        java.lang.String string = rVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nr7);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                        b17.f375335d = string;
                        U63.m48330xfcfee142(b17);
                    }
                }
            } else if (i17 == 17) {
                rVar.f364795g = true;
            }
        }
        if (((eq5.b) state.a(eq5.b.class)) != null) {
            if (lVar.c()) {
                rVar.T6();
            } else {
                v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) ((jz5.n) rVar.f364793e).mo141623x754a37bb(), null, new hq5.n(rVar, null), 1, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
