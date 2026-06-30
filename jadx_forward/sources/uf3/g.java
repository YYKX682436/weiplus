package uf3;

/* loaded from: classes12.dex */
public final class g extends mf3.e implements uf3.c, vf3.g, mg3.d, ml5.g, rf3.v {

    /* renamed from: o, reason: collision with root package name */
    public em.o1 f508717o;

    /* renamed from: p, reason: collision with root package name */
    public y51.c f508718p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f508719q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f508720r;

    /* renamed from: s, reason: collision with root package name */
    public int f508721s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(mf3.p apiCenter) {
        super(apiCenter, "MediaGallery.LivePreviewLayer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiCenter, "apiCenter");
        this.f508719q = "";
        this.f508720r = "";
        this.f508721s = -1;
    }

    @Override // vf3.g
    public void A(gg3.c videoParam, sf3.g imageParam, vf3.e state, vf3.f extraInfo) {
        mf3.k kVar;
        mf3.k kVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoParam, "videoParam");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageParam, "imageParam");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraInfo, "extraInfo");
        mf3.s sVar = this.f407643m;
        if (sVar == null || (kVar = sVar.f407650a) == null) {
            return;
        }
        java.lang.String mo2110x5db1b11 = kVar.mo2110x5db1b11();
        java.lang.String str = videoParam.f353259a;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, mo2110x5db1b11)) {
            P("onStateChanged apply abort. callback id: " + str + ", mediaId: " + kVar.mo2110x5db1b11(), new java.lang.Object[0]);
            return;
        }
        P("onLiveStateChanged apply: " + state.name() + " mediaId: " + kVar.mo2110x5db1b11() + " mediaLevel: " + kVar.mo147256x74bf41ce().name(), new java.lang.Object[0]);
        if (state == vf3.e.f517919p || state == vf3.e.f517918o) {
            uf3.a aVar = (uf3.a) g(uf3.a.class);
            if (aVar != null) {
                aVar.m(state, new vf3.f(null, null, 0, 0.0f, 15, null));
            }
            S(null);
            return;
        }
        vf3.a aVar2 = (vf3.a) H(vf3.a.class);
        vf3.b T4 = aVar2 != null ? aVar2.T4(kVar) : null;
        uf3.a aVar3 = (uf3.a) g(uf3.a.class);
        if (aVar3 != null) {
            aVar3.v(T4);
        }
        uf3.a aVar4 = (uf3.a) g(uf3.a.class);
        if (aVar4 != null) {
            aVar4.m(state, extraInfo);
        }
        mf3.w mo147256x74bf41ce = kVar.mo147256x74bf41ce();
        mf3.w wVar = mf3.w.f407661d;
        if (mo147256x74bf41ce != wVar) {
            int ordinal = state.ordinal();
            if (ordinal == 1 || ordinal == 4) {
                T(videoParam, imageParam);
                return;
            }
            if (ordinal != 6) {
                if (ordinal != 7) {
                    return;
                }
                U(imageParam);
                return;
            } else {
                mf3.s sVar2 = this.f407643m;
                if (sVar2 == null || (kVar2 = sVar2.f407650a) == null) {
                    return;
                }
                kVar2.f(wVar);
                return;
            }
        }
        int ordinal2 = state.ordinal();
        if (ordinal2 != 1) {
            if (ordinal2 == 3) {
                em.o1 o1Var = this.f508717o;
                if (o1Var == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
                    throw null;
                }
                o1Var.e().setVisibility(8);
                em.o1 o1Var2 = this.f508717o;
                if (o1Var2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
                    throw null;
                }
                o1Var2.a().setVisibility(0);
                em.o1 o1Var3 = this.f508717o;
                if (o1Var3 != null) {
                    o1Var3.a().setProgress(0);
                    return;
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
                    throw null;
                }
            }
            if (ordinal2 != 4) {
                if (ordinal2 == 5) {
                    S(K().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g09));
                    return;
                } else {
                    if (ordinal2 != 6) {
                        if (ordinal2 != 7) {
                            S(null);
                            return;
                        } else {
                            U(imageParam);
                            return;
                        }
                    }
                    return;
                }
            }
        }
        T(videoParam, imageParam);
    }

    @Override // mg3.d
    public void B(android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        mf3.o oVar = (mf3.o) g(mf3.o.class);
        if (oVar != null) {
            oVar.j();
        }
    }

    @Override // mf3.e, mf3.l
    public void F() {
        this.f407644n = true;
        em.o1 o1Var = this.f508717o;
        if (o1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        o1Var.d().setEnabled(true);
        cg3.a aVar = (cg3.a) H(cg3.a.class);
        if (aVar == null) {
            return;
        }
        aVar.u3(new uf3.f(this));
    }

    @Override // mf3.e, kg3.d
    public void H2() {
        Q("onVerticalUIApply", new java.lang.Object[0]);
        if (this.f508721s != 1) {
            em.o1 o1Var = this.f508717o;
            if (o1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
                throw null;
            }
            o1Var.e().setVisibility(4);
            y51.c cVar = this.f508718p;
            if (cVar != null) {
                ((y51.b) cVar).b();
            }
        }
        W(true);
        this.f508721s = 1;
    }

    @Override // mf3.e
    public android.view.View J(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ejl, (android.view.ViewGroup) null);
        this.f508717o = new em.o1(inflate);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    public final void S(java.lang.String str) {
        mf3.k kVar;
        java.lang.String str2;
        mf3.s sVar = this.f407643m;
        if (sVar == null || (kVar = sVar.f407650a) == null) {
            return;
        }
        em.o1 o1Var = this.f508717o;
        if (o1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        o1Var.i().setVisibility(4);
        em.o1 o1Var2 = this.f508717o;
        if (o1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        o1Var2.e().setVisibility(8);
        em.o1 o1Var3 = this.f508717o;
        if (o1Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        o1Var3.a().setVisibility(8);
        em.o1 o1Var4 = this.f508717o;
        if (o1Var4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        o1Var4.b().setVisibility(0);
        em.o1 o1Var5 = this.f508717o;
        if (o1Var5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        if (o1Var5.f336199e == null) {
            o1Var5.f336199e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) o1Var5.f336195a.findViewById(com.p314xaae8f345.mm.R.id.uam);
        }
        o1Var5.f336199e.setImageResource(com.p314xaae8f345.mm.R.raw.f80383x3bc8cb67);
        em.o1 o1Var6 = this.f508717o;
        if (o1Var6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        o1Var6.c().setText(K().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fjg));
        if (str != null) {
            em.o1 o1Var7 = this.f508717o;
            if (o1Var7 != null) {
                o1Var7.c().setText(str);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
                throw null;
            }
        }
        vf3.a aVar = (vf3.a) H(vf3.a.class);
        vf3.c S3 = aVar != null ? aVar.S3(kVar) : null;
        if (S3 == null || (str2 = S3.f517904a) == null) {
            return;
        }
        if (str2.length() > 0) {
            em.o1 o1Var8 = this.f508717o;
            if (o1Var8 != null) {
                o1Var8.c().setText(str2);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
                throw null;
            }
        }
    }

    public final void T(gg3.c cVar, sf3.g gVar) {
        cg3.a aVar;
        Q("resetUI", new java.lang.Object[0]);
        em.o1 o1Var = this.f508717o;
        if (o1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        o1Var.b().setVisibility(8);
        em.o1 o1Var2 = this.f508717o;
        if (o1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        o1Var2.a().setVisibility(8);
        em.o1 o1Var3 = this.f508717o;
        if (o1Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        o1Var3.a().setProgress(0);
        fg3.h hVar = (fg3.h) this.f407637d.a(fg3.h.class);
        if (hVar != null) {
            hVar.mo129545x6761d4f();
        }
        Q("onVideoLoadSuccess", new java.lang.Object[0]);
        mf3.s sVar = this.f407643m;
        if (sVar != null && sVar.f407652c) {
            java.lang.String mediaId = gVar.f488921b;
            java.lang.String str = gVar.f488923d;
            sf3.h hVar2 = gVar.f488925f;
            java.util.Map pathMap = (1 & 16) != 0 ? kz5.q0.f395534d : gVar.f488920a;
            java.lang.String previewPath = (16 & 4) != 0 ? "" : gVar.f488922c;
            java.lang.String detectPath = (8 & 16) != 0 ? "" : str;
            sf3.m detectType = (16 & 16) != 0 ? sf3.m.f488935d : null;
            sf3.h loadStrategy = (16 & 32) != 0 ? new sf3.b() : hVar2;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pathMap, "pathMap");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewPath, "previewPath");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(detectPath, "detectPath");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(detectType, "detectType");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadStrategy, "loadStrategy");
            sf3.m mVar = sf3.m.f488939h;
            sf3.g gVar2 = new sf3.g(pathMap, mediaId, previewPath, detectPath, null, loadStrategy, 16, null);
            java.lang.String str2 = (java.lang.String) gVar2.f488920a.get(mVar);
            if (str2 == null) {
                str2 = "";
            }
            gVar2.f488923d = str2;
            gVar2.f488924e = mVar;
            gVar2.f488925f = new sf3.b();
            em.o1 o1Var4 = this.f508717o;
            if (o1Var4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
                throw null;
            }
            o1Var4.i().e(gVar2);
            mf3.s sVar2 = this.f407643m;
            if (sVar2 != null) {
                sVar2.f407652c = false;
            }
        }
        em.o1 o1Var5 = this.f508717o;
        if (o1Var5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        o1Var5.i().e(gVar);
        java.lang.String c17 = gVar.c();
        if (this.f407644n && (aVar = (cg3.a) H(cg3.a.class)) != null) {
            aVar.o4(c17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (((z51.p) ((y51.b) r0).a(z51.p.class)).k() == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U(sf3.g r5) {
        /*
            r4 = this;
            y51.c r0 = r4.f508718p
            if (r0 == 0) goto L16
            y51.b r0 = (y51.b) r0
            java.lang.Class<z51.p> r1 = z51.p.class
            z51.x r0 = r0.a(r1)
            z51.p r0 = (z51.p) r0
            boolean r0 = r0.k()
            r1 = 1
            if (r0 != r1) goto L16
            goto L17
        L16:
            r1 = 0
        L17:
            r0 = 0
            java.lang.String r2 = "rootVB"
            if (r1 == 0) goto L37
            y51.c r1 = r4.f508718p
            if (r1 == 0) goto L26
            y51.b r1 = (y51.b) r1
            r1.b()
        L26:
            em.o1 r1 = r4.f508717o
            if (r1 == 0) goto L33
            android.widget.RelativeLayout r1 = r1.e()
            r3 = 4
            r1.setVisibility(r3)
            goto L37
        L33:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r2)
            throw r0
        L37:
            em.o1 r1 = r4.f508717o
            if (r1 == 0) goto L43
            com.tencent.mm.plugin.media.image.SwitchableImageContainer r0 = r1.i()
            r0.e(r5)
            return
        L43:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: uf3.g.U(sf3.g):void");
    }

    public void V() {
        mf3.k kVar;
        vf3.a aVar;
        mf3.s sVar = this.f407643m;
        if (sVar == null || (kVar = sVar.f407650a) == null || (aVar = (vf3.a) H(vf3.a.class)) == null) {
            return;
        }
        aVar.v2(kVar, this);
    }

    public final void W(boolean z17) {
        mf3.k kVar;
        float f17;
        float f18;
        em.o1 o1Var = this.f508717o;
        if (o1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a g17 = o1Var.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getNormalImage(...)");
        em.o1 o1Var2 = this.f508717o;
        if (o1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16501x5a606100 d17 = o1Var2.d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getLiveGestureContainer(...)");
        em.o1 o1Var3 = this.f508717o;
        if (o1Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1857x32b0ec.C16493x22c368e7 f19 = o1Var3.f();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f19, "getLiveSwitchableContainer(...)");
        em.o1 o1Var4 = this.f508717o;
        if (o1Var4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1856x5faa95b.C16491xb6370bb4 i17 = o1Var4.i();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = i17.f230095d;
        if (c21524xecd57b9a != null) {
            c21524xecd57b9a.i();
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f c21537x5f41189f = i17.sampleImageView;
        if (c21537x5f41189f != null) {
            c21537x5f41189f.i();
        }
        mf3.s sVar = this.f407643m;
        if (sVar == null || (kVar = sVar.f407650a) == null) {
            return;
        }
        vf3.a aVar = (vf3.a) H(vf3.a.class);
        vf3.d K = aVar != null ? aVar.K(kVar) : null;
        int mo79182x97cbed21 = K != null ? K.f517908d : g17.mo79182x97cbed21();
        int mo79180x47e2bd2c = K != null ? K.f517909e : g17.mo79180x47e2bd2c();
        java.lang.Boolean valueOf = (java.lang.Float.isNaN(g17.f279187q) || java.lang.Float.isInfinite(g17.f279187q)) ? null : java.lang.Boolean.valueOf(g17.G);
        boolean booleanValue = valueOf == null ? false : valueOf.booleanValue();
        if (mo79182x97cbed21 <= 0 || mo79180x47e2bd2c <= 0) {
            d17.m66626x9204e394(booleanValue);
            d17.O(f19, 1.0f, 1.0f, false);
            Q("resetGesture default, isLongVerticalImage=" + booleanValue, new java.lang.Object[0]);
            return;
        }
        float f27 = mo79180x47e2bd2c / mo79182x97cbed21;
        boolean z18 = f27 > 2.2f || booleanValue;
        boolean z19 = z17 && f19.getWidth() > f19.getHeight();
        android.content.Context K2 = K();
        android.app.Activity activity = K2 instanceof android.app.Activity ? (android.app.Activity) K2 : null;
        boolean z27 = activity != null && (com.p314xaae8f345.mm.ui.bk.N(activity.getTaskId()) || com.p314xaae8f345.mm.ui.bk.P(K()));
        Q("resetGesture removeListener containerWH: " + f19.getWidth() + '-' + f19.getHeight() + ", contentWH: " + mo79182x97cbed21 + '-' + mo79180x47e2bd2c + ", isScreenVertical: " + z17 + " imageRatio:" + f27 + " isLongVertical: " + z18 + " isPad: " + z19 + " isFoldScreenExpand: " + z27, new java.lang.Object[0]);
        if (!z17 || z18 || z19 || z27) {
            float width = f19.getWidth() / (f19.getHeight() / f27);
            em.o1 o1Var5 = this.f508717o;
            if (o1Var5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
                throw null;
            }
            o1Var5.h().U = true;
            em.o1 o1Var6 = this.f508717o;
            if (o1Var6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
                throw null;
            }
            o1Var6.h().invalidate();
            em.o1 o1Var7 = this.f508717o;
            if (o1Var7 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = o1Var7.e().getLayoutParams();
            layoutParams.height = -1;
            layoutParams.width = ((int) (f19.getHeight() / f27)) + 2;
            f17 = width;
            f18 = 1.0f;
        } else {
            f18 = f19.getHeight() / (f19.getWidth() * f27);
            em.o1 o1Var8 = this.f508717o;
            if (o1Var8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
                throw null;
            }
            o1Var8.h().invalidate();
            em.o1 o1Var9 = this.f508717o;
            if (o1Var9 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams2 = o1Var9.e().getLayoutParams();
            layoutParams2.height = ((int) (f19.getWidth() * f27)) + 2;
            layoutParams2.width = -1;
            f17 = 1.0f;
        }
        d17.m66628x23c5936a(new mg3.l(0.0f, 0.75f, 2.0f, 0.0f, 9, null));
        d17.m66626x9204e394(false);
        d17.O(f19, f17, f18, true);
    }

    public void X() {
        mf3.k kVar;
        java.lang.String str;
        java.lang.String str2;
        mf3.s sVar = this.f407643m;
        if (sVar == null || (kVar = sVar.f407650a) == null) {
            return;
        }
        gg3.c a17 = kVar.a();
        java.lang.String str3 = "";
        if (a17 == null || (str = a17.f353260b) == null) {
            str = "";
        }
        gg3.c a18 = kVar.a();
        if (a18 != null && (str2 = a18.f353261c) != null) {
            str3 = str2;
        }
        java.lang.Long j17 = r26.h0.j(kVar.mo2110x5db1b11());
        if (j17 == null) {
            throw new java.lang.RuntimeException("media id for live must can be converted to long");
        }
        long longValue = j17.longValue();
        if (this.f508718p != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, this.f508719q) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, this.f508720r)) {
            Q("initLivePlayer return, same live info, playerView: " + this.f508718p + ", liveThumbPath: " + this.f508719q + ", liveVideoPath: " + this.f508720r, new java.lang.Object[0]);
        } else {
            vf3.a aVar = (vf3.a) H(vf3.a.class);
            boolean c27 = aVar != null ? aVar.c2(kVar) : false;
            this.f508719q = str;
            this.f508720r = str3;
            Q("initLivePlayer, liveThumbPath: " + this.f508719q + " (isExist: " + com.p314xaae8f345.mm.vfs.w6.j(this.f508719q) + "), liveVideoPath: " + this.f508720r + " (isExist: " + com.p314xaae8f345.mm.vfs.w6.j(this.f508720r) + ") audioSupported: " + c27, new java.lang.Object[0]);
            java.lang.String r17 = i65.a.r(K(), com.p314xaae8f345.mm.R.C30867xcad56011.o4x);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getString(...)");
            a61.d dVar = new a61.d(false, null, true, false, true, r17, c27 ^ true, null, false, null);
            a61.c cVar = new a61.c(1, this.f508719q, true, this.f508720r, java.lang.Long.valueOf(longValue), new uf3.d(this), null);
            y51.c cVar2 = this.f508718p;
            if (cVar2 != null) {
                ((y51.b) cVar2).e();
            }
            this.f508718p = ((hs.z) ((qk.t7) i95.n0.c(qk.t7.class))).Ai(new a61.a(dVar, cVar), K());
            em.o1 o1Var = this.f508717o;
            if (o1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
                throw null;
            }
            o1Var.e().removeAllViews();
            em.o1 o1Var2 = this.f508717o;
            if (o1Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
                throw null;
            }
            android.widget.RelativeLayout e17 = o1Var2.e();
            java.lang.Object obj = this.f508718p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type android.view.View");
            e17.addView((android.view.View) obj, new android.view.ViewGroup.LayoutParams(-1, -1));
        }
        R();
        em.o1 o1Var3 = this.f508717o;
        if (o1Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        o1Var3.e().setVisibility(0);
        java.lang.Object obj2 = this.f508718p;
        if (obj2 != null) {
            y51.b bVar = (y51.b) obj2;
            if (((z51.p) bVar.a(z51.p.class)).k()) {
                return;
            }
            em.o1 o1Var4 = this.f508717o;
            if (o1Var4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
                throw null;
            }
            o1Var4.e().removeAllViews();
            em.o1 o1Var5 = this.f508717o;
            if (o1Var5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
                throw null;
            }
            o1Var5.e().addView((android.view.View) obj2, new android.view.ViewGroup.LayoutParams(-1, -1));
            Q("playerView start play", new java.lang.Object[0]);
            bVar.c();
        }
    }

    @Override // mf3.e, kg3.d
    public void h4() {
        Q("onHorizontalUIApply", new java.lang.Object[0]);
        if (this.f508721s != 2) {
            em.o1 o1Var = this.f508717o;
            if (o1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
                throw null;
            }
            o1Var.e().setVisibility(4);
            y51.c cVar = this.f508718p;
            if (cVar != null) {
                ((y51.b) cVar).b();
            }
        }
        W(false);
        this.f508721s = 2;
    }

    @Override // mf3.e, mf3.l
    public void i() {
        this.f407644n = false;
        y51.c cVar = this.f508718p;
        if (cVar != null) {
            ((y51.b) cVar).b();
        }
        em.o1 o1Var = this.f508717o;
        if (o1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        o1Var.d().setEnabled(false);
        em.o1 o1Var2 = this.f508717o;
        if (o1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1856x5faa95b.C16491xb6370bb4 i17 = o1Var2.i();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = i17.f230095d;
        if (c21524xecd57b9a != null) {
            c21524xecd57b9a.i();
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f c21537x5f41189f = i17.sampleImageView;
        if (c21537x5f41189f != null) {
            c21537x5f41189f.i();
        }
        R();
    }

    @Override // mg3.d
    public void k(android.view.MotionEvent e17) {
        mf3.k kVar;
        dg3.m mVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        mf3.s sVar = this.f407643m;
        if (sVar == null || (kVar = sVar.f407650a) == null || (mVar = (dg3.m) H(dg3.m.class)) == null) {
            return;
        }
        mVar.y6(kVar, this.f407637d);
    }

    @Override // mf3.l
    public mg3.b l() {
        em.o1 o1Var = this.f508717o;
        if (o1Var != null) {
            return o1Var.d();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
        throw null;
    }

    @Override // mf3.l
    /* renamed from: onPause */
    public void mo129547xb01dfb57() {
        y51.c cVar = this.f508718p;
        if (cVar != null) {
            ((y51.b) cVar).b();
        }
    }

    @Override // ml5.g
    /* renamed from: onScroll */
    public void mo68312x58dabd8c(float f17, float f18) {
        em.o1 o1Var = this.f508717o;
        if (o1Var != null) {
            o1Var.h().A(f17, f18);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
    }

    @Override // mf3.l
    public void q(float f17) {
        y51.c cVar;
        if (f17 > 0.5f || (cVar = this.f508718p) == null) {
            return;
        }
        ((y51.b) cVar).b();
    }

    @Override // mf3.e, mf3.l
    /* renamed from: recycle */
    public void mo129548x408b7293() {
        super.mo129548x408b7293();
        y51.c cVar = this.f508718p;
        if (cVar != null) {
            ((y51.b) cVar).b();
        }
        y51.c cVar2 = this.f508718p;
        if (cVar2 != null) {
            ((y51.b) cVar2).e();
        }
        em.o1 o1Var = this.f508717o;
        if (o1Var != null) {
            o1Var.d().setEnabled(false);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
    }

    @Override // mf3.e, mf3.l
    public void t(mf3.s bindContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bindContext, "bindContext");
        super.t(bindContext);
        em.o1 o1Var = this.f508717o;
        if (o1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        o1Var.e().setVisibility(4);
        em.o1 o1Var2 = this.f508717o;
        if (o1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        o1Var2.b().setVisibility(4);
        em.o1 o1Var3 = this.f508717o;
        if (o1Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        o1Var3.i().setVisibility(0);
        V();
    }

    @Override // mf3.e, mf3.l
    public void u(android.view.View parentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentView, "parentView");
        super.u(parentView);
        em.o1 o1Var = this.f508717o;
        if (o1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        o1Var.g().m79192x50bca671(android.widget.ImageView.ScaleType.FIT_CENTER);
        em.o1 o1Var2 = this.f508717o;
        if (o1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1856x5faa95b.C16491xb6370bb4 i17 = o1Var2.i();
        sf3.e eVar = (sf3.e) H(sf3.e.class);
        i17.m66595x41568c47(eVar != null ? eVar.mo162294xaf65a0fc() : null);
        em.o1 o1Var3 = this.f508717o;
        if (o1Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        i17.m66597x6de50754(o1Var3.h());
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f sampleImageView = i17.getSampleImageView();
        if (sampleImageView != null) {
            sampleImageView.m79314xbc839517(true);
        }
        i17.d();
        i17.m66596xc6cf6336(this);
        em.o1 o1Var4 = this.f508717o;
        if (o1Var4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1857x32b0ec.C16493x22c368e7 f17 = o1Var4.f();
        em.o1 o1Var5 = this.f508717o;
        if (o1Var5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        f17.m66599xa7687c07(o1Var5.i());
        em.o1 o1Var6 = this.f508717o;
        if (o1Var6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16501x5a606100 d17 = o1Var6.d();
        d17.m81946x1a747dba(false);
        d17.m81870x2e3e4924(false);
        d17.m81943x9ee45726(false);
        d17.setBackgroundColor(d17.getContext().getResources().getColor(android.R.color.transparent));
        d17.m66625xa8ac985b(this);
        d17.m81912xdc0d3297(this);
    }

    @Override // ml5.g
    public void y(float f17, float f18, float f19) {
        em.o1 o1Var = this.f508717o;
        if (o1Var != null) {
            o1Var.h().z(f17, f18, f19);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
    }

    @Override // rf3.v
    public void z(sf3.g param) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        ym5.a1.f(new uf3.e(this));
    }
}
