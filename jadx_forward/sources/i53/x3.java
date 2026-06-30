package i53;

@j95.b
/* loaded from: classes8.dex */
public class x3 extends i95.w implements m33.v1 {
    public static void wi(android.content.Context context, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z17, java.lang.String str6, int i18, android.os.Bundle bundle, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameVideoEditorLauncher", "goToEditor, from[%d], businessType[%s], appid[%s], videoPath[%s], videoUrl[%s], needEdit[%b], gameInfo[%s]", java.lang.Integer.valueOf(i17), str, str2, str3, str4, java.lang.Boolean.valueOf(z17), str6);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("from", i17);
        intent.putExtra("business_type", str);
        intent.putExtra("appid", str2);
        intent.putExtra("video_path", str3);
        intent.putExtra("video_url", str4);
        intent.putExtra("thumb_url", str5);
        intent.putExtra("need_edit", z17);
        intent.putExtra("game_info", str6);
        intent.putExtra("ext_data", bundle);
        intent.putExtra("game_haowan_source_scene_id", i19);
        android.content.Context context2 = context == null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : context;
        boolean z18 = false;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) || !com.p314xaae8f345.mm.vfs.w6.j(str3)) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Haowan.GameVideoEditorLauncher", "videoPath and videoUrl is invalid");
                if (i17 == 3) {
                    ((kt.s0) ((lt.r0) i95.n0.c(lt.r0.class))).Ai(str, "videoPath and videoUrl is invalid", str2, -3, "videoPath and videoUrl is invalid");
                    return;
                }
                return;
            }
            if (z17) {
                z18 = true;
            }
        }
        if (z18) {
            if (context2 instanceof android.app.Activity) {
                j45.l.n(context2, "game", ".media.GameVideoDownloadUI", intent, i18);
                return;
            } else {
                j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "game", ".media.GameVideoDownloadUI", intent, null);
                return;
            }
        }
        if (context2 instanceof android.app.Activity) {
            j45.l.n(context2, "game", ".media.GameVideoEditorProxyUI", intent, i18);
        } else {
            j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "game", ".media.GameVideoEditorProxyUI", intent, null);
        }
    }

    public void Ai(android.content.Context context, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18, android.os.Bundle bundle, int i19) {
        wi(context, i17, null, str, str2, str3, str4, true, null, i18, bundle, i19);
    }

    public void Bi(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, android.os.Bundle bundle) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("appName", str2);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Haowan.GameVideoEditorLauncher", e17, "hy: put appname failed!", new java.lang.Object[0]);
        }
        wi(context, 2, null, str, str3, null, null, true, jSONObject.toString(), i17, bundle, 30);
    }
}
