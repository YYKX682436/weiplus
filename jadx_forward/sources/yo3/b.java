package yo3;

/* loaded from: classes9.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.ref.WeakReference f545676a;

    public static final void a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.Intent intent = new android.content.Intent("com.android.launcher.action.INSTALL_SHORTCUT");
        intent.putExtra("android.intent.extra.shortcut.NAME", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pej));
        intent.putExtra("duplicate", false);
        android.content.Intent intent2 = new android.content.Intent("com.tencent.mm.ui.ShortCutDispatchAction");
        intent2.putExtra("LauncherUI.Shortcut.LaunchType", "launch_type_offline_wallet");
        intent2.putExtra("from_pinned_shortcut", true);
        intent.putExtra("android.intent.extra.shortcut.INTENT", intent2);
        intent.putExtra("shortcut_is_adaptive_icon", true);
        intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", android.content.Intent.ShortcutIconResource.fromContext(context, com.p314xaae8f345.mm.R.C30861xcebc809e.dbi));
        intent.putExtra("shortcut_icon_resource_id", com.p314xaae8f345.mm.R.C30861xcebc809e.dbi);
        ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).getClass();
        xp1.c.b(context, intent, "offline_pay_shortcut", null, false, com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.p1939x36f002.C16772x4f31765a.class);
    }

    public static final void b(java.lang.String url, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        try {
            com.p314xaae8f345.p347x615374d.gen.AbstractC3559x53517a31 m28230x1d892dfd = com.p314xaae8f345.p347x615374d.gen.AbstractC3559x53517a31.m28230x1d892dfd();
            if (m28230x1d892dfd != null) {
                m28230x1d892dfd.log(new com.p314xaae8f345.p347x615374d.gen.C3563xf0771408(3, "", 0L, url, i17, null));
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OfflinePayShortcutUtil", "reportViaKindaReporter failed: %s", th6.getMessage());
        }
    }
}
