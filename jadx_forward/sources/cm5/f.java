package cm5;

/* loaded from: classes9.dex */
public class f implements com.p314xaae8f345.mm.p2621x8fb0427b.m8 {
    public java.lang.String a(java.util.Map map, int i17, android.content.Context context) {
        if (i17 == 721420337) {
            return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.he9).toString();
        }
        if (map == null) {
            return null;
        }
        java.lang.String str = i17 == 1075839025 ? ".msg.appmsg.extinfo.notifymsg.header" : null;
        if (i17 == 318767153) {
            java.lang.String str2 = (java.lang.String) map.get(".msg.fromusername");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
            str = ".msg.appmsg.mmreader.category.item.title";
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.S4(str2)) {
                java.lang.String str3 = (java.lang.String) map.get(".msg.appmsg.mmreader.category.item.title");
                return str3 == null ? "" : str3;
            }
            int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.mmreader.template_header.ignore_hide_title_and_time"), 0) == 0 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.mmreader.template_header.hide_title_and_time"), 0) : 0;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.mmreader.template_header.hide_title"), 0) == 0 && P == 0) {
                str = ".msg.appmsg.mmreader.template_header.title";
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.mmreader.category.item.template_op_type"), -1) == 2) {
                str = ".msg.appmsg.mmreader.template_detail.opitems.opitem.schedule_content";
            }
        }
        if (str == null) {
            return null;
        }
        java.lang.String str4 = (java.lang.String) map.get(str);
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return str4 == null ? "" : str4;
    }
}
