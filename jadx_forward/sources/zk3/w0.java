package zk3;

/* loaded from: classes8.dex */
public final class w0 extends pk3.h {

    /* renamed from: d, reason: collision with root package name */
    public bk3.a f555050d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c f555051e;

    /* renamed from: f, reason: collision with root package name */
    public final int f555052f;

    /* renamed from: g, reason: collision with root package name */
    public final int f555053g;

    /* renamed from: h, reason: collision with root package name */
    public final zk3.o0 f555054h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f555052f = 10000;
        this.f555053g = 1000;
        this.f555054h = new zk3.o0(this, android.os.Looper.getMainLooper());
    }

    @Override // pk3.b
    public boolean M9(int i17) {
        return i17 == 1048576;
    }

    @Override // pk3.h
    public void O6(java.lang.Object obj) {
    }

    @Override // pk3.h
    public void P6(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c info, r45.fr4 animateData, java.lang.Object obj) {
        android.view.View decorView;
        android.graphics.Bitmap V6;
        java.lang.String[] strArr;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animateData, "animateData");
        this.f555051e = info;
        zk3.p0 p0Var = new zk3.p0(obj, this);
        if (view == null) {
            kk3.d.f(p0Var, 0, 1, null);
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085 : null;
        if (abstractActivityC21394xb3d2c0cf == null || (decorView = abstractActivityC21394xb3d2c0cf.m78510xe15784dd()) == null) {
            decorView = m158354x19263085().getWindow().getDecorView();
        }
        int width = decorView.getWidth();
        int height = m158354x19263085().getWindow().getDecorView().getHeight();
        int i17 = info.f66793x2262335f;
        boolean z17 = i17 == 22 || i17 == 25;
        if (info.v0().m75933x41a8a7f2(7)) {
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.jvo);
            if (findViewById != null && z17 && findViewById.getVisibility() == 0) {
                info.v0().set(7, java.lang.Boolean.FALSE);
                V6 = V6(findViewById, width, height);
            } else {
                android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.jvd);
                if (findViewById2 != null) {
                    try {
                        int width2 = findViewById2.getWidth();
                        int height2 = findViewById2.getHeight();
                        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.RGB_565;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(config);
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(java.lang.Integer.valueOf(height2));
                        arrayList.add(java.lang.Integer.valueOf(width2));
                        java.lang.Object obj2 = new java.lang.Object();
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/plugin/multitask/ui/uic/SnapShotMultiTaskUIC", "getDefaultBitmap", "(Landroid/view/View;Z)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                        yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/multitask/ui/uic/SnapShotMultiTaskUIC", "getDefaultBitmap", "(Landroid/view/View;Z)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
                        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
                        android.graphics.drawable.Drawable background = findViewById2.getBackground();
                        if (background != null) {
                            background.draw(canvas);
                        }
                        V6 = createBitmap;
                    } catch (java.lang.Exception e17) {
                        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnapShotMultiTaskUIC", "%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                    }
                }
                V6 = null;
            }
        } else {
            android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.jvo);
            V6 = (findViewById3 != null && z17 && findViewById3.getVisibility() == 0) ? V6(findViewById3, width, height) : al3.b.f87382a.a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.u0.f232039a.c(info), null);
        }
        if (V6 == null || V6.isRecycled() || V6.getWidth() == 0 || V6.getHeight() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnapShotMultiTaskUIC", "startEnterAnim, page get bitmap is null");
            kk3.d.f(p0Var, 0, 1, null);
            return;
        }
        ((android.widget.ImageView) m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.ui9)).setImageBitmap(null);
        bk3.a aVar = this.f555050d;
        if (aVar != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar.getParent(), m80380x71e92c1d())) {
            android.view.View m80380x71e92c1d = m80380x71e92c1d();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m80380x71e92c1d, "null cannot be cast to non-null type android.widget.FrameLayout");
            ((android.widget.FrameLayout) m80380x71e92c1d).removeView(this.f555050d);
        }
        if (info.v0().m75933x41a8a7f2(7)) {
            android.graphics.Bitmap c17 = uj5.g.c(view.findViewById(com.p314xaae8f345.mm.R.id.jvh));
            this.f555050d = new bk3.b(view.getContext(), V6, c17);
            if (c17 != null) {
                int width3 = (width - c17.getWidth()) / 2;
                int height3 = (height - c17.getHeight()) / 2;
                bk3.a aVar2 = this.f555050d;
                if (aVar2 != null) {
                    aVar2.mo10671xa2b884ca(new android.graphics.Rect(width3, height3, width3 + c17.getWidth(), c17.getHeight() + height3));
                }
            }
        } else {
            this.f555050d = new bk3.c(view.getContext(), V6);
        }
        bk3.a aVar3 = this.f555050d;
        if (aVar3 != null) {
            aVar3.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        }
        android.view.View m80380x71e92c1d2 = m80380x71e92c1d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m80380x71e92c1d2, "null cannot be cast to non-null type android.widget.FrameLayout");
        ((android.widget.FrameLayout) m80380x71e92c1d2).addView(this.f555050d, 0);
        try {
            java.lang.String m75945x2fec8307 = animateData.m75945x2fec8307(1);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m75945x2fec8307)) {
                kk3.d.f(p0Var, 0, 1, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnapShotMultiTaskUIC", "startEnterAnim, snapPos is null or empty");
                return;
            }
            if (m75945x2fec8307 == null || (strArr = (java.lang.String[]) new r26.t(",").g(m75945x2fec8307, 0).toArray(new java.lang.String[0])) == null) {
                strArr = null;
            }
            if (strArr == null || strArr.length != 4) {
                kk3.d.f(p0Var, 0, 1, null);
                return;
            }
            android.view.View m80380x71e92c1d3 = m80380x71e92c1d();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(m80380x71e92c1d3, arrayList2.toArray(), "com/tencent/mm/plugin/multitask/ui/uic/SnapShotMultiTaskUIC", "startEnterAnim", "(Landroid/view/View;Lcom/tencent/mm/plugin/multitask/model/MultiTaskInfo;Lcom/tencent/mm/protocal/protobuf/MultiTaskAnimData;Lcom/tencent/mm/plugin/multitask/listener/OnMultiTaskFBTransformationListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m80380x71e92c1d3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(m80380x71e92c1d3, "com/tencent/mm/plugin/multitask/ui/uic/SnapShotMultiTaskUIC", "startEnterAnim", "(Landroid/view/View;Lcom/tencent/mm/plugin/multitask/model/MultiTaskInfo;Lcom/tencent/mm/protocal/protobuf/MultiTaskAnimData;Lcom/tencent/mm/plugin/multitask/listener/OnMultiTaskFBTransformationListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.graphics.Rect rect = new android.graphics.Rect(0, 0, width, height);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(strArr[0]);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(valueOf, "valueOf(...)");
            int intValue = valueOf.intValue();
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(strArr[1]);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(valueOf2, "valueOf(...)");
            int intValue2 = valueOf2.intValue();
            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(strArr[2]);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(valueOf3, "valueOf(...)");
            int intValue3 = valueOf3.intValue();
            java.lang.Integer valueOf4 = java.lang.Integer.valueOf(strArr[3]);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(valueOf4, "valueOf(...)");
            android.graphics.Rect rect2 = new android.graphics.Rect(intValue, intValue2, intValue3, valueOf4.intValue());
            int width4 = rect2.left + (rect2.width() / 2);
            int height4 = rect2.top + (rect2.height() / 2);
            float width5 = (rect.left + (rect.width() / 2)) - width4;
            float height5 = (rect.top + (rect.height() / 2)) - height4;
            float f17 = width;
            float width6 = rect2.width() / f17;
            bk3.a aVar4 = this.f555050d;
            if (aVar4 != null) {
                aVar4.setTranslationX(-width5);
            }
            bk3.a aVar5 = this.f555050d;
            if (aVar5 != null) {
                aVar5.setTranslationY(-height5);
            }
            bk3.a aVar6 = this.f555050d;
            if (aVar6 != null) {
                aVar6.setScaleX(width6);
            }
            bk3.a aVar7 = this.f555050d;
            if (aVar7 != null) {
                aVar7.setScaleY(width6);
            }
            if (!com.p314xaae8f345.mm.ui.bk.U()) {
                bk3.a aVar8 = this.f555050d;
                if (aVar8 != null) {
                    aVar8.mo10673x25f47287(new android.graphics.Rect(0, 0, width, height));
                }
                bk3.a aVar9 = this.f555050d;
                if (aVar9 != null) {
                    aVar9.c(width, height);
                }
            }
            float f18 = height;
            float height6 = (((f18 * width6) - rect2.height()) / 2) * (1 / width6);
            bk3.a aVar10 = this.f555050d;
            if (aVar10 != null) {
                aVar10.a(0.0f, height6, f17, f18 - height6);
            }
            bk3.a aVar11 = this.f555050d;
            if (aVar11 != null) {
                float f19 = ek3.e.f335142u / width6;
                aVar11.b(0.0f, 0.0f, 0.0f, 0.0f, f19, f19, f19, f19);
            }
            oa5.b.b(this.f555050d).m(0.0f).n(0.0f).e(1.0f).f(1.0f).k(new zk3.t0(width, height, width6, rect2, this)).h(new android.view.animation.DecelerateInterpolator()).p(new zk3.u0(p0Var, V6)).o(new zk3.v0(p0Var)).g(250L).l();
        } catch (java.lang.Exception e18) {
            kk3.d.f(p0Var, 0, 1, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnapShotMultiTaskUIC", "get pos value failed, %s", e18.getMessage());
        }
    }

    @Override // pk3.h
    public void R6() {
    }

    @Override // pk3.h
    public void S6() {
        W6();
        X6();
        android.content.Context context = m80380x71e92c1d().getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.class)).T6(true);
    }

    @Override // pk3.h
    public void T6() {
    }

    public final android.graphics.Bitmap V6(android.view.View view, int i17, int i18) {
        float f17 = i17;
        float f18 = i18;
        float f19 = f17 / f18;
        float width = view.getWidth() / view.getHeight();
        float height = f19 > width ? (view.getHeight() / f18) * f17 : view.getWidth();
        float height2 = f19 > width ? view.getHeight() : (view.getWidth() / f17) * f18;
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.RGB_565;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf((int) height2));
        arrayList.add(java.lang.Integer.valueOf((int) height));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/multitask/ui/uic/SnapShotMultiTaskUIC", "getVideoCoverBitmap", "(Landroid/view/View;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/multitask/ui/uic/SnapShotMultiTaskUIC", "getVideoCoverBitmap", "(Landroid/view/View;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        canvas.drawColor(-16777216);
        canvas.translate(f19 > width ? (height - view.getWidth()) / 2.0f : 0.0f, f19 <= width ? (height2 - view.getHeight()) / 2.0f : 0.0f);
        view.draw(canvas);
        return createBitmap;
    }

    public void W6() {
        boolean z17 = m80380x71e92c1d().getVisibility() == 8;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnapShotMultiTaskUIC", "hideSnapshotUIC, isInVisible:%b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            return;
        }
        android.view.View m80380x71e92c1d = m80380x71e92c1d();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m80380x71e92c1d, arrayList.toArray(), "com/tencent/mm/plugin/multitask/ui/uic/SnapShotMultiTaskUIC", "hideSnapshotUIC", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m80380x71e92c1d.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m80380x71e92c1d, "com/tencent/mm/plugin/multitask/ui/uic/SnapShotMultiTaskUIC", "hideSnapshotUIC", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View m80380x71e92c1d2 = m80380x71e92c1d();
        al3.b bVar = al3.b.f87382a;
        m80380x71e92c1d2.setTranslationX(0.0f - al3.b.f87383b);
        ((android.widget.ImageView) m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.ui9)).setImageBitmap(null);
        bk3.a aVar = this.f555050d;
        if (aVar != null) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar != null ? aVar.getParent() : null, m80380x71e92c1d())) {
                bk3.a aVar2 = this.f555050d;
                android.view.ViewParent parent = aVar2 != null ? aVar2.getParent() : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((android.view.ViewGroup) parent).removeView(this.f555050d);
                this.f555050d = null;
            }
        }
    }

    public void X6() {
        ((android.widget.ProgressBar) m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.ui_)).setVisibility(8);
        int i17 = this.f555053g;
        zk3.o0 o0Var = this.f555054h;
        o0Var.mo50303x856b99f0(i17);
        o0Var.mo50303x856b99f0(0);
    }

    public boolean Y6() {
        return m80380x71e92c1d().getVisibility() == 0;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bxl;
    }

    @Override // pk3.b
    public pk3.a i0() {
        return pk3.a.f437969f;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBeforeFinish */
    public void mo2275x62f76871(android.content.Intent intent) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onConfigurationChanged */
    public void mo2276x50e1c15d(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateBefore */
    public void mo2277xb2f1ab1a(android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onKeyDown */
    public boolean mo2278x1f03f0c2(int i17, android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onKeyUp */
    public boolean mo2279xafd962bb(int i17, android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onRequestPermissionsResult */
    public void mo2282x953457f1(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onRestoreInstanceState */
    public void mo2283xb949e58d(android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onSaveInstanceState */
    public void mo2285xa71a2260(android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStart */
    public void mo2286xb05099c3() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onStartActivityForResult */
    public void mo14640xb30cf874(android.content.Intent intent, int i17, android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleFocused */
    public void mo58275xd317978f() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleUnFocused */
    public void mo58437xaa858cb6() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f555052f = 10000;
        this.f555053g = 1000;
        this.f555054h = new zk3.o0(this, android.os.Looper.getMainLooper());
    }
}
