package yg;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad f543558a;

    public b(com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad magicbrush) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(magicbrush, "magicbrush");
        this.f543558a = magicbrush;
    }

    public static android.graphics.Bitmap e(yg.b bVar, android.graphics.Bitmap bitmap, int i17, java.lang.Object obj) {
        android.graphics.Bitmap a17;
        if ((i17 & 1) != 0) {
            bitmap = null;
        }
        com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 f17 = bVar.f(0);
        if (f17 == null) {
            return null;
        }
        gh.r rVar = f17.f130185e;
        if (rVar instanceof android.view.TextureView) {
            ah.i.b("MagicBrushView", "hy: trigger get bitmap in texture view. need sync ui thread", new java.lang.Object[0]);
            android.os.Handler handler = hh.i.f362976a;
            hh.h hVar = new hh.h(new hh.CallableC28453x3046d8(new gh.b0(bitmap, rVar)));
            hh.i.b(hVar);
            a17 = (android.graphics.Bitmap) hVar.b();
        } else {
            ah.i.b("MagicBrushView", "hy: trigger get bitmap int other views", new java.lang.Object[0]);
            com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad = f17.f130191n;
            if (c4209xd2d3ddad == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("magicbrush");
                throw null;
            }
            a17 = c4209xd2d3ddad.f130124o.a(f17.virtualElementId, -1, true);
        }
        return a17;
    }

    public final android.graphics.Bitmap a(int i17, int i18, boolean z17) {
        return b(i17, i18, z17, 2500L);
    }

    public final android.graphics.Bitmap b(final int i17, final int i18, final boolean z17, long j17) {
        java.lang.Object obj = null;
        if (i18 <= 0 && !z17) {
            return null;
        }
        if (this.f543558a.f130116g.g()) {
            return c(i17, i18, z17);
        }
        if (!z17) {
            ah.i.b("MagicBrush", "captureCanvasOnOtherThread", new java.lang.Object[0]);
            ch.g gVar = this.f543558a.f130116g;
            java.util.concurrent.Callable callable = new java.util.concurrent.Callable() { // from class: yg.b$$a
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    yg.b this$0 = yg.b.this;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this$0, "this$0");
                    return this$0.c(i17, i18, z17);
                }
            };
            gVar.getClass();
            hh.h hVar = new hh.h(callable);
            ch.a aVar = gVar.f122717d;
            if (aVar.g()) {
                hVar.run();
            } else {
                aVar.k(hVar, false);
            }
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) hVar.b();
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(bitmap == null);
            ah.i.b("MagicBrush", "ca done %b", objArr);
            return bitmap;
        }
        ah.i.b("MagicBrush", "hy: captureCanvasOnOtherThreadWaitingSwapDone", new java.lang.Object[0]);
        yg.c cVar = new yg.c(j17, this, i17, i18, z17);
        ch.g gVar2 = this.f543558a.f130116g;
        if (gVar2 == null) {
            ah.i.f86248a.d("MicroMsg.SDK.SyncTask", "null handler, task in exec thread, return now", new java.lang.Object[0]);
            cVar.a();
        } else {
            ah.i.b("MicroMsg.SDK.SyncTask", "sync task exec...", new java.lang.Object[0]);
            cVar.f362970c = android.os.SystemClock.elapsedRealtime();
            try {
                synchronized (cVar.f362969b) {
                    ah.i.b("MicroMsg.SDK.SyncTask", "sync task exec at synchronized", new java.lang.Object[0]);
                    gVar2.k(cVar.f362973f, false);
                    cVar.f362969b.wait(j17);
                }
            } catch (java.lang.InterruptedException e17) {
                ah.i.c("MicroMsg.SDK.SyncTask", e17, "", new java.lang.Object[0]);
            }
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - cVar.f362970c;
            ah.i.b("MicroMsg.SDK.SyncTask", "sync task done, return=%s, cost=%d(wait=%d, run=%d)", "" + cVar.f362968a, java.lang.Long.valueOf(elapsedRealtime), java.lang.Long.valueOf(cVar.f362971d), java.lang.Long.valueOf(elapsedRealtime - cVar.f362971d));
            obj = cVar.f362968a;
        }
        android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) obj;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        objArr2[0] = java.lang.Boolean.valueOf(bitmap2 == null);
        ah.i.b("MagicBrush.MBCanvasHandler", "hy: is ret bitmap is null? %b", objArr2);
        return bitmap2;
    }

    public final android.graphics.Bitmap c(int i17, int i18, boolean z17) {
        com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad = this.f543558a;
        if (c4209xd2d3ddad.f130110a == 0) {
            return null;
        }
        return z17 ? c4209xd2d3ddad.m34761x1789647b(c4209xd2d3ddad.f130110a, i17) : c4209xd2d3ddad.m34760xfc1e1967(c4209xd2d3ddad.f130110a, i18);
    }

    public final android.graphics.Bitmap d() {
        return e(this, null, 1, null);
    }

    public final com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 f(int i17) {
        com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 m34847xff3f9123 = this.f543558a.f130123n.m34847xff3f9123(i17);
        if (m34847xff3f9123 != null) {
            return m34847xff3f9123;
        }
        g8.g.a("MagicBrush", "findView [%d] but can not find. thread = [%s]", java.lang.Integer.valueOf(i17), java.lang.Thread.currentThread());
        return null;
    }
}
