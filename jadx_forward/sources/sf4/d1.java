package sf4;

/* loaded from: classes4.dex */
public final class d1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 f488980d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502) {
        super(3);
        this.f488980d = c18497x85806502;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        boolean booleanValue = ((java.lang.Boolean) obj3).booleanValue();
        boolean z17 = intValue == 3;
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502 = this.f488980d;
        c18497x85806502.B = z17;
        c18497x85806502.f253640y.m71483x52f47832(!z17);
        c18497x85806502.H = intValue == 1;
        oj5.a0 a0Var = c18497x85806502.f253619J;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(a0Var.f427366j);
        a0Var.f427365i = true ^ c18497x85806502.B;
        lf4.l lVar = c18497x85806502.A;
        if (lVar != null) {
            lVar.h(intValue, intValue2, booleanValue);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18494xf7976fba c18494xf7976fba = c18497x85806502.L;
        if (intValue == 3) {
            c18494xf7976fba.setVisibility(4);
            com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18492x194e0ecc c18492x194e0ecc = c18497x85806502.f253631q;
            if (c18492x194e0ecc != null) {
                c18492x194e0ecc.setVisibility(4);
            }
        } else {
            c18494xf7976fba.setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18492x194e0ecc c18492x194e0ecc2 = c18497x85806502.f253631q;
            if (c18492x194e0ecc2 != null) {
                c18492x194e0ecc2.setVisibility(0);
            }
        }
        return jz5.f0.f384359a;
    }
}
