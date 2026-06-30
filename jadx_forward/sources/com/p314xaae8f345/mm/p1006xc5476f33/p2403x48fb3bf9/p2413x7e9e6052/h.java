package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.ref.WeakReference f264791a = null;

    public static void b(android.content.Context context, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 w1Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 w1Var2) {
        if (((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        if (!str.startsWith("http://") && !str.startsWith("https://")) {
            str = "http://".concat(str);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        u1Var.g(str2);
        u1Var.n(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571535i4));
        u1Var.j(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg));
        u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.d(w1Var, context, str));
        u1Var.i(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.c(w1Var2));
        u1Var.q(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(android.app.Activity r18, int r19, int r20, android.content.Intent r21) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.h.a(android.app.Activity, int, int, android.content.Intent):boolean");
    }

    public void c(android.app.Activity activity, java.lang.String str) {
        if (activity == null || activity.isFinishing() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        if (!str.startsWith("http://") && !str.startsWith("https://")) {
            str = "http://".concat(str);
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str));
        try {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P0(activity) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.c()) {
                android.content.Intent a17 = hx4.r.a(activity, intent, str, true);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(205);
                arrayList.add(a17);
                java.util.Collections.reverse(arrayList);
                yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/webview/modeltools/BrowserChooserHelper", "showAndOpenInBrowser", "(Landroid/app/Activity;Ljava/lang/String;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            }
            if (fp.h.c(29)) {
                android.app.PendingIntent.getActivity(activity, 0, intent, fp.g0.a(134217728)).send(activity, 1, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.b(this), null);
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(activity, arrayList2.toArray(), "com/tencent/mm/plugin/webview/modeltools/BrowserChooserHelper", "showAndOpenInBrowser", "(Landroid/app/Activity;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(activity, "com/tencent/mm/plugin/webview/modeltools/BrowserChooserHelper", "showAndOpenInBrowser", "(Landroid/app/Activity;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrowserChooserHelper", "open in browser failed : %s", e17.getMessage());
        }
    }
}
