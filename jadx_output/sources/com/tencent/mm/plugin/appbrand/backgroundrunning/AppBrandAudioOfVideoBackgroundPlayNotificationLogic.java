package com.tencent.mm.plugin.appbrand.backgroundrunning;

/* loaded from: classes7.dex */
public final class AppBrandAudioOfVideoBackgroundPlayNotificationLogic extends com.tencent.mm.plugin.appbrand.backgroundrunning.CustomBackgroundRunningNotificationLogic {

    /* renamed from: q, reason: collision with root package name */
    public static final int f76909q = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, android.R.dimen.notification_large_icon_width);

    /* renamed from: r, reason: collision with root package name */
    public static final int f76910r = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, android.R.dimen.notification_large_icon_height);

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f76911d;

    /* renamed from: e, reason: collision with root package name */
    public final tf1.f f76912e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f76913f;

    /* renamed from: g, reason: collision with root package name */
    public final android.app.NotificationManager f76914g;

    /* renamed from: h, reason: collision with root package name */
    public int f76915h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f76916i;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f76917m;

    /* renamed from: n, reason: collision with root package name */
    public volatile java.lang.String f76918n;

    /* renamed from: o, reason: collision with root package name */
    public volatile android.graphics.Bitmap f76919o;

    /* renamed from: p, reason: collision with root package name */
    public final android.content.BroadcastReceiver f76920p;

    public AppBrandAudioOfVideoBackgroundPlayNotificationLogic(java.lang.String str) {
        super(str);
        this.f76915h = 292;
        this.f76916i = true;
        this.f76917m = false;
        this.f76918n = null;
        this.f76919o = null;
        this.f76920p = new com.tencent.mm.plugin.appbrand.backgroundrunning.a(this);
        com.tencent.mm.plugin.appbrand.o6 b17 = com.tencent.mm.plugin.appbrand.l.b(str);
        if (b17 == null) {
            throw new java.lang.IllegalStateException("find AppBrandRuntime fail");
        }
        this.f76911d = b17;
        tf1.f fVar = (tf1.f) b17.k(tf1.f.class);
        if (fVar == null) {
            throw new java.lang.IllegalStateException("find AppBrandRuntimeAudioOfVideoBackgroundPlayManager fail");
        }
        this.f76912e = fVar;
        fVar.f418862h = new com.tencent.mm.plugin.appbrand.backgroundrunning.b(this, fVar);
        android.content.Context context = b17.f74795d;
        this.f76913f = context;
        this.f76914g = (android.app.NotificationManager) context.getSystemService("notification");
    }

    public static void f(android.view.View view, java.util.List list) {
        if (!(view instanceof android.view.ViewGroup)) {
            if (view instanceof android.widget.TextView) {
                list.add((android.widget.TextView) view);
            }
        } else {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i17 = 0; i17 < viewGroup.getChildCount(); i17++) {
                f(viewGroup.getChildAt(i17), list);
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.backgroundrunning.CustomBackgroundRunningNotificationLogic
    public android.app.Notification a() {
        return d(this.f76913f, this.f76917m, null);
    }

    @Override // com.tencent.mm.plugin.appbrand.backgroundrunning.CustomBackgroundRunningNotificationLogic
    public int b() {
        if (292 == this.f76915h) {
            this.f76915h = bm5.f1.a().hashCode() + 292;
        }
        return this.f76915h;
    }

    @Override // com.tencent.mm.plugin.appbrand.backgroundrunning.CustomBackgroundRunningNotificationLogic
    public void c() {
        com.tencent.mars.xlog.Log.i("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "startNotify");
        if (this.f76916i) {
            this.f76916i = false;
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.appbrand.backgroundrunning.d(this));
            return;
        }
        com.tencent.mars.xlog.Log.i("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "startNotify, already start");
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.appbrand.backgroundrunning.c(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.app.Notification d(android.content.Context r17, boolean r18, android.graphics.Bitmap r19) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic.d(android.content.Context, boolean, android.graphics.Bitmap):android.app.Notification");
    }

    public void e() {
        com.tencent.mars.xlog.Log.i("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "cancelNotify");
        if (this.f76916i) {
            com.tencent.mars.xlog.Log.i("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "cancelNotify, already cancel");
            return;
        }
        this.f76916i = true;
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.appbrand.backgroundrunning.e(this));
    }

    public final android.graphics.Bitmap g(android.graphics.Bitmap bitmap) {
        if (bitmap != null) {
            return com.tencent.mm.sdk.platformtools.x.t0(bitmap, false, 12.0f, false, null);
        }
        com.tencent.mars.xlog.Log.w("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "getRoundedCornerBitmap, bitmap is null");
        return null;
    }

    public final android.graphics.Bitmap h() {
        com.tencent.mm.plugin.appbrand.widget.h0 h0Var = (com.tencent.mm.plugin.appbrand.widget.h0) this.f76911d.K1(com.tencent.mm.plugin.appbrand.widget.h0.class);
        if (h0Var == null) {
            com.tencent.mars.xlog.Log.w("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "loadDefaultAlbum, iconProvider is null");
            return null;
        }
        android.graphics.drawable.Drawable Za = h0Var.Za();
        if (Za != null) {
            return com.tencent.mm.sdk.platformtools.x.K0(Za);
        }
        com.tencent.mars.xlog.Log.w("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "loadDefaultAlbum, albumDrawable is null");
        return null;
    }
}
