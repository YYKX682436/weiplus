package j35;

/* loaded from: classes5.dex */
public class e0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19629x1cf9c994 f379037d;

    public e0(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19629x1cf9c994 activityC19629x1cf9c994) {
        this.f379037d = activityC19629x1cf9c994;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19629x1cf9c994 activityC19629x1cf9c994 = this.f379037d;
        activityC19629x1cf9c994.f271062f = true;
        qp1.l0 l0Var = com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19629x1cf9c994.f271059h;
        if (l0Var != null) {
            l0Var.d();
            com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19629x1cf9c994.f271059h = null;
        }
        if (fp.h.c(23)) {
            try {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) android.provider.Settings.class.getField("ACTION_MANAGE_OVERLAY_PERMISSION").get(android.provider.Settings.class))) {
                    activityC19629x1cf9c994.startActivityForResult(new android.content.Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", android.net.Uri.parse("package:" + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b)), 1234);
                    return;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RequestFloatWindowPermissionDialog", "getField:ACTION_MANAGE_OVERLAY_PERMISSION! Error:%s, etype:%s", e17.getMessage(), e17.getClass().getCanonicalName());
            }
        }
        java.lang.String string = activityC19629x1cf9c994.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fb_);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", string);
        intent.putExtra("useJs", true);
        intent.putExtra("vertical_scroll", true);
        j45.l.j(activityC19629x1cf9c994, "webview", ".ui.tools.WebViewUI", intent, null);
        activityC19629x1cf9c994.finish();
    }
}
