package bp4;

/* loaded from: classes10.dex */
public final class k2 extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.FrameLayout f104762f;

    /* renamed from: g, reason: collision with root package name */
    public qk.o9 f104763g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 f104764h;

    /* renamed from: i, reason: collision with root package name */
    public ct0.b f104765i;

    /* renamed from: m, reason: collision with root package name */
    public ym5.x2 f104766m;

    /* renamed from: n, reason: collision with root package name */
    public l45.q f104767n;

    /* renamed from: o, reason: collision with root package name */
    public final android.content.Context f104768o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashMap f104769p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f104770q;

    /* renamed from: r, reason: collision with root package name */
    public qk.g6 f104771r;

    /* renamed from: s, reason: collision with root package name */
    public int f104772s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(android.widget.FrameLayout photoLayout, ju3.d0 status) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(photoLayout, "photoLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f104762f = photoLayout;
        this.f104768o = photoLayout.getContext();
        this.f104769p = new java.util.HashMap();
        this.f104771r = qk.g6.DEFAULT;
        this.f104772s = -1;
    }

    public static final void z(bp4.k2 k2Var, android.view.MotionEvent motionEvent) {
        k2Var.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            k2Var.f104770q = false;
            return;
        }
        ju3.d0 d0Var = k2Var.f546865d;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                k2Var.f104770q = true;
                ju3.d0.k(d0Var, ju3.c0.K1, null, 2, null);
                return;
            } else if (actionMasked != 5 && actionMasked != 6) {
                return;
            }
        }
        if (k2Var.f104770q) {
            ju3.d0.k(d0Var, ju3.c0.L1, null, 2, null);
        } else {
            ju3.d0.k(d0Var, ju3.c0.J1, null, 2, null);
        }
    }

    public final void A() {
        qk.g6 g6Var = qk.g6.MOSAIC;
        this.f104771r = g6Var;
        this.f104772s = 1;
        l45.q qVar = this.f104767n;
        if (qVar != null) {
            new l45.a((l45.n) qVar).a(g6Var);
        }
        l45.q qVar2 = this.f104767n;
        if (qVar2 != null) {
            new l45.a((l45.n) qVar2).b(g6Var, 1, null);
        }
        nu3.i iVar = nu3.i.f421751a;
        nu3.i.c(iVar, "KEY_CLICK_BRUSH_COUNT_INT", 0, 2, null);
        iVar.b(9);
    }

    public final void B(int i17) {
        qk.g6 g6Var = qk.g6.DOODLE;
        this.f104771r = g6Var;
        this.f104772s = i17;
        l45.q qVar = this.f104767n;
        if (qVar != null) {
            new l45.a((l45.n) qVar).a(g6Var);
        }
        l45.q qVar2 = this.f104767n;
        if (qVar2 != null) {
            new l45.a((l45.n) qVar2).b(g6Var, i17, null);
        }
    }

    public final void C(java.lang.String sourcePath, yz5.q callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourcePath, "sourcePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        bp4.d2 d2Var = (bp4.d2) this.f104769p.get(sourcePath);
        qk.o9 o9Var = d2Var != null ? d2Var.f104674a : null;
        this.f104763g = o9Var;
        if (o9Var == null) {
            callback.mo147xb9724478(java.lang.Boolean.TRUE, sourcePath, java.lang.Boolean.FALSE);
            return;
        }
        com.p314xaae8f345.mm.p647x5a0af82.C10322x22f91ed2.a().f(sourcePath);
        um.f fVar = um.f.f510211c;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        fVar.b(sourcePath);
        nu3.i iVar = nu3.i.f421751a;
        qk.o9 o9Var2 = this.f104763g;
        qk.v7 b17 = o9Var2 != null ? o9Var2.b() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
        iVar.n("KEY_ADD_EMOJI_COUNT_INT", java.lang.Integer.valueOf(((f65.r) b17).b()));
        qk.o9 o9Var3 = this.f104763g;
        qk.v7 b18 = o9Var3 != null ? o9Var3.b() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b18);
        iVar.n("KEY_ADD_TEXT_COUNT_INT", java.lang.Integer.valueOf(((f65.r) b18).e()));
        qk.o9 o9Var4 = this.f104763g;
        qk.v7 b19 = o9Var4 != null ? o9Var4.b() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b19);
        iVar.n("KEY_ADD_DOODLE_COUNT_INT", java.lang.Integer.valueOf(((f65.r) b19).a()));
        qk.o9 o9Var5 = this.f104763g;
        qk.v7 b27 = o9Var5 != null ? o9Var5.b() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b27);
        iVar.n("KEY_ADD_DOODLE_COLOR_COUNT_INT", java.lang.Integer.valueOf(((f65.r) b27).d()));
        qk.o9 o9Var6 = this.f104763g;
        qk.v7 b28 = o9Var6 != null ? o9Var6.b() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b28);
        iVar.n("KEY_ADD_MOSAIC_COUNT_INT", java.lang.Integer.valueOf(((f65.r) b28).c()));
        qk.o9 o9Var7 = this.f104763g;
        qk.v7 b29 = o9Var7 != null ? o9Var7.b() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b29);
        iVar.n("KEY_ROTATE_INT", java.lang.Integer.valueOf(((f65.r) b29).h() ? 1 : 0));
        iVar.n("KEY_AFTER_EDIT_INT", 1);
        qk.o9 o9Var8 = this.f104763g;
        qk.v7 b37 = o9Var8 != null ? o9Var8.b() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b37);
        boolean g17 = ((f65.r) b37).g();
        iVar.n("KEY_PHOTO_IS_EDITED_BOOLEAN", java.lang.Boolean.valueOf(g17));
        iVar.h();
        if (g17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(985L, 118L, 1L, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(985L, 127L, 1L, false);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiPhotoEditContainerPlugin", "dofinish time: " + elapsedRealtime + ' ' + g17);
        qk.o9 o9Var9 = this.f104763g;
        if (o9Var9 != null) {
            o9Var9.g(new bp4.e2(elapsedRealtime, this, callback, g17), true);
        }
    }

    public final void D() {
        qk.g6 g6Var = qk.g6.MOSAIC;
        this.f104771r = g6Var;
        this.f104772s = 0;
        l45.q qVar = this.f104767n;
        if (qVar != null) {
            new l45.a((l45.n) qVar).a(g6Var);
        }
        l45.q qVar2 = this.f104767n;
        if (qVar2 != null) {
            new l45.a((l45.n) qVar2).b(g6Var, 0, null);
        }
        nu3.i iVar = nu3.i.f421751a;
        nu3.i.c(iVar, "KEY_CLICK_MOSAIC_COUNT_INT", 0, 2, null);
        iVar.b(8);
    }

    public final void E() {
        l45.q qVar = this.f104767n;
        if (qVar != null) {
            new l45.a((l45.n) qVar).b(um.f.f510211c.a(), -1, null);
        }
        l45.q qVar2 = this.f104767n;
        if (qVar2 != null) {
            new l45.a((l45.n) qVar2).a(this.f104771r);
        }
        l45.q qVar3 = this.f104767n;
        if (qVar3 != null) {
            new l45.a((l45.n) qVar3).b(this.f104771r, this.f104772s, null);
        }
    }

    public final ym5.x2 F(java.lang.String path) {
        android.os.Bundle bundle;
        float[] floatArray;
        bn5.f m177310x5143ab24;
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updatePhotoEdit path:");
        sb6.append(path);
        sb6.append(", photoLayout rect:[");
        android.widget.FrameLayout frameLayout = this.f104762f;
        sb6.append(frameLayout.getLeft());
        sb6.append(", ");
        sb6.append(frameLayout.getTop());
        sb6.append(", ");
        sb6.append(frameLayout.getRight());
        sb6.append(", ");
        sb6.append(frameLayout.getBottom());
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiPhotoEditContainerPlugin", sb6.toString());
        frameLayout.setVisibility(0);
        java.util.HashMap hashMap = this.f104769p;
        if (hashMap.get(path) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiPhotoEditContainerPlugin", "put new photo editor:".concat(path));
            ((wb0.e) ((xb0.e) i95.n0.c(xb0.e.class))).getClass();
            rj.l lVar = new rj.l();
            qk.l9 l9Var = new qk.l9();
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = this.f104764h;
            if (!(c16993xacc19624 != null && c16993xacc19624.F == 291)) {
                if (!(c16993xacc19624 != null && c16993xacc19624.F == 293)) {
                    if (!(c16993xacc19624 != null && c16993xacc19624.F == 294)) {
                        z17 = true;
                        l9Var.f445765b = z17;
                        l9Var.f445766c = false;
                        l9Var.f445769f = new android.graphics.Rect(frameLayout.getLeft(), frameLayout.getTop(), frameLayout.getRight(), frameLayout.getBottom());
                        l9Var.f445764a = qk.n9.PHOTO;
                        ct0.b bVar = this.f104765i;
                        l9Var.f445770g = bVar == null && bVar.f303739c;
                        l9Var.f445767d = path;
                        lVar.d(l9Var);
                        qk.s c17 = lVar.c(this.f104768o);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.view.PhotoDrawingView");
                        hashMap.put(path, new bp4.d2(lVar, (ym5.x2) c17));
                    }
                }
            }
            z17 = false;
            l9Var.f445765b = z17;
            l9Var.f445766c = false;
            l9Var.f445769f = new android.graphics.Rect(frameLayout.getLeft(), frameLayout.getTop(), frameLayout.getRight(), frameLayout.getBottom());
            l9Var.f445764a = qk.n9.PHOTO;
            ct0.b bVar2 = this.f104765i;
            l9Var.f445770g = bVar2 == null && bVar2.f303739c;
            l9Var.f445767d = path;
            lVar.d(l9Var);
            qk.s c172 = lVar.c(this.f104768o);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c172, "null cannot be cast to non-null type com.tencent.mm.view.PhotoDrawingView");
            hashMap.put(path, new bp4.d2(lVar, (ym5.x2) c172));
        }
        bp4.d2 d2Var = (bp4.d2) hashMap.get(path);
        this.f104763g = d2Var != null ? d2Var.f104674a : null;
        bp4.d2 d2Var2 = (bp4.d2) hashMap.get(path);
        this.f104766m = d2Var2 != null ? d2Var2.f104675b : null;
        com.p314xaae8f345.mm.p647x5a0af82.C10322x22f91ed2.a().f(path);
        um.f fVar = um.f.f510211c;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        fVar.b(path);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196242 = this.f104764h;
        if (c16993xacc196242 != null && (bundle = c16993xacc196242.M) != null && (floatArray = bundle.getFloatArray("matrix")) != null) {
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.setValues(floatArray);
            ym5.x2 x2Var = this.f104766m;
            if (x2Var != null && (m177310x5143ab24 = x2Var.m177310x5143ab24()) != null) {
                m177310x5143ab24.m10951x4988acca(matrix);
            }
        }
        ym5.x2 x2Var2 = this.f104766m;
        dn5.e eVar = x2Var2 != null ? (dn5.e) x2Var2.m177311xc3ab3d87() : null;
        if (eVar != null) {
            eVar.m125843x1adb0b7f(true);
        }
        ym5.x2 x2Var3 = this.f104766m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(x2Var3, "null cannot be cast to non-null type com.tencent.mm.view.PhotoDrawingView");
        l45.q m177317xc879b3f2 = x2Var3.m177317xc879b3f2();
        this.f104767n = m177317xc879b3f2;
        if (m177317xc879b3f2 != null) {
            ((l45.n) m177317xc879b3f2).f398000h = false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m177317xc879b3f2, "null cannot be cast to non-null type com.tencent.mm.presenter.DrawingPresenter");
        ((l45.n) m177317xc879b3f2).f398012t = new bp4.g2(this);
        ym5.x2 x2Var4 = this.f104766m;
        if (x2Var4 != null) {
            x2Var4.m160424xbe8e76ed(new bp4.h2(this));
        }
        l45.q qVar = this.f104767n;
        if (qVar != null) {
            dl.u uVar = (dl.u) ((l45.n) qVar).d(qk.g6.DOODLE);
            if (uVar != null) {
                uVar.f316586o = new bp4.i2(this);
            }
        }
        l45.q qVar2 = this.f104767n;
        if (qVar2 != null) {
            dl.d0 d0Var = (dl.d0) ((l45.n) qVar2).d(qk.g6.MOSAIC);
            if (d0Var != null) {
                d0Var.f316586o = new bp4.j2(this);
            }
        }
        android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(path);
        if (n07 != null) {
            nu3.i iVar = nu3.i.f421751a;
            iVar.n("KEY_ORIGIN_MEDIA_WIDTH_INT", java.lang.Integer.valueOf(n07.outWidth));
            iVar.n("KEY_ORIGIN_MEDIA_HEIGHT_INT", java.lang.Integer.valueOf(n07.outHeight));
        }
        ym5.x2 x2Var5 = this.f104766m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(x2Var5);
        return x2Var5;
    }

    @Override // yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        qk.g6 g6Var = this.f104771r;
        qk.g6 g6Var2 = qk.g6.CROP_PHOTO;
        if (g6Var != g6Var2) {
            return false;
        }
        this.f104771r = qk.g6.DEFAULT;
        l45.q qVar = this.f104767n;
        if (qVar != null) {
            new l45.a((l45.n) qVar).b(g6Var2, 1, null);
        }
        return true;
    }

    @Override // yt3.r2
    /* renamed from: onDetach */
    public void mo10989x3f5eee52() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiPhotoEditContainerPlugin", "release");
        java.util.HashMap hashMap = this.f104769p;
        java.util.Collection<bp4.d2> values = hashMap.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        for (bp4.d2 d2Var : values) {
            d2Var.f104674a.f();
            ((l45.n) d2Var.f104675b.m177317xc879b3f2()).p();
        }
        hashMap.clear();
    }

    @Override // yt3.r2
    /* renamed from: release */
    public void mo9065x41012807() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiPhotoEditContainerPlugin", "release");
        java.util.HashMap hashMap = this.f104769p;
        java.util.Collection<bp4.d2> values = hashMap.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        for (bp4.d2 d2Var : values) {
            d2Var.f104674a.f();
            ((l45.n) d2Var.f104675b.m177317xc879b3f2()).p();
        }
        hashMap.clear();
        android.widget.FrameLayout frameLayout = this.f104762f;
        frameLayout.removeAllViews();
        frameLayout.setVisibility(8);
        this.f104763g = null;
    }

    @Override // yt3.r2
    /* renamed from: reset */
    public void mo9066x6761d4f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiPhotoEditContainerPlugin", "reset");
        qk.g6 g6Var = qk.g6.DEFAULT;
        this.f104771r = g6Var;
        l45.q qVar = this.f104767n;
        if (qVar != null) {
            new l45.a((l45.n) qVar).a(g6Var);
        }
        l45.q qVar2 = this.f104767n;
        if (qVar2 != null) {
            new l45.a((l45.n) qVar2).b(g6Var, -1, null);
        }
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        this.f104762f.setVisibility(i17);
    }
}
