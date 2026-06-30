package bb2;

/* loaded from: classes10.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13682x42ec4fe7 f100359d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13682x42ec4fe7 c13682x42ec4fe7) {
        this.f100359d = c13682x42ec4fe7;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13682x42ec4fe7 c13682x42ec4fe7 = this.f100359d;
        if (c13682x42ec4fe7.f184318g) {
            c13682x42ec4fe7.j();
            yz5.l onContinueClick = c13682x42ec4fe7.getOnContinueClick();
            if (onContinueClick != null) {
                onContinueClick.mo146xb9724478(java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - c13682x42ec4fe7.f184319h));
            }
            long j17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13682x42ec4fe7.f184314z;
            java.util.regex.Pattern pattern = pm0.v.f438335a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(this, j17);
        }
    }
}
