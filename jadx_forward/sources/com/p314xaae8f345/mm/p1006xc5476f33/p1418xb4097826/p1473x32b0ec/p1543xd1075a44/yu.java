package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes5.dex */
public final class yu extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dv f202006d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dv dvVar) {
        super(1);
        this.f202006d = dvVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dv dvVar = this.f202006d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = dvVar.f199685e.mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            int mo1894x7e414b06 = mo7946xf939df19.mo1894x7e414b06();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRequestSongRvWidget", "firstVisiblePosition " + intValue + " datalist size " + mo1894x7e414b06 + " reverse continue flag " + dvVar.f199694n + " loadingHistory " + dvVar.f199692l);
            if (dvVar.f199694n > 0 && mo1894x7e414b06 != 0 && intValue <= 0 && !dvVar.f199692l && (y0Var = dvVar.f199683c) != null) {
                p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.zu(dvVar, null), 3, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
