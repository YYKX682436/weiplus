package v22;

/* loaded from: classes10.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v22.f f514335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f514336e;

    public c(v22.f fVar, boolean z17) {
        this.f514335d = fVar;
        this.f514336e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v22.f fVar = this.f514335d;
        boolean mo65002x316510 = fVar.f514344c.mo65002x316510();
        java.lang.String str = fVar.f514342a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init encoder, outputGif: ");
        boolean z17 = this.f514336e;
        sb6.append(z17);
        sb6.append(" ret: ");
        sb6.append(mo65002x316510);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (!mo65002x316510) {
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markGifInitFailed");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1012L, 33L, 1L);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markWxamInitFailed");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1012L, 32L, 1L);
            }
        }
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        fVar.f514345d = android.os.SystemClock.elapsedRealtime();
    }
}
