package qg5;

/* loaded from: classes8.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qg5.p f444618d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(qg5.p pVar) {
        super(0);
        this.f444618d = pVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int b17;
        qg5.p pVar = this.f444618d;
        vh0.o1 o1Var = (vh0.o1) ((jz5.n) pVar.f444656e).mo141623x754a37bb();
        ((vh0.p3) ((vh0.o1) ((jz5.n) pVar.f444656e).mo141623x754a37bb())).getClass();
        boolean z17 = false;
        if (!(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2585xce036727.tos.C20840xdae87e05()) == 1)) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("YuanBaoUnifiedTermsFeatAnalyzeChatMinVer", 1);
            }
            b17 = 1;
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("YuanBaoUnifiedTermsFeatAnalyzeChatMinVer", "YuanBaoUnifiedTermsFeatAnalyzeChatMinVer")) {
            b17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2585xce036727.tos.C20844x5b0f48d9());
        } else {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("YuanBaoUnifiedTermsFeatAnalyzeChatMinVer", "YuanBaoUnifiedTermsFeatSummarizeMinVer")) {
                b17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2585xce036727.tos.C20845x7e5c3cfc());
            }
            b17 = 1;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p772xce036727.C10698x53096d50 agreement = (com.p314xaae8f345.mm.p689xc5a27af6.p772xce036727.C10698x53096d50) ((jz5.n) pVar.f444660i).mo141623x754a37bb();
        ((vh0.p3) o1Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(agreement, "agreement");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoUnifiedAgreementFeatureService", "feature version: " + b17);
        if (agreement.f149403i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoUnifiedAgreementFeatureService", "never signed before, show agreement");
        } else if (agreement.f149404m >= b17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoUnifiedAgreementFeatureService", "signed version is greater than feature version, hide agreement");
            z17 = true;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoUnifiedAgreementFeatureService", "latest version: " + agreement.f149401g + ", feature version: " + b17 + ", signed: " + agreement.f149402h);
            z17 = agreement.f149402h;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
