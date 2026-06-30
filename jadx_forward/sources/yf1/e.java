package yf1;

/* loaded from: classes7.dex */
public class e implements xf.a {

    /* renamed from: a, reason: collision with root package name */
    public wf.b f543171a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b f543172b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f543173c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f543174d = false;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f543175e = false;

    /* renamed from: f, reason: collision with root package name */
    public final u81.f f543176f = new yf1.d(this);

    public java.lang.String a(boolean z17, p012xc85e97e9.p093xedfae76a.y yVar, tf.w wVar) {
        fb1.c ec6 = fb1.e.f342369e.ec(fb1.d.f342367i, z17, new yf1.c(this, yVar, wVar));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "checkCanInsertLivePlayer, status: %s", ec6);
        if (ec6 instanceof fb1.a) {
            return ((fb1.a) ec6).f342360a;
        }
        return null;
    }

    public void b(sf.f fVar, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 a17 = tf1.h.a(fVar);
        if (a17 != null) {
            this.f543173c = a17.f156336n;
            a17.N.a(this.f543176f);
            boolean z17 = bundle.getBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15484xa8ac2395, this.f543174d);
            this.f543174d = z17;
            if (z17) {
                xf1.i iVar = (xf1.i) a17.k(xf1.i.class);
                if (iVar != null) {
                    wf.b bVar = this.f543171a;
                    iVar.f535773g.add(bVar);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(iVar.f535770d, "registerLivePlayer:%s", bVar.g());
                    return;
                }
                xf1.i iVar2 = new xf1.i(a17);
                a17.l(iVar2);
                wf.b bVar2 = this.f543171a;
                iVar2.f535773g.add(bVar2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(iVar2.f535770d, "registerLivePlayer:%s", bVar2.g());
            }
        }
    }

    public void c(int i17, int i18, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b bVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b bVar2;
        if (this.f543175e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "onXWebLivePlayerEvent, released");
            return;
        }
        if (i18 != -2301) {
            if (i18 == 2004) {
                if (this.f543174d) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "markVideoPlayStart, is voip mode");
                    return;
                }
                if (this.f543171a == null || (bVar2 = this.f543172b) == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "markVideoPlayStart, mPluginHandler or mInvokeContext is null");
                    return;
                }
                tf1.f a17 = tf.k.a(bVar2);
                if (a17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "markVideoPlayStart, audioOfVideoBackgroundPlayManager is null");
                    return;
                } else {
                    a17.n(this.f543171a);
                    return;
                }
            }
            if (i18 != 2006) {
                return;
            }
        }
        if (this.f543174d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "markVideoPlayPauseOrStop, is voip mode");
            return;
        }
        if (this.f543171a == null || (bVar = this.f543172b) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "markVideoPlayPauseOrStop, pluginHandler or invokeContext is null");
            return;
        }
        tf1.f a18 = tf.k.a(bVar);
        if (a18 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "markVideoPlayPauseOrStop, audioOfVideoBackgroundPlayManager is null");
        } else {
            a18.m(this.f543171a, true);
        }
    }

    public void d(sf.f fVar, android.graphics.Bitmap bitmap) {
        if (fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b) {
            if (bitmap == null || bitmap.isRecycled()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "operateSnapshot, bitmap is null");
                fVar.a(jc1.g.f380467f);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l m17 = fVar.m();
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            ik1.b0 b0Var = new ik1.b0();
            if (m17.mo50354x59eafec1() == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "operateSnapshot, file system is null");
                e(bitmap);
                fVar.a(jc1.f.f380448d);
                return;
            }
            com.p314xaae8f345.mm.vfs.r6 mo49614x6665a5c5 = m17.mo50354x59eafec1().mo49614x6665a5c5("liveplayer_" + java.lang.System.currentTimeMillis() + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG);
            jc1.d dVar = jc1.g.f380468g;
            if (mo49614x6665a5c5 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "operateSnapshot, tempFile is null");
                e(bitmap);
                fVar.a(dVar);
                return;
            }
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 90, android.graphics.Bitmap.CompressFormat.JPEG, mo49614x6665a5c5.o(), true);
                if (m17.mo50354x59eafec1().mo49619x6aa75256(mo49614x6665a5c5, "jpg", true, b0Var) != com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "operateSnapshot, save snapshot failed");
                    e(bitmap);
                    fVar.a(dVar);
                    return;
                }
                com.p314xaae8f345.mm.vfs.r6 mo49620x1d537609 = m17.mo50354x59eafec1().mo49620x1d537609((java.lang.String) b0Var.f373357a);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "operateSnapshot, realPath: %s, path:%s", (mo49620x1d537609 == null || !mo49620x1d537609.m()) ? "" : com.p314xaae8f345.mm.vfs.w6.i(mo49620x1d537609.o(), false), b0Var.f373357a);
                e(bitmap);
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("tempImagePath", b0Var.f373357a);
                hashMap.put("width", java.lang.Integer.valueOf(width));
                hashMap.put("height", java.lang.Integer.valueOf(height));
                fVar.b(jc1.f.f380445a, hashMap);
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "operateSnapshot, save bitmap exception", e17);
                e(bitmap);
                fVar.a(dVar);
            }
        }
    }

    public final void e(android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "bitmap recycle " + bitmap.toString());
        bitmap.recycle();
    }
}
