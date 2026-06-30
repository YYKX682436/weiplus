package l02;

@j95.b
/* loaded from: classes.dex */
public class q extends i95.w implements m02.s {
    public static java.lang.String Di(java.lang.String str) {
        org.json.JSONObject jSONObject = null;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            try {
                str = java.net.URLDecoder.decode(str, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            } catch (java.io.UnsupportedEncodingException unused) {
            }
            try {
                jSONObject = new org.json.JSONObject(str);
            } catch (java.lang.Exception unused2) {
            }
        }
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        if (jSONObject.optInt("OpInWidget") == 1) {
            jSONObject.remove("OpInWidget");
        }
        try {
            jSONObject.put("DownloadInWidget", 1);
        } catch (org.json.JSONException unused3) {
        }
        try {
            return java.net.URLEncoder.encode(jSONObject.toString(), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
        } catch (java.io.UnsupportedEncodingException unused4) {
            return str;
        }
    }

    public java.util.LinkedList Ai() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.s0.d();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.addAll(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.s0.f178862a);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            return null;
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.api.C13236xb15ab0ff c13236xb15ab0ff = new com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.api.C13236xb15ab0ff();
            c13236xb15ab0ff.f178760d = str;
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 q17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().q(str);
            if (q17 != null) {
                c13236xb15ab0ff.f178761e = q17.f178494d;
                int i17 = q17.f178496f;
                c13236xb15ab0ff.f178766m = i17;
                if (i17 == 1) {
                    c13236xb15ab0ff.f178762f = "downloading";
                } else if (i17 == 2) {
                    c13236xb15ab0ff.f178762f = "download_pause";
                } else if (i17 == 3) {
                    c13236xb15ab0ff.f178762f = "download_succ";
                } else if (i17 != 4) {
                    c13236xb15ab0ff.f178762f = "default";
                } else {
                    c13236xb15ab0ff.f178762f = "download_fail";
                }
                long j17 = q17.f178501n;
                if (j17 > 0) {
                    long j18 = q17.f178500m;
                    c13236xb15ab0ff.f178763g = (int) ((100 * j18) / j17);
                    c13236xb15ab0ff.f178765i = (((float) j18) * 100.0f) / ((float) j17);
                }
                if (q17.f178505r) {
                    c13236xb15ab0ff.f178764h = true;
                }
                linkedList2.add(c13236xb15ab0ff);
            }
        }
        return linkedList2;
    }

    public void Bi(android.content.Context context, android.os.Bundle bundle) {
        if (context == null || bundle == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtras(bundle);
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.game_luggage, true)) {
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(intent.getStringExtra("rawUrl"))) {
                return;
            }
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        }
    }

    public boolean Ni() {
        java.util.LinkedList linkedList = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.l0.D;
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.j0.f178819a.getClass();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("download_app").getBoolean("show_red_dot", false);
        if (z17) {
            if (java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("download_app").getLong("red_dot_create_time", 0L) > 86400) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("download_app").putBoolean("show_red_dot", false);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("download_app").putLong("red_dot_create_time", 0L);
                return false;
            }
        }
        return z17;
    }

    public void Ri(android.content.Context context, android.content.Intent intent, m02.c cVar) {
        if (context == null) {
            if (cVar != null) {
                cVar.a();
                return;
            }
            return;
        }
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.getExtras();
        if (!(context instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.ActivityC13242xdf6880d5.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/downloader_app/DownloaderAppDelegateImpl", "startDownloadManager", "(Landroid/content/Context;Landroid/content/Intent;Lcom/tencent/mm/plugin/downloader_app/api/DownloadAppCallback$StartDownloadManagerCallBack;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/downloader_app/DownloaderAppDelegateImpl", "startDownloadManager", "(Landroid/content/Context;Landroid/content/Intent;Lcom/tencent/mm/plugin/downloader_app/api/DownloadAppCallback$StartDownloadManagerCallBack;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        if (cVar != null) {
            cVar.a();
        }
    }

    public long wi(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a aVar, m02.b bVar) {
        aVar.f178776j = Di(aVar.f178776j);
        return com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.o.c(aVar, bVar);
    }
}
