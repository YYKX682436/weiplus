package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes12.dex */
public final class f implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.i f225105a;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.i iVar) {
        this.f225105a = iVar;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9
    public void a(boolean z17, int i17) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9
    public void b(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb) {
        java.lang.String str;
        if (interfaceC4987x84e327cb != null) {
            java.lang.String mo42933xb5885648 = interfaceC4987x84e327cb.mo42933xb5885648();
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6 o6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6.class);
            if (o6Var != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo42933xb5885648);
                interfaceC4987x84e327cb = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4) o6Var).Zi(mo42933xb5885648, null);
            }
            cl0.g gVar = new cl0.g();
            gVar.h("md5", mo42933xb5885648);
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.i iVar = this.f225105a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.i.a(iVar, "image", gVar);
            r45.ri0 ri0Var = new r45.ri0();
            ri0Var.f466419d = interfaceC4987x84e327cb.mo42933xb5885648();
            ri0Var.f466420e = interfaceC4987x84e327cb.l0();
            ri0Var.f466421f = interfaceC4987x84e327cb.l();
            ri0Var.f466422g = interfaceC4987x84e327cb.X0();
            ri0Var.f466423h = interfaceC4987x84e327cb.J1();
            ri0Var.f466424i = interfaceC4987x84e327cb.mo42927x1061ea06();
            ri0Var.f466425m = interfaceC4987x84e327cb.mo42930x4f4a97c4();
            ri0Var.f466426n = interfaceC4987x84e327cb.Z();
            ri0Var.f466427o = interfaceC4987x84e327cb.g1();
            ri0Var.f466428p = interfaceC4987x84e327cb.S0();
            ri0Var.f466429q = interfaceC4987x84e327cb.q0();
            ri0Var.f466430r = interfaceC4987x84e327cb.k0();
            ri0Var.f466431s = interfaceC4987x84e327cb.H1();
            try {
                str = android.util.Base64.encodeToString(ri0Var.mo14344x5f01b1f6(), 2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "encodeToString(...)");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteAppEmoticonContext", e17, "failed to encode emojiInfo.", new java.lang.Object[0]);
                str = "";
            }
            gVar.h("emojiInfo", str);
            if (interfaceC4987x84e327cb.E0()) {
                gVar.h(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, interfaceC4987x84e327cb.T());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.i.a(iVar, "emoticon", gVar);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9
    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.i iVar = this.f225105a;
        iVar.getClass();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).dk(iVar.f225140b, "__LiteAppEmoticonContextTag", null);
        iVar.d();
    }
}
