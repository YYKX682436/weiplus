package k71;

/* loaded from: classes14.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final k71.l f386225a = new k71.l();

    public static final void a(k71.l lVar, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, int i17, int i18) {
        java.lang.String str;
        lVar.getClass();
        k71.m mVar = k71.m.f386226f;
        if (i17 == 5001) {
            lVar.c(activityC0065xcd7aa112, activityC0065xcd7aa112.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l8n) + com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d());
            lVar.d(i18);
            v61.d.g("security_center_login", i18);
            return;
        }
        if (i17 == 5002) {
            lVar.c(activityC0065xcd7aa112, activityC0065xcd7aa112.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l8k) + com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d());
            lVar.d(i18);
            return;
        }
        if (i17 != 5004) {
            if (i17 == 5005) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11404xb70180da.f154810p.a(activityC0065xcd7aa112, new android.content.Intent(activityC0065xcd7aa112, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11461x47892174.class));
                lVar.d(i18);
                v61.d.g("register_account", i18);
                return;
            }
            if (i17 == 7012) {
                java.lang.String string = activityC0065xcd7aa112.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ff_, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                lVar.c(activityC0065xcd7aa112, string);
                v61.d.g("frozen_account_login", i18);
                lVar.d(i18);
                return;
            }
            return;
        }
        java.lang.String d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        java.lang.String str2 = wo.w0.k() + '_' + java.lang.System.currentTimeMillis();
        java.lang.String e17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.e();
        u11.a a17 = u11.b.a(e17);
        if (a17 != null) {
            java.lang.String countryName = a17.f505262c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(countryName, "countryName");
            java.lang.String str3 = a17.f505261b;
            str = countryName;
            e17 = str3;
        } else {
            str = "";
        }
        java.lang.String string2 = activityC0065xcd7aa112.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lse, d17, str2, e17, str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        lVar.c(activityC0065xcd7aa112, string2);
        lVar.d(i18);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.p314xaae8f345.mm.ui.C21398x34296d3b b(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 r16, java.util.List r17, int r18) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k71.l.b(androidx.appcompat.app.AppCompatActivity, java.util.List, int):com.tencent.mm.ui.MMBottomButtonList");
    }

    public final void c(android.content.Context context, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("KRightBtn", true);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", true);
        intent.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
        intent.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
        j45.l.j(context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
    }

    public final void d(int i17) {
        if (i17 > 0) {
            v61.d.f(i17);
        }
    }
}
