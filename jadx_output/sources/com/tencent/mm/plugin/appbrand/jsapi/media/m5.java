package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public class m5 implements com.tencent.mm.plugin.appbrand.jsapi.media.n5 {
    public m5(com.tencent.mm.plugin.appbrand.jsapi.media.k5 k5Var) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.n5
    public com.tencent.mm.plugin.appbrand.jsapi.media.l5 a(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, int i17, int i18, int i19) {
        jc1.d dVar = jc1.g.f298932d;
        com.tencent.mm.plugin.appbrand.appstorage.u1 fileSystem = lVar.getFileSystem();
        if (fileSystem == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiCompressImage.javayhu", "compressImage fail:fileSystem is null");
            return new com.tencent.mm.plugin.appbrand.jsapi.media.l5(false, "fail:runtime fileSystem is null", jc1.f.f298915d);
        }
        com.tencent.mm.vfs.r6 absoluteFile = lVar.getFileSystem().getAbsoluteFile(str);
        if (absoluteFile == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiCompressImage.javayhu", "compressImage fail:file doesn't exist");
            return new com.tencent.mm.plugin.appbrand.jsapi.media.l5(false, "fail:file doesn't exist", jc1.g.f298929a);
        }
        try {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            android.graphics.Bitmap Bc = com.tencent.mm.plugin.appbrand.jsapi.media.y1.a().Bc(absoluteFile.o(), options);
            if (Bc == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCompressImage.javayhu", "compressImage fail:decode image fail");
                return new com.tencent.mm.plugin.appbrand.jsapi.media.l5(false, "fail:decode image fail", jc1.g.f298930b);
            }
            android.graphics.Bitmap C = com.tencent.mm.plugin.appbrand.jsapi.media.j5.C(Bc, i18, i19);
            java.lang.String str2 = je.a.d(options) ? "jpg" : "png";
            java.lang.String str3 = lp0.b.K() + "microMsg.tmp." + java.lang.System.currentTimeMillis() + "." + str2;
            com.tencent.mm.sdk.platformtools.x.D0(C, i17, je.a.d(options) ? android.graphics.Bitmap.CompressFormat.JPEG : android.graphics.Bitmap.CompressFormat.PNG, str3, true);
            if (je.a.d(options)) {
                ya1.d.b(absoluteFile.o(), str3);
            }
            ik1.b0 b0Var = new ik1.b0();
            if (fileSystem.createTempFileFrom(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str3)), str2, false, b0Var) != com.tencent.mm.plugin.appbrand.appstorage.j1.OK) {
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiCompressImage.javayhu", "compressImage fail:create tmp file fail");
                return new com.tencent.mm.plugin.appbrand.jsapi.media.l5(false, "fail:create tmp file fail", jc1.g.f298931c);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCompressImage.javayhu", "compressImage ok, dstPath:%s, tmpPath:%s", str3, b0Var.f291824a);
            return new com.tencent.mm.plugin.appbrand.jsapi.media.l5(true, (java.lang.String) b0Var.f291824a, jc1.f.f298912a);
        } catch (java.lang.NullPointerException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCompressImage.javayhu", "compressImage fail:compress image NPE", e17);
            return new com.tencent.mm.plugin.appbrand.jsapi.media.l5(false, "fail:compress image NPE", dVar);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCompressImage.javayhu", "compressImage fail:compress image exception", e18);
            com.tencent.mm.vfs.w6.h(null);
            return new com.tencent.mm.plugin.appbrand.jsapi.media.l5(false, "fail:compress image exception", dVar);
        } catch (java.lang.OutOfMemoryError e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCompressImage.javayhu", "compressImage fail:compress image OOM", e19);
            return new com.tencent.mm.plugin.appbrand.jsapi.media.l5(false, "fail:compress image OOM", jc1.f.f298927p);
        }
    }
}
