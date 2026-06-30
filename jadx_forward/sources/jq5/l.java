package jq5;

/* loaded from: classes5.dex */
public final class l {
    public l(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static final void a(jq5.l lVar, android.content.Context context, jq5.m mVar) {
        lVar.getClass();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        u1Var.u(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht));
        u1Var.g(mVar.f382814c);
        u1Var.n(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z));
        u1Var.b(new jq5.k(context));
        u1Var.q(false);
    }

    public final iq5.a b(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        iq5.a aVar = new iq5.a();
        java.util.List list = aVar.f375336e;
        iq5.d dVar = new iq5.d();
        dVar.f375339d = 1;
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ntt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        dVar.f375340e = string;
        java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nts);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        dVar.f375341f = string2;
        dVar.f375342g = jq5.c.f382790d;
        dVar.f375343h = new jq5.d(context);
        ((java.util.ArrayList) list).add(dVar);
        iq5.d dVar2 = new iq5.d();
        dVar2.f375339d = 2;
        java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nt9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        dVar2.f375340e = string3;
        java.lang.String string4 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ntr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
        dVar2.f375341f = string4;
        dVar2.f375342g = jq5.e.f382792d;
        dVar2.f375343h = new jq5.g(context);
        ((java.util.ArrayList) list).add(dVar2);
        return aVar;
    }

    public final boolean c() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        for (jq5.m mVar : d(context)) {
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.lang.String str = mVar.f382812a;
            ((sb0.f) jVar).getClass();
            if (!j35.u.d(context2, str, true)) {
                return false;
            }
        }
        return true;
    }

    public final jq5.m[] d(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return android.os.Build.VERSION.SDK_INT >= 33 ? new jq5.m[]{new jq5.m("android.permission.NEARBY_WIFI_DEVICES", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nxv), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nkh))} : new jq5.m[]{new jq5.m("android.permission.ACCESS_FINE_LOCATION", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nxv), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hkc))};
    }

    public final boolean e() {
        try {
            java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getApplicationContext().getSystemService("wifi");
            android.net.wifi.WifiManager wifiManager = systemService instanceof android.net.wifi.WifiManager ? (android.net.wifi.WifiManager) systemService : null;
            if (wifiManager != null) {
                return wifiManager.isWifiEnabled();
            }
            return false;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WeDrop.WeDropPermissionManager", "[isWiFiEnable] error=" + e17);
            return false;
        }
    }

    public final void f(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeDrop.WeDropPermissionManager", "try jumpApSettingPage");
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.settings.TETHER_SETTINGS");
        intent.setFlags(268435456);
        try {
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/wedrop/utils/WeDropPermissionManager$Companion", "jumpApSettingPage", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/wedrop/utils/WeDropPermissionManager$Companion", "jumpApSettingPage", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeDrop.WeDropPermissionManager", "[jumpApSettingPage] intent not resolve TETHER_SETTINGS, try ACTION_WIRELESS_SETTINGS");
                intent.setAction("android.settings.WIRELESS_SETTINGS");
                if (intent.resolveActivity(context.getPackageManager()) != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/wedrop/utils/WeDropPermissionManager$Companion", "jumpApSettingPage", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(context, "com/tencent/mm/wedrop/utils/WeDropPermissionManager$Companion", "jumpApSettingPage", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeDrop.WeDropPermissionManager", "[jumpApSettingPage] error: " + e17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00f2 -> B:10:0x00f7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(android.content.Context r25, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r26) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jq5.l.g(android.content.Context, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
