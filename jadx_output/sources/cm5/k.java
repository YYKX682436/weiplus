package cm5;

/* loaded from: classes9.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.List f43440a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.storage.m8 f43441b;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        f43440a = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        f43441b = new cm5.f();
        arrayList.add(1075839025);
        arrayList.add(721420337);
        arrayList.add(318767153);
        arrayList2.add("offline_scan_result");
        arrayList2.add("follow_live");
        arrayList2.add("wechat_remind");
    }

    public static java.lang.String a(int i17, java.util.Map map, boolean z17) {
        if (map != null) {
            if (i17 == 1075839025) {
                java.lang.String str = (java.lang.String) map.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.finder_username");
                if (android.text.TextUtils.isEmpty(str)) {
                    return "follow_live";
                }
                return "follow_live" + str;
            }
            if (d(map, i17)) {
                return "wechat_remind";
            }
            if (i17 == 318767153 && !z17) {
                return (java.lang.String) map.get(".msg.fromusername");
            }
        }
        return "";
    }

    public static java.lang.String b(java.lang.String str, java.lang.String str2, android.content.Context context) {
        java.lang.String str3;
        java.lang.String str4 = null;
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str2, "msg", null);
        ((cm5.f) f43441b).getClass();
        if (str != null) {
            if (str.startsWith("follow_live") && d17 != null) {
                return (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.title.nickname");
            }
            if ("wechat_remind".equals(str)) {
                str4 = context.getString(com.tencent.mm.R.string.hy_);
            } else if ("offline_scan_result".equals(str)) {
                str4 = context.getString(com.tencent.mm.R.string.he7);
            }
            if (!android.text.TextUtils.isEmpty(str4)) {
                return str4;
            }
            if (d17 != null) {
                if (com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.template_ext.type"), 0) == 1) {
                    java.lang.String str5 = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.template_ext.app.display_name");
                    if (str5 != null) {
                        return str5;
                    }
                } else if (com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.template_header.show_icon_and_display_name"), 0) != 0 && (str3 = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_header.display_name")) != null) {
                    return str3;
                }
            }
        }
        return "";
    }

    public static java.util.Map c(com.tencent.mm.storage.f9 f9Var) {
        if (android.text.TextUtils.isEmpty(f9Var.j())) {
            return null;
        }
        return com.tencent.mm.sdk.platformtools.aa.d(f9Var.j(), "msg", null);
    }

    public static boolean d(java.util.Map map, int i17) {
        return i17 == 318767153 && map != null && com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.mmreader.category.item.template_op_type"), -1) == 2;
    }

    public static boolean e(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var != null) {
            if (((java.util.ArrayList) f43440a).contains(java.lang.Integer.valueOf(f9Var.getType()))) {
                return true;
            }
        }
        return false;
    }
}
