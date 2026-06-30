package vo4;

/* loaded from: classes10.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vo4.x f520227d;

    public v(vo4.x xVar) {
        this.f520227d = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vo4.u uVar;
        boolean c17;
        hs0.a aVar;
        fs0.g mVar;
        int i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        vo4.x xVar = this.f520227d;
        sb6.append(xVar.hashCode());
        sb6.append(' ');
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p0 p0Var = xVar.f520138d;
        sb6.append(p0Var.f257243c);
        sb6.append(" start do check crop rect");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogVideoPlayer", sb6.toString());
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        hs0.a aVar2 = new hs0.a(p0Var.f257243c);
        ls0.v vVar = new ls0.v(aVar2, false, 2, null);
        vo4.u uVar2 = new vo4.u(xVar, elapsedRealtime, aVar2);
        vVar.f402464c = uVar2;
        try {
            c17 = fp.h.c(23);
            aVar = vVar.f402462a;
        } catch (java.lang.Exception e17) {
            e = e17;
            uVar = uVar2;
        }
        try {
            if (c17) {
                android.media.MediaFormat mediaFormat = aVar.f366084e;
                if (mediaFormat != null) {
                    uVar = uVar2;
                    i17 = (int) mediaFormat.getLong("durationUs");
                } else {
                    uVar = uVar2;
                    i17 = 0;
                }
                if (i17 <= 0) {
                    android.media.MediaFormat mediaFormat2 = aVar.f366085f;
                    i17 = mediaFormat2 != null ? (int) mediaFormat2.getLong("durationUs") : 0;
                }
                mVar = new fs0.o(0L, i17 / 1000, vVar.f402462a, null, 0, false, new ls0.s(vVar));
            } else {
                uVar = uVar2;
                android.media.MediaFormat mediaFormat3 = aVar.f366084e;
                int i18 = mediaFormat3 != null ? (int) mediaFormat3.getLong("durationUs") : 0;
                if (i18 <= 0) {
                    android.media.MediaFormat mediaFormat4 = aVar.f366085f;
                    i18 = mediaFormat4 != null ? (int) mediaFormat4.getLong("durationUs") : 0;
                }
                mVar = new fs0.m(0L, i18 / 1000, vVar.f402462a, null, 0, false, new ls0.t(vVar));
            }
            vVar.f402463b = mVar;
        } catch (java.lang.Exception e18) {
            e = e18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(vVar.f402468g, e, "start check init decoder error", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxCheckCropRectFailed");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 78L, 1L);
            uVar.mo149xb9724478(null, vVar);
            vVar.f402469h = pm0.v.m("MediaCodecCheckVideoCropRect_decode", false, new ls0.u(vVar));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogVideoPlayer", xVar.hashCode() + " checkCropRect finish cost " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        }
        vVar.f402469h = pm0.v.m("MediaCodecCheckVideoCropRect_decode", false, new ls0.u(vVar));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogVideoPlayer", xVar.hashCode() + " checkCropRect finish cost " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
    }
}
