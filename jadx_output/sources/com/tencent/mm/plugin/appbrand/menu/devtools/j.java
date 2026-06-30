package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes7.dex */
public class j implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f85907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f85908e;

    public j(com.tencent.mm.plugin.appbrand.menu.devtools.k kVar, com.tencent.mm.plugin.appbrand.page.n7 n7Var, android.content.Context context) {
        this.f85907d = n7Var;
        this.f85908e = context;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        android.content.Context context = this.f85908e;
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f85907d;
        switch (itemId) {
            case 1:
                new ne1.f().A(n7Var.U1(), new org.json.JSONObject(), 10000);
                return;
            case 2:
            case 7:
            case 9:
                int itemId2 = menuItem.getItemId();
                java.lang.String o17 = n7Var.getFileSystem().getAbsoluteFile(itemId2 != 2 ? itemId2 != 7 ? itemId2 != 9 ? "wxfile://" : "wxfile://clientdata" : "wxfile://opendata" : "wxfile://usr", true).o();
                dp.a.makeText(context, context.getString(com.tencent.mm.R.string.f490032j1, o17), 0).show();
                com.tencent.mm.sdk.platformtools.b0.d(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, o17, null);
                return;
            case 3:
                com.tencent.mm.sdk.platformtools.b0.d(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, n7Var.getAppId(), null);
                dp.a.makeText(context, context.getString(com.tencent.mm.R.string.f490028ix, n7Var.getAppId()), 1).show();
                return;
            case 4:
            case 5:
            default:
                return;
            case 6:
                if (com.tencent.mm.plugin.appbrand.task.d.a()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandForcePreloadConfig", "[ForcePreload] disableForcePreload");
                    com.tencent.mm.plugin.appbrand.task.d.f89009a = false;
                    com.tencent.mm.sdk.platformtools.o4.M("appbrand_process_force_preload").A("appbrand_process_force_preload", -1);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandForcePreloadConfig", "[ForcePreload] enableForcePreload");
                    com.tencent.mm.plugin.appbrand.task.d.f89009a = true;
                    com.tencent.mm.sdk.platformtools.o4.M("appbrand_process_force_preload").A("appbrand_process_force_preload", 1);
                }
                menuItem.setTitle(context.getString(com.tencent.mm.R.string.f490030iz) + java.lang.String.format("(cur:%b)", java.lang.Boolean.valueOf(com.tencent.mm.plugin.appbrand.task.d.a())));
                dp.a.makeText(context, "Restart Wechat!!", 1).show();
                return;
            case 8:
                java.lang.String str = n7Var.getRuntime().u0().f47278x;
                com.tencent.mm.sdk.platformtools.b0.d(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, str, null);
                dp.a.makeText(context, context.getString(com.tencent.mm.R.string.f490035j4, str), 1).show();
                return;
            case 10:
                iz5.a.h("test errlog " + new java.text.SimpleDateFormat(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, java.util.Locale.ENGLISH).format(new java.util.Date()));
                throw null;
            case 11:
                com.tencent.mm.plugin.appbrand.appstorage.WxaNativeCrashTest.crashForTest();
                return;
            case 12:
                ((com.tencent.mm.feature.performance.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).getClass();
                com.tencent.mm.plugin.performance.watchdogs.b0.B.d(true);
                return;
            case 13:
                new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.plugin.appbrand.menu.devtools.i(this));
                return;
        }
    }
}
