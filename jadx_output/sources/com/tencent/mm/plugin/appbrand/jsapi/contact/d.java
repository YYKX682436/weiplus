package com.tencent.mm.plugin.appbrand.jsapi.contact;

/* loaded from: classes15.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f80539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.contact.c f80540e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f80541f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f80542g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.contact.j f80543h;

    public d(com.tencent.mm.plugin.appbrand.jsapi.contact.j jVar, android.content.Context context, com.tencent.mm.plugin.appbrand.jsapi.contact.c cVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f80543h = jVar;
        this.f80539d = context;
        this.f80540e = cVar;
        this.f80541f = lVar;
        this.f80542g = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.app.Activity activity = (android.app.Activity) this.f80539d;
        com.tencent.mm.plugin.appbrand.jsapi.contact.c cVar = this.f80540e;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f80541f;
        int i17 = this.f80542g;
        com.tencent.mm.plugin.appbrand.jsapi.contact.j jVar = this.f80543h;
        jVar.getClass();
        java.lang.String[] strArr = {activity.getString(com.tencent.mm.R.string.gp7), activity.getString(com.tencent.mm.R.string.gp6)};
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) activity, 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.appbrand.jsapi.contact.e(jVar, strArr);
        k0Var.f211881s = new com.tencent.mm.plugin.appbrand.jsapi.contact.h(jVar, cVar, activity, lVar, i17);
        k0Var.C = new com.tencent.mm.plugin.appbrand.jsapi.contact.i(jVar, lVar, i17);
        k0Var.v();
    }
}
