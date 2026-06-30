package ol1;

/* loaded from: classes15.dex */
public final class a implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ol1.t f427655a;

    public a(ol1.t tVar) {
        this.f427655a = tVar;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9
    public void a(boolean z17, int i17) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9
    public void b(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb) {
        if (interfaceC4987x84e327cb == null) {
            return;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.f6 f6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.f6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.f6.class);
        java.lang.String mo42933xb5885648 = interfaceC4987x84e327cb.mo42933xb5885648();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.p1) f6Var).getClass();
        java.lang.String desc = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().v(mo42933xb5885648);
        java.lang.String mo42930x4f4a97c4 = interfaceC4987x84e327cb.mo42930x4f4a97c4();
        if (mo42930x4f4a97c4 == null) {
            mo42930x4f4a97c4 = "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSendCustomEmoji productId:");
        sb6.append(interfaceC4987x84e327cb.mo42930x4f4a97c4());
        sb6.append(", md5:");
        sb6.append(interfaceC4987x84e327cb.mo42933xb5885648());
        sb6.append(", desc:");
        sb6.append(desc);
        sb6.append(", designerId:");
        java.lang.String X0 = interfaceC4987x84e327cb.X0();
        if (X0 == null) {
            X0 = "";
        }
        sb6.append(X0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandInputNewSmileyPanel", sb6.toString());
        ol1.t tVar = this.f427655a;
        if (tVar != null) {
            java.lang.String md52 = interfaceC4987x84e327cb.mo42933xb5885648();
            java.lang.String X02 = interfaceC4987x84e327cb.X0();
            java.lang.String str = X02 != null ? X02 : "";
            com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p429x60b7c31.p430x1e0673e7.q qVar = (com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p429x60b7c31.p430x1e0673e7.q) tVar;
            com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p429x60b7c31.p430x1e0673e7.u uVar = qVar.f128783b.f128787m;
            uVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 service = qVar.f128782a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(md52, "md5");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
            if (service.mo50262x39e05d35()) {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("md5", md52);
                hashMap.put("productId", mo42930x4f4a97c4);
                hashMap.put("desc", desc);
                hashMap.put("designerId", str);
                uVar.t(hashMap);
                uVar.u(service);
                uVar.m();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9
    public void c() {
    }
}
