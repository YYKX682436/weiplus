package ge;

/* loaded from: classes7.dex */
public class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.zd {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 rt6) {
        super(rt6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rt6, "rt");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.zd, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.bd
    public int E6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 service) {
        android.graphics.Rect mo51613x2ae93e46;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        int E6 = super.E6(service);
        if (E6 > 0) {
            return E6;
        }
        xi1.g mo50261xee5260a9 = service.mo50261xee5260a9();
        return java.lang.Math.max(E6, (mo50261xee5260a9 == null || (mo51613x2ae93e46 = mo50261xee5260a9.mo51613x2ae93e46()) == null) ? 0 : mo51613x2ae93e46.top);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.zd, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.bd
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ad a7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ad a76 = super.a7();
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ad(a76.f171043a, a76.f171044b + a(b(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561582ml), a(b(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561552ls) + a(b(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561581mk), a76.f171046d);
    }
}
