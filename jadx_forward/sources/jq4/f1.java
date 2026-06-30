package jq4;

/* loaded from: classes5.dex */
public final class f1 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2347x822e0f6c.ActivityC18850x6f4d99c3 f382678a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f382679b;

    public f1(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2347x822e0f6c.ActivityC18850x6f4d99c3 activityC18850x6f4d99c3, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var) {
        this.f382678a = activityC18850x6f4d99c3;
        this.f382679b = z2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public final void a() {
        boolean c17 = fp.h.c(23);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = this.f382679b;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2347x822e0f6c.ActivityC18850x6f4d99c3 activityC18850x6f4d99c3 = this.f382678a;
        if (c17) {
            try {
                java.lang.Object obj = android.provider.Settings.class.getField("ACTION_MANAGE_OVERLAY_PERMISSION").get(android.provider.Settings.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.String");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) obj)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2347x822e0f6c.ActivityC18850x6f4d99c3 activityC18850x6f4d99c32 = this.f382678a;
                    android.content.Intent intent = new android.content.Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", android.net.Uri.parse("package:" + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b));
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(activityC18850x6f4d99c32, arrayList.toArray(), "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardPermissionDialog$showDialog$dialog$1$2", "onClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activityC18850x6f4d99c32.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(activityC18850x6f4d99c32, "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardPermissionDialog$showDialog$dialog$1$2", "onClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    z2Var.B();
                    activityC18850x6f4d99c3.finish();
                    return;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VoipFloatCardPermission", "getField:ACTION_MANAGE_OVERLAY_PERMISSION! Error:%s, etype:%s", e17.getMessage(), e17.getClass().getCanonicalName());
            }
        }
        java.lang.String string = activityC18850x6f4d99c3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fb_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("rawUrl", string);
        intent2.putExtra("useJs", true);
        intent2.putExtra("vertical_scroll", true);
        j45.l.j(activityC18850x6f4d99c3, "webview", ".ui.tools.WebViewUI", intent2, null);
        z2Var.B();
        activityC18850x6f4d99c3.finish();
    }
}
