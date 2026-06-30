package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic */
/* loaded from: classes7.dex */
public final class C11734xf31693dd extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.AbstractC11739xe6a8eff3 {

    /* renamed from: q, reason: collision with root package name */
    public static final int f158442q = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, android.R.dimen.notification_large_icon_width);

    /* renamed from: r, reason: collision with root package name */
    public static final int f158443r = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, android.R.dimen.notification_large_icon_height);

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f158444d;

    /* renamed from: e, reason: collision with root package name */
    public final tf1.f f158445e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f158446f;

    /* renamed from: g, reason: collision with root package name */
    public final android.app.NotificationManager f158447g;

    /* renamed from: h, reason: collision with root package name */
    public int f158448h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f158449i;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f158450m;

    /* renamed from: n, reason: collision with root package name */
    public volatile java.lang.String f158451n;

    /* renamed from: o, reason: collision with root package name */
    public volatile android.graphics.Bitmap f158452o;

    /* renamed from: p, reason: collision with root package name */
    public final android.content.BroadcastReceiver f158453p;

    public C11734xf31693dd(java.lang.String str) {
        super(str);
        this.f158448h = 292;
        this.f158449i = true;
        this.f158450m = false;
        this.f158451n = null;
        this.f158452o = null;
        this.f158453p = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.a(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.b(str);
        if (b17 == null) {
            throw new java.lang.IllegalStateException("find AppBrandRuntime fail");
        }
        this.f158444d = b17;
        tf1.f fVar = (tf1.f) b17.k(tf1.f.class);
        if (fVar == null) {
            throw new java.lang.IllegalStateException("find AppBrandRuntimeAudioOfVideoBackgroundPlayManager fail");
        }
        this.f158445e = fVar;
        fVar.f500395h = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.b(this, fVar);
        android.content.Context context = b17.f156328d;
        this.f158446f = context;
        this.f158447g = (android.app.NotificationManager) context.getSystemService("notification");
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

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.AbstractC11739xe6a8eff3
    public android.app.Notification a() {
        return d(this.f158446f, this.f158450m, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.AbstractC11739xe6a8eff3
    public int b() {
        if (292 == this.f158448h) {
            this.f158448h = bm5.f1.a().hashCode() + 292;
        }
        return this.f158448h;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.AbstractC11739xe6a8eff3
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "startNotify");
        if (this.f158449i) {
            this.f158449i = false;
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.d(this));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "startNotify, already start");
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.c(this));
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11734xf31693dd.d(android.content.Context, boolean, android.graphics.Bitmap):android.app.Notification");
    }

    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "cancelNotify");
        if (this.f158449i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "cancelNotify, already cancel");
            return;
        }
        this.f158449i = true;
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.e(this));
    }

    public final android.graphics.Bitmap g(android.graphics.Bitmap bitmap) {
        if (bitmap != null) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x.t0(bitmap, false, 12.0f, false, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "getRoundedCornerBitmap, bitmap is null");
        return null;
    }

    public final android.graphics.Bitmap h() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.h0 h0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.h0) this.f158444d.K1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.h0.class);
        if (h0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "loadDefaultAlbum, iconProvider is null");
            return null;
        }
        android.graphics.drawable.Drawable Za = h0Var.Za();
        if (Za != null) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x.K0(Za);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "loadDefaultAlbum, albumDrawable is null");
        return null;
    }
}
