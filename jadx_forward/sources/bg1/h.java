package bg1;

/* loaded from: classes7.dex */
public class h implements zf.c {

    /* renamed from: i, reason: collision with root package name */
    public yf.i0 f101431i;

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f101423a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f101424b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f101425c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f101426d = false;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f101427e = false;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f101428f = null;

    /* renamed from: g, reason: collision with root package name */
    public mi1.w0 f101429g = null;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 f101430h = null;

    /* renamed from: j, reason: collision with root package name */
    public tf.m0 f101432j = null;

    /* renamed from: k, reason: collision with root package name */
    public int f101433k = -1;

    /* renamed from: l, reason: collision with root package name */
    public boolean f101434l = false;

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "blinkCapsuleBarOrDismiss");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new bg1.b(this));
            return;
        }
        if (!this.f101427e || !this.f101423a) {
            if (this.f101429g != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "dismissBlink");
                this.f101429g.mo147359x63a3b28a();
                this.f101429g = null;
                return;
            }
            return;
        }
        if (this.f101429g != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "blinkCapsuleBar, already blink");
        } else if (this.f101428f != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "blinkCapsuleBar");
            this.f101429g = mi1.c.a(this.f101428f).h(this.f101424b ? mi1.d.CAMERA : mi1.d.VOICE);
        }
    }

    public java.lang.String b(boolean z17, p012xc85e97e9.p093xedfae76a.y yVar, tf.w wVar) {
        fb1.c ec6 = fb1.e.f342369e.ec(fb1.d.f342366h, z17, new bg1.g(this, yVar, wVar));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "checkCanInsertLivePusher, status: %s", ec6);
        if (ec6 instanceof fb1.a) {
            return ((fb1.a) ec6).f342360a;
        }
        return null;
    }

    public void c(sf.f fVar, java.lang.String str, java.lang.String str2, boolean z17, zf.a aVar) {
        boolean z18 = fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b;
        jc1.d dVar = jc1.f.f380448d;
        if (!z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "convertResourcePathToLocalPath, invokeContext is not AppBrandInvokeContext");
            if (fVar != null) {
                fVar.a(dVar);
            }
            if (aVar != null) {
                aVar.a(str);
                return;
            }
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "convertResourcePathToLocalPath, resourcePath is null");
            fVar.d("fail:resource path is empty", jc1.f.f380452h);
            if (aVar != null) {
                aVar.a(str);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l m17 = fVar.m();
        if (m17 != null) {
            xf1.f.e(m17, str, z17, str2, new bg1.e(this, aVar, fVar, str));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "convertResourcePathToLocalPath, component is null");
        fVar.a(dVar);
        if (aVar != null) {
            aVar.a(str);
        }
    }

    public final xf1.i d(sf.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 a17 = tf1.h.a(fVar);
        if (a17 != null) {
            return (xf1.i) a17.k(xf1.i.class);
        }
        return null;
    }

    public void e(sf.f fVar, android.graphics.Bitmap bitmap) {
        if (fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b) {
            if (bitmap == null || bitmap.isRecycled()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "operateSnapshot, bitmap is null");
                fVar.a(jc1.g.f380467f);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l m17 = fVar.m();
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            ik1.b0 b0Var = new ik1.b0();
            if (m17.mo50354x59eafec1() == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "operateSnapshot, file system is null");
                h(bitmap);
                fVar.a(jc1.f.f380448d);
                return;
            }
            com.p314xaae8f345.mm.vfs.r6 mo49614x6665a5c5 = m17.mo50354x59eafec1().mo49614x6665a5c5("liveplayer_" + java.lang.System.currentTimeMillis() + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG);
            jc1.d dVar = jc1.g.f380468g;
            if (mo49614x6665a5c5 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "operateSnapshot, tempFile is null");
                h(bitmap);
                fVar.a(dVar);
                return;
            }
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 90, android.graphics.Bitmap.CompressFormat.JPEG, mo49614x6665a5c5.o(), true);
                if (m17.mo50354x59eafec1().mo49619x6aa75256(mo49614x6665a5c5, "jpg", true, b0Var) != com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "operateSnapshot, save snapshot failed");
                    h(bitmap);
                    fVar.a(dVar);
                    return;
                }
                com.p314xaae8f345.mm.vfs.r6 mo49620x1d537609 = m17.mo50354x59eafec1().mo49620x1d537609((java.lang.String) b0Var.f373357a);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "operateSnapshot, realPath: %s, path:%s", (mo49620x1d537609 == null || !mo49620x1d537609.m()) ? "" : com.p314xaae8f345.mm.vfs.w6.i(mo49620x1d537609.o(), false), b0Var.f373357a);
                h(bitmap);
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("tempImagePath", b0Var.f373357a);
                hashMap.put("width", java.lang.Integer.valueOf(width));
                hashMap.put("height", java.lang.Integer.valueOf(height));
                fVar.b(jc1.f.f380445a, hashMap);
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "operateSnapshot, save bitmap exception", e17);
                h(bitmap);
                fVar.a(dVar);
            }
        }
    }

    public void f(yf.i0 i0Var, sf.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 a17;
        this.f101427e = false;
        a();
        fb1.e.f342369e.F3(fb1.d.f342366h, false, i0Var.w());
        if (fVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.e(fVar.mo50271x74292566(), this.f101430h);
        }
        this.f101430h = null;
        xf1.i d17 = d(fVar);
        if (d17 != null && (a17 = tf1.h.a(fVar)) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d17.f535770d, "onPushEnd, runtime:%s, LivePusher:%s", a17.f156336n, i0Var.g());
            d17.c(a17, 2);
            a17.c0(d17);
        }
        tf.m0 m0Var = this.f101432j;
        if (m0Var != null) {
            m0Var.mo129542xc39f8281();
        } else {
            this.f101433k = 6;
        }
    }

    public void g(yf.i0 i0Var, sf.f fVar, android.os.Bundle bundle) {
        boolean z17;
        this.f101423a = bundle.getBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15514x177e2563, this.f101423a);
        this.f101424b = bundle.getBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15512xcf452269, this.f101424b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "registerForBackgroundVOIPIfNeed enableMic:%b, enableCamera:%b", java.lang.Boolean.valueOf(this.f101423a), java.lang.Boolean.valueOf(this.f101424b));
        a();
        boolean z18 = bundle.getBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15484xa8ac2395, this.f101425c);
        this.f101425c = z18;
        if (z18) {
            xf1.i d17 = d(fVar);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 a17 = tf1.h.a(fVar);
            if (d17 == null) {
                d17 = new xf1.i(a17);
                a17.l(d17);
                z17 = true;
            } else {
                z17 = false;
            }
            if (i0Var != null) {
                d17.f535772f = i0Var;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d17.f535770d, "registerLivePusher:%s", i0Var.g());
            }
            d17.b(tf1.h.a(fVar), this.f101423a);
            if (z17 && this.f101427e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "registerForBackgroundVOIPIfNeed, is pushing");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 a18 = tf1.h.a(fVar);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d17.f535770d, "onPushBegin, runtime:%s, LivePusher:%s", a18.f156336n, i0Var.g());
                d17.c(a18, 1);
            }
        }
    }

    public final void h(android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "bitmap recycle " + bitmap.toString());
        bitmap.recycle();
    }
}
