package com.tencent.mm.plugin.appbrand.report;

/* loaded from: classes7.dex */
public abstract class z0 {
    public static int a(int i17, android.os.Bundle bundle) {
        if (bundle == null || !c(i17)) {
            return 0;
        }
        return bundle.getInt("stat_scene");
    }

    public static java.lang.String b(int i17, android.os.Bundle bundle) {
        if (bundle != null && c(i17)) {
            switch (bundle.getInt("stat_scene")) {
                case 1:
                    return bundle.getString("stat_send_msg_user");
                case 2:
                    return bundle.getString("stat_chat_talker_username") + ":" + bundle.getString("stat_send_msg_user");
                case 3:
                    return bundle.getString("stat_msg_id") + ":" + bundle.getString("stat_send_msg_user");
                case 4:
                    return fp.s0.a(bundle.getString("stat_url"));
                case 6:
                    java.lang.String string = bundle.getString("stat_app_id");
                    java.lang.String string2 = bundle.getString("stat_url");
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(string);
                    sb6.append(":");
                    sb6.append(fp.s0.a(string2 != null ? string2 : ""));
                    return sb6.toString();
                case 7:
                    return bundle.getString("stat_chat_talker_username");
                case 8:
                    return "search:" + bundle.getString("stat_search_id");
                case 9:
                    return bundle.getString("stat_chat_talker_username") + ":" + bundle.getString("stat_send_msg_user");
            }
        }
        return "";
    }

    public static boolean c(int i17) {
        if (i17 == 1007 || i17 == 1008 || i17 == 1012 || i17 == 1018 || i17 == 1024 || i17 == 1031 || i17 == 1036 || i17 == 1044 || i17 == 1048 || i17 == 1088 || i17 == 1346) {
            return true;
        }
        switch (i17) {
            case 1124:
            case 1125:
            case 1126:
                return true;
            default:
                return false;
        }
    }
}
