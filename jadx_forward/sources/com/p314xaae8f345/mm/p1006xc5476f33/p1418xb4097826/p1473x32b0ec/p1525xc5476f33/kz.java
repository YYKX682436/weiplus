package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class kz implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oz f194856d;

    public kz(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oz ozVar) {
        this.f194856d = ozVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oz ozVar = this.f194856d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.C14288xbc18f594 c14288xbc18f594 = ozVar.f195337p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
        int intValue = num.intValue();
        if (c14288xbc18f594.f196957d != intValue) {
            c14288xbc18f594.f196957d = intValue;
            c14288xbc18f594.requestLayout();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiStreamIndicatorPlugin", "multiChannelParamsList " + ozVar.f195338q + " size: " + num);
        if (num.intValue() <= 1 || !ozVar.f195338q) {
            ozVar.K0(8);
        } else {
            ozVar.K0(0);
        }
    }
}
