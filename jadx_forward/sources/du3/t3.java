package du3;

/* loaded from: classes10.dex */
public final class t3 extends yt3.a {
    public boolean A;
    public final int B;
    public boolean C;
    public boolean D;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f325252f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f325253g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f325254h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f325255i;

    /* renamed from: m, reason: collision with root package name */
    public final int f325256m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 f325257n;

    /* renamed from: o, reason: collision with root package name */
    public ct0.b f325258o;

    /* renamed from: p, reason: collision with root package name */
    public l45.q f325259p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f325260q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f325261r;

    /* renamed from: s, reason: collision with root package name */
    public qk.o9 f325262s;

    /* renamed from: t, reason: collision with root package name */
    public ym5.x2 f325263t;

    /* renamed from: u, reason: collision with root package name */
    public float f325264u;

    /* renamed from: v, reason: collision with root package name */
    public int f325265v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f325266w;

    /* renamed from: x, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f325267x;

    /* renamed from: y, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f325268y;

    /* renamed from: z, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f325269z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(ju3.d0 status, android.view.ViewGroup parent) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        this.f325252f = parent;
        this.f325253g = jz5.h.b(new du3.r3(this));
        this.f325254h = jz5.h.b(new du3.q3(this));
        this.f325255i = jz5.h.b(new du3.w2(this));
        this.f325256m = i65.a.b(parent.getContext(), 24);
        this.f325260q = jz5.h.b(du3.p3.f325211d);
        this.f325261r = jz5.h.b(du3.x2.f325299d);
        this.f325264u = 1.0f;
        this.f325265v = -1;
        this.f325267x = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
        this.B = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_photo_edit_improve_min_safe_rotate, 5);
    }

    public static final void z(du3.t3 t3Var, android.view.MotionEvent motionEvent) {
        t3Var.getClass();
        int actionMasked = motionEvent.getActionMasked();
        int i17 = t3Var.f325256m;
        if (actionMasked == 0) {
            t3Var.D = false;
            if (t3Var.B() && t3Var.A(motionEvent.getX(), motionEvent.getY())) {
                float f17 = i17;
                t3Var.C().setX(motionEvent.getX() - f17);
                t3Var.C().setY(motionEvent.getY() - f17);
                android.view.View C = t3Var.C();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(C, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoPreviewPlugin", "handleDispatch", "(Landroid/view/MotionEvent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(C, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoPreviewPlugin", "handleDispatch", "(Landroid/view/MotionEvent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                t3Var.D = true;
                t3Var.E().h7(1, false);
                if (t3Var.B()) {
                    if (!t3Var.A(motionEvent.getX(), motionEvent.getY())) {
                        if (t3Var.C().getVisibility() == 0) {
                            android.view.View C2 = t3Var.C();
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                            arrayList2.add(4);
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(C2, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoPreviewPlugin", "handleDispatch", "(Landroid/view/MotionEvent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            C2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                            yj0.a.f(C2, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoPreviewPlugin", "handleDispatch", "(Landroid/view/MotionEvent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            return;
                        }
                        return;
                    }
                    float f18 = i17;
                    t3Var.C().setX(motionEvent.getX() - f18);
                    t3Var.C().setY(motionEvent.getY() - f18);
                    if (t3Var.C().getVisibility() == 4) {
                        android.view.View C3 = t3Var.C();
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                        arrayList3.add(0);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(C3, arrayList3.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoPreviewPlugin", "handleDispatch", "(Landroid/view/MotionEvent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        C3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(C3, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoPreviewPlugin", "handleDispatch", "(Landroid/view/MotionEvent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        return;
                    }
                    return;
                }
                return;
            }
            if (actionMasked != 5 && actionMasked != 6) {
                return;
            }
        }
        if (t3Var.B()) {
            android.view.View C4 = t3Var.C();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(4);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(C4, arrayList4.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoPreviewPlugin", "handleDispatch", "(Landroid/view/MotionEvent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(C4, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoPreviewPlugin", "handleDispatch", "(Landroid/view/MotionEvent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (t3Var.D) {
            t3Var.E().h7(1, true);
        }
    }

    public final boolean A(float f17, float f18) {
        android.graphics.Rect rect;
        l45.q qVar = this.f325259p;
        if (qVar != null && qVar != null && (rect = ((l45.n) qVar).f398016x.f316574c) != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qVar);
            float[] a17 = ((l45.n) qVar).f398016x.a(f17, f18);
            if (rect.contains((int) a17[0], (int) a17[1])) {
                return true;
            }
        }
        return false;
    }

    public final boolean B() {
        if (E().R6(1)) {
            if (E().T6().f363257a == hk0.h.f363274f) {
                return true;
            }
        }
        return E().R6(5) && E().S6() == hk0.z0.f363398g;
    }

    public final android.view.View C() {
        return (android.view.View) ((jz5.n) this.f325255i).mo141623x754a37bb();
    }

    public final android.widget.FrameLayout D() {
        return (android.widget.FrameLayout) this.f325254h.mo141623x754a37bb();
    }

    public final hk0.u0 E() {
        return (hk0.u0) this.f325253g.mo141623x754a37bb();
    }

    public final void F(java.lang.String path, boolean z17) {
        qk.o9 o9Var;
        android.os.Bundle bundle;
        float[] floatArray;
        bn5.f m177310x5143ab24;
        boolean z18;
        ct0.b bVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.C = z17;
        boolean z19 = false;
        D().setVisibility(0);
        ct0.b bVar2 = this.f325258o;
        if (bVar2 != null && bVar2.f303749m) {
            java.lang.Object mo141623x754a37bb = ((jz5.n) this.f325261r).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            o9Var = (qk.o9) mo141623x754a37bb;
        } else {
            java.lang.Object mo141623x754a37bb2 = ((jz5.n) this.f325260q).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
            o9Var = (qk.o9) mo141623x754a37bb2;
        }
        this.f325262s = o9Var;
        com.p314xaae8f345.mm.p647x5a0af82.C10322x22f91ed2.a().g(path);
        qk.o9 o9Var2 = this.f325262s;
        if (o9Var2 != null) {
            qk.l9 l9Var = new qk.l9();
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = this.f325257n;
            if (!(c16993xacc19624 != null && c16993xacc19624.F == 291)) {
                if (!(c16993xacc19624 != null && c16993xacc19624.F == 293)) {
                    if (!(c16993xacc19624 != null && c16993xacc19624.F == 294)) {
                        z18 = true;
                        l9Var.f445765b = z18;
                        l9Var.f445766c = false;
                        l9Var.f445769f = new android.graphics.Rect(D().getLeft(), D().getTop(), D().getRight(), D().getBottom());
                        l9Var.f445764a = qk.n9.PHOTO;
                        bVar = this.f325258o;
                        if (bVar != null && bVar.f303739c) {
                            z19 = true;
                        }
                        l9Var.f445770g = z19;
                        l9Var.f445767d = path;
                        l9Var.f445768e = qk.m9.ImproveEditPhotoPreviewPlugin;
                        l9Var.f445775l = this.f325265v;
                        l9Var.f445776m = this.f325264u;
                        l9Var.f445777n = new du3.y2();
                        o9Var2.d(l9Var);
                    }
                }
            }
            z18 = false;
            l9Var.f445765b = z18;
            l9Var.f445766c = false;
            l9Var.f445769f = new android.graphics.Rect(D().getLeft(), D().getTop(), D().getRight(), D().getBottom());
            l9Var.f445764a = qk.n9.PHOTO;
            bVar = this.f325258o;
            if (bVar != null) {
                z19 = true;
            }
            l9Var.f445770g = z19;
            l9Var.f445767d = path;
            l9Var.f445768e = qk.m9.ImproveEditPhotoPreviewPlugin;
            l9Var.f445775l = this.f325265v;
            l9Var.f445776m = this.f325264u;
            l9Var.f445777n = new du3.y2();
            o9Var2.d(l9Var);
        }
        qk.o9 o9Var3 = this.f325262s;
        qk.s c17 = o9Var3 != null ? o9Var3.c(this.f325252f.getContext()) : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.view.PhotoDrawingView");
        this.f325263t = (ym5.x2) c17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196242 = this.f325257n;
        if (c16993xacc196242 != null && (bundle = c16993xacc196242.M) != null && (floatArray = bundle.getFloatArray("matrix")) != null) {
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.setValues(floatArray);
            ym5.x2 x2Var = this.f325263t;
            if (x2Var != null && (m177310x5143ab24 = x2Var.m177310x5143ab24()) != null) {
                m177310x5143ab24.m10951x4988acca(matrix);
            }
        }
        ym5.x2 x2Var2 = this.f325263t;
        dn5.e eVar = x2Var2 != null ? (dn5.e) x2Var2.m177311xc3ab3d87() : null;
        if (eVar != null) {
            eVar.m125843x1adb0b7f(true);
        }
        ym5.x2 x2Var3 = this.f325263t;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(x2Var3, "null cannot be cast to non-null type com.tencent.mm.view.PhotoDrawingView");
        l45.q m177317xc879b3f2 = x2Var3.m177317xc879b3f2();
        this.f325259p = m177317xc879b3f2;
        if (m177317xc879b3f2 != null) {
            ((l45.n) m177317xc879b3f2).f398017y = E();
        }
        l45.q qVar = this.f325259p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(qVar, "null cannot be cast to non-null type com.tencent.mm.presenter.DrawingPresenter");
        ((l45.n) qVar).f398012t = new du3.z2(this);
        D().addView(this.f325263t, new android.widget.FrameLayout.LayoutParams(-1, -1));
        ym5.x2 x2Var4 = this.f325263t;
        if (x2Var4 != null) {
            x2Var4.m160424xbe8e76ed(new du3.a3(this));
        }
        l45.q qVar2 = this.f325259p;
        if (qVar2 != null) {
            dl.u uVar = (dl.u) ((l45.n) qVar2).d(qk.g6.DOODLE);
            if (uVar != null) {
                uVar.f316586o = new du3.b3(this);
            }
        }
        l45.q qVar3 = this.f325259p;
        if (qVar3 != null) {
            dl.d0 d0Var = (dl.d0) ((l45.n) qVar3).d(qk.g6.MOSAIC);
            if (d0Var != null) {
                d0Var.f316586o = new du3.c3(this);
            }
        }
        android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(path);
        if (n07 != null) {
            nu3.i iVar = nu3.i.f421751a;
            iVar.n("KEY_ORIGIN_MEDIA_WIDTH_INT", java.lang.Integer.valueOf(n07.outWidth));
            iVar.n("KEY_ORIGIN_MEDIA_HEIGHT_INT", java.lang.Integer.valueOf(n07.outHeight));
        }
    }

    public final void G() {
        l45.q qVar = this.f325259p;
        qk.g6 g6Var = qk.g6.DEFAULT;
        if (qVar != null) {
            new l45.a((l45.n) qVar).a(g6Var);
        }
        l45.q qVar2 = this.f325259p;
        if (qVar2 != null) {
            new l45.a((l45.n) qVar2).b(g6Var, -1, null);
        }
    }

    public final void H() {
        nu3.i iVar = nu3.i.f421751a;
        qk.o9 o9Var = this.f325262s;
        qk.v7 b17 = o9Var != null ? o9Var.b() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
        iVar.n("KEY_ADD_EMOJI_COUNT_INT", java.lang.Integer.valueOf(((f65.r) b17).b()));
        qk.o9 o9Var2 = this.f325262s;
        qk.v7 b18 = o9Var2 != null ? o9Var2.b() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b18);
        iVar.n("KEY_ADD_TEXT_COUNT_INT", java.lang.Integer.valueOf(((f65.r) b18).e()));
        qk.o9 o9Var3 = this.f325262s;
        qk.v7 b19 = o9Var3 != null ? o9Var3.b() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b19);
        iVar.n("KEY_ADD_DOODLE_COUNT_INT", java.lang.Integer.valueOf(((f65.r) b19).a()));
        qk.o9 o9Var4 = this.f325262s;
        qk.v7 b27 = o9Var4 != null ? o9Var4.b() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b27);
        iVar.n("KEY_ADD_DOODLE_COLOR_COUNT_INT", java.lang.Integer.valueOf(((f65.r) b27).d()));
        qk.o9 o9Var5 = this.f325262s;
        qk.v7 b28 = o9Var5 != null ? o9Var5.b() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b28);
        iVar.n("KEY_ADD_MOSAIC_COUNT_INT", java.lang.Integer.valueOf(((f65.r) b28).c()));
        qk.o9 o9Var6 = this.f325262s;
        qk.v7 b29 = o9Var6 != null ? o9Var6.b() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b29);
        iVar.n("KEY_ROTATE_INT", java.lang.Integer.valueOf(((f65.r) b29).h() ? 1 : 0));
        l45.q qVar = this.f325259p;
        iVar.n("KEY_ZOOM_IN_OUT_COUNT", java.lang.Integer.valueOf(qVar != null ? ((l45.n) qVar).f398009q : 0));
        iVar.n("KEY_AFTER_EDIT_INT", 1);
        iVar.n("KEY_PEN_ERASER_WIDGET_COUNT", java.lang.Integer.valueOf(E().f363356q));
        iVar.n("KEY_PEN_ERASER_TRACE_COUNT", java.lang.Integer.valueOf(E().f363357r));
        iVar.n("KEY_MOSAIC_ERASER_WIDGET_COUNT", java.lang.Integer.valueOf(E().f363358s));
        iVar.n("KEY_MOSAIC_ERASER_TRACE_COUNT", java.lang.Integer.valueOf(E().f363359t));
    }

    @Override // yt3.r2
    /* renamed from: onAttach */
    public void mo10988x3b13c504() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "onAttach");
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f325267x;
        this.f325268y = p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new du3.f3(this, null), 3, null);
        this.f325269z = p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new du3.i3(this, null), 3, null);
        hk0.u0 E = E();
        du3.j3 j3Var = new du3.j3(this);
        E.getClass();
        E.f363349g.mo7806x9d92d11c(E.f363346d, j3Var);
        hk0.u0 E2 = E();
        du3.k3 k3Var = new du3.k3(this);
        E2.getClass();
        E2.f363350h.mo7806x9d92d11c(E2.f363346d, k3Var);
        E().Z6(10, new du3.l3(this));
        E().Z6(1, new du3.m3(this));
        E().Z6(5, new du3.n3(this));
        E().Z6(4, new du3.o3(this));
    }

    @Override // yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        hk0.o oVar = E().f363354o;
        boolean z17 = false;
        if ((oVar != null ? oVar.f363315a : 0) == 4) {
            l45.q qVar = this.f325259p;
            z17 = true;
            if (qVar != null) {
                new l45.a((l45.n) qVar).b(qk.g6.CROP_PHOTO, 1, null);
            }
            hk0.u0.e7(E(), 4, null, 2, null);
        }
        return z17;
    }

    @Override // yt3.r2
    /* renamed from: onDetach */
    public void mo10989x3f5eee52() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f325268y;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f325269z;
        if (r2Var2 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
        }
        G();
    }

    @Override // yt3.r2
    /* renamed from: release */
    public void mo9065x41012807() {
        p3325xe03a0797.p3326xc267989b.z0.e(this.f325267x, null, 1, null);
        l45.q qVar = this.f325259p;
        if (qVar != null) {
            l45.n nVar = (l45.n) qVar;
            try {
                java.util.Iterator it = nVar.f397996d.iterator();
                while (it.hasNext()) {
                    ((dl.b) it.next()).z();
                }
                nVar.p();
            } catch (java.lang.Exception unused) {
            }
        }
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f325260q).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((qk.o9) mo141623x754a37bb).f();
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) this.f325261r).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        ((qk.o9) mo141623x754a37bb2).f();
        D().removeAllViews();
        D().setVisibility(8);
    }

    @Override // yt3.r2
    public void t(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "initLogic");
    }
}
