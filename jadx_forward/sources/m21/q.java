package m21;

/* loaded from: classes4.dex */
public class q implements m21.u {

    /* renamed from: a, reason: collision with root package name */
    public r45.ee f404531a = new r45.ee();

    public static boolean b(android.content.Context context, r45.ee eeVar, android.graphics.Rect rect) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMpVideoShareObject", "onClick %s/%s", eeVar.f454881p, eeVar.f454874f);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("show_search_chat_content_result", false);
        intent.putExtra("img_gallery_msg_id", 0);
        intent.putExtra("img_gallery_talker", eeVar.f454881p);
        intent.putExtra("img_gallery_chatroom_name", false);
        if (rect != null) {
            intent.putExtra("img_gallery_width", rect.right - rect.left).putExtra("img_gallery_height", rect.bottom - rect.top).putExtra("img_gallery_left", rect.left).putExtra("img_gallery_top", rect.top);
        }
        intent.putExtra("img_gallery_is_mp_video_without_msg", true);
        intent.putExtra("img_gallery_mp_video_click_from", 1);
        intent.putExtra("img_gallery_path", com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(eeVar.f454873e));
        intent.putExtra("show_enter_grid", false);
        intent.putExtra("KOpenArticleSceneFromScene", 2);
        try {
            intent.putExtra("img_gallery_mp_share_video_info", eeVar.mo14344x5f01b1f6());
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsMpVideoShareObject", "onClick toByteArray ex %s", e17.getMessage());
        }
        j45.l.u(context, "com.tencent.mm.ui.chatting.gallery.ImageGalleryUI", intent, null);
        ((android.app.Activity) context).overridePendingTransition(0, 0);
        return true;
    }

    public static r45.ee c(java.lang.String str, java.util.Map map) {
        r45.ee eeVar = new r45.ee();
        try {
            java.lang.String str2 = str + ".mmbrandmpvideo";
            if (!map.isEmpty()) {
                if (map.containsKey(str2 + ".videoUrl")) {
                    java.lang.String str3 = (java.lang.String) map.get(str2 + ".mpUrl");
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    java.lang.String str4 = "";
                    if (str3 == null) {
                        str3 = "";
                    }
                    eeVar.f454872d = str3;
                    java.lang.String str5 = (java.lang.String) map.get(str2 + ".videoUrl");
                    if (str5 == null) {
                        str5 = "";
                    }
                    eeVar.f454873e = str5;
                    java.lang.String str6 = (java.lang.String) map.get(str2 + ".url");
                    if (str6 == null) {
                        str6 = "";
                    }
                    eeVar.f454880o = str6;
                    java.lang.String str7 = (java.lang.String) map.get(str2 + ".title");
                    if (str7 == null) {
                        str7 = "";
                    }
                    eeVar.f454875g = str7;
                    java.lang.String str8 = (java.lang.String) map.get(str2 + ".videoVid");
                    if (str8 == null) {
                        str8 = "";
                    }
                    eeVar.f454874f = str8;
                    java.lang.String str9 = (java.lang.String) map.get(str2 + ".thumbUrl");
                    if (str9 == null) {
                        str9 = "";
                    }
                    eeVar.f454876h = str9;
                    java.lang.String str10 = (java.lang.String) map.get(str2 + ".bizUsrName");
                    if (str10 == null) {
                        str10 = "";
                    }
                    eeVar.f454881p = str10;
                    java.lang.String str11 = (java.lang.String) map.get(str2 + ".bizNickName");
                    if (str11 != null) {
                        str4 = str11;
                    }
                    eeVar.f454882q = str4;
                    eeVar.f454877i = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B1((java.lang.String) map.get(str2 + ".videoDuration"));
                    eeVar.f454878m = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B1((java.lang.String) map.get(str2 + ".thumbWidth"));
                    eeVar.f454879n = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B1((java.lang.String) map.get(str2 + ".thumbHeight"));
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsMpVideoShareObject", "parse error %s", e17.getMessage());
        }
        return eeVar;
    }

    @Override // m21.u
    public java.lang.String a() {
        r45.ee eeVar = this.f404531a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (eeVar != null) {
            try {
                sb6.append("<mmbrandmpvideo>");
                sb6.append("<mpUrl>");
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(eeVar.f454872d));
                sb6.append("</mpUrl>");
                sb6.append("<thumbUrl>");
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(eeVar.f454876h));
                sb6.append("</thumbUrl>");
                sb6.append("<videoVid>");
                sb6.append(eeVar.f454874f);
                sb6.append("</videoVid>");
                sb6.append("<bizUsrName>");
                sb6.append(eeVar.f454881p);
                sb6.append("</bizUsrName>");
                sb6.append("<bizNickName>");
                sb6.append(eeVar.f454882q);
                sb6.append("</bizNickName>");
                sb6.append("<videoUrl>");
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(eeVar.f454873e));
                sb6.append("</videoUrl>");
                sb6.append("<url>");
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(eeVar.f454880o));
                sb6.append("</url>");
                sb6.append("<title>");
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(eeVar.f454875g));
                sb6.append("</title>");
                sb6.append("<videoDuration>");
                sb6.append(eeVar.f454877i);
                sb6.append("</videoDuration>");
                sb6.append("<thumbWidth>");
                sb6.append(eeVar.f454878m);
                sb6.append("</thumbWidth>");
                sb6.append("<thumbHeight>");
                sb6.append(eeVar.f454879n);
                sb6.append("</thumbHeight>");
                sb6.append("</mmbrandmpvideo>");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsMpVideoShareObject", "make content error %s", e17.getMessage());
            }
        }
        return sb6.toString();
    }
}
