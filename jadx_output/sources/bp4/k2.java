package bp4;

/* loaded from: classes10.dex */
public final class k2 extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.FrameLayout f23229f;

    /* renamed from: g, reason: collision with root package name */
    public qk.o9 f23230g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f23231h;

    /* renamed from: i, reason: collision with root package name */
    public ct0.b f23232i;

    /* renamed from: m, reason: collision with root package name */
    public ym5.x2 f23233m;

    /* renamed from: n, reason: collision with root package name */
    public l45.q f23234n;

    /* renamed from: o, reason: collision with root package name */
    public final android.content.Context f23235o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashMap f23236p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f23237q;

    /* renamed from: r, reason: collision with root package name */
    public qk.g6 f23238r;

    /* renamed from: s, reason: collision with root package name */
    public int f23239s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(android.widget.FrameLayout photoLayout, ju3.d0 status) {
        super(status, null);
        kotlin.jvm.internal.o.g(photoLayout, "photoLayout");
        kotlin.jvm.internal.o.g(status, "status");
        this.f23229f = photoLayout;
        this.f23235o = photoLayout.getContext();
        this.f23236p = new java.util.HashMap();
        this.f23238r = qk.g6.DEFAULT;
        this.f23239s = -1;
    }

    public static final void z(bp4.k2 k2Var, android.view.MotionEvent motionEvent) {
        k2Var.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            k2Var.f23237q = false;
            return;
        }
        ju3.d0 d0Var = k2Var.f465332d;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                k2Var.f23237q = true;
                ju3.d0.k(d0Var, ju3.c0.K1, null, 2, null);
                return;
            } else if (actionMasked != 5 && actionMasked != 6) {
                return;
            }
        }
        if (k2Var.f23237q) {
            ju3.d0.k(d0Var, ju3.c0.L1, null, 2, null);
        } else {
            ju3.d0.k(d0Var, ju3.c0.J1, null, 2, null);
        }
    }

    public final void A() {
        qk.g6 g6Var = qk.g6.MOSAIC;
        this.f23238r = g6Var;
        this.f23239s = 1;
        l45.q qVar = this.f23234n;
        if (qVar != null) {
            new l45.a((l45.n) qVar).a(g6Var);
        }
        l45.q qVar2 = this.f23234n;
        if (qVar2 != null) {
            new l45.a((l45.n) qVar2).b(g6Var, 1, null);
        }
        nu3.i iVar = nu3.i.f340218a;
        nu3.i.c(iVar, "KEY_CLICK_BRUSH_COUNT_INT", 0, 2, null);
        iVar.b(9);
    }

    public final void B(int i17) {
        qk.g6 g6Var = qk.g6.DOODLE;
        this.f23238r = g6Var;
        this.f23239s = i17;
        l45.q qVar = this.f23234n;
        if (qVar != null) {
            new l45.a((l45.n) qVar).a(g6Var);
        }
        l45.q qVar2 = this.f23234n;
        if (qVar2 != null) {
            new l45.a((l45.n) qVar2).b(g6Var, i17, null);
        }
    }

    public final void C(java.lang.String sourcePath, yz5.q callback) {
        kotlin.jvm.internal.o.g(sourcePath, "sourcePath");
        kotlin.jvm.internal.o.g(callback, "callback");
        bp4.d2 d2Var = (bp4.d2) this.f23236p.get(sourcePath);
        qk.o9 o9Var = d2Var != null ? d2Var.f23141a : null;
        this.f23230g = o9Var;
        if (o9Var == null) {
            callback.invoke(java.lang.Boolean.TRUE, sourcePath, java.lang.Boolean.FALSE);
            return;
        }
        com.tencent.mm.cache.ArtistCacheManager.a().f(sourcePath);
        um.f fVar = um.f.f428678c;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        fVar.b(sourcePath);
        nu3.i iVar = nu3.i.f340218a;
        qk.o9 o9Var2 = this.f23230g;
        qk.v7 b17 = o9Var2 != null ? o9Var2.b() : null;
        kotlin.jvm.internal.o.d(b17);
        iVar.n("KEY_ADD_EMOJI_COUNT_INT", java.lang.Integer.valueOf(((f65.r) b17).b()));
        qk.o9 o9Var3 = this.f23230g;
        qk.v7 b18 = o9Var3 != null ? o9Var3.b() : null;
        kotlin.jvm.internal.o.d(b18);
        iVar.n("KEY_ADD_TEXT_COUNT_INT", java.lang.Integer.valueOf(((f65.r) b18).e()));
        qk.o9 o9Var4 = this.f23230g;
        qk.v7 b19 = o9Var4 != null ? o9Var4.b() : null;
        kotlin.jvm.internal.o.d(b19);
        iVar.n("KEY_ADD_DOODLE_COUNT_INT", java.lang.Integer.valueOf(((f65.r) b19).a()));
        qk.o9 o9Var5 = this.f23230g;
        qk.v7 b27 = o9Var5 != null ? o9Var5.b() : null;
        kotlin.jvm.internal.o.d(b27);
        iVar.n("KEY_ADD_DOODLE_COLOR_COUNT_INT", java.lang.Integer.valueOf(((f65.r) b27).d()));
        qk.o9 o9Var6 = this.f23230g;
        qk.v7 b28 = o9Var6 != null ? o9Var6.b() : null;
        kotlin.jvm.internal.o.d(b28);
        iVar.n("KEY_ADD_MOSAIC_COUNT_INT", java.lang.Integer.valueOf(((f65.r) b28).c()));
        qk.o9 o9Var7 = this.f23230g;
        qk.v7 b29 = o9Var7 != null ? o9Var7.b() : null;
        kotlin.jvm.internal.o.d(b29);
        iVar.n("KEY_ROTATE_INT", java.lang.Integer.valueOf(((f65.r) b29).h() ? 1 : 0));
        iVar.n("KEY_AFTER_EDIT_INT", 1);
        qk.o9 o9Var8 = this.f23230g;
        qk.v7 b37 = o9Var8 != null ? o9Var8.b() : null;
        kotlin.jvm.internal.o.d(b37);
        boolean g17 = ((f65.r) b37).g();
        iVar.n("KEY_PHOTO_IS_EDITED_BOOLEAN", java.lang.Boolean.valueOf(g17));
        iVar.h();
        if (g17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 118L, 1L, false);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 127L, 1L, false);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiPhotoEditContainerPlugin", "dofinish time: " + elapsedRealtime + ' ' + g17);
        qk.o9 o9Var9 = this.f23230g;
        if (o9Var9 != null) {
            o9Var9.g(new bp4.e2(elapsedRealtime, this, callback, g17), true);
        }
    }

    public final void D() {
        qk.g6 g6Var = qk.g6.MOSAIC;
        this.f23238r = g6Var;
        this.f23239s = 0;
        l45.q qVar = this.f23234n;
        if (qVar != null) {
            new l45.a((l45.n) qVar).a(g6Var);
        }
        l45.q qVar2 = this.f23234n;
        if (qVar2 != null) {
            new l45.a((l45.n) qVar2).b(g6Var, 0, null);
        }
        nu3.i iVar = nu3.i.f340218a;
        nu3.i.c(iVar, "KEY_CLICK_MOSAIC_COUNT_INT", 0, 2, null);
        iVar.b(8);
    }

    public final void E() {
        l45.q qVar = this.f23234n;
        if (qVar != null) {
            new l45.a((l45.n) qVar).b(um.f.f428678c.a(), -1, null);
        }
        l45.q qVar2 = this.f23234n;
        if (qVar2 != null) {
            new l45.a((l45.n) qVar2).a(this.f23238r);
        }
        l45.q qVar3 = this.f23234n;
        if (qVar3 != null) {
            new l45.a((l45.n) qVar3).b(this.f23238r, this.f23239s, null);
        }
    }

    public final ym5.x2 F(java.lang.String path) {
        android.os.Bundle bundle;
        float[] floatArray;
        bn5.f baseBoardView;
        boolean z17;
        kotlin.jvm.internal.o.g(path, "path");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updatePhotoEdit path:");
        sb6.append(path);
        sb6.append(", photoLayout rect:[");
        android.widget.FrameLayout frameLayout = this.f23229f;
        sb6.append(frameLayout.getLeft());
        sb6.append(", ");
        sb6.append(frameLayout.getTop());
        sb6.append(", ");
        sb6.append(frameLayout.getRight());
        sb6.append(", ");
        sb6.append(frameLayout.getBottom());
        sb6.append(']');
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiPhotoEditContainerPlugin", sb6.toString());
        frameLayout.setVisibility(0);
        java.util.HashMap hashMap = this.f23236p;
        if (hashMap.get(path) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiPhotoEditContainerPlugin", "put new photo editor:".concat(path));
            ((wb0.e) ((xb0.e) i95.n0.c(xb0.e.class))).getClass();
            rj.l lVar = new rj.l();
            qk.l9 l9Var = new qk.l9();
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.f23231h;
            if (!(recordConfigProvider != null && recordConfigProvider.F == 291)) {
                if (!(recordConfigProvider != null && recordConfigProvider.F == 293)) {
                    if (!(recordConfigProvider != null && recordConfigProvider.F == 294)) {
                        z17 = true;
                        l9Var.f364232b = z17;
                        l9Var.f364233c = false;
                        l9Var.f364236f = new android.graphics.Rect(frameLayout.getLeft(), frameLayout.getTop(), frameLayout.getRight(), frameLayout.getBottom());
                        l9Var.f364231a = qk.n9.PHOTO;
                        ct0.b bVar = this.f23232i;
                        l9Var.f364237g = bVar == null && bVar.f222206c;
                        l9Var.f364234d = path;
                        lVar.d(l9Var);
                        qk.s c17 = lVar.c(this.f23235o);
                        kotlin.jvm.internal.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.view.PhotoDrawingView");
                        hashMap.put(path, new bp4.d2(lVar, (ym5.x2) c17));
                    }
                }
            }
            z17 = false;
            l9Var.f364232b = z17;
            l9Var.f364233c = false;
            l9Var.f364236f = new android.graphics.Rect(frameLayout.getLeft(), frameLayout.getTop(), frameLayout.getRight(), frameLayout.getBottom());
            l9Var.f364231a = qk.n9.PHOTO;
            ct0.b bVar2 = this.f23232i;
            l9Var.f364237g = bVar2 == null && bVar2.f222206c;
            l9Var.f364234d = path;
            lVar.d(l9Var);
            qk.s c172 = lVar.c(this.f23235o);
            kotlin.jvm.internal.o.e(c172, "null cannot be cast to non-null type com.tencent.mm.view.PhotoDrawingView");
            hashMap.put(path, new bp4.d2(lVar, (ym5.x2) c172));
        }
        bp4.d2 d2Var = (bp4.d2) hashMap.get(path);
        this.f23230g = d2Var != null ? d2Var.f23141a : null;
        bp4.d2 d2Var2 = (bp4.d2) hashMap.get(path);
        this.f23233m = d2Var2 != null ? d2Var2.f23142b : null;
        com.tencent.mm.cache.ArtistCacheManager.a().f(path);
        um.f fVar = um.f.f428678c;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        fVar.b(path);
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider2 = this.f23231h;
        if (recordConfigProvider2 != null && (bundle = recordConfigProvider2.M) != null && (floatArray = bundle.getFloatArray("matrix")) != null) {
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.setValues(floatArray);
            ym5.x2 x2Var = this.f23233m;
            if (x2Var != null && (baseBoardView = x2Var.getBaseBoardView()) != null) {
                baseBoardView.setForceMatrix(matrix);
            }
        }
        ym5.x2 x2Var2 = this.f23233m;
        dn5.e eVar = x2Var2 != null ? (dn5.e) x2Var2.getBaseFooterView() : null;
        if (eVar != null) {
            eVar.setHideFooter(true);
        }
        ym5.x2 x2Var3 = this.f23233m;
        kotlin.jvm.internal.o.e(x2Var3, "null cannot be cast to non-null type com.tencent.mm.view.PhotoDrawingView");
        l45.q presenter = x2Var3.getPresenter();
        this.f23234n = presenter;
        if (presenter != null) {
            ((l45.n) presenter).f316467h = false;
        }
        kotlin.jvm.internal.o.e(presenter, "null cannot be cast to non-null type com.tencent.mm.presenter.DrawingPresenter");
        ((l45.n) presenter).f316479t = new bp4.g2(this);
        ym5.x2 x2Var4 = this.f23233m;
        if (x2Var4 != null) {
            x2Var4.setSelectedFeatureListener(new bp4.h2(this));
        }
        l45.q qVar = this.f23234n;
        if (qVar != null) {
            dl.u uVar = (dl.u) ((l45.n) qVar).d(qk.g6.DOODLE);
            if (uVar != null) {
                uVar.f235053o = new bp4.i2(this);
            }
        }
        l45.q qVar2 = this.f23234n;
        if (qVar2 != null) {
            dl.d0 d0Var = (dl.d0) ((l45.n) qVar2).d(qk.g6.MOSAIC);
            if (d0Var != null) {
                d0Var.f235053o = new bp4.j2(this);
            }
        }
        android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(path);
        if (n07 != null) {
            nu3.i iVar = nu3.i.f340218a;
            iVar.n("KEY_ORIGIN_MEDIA_WIDTH_INT", java.lang.Integer.valueOf(n07.outWidth));
            iVar.n("KEY_ORIGIN_MEDIA_HEIGHT_INT", java.lang.Integer.valueOf(n07.outHeight));
        }
        ym5.x2 x2Var5 = this.f23233m;
        kotlin.jvm.internal.o.d(x2Var5);
        return x2Var5;
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        qk.g6 g6Var = this.f23238r;
        qk.g6 g6Var2 = qk.g6.CROP_PHOTO;
        if (g6Var != g6Var2) {
            return false;
        }
        this.f23238r = qk.g6.DEFAULT;
        l45.q qVar = this.f23234n;
        if (qVar != null) {
            new l45.a((l45.n) qVar).b(g6Var2, 1, null);
        }
        return true;
    }

    @Override // yt3.r2
    public void onDetach() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiPhotoEditContainerPlugin", "release");
        java.util.HashMap hashMap = this.f23236p;
        java.util.Collection<bp4.d2> values = hashMap.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        for (bp4.d2 d2Var : values) {
            d2Var.f23141a.f();
            ((l45.n) d2Var.f23142b.getPresenter()).p();
        }
        hashMap.clear();
    }

    @Override // yt3.r2
    public void release() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiPhotoEditContainerPlugin", "release");
        java.util.HashMap hashMap = this.f23236p;
        java.util.Collection<bp4.d2> values = hashMap.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        for (bp4.d2 d2Var : values) {
            d2Var.f23141a.f();
            ((l45.n) d2Var.f23142b.getPresenter()).p();
        }
        hashMap.clear();
        android.widget.FrameLayout frameLayout = this.f23229f;
        frameLayout.removeAllViews();
        frameLayout.setVisibility(8);
        this.f23230g = null;
    }

    @Override // yt3.r2
    public void reset() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiPhotoEditContainerPlugin", "reset");
        qk.g6 g6Var = qk.g6.DEFAULT;
        this.f23238r = g6Var;
        l45.q qVar = this.f23234n;
        if (qVar != null) {
            new l45.a((l45.n) qVar).a(g6Var);
        }
        l45.q qVar2 = this.f23234n;
        if (qVar2 != null) {
            new l45.a((l45.n) qVar2).b(g6Var, -1, null);
        }
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        this.f23229f.setVisibility(i17);
    }
}
