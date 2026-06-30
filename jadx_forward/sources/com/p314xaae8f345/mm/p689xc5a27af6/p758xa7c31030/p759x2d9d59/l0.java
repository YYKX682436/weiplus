package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59;

/* loaded from: classes.dex */
public final class l0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz5.g f148976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jz5.g f148977e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(jz5.g gVar, jz5.g gVar2) {
        super(1);
        this.f148976d = gVar;
        this.f148977e = gVar2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        if (1 <= intValue && intValue < 1000) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.IMutableAdpfState) this.f148976d.mo141623x754a37bb()).mo45066xcc3ebb54(intValue > 430, new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.j0(intValue));
            return java.lang.Boolean.valueOf(((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.IMutableAdpfState) this.f148977e.mo141623x754a37bb()).mo45066xcc3ebb54(intValue > 450, new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.k0(intValue)));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AdpfFeatureService", "battery temp err: " + intValue);
        return jz5.f0.f384359a;
    }
}
