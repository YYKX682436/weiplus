package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ed implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jp {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f193932a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad f193933b;

    public ed(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad adVar) {
        this.f193932a = interfaceC29045xdcb5ca57;
        this.f193933b = adVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jp
    public void a(boolean z17, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ip errType, java.lang.String str, java.lang.Long l17, int i18, java.lang.String str2, java.lang.String str3, ek2.i2 i2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errType, "errType");
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveChargePayPluginEx", "after pay left balance:" + l17);
        } else {
            int ordinal = errType.ordinal();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad adVar = this.f193933b;
            if (ordinal == 1) {
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fd(str3, adVar));
            } else if (ordinal == 2) {
                if (i17 == 10003) {
                    pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.id(adVar));
                } else {
                    pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fd(str3, adVar));
                }
            }
        }
        this.f193932a.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(z17)));
    }
}
