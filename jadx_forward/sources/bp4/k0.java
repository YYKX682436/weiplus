package bp4;

/* loaded from: classes10.dex */
public final class k0 extends yt3.a implements android.view.View.OnClickListener {
    public boolean A;
    public final ru3.o B;
    public final bp4.c0 C;
    public bp4.c0 D;
    public long E;
    public final bp4.w2 F;
    public bp4.a3 G;
    public int H;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.c0 I;

    /* renamed from: J, reason: collision with root package name */
    public long f104742J;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18829x236e8cfd f104743f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18830xa8309efe f104744g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f104745h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.ViewGroup f104746i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 f104747m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 f104748n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.RectF f104749o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f104750p;

    /* renamed from: q, reason: collision with root package name */
    public final jp4.a f104751q;

    /* renamed from: r, reason: collision with root package name */
    public ml5.h f104752r;

    /* renamed from: s, reason: collision with root package name */
    public long f104753s;

    /* renamed from: t, reason: collision with root package name */
    public long f104754t;

    /* renamed from: u, reason: collision with root package name */
    public final android.graphics.RectF f104755u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.u0 f104756v;

    /* renamed from: w, reason: collision with root package name */
    public int f104757w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.TextView f104758x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f104759y;

    /* renamed from: z, reason: collision with root package name */
    public final android.graphics.Rect f104760z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18829x236e8cfd layout, com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18830xa8309efe operationLayout, ju3.d0 status) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operationLayout, "operationLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f104743f = layout;
        this.f104744g = operationLayout;
        this.f104745h = layout.getContext();
        android.view.ViewParent parent = layout.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
        this.f104746i = viewGroup;
        this.f104749o = new android.graphics.RectF();
        this.f104750p = new java.util.LinkedList();
        this.f104751q = new jp4.a();
        this.f104754t = -1L;
        this.f104755u = new android.graphics.RectF();
        this.f104758x = new android.widget.TextView(viewGroup.getContext());
        this.f104759y = "";
        this.f104760z = new android.graphics.Rect();
        this.B = ru3.o.f481297e;
        this.C = new bp4.j0(this, status);
        this.H = -1;
        this.I = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.c0();
        layout.m81870x2e3e4924(false);
        layout.m81944x1a60a7c5(true);
        layout.m81942x19adabd7(true);
        layout.m81946x1a747dba(true);
        layout.m81943x9ee45726(false);
        layout.setBackgroundColor(0);
        bp4.w2 w2Var = new bp4.w2(new bp4.y(this, status));
        this.F = w2Var;
        L(w2Var);
        operationLayout.showGridLine = false;
        operationLayout.setVisibility(8);
        operationLayout.m68092xe7dbb985(true);
    }

    public static /* synthetic */ void K(bp4.k0 k0Var, boolean z17, boolean z18, boolean z19, long j17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        if ((i17 & 2) != 0) {
            z18 = false;
        }
        if ((i17 & 4) != 0) {
            z19 = false;
        }
        if ((i17 & 8) != 0) {
            j17 = -1;
        }
        k0Var.J(z17, z18, z19, j17);
    }

    public final void A() {
        if (this.f104747m == null) {
            android.content.Context context = this.f104745h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "context");
            com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 textureViewSurfaceTextureListenerC22778x581fb68 = new com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68(context);
            this.f104747m = textureViewSurfaceTextureListenerC22778x581fb68;
            textureViewSurfaceTextureListenerC22778x581fb68.m82516xd24ee348(new bp4.d0(this));
            com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 textureViewSurfaceTextureListenerC22778x581fb682 = this.f104747m;
            if (textureViewSurfaceTextureListenerC22778x581fb682 != null) {
                textureViewSurfaceTextureListenerC22778x581fb682.m82517xf1b8b8ab(new bp4.e0(this));
            }
        }
    }

    public final void B() {
        com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 textureViewSurfaceTextureListenerC22778x581fb68 = this.f104747m;
        if (textureViewSurfaceTextureListenerC22778x581fb68 != null) {
            textureViewSurfaceTextureListenerC22778x581fb68.e();
        }
    }

    public final android.graphics.Rect C() {
        android.graphics.Rect rect;
        bp4.a3 a3Var = this.G;
        if (a3Var != null) {
            bp4.w2 w2Var = (bp4.w2) a3Var;
            rect = new android.graphics.Rect();
            ((bp4.y) w2Var.f104935d).f104960a.f104743f.getVisibilityRect().round(rect);
            android.graphics.RectF rectF = w2Var.f104940i;
            rect.offset(-((int) rectF.left), -((int) rectF.top));
        } else {
            rect = null;
        }
        if (rect != null) {
            return rect;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18829x236e8cfd c18829x236e8cfd = this.f104743f;
        android.graphics.Rect contentRect = c18829x236e8cfd.getContentRect();
        android.graphics.RectF visibilityRect = c18829x236e8cfd.getVisibilityRect();
        android.graphics.Rect rect2 = new android.graphics.Rect();
        visibilityRect.round(rect2);
        float width = (contentRect.width() * 1.0f) / c18829x236e8cfd.getContentOriginalRect().width();
        return new android.graphics.Rect((int) ((rect2.left - contentRect.left) / width), (int) ((rect2.top - contentRect.top) / width), (int) ((rect2.width() + r0) / width), (int) ((rect2.height() + r4) / width));
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.y D(java.lang.String path) {
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.y yVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.u0 u0Var = this.f104756v;
        if (u0Var != null && (linkedList = u0Var.f257266g) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) obj).f257149a, path)) {
                    break;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) obj;
            if (i1Var != null && (yVar = i1Var.f257157i) != null) {
                return yVar;
            }
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.y();
    }

    public final android.graphics.RectF E() {
        return this.f104749o;
    }

    public final void F() {
        this.f104744g.setVisibility(8);
    }

    public final void G() {
        this.f104744g.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.y H(ym5.x2 drawingView, java.lang.String mediaPath, boolean z17) {
        java.util.LinkedList linkedList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawingView, "drawingView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaPath, "mediaPath");
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var = null;
        this.G = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.u0 u0Var = this.f104756v;
        if (u0Var != null && (linkedList = u0Var.f257266g) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) next).f257149a, mediaPath)) {
                    i1Var = next;
                    break;
                }
            }
            i1Var = i1Var;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var2 = i1Var;
        this.f104759y = mediaPath;
        long j17 = i1Var2 != null ? i1Var2.f257152d : 0L;
        if ((j17 != this.f104754t || z17) && i1Var2 != null) {
            this.f104754t = j17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditMultiPreviewPlugin", "onPreviewImage");
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18829x236e8cfd c18829x236e8cfd = this.f104743f;
            c18829x236e8cfd.E(true);
            if (!this.A) {
                c18829x236e8cfd.m81944x1a60a7c5(true);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.GestureDetectorOnGestureListenerC17036x2d3a1200.d(this.f104744g, 0, 0L, 2, null);
            int i17 = i1Var2.f257154f;
            int i18 = i1Var2.f257155g;
            android.graphics.RectF visibilityRect = c18829x236e8cfd.getVisibilityRect();
            android.graphics.RectF rectF = this.f104755u;
            visibilityRect.set(rectF);
            boolean z18 = this.A;
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18830xa8309efe c18830xa8309efe = this.f104744g;
            if (!z18) {
                c18830xa8309efe.getVisibilityRect().set(rectF);
            }
            if (0 == this.f104753s) {
                this.f104753s = j17;
            }
            long j18 = this.f104753s;
            if (j18 == j17 || j18 == 0) {
                c18830xa8309efe.m68099x53b6de6f(this.B);
            } else {
                c18830xa8309efe.m68099x53b6de6f(ru3.o.f481298f);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.y yVar = i1Var2.f257157i;
            c18829x236e8cfd.m81920x7c800d89(yVar.f257322f);
            c18829x236e8cfd.m81922xe91e3cf7(yVar.f257323g);
            this.f104743f.G(drawingView, i17, i18, yVar.f257317a, ml5.k.f409963d, new bp4.f0(c18829x236e8cfd.getContentRect().isEmpty()));
            if (yVar.f257321e > 0.0f) {
                ((l45.n) drawingView.m177317xc879b3f2()).f397993a.m177310x5143ab24().m10952x4bb48fd8(1 / yVar.f257321e);
            }
            c18830xa8309efe.m68096x6f5d6aeb(new bp4.g0(this, j17, i1Var2));
            c18829x236e8cfd.m81923xb9da30c5(new bp4.h0(i1Var2, drawingView, this));
            c18829x236e8cfd.m81908xa2b9091a(this);
            if (!this.A) {
                c18830xa8309efe.setVisibility(0);
            }
            z();
            P();
            return yVar;
        }
        return D(mediaPath);
    }

    public final void I(boolean z17) {
        K(this, z17, true, false, 0L, 12, null);
    }

    public final void J(boolean z17, boolean z18, boolean z19, long j17) {
        int i17;
        bp4.c0 c0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditMultiPreviewPlugin", "onUpdateVideo, playAfterUpdate:" + z18 + ", seekToOriginPosition:" + z19 + ", seekTo:" + j17);
        this.f104759y = "";
        A();
        this.f104754t = -1L;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.u0 u0Var = this.f104756v;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var = u0Var != null ? u0Var.f257276t : null;
        this.f104748n = h1Var;
        if (h1Var != null) {
            h1Var.d(!z17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var2 = this.f104748n;
        if (h1Var2 != null) {
            for (bp4.z zVar : this.f104750p) {
                if (zVar instanceof bp4.b0) {
                    ((bp4.b0) zVar).b(h1Var2, j17, z19);
                }
            }
        }
        bp4.a3 a3Var = this.G;
        if (a3Var != null) {
            ((bp4.w2) a3Var).f104942n = false;
        }
        bp4.w2 w2Var = this.F;
        this.G = w2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.u0 u0Var2 = this.f104756v;
        if (u0Var2 != null) {
            new android.util.Size(u0Var2.f257269m, u0Var2.f257270n);
        }
        w2Var.f104944p = this.D;
        bp4.a3 a3Var2 = this.G;
        if (a3Var2 != null) {
            ((bp4.w2) a3Var2).f104942n = true;
        }
        bp4.i0 i0Var = new bp4.i0(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18830xa8309efe c18830xa8309efe = this.f104744g;
        c18830xa8309efe.m68096x6f5d6aeb(i0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18829x236e8cfd c18829x236e8cfd = this.f104743f;
        c18829x236e8cfd.m81908xa2b9091a(this);
        bp4.a3 a3Var3 = this.G;
        c18829x236e8cfd.m81923xb9da30c5(a3Var3 != null ? ((bp4.w2) a3Var3).f104946r : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var3 = this.f104748n;
        if (h1Var3 != null) {
            int i18 = this.H;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogComposition", "setFpsUpperLimit:" + i18);
            if (i18 > 0) {
                h1Var3.f257137j = i18;
            }
        }
        bp4.a3 a3Var4 = this.G;
        if (a3Var4 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var4 = this.f104748n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h1Var4);
            bp4.w2 w2Var2 = (bp4.w2) a3Var4;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onUpdate: playRange:");
            sb6.append(h1Var4.i());
            sb6.append(", trackList.size:");
            java.util.ArrayList arrayList = h1Var4.f257130c;
            sb6.append(arrayList.size());
            sb6.append(", playAfterUpdate:");
            sb6.append(z18);
            java.lang.String sb7 = sb6.toString();
            java.lang.String str = w2Var2.f104936e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
            bp4.y yVar = (bp4.y) w2Var2.f104935d;
            com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 a17 = yVar.a();
            android.view.ViewParent parent = a17.getParent();
            bp4.k0 k0Var = yVar.f104960a;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(parent, k0Var.f104746i)) {
                android.view.ViewParent parent2 = a17.getParent();
                android.view.ViewGroup viewGroup = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
                if (viewGroup != null) {
                    viewGroup.removeView(a17);
                }
                a17.setScaleX(1.0f);
                a17.setScaleY(1.0f);
                a17.setTranslationX(0.0f);
                a17.setTranslationY(0.0f);
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("videoView size width:");
                android.graphics.RectF rectF = w2Var2.f104940i;
                sb8.append(rectF.width());
                sb8.append(" height:");
                sb8.append(rectF.height());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb8.toString());
                android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams((int) rectF.width(), (int) rectF.height());
                layoutParams.topMargin = (int) rectF.top;
                layoutParams.addRule(14);
                k0Var.f104746i.addView(a17, 0, layoutParams);
            }
            if (!w2Var2.f104943o) {
                android.graphics.RectF visibilityRect = k0Var.f104743f.getVisibilityRect();
                android.graphics.RectF rectF2 = w2Var2.f104941m;
                visibilityRect.set(rectF2);
                k0Var.f104744g.getVisibilityRect().set(rectF2);
            }
            w2Var2.f104939h = h1Var4;
            w2Var2.f104938g = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) kz5.n0.a0(arrayList, 0);
            w2Var2.a();
            if (z18 && !z19 && j17 == -1) {
                yVar.a().o(h1Var4.e());
                k0Var.f104744g.postDelayed(new bp4.t2(w2Var2), 3000L);
                i17 = 0;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1468L, 10L);
                yVar.a().q(h1Var4.e(), z18, z19, j17);
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18830xa8309efe c18830xa8309efe2 = k0Var.f104744g;
                android.animation.ValueAnimator valueAnimator = c18830xa8309efe2.T;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                i17 = 0;
                c18830xa8309efe2.f237457y = 0;
                c18830xa8309efe2.invalidate();
            }
        } else {
            i17 = 0;
        }
        if (!this.A) {
            c18830xa8309efe.setVisibility(i17);
        }
        if (z18 && (c0Var = this.D) != null) {
            c0Var.mo10984xc84dc82d();
        }
        z();
    }

    public final void L(bp4.z callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.util.LinkedList linkedList = this.f104750p;
        if (linkedList.contains(callback)) {
            return;
        }
        linkedList.add(callback);
    }

    public final void M(long j17) {
        com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 textureViewSurfaceTextureListenerC22778x581fb68 = this.f104747m;
        if (textureViewSurfaceTextureListenerC22778x581fb68 != null) {
            textureViewSurfaceTextureListenerC22778x581fb68.j(j17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1468L, 0L);
    }

    public final void N(long j17, long j18) {
        com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 textureViewSurfaceTextureListenerC22778x581fb68 = this.f104747m;
        if (textureViewSurfaceTextureListenerC22778x581fb68 != null) {
            textureViewSurfaceTextureListenerC22778x581fb68.k(j17, j18);
        }
    }

    public final void O(android.graphics.RectF rect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "rect");
        bp4.w2 w2Var = this.F;
        w2Var.getClass();
        w2Var.f104941m.set(rect);
        this.f104755u.set(rect);
        if (this.A) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18830xa8309efe c18830xa8309efe = this.f104744g;
        c18830xa8309efe.getVisibilityRect().set(rect);
        c18830xa8309efe.postInvalidate();
        c18830xa8309efe.setVisibility(0);
    }

    public final void P() {
        bp4.a3 a3Var = this.G;
        jz5.f0 f0Var = null;
        if (a3Var != null) {
            bp4.w2 w2Var = (bp4.w2) a3Var;
            so4.g gVar = so4.g.f492309a;
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var = w2Var.f104938g;
            ((bp4.y) w2Var.f104935d).f104960a.f104758x.setText(dp4.b.f323795a.b(gVar.a(i1Var != null ? i1Var.f257149a : null)));
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            if (this.f104759y.length() > 0) {
                this.f104758x.setText(dp4.b.f323795a.b(so4.g.f492309a.a(this.f104759y)));
            }
        }
    }

    public final void Q(boolean z17, boolean z18, boolean z19) {
        int i17;
        float f17;
        bp4.w2 w2Var;
        bp4.k0 k0Var = this;
        android.content.Context context = k0Var.f104745h;
        android.graphics.Point h17 = com.p314xaae8f345.mm.ui.bk.h(context);
        int i18 = h17.x;
        int i19 = h17.y;
        android.util.Size size = new android.util.Size(i18, i19);
        bp4.w2 w2Var2 = k0Var.F;
        android.graphics.RectF rect = k0Var.f104749o;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18830xa8309efe c18830xa8309efe = k0Var.f104744g;
        if (!z19 || k0Var.f104756v == null) {
            float f18 = i18;
            float c17 = dq4.c.f323902a.c() * f18;
            float f19 = 0.5625f * f18;
            int h18 = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561190bu);
            int h19 = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561202c6);
            if (z18) {
                h19 = i65.a.b(context, 224) + i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
            }
            int h27 = (((com.p314xaae8f345.mm.ui.bk.h(context).y - h18) - h19) - (z17 ? i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn) : 0)) - com.p314xaae8f345.mm.ui.bl.c(context);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditMultiPreviewPlugin", "maxVisibleHeight:" + c17 + " ,validHeight:" + h27);
            float f27 = (float) h27;
            float min = java.lang.Math.min(c17, 1.0f * f27);
            c18830xa8309efe.m68094x1f059332(min);
            c18830xa8309efe.m68095x4d10a9a0(f19);
            c18830xa8309efe.b();
            if (min < c17) {
                float f28 = (1 - (min / c17)) * f18;
                i17 = 2;
                f17 = f28 / 2;
            } else {
                i17 = 2;
                f17 = 0.0f;
            }
            float f29 = h18 + ((f27 - min) / i17);
            rect.set(f17, f29, f18 - f17, min + f29);
        } else {
            float f37 = i18;
            float f38 = i19;
            float f39 = f37 / f38;
            dq4.c cVar = dq4.c.f323902a;
            float f47 = (1.0f / dq4.c.f323903b) + 0.01f;
            float c18 = 1.0f / cVar.c();
            android.graphics.RectF rectF = new android.graphics.RectF();
            c18830xa8309efe.setVisibility(8);
            ju3.d0 d0Var = k0Var.f546865d;
            if (f39 <= f39) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.u0 u0Var = k0Var.f104756v;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u0Var);
                int width = size.getWidth();
                int height = size.getHeight();
                android.graphics.Rect rect2 = new android.graphics.Rect();
                java.util.Iterator it = u0Var.f257266g.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) it.next();
                    java.util.Iterator it6 = it;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.y yVar = i1Var.f257157i;
                    bp4.w2 w2Var3 = w2Var2;
                    float f48 = width * (i1Var.f257155g / i1Var.f257154f);
                    ju3.d0 d0Var2 = d0Var;
                    int i27 = height;
                    float f49 = (height - f48) / 2;
                    yVar.f257320d.set(0, (int) f49, width, (int) (f48 + f49));
                    int width2 = size.getWidth() * size.getHeight();
                    android.graphics.Rect rect3 = yVar.f257320d;
                    if (width2 < rect3.width() * rect3.height()) {
                        rect2.set(0, 0, size.getWidth(), size.getHeight());
                    } else {
                        rect2.set(rect3);
                    }
                    android.graphics.Matrix matrix = yVar.f257317a;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.q0.b(matrix, new android.graphics.RectF(0.0f, 0.0f, i1Var.f257154f, i1Var.f257155g), new android.graphics.RectF(rect2));
                    float a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.q0.a(matrix);
                    yVar.f257321e = a17;
                    yVar.f257322f = 5.0f * a17;
                    yVar.f257323g = a17 * 0.25f;
                    i1Var.f257160l.f479047p = true;
                    it = it6;
                    height = i27;
                    w2Var2 = w2Var3;
                    d0Var = d0Var2;
                    width = width;
                }
                w2Var = w2Var2;
                float f57 = f37 / c18;
                float f58 = (f38 - f57) / 2;
                rectF.set(0.0f, f58, f37, f57 + f58);
                rect.set(0.0f, 0.0f, f37, f38);
                c18830xa8309efe.f257653p1 = false;
                ju3.c0 c0Var = ju3.c0.E1;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("PARAM_1_INT", 3);
                d0Var.w(c0Var, bundle);
                k0Var = this;
            } else {
                w2Var = w2Var2;
                if (f39 <= f47) {
                    k0Var = this;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.u0 u0Var2 = k0Var.f104756v;
                    if (u0Var2 != null) {
                        u0Var2.x(true, size);
                    }
                    float f59 = f37 / c18;
                    float f66 = (f38 - f59) / 2;
                    rectF.set(0.0f, f66, f37, f59 + f66);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.u0 u0Var3 = k0Var.f104756v;
                    if (u0Var3 != null) {
                        rect.set(u0Var3.t());
                    }
                    c18830xa8309efe.f257653p1 = false;
                    ju3.c0 c0Var2 = ju3.c0.E1;
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    bundle2.putInt("PARAM_1_INT", 3);
                    d0Var.w(c0Var2, bundle2);
                } else {
                    k0Var = this;
                    if (f39 <= c18) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.u0 u0Var4 = k0Var.f104756v;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u0Var4);
                        u0Var4.x(true, size);
                        float f67 = f37 / c18;
                        float f68 = (f38 - f67) / 2;
                        rectF.set(0.0f, f68, f37, f67 + f68);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.u0 u0Var5 = k0Var.f104756v;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u0Var5);
                        rect.set(u0Var5.t());
                        c18830xa8309efe.f257653p1 = false;
                        ju3.c0 c0Var3 = ju3.c0.E1;
                        android.os.Bundle bundle3 = new android.os.Bundle();
                        bundle3.putInt("PARAM_1_INT", 3);
                        d0Var.w(c0Var3, bundle3);
                    } else if (f39 <= 1.7777778f) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.u0 u0Var6 = k0Var.f104756v;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u0Var6);
                        u0Var6.x(true, size);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.u0 u0Var7 = k0Var.f104756v;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u0Var7);
                        rectF.set(u0Var7.t());
                        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.u0 u0Var8 = k0Var.f104756v;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u0Var8);
                        rect.set(u0Var8.t());
                        ju3.c0 c0Var4 = ju3.c0.E1;
                        android.os.Bundle bundle4 = new android.os.Bundle();
                        bundle4.putInt("PARAM_1_INT", 3);
                        d0Var.w(c0Var4, bundle4);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.u0 u0Var9 = k0Var.f104756v;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u0Var9);
                        u0Var9.x(true, size);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.u0 u0Var10 = k0Var.f104756v;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u0Var10);
                        rectF.set(u0Var10.t());
                        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.u0 u0Var11 = k0Var.f104756v;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u0Var11);
                        rect.set(u0Var11.t());
                        ju3.c0 c0Var5 = ju3.c0.E1;
                        android.os.Bundle bundle5 = new android.os.Bundle();
                        bundle5.putInt("PARAM_1_INT", 3);
                        d0Var.w(c0Var5, bundle5);
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18829x236e8cfd c18829x236e8cfd = k0Var.f104743f;
            c18829x236e8cfd.m81946x1a747dba(true);
            c18829x236e8cfd.m81944x1a60a7c5(false);
            c18829x236e8cfd.m81942x19adabd7(false);
            c18829x236e8cfd.m81945x31bc17b2(false);
            c18830xa8309efe.m68094x1f059332(rectF.height());
            c18830xa8309efe.m68095x4d10a9a0(rectF.height());
            c18830xa8309efe.getVisibilityRect().set(rectF);
            c18830xa8309efe.getMaxVisibilityRect().set(rect);
            c18830xa8309efe.postInvalidate();
            c18830xa8309efe.showGridLine = true;
            android.graphics.Rect rect4 = k0Var.f104760z;
            rectF.round(rect4);
            rect4.offset(-((int) rect.left), -((int) rect.top));
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.u0 u0Var12 = k0Var.f104756v;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u0Var12);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "maxVisibleRect");
            int i28 = 0;
            for (java.lang.Object obj : u0Var12.f257266g) {
                int i29 = i28 + 1;
                if (i28 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) obj;
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.y yVar2 = i1Var2.f257157i;
                if (i28 == 0) {
                    yVar2.f257320d.offset(-((int) rect.left), -((int) rect.top));
                }
                i1Var2.f257160l.f479045n.set(yVar2.f257320d);
                yVar2.f257319c.set(yVar2.f257320d);
                i28 = i29;
            }
            int i37 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22678xac4e51fa.f293183l1;
            c18829x236e8cfd.z(rectF, false);
            k0Var.A = true;
            c18829x236e8cfd.f257650p1 = true;
            c18830xa8309efe.f257651l1 = true;
            w2Var2 = w2Var;
            w2Var2.f104943o = true;
        }
        w2Var2.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "rect");
        w2Var2.f104940i.set(rect);
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.u0 u0Var13 = k0Var.f104756v;
        if (u0Var13 != null) {
            int width3 = (int) rect.width();
            int height2 = (int) rect.height();
            u0Var13.f257269m = width3;
            u0Var13.f257270n = height2;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/plugin/EditMultiPreviewPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ju3.d0.k(this.f546865d, ju3.c0.f383447x2, null, 2, null);
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/EditMultiPreviewPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    /* renamed from: onDetach */
    public void mo10989x3f5eee52() {
        com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 textureViewSurfaceTextureListenerC22778x581fb68 = this.f104747m;
        if (textureViewSurfaceTextureListenerC22778x581fb68 == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(textureViewSurfaceTextureListenerC22778x581fb68, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/EditMultiPreviewPlugin", "onDetach", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        textureViewSurfaceTextureListenerC22778x581fb68.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(textureViewSurfaceTextureListenerC22778x581fb68, "com/tencent/mm/plugin/vlog/ui/plugin/EditMultiPreviewPlugin", "onDetach", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // yt3.r2
    /* renamed from: release */
    public void mo9065x41012807() {
        com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 textureViewSurfaceTextureListenerC22778x581fb68 = this.f104747m;
        if (textureViewSurfaceTextureListenerC22778x581fb68 != null) {
            textureViewSurfaceTextureListenerC22778x581fb68.g();
            this.f104747m = null;
        }
        this.f104750p.clear();
    }

    @Override // yt3.r2
    /* renamed from: reset */
    public void mo9066x6761d4f() {
        this.f104753s = 0L;
        this.f104743f.E(true);
    }

    public final void z() {
        dp4.b bVar = dp4.b.f323795a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("FINDER_CONFIG_USER_KEY").getInt("USERINFO_FINDER_SHOW_IMAGE_ENHANCEMENT_SCENE_INT_SYNC", 0) == 1) {
            android.widget.TextView textView = this.f104758x;
            android.view.ViewParent parent = textView.getParent();
            android.view.ViewGroup viewGroup = this.f104746i;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(parent, viewGroup)) {
                return;
            }
            textView.setTextColor(-65536);
            int dimensionPixelSize = viewGroup.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
            textView.setTextSize(dimensionPixelSize);
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = ((int) this.f104749o.top) + dimensionPixelSize;
            layoutParams.rightMargin = dimensionPixelSize;
            layoutParams.addRule(10);
            layoutParams.addRule(21);
            viewGroup.addView(textView, 1, layoutParams);
        }
    }
}
