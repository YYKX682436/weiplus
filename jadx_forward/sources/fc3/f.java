package fc3;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final fc3.f f342573a = new fc3.f();

    public final void a(java.lang.String sendId, java.lang.String sessionId, int i17, int i18, long j17, int i19, java.lang.String keyword, long j18) {
        long j19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sendId, "sendId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyword, "keyword");
        if (j18 > 0) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            j19 = java.lang.System.currentTimeMillis() - j18;
        } else {
            j19 = -1;
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("blessing_barrage", kz5.c1.k(new jz5.l("hb_flistid", sendId), new jz5.l("hb_sessionid", sessionId), new jz5.l("hb_status", java.lang.Integer.valueOf(i17)), new jz5.l("hb_scene_ui", java.lang.Integer.valueOf(i18)), new jz5.l("blessing_show_time_ms", java.lang.Long.valueOf(j17)), new jz5.l("blessing_word_index", java.lang.Integer.valueOf(i19)), new jz5.l("blessing_word", keyword), new jz5.l("hb_voice_time", java.lang.Long.valueOf(j19))), 31016);
    }

    public final void b(java.lang.String sendId, java.lang.String sessionId, int i17, long j17, int i18) {
        long j18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sendId, "sendId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        if (j17 > 0) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            j18 = java.lang.System.currentTimeMillis() - j17;
        } else {
            j18 = -1;
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("blessing_barrage_switch", kz5.c1.k(new jz5.l("hb_flistid", sendId), new jz5.l("hb_sessionid", sessionId), new jz5.l("hb_scene_ui", java.lang.Integer.valueOf(i17)), new jz5.l("hb_voice_time", java.lang.Long.valueOf(j18)), new jz5.l("blessing_barrage_switch_flag", java.lang.Integer.valueOf(i18))), 31016);
    }
}
