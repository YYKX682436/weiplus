package k13;

/* loaded from: classes5.dex */
public final class j implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15560xcaaa67b0 f384758a;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15560xcaaa67b0 activityC15560xcaaa67b0) {
        this.f384758a = activityC15560xcaaa67b0;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public final void a() {
        boolean c17 = fp.h.c(23);
        com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15560xcaaa67b0 activityC15560xcaaa67b0 = this.f384758a;
        if (c17) {
            try {
                java.lang.Object obj = android.provider.Settings.class.getField("ACTION_MANAGE_OVERLAY_PERMISSION").get(android.provider.Settings.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.String");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) obj)) {
                    activityC15560xcaaa67b0.startActivityForResult(new android.content.Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", android.net.Uri.parse("package:" + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b)), activityC15560xcaaa67b0.f218864e);
                    return;
                }
            } catch (java.lang.Exception unused) {
            }
        }
        java.lang.String string = activityC15560xcaaa67b0.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fb_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", string);
        intent.putExtra("useJs", true);
        intent.putExtra("vertical_scroll", true);
        j45.l.j(activityC15560xcaaa67b0, "webview", ".ui.tools.WebViewUI", intent, null);
        activityC15560xcaaa67b0.finish();
    }
}
