package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class v20 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.i30 f196173d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qo0.c f196174e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v20(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.i30 i30Var, qo0.c cVar) {
        super(2);
        this.f196173d = i30Var;
        this.f196174e = cVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        ((java.lang.Number) obj2).longValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.i30 i30Var = this.f196173d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i30Var.f194436q, "getWeCoinBalance: " + longValue);
        if (longValue >= 0) {
            ((mm2.c1) i30Var.P0(mm2.c1.class)).w8(longValue);
            ce2.i iVar = i30Var.f194443x;
            if (iVar != null) {
                qo0.b bVar = qo0.b.Z1;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("PARAM_FINDER_LIVE_GIFT_ID", iVar.f67814x2c488eb6);
                bundle.putBoolean("PARAM_FINDER_LIVE_SEND_GIFT_FROM_ONECLICK", true);
                this.f196174e.mo46557x60d69242(bVar, bundle);
            }
        }
        return jz5.f0.f384359a;
    }
}
