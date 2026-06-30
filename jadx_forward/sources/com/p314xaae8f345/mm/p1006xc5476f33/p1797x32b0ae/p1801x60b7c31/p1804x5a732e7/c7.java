package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes12.dex */
public class c7 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f225060g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f225061h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f225062i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f225063m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f225064n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f225065o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f225066p = "";

    /* renamed from: q, reason: collision with root package name */
    public org.json.JSONObject f225067q = null;

    /* renamed from: r, reason: collision with root package name */
    public org.json.JSONObject f225068r = null;

    public java.lang.String A(java.lang.String str) {
        return str.isEmpty() ? "" : ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).wi(str).f264269e;
    }

    public void B(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.String str5;
        boolean z17;
        java.lang.String gifPath = str;
        this.f225060g = gifPath;
        this.f225061h = str2;
        this.f225062i = str4;
        this.f225063m = str3;
        str5 = "";
        if (str4.equals("image")) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.f(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiteAppJsApiSendFileMessage", "sendFileMessage, %s is not image", str);
                this.f224976f.a("sendFileMessage fail, not image file");
                return;
            }
            com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = null;
            android.app.Activity activity = c() instanceof android.app.Activity ? (android.app.Activity) c() : null;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiSendFileMessage", "sendFileMessage, gif");
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.i8 i8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.i8();
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.z6 z6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.z6(this, activity);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gifPath, "gifPath");
                if (!((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).Ri()) {
                    interfaceC4987x84e327cb = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).Ni(com.p314xaae8f345.mm.vfs.w6.p(str));
                    if (interfaceC4987x84e327cb == null) {
                        interfaceC4987x84e327cb = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).Ni(((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).Ai(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, gifPath));
                    }
                }
                boolean z18 = (interfaceC4987x84e327cb == null ? 0L : com.p314xaae8f345.mm.vfs.w6.k(((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) interfaceC4987x84e327cb).N0())) > ((long) ip.c.a());
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                if (interfaceC4987x84e327cb != null) {
                    gifPath = ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) interfaceC4987x84e327cb).N0();
                }
                boolean z19 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(gifPath, options) != null && options.outHeight > ip.c.c()) || options.outWidth > ip.c.c();
                if (z18 || z19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppSendGifToConversation", "doShare, fail since gif illegal");
                    db5.e1.y(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bvm), "", activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573827fz1), new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.f8(z6Var));
                    return;
                }
                nf.g.a(activity).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.g8(i8Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.h8(z6Var)));
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Retr_File_Name", interfaceC4987x84e327cb != null ? ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) interfaceC4987x84e327cb).mo42933xb5885648() : "");
                intent.putExtra("Retr_Msg_Type", 5);
                intent.putExtra("Retr_MsgImgScene", 1);
                intent.putExtra("Retr_show_success_tips", false);
                intent.putExtra("content_type_forward_to_wework", 14);
                j45.l.v(activity, ".ui.transmit.MsgRetransmitUI", intent, i8Var.f225150a);
                return;
            }
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, gifPath);
        hashMap.put(dm.i4.f66867x2a5c95c7, str2);
        hashMap.put("type", str4);
        hashMap.put("thumbPath", str3);
        org.json.JSONObject jSONObject = this.f225068r;
        if (jSONObject != null) {
            try {
                jSONObject.put("appId", this.f224975e.f380558b);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiSendFileMessage", e17.getMessage());
            }
            hashMap.put("tailInfo", this.f225068r.toString());
        }
        org.json.JSONObject jSONObject2 = this.f225067q;
        if (jSONObject2 != null ? jSONObject2.optBoolean("isRecentForward", false) : false) {
            java.lang.String optString = this.f225067q.optString("content");
            int optInt = this.f225067q.optInt(ya.b.f77479x42930b2);
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
            java.util.ArrayList Ui = new com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m().Ui();
            for (int i17 = 0; !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(Ui) && i17 < Ui.size(); i17++) {
                java.lang.String str6 = ((o25.m2) Ui.get(i17)).f424093a;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(str6).equalsIgnoreCase(optString) && i17 == optInt) {
                    z17 = true;
                    str5 = str6;
                    break;
                }
            }
        }
        z17 = false;
        if (!(c() instanceof android.app.Activity)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiSendFileMessage", "sendfile after close activity");
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.setClass(c(), com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16239xc81f635b.class);
        intent2.putExtra("proxyui_action_code_key", 15);
        intent2.putExtra("send_file_message_params", hashMap);
        int i18 = m93.j.E + 1;
        m93.j.E = i18;
        m93.j.F.put(java.lang.Integer.valueOf(i18), this);
        intent2.putExtra("callback_id", m93.j.E);
        if (z17 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
            intent2.putExtra("Select_Conv_User", str5);
        }
        android.content.Context c17 = c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiSendFileMessage", "sendFile", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        c17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(c17, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiSendFileMessage", "sendFile", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void C(java.lang.String videoPath, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (!com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
            jd.c cVar = this.f224975e;
            java.lang.String zj6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).zj(cVar.f380558b, cVar.f380557a, str2);
            if (com.p314xaae8f345.mm.vfs.w6.j(zj6)) {
                str2 = zj6;
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && str2.startsWith("http")) {
                ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Ai(str2, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.a7(this, videoPath, str, str3));
                return;
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPath, "videoPath");
        if (str2 == null || str2.length() == 0) {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(videoPath.concat(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG));
            try {
                ((q90.i) ((r90.l) i95.n0.c(r90.l.class))).getClass();
                android.graphics.Bitmap p17 = ai3.d.p(videoPath);
                if (p17 != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(p17, 100, android.graphics.Bitmap.CompressFormat.PNG, r6Var.o(), true);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiteAppSendVideoMessage", "createThumbFile, fail since " + e17);
                r6Var = null;
            }
            str2 = r6Var != null ? r6Var.o() : null;
        }
        B(videoPath, str, str2, str3);
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f224976f.a("param is null");
            return;
        }
        this.f225066p = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.y2.f(str, "bundle", null);
        java.lang.String optString = jSONObject.optString("type");
        if (optString.equals("file")) {
            try {
                ra3.b0.f475022a.c(c(), str, this.f224975e.f380557a, jSONObject.getJSONArray("fileList"));
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, new org.json.JSONObject());
                jSONObject2.put("result", true);
                this.f224976f.c(jSONObject2, false);
                return;
            } catch (java.lang.Exception e17) {
                java.lang.String str2 = "sendFileMessage(type='file') failed\n" + e17.getMessage();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiSendFileMessage", str2);
                this.f224976f.a(str2);
                return;
            }
        }
        java.lang.String optString2 = jSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1);
        java.lang.String optString3 = jSONObject.optString(dm.i4.f66867x2a5c95c7);
        java.lang.String optString4 = jSONObject.optString("base64ImgStr");
        java.lang.String optString5 = jSONObject.optString("thumbPath");
        if (optString5 == null) {
            optString5 = "";
        }
        this.f225068r = jSONObject.optJSONObject("tailInfo");
        this.f225067q = jSONObject.optJSONObject("extra");
        if (android.text.TextUtils.isEmpty(optString2) && android.text.TextUtils.isEmpty(optString3) && android.text.TextUtils.isEmpty(optString4)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiSendFileMessage", "sendFileMessage fail, filePath is null");
            this.f224976f.a("sendFileMessage fail, filePath is null");
            return;
        }
        if (!optString.equals("image") && !optString.equals("video")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiSendFileMessage", "sendFileMessage fail, the file is not image or video");
            this.f224976f.a("sendFileMessage fail, the file is not image or video");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString4) || !optString.equals("image")) {
            if (android.text.TextUtils.isEmpty(optString2)) {
                optString2 = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).zj(str, this.f224975e.f380557a, optString3);
            } else if (((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Kj(optString2)) {
                optString2 = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).zj(str, this.f224975e.f380557a, optString2);
            } else if (optString.equals("image")) {
                if (!com.p314xaae8f345.mm.vfs.w6.j(optString2)) {
                    if (!optString2.startsWith("http")) {
                        this.f224976f.a("sendFileMessage fail, file not found");
                        return;
                    }
                    ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Ai(optString2, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.x6(this));
                    return;
                }
            } else if (optString.equals("video") && !com.p314xaae8f345.mm.vfs.w6.j(optString2)) {
                if (optString2.startsWith("http")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.d.a(str, optString2, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.y6(this, optString5, optString));
                    return;
                } else {
                    this.f224976f.a("sendFileMessage fail, file not found");
                    return;
                }
            }
            if (android.text.TextUtils.isEmpty(optString3)) {
                optString3 = A(optString2);
            }
            if (optString.equals("image")) {
                B(optString2, optString3, "", optString);
                return;
            } else {
                if (optString.equals("video")) {
                    C(optString2, optString3, optString5, optString);
                    return;
                }
                return;
            }
        }
        int indexOf = optString4.indexOf(";base64,");
        if (indexOf != -1) {
            optString4 = optString4.substring(indexOf + 8);
        }
        try {
            byte[] decode = android.util.Base64.decode(optString4, 2);
            int length = decode.length;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(length));
            arrayList.add(0);
            arrayList.add(decode);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiSendFileMessage", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
            yj0.a.e(obj, decodeByteArray, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiSendFileMessage", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
            if (decodeByteArray == null) {
                this.f224976f.a("error base64");
                return;
            }
            java.lang.String str3 = this.f225066p + java.lang.String.format("MMImage_%d_%d.jpg", java.lang.Long.valueOf(this.f224975e.f380561e), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            if (!ra3.h0.c(decodeByteArray, str3)) {
                this.f224976f.a("error base64, save fail");
                return;
            }
            ra3.h0.d(str3, decode);
            java.lang.String A = A(str3);
            this.f225064n = str3;
            B(str3, A, "", "image");
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiSendFileMessage", "error base64, decode failed %s", e18.getMessage());
            this.f224976f.a("error base64");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public void y(int i17, int i18, android.content.Intent intent) {
        int i19;
        android.app.Activity activity;
        java.lang.String str;
        boolean z17;
        boolean z18;
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiSendFileMessage", "onActivityResult: data null");
            this.f224976f.a("data is null");
            return;
        }
        if (this.f225064n.length() > 0) {
            ku5.u0 u0Var = ku5.t0.f394148d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.b7 b7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.b7(this);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(b7Var, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, false);
        }
        if (i18 != -1) {
            this.f224976f.a("cancel");
            return;
        }
        if (this.f225062i.equals("image")) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(dm.i4.f66867x2a5c95c7, this.f225061h);
            hashMap.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, this.f225060g);
            hashMap.put("err_msg", "sendFileMessage:ok");
            this.f224976f.b(hashMap);
            return;
        }
        if (this.f225062i.equals("video")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.p8 p8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.p8();
            android.app.Activity activity2 = (android.app.Activity) c();
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.o invokeCallback = this.f224976f;
            java.lang.String filePath = this.f225060g;
            java.lang.String thumbPath = this.f225063m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeCallback, "invokeCallback");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbPath, "thumbPath");
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.l8 l8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.l8(invokeCallback, thumbPath, p8Var);
            try {
                gp.d dVar = new gp.d();
                dVar.setDataSource(filePath);
                long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(dVar.extractMetadata(9), 0L);
                dVar.release();
                i19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V1(V);
            } catch (java.lang.Exception unused) {
                i19 = 0;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppSendVideoMessage", "parseVideoDurationS, duration: " + i19);
            if (i19 <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiteAppSendVideoMessage", "isVideoLegal2Share, durationS: " + i19);
                l8Var.mo149xb9724478(java.lang.Boolean.FALSE, null);
            } else {
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(filePath));
                java.lang.Long valueOf = r6Var.m() ? java.lang.Long.valueOf(r6Var.C()) : null;
                if (valueOf == null || 0 >= valueOf.longValue()) {
                    db5.e1.y(activity2, activity2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fje), "", activity2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573827fz1), new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.m8(l8Var));
                } else if (ip.c.l() < valueOf.longValue()) {
                    db5.e1.y(activity2, activity2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fjz), "", activity2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573827fz1), new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.n8(l8Var));
                } else {
                    l8Var.mo149xb9724478(java.lang.Boolean.TRUE, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.j8(i19));
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.o invokeCallback2 = this.f224976f;
            android.app.Activity activity3 = (android.app.Activity) c();
            java.lang.String filePath2 = this.f225060g;
            java.lang.String thumbPath2 = this.f225063m;
            java.lang.String localId = this.f225061h;
            java.lang.String tempThumbPath = this.f225065o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeCallback2, "invokeCallback");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity3, "activity");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath2, "filePath");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbPath2, "thumbPath");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localId, "localId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tempThumbPath, "tempThumbPath");
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            h0Var.f391656d = filePath2;
            if (filePath2.length() == 0) {
                q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
                jd.c cVar = invokeCallback2.f224973a;
                activity = activity3;
                str = "LiteAppSendVideoMessage";
                java.lang.String zj6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).zj(cVar.f380558b, cVar.f380557a, localId);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(zj6, "getFilePathByBothLocalId(...)");
                h0Var.f391656d = zj6;
            } else {
                activity = activity3;
                str = "LiteAppSendVideoMessage";
            }
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("SendMsgUsernames");
            if (stringArrayListExtra == null) {
                stringArrayListExtra = new java.util.ArrayList<>(0);
            }
            if (!stringArrayListExtra.isEmpty()) {
                p8Var.a((java.lang.String) h0Var.f391656d, tempThumbPath);
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, h0Var.f391656d);
                hashMap2.put(dm.i4.f66867x2a5c95c7, localId);
                hashMap2.put("err_msg", "sendFileMessage:ok");
                invokeCallback2.b(hashMap2);
                return;
            }
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            if (stringExtra == null || stringExtra.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "doShare, fail since selectedUsers is empty 1");
                invokeCallback2.a("sendFileMessage fail, selectedUsers is empty 1");
                p8Var.a((java.lang.String) h0Var.f391656d, tempThumbPath);
                return;
            }
            java.lang.String str2 = str;
            java.util.List<java.lang.String> O1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.O1(stringExtra, ",");
            if (O1 == null || O1.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "doShare, fail since selectedUsers is empty 2");
                invokeCallback2.a("sendFileMessage fail, selectedUsers is empty 2");
                p8Var.a((java.lang.String) h0Var.f391656d, tempThumbPath);
                return;
            }
            java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.j8 j8Var = p8Var.f225252a;
            if (j8Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mVideoInfo");
                throw null;
            }
            if (j8Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mVideoInfo");
                throw null;
            }
            int i27 = j8Var.f225160a;
            java.lang.String str3 = (java.lang.String) h0Var.f391656d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(O1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.o8 o8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.o8(p8Var, h0Var, tempThumbPath, localId, invokeCallback2);
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
            f0Var.f391649d = O1.size();
            if (stringExtra2 == null || stringExtra2.length() == 0) {
                z17 = true;
                z18 = true;
            } else {
                z17 = true;
                z18 = false;
            }
            boolean z19 = z17 ^ z18;
            for (java.lang.String str4 : O1) {
                ((dk5.s5) tg3.t1.a()).oj(activity, str4, str3, thumbPath2, 1, i27, false, false, "", "", null, "", new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.k8(str4, f0Var, o8Var));
                if (z19) {
                    ((dk5.s5) tg3.t1.a()).fj(str4, stringExtra2, c01.e2.C(str4), 0);
                }
            }
        }
    }
}
