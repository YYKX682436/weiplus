package bk4;

/* loaded from: classes11.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final bk4.e1 f21460a = new bk4.e1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.regex.Pattern f21461b;

    static {
        java.lang.String str = "#([^\\n\\s\\t#@\\,，\\.。]{1,32})";
        if (bi4.v1.g()) {
            str = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_text_state_topic_separator_list_and, "#([^\\n\\s\\t#@\\,，\\.。]{1,32})", true);
        }
        f21461b = java.util.regex.Pattern.compile(str);
    }

    public final java.lang.String a(int i17) {
        return i17 == com.tencent.mm.R.raw.text_state_default_image_1_filled_colorful ? "text_state_default_image_1" : i17 == com.tencent.mm.R.raw.text_state_default_image_2_filled_colorful ? "text_state_default_image_2" : i17 == com.tencent.mm.R.raw.text_state_default_image_3_filled_colorful ? "text_state_default_image_3" : i17 == com.tencent.mm.R.raw.text_state_default_image_4_filled_colorful ? "text_state_default_image_4" : i17 == com.tencent.mm.R.raw.text_state_default_image_5_filled_colorful ? "text_state_default_image_5" : i17 == com.tencent.mm.R.raw.text_state_default_image_6_filled_colorful ? "text_state_default_image_6" : i17 == com.tencent.mm.R.raw.text_state_default_image_7_filled_colorful ? "text_state_default_image_7" : i17 == com.tencent.mm.R.raw.text_state_default_image_8_filled_colorful ? "text_state_default_image_8" : i17 == com.tencent.mm.R.raw.text_state_default_image_9_filled_colorful ? "text_state_default_image_9" : i17 == com.tencent.mm.R.raw.text_state_default_image_10_filled_colorful ? "text_state_default_image_10" : (i17 != com.tencent.mm.R.raw.text_state_default_image_11_filled_colorful && i17 == com.tencent.mm.R.raw.text_state_default_image_12_filled_colorful) ? "text_state_default_image_12" : "text_state_default_image_11";
    }

    public final int b(java.lang.String str) {
        if (str == null) {
            return com.tencent.mm.R.raw.text_state_default_image_11_filled_colorful;
        }
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -1083859711:
                return !str.equals("text_state_default_image_10") ? com.tencent.mm.R.raw.text_state_default_image_11_filled_colorful : com.tencent.mm.R.raw.text_state_default_image_10_filled_colorful;
            case -1083859710:
                str.equals("text_state_default_image_11");
                return com.tencent.mm.R.raw.text_state_default_image_11_filled_colorful;
            case -1083859709:
                return !str.equals("text_state_default_image_12") ? com.tencent.mm.R.raw.text_state_default_image_11_filled_colorful : com.tencent.mm.R.raw.text_state_default_image_12_filled_colorful;
            default:
                switch (hashCode) {
                    case 1073415439:
                        return !str.equals("text_state_default_image_1") ? com.tencent.mm.R.raw.text_state_default_image_11_filled_colorful : com.tencent.mm.R.raw.text_state_default_image_1_filled_colorful;
                    case 1073415440:
                        return !str.equals("text_state_default_image_2") ? com.tencent.mm.R.raw.text_state_default_image_11_filled_colorful : com.tencent.mm.R.raw.text_state_default_image_2_filled_colorful;
                    case 1073415441:
                        return !str.equals("text_state_default_image_3") ? com.tencent.mm.R.raw.text_state_default_image_11_filled_colorful : com.tencent.mm.R.raw.text_state_default_image_3_filled_colorful;
                    case 1073415442:
                        return !str.equals("text_state_default_image_4") ? com.tencent.mm.R.raw.text_state_default_image_11_filled_colorful : com.tencent.mm.R.raw.text_state_default_image_4_filled_colorful;
                    case 1073415443:
                        return !str.equals("text_state_default_image_5") ? com.tencent.mm.R.raw.text_state_default_image_11_filled_colorful : com.tencent.mm.R.raw.text_state_default_image_5_filled_colorful;
                    case 1073415444:
                        return !str.equals("text_state_default_image_6") ? com.tencent.mm.R.raw.text_state_default_image_11_filled_colorful : com.tencent.mm.R.raw.text_state_default_image_6_filled_colorful;
                    case 1073415445:
                        return !str.equals("text_state_default_image_7") ? com.tencent.mm.R.raw.text_state_default_image_11_filled_colorful : com.tencent.mm.R.raw.text_state_default_image_7_filled_colorful;
                    case 1073415446:
                        return !str.equals("text_state_default_image_8") ? com.tencent.mm.R.raw.text_state_default_image_11_filled_colorful : com.tencent.mm.R.raw.text_state_default_image_8_filled_colorful;
                    case 1073415447:
                        return !str.equals("text_state_default_image_9") ? com.tencent.mm.R.raw.text_state_default_image_11_filled_colorful : com.tencent.mm.R.raw.text_state_default_image_9_filled_colorful;
                    default:
                        return com.tencent.mm.R.raw.text_state_default_image_11_filled_colorful;
                }
        }
    }

    public final int c() {
        int e17 = e();
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusPostUtil", "getDefaultEditBackground :" + e17);
        switch (e17) {
            case 1:
                return com.tencent.mm.R.raw.text_state_default_image_1_filled_colorful;
            case 2:
                return com.tencent.mm.R.raw.text_state_default_image_2_filled_colorful;
            case 3:
                return com.tencent.mm.R.raw.text_state_default_image_3_filled_colorful;
            case 4:
                return com.tencent.mm.R.raw.text_state_default_image_4_filled_colorful;
            case 5:
                return com.tencent.mm.R.raw.text_state_default_image_5_filled_colorful;
            case 6:
                return com.tencent.mm.R.raw.text_state_default_image_6_filled_colorful;
            case 7:
                return com.tencent.mm.R.raw.text_state_default_image_7_filled_colorful;
            case 8:
                return com.tencent.mm.R.raw.text_state_default_image_8_filled_colorful;
            case 9:
                return com.tencent.mm.R.raw.text_state_default_image_9_filled_colorful;
            case 10:
                return com.tencent.mm.R.raw.text_state_default_image_10_filled_colorful;
            case 11:
            default:
                return com.tencent.mm.R.raw.text_state_default_image_11_filled_colorful;
            case 12:
                return com.tencent.mm.R.raw.text_state_default_image_12_filled_colorful;
        }
    }

    public final java.lang.String d() {
        switch (e()) {
            case 1:
                return "text_state_default_image_1";
            case 2:
                return "text_state_default_image_2";
            case 3:
                return "text_state_default_image_3";
            case 4:
                return "text_state_default_image_4";
            case 5:
                return "text_state_default_image_5";
            case 6:
                return "text_state_default_image_6";
            case 7:
                return "text_state_default_image_7";
            case 8:
                return "text_state_default_image_8";
            case 9:
                return "text_state_default_image_9";
            case 10:
                return "text_state_default_image_10";
            case 11:
            default:
                return "text_state_default_image_11";
            case 12:
                return "text_state_default_image_12";
        }
    }

    public final int e() {
        return (((int) (java.lang.System.currentTimeMillis() % 12)) + new java.util.Random(gm0.j1.b().h()).nextInt(12)) % 12;
    }

    public final long f(long j17) {
        di4.i.f232782a.getClass();
        return (j17 & 16) != 0 ? j17 ^ 16 : j17;
    }
}
