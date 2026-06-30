package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

/* loaded from: classes8.dex */
public class n2 extends android.os.AsyncTask {

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f226389c = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fxu) + "/tencentMapTouch/app/download/wx_android_download_ico.png";

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f226390a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f226391b;

    public n2(android.content.Context context, android.view.View view) {
        this.f226390a = new java.lang.ref.WeakReference(context);
        this.f226391b = new java.lang.ref.WeakReference(view);
    }

    @Override // android.os.AsyncTask
    public java.lang.Object doInBackground(java.lang.Object[] objArr) {
        java.lang.String[] strArr = (java.lang.String[]) objArr;
        android.content.Context context = (android.content.Context) this.f226390a.get();
        if (context == null) {
            return "";
        }
        if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40088x550b09c5(context)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.l2(this, context));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TrackMapUI", "fail, network not ready");
            return "";
        }
        if (!fp.i.b()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.m2(this, context));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TrackMapUI", "fail, sdcard not ready");
            return "";
        }
        if (strArr.length != 1) {
            return "";
        }
        java.io.InputStream inputStream = null;
        try {
            try {
                inputStream = new java.net.URL(strArr[0]).openStream();
                byte[] bArr = new byte[1024];
                inputStream.read(bArr);
                java.lang.String str = new java.lang.String(bArr);
                try {
                    inputStream.close();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TrackMapUI", "download json, close input stream failure, msg: %s.", e17.getMessage());
                }
                return str;
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TrackMapUI", "download failure, msg: %s.", e18.getMessage());
                if (inputStream == null) {
                    return "";
                }
                try {
                    inputStream.close();
                    return "";
                } catch (java.lang.Exception e19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TrackMapUI", "download json, close input stream failure, msg: %s.", e19.getMessage());
                    return "";
                }
            }
        } catch (java.lang.Throwable th6) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.lang.Exception e27) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TrackMapUI", "download json, close input stream failure, msg: %s.", e27.getMessage());
                }
            }
            throw th6;
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        android.view.View view = (android.view.View) this.f226391b.get();
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/location/ui/impl/TrackMapUI$GetTencentMapDownloadInfoTask", "onPostExecute", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/location/ui/impl/TrackMapUI$GetTencentMapDownloadInfoTask", "onPostExecute", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.content.Context context = (android.content.Context) this.f226390a.get();
        if (context == null) {
            return;
        }
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                return;
            }
            org.json.JSONArray optJSONArray = new org.json.JSONObject(str).optJSONArray("apkInfos");
            if (optJSONArray == null) {
                dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ju8), 0).show();
                return;
            }
            int length = optJSONArray.length();
            android.content.Intent intent = new android.content.Intent();
            for (int i17 = 0; i17 < length; i17++) {
                org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                if (optJSONObject != null && optJSONObject.optString("cid").equals("00008")) {
                    java.lang.String optString = optJSONObject.optString("apkPath");
                    java.lang.String optString2 = optJSONObject.optString("size");
                    long longValue = android.text.TextUtils.isDigitsOnly(optString2) ? java.lang.Long.valueOf(optString2).longValue() : 0L;
                    java.lang.String optString3 = optJSONObject.optString("md5");
                    if (longValue > 0 && !fp.i.c(longValue)) {
                        dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ju_), 0).show();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TrackMapUI", "fail, not enough space, require size = " + longValue);
                        return;
                    }
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TrackMapUI", "doAddDownloadTask fail, url is null");
                        return;
                    }
                    intent.putExtra("task_name", "TencentMap");
                    intent.putExtra("task_url", optString);
                    intent.putExtra("task_size", longValue);
                    intent.putExtra("file_md5", optString3);
                    intent.putExtra("thumb_url", f226389c);
                    intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "腾讯地图");
                    intent.addFlags(268435456);
                    j45.l.j(context, "webview", ".ui.tools.WebViewDownloadUI", intent, null);
                    return;
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TrackMapUI", "deal json string failure, msg: %s.", e17.getMessage());
            dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ju8), 0).show();
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        android.view.View view = (android.view.View) this.f226391b.get();
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/location/ui/impl/TrackMapUI$GetTencentMapDownloadInfoTask", "onPreExecute", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/location/ui/impl/TrackMapUI$GetTencentMapDownloadInfoTask", "onPreExecute", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
