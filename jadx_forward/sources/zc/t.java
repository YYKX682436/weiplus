package zc;

/* loaded from: classes15.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 f552903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo f552904e;

    public t(com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 c3646xcf902238, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo pageInfo) {
        this.f552903d = c3646xcf902238;
        this.f552904e = pageInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo pageInfo = this.f552904e;
        int i17 = pageInfo.f37288x5cfee87;
        com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 c3646xcf902238 = this.f552903d;
        c3646xcf902238.mo28586x52fbaf45(i17);
        c3646xcf902238.mo28590xdaac6ff(pageInfo.f37291xf2725bc1);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c3646xcf902238.f127501g, pageInfo.f37283x58b7f1c)) {
            return;
        }
        c3646xcf902238.e();
    }
}
