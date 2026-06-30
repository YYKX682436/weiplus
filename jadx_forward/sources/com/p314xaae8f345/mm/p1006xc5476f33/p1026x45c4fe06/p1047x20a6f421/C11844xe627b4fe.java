package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.AppBrandDebugProvider */
/* loaded from: classes7.dex */
public class C11844xe627b4fe extends android.content.ContentProvider {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f159114d = new java.util.HashMap();

    @Override // android.content.ContentProvider
    public android.os.Bundle call(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DebugProvider", "call method=%s, arg=%s", str, str2);
        r91.f fVar = (r91.f) ((java.util.HashMap) this.f159114d).get(str);
        if (fVar == null) {
            return r91.g.a("unknown method: " + str);
        }
        try {
            return fVar.a(str2, bundle);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DebugProvider", th6, "call failed", new java.lang.Object[0]);
            return r91.g.a(th6.getClass().getSimpleName() + ": " + th6.getMessage());
        }
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (!z65.c.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DebugProvider", "AppBrandDebugProvider disabled: not a debug build");
            return true;
        }
        java.util.Map map = this.f159114d;
        ((java.util.HashMap) map).put("clearWeAppPkg", new r91.e());
        ((java.util.HashMap) map).put("clear", new r91.a());
        ((java.util.HashMap) map).put("clearPluginPkg", new r91.d());
        ((java.util.HashMap) map).put("launch", new r91.h());
        ((java.util.HashMap) map).put("qualityMock", new r91.i(getContext()));
        ((java.util.HashMap) map).put("toggleJsApiPermission", new r91.j());
        ((java.util.HashMap) map).put("clearContact", new r91.b());
        ((java.util.HashMap) map).put("clearLaunchPermission", new r91.c());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DebugProvider", "AppBrandDebugProvider created, %d commands registered", java.lang.Integer.valueOf(((java.util.HashMap) map).size()));
        return true;
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }
}
