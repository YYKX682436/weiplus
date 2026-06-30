package nu3;

/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final nu3.i f421751a = new nu3.i();

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16994x3ba8255 f421752b = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16994x3ba8255();

    /* renamed from: c, reason: collision with root package name */
    public static nu3.a f421753c = new nu3.a();

    /* renamed from: d, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6927x849d3564 f421754d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6927x849d3564();

    /* renamed from: e, reason: collision with root package name */
    public static nu3.a f421755e = new nu3.a();

    /* renamed from: f, reason: collision with root package name */
    public static int f421756f = -1;

    /* renamed from: g, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6938xb937af60 f421757g = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6938xb937af60();

    /* renamed from: h, reason: collision with root package name */
    public static nu3.a f421758h = new nu3.a();

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f421759i = "";

    /* renamed from: j, reason: collision with root package name */
    public static final java.lang.String f421760j = "";

    public static void c(nu3.i iVar, java.lang.String key, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            i17 = 1;
        }
        iVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        f421752b.c(key, java.lang.Integer.valueOf(((java.lang.Integer) f421752b.b(key, 0)).intValue() + i17));
    }

    public final void a(java.lang.String key, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        f421752b.c(key, java.lang.Long.valueOf(((java.lang.Long) f421752b.b(key, 0L)).longValue() + j17));
    }

    public final void b(int i17) {
        f421753c.a(i17);
    }

    public final void d(int i17) {
        int i18;
        if (i17 == 15 && ((i18 = f421756f) == 4 || i18 == 10)) {
            f421756f = i17;
            return;
        }
        f421756f = i17;
        f421755e.a(i17);
        f421758h.a(i17);
    }

    public final void e(java.lang.String key, java.lang.String value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        java.lang.String str = (java.lang.String) f421752b.b(key, "");
        if (!android.text.TextUtils.isEmpty(str)) {
            value = str + '#' + value;
        }
        f421752b.c(key, value);
    }

    public final void f(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        f421752b.f237222d.remove(key);
    }

    public final void g(int i17) {
        if (i17 == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16994x3ba8255 l17 = l();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6927x849d3564 c6927x849d3564 = f421754d;
            c6927x849d3564.f142412n = c6927x849d3564.b("MusicId", (java.lang.String) l17.b("KEY_MUSIC_ID_STRING", ""), true);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6927x849d3564 c6927x849d35642 = f421754d;
            java.lang.Object b17 = l17.b("KEY_MUSIC_INDEX_INT", 0L);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getReportValue(...)");
            c6927x849d35642.f142413o = ((java.lang.Number) b17).longValue();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6927x849d3564 c6927x849d35643 = f421754d;
            java.lang.Object b18 = l17.b("KEY_MUSIC_REQ_ID_INT", 0L);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b18, "getReportValue(...)");
            c6927x849d35643.f142415q = ((java.lang.Number) b18).longValue();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6927x849d3564 c6927x849d35644 = f421754d;
            java.lang.Object b19 = l17.b("KEY_SEARCH_MUSIC_INT", 0L);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b19, "getReportValue(...)");
            c6927x849d35644.f142421w = ((java.lang.Number) b19).longValue();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6927x849d3564 c6927x849d35645 = f421754d;
            c6927x849d35645.f142418t = c6927x849d35645.b("ActionTrace", f421755e.b(), true);
            f421754d.k();
            f421756f = -1;
        }
        f421754d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6927x849d3564();
        f421755e = new nu3.a();
    }

    public final void h() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6400x8ccd9a1a c6400x8ccd9a1a = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6400x8ccd9a1a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16994x3ba8255 l17 = l();
        java.lang.Object b17 = l17.b("KEY_NET_TYPE_INT", -1L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getReportValue(...)");
        c6400x8ccd9a1a.f137449d = ((java.lang.Number) b17).longValue();
        java.lang.Object b18 = l17.b("KEY_FROM_SCENE_INT", -1L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b18, "getReportValue(...)");
        c6400x8ccd9a1a.f137451e = ((java.lang.Number) b18).longValue();
        java.lang.Object b19 = l17.b("KEY_ENTER_TIME_MS_LONG", -1L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b19, "getReportValue(...)");
        c6400x8ccd9a1a.f137453f = ((java.lang.Number) b19).longValue();
        java.lang.Object b27 = l17.b("KEY_EXIT_TIME_MS_LONG", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b27, "getReportValue(...)");
        c6400x8ccd9a1a.f137455g = ((java.lang.Number) b27).longValue();
        java.lang.Object b28 = l17.b("KEY_MEDIA_SOURCE_INT", -1L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b28, "getReportValue(...)");
        c6400x8ccd9a1a.f137457h = ((java.lang.Number) b28).longValue();
        java.lang.Object b29 = l17.b("KEY_MEDIA_TYPE_INT", -1L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b29, "getReportValue(...)");
        c6400x8ccd9a1a.f137459i = ((java.lang.Number) b29).longValue();
        java.lang.Object b37 = l17.b("KEY_START_RECORD_MS_LONG", -1L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b37, "getReportValue(...)");
        c6400x8ccd9a1a.f137461j = ((java.lang.Number) b37).longValue();
        java.lang.Object b38 = l17.b("KEY_ORIGIN_MEDIA_DURATION_MS_LONG", -1L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b38, "getReportValue(...)");
        c6400x8ccd9a1a.f137463k = ((java.lang.Number) b38).longValue();
        java.lang.Object b39 = l17.b("KEY_ORIGIN_MEDIA_WIDTH_INT", -1L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b39, "getReportValue(...)");
        c6400x8ccd9a1a.f137465l = ((java.lang.Number) b39).longValue();
        java.lang.Object b47 = l17.b("KEY_ORIGIN_MEDIA_HEIGHT_INT", -1L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b47, "getReportValue(...)");
        c6400x8ccd9a1a.f137467m = ((java.lang.Number) b47).longValue();
        java.lang.Object b48 = l17.b("KEY_ENTER_CROP_PAGE_TIME_MS_LONG", -1L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b48, "getReportValue(...)");
        c6400x8ccd9a1a.f137469n = ((java.lang.Number) b48).longValue();
        java.lang.Object b49 = l17.b("KEY_EXIT_CROP_PAGE_TIME_MS_LONG", -1L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b49, "getReportValue(...)");
        c6400x8ccd9a1a.f137471o = ((java.lang.Number) b49).longValue();
        java.lang.Object b57 = l17.b("KEY_ENTER_EDIT_PAGE_TIME_MS_LONG", -1L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b57, "getReportValue(...)");
        c6400x8ccd9a1a.f137473p = ((java.lang.Number) b57).longValue();
        java.lang.Object b58 = l17.b("KEY_CLICK_EMOJI_COUNT_INT", 0L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b58, "getReportValue(...)");
        c6400x8ccd9a1a.f137475q = ((java.lang.Number) b58).longValue();
        java.lang.Object b59 = l17.b("KEY_ADD_EMOJI_COUNT_INT", 0L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b59, "getReportValue(...)");
        c6400x8ccd9a1a.f137477r = ((java.lang.Number) b59).longValue();
        java.lang.Object b67 = l17.b("KEY_CLICK_TEXT_COUNT_INT", 0L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b67, "getReportValue(...)");
        c6400x8ccd9a1a.f137479s = ((java.lang.Number) b67).longValue();
        java.lang.Object b68 = l17.b("KEY_ADD_TEXT_COUNT_INT", 0L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b68, "getReportValue(...)");
        c6400x8ccd9a1a.f137481t = ((java.lang.Number) b68).longValue();
        java.lang.Object b69 = l17.b("KEY_CLICK_DOODLE_COUNT_INT", 0L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b69, "getReportValue(...)");
        c6400x8ccd9a1a.f137482u = ((java.lang.Number) b69).longValue();
        java.lang.Object b76 = l17.b("KEY_ADD_DOODLE_COUNT_INT", 0L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b76, "getReportValue(...)");
        c6400x8ccd9a1a.f137483v = ((java.lang.Number) b76).longValue();
        java.lang.Object b77 = l17.b("KEY_ADD_DOODLE_COLOR_COUNT_INT", 0L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b77, "getReportValue(...)");
        c6400x8ccd9a1a.f137484w = ((java.lang.Number) b77).longValue();
        java.lang.Object b78 = l17.b("KEY_CLICK_MOSAIC_COUNT_INT", 0L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b78, "getReportValue(...)");
        c6400x8ccd9a1a.f137485x = ((java.lang.Number) b78).longValue();
        java.lang.Object b79 = l17.b("KEY_CLICK_BRUSH_COUNT_INT", 0L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b79, "getReportValue(...)");
        c6400x8ccd9a1a.f137486y = ((java.lang.Number) b79).longValue();
        java.lang.Object b86 = l17.b("KEY_ADD_MOSAIC_COUNT_INT", 0L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b86, "getReportValue(...)");
        c6400x8ccd9a1a.f137487z = ((java.lang.Number) b86).longValue();
        java.lang.Object b87 = l17.b("KEY_CLICK_CROP_COUNT_INT", 0L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b87, "getReportValue(...)");
        c6400x8ccd9a1a.A = ((java.lang.Number) b87).longValue();
        java.lang.Object b88 = l17.b("KEY_CROP_MEDIA_HEIGHT_INT", -1L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b88, "getReportValue(...)");
        c6400x8ccd9a1a.C = ((java.lang.Number) b88).longValue();
        java.lang.Object b89 = l17.b("KEY_CROP_MEDIA_WIDTH_INT", -1L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b89, "getReportValue(...)");
        c6400x8ccd9a1a.B = ((java.lang.Number) b89).longValue();
        java.lang.Object b96 = l17.b("KEY_ROTATE_INT", -1L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b96, "getReportValue(...)");
        c6400x8ccd9a1a.D = ((java.lang.Number) b96).longValue();
        java.lang.Object b97 = l17.b("KEY_CLICK_MUSIC_COUNT_INT", 0L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b97, "getReportValue(...)");
        c6400x8ccd9a1a.E = ((java.lang.Number) b97).longValue();
        java.lang.Object b98 = l17.b("KEY_MUSIC_ID_STRING", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b98, "getReportValue(...)");
        java.lang.Long j17 = r26.h0.j((java.lang.String) b98);
        c6400x8ccd9a1a.F = j17 != null ? j17.longValue() : 0L;
        java.lang.Object b99 = l17.b("KEY_MUSIC_INDEX_INT", -1L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b99, "getReportValue(...)");
        c6400x8ccd9a1a.G = ((java.lang.Number) b99).longValue();
        java.lang.Object b100 = l17.b("KEY_SELECT_MUSIC_INT", -1L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b100, "getReportValue(...)");
        c6400x8ccd9a1a.H = ((java.lang.Number) b100).longValue();
        java.lang.Object b101 = l17.b("KEY_SELECT_ORIGIN_INT", -1L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b101, "getReportValue(...)");
        c6400x8ccd9a1a.I = ((java.lang.Number) b101).longValue();
        java.lang.Object b102 = l17.b("KEY_MUSIC_REQ_ID_INT", -1L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b102, "getReportValue(...)");
        c6400x8ccd9a1a.f137445J = ((java.lang.Number) b102).longValue();
        java.lang.Object b103 = l17.b("KEY_SEARCH_MUSIC_INT", -1L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b103, "getReportValue(...)");
        c6400x8ccd9a1a.K = ((java.lang.Number) b103).longValue();
        java.lang.Object b104 = l17.b("KEY_CLICK_VIDEO_CROP_COUNT_INT", 0L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b104, "getReportValue(...)");
        c6400x8ccd9a1a.L = ((java.lang.Number) b104).longValue();
        java.lang.Object b105 = l17.b("KEY_VIDEO_CROP_DURATION_MS_INT", -1L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b105, "getReportValue(...)");
        c6400x8ccd9a1a.M = ((java.lang.Number) b105).longValue();
        java.lang.Object b106 = l17.b("KEY_AFTER_EDIT_INT", -1L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b106, "getReportValue(...)");
        c6400x8ccd9a1a.N = ((java.lang.Number) b106).longValue();
        java.lang.Object b107 = l17.b("KEY_EDIT_PUBLISHID_INT", -1L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b107, "getReportValue(...)");
        c6400x8ccd9a1a.O = ((java.lang.Number) b107).longValue();
        java.lang.Object b108 = l17.b("KEY_IS_SHOW_WESEE_BTN", 0L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b108, "getReportValue(...)");
        c6400x8ccd9a1a.Q = ((java.lang.Number) b108).longValue();
        java.lang.Object b109 = l17.b("KEY_IS_CLICK_WESEE_BTN", 0L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b109, "getReportValue(...)");
        c6400x8ccd9a1a.R = ((java.lang.Number) b109).longValue();
        java.lang.Object b110 = l17.b("KEY_IS_INSTALL_WESEE", 0L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b110, "getReportValue(...)");
        c6400x8ccd9a1a.S = ((java.lang.Number) b110).longValue();
        java.lang.Object b111 = l17.b("KEY_WESEE_DIALOG_OPERATION", 0L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b111, "getReportValue(...)");
        c6400x8ccd9a1a.T = ((java.lang.Number) b111).longValue();
        c6400x8ccd9a1a.P = c6400x8ccd9a1a.b("ActionTrace", f421753c.b(), true);
        java.lang.Object b112 = l17.b("KEY_SEARCH_MUSIC_COUNT_INT", 0L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b112, "getReportValue(...)");
        c6400x8ccd9a1a.U = ((java.lang.Number) b112).longValue();
        c6400x8ccd9a1a.V = c6400x8ccd9a1a.b("SearchMusicList", (java.lang.String) l17.b("KEY_SEARCH_MUSIC_LIST_STRING", ""), true);
        c6400x8ccd9a1a.W = c6400x8ccd9a1a.b("TextWidgetContentList", (java.lang.String) l17.b("KEY_TEXT_WIDGET_CONTENT_STRING", ""), true);
        c6400x8ccd9a1a.Y = c6400x8ccd9a1a.b("moment_sessionid", (java.lang.String) l17.b("moment_sessionid_", ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Bi()), true);
        c6400x8ccd9a1a.f137446a0 = c6400x8ccd9a1a.b("CameraSessionID", (java.lang.String) l17.b("KEY_CAMERA_SESSION_ID", ""), true);
        java.lang.Object b113 = l17.b("KEY_ZOOM_IN_OUT_COUNT", 0L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b113, "getReportValue(...)");
        c6400x8ccd9a1a.Z = ((java.lang.Number) b113).longValue();
        java.lang.Object b114 = l17.b("KEY_CLICK_PEN_ERASER", 0L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b114, "getReportValue(...)");
        c6400x8ccd9a1a.f137454f0 = ((java.lang.Number) b114).longValue();
        java.lang.Object b115 = l17.b("KEY_PEN_ERASER_WIDGET_COUNT", 0L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b115, "getReportValue(...)");
        c6400x8ccd9a1a.f137456g0 = ((java.lang.Number) b115).longValue();
        java.lang.Object b116 = l17.b("KEY_PEN_ERASER_TRACE_COUNT", 0L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b116, "getReportValue(...)");
        c6400x8ccd9a1a.f137458h0 = ((java.lang.Number) b116).longValue();
        java.lang.Object b117 = l17.b("KEY_CLICK_MOSAIC_COUNT", 0L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b117, "getReportValue(...)");
        c6400x8ccd9a1a.f137460i0 = ((java.lang.Number) b117).longValue();
        java.lang.Object b118 = l17.b("KEY_MOSAIC_ERASER_WIDGET_COUNT", 0L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b118, "getReportValue(...)");
        c6400x8ccd9a1a.f137462j0 = ((java.lang.Number) b118).longValue();
        java.lang.Object b119 = l17.b("KEY_MOSAIC_ERASER_TRACE_COUNT", 0L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b119, "getReportValue(...)");
        c6400x8ccd9a1a.f137464k0 = ((java.lang.Number) b119).longValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.Object b120 = l17.b("KEY_CLICK_UNDO_PEN", 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b120, "getReportValue(...)");
        sb6.append(((java.lang.Number) b120).intValue());
        sb6.append("#");
        java.lang.Object b121 = l17.b("KEY_CLICK_UNDO_PEN_ERASER", 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b121, "getReportValue(...)");
        sb6.append(((java.lang.Number) b121).intValue());
        sb6.append("#");
        java.lang.Object b122 = l17.b("KEY_CLICK_UNDO_EMOJI", 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b122, "getReportValue(...)");
        sb6.append(((java.lang.Number) b122).intValue());
        sb6.append("#");
        java.lang.Object b123 = l17.b("KEY_CLICK_UNDO_TEXT", 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b123, "getReportValue(...)");
        sb6.append(((java.lang.Number) b123).intValue());
        sb6.append("#");
        java.lang.Object b124 = l17.b("KEY_CLICK_UNDO_CROP", 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b124, "getReportValue(...)");
        sb6.append(((java.lang.Number) b124).intValue());
        sb6.append("#");
        java.lang.Object b125 = l17.b("KEY_CLICK_UNDO_MOSAIC", 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b125, "getReportValue(...)");
        sb6.append(((java.lang.Number) b125).intValue());
        sb6.append("#");
        java.lang.Object b126 = l17.b("KEY_CLICK_UNDO_MOSAIC_ERASER", 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b126, "getReportValue(...)");
        sb6.append(((java.lang.Number) b126).intValue());
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        c6400x8ccd9a1a.f137466l0 = c6400x8ccd9a1a.b("ClickWithdrawCnt", sb7, true);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        java.lang.Object b127 = l17.b("KEY_CLICK_REDO_PEN", 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b127, "getReportValue(...)");
        sb8.append(((java.lang.Number) b127).intValue());
        sb8.append("#");
        java.lang.Object b128 = l17.b("KEY_CLICK_REDO_PEN_ERASER", 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b128, "getReportValue(...)");
        sb8.append(((java.lang.Number) b128).intValue());
        sb8.append("#");
        java.lang.Object b129 = l17.b("KEY_CLICK_REDO_EMOJI", 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b129, "getReportValue(...)");
        sb8.append(((java.lang.Number) b129).intValue());
        sb8.append("#");
        java.lang.Object b130 = l17.b("KEY_CLICK_REDO_TEXT", 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b130, "getReportValue(...)");
        sb8.append(((java.lang.Number) b130).intValue());
        sb8.append("#");
        java.lang.Object b131 = l17.b("KEY_CLICK_REDO_CROP", 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b131, "getReportValue(...)");
        sb8.append(((java.lang.Number) b131).intValue());
        sb8.append("#");
        java.lang.Object b132 = l17.b("KEY_CLICK_REDO_MOSAIC", 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b132, "getReportValue(...)");
        sb8.append(((java.lang.Number) b132).intValue());
        sb8.append("#");
        java.lang.Object b133 = l17.b("KEY_CLICK_REDO_MOSAIC_ERASER", 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b133, "getReportValue(...)");
        sb8.append(((java.lang.Number) b133).intValue());
        java.lang.String sb9 = sb8.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb9, "toString(...)");
        c6400x8ccd9a1a.f137468m0 = c6400x8ccd9a1a.b("ClickRedoCnt", sb9, true);
        java.lang.Object b134 = l17.b("KEY_CLICK_NEW_LINE_COUNT", 0L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b134, "getReportValue(...)");
        c6400x8ccd9a1a.f137470n0 = ((java.lang.Number) b134).longValue();
        c6400x8ccd9a1a.f137474p0 = c6400x8ccd9a1a.b("ChatUserName", (java.lang.String) l17.b("KEY_CHAT_USERNAME", ""), true);
        java.lang.Object b135 = l17.b("KEY_ROOM_SIZE", 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b135, "getReportValue(...)");
        c6400x8ccd9a1a.f137476q0 = ((java.lang.Number) b135).intValue();
        c6400x8ccd9a1a.f137472o0 = c6400x8ccd9a1a.b("CameraEnterSessionID", (java.lang.String) l17.b("KEY_CAMERA_ENTER_SESSION_ID", ""), true);
        c6400x8ccd9a1a.f137478r0 = java.lang.System.currentTimeMillis();
        c6400x8ccd9a1a.f137480s0 = c6400x8ccd9a1a.b("EditSessionID", java.lang.String.valueOf(l17.b("KEY_EDIT_SESSION_ID", 0L)), true);
        c6400x8ccd9a1a.k();
        int i17 = (int) c6400x8ccd9a1a.f137451e;
        java.lang.Object b136 = l17.b("KEY_EDIT_SESSION_ID", 0L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b136, "getReportValue(...)");
        f421752b = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16994x3ba8255();
        f421753c = new nu3.a();
        nu3.i iVar = f421751a;
        iVar.n("KEY_FROM_SCENE_INT", java.lang.Integer.valueOf(i17));
        iVar.n("KEY_EDIT_SESSION_ID", b136);
    }

    public final void i(int i17) {
        if (i17 == 3) {
            f421757g.f142481h = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6938xb937af60 c6938xb937af60 = f421757g;
            c6938xb937af60.f142488o = c6938xb937af60.b("NewActionTrace", f421758h.b(), true);
            f421757g.k();
        }
        f421757g = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6938xb937af60();
        f421758h = new nu3.a();
    }

    public final void j(long j17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6882x88752f67 c6882x88752f67 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6882x88752f67();
        c6882x88752f67.f142004e = 2L;
        c6882x88752f67.f142005f = j17;
        c6882x88752f67.f142003d = c6882x88752f67.b("sessionid", f421760j, true);
        c6882x88752f67.k();
    }

    public final void k(long j17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6884xcc87063a c6884xcc87063a = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6884xcc87063a();
        c6884xcc87063a.f142025e = j17;
        c6884xcc87063a.f142024d = c6884xcc87063a.b("sessionid", f421759i, true);
        c6884xcc87063a.k();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16994x3ba8255 l() {
        f421752b.c("KEY_ACTION_TRACE_STRING", f421753c.b());
        return f421752b;
    }

    public final void m(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16995x8ab634cd c16995x8ab634cd) {
        f421752b = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16994x3ba8255();
        f421753c = new nu3.a();
        f421751a.n("KEY_FROM_SCENE_INT", java.lang.Integer.valueOf(c16995x8ab634cd != null ? c16995x8ab634cd.f237223d : -1));
    }

    public final void n(java.lang.String key, java.lang.Object value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        f421752b.c(key, value);
    }
}
