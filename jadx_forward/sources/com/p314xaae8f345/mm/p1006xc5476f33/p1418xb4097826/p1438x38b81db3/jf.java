package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class jf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf f185281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f185282e;

    public jf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf zfVar, long j17) {
        this.f185281d = zfVar;
        this.f185282e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f185281d.f186643p1;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("deleteLiveFeed send FeedDeleteEvent feedId: ");
        long j17 = this.f185282e;
        sb6.append(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, sb6.toString());
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11 c5437xe8b43b11 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11();
        am.da daVar = c5437xe8b43b11.f135780g;
        daVar.f87970a = j17;
        daVar.f87972c = true;
        c5437xe8b43b11.e();
    }
}
