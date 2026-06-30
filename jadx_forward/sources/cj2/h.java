package cj2;

/* loaded from: classes10.dex */
public final class h extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final int f123398d;

    /* renamed from: e, reason: collision with root package name */
    public final zh2.c f123399e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 f123400f;

    /* renamed from: g, reason: collision with root package name */
    public final fg2.z0 f123401g;

    /* renamed from: h, reason: collision with root package name */
    public km2.q f123402h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.SurfaceTexture f123403i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.TextureView.SurfaceTextureListener f123404m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f123405n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f123406o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context, int i17, zh2.c pluginAbility, com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 previewView) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewView, "previewView");
        this.f123398d = i17;
        this.f123399e = pluginAbility;
        this.f123400f = previewView;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.av_, (android.view.ViewGroup) this, false);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22641xff2656ea c22641xff2656ea = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22641xff2656ea) inflate;
        int i18 = com.p314xaae8f345.mm.R.id.gxq;
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1076xfbb92cd0 c1076xfbb92cd0 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1076xfbb92cd0) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.gxq);
        if (c1076xfbb92cd0 != null) {
            i18 = com.p314xaae8f345.mm.R.id.ilu;
            android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.ilu);
            if (imageView != null) {
                i18 = com.p314xaae8f345.mm.R.id.imn;
                android.widget.ProgressBar progressBar = (android.widget.ProgressBar) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.imn);
                if (progressBar != null) {
                    i18 = com.p314xaae8f345.mm.R.id.jis;
                    android.widget.ImageView imageView2 = (android.widget.ImageView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.jis);
                    if (imageView2 != null) {
                        i18 = com.p314xaae8f345.mm.R.id.f567452jj2;
                        android.widget.ImageView imageView3 = (android.widget.ImageView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f567452jj2);
                        if (imageView3 != null) {
                            i18 = com.p314xaae8f345.mm.R.id.jj8;
                            android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.jj8);
                            if (textView != null) {
                                i18 = com.p314xaae8f345.mm.R.id.jjk;
                                android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.jjk);
                                if (textView2 != null) {
                                    i18 = com.p314xaae8f345.mm.R.id.jjl;
                                    android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.jjl);
                                    if (textView3 != null) {
                                        i18 = com.p314xaae8f345.mm.R.id.jjm;
                                        android.view.TextureView textureView = (android.view.TextureView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.jjm);
                                        if (textureView != null) {
                                            i18 = com.p314xaae8f345.mm.R.id.jjn;
                                            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.jjn);
                                            if (frameLayout != null) {
                                                i18 = com.p314xaae8f345.mm.R.id.n0d;
                                                android.view.View a17 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.n0d);
                                                if (a17 != null) {
                                                    i18 = com.p314xaae8f345.mm.R.id.n0l;
                                                    android.view.View a18 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.n0l);
                                                    if (a18 != null) {
                                                        this.f123401g = new fg2.z0(c22641xff2656ea, c22641xff2656ea, c1076xfbb92cd0, imageView, progressBar, imageView2, imageView3, textView, textView2, textView3, textureView, frameLayout, a17, a18);
                                                        cj2.f fVar = new cj2.f(this);
                                                        addView(c22641xff2656ea);
                                                        textureView.setOpaque(false);
                                                        textureView.setSurfaceTextureListener(fVar);
                                                        imageView.setVisibility(8);
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i18)));
    }

    /* renamed from: getAnchorSdkUserId */
    private final java.lang.String m14943xc76adb5() {
        java.lang.String str = ((mm2.e1) this.f123399e.g().a(mm2.e1.class)).f410520q.f461834n;
        return str == null ? "" : str;
    }

    public final void a(android.view.ViewGroup viewGroup, android.graphics.Bitmap bitmap) {
        android.widget.ImageView imageView = this.f123405n;
        if (imageView != null) {
            viewGroup.removeView(imageView);
        }
        android.widget.ImageView imageView2 = this.f123405n;
        if (imageView2 == null) {
            imageView2 = new android.widget.ImageView(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            imageView2.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            imageView2.setTag("video_thumb_image");
        }
        this.f123405n = imageView2;
        imageView2.setImageBitmap(bitmap);
        android.widget.ImageView imageView3 = this.f123405n;
        android.view.ViewParent parent = imageView3 != null ? imageView3.getParent() : null;
        android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(this.f123405n);
        }
        viewGroup.addView(this.f123405n, new android.view.ViewGroup.LayoutParams(-1, -1));
    }

    public final void b(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderLiveMicPreviewWidget_");
        sb6.append(this.f123398d);
        sb6.append('_');
        km2.q qVar = this.f123402h;
        sb6.append(qVar != null ? qVar.f390703a : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(sb6.toString(), str);
    }

    public final void c() {
        android.view.TextureView mo46536x4ee17f0a;
        km2.q qVar = this.f123402h;
        if (qVar != null) {
            b("onPanelDismiss userId: " + qVar.f390703a);
            fg2.z0 z0Var = this.f123401g;
            if (z0Var.f343948i.getVisibility() == 0 && this.f123403i != null) {
                boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(qVar.f390703a, m14943xc76adb5());
                android.view.TextureView textureView = z0Var.f343948i;
                android.widget.FrameLayout frameLayout = z0Var.f343949j;
                com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 c10849x610a91e1 = this.f123400f;
                if (b17) {
                    android.view.TextureView m46523x76530f60 = c10849x610a91e1.m46523x76530f60();
                    if (m46523x76530f60 != null) {
                        frameLayout.removeView(textureView);
                        frameLayout.addView(textureView);
                        android.graphics.SurfaceTexture surfaceTexture = this.f123403i;
                        if (surfaceTexture != null) {
                            m46523x76530f60.setSurfaceTexture(surfaceTexture);
                            android.view.ViewParent parent = m46523x76530f60.getParent();
                            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                            if (viewGroup != null) {
                                viewGroup.removeView(m46523x76530f60);
                                viewGroup.addView(m46523x76530f60);
                            }
                        }
                        m46523x76530f60.setSurfaceTextureListener(this.f123404m);
                    }
                } else {
                    java.lang.String str = qVar.f390703a;
                    com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p833x36756d.C10844x4ce18327 c10844x4ce18327 = c10849x610a91e1.renderRatioLayout;
                    if (str == null) {
                        str = "";
                    }
                    com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf m139653x4ee17f0a = c10844x4ce18327.a(str, 0).m139653x4ee17f0a();
                    if (m139653x4ee17f0a != null && (mo46536x4ee17f0a = m139653x4ee17f0a.mo46536x4ee17f0a()) != null) {
                        frameLayout.removeView(textureView);
                        frameLayout.addView(textureView);
                        android.graphics.SurfaceTexture surfaceTexture2 = this.f123403i;
                        if (surfaceTexture2 != null) {
                            b("showVideoView setSurfaceTexture: " + surfaceTexture2 + " userId: " + qVar.f390703a);
                            mo46536x4ee17f0a.setSurfaceTexture(surfaceTexture2);
                            m139653x4ee17f0a.mo46537xcd50899c();
                            m139653x4ee17f0a.mo46533x473bda1f(mo46536x4ee17f0a);
                        }
                        mo46536x4ee17f0a.setSurfaceTextureListener(this.f123404m);
                        android.widget.ImageView imageView = this.f123405n;
                        if (imageView != null) {
                            m139653x4ee17f0a.removeView(imageView);
                        }
                    }
                }
            }
        }
        this.f123403i = null;
        this.f123404m = null;
    }

    public final void d(km2.q qVar, android.widget.ImageView imageView) {
        if (this.f123401g.f343941b.getVisibility() == 0) {
            b("showBlurImage same");
            return;
        }
        this.f123401g.f343941b.setVisibility(0);
        java.lang.String str = qVar.f390704b;
        if (!(str == null || str.length() == 0)) {
            mn2.g1 g1Var = mn2.g1.f411508a;
            g1Var.c().c(new mn2.e0(qVar.f390704b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), imageView, g1Var.h(mn2.f1.f411490h));
            return;
        }
        android.graphics.Bitmap m10969xb866ec1c = bp.b.m10969xb866ec1c(getContext().getResources(), com.p314xaae8f345.mm.R.raw.f78922x61de8d17, null);
        int color = getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77910xe61cad91);
        ((ku5.t0) ku5.t0.f394148d).g(new po0.d(m10969xb866ec1c, new cj2.g(imageView), (4 & 4) != 0 ? 20.0f : 0.0f, (4 & 2) == 0 ? color : 0));
    }

    public final void e() {
        km2.q qVar = this.f123402h;
        if (qVar != null) {
            fg2.z0 z0Var = this.f123401g;
            z0Var.f343941b.setVisibility(0);
            z0Var.f343942c.setVisibility(0);
            android.widget.ImageView loadingBgView = z0Var.f343941b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(loadingBgView, "loadingBgView");
            d(qVar, loadingBgView);
        }
    }

    public final void f() {
        km2.q qVar = this.f123402h;
        fg2.z0 z0Var = this.f123401g;
        if (qVar != null) {
            z0Var.f343947h.setVisibility(0);
            int i17 = this.f123398d;
            android.widget.TextView textView = z0Var.f343947h;
            if (i17 == 3) {
                textView.setText(getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d5o));
            } else {
                i95.m c17 = i95.n0.c(c61.yb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                c61.yb ybVar = (c61.yb) c17;
                android.widget.TextView textView2 = z0Var.f343945f;
                android.content.Context context = textView2.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                android.text.TextPaint paint = textView2.getPaint();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(paint, "getPaint(...)");
                textView.setText(c61.yb.nf(ybVar, context, paint, zl2.r4.D0(zl2.r4.f555483a, qVar.f390705c, qVar.f390706d, false, 4, null), 0, 8, null));
            }
        }
        android.graphics.SurfaceTexture surfaceTexture = this.f123403i;
        if (surfaceTexture != null) {
            b("showVideoView same restart setSurfaceTexture return");
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(z0Var.f343948i.getSurfaceTexture(), surfaceTexture)) {
                return;
            }
            z0Var.f343948i.setSurfaceTexture(surfaceTexture);
            return;
        }
        b("showVideoView");
        km2.q qVar2 = this.f123402h;
        if (qVar2 != null) {
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(qVar2.f390703a, m14943xc76adb5());
            com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 c10849x610a91e1 = this.f123400f;
            if (b17) {
                android.view.TextureView m46523x76530f60 = c10849x610a91e1.m46523x76530f60();
                if (m46523x76530f60 != null) {
                    this.f123404m = m46523x76530f60.getSurfaceTextureListener();
                    android.graphics.SurfaceTexture surfaceTexture2 = m46523x76530f60.getSurfaceTexture();
                    if (surfaceTexture2 != null) {
                        b("showVideoView setSurfaceTexture: " + surfaceTexture2 + " userId: " + qVar2.f390703a);
                        m46523x76530f60.setSurfaceTextureListener(new ig2.p("FinderLiveMicPreviewWidget_Ori", false));
                        this.f123403i = surfaceTexture2;
                        android.graphics.Bitmap bitmap = m46523x76530f60.getBitmap();
                        z0Var.f343948i.setSurfaceTexture(surfaceTexture2);
                        android.view.ViewParent parent = m46523x76530f60.getParent();
                        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                        if (viewGroup != null) {
                            viewGroup.removeView(m46523x76530f60);
                            viewGroup.addView(m46523x76530f60);
                            a(viewGroup, bitmap);
                        }
                        android.widget.FrameLayout frameLayout = z0Var.f343949j;
                        android.view.TextureView textureView = z0Var.f343948i;
                        frameLayout.removeView(textureView);
                        frameLayout.addView(textureView);
                        textureView.getViewTreeObserver().addOnPreDrawListener(new cj2.e(this, surfaceTexture2));
                        return;
                    }
                    return;
                }
                return;
            }
            java.lang.String str = qVar2.f390703a;
            com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p833x36756d.C10844x4ce18327 c10844x4ce18327 = c10849x610a91e1.renderRatioLayout;
            if (str == null) {
                str = "";
            }
            com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf m139653x4ee17f0a = c10844x4ce18327.a(str, 0).m139653x4ee17f0a();
            if (m139653x4ee17f0a == null || m139653x4ee17f0a.mo46536x4ee17f0a() == null) {
                return;
            }
            this.f123404m = m139653x4ee17f0a.mo46536x4ee17f0a().getSurfaceTextureListener();
            android.view.TextureView mo46536x4ee17f0a = m139653x4ee17f0a.mo46536x4ee17f0a();
            android.graphics.Bitmap bitmap2 = mo46536x4ee17f0a.getBitmap();
            android.graphics.SurfaceTexture surfaceTexture3 = mo46536x4ee17f0a.getSurfaceTexture();
            if (surfaceTexture3 != null) {
                b("showVideoView setSurfaceTexture: " + surfaceTexture3 + " userId: " + qVar2.f390703a);
                mo46536x4ee17f0a.setSurfaceTextureListener(new ig2.p("FinderLiveMicPreviewWidget_Ori", false));
                this.f123403i = surfaceTexture3;
                z0Var.f343948i.setSurfaceTexture(surfaceTexture3);
                m139653x4ee17f0a.mo46537xcd50899c();
                m139653x4ee17f0a.mo46533x473bda1f(mo46536x4ee17f0a);
                a(m139653x4ee17f0a, bitmap2);
            }
            android.widget.FrameLayout frameLayout2 = z0Var.f343949j;
            android.view.TextureView textureView2 = z0Var.f343948i;
            frameLayout2.removeView(textureView2);
            z0Var.f343949j.addView(textureView2);
        }
    }

    /* renamed from: getMicType */
    public final int m14944x7c9c69eb() {
        return this.f123398d;
    }

    /* renamed from: getPluginAbility */
    public final zh2.c m14945x3a33aac1() {
        return this.f123399e;
    }

    /* renamed from: getPreviewView */
    public final com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 m14946x8ce0b557() {
        return this.f123400f;
    }

    /* renamed from: setCorner */
    public final void m14947x78dc957(int i17) {
        this.f123401g.f343940a.m81431x205ac394(i17);
    }
}
