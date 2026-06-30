package qg5;

/* loaded from: classes8.dex */
public final class g implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qg5.p f444518a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f444519b;

    public g(qg5.p pVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var) {
        this.f444518a = pVar;
        this.f444519b = z2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public final void a() {
        qg5.p pVar = this.f444518a;
        pVar.f444662k = true;
        this.f444519b.B();
        yz5.a aVar = pVar.f444655d;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        vh0.o1 o1Var = (vh0.o1) ((jz5.n) pVar.f444656e).mo141623x754a37bb();
        com.p314xaae8f345.mm.p689xc5a27af6.p772xce036727.C10698x53096d50 agreement = (com.p314xaae8f345.mm.p689xc5a27af6.p772xce036727.C10698x53096d50) ((jz5.n) pVar.f444660i).mo141623x754a37bb();
        vh0.p3 p3Var = (vh0.p3) o1Var;
        p3Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(agreement, "agreement");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoUnifiedAgreementFeatureService", "accept unified agreement, version: " + agreement.f149401g + ", url: " + agreement.f149400f);
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c), null, null, new vh0.i3(p3Var, agreement, null), 3, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsAnalyzeStagingDialog", "User clicked continue button");
        qg5.p.a(pVar, pVar.b() ? 2 : 4, pVar.b());
    }
}
