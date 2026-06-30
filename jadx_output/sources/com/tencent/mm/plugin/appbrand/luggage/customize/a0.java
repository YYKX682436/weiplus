package com.tencent.mm.plugin.appbrand.luggage.customize;

/* loaded from: classes7.dex */
public class a0 extends qd.a implements o91.e {
    @Override // o91.e
    public java.lang.String T0(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str) {
        U0(lVar, str);
        return str;
    }

    @Override // o91.e
    public boolean U0(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str) {
        if (lVar == null || str == null || str.length() == 0) {
            return false;
        }
        return str.startsWith("wxfile://ad");
    }

    @Override // o91.a
    public boolean a(java.lang.String str) {
        return str != null && str.startsWith("wxfile://ad");
    }

    @Override // o91.a
    public android.graphics.Bitmap c(java.lang.String str, android.graphics.Rect rect, o91.b bVar) {
        if (!a(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WxFileAdImageReader", "read, not match, url:%s", str);
            return null;
        }
        i81.m0 m0Var = (i81.m0) i95.n0.c(i81.m0.class);
        if (m0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxFileAdImageReader", "read, no ad service");
            return null;
        }
        ((i81.f) m0Var).getClass();
        java.util.Map map = i81.j.f289592a;
        com.tencent.mm.plugin.appbrand.appstorage.j3 j3Var = i81.i.f289590a;
        if (j3Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxFileAdImageReader", "read, no ad file system");
            return null;
        }
        com.tencent.mm.vfs.r6 absoluteFile = j3Var.getAbsoluteFile(str, false);
        if (absoluteFile == null || !absoluteFile.m()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WxFileAdImageReader", "read, file not exist, url:%s", str);
            return null;
        }
        java.lang.String o17 = absoluteFile.o();
        if (!o17.startsWith("file://")) {
            o17 = "file://".concat(o17);
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.WxFileAdImageReader", "read, url:%s, path:%s", str, o17);
        return l01.d0.f314761a.f(o17, rect != null ? new zg1.a(rect.left, rect.top, rect.width(), rect.height()) : null);
    }

    @Override // qd.a
    public void d(java.lang.String str, o91.c cVar) {
        if (!a(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WxFileAdImageReader", "openRead, not match, url:%s", str);
            return;
        }
        if (cVar == null) {
            return;
        }
        i81.m0 m0Var = (i81.m0) i95.n0.c(i81.m0.class);
        if (m0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxFileAdImageReader", "openRead, no ad service");
            return;
        }
        ((i81.f) m0Var).getClass();
        java.util.Map map = i81.j.f289592a;
        com.tencent.mm.plugin.appbrand.appstorage.j3 j3Var = i81.i.f289590a;
        if (j3Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxFileAdImageReader", "openRead, no ad file system");
        } else {
            cVar.a(j3Var.readStream(str));
        }
    }

    @Override // o91.a
    public java.lang.String key() {
        return "WxFileAdImageReader";
    }
}
