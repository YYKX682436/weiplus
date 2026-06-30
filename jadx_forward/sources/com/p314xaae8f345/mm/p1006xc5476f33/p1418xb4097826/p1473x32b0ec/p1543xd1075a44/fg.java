package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class fg extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f199885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gg f199886e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gg ggVar) {
        super(2);
        this.f199885d = j17;
        this.f199886e = ggVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        long longValue2 = ((java.lang.Number) obj2).longValue();
        long j17 = this.f199885d;
        if (longValue2 != j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFansJoinWidget", "updateWecoinBalance: requestId not match, requestId:" + longValue2 + ", wecoinBalanceRequestId:" + j17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFansJoinWidget", "updateWecoinBalance wecoinBalance:" + longValue);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gg ggVar = this.f199886e;
            ggVar.f199977y = longValue;
            ggVar.f199968p.setText(java.lang.String.valueOf(longValue));
            ggVar.f199973u = true;
        }
        return jz5.f0.f384359a;
    }
}
