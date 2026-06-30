package t00;

/* loaded from: classes.dex */
public final class l2 implements t00.r0 {
    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f495853a;
        return t00.n.f495864l;
    }

    @Override // t00.r0
    public boolean b() {
        return true;
    }

    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        org.json.JSONObject optJSONObject = data.optJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        if (optJSONObject == null) {
            callback.a();
            return;
        }
        int optInt = optJSONObject.optInt("type", 1);
        if (optInt == 3) {
            java.lang.String optString = optJSONObject.optString("url");
            java.lang.String optString2 = optJSONObject.optString("thumbUrl");
            java.lang.String optString3 = optJSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Ksnsupload_link", optString);
            intent.putExtra("Ksnsupload_type", 1);
            intent.putExtra("Ksnsupload_title", optString3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
            if (r26.i0.y(optString2, "http://", false) || r26.i0.y(optString2, "https://", false)) {
                intent.putExtra("Ksnsupload_imgurl", optString2);
            }
            intent.putExtra("KSnsUploadDisableLinkClick", true);
            intent.putExtra("need_result", true);
            if (context instanceof android.app.Activity) {
                nf.g.a(context).f(new b30.q(8229, callback));
                j45.l.v(context, ".plugin.sns.ui.SnsUploadUI", intent, 8229);
                return;
            } else {
                j45.l.u(context, ".plugin.sns.ui.SnsUploadUI", intent, null);
                callback.b(null);
                return;
            }
        }
        if (optInt != 4) {
            android.content.Context context2 = context == null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : context;
            p3325xe03a0797.p3326xc267989b.l.d(context2 instanceof p012xc85e97e9.p093xedfae76a.y ? new com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a("MicroMsg.ShareTimelineEcsActionHandler", (p012xc85e97e9.p093xedfae76a.y) context2, 0, 4, null) : p3325xe03a0797.p3326xc267989b.i2.f392010d, null, null, new t00.k2(optJSONObject, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), false, 0, null), this, context, callback, jSONObject, null), 3, null);
            return;
        }
        java.lang.String optString4 = optJSONObject.optString("url");
        java.lang.String optString5 = optJSONObject.optString("thumbUrl");
        java.lang.String optString6 = optJSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        java.lang.String optString7 = optJSONObject.optString("ecsJumpInfoBase64");
        r45.k86 k86Var = new r45.k86();
        k86Var.f460027d = optString7;
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("sns_ecs_info", k86Var.mo14344x5f01b1f6());
        intent2.putExtra("Ksnsupload_link", optString4);
        intent2.putExtra("Ksnsupload_type", 46);
        intent2.putExtra("Ksnsupload_title", optString6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString5);
        if (r26.i0.y(optString5, "http://", false) || r26.i0.y(optString5, "https://", false)) {
            intent2.putExtra("Ksnsupload_imgurl", optString5);
        }
        intent2.putExtra("KSnsUploadDisableLinkClick", true);
        intent2.putExtra("need_result", true);
        if (context instanceof android.app.Activity) {
            nf.g.a(context).f(new b30.q(8229, callback));
            j45.l.v(context, ".plugin.sns.ui.SnsUploadUI", intent2, 8229);
        } else {
            j45.l.u(context, ".plugin.sns.ui.SnsUploadUI", intent2, null);
            callback.b(null);
        }
    }

    @Override // t00.r0
    public org.json.JSONObject f(int i17, android.content.Context context, org.json.JSONObject data, c00.q3 envHandler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(envHandler, "envHandler");
        org.json.JSONObject optJSONObject = data.optJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        if (optJSONObject == null) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String optString = optJSONObject.optString("imgPath");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            java.lang.String mo13731xbb4d21ce = envHandler.mo13731xbb4d21ce(optString);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareTimelineEcsActionHandler", "EcsActionHandler_shareTimeline imgPath:" + optString + ", imgLocalPath:" + mo13731xbb4d21ce);
            jSONObject.put("imgLocalPath", mo13731xbb4d21ce);
        }
        org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("imgPathList");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            int length = optJSONArray.length();
            for (int i18 = 0; i18 < length; i18++) {
                java.lang.String optString2 = optJSONArray.optString(i18);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                jSONArray.put(envHandler.mo13731xbb4d21ce(optString2));
            }
            jSONObject.put("imgLocalPathList", jSONArray);
        }
        java.lang.String optString3 = optJSONObject.optString("videoPath");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString3)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString3);
            java.lang.String mo13731xbb4d21ce2 = envHandler.mo13731xbb4d21ce(optString3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareTimelineEcsActionHandler", "EcsActionHandler_shareTimeline videoPath:" + optString3 + ", videoLocalPath:" + mo13731xbb4d21ce2);
            jSONObject.put("videoLocalPath", mo13731xbb4d21ce2);
        }
        java.lang.String optString4 = optJSONObject.optString("videoThumbPath");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString4)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString4);
            java.lang.String mo13731xbb4d21ce3 = envHandler.mo13731xbb4d21ce(optString4);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareTimelineEcsActionHandler", "EcsActionHandler_shareTimeline videoThumbPath:" + optString4 + ", imgLocalPath:" + mo13731xbb4d21ce3);
            jSONObject.put("videoThumbLocalPath", mo13731xbb4d21ce3);
        }
        return jSONObject;
    }

    @Override // t00.r0
    public boolean g() {
        return true;
    }
}
