package py0;

/* loaded from: classes5.dex */
public final class a implements dz0.e {

    /* renamed from: a, reason: collision with root package name */
    public static final py0.a f440498a = new py0.a();

    @Override // dz0.e
    public java.lang.Object a(java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d hj6 = d11.s.fj().hj();
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_maas_export_video_fps, 30);
        int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_maas_export_video_bitrate, 0);
        int i17 = (Ni2 == 0 ? hj6.f152727g : Ni2) / Ni;
        int Ni3 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_maas_export_dimension_level, 0);
        if (Ni3 == 0) {
            Ni3 = hj6.f152724d;
        }
        rg.c cVar = Ni3 > 1080 ? rg.c.DIMENSION_LEVEL_1440 : Ni3 > 720 ? rg.c.DIMENSION_LEVEL_1080 : Ni3 > 540 ? rg.c.DIMENSION_LEVEL_720 : rg.c.DIMENSION_LEVEL_540;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMaasMovieSessionConfigProviderImpl", "provideExportSettings: fps: " + Ni + ", iframeInterval: " + (hj6.f152730m * Ni) + ", videoBitrate: " + i17 + ", xVideoBitrate:" + Ni2 + ", configBitrate:" + hj6.f152727g + ", audioBitrate: " + hj6.f152731n + ", dimension: " + Ni3);
        return new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4069xbe747ef4(Ni == 60 ? com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p473xa097e797.C4095x97ef0bcd.f129732h : com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p473xa097e797.C4095x97ef0bcd.f129729e, i17, hj6.f152731n, rg.e.H264, rg.a.MPEG4AAC, rg.d.MP4, cVar, hj6.f152730m * Ni);
    }
}
