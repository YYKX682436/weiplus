package ok4;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final ok4.u f427574a = new ok4.u();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f427575b = new java.util.HashMap();

    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6749x237baa80 a(java.lang.String str) {
        return (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6749x237baa80) f427575b.get(str);
    }

    public final void b(java.lang.String mediaId, java.lang.String feedId, int i17, boolean z17, boolean z18, int i18, java.lang.String previewReqFlag, int i19, long j17, int i27, boolean z19, int i28, boolean z27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedId, "feedId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewReqFlag, "previewReqFlag");
        e(new ok4.g(mediaId, feedId, i17, z17, z18, i18, previewReqFlag, j17, i27, i19, z19, i28, z27));
    }

    public final void d(java.lang.String mediaId) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6749x237baa80 a17 = a(mediaId);
        if (a17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoDownloadReporter", "setVideoViewClick >> " + mediaId + ", " + a17.N);
            a17.N = a17.N + 1;
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsVideoDownloadReporter", "setVideoViewClick >> " + mediaId + " but data is no find");
        }
    }

    public final void e(yz5.a aVar) {
        ((ku5.t0) ku5.t0.f394148d).h(new ok4.t(aVar), "SnsVideoReportThread");
    }
}
