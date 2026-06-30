package com.tencent.mm.plugin.appbrand.luggage.customize;

/* loaded from: classes7.dex */
public class b0 extends qd.a implements o91.e {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f85515d;

    public b0(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f85515d = appBrandRuntime;
    }

    @Override // o91.e
    public java.lang.String T0(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str) {
        if (!U0(lVar, str)) {
            return str;
        }
        return str + "?appId=" + lVar.getAppId();
    }

    @Override // o91.e
    public boolean U0(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str) {
        return (lVar == null || str == null || str.length() == 0 || !str.startsWith("wxfile://") || str.startsWith("wxfile://ad")) ? false : true;
    }

    @Override // o91.a
    public boolean a(java.lang.String str) {
        return (str == null || !str.startsWith("wxfile://") || str.startsWith("wxfile://ad")) ? false : true;
    }

    @Override // o91.a
    public android.graphics.Bitmap c(java.lang.String str, android.graphics.Rect rect, o91.b bVar) {
        com.tencent.mm.plugin.appbrand.appstorage.u1 fileSystem;
        if (!a(str) || (fileSystem = this.f85515d.getFileSystem()) == null) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf("?appId=");
        com.tencent.mm.vfs.r6 absoluteFile = fileSystem.getAbsoluteFile((java.lang.String) android.util.Pair.create(str.substring(lastIndexOf + 7), str.substring(0, lastIndexOf)).second);
        if (absoluteFile == null || !absoluteFile.m()) {
            return null;
        }
        java.lang.String o17 = absoluteFile.o();
        if (!o17.startsWith("file://")) {
            o17 = "file://".concat(o17);
        }
        return l01.d0.f314761a.f(o17, rect != null ? new zg1.a(rect.left, rect.top, rect.width(), rect.height()) : null);
    }

    @Override // qd.a
    public void d(java.lang.String str, o91.c cVar) {
        if (cVar == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.appstorage.u1 fileSystem = this.f85515d.getFileSystem();
        if (fileSystem == null) {
            cVar.a(null);
            return;
        }
        int lastIndexOf = str.lastIndexOf("?appId=");
        cVar.a(fileSystem.readStream((java.lang.String) android.util.Pair.create(str.substring(lastIndexOf + 7), str.substring(0, lastIndexOf)).second));
    }

    @Override // o91.a
    public java.lang.String key() {
        return "WxFileImageReader";
    }
}
