package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59;

/* loaded from: classes12.dex */
public final class o0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz5.g f148988d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(jz5.g gVar) {
        super(1);
        this.f148988d = gVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        jz5.g gVar = this.f148988d;
        if (booleanValue) {
            if (!((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.IMutableAdpfState) gVar.mo141623x754a37bb()).mo40960xab2f7f06()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfFeatureService", "powerSaveMode on");
                ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.IMutableAdpfState) gVar.mo141623x754a37bb()).mo45068xfec5eff7();
            }
        } else if (((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.IMutableAdpfState) gVar.mo141623x754a37bb()).mo40960xab2f7f06()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfFeatureService", "powerSaveMode off");
            ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.IMutableAdpfState) gVar.mo141623x754a37bb()).mo45067xcd4bed6d();
        }
        return jz5.f0.f384359a;
    }
}
