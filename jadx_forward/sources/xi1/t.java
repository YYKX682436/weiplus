package xi1;

/* loaded from: classes7.dex */
public final class t implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.o2 {
    public t(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.o2
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p2 a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.o oVar;
        android.content.Context context;
        android.content.Context context2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc hcVar;
        xi1.g mo48808xee5260a9;
        xi1.p mo51612x60543150;
        if (tVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) tVar).t3();
            if (t37 != null && (hcVar = t37.f156329e) != null && (mo48808xee5260a9 = hcVar.mo48808xee5260a9()) != null && (mo51612x60543150 = mo48808xee5260a9.mo51612x60543150()) != null) {
                return new xi1.u(mo51612x60543150);
            }
            if (tVar == null || (context2 = tVar.mo50352x76847179()) == null) {
                context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context2);
            oVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.o(context2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.WxaOrientationGetter", "create, something null, use AndroidOrientationGetter as fallback");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.WxaOrientationGetter", "create, componentView is not AppBrandComponentWithExtra, use AndroidOrientationGetter as fallback");
            if (tVar == null || (context = tVar.mo50352x76847179()) == null) {
                context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
            oVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.o(context);
        }
        return oVar;
    }
}
