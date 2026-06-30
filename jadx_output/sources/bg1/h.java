package bg1;

/* loaded from: classes7.dex */
public class h implements zf.c {

    /* renamed from: i, reason: collision with root package name */
    public yf.i0 f19898i;

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f19890a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19891b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19892c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19893d = false;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f19894e = false;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.AppBrandRuntime f19895f = null;

    /* renamed from: g, reason: collision with root package name */
    public mi1.w0 f19896g = null;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.v0 f19897h = null;

    /* renamed from: j, reason: collision with root package name */
    public tf.m0 f19899j = null;

    /* renamed from: k, reason: collision with root package name */
    public int f19900k = -1;

    /* renamed from: l, reason: collision with root package name */
    public boolean f19901l = false;

    public final void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "blinkCapsuleBarOrDismiss");
        if (!com.tencent.mm.sdk.platformtools.u3.e()) {
            com.tencent.mm.sdk.platformtools.u3.h(new bg1.b(this));
            return;
        }
        if (!this.f19894e || !this.f19890a) {
            if (this.f19896g != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "dismissBlink");
                this.f19896g.dismiss();
                this.f19896g = null;
                return;
            }
            return;
        }
        if (this.f19896g != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "blinkCapsuleBar, already blink");
        } else if (this.f19895f != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "blinkCapsuleBar");
            this.f19896g = mi1.c.a(this.f19895f).h(this.f19891b ? mi1.d.CAMERA : mi1.d.VOICE);
        }
    }

    public java.lang.String b(boolean z17, androidx.lifecycle.y yVar, tf.w wVar) {
        fb1.c ec6 = fb1.e.f260836e.ec(fb1.d.f260833h, z17, new bg1.g(this, yVar, wVar));
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "checkCanInsertLivePusher, status: %s", ec6);
        if (ec6 instanceof fb1.a) {
            return ((fb1.a) ec6).f260827a;
        }
        return null;
    }

    public void c(sf.f fVar, java.lang.String str, java.lang.String str2, boolean z17, zf.a aVar) {
        boolean z18 = fVar instanceof com.tencent.mm.plugin.appbrand.extendplugin.b;
        jc1.d dVar = jc1.f.f298915d;
        if (!z18) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "convertResourcePathToLocalPath, invokeContext is not AppBrandInvokeContext");
            if (fVar != null) {
                fVar.a(dVar);
            }
            if (aVar != null) {
                aVar.a(str);
                return;
            }
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "convertResourcePathToLocalPath, resourcePath is null");
            fVar.d("fail:resource path is empty", jc1.f.f298919h);
            if (aVar != null) {
                aVar.a(str);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.l m17 = fVar.m();
        if (m17 != null) {
            xf1.f.e(m17, str, z17, str2, new bg1.e(this, aVar, fVar, str));
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "convertResourcePathToLocalPath, component is null");
        fVar.a(dVar);
        if (aVar != null) {
            aVar.a(str);
        }
    }

    public final xf1.i d(sf.f fVar) {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime a17 = tf1.h.a(fVar);
        if (a17 != null) {
            return (xf1.i) a17.k(xf1.i.class);
        }
        return null;
    }

    public void e(sf.f fVar, android.graphics.Bitmap bitmap) {
        if (fVar instanceof com.tencent.mm.plugin.appbrand.extendplugin.b) {
            if (bitmap == null || bitmap.isRecycled()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "operateSnapshot, bitmap is null");
                fVar.a(jc1.g.f298934f);
                return;
            }
            com.tencent.mm.plugin.appbrand.jsapi.l m17 = fVar.m();
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            ik1.b0 b0Var = new ik1.b0();
            if (m17.getFileSystem() == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "operateSnapshot, file system is null");
                h(bitmap);
                fVar.a(jc1.f.f298915d);
                return;
            }
            com.tencent.mm.vfs.r6 allocTempFile = m17.getFileSystem().allocTempFile("liveplayer_" + java.lang.System.currentTimeMillis() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG);
            jc1.d dVar = jc1.g.f298935g;
            if (allocTempFile == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "operateSnapshot, tempFile is null");
                h(bitmap);
                fVar.a(dVar);
                return;
            }
            try {
                com.tencent.mm.sdk.platformtools.x.D0(bitmap, 90, android.graphics.Bitmap.CompressFormat.JPEG, allocTempFile.o(), true);
                if (m17.getFileSystem().createTempFileFrom(allocTempFile, "jpg", true, b0Var) != com.tencent.mm.plugin.appbrand.appstorage.j1.OK) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "operateSnapshot, save snapshot failed");
                    h(bitmap);
                    fVar.a(dVar);
                    return;
                }
                com.tencent.mm.vfs.r6 absoluteFile = m17.getFileSystem().getAbsoluteFile((java.lang.String) b0Var.f291824a);
                com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "operateSnapshot, realPath: %s, path:%s", (absoluteFile == null || !absoluteFile.m()) ? "" : com.tencent.mm.vfs.w6.i(absoluteFile.o(), false), b0Var.f291824a);
                h(bitmap);
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("tempImagePath", b0Var.f291824a);
                hashMap.put("width", java.lang.Integer.valueOf(width));
                hashMap.put("height", java.lang.Integer.valueOf(height));
                fVar.b(jc1.f.f298912a, hashMap);
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "operateSnapshot, save bitmap exception", e17);
                h(bitmap);
                fVar.a(dVar);
            }
        }
    }

    public void f(yf.i0 i0Var, sf.f fVar) {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime a17;
        this.f19894e = false;
        a();
        fb1.e.f260836e.F3(fb1.d.f260833h, false, i0Var.w());
        if (fVar != null) {
            com.tencent.mm.plugin.appbrand.x0.e(fVar.getAppId(), this.f19897h);
        }
        this.f19897h = null;
        xf1.i d17 = d(fVar);
        if (d17 != null && (a17 = tf1.h.a(fVar)) != null) {
            com.tencent.mars.xlog.Log.i(d17.f454237d, "onPushEnd, runtime:%s, LivePusher:%s", a17.f74803n, i0Var.g());
            d17.c(a17, 2);
            a17.c0(d17);
        }
        tf.m0 m0Var = this.f19899j;
        if (m0Var != null) {
            m0Var.onStop();
        } else {
            this.f19900k = 6;
        }
    }

    public void g(yf.i0 i0Var, sf.f fVar, android.os.Bundle bundle) {
        boolean z17;
        this.f19890a = bundle.getBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_MIC, this.f19890a);
        this.f19891b = bundle.getBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_CAMERA, this.f19891b);
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "registerForBackgroundVOIPIfNeed enableMic:%b, enableCamera:%b", java.lang.Boolean.valueOf(this.f19890a), java.lang.Boolean.valueOf(this.f19891b));
        a();
        boolean z18 = bundle.getBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.IS_VOIP, this.f19892c);
        this.f19892c = z18;
        if (z18) {
            xf1.i d17 = d(fVar);
            com.tencent.mm.plugin.appbrand.AppBrandRuntime a17 = tf1.h.a(fVar);
            if (d17 == null) {
                d17 = new xf1.i(a17);
                a17.l(d17);
                z17 = true;
            } else {
                z17 = false;
            }
            if (i0Var != null) {
                d17.f454239f = i0Var;
                com.tencent.mars.xlog.Log.i(d17.f454237d, "registerLivePusher:%s", i0Var.g());
            }
            d17.b(tf1.h.a(fVar), this.f19890a);
            if (z17 && this.f19894e) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "registerForBackgroundVOIPIfNeed, is pushing");
                com.tencent.mm.plugin.appbrand.AppBrandRuntime a18 = tf1.h.a(fVar);
                com.tencent.mars.xlog.Log.i(d17.f454237d, "onPushBegin, runtime:%s, LivePusher:%s", a18.f74803n, i0Var.g());
                d17.c(a18, 1);
            }
        }
    }

    public final void h(android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "bitmap recycle " + bitmap.toString());
        bitmap.recycle();
    }
}
