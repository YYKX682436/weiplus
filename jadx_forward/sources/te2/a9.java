package te2;

/* loaded from: classes5.dex */
public final class a9 {

    /* renamed from: a, reason: collision with root package name */
    public static final te2.a9 f499416a = new te2.a9();

    /* renamed from: b, reason: collision with root package name */
    public static long f499417b;

    /* renamed from: c, reason: collision with root package name */
    public static long f499418c;

    public static void f(te2.a9 a9Var, boolean z17, int i17, java.util.List list, mm2.k6 k6Var, int i18, java.lang.Object obj) {
        java.util.List list2 = (i18 & 4) != 0 ? null : list;
        mm2.k6 k6Var2 = (i18 & 8) == 0 ? k6Var : null;
        a9Var.getClass();
        java.lang.String str = "1";
        java.util.Map l17 = kz5.c1.l(new jz5.l("type", java.lang.String.valueOf(i17)), new jz5.l("style", "1"));
        if (!(list2 == null || list2.isEmpty())) {
            l17.put("song_id", kz5.n0.g0(list2, "_", null, null, 0, null, te2.u8.f500009d, 30, null));
            l17.put("song_name", kz5.n0.g0(list2, "_", null, null, 0, null, te2.v8.f500031d, 30, null));
            l17.put("duration", kz5.n0.g0(list2, "_", null, null, 0, null, te2.w8.f500046d, 30, null));
            l17.put("singer_mid", kz5.n0.g0(list2, "_", null, null, 0, null, te2.x8.f500065d, 30, null));
            l17.put("singer_name", kz5.n0.g0(list2, "_", null, null, 0, null, te2.y8.f500081d, 30, null));
            l17.put("part_id", kz5.n0.g0(list2, "_", null, null, 0, null, te2.z8.f500100d, 30, null));
        }
        if (k6Var2 != null) {
            int ordinal = k6Var2.ordinal();
            if (ordinal == 0) {
                str = "2";
            } else if (ordinal == 1) {
                str = "3";
            } else if (ordinal != 2) {
                throw new jz5.j();
            }
            l17.put("switch_detail", str);
        }
        if (z17) {
            a9Var.c(ml2.z4.f409918w2, l17);
        } else {
            a9Var.d(ml2.c1.f408859f, l17);
        }
    }

    public static void g(te2.a9 a9Var, int i17, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2, boolean z17, int i18, java.lang.Object obj) {
        java.lang.String str3 = (i18 & 2) != 0 ? null : str;
        java.lang.String str4 = (i18 & 4) != 0 ? null : str2;
        java.lang.Integer num3 = (i18 & 8) != 0 ? null : num;
        java.lang.Integer num4 = (i18 & 16) == 0 ? num2 : null;
        boolean z18 = (i18 & 32) != 0 ? true : z17;
        a9Var.getClass();
        java.util.Map l17 = kz5.c1.l(new jz5.l("type", java.lang.String.valueOf(i17)));
        if (z18) {
            l17.put("style", "1");
        }
        if (str3 != null) {
            l17.put("music_name", str3);
        }
        if (str4 != null) {
            l17.put("gift_id", str4);
        }
        if (num3 != null) {
            l17.put("gift_count", num3.toString());
        }
        if (i17 == 1 && num4 != null) {
            l17.put("source_type", num4.toString());
        }
        ml2.b4 b4Var = ml2.b4.A1;
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, b4Var, new org.json.JSONObject(l17).toString(), 0L, null, null, null, null, null, 252, null);
    }

    public final void a(boolean z17, int i17, r45.in inVar, r45.ch6 ch6Var, r45.ay1 ay1Var) {
        java.util.Map l17 = kz5.c1.l(new jz5.l("type", java.lang.String.valueOf(i17)), new jz5.l("style", "1"));
        if (inVar != null) {
            l17.put("tab_id", java.lang.String.valueOf(inVar.f458689d));
            java.lang.String board_name = inVar.f458690e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(board_name, "board_name");
            l17.put("tab_name", board_name);
        }
        if (ch6Var != null) {
            l17.put("tab_sub_id", java.lang.String.valueOf(ch6Var.f453088d));
            java.lang.String sub_board_name = ch6Var.f453089e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sub_board_name, "sub_board_name");
            l17.put("tab_sub_name", sub_board_name);
        }
        if (ay1Var != null) {
            java.lang.String song_mid = ay1Var.f451883d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(song_mid, "song_mid");
            l17.put("song_id", song_mid);
            java.lang.String song_name = ay1Var.f451884e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(song_name, "song_name");
            l17.put("song_name", song_name);
            l17.put("duration", java.lang.String.valueOf(ay1Var.f451887h));
            java.lang.String singer_mid = ay1Var.f451885f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(singer_mid, "singer_mid");
            l17.put("singer_mid", singer_mid);
            java.lang.String singer_name = ay1Var.f451886g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(singer_name, "singer_name");
            l17.put("singer_name", singer_name);
            if (ay1Var.f451893q) {
                l17.put("part_id", "1");
            }
        }
        if (z17) {
            c(ml2.z4.f409922x2, l17);
        } else {
            d(ml2.c1.f408860g, l17);
        }
    }

    public final void c(ml2.z4 z4Var, java.util.Map map) {
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, z4Var, new org.json.JSONObject(map).toString(), null, 4, null);
    }

    public final void d(ml2.c1 c1Var, java.util.Map map) {
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.j5((zy2.zb) c17, c1Var.f408862d, new org.json.JSONObject(map).toString(), null, 4, null);
    }

    public final void e(int i17, java.lang.String str) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Map l17 = kz5.c1.l(new jz5.l("type", java.lang.String.valueOf(i17)));
        if (i17 == 1 && str != null) {
            l17.put("pos", str);
        }
        if (i17 == 7 || i17 == 8) {
            long j17 = f499417b;
            l17.put("duration", java.lang.String.valueOf(j17 > 0 ? (int) ((currentTimeMillis - j17) / 1000) : 0));
            f499417b = currentTimeMillis;
        }
        c(ml2.z4.f409929z2, l17);
    }
}
