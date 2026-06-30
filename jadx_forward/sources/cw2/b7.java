package cw2;

/* loaded from: classes15.dex */
public final class b7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd f305135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f305136e;

    public b7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd, java.lang.String str) {
        this.f305135d = c15188xd8bd4bd;
        this.f305136e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = this.f305135d;
        if (c15188xd8bd4bd.isViewFocused) {
            c15188xd8bd4bd.m61402x5f6bcd60(true);
            zy2.ub videoViewCallback = this.f305135d.getVideoViewCallback();
            if (videoViewCallback != null) {
                videoViewCallback.N5("", this.f305136e, java.lang.Boolean.valueOf(this.f305135d.isSeeking));
            }
            if (this.f305136e != null) {
                ((ku5.t0) ku5.t0.f394148d).k(new cw2.a7(this.f305136e), 20L);
            }
            ((c61.l7) i95.n0.c(c61.l7.class)).ek().f546217a.a();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd2 = this.f305135d;
            c15188xd8bd4bd2.H = null;
            cw2.d0 playerBufferController = c15188xd8bd4bd2.getPlayerBufferController();
            if (playerBufferController != null) {
                java.util.concurrent.atomic.AtomicInteger atomicInteger = cw2.d0.f305159n;
                atomicInteger.incrementAndGet();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderBufCtr", "onBufferingStart bufferCount:" + atomicInteger.get());
                playerBufferController.a(playerBufferController.f305167h, "onBufferingStart");
            }
        }
    }
}
