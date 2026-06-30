package com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1;

/* loaded from: classes10.dex */
public abstract class e {
    public static java.lang.String a(java.lang.String str) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        return str.concat(".soundmp4");
    }

    public static java.lang.String b() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(512);
        android.util.StringBuilderPrinter stringBuilderPrinter = new android.util.StringBuilderPrinter(sb6);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        stringBuilderPrinter.println("#accinfo.revision=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
        stringBuilderPrinter.println("#accinfo.build=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274640c + ":" + com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274639b + ":" + com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273972b);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("#accinfo.env=");
        sb7.append(z65.c.f551988a ? "f" : "b");
        sb7.append(":");
        sb7.append(java.lang.Thread.currentThread().getName());
        sb7.append(":");
        sb7.append(z65.c.f551989b);
        stringBuilderPrinter.println(sb7.toString());
        stringBuilderPrinter.println("#aacinfo.device_brand=" + o45.wf.f424557b);
        stringBuilderPrinter.println("#aacinfo.device_model=" + o45.wf.f424558c);
        stringBuilderPrinter.println("#aacinfo.os_type=" + wo.q.f529317e);
        stringBuilderPrinter.println("#aacinfo.os_name=" + o45.wf.f424560e);
        stringBuilderPrinter.println("#aacinfo.os_version=" + wo.q.f529318f);
        stringBuilderPrinter.println("#aacinfo.device_name=" + o45.wf.f424559d);
        try {
            java.lang.String absolutePath = android.os.Environment.getDataDirectory().getAbsolutePath();
            android.os.StatFs statFs = new android.os.StatFs(absolutePath);
            android.os.StatFs statFs2 = new android.os.StatFs(lp0.b.e0());
            str = java.lang.String.format("%dMB %s:%d:%d:%d %s:%d:%d:%d", java.lang.Integer.valueOf(((android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getMemoryClass()), absolutePath, java.lang.Integer.valueOf(statFs.getBlockSize()), java.lang.Integer.valueOf(statFs.getBlockCount()), java.lang.Integer.valueOf(statFs.getAvailableBlocks()), lp0.b.e0(), java.lang.Integer.valueOf(statFs2.getBlockSize()), java.lang.Integer.valueOf(statFs2.getBlockCount()), java.lang.Integer.valueOf(statFs2.getAvailableBlocks()));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SightUtil", "check data size failed :%s", e17.getMessage());
            str = "";
        }
        stringBuilderPrinter.println("#accinfo.data=" + str);
        java.util.Date date = new java.util.Date();
        stringBuilderPrinter.println("#accinfo.crashTime=" + new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", java.util.Locale.getDefault()).format(date));
        stringBuilderPrinter.println(com.p314xaae8f345.mm.app.C5000x71a2fa35.f134767a);
        return sb6.toString();
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b c(java.lang.String str) {
        return d(str, true);
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d(java.lang.String str, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !com.p314xaae8f345.mm.vfs.w6.j(str)) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b bVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69183xa23d6ecc(com.p314xaae8f345.mm.vfs.w6.i(str, false), z17));
            bVar.f243915a = (int) jSONObject.getDouble("videoDuration");
            bVar.f243917c = jSONObject.getInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15530xe0ce1e4b);
            bVar.f243918d = jSONObject.getInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15529x1f26b122);
            bVar.f243919e = (int) jSONObject.getDouble("videoFPS");
            bVar.f243916b = jSONObject.getInt("videoBitrate");
            bVar.f243921g = jSONObject.getInt("audioBitrate");
            bVar.f243920f = jSONObject.getInt("audioChannel");
            bVar.f243923i = jSONObject.getInt("useABA");
            bVar.f243924j = jSONObject.getInt("useMinMaxQP");
            bVar.f243925k = jSONObject.getInt("bitrateAdaptiveUp");
            bVar.f243922h = jSONObject.getInt("aacSampleRate");
            bVar.f243926l = jSONObject.optInt("pixelFormat", -1);
            bVar.f243927m = jSONObject.getInt("hasH264") == 1;
            bVar.f243928n = jSONObject.optInt(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37665xf880c7f2, -1);
            bVar.f243929o = jSONObject.optString("format_name", "");
            bVar.f243930p = jSONObject.optString("format_long_name", "");
            bVar.f243932r = jSONObject.optString("audioType", "");
            bVar.f243931q = jSONObject.optString("videoType", "");
            bVar.f243934t = jSONObject.optString("codec_tag_name", "");
            bVar.f243933s = jSONObject.optString("audio_codec_tag_name", "");
            bVar.f243937w = jSONObject.optInt("hasAudioTrack", 0) == 1;
            bVar.f243938x = jSONObject.optInt("hasVideoTrack", 0) == 1;
            bVar.f243936v = jSONObject.optString("codec_name", "");
            bVar.f243935u = jSONObject.optString("audio_codec_name", "");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SightUtil", "get media info error %s", e17.toString());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightUtil", "get media %s", bVar);
        return bVar;
    }

    public static java.lang.String e(java.lang.String str) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append("extInfo: \n" + f(str, new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f(), new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f(), new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f(), new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f(), new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f()));
        stringBuffer.append("size: " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(com.p314xaae8f345.mm.vfs.w6.k(str)) + ":" + str + "\n");
        java.lang.String m69177x89f0baba = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69177x89f0baba(str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m69177x89f0baba)) {
            stringBuffer.append(m69177x89f0baba);
        }
        stringBuffer.append("isH265:");
        stringBuffer.append(t21.u2.b(str));
        return stringBuffer.toString();
    }

    public static java.lang.String f(java.lang.String str, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f3, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f4, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f5) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        try {
            java.lang.String m69182xa23d6ecc = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69182xa23d6ecc(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightUtil", "get simple mp4 info %s", m69182xa23d6ecc);
            org.json.JSONObject jSONObject = new org.json.JSONObject(m69182xa23d6ecc);
            if (c19767x257d7f != null) {
                c19767x257d7f.f38864x6ac9171 = (int) jSONObject.getDouble("videoDuration");
            }
            if (c19767x257d7f2 != null) {
                c19767x257d7f2.f38864x6ac9171 = jSONObject.getInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15530xe0ce1e4b);
            }
            if (c19767x257d7f3 != null) {
                c19767x257d7f3.f38864x6ac9171 = jSONObject.getInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15529x1f26b122);
            }
            if (c19767x257d7f4 != null) {
                c19767x257d7f4.f38864x6ac9171 = (int) jSONObject.getDouble("videoFPS");
            }
            if (c19767x257d7f5 != null) {
                c19767x257d7f5.f38864x6ac9171 = jSONObject.getInt("videoBitrate");
            }
            if (c19767x257d7f5 != null && c19767x257d7f != null && c19767x257d7f2 != null && c19767x257d7f3 != null && c19767x257d7f4 != null) {
                stringBuffer.append("videoBitrate: ");
                stringBuffer.append(c19767x257d7f5.f38864x6ac9171);
                stringBuffer.append("\n");
                stringBuffer.append("videoWidth,videoHeight: ");
                stringBuffer.append(c19767x257d7f2.f38864x6ac9171);
                stringBuffer.append("*");
                stringBuffer.append(c19767x257d7f3.f38864x6ac9171);
                stringBuffer.append(" ");
                stringBuffer.append(java.lang.String.format("%.4f", java.lang.Double.valueOf((c19767x257d7f2.f38864x6ac9171 * 1.0d) / c19767x257d7f3.f38864x6ac9171)));
                stringBuffer.append("\n");
                stringBuffer.append("videoDuration: ");
                stringBuffer.append(c19767x257d7f.f38864x6ac9171);
                stringBuffer.append("\n");
                stringBuffer.append("videoFPS: ");
                stringBuffer.append(c19767x257d7f4.f38864x6ac9171);
                stringBuffer.append("\n");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SightUtil", e17, "get media info error", new java.lang.Object[0]);
        }
        return stringBuffer.toString();
    }

    public static org.json.JSONObject g(java.lang.String str) {
        try {
            return new org.json.JSONObject(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69189x92967934(str));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SightUtil", e17, "getVideoMetaData error:%s", e17.getMessage());
            return null;
        }
    }
}
