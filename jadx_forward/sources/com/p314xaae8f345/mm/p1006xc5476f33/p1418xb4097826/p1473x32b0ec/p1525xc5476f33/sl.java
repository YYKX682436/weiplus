package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class sl extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm f195807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f195808e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar, long j17) {
        super(0);
        this.f195807d = hmVar;
        this.f195808e = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar = this.f195807d;
        java.lang.String str = hmVar.f194364r;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setBalance: balance:");
        long j17 = this.f195808e;
        sb6.append(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        android.widget.TextView textView = hmVar.B;
        if (j17 < 0) {
            java.lang.String str2 = hmVar.f194364r;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "setBalance: invalid balance:" + j17);
            dk2.xf W0 = hmVar.W0();
            java.lang.Long valueOf = W0 != null ? java.lang.Long.valueOf(((dk2.r4) W0).U()) : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "getBalanceFromCache: balance:" + valueOf);
            if (valueOf != null) {
                valueOf.longValue();
                if (valueOf.longValue() >= 0) {
                    textView.setText(java.lang.String.valueOf(valueOf));
                    if (!hmVar.H) {
                        hmVar.H = true;
                        hmVar.N1();
                    }
                }
            }
        } else {
            textView.setText(java.lang.String.valueOf(j17));
            if (!hmVar.H) {
                hmVar.H = true;
                hmVar.N1();
            }
        }
        return jz5.f0.f384359a;
    }
}
