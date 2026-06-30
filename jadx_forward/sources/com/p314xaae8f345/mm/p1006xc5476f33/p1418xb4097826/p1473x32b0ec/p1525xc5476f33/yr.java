package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class yr implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et f196761d;

    public yr(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar) {
        this.f196761d = etVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        boolean booleanValue = bool.booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar = this.f196761d;
        if (booleanValue) {
            etVar.f193994y.setHint(etVar.R.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573376mp2));
            etVar.K.setVisibility(8);
        } else {
            etVar.f193994y.setHint(etVar.D1);
            etVar.K.setVisibility(0);
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.valueOf(etVar.G1))) {
            etVar.C1();
        }
        etVar.G1 = bool.booleanValue();
    }
}
