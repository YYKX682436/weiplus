package bk4;

/* loaded from: classes11.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final bk4.e1 f102993a = new bk4.e1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.regex.Pattern f102994b;

    static {
        java.lang.String str = "#([^\\n\\s\\t#@\\,，\\.。]{1,32})";
        if (bi4.v1.g()) {
            str = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_text_state_topic_separator_list_and, "#([^\\n\\s\\t#@\\,，\\.。]{1,32})", true);
        }
        f102994b = java.util.regex.Pattern.compile(str);
    }

    public final java.lang.String a(int i17) {
        return i17 == com.p314xaae8f345.mm.R.raw.f81176x4d7ce47 ? "text_state_default_image_1" : i17 == com.p314xaae8f345.mm.R.raw.f81177x5581ac48 ? "text_state_default_image_2" : i17 == com.p314xaae8f345.mm.R.raw.f81178xa62b8a49 ? "text_state_default_image_3" : i17 == com.p314xaae8f345.mm.R.raw.f81179xf6d5684a ? "text_state_default_image_4" : i17 == com.p314xaae8f345.mm.R.raw.f81180x477f464b ? "text_state_default_image_5" : i17 == com.p314xaae8f345.mm.R.raw.f81181x9829244c ? "text_state_default_image_6" : i17 == com.p314xaae8f345.mm.R.raw.f81182xe8d3024d ? "text_state_default_image_7" : i17 == com.p314xaae8f345.mm.R.raw.f81183x397ce04e ? "text_state_default_image_8" : i17 == com.p314xaae8f345.mm.R.raw.f81184x8a26be4f ? "text_state_default_image_9" : i17 == com.p314xaae8f345.mm.R.raw.f81173xe2c84239 ? "text_state_default_image_10" : (i17 != com.p314xaae8f345.mm.R.raw.f81174x3372203a && i17 == com.p314xaae8f345.mm.R.raw.f81175x841bfe3b) ? "text_state_default_image_12" : "text_state_default_image_11";
    }

    public final int b(java.lang.String str) {
        if (str == null) {
            return com.p314xaae8f345.mm.R.raw.f81174x3372203a;
        }
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -1083859711:
                return !str.equals("text_state_default_image_10") ? com.p314xaae8f345.mm.R.raw.f81174x3372203a : com.p314xaae8f345.mm.R.raw.f81173xe2c84239;
            case -1083859710:
                str.equals("text_state_default_image_11");
                return com.p314xaae8f345.mm.R.raw.f81174x3372203a;
            case -1083859709:
                return !str.equals("text_state_default_image_12") ? com.p314xaae8f345.mm.R.raw.f81174x3372203a : com.p314xaae8f345.mm.R.raw.f81175x841bfe3b;
            default:
                switch (hashCode) {
                    case 1073415439:
                        return !str.equals("text_state_default_image_1") ? com.p314xaae8f345.mm.R.raw.f81174x3372203a : com.p314xaae8f345.mm.R.raw.f81176x4d7ce47;
                    case 1073415440:
                        return !str.equals("text_state_default_image_2") ? com.p314xaae8f345.mm.R.raw.f81174x3372203a : com.p314xaae8f345.mm.R.raw.f81177x5581ac48;
                    case 1073415441:
                        return !str.equals("text_state_default_image_3") ? com.p314xaae8f345.mm.R.raw.f81174x3372203a : com.p314xaae8f345.mm.R.raw.f81178xa62b8a49;
                    case 1073415442:
                        return !str.equals("text_state_default_image_4") ? com.p314xaae8f345.mm.R.raw.f81174x3372203a : com.p314xaae8f345.mm.R.raw.f81179xf6d5684a;
                    case 1073415443:
                        return !str.equals("text_state_default_image_5") ? com.p314xaae8f345.mm.R.raw.f81174x3372203a : com.p314xaae8f345.mm.R.raw.f81180x477f464b;
                    case 1073415444:
                        return !str.equals("text_state_default_image_6") ? com.p314xaae8f345.mm.R.raw.f81174x3372203a : com.p314xaae8f345.mm.R.raw.f81181x9829244c;
                    case 1073415445:
                        return !str.equals("text_state_default_image_7") ? com.p314xaae8f345.mm.R.raw.f81174x3372203a : com.p314xaae8f345.mm.R.raw.f81182xe8d3024d;
                    case 1073415446:
                        return !str.equals("text_state_default_image_8") ? com.p314xaae8f345.mm.R.raw.f81174x3372203a : com.p314xaae8f345.mm.R.raw.f81183x397ce04e;
                    case 1073415447:
                        return !str.equals("text_state_default_image_9") ? com.p314xaae8f345.mm.R.raw.f81174x3372203a : com.p314xaae8f345.mm.R.raw.f81184x8a26be4f;
                    default:
                        return com.p314xaae8f345.mm.R.raw.f81174x3372203a;
                }
        }
    }

    public final int c() {
        int e17 = e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusPostUtil", "getDefaultEditBackground :" + e17);
        switch (e17) {
            case 1:
                return com.p314xaae8f345.mm.R.raw.f81176x4d7ce47;
            case 2:
                return com.p314xaae8f345.mm.R.raw.f81177x5581ac48;
            case 3:
                return com.p314xaae8f345.mm.R.raw.f81178xa62b8a49;
            case 4:
                return com.p314xaae8f345.mm.R.raw.f81179xf6d5684a;
            case 5:
                return com.p314xaae8f345.mm.R.raw.f81180x477f464b;
            case 6:
                return com.p314xaae8f345.mm.R.raw.f81181x9829244c;
            case 7:
                return com.p314xaae8f345.mm.R.raw.f81182xe8d3024d;
            case 8:
                return com.p314xaae8f345.mm.R.raw.f81183x397ce04e;
            case 9:
                return com.p314xaae8f345.mm.R.raw.f81184x8a26be4f;
            case 10:
                return com.p314xaae8f345.mm.R.raw.f81173xe2c84239;
            case 11:
            default:
                return com.p314xaae8f345.mm.R.raw.f81174x3372203a;
            case 12:
                return com.p314xaae8f345.mm.R.raw.f81175x841bfe3b;
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
        di4.i.f314315a.getClass();
        return (j17 & 16) != 0 ? j17 ^ 16 : j17;
    }
}
