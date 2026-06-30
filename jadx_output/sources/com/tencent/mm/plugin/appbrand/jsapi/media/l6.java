package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public class l6 implements com.tencent.mm.plugin.appbrand.page.db {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f81922a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.m6 f81923b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.n6 f81924c;

    public l6(com.tencent.mm.plugin.appbrand.jsapi.media.n6 n6Var, java.util.ArrayList arrayList, com.tencent.mm.plugin.appbrand.jsapi.media.m6 m6Var) {
        this.f81924c = n6Var;
        this.f81922a = arrayList;
        this.f81923b = m6Var;
    }

    public void a(final java.lang.String str, final com.tencent.mm.plugin.appbrand.page.y yVar) {
        ku5.u0 u0Var = ku5.t0.f312615d;
        final java.util.ArrayList arrayList = this.f81922a;
        final com.tencent.mm.plugin.appbrand.jsapi.media.m6 m6Var = this.f81923b;
        ((ku5.t0) u0Var).q(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.jsapi.media.l6$$a
            @Override // java.lang.Runnable
            public final void run() {
                java.nio.ByteBuffer byteBuffer;
                byte[] bArr;
                int i17;
                int i18;
                com.tencent.mm.plugin.appbrand.jsapi.media.l6 l6Var = com.tencent.mm.plugin.appbrand.jsapi.media.l6.this;
                java.lang.String str2 = str;
                java.util.ArrayList arrayList2 = arrayList;
                com.tencent.mm.plugin.appbrand.page.y yVar2 = yVar;
                com.tencent.mm.plugin.appbrand.jsapi.media.m6 m6Var2 = m6Var;
                l6Var.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPreviewMedia", "onGetImageFromDiskCache url:%s", str2);
                synchronized (l6Var.f81924c.f81954m) {
                    arrayList2.remove(str2);
                }
                if (yVar2 != null && (byteBuffer = yVar2.f87261a) != null) {
                    if (byteBuffer.hasArray()) {
                        bArr = byteBuffer.array();
                        i17 = byteBuffer.arrayOffset() + byteBuffer.position();
                        i18 = byteBuffer.remaining();
                    } else {
                        bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        i17 = 0;
                        i18 = 0;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.ImageDataConvert", "buffer length: " + bArr.length);
                    java.lang.String str3 = "";
                    if (bArr.length != 0) {
                        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.sdk.platformtools.x2.f193071a.getCacheDir(), "preview_" + java.lang.System.currentTimeMillis() + "_" + java.util.Arrays.hashCode(bArr));
                        java.io.OutputStream outputStream = null;
                        try {
                            java.io.OutputStream H = com.tencent.mm.vfs.w6.H(r6Var);
                            if (byteBuffer.hasArray()) {
                                H.write(bArr, i17, i18);
                            } else {
                                H.write(bArr);
                            }
                            if (H != null) {
                                try {
                                    H.close();
                                } catch (java.io.IOException unused) {
                                }
                            }
                            str3 = r6Var.o();
                        } catch (java.lang.Exception unused2) {
                            if (0 != 0) {
                                try {
                                    outputStream.close();
                                } catch (java.io.IOException unused3) {
                                }
                            }
                        } catch (java.lang.Throwable th6) {
                            if (0 != 0) {
                                try {
                                    outputStream.close();
                                } catch (java.io.IOException unused4) {
                                }
                            }
                            throw th6;
                        }
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPreviewMedia", "write to file, origin url:%s, localUrl:%s", str2, str3);
                    yVar2.release();
                    synchronized (l6Var.f81924c.f81954m) {
                        if (!android.text.TextUtils.isEmpty(str3)) {
                            l6Var.f81924c.f81952h.add(str3);
                            l6Var.f81924c.f81953i.put(str2, str3);
                        }
                    }
                } else if (yVar2 != null) {
                    yVar2.release();
                }
                synchronized (l6Var.f81924c.f81954m) {
                    if (arrayList2.isEmpty()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPreviewMedia", "all image get from disk cache");
                        ((com.tencent.mm.plugin.appbrand.jsapi.media.j6) m6Var2).a();
                    }
                }
            }
        });
    }
}
