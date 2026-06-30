package gz0;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4069xbe747ef4 c4069xbe747ef4) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c4069xbe747ef4, "<this>");
        c4069xbe747ef4.f129649k = true;
        c4069xbe747ef4.f129652n = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(e42.c0.clicfg_sns_template_cover_blackness_ratio_threshold, 0.0f);
        c4069xbe747ef4.f129651m = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33967x6fa736dc(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.c0.clicfg_sns_template_cover_frame_max_duration, 1500L));
        c4069xbe747ef4.f129650l = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_template_cover_frame_interval, 15);
        float Di = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(e42.c0.clicfg_sns_template_cover_clarity_threshold, -1.0f);
        c4069xbe747ef4.f129653o = Di < 0.0f ? Float.POSITIVE_INFINITY : Di;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplate.SnsMaasMovieSessionConfigProviderImpl", "provideExportSettings: Cover DetectionEnable=" + c4069xbe747ef4.m33190x1a44adca() + ", DarkThreshold=" + c4069xbe747ef4.m33179xe39dfa78() + ", MaxDuration=" + c4069xbe747ef4.m33181xd6b9d64d() + ", FrameInterval=" + c4069xbe747ef4.m33180x942e5f47() + ", ClarityThreshold=" + Di);
    }
}
