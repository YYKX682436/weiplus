package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes.dex */
public final class q8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f198138d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d f198139e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8(java.lang.String str, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d) {
        super(0);
        this.f198138d = str;
        this.f198139e = c22628xfde5d61d;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str = this.f198138d;
        android.graphics.Bitmap K = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.K(str);
        if (K != null) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.p8(this.f198139e, K));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveProductRecordPlayWidget", "decode bitmap failed: " + str);
        }
        return jz5.f0.f384359a;
    }
}
