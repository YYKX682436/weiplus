package yj2;

/* loaded from: classes10.dex */
public class e extends android.widget.RelativeLayout implements xh2.f {

    /* renamed from: d, reason: collision with root package name */
    public final int f544183d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f544184e;

    /* renamed from: f, reason: collision with root package name */
    public final int f544185f;

    /* renamed from: g, reason: collision with root package name */
    public yj2.f f544186g;

    /* renamed from: h, reason: collision with root package name */
    public final fg2.g0 f544187h;

    /* renamed from: i, reason: collision with root package name */
    public km2.q f544188i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f544189m;

    /* renamed from: n, reason: collision with root package name */
    public int f544190n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.ArrayList f544191o;

    /* renamed from: p, reason: collision with root package name */
    public pm2.a f544192p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.content.Context context, int i17, java.lang.String coverUrl, int i18) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverUrl, "coverUrl");
        this.f544183d = i17;
        this.f544184e = coverUrl;
        this.f544185f = i18;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.auk, (android.view.ViewGroup) this, false);
        int i19 = com.p314xaae8f345.mm.R.id.eop;
        android.view.View a17 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.eop);
        if (a17 != null) {
            fg2.j1 a18 = fg2.j1.a(a17);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22641xff2656ea c22641xff2656ea = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22641xff2656ea) inflate;
            int i27 = com.p314xaae8f345.mm.R.id.gxq;
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1076xfbb92cd0 c1076xfbb92cd0 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1076xfbb92cd0) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.gxq);
            if (c1076xfbb92cd0 != null) {
                i27 = com.p314xaae8f345.mm.R.id.jis;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1512x373aa5.C14244x5bb442ce c14244x5bb442ce = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1512x373aa5.C14244x5bb442ce) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.jis);
                if (c14244x5bb442ce != null) {
                    i27 = com.p314xaae8f345.mm.R.id.jix;
                    android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.jix);
                    if (imageView != null) {
                        i27 = com.p314xaae8f345.mm.R.id.jj9;
                        android.widget.ImageView imageView2 = (android.widget.ImageView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.jj9);
                        if (imageView2 != null) {
                            i27 = com.p314xaae8f345.mm.R.id.f567853kw2;
                            android.widget.ImageView imageView3 = (android.widget.ImageView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f567853kw2);
                            if (imageView3 != null) {
                                i27 = com.p314xaae8f345.mm.R.id.f567854kw3;
                                android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f567854kw3);
                                if (textView != null) {
                                    this.f544187h = new fg2.g0(c22641xff2656ea, a18, c22641xff2656ea, c1076xfbb92cd0, c14244x5bb442ce, imageView, imageView2, imageView3, textView);
                                    this.f544192p = pm2.a.f438386f;
                                    addView(c22641xff2656ea);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            i19 = i27;
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i19)));
    }

    /* renamed from: getRadius */
    private final int m177203x2d258f88() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(yj2.g r8) {
        /*
            r7 = this;
            java.lang.String r0 = "params"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r0)
            pm2.a r0 = r8.f544197b
            r7.f544192p = r0
            yj2.f r1 = r8.f544201f
            r7.f544186g = r1
            pm2.a r1 = pm2.a.f438388h
            r2 = 0
            r3 = 0
            r4 = 1
            xh2.a r5 = r8.f544196a
            if (r0 != r1) goto L30
            if (r5 == 0) goto L23
            xh2.i r0 = r5.f536054b
            if (r0 == 0) goto L23
            int r0 = r0.f536088g
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L24
        L23:
            r0 = r2
        L24:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            boolean r0 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, r6)
            if (r0 == 0) goto L30
            r0 = r4
            goto L31
        L30:
            r0 = r3
        L31:
            r7.f544189m = r0
            int r0 = r8.f544199d
            r7.f544190n = r0
            java.util.ArrayList r0 = r8.f544200e
            r7.f544191o = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r6 = "start bindData isAudioMode: "
            r0.<init>(r6)
            boolean r8 = r8.f544198c
            r0.append(r8)
            java.lang.String r6 = " isNormalFocusMode: "
            r0.append(r6)
            boolean r6 = r7.f544189m
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r7.e(r0)
            if (r5 == 0) goto L5d
            km2.q r2 = r5.f536053a
        L5d:
            r7.f544188i = r2
            pm2.a r0 = r7.f544192p
            if (r0 == r1) goto L65
            r0 = r4
            goto L66
        L65:
            r0 = r3
        L66:
            java.lang.String r1 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            fg2.g0 r2 = r7.f544187h
            if (r0 != 0) goto L82
            android.widget.ImageView r0 = r2.f343580e
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r0, r1)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) r0
            boolean r5 = r7.f544189m
            if (r5 == 0) goto L7e
            r5 = 1048576000(0x3e800000, float:0.25)
            goto L80
        L7e:
            r5 = 1056964608(0x3f000000, float:0.5)
        L80:
            r0.N = r5
        L82:
            r7.m177214x78dc957(r3)
            int r0 = r7.f544183d
            if (r0 == r4) goto La8
            r5 = 2
            if (r0 == r5) goto L97
            r5 = 3
            if (r0 == r5) goto L93
            r5 = 4
            if (r0 == r5) goto L93
            goto Lab
        L93:
            r7.c(r8)
            goto Lab
        L97:
            km2.q r8 = r7.f544188i
            if (r8 == 0) goto Lab
            android.widget.ImageView r8 = r2.f343580e
            r5 = 8
            r8.setVisibility(r5)
            android.widget.ImageView r8 = r2.f343581f
            r8.setVisibility(r5)
            goto Lab
        La8:
            r7.d()
        Lab:
            androidx.constraintlayout.widget.Guideline r8 = r2.f343578c
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r8, r1)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r8 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) r8
            boolean r1 = r7.f544189m
            if (r1 == 0) goto Lbe
            if (r0 != r4) goto Lbe
            int r3 = r7.f544190n
        Lbe:
            r8.f92414b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yj2.e.a(yj2.g):void");
    }

    public final void b(boolean z17) {
        jz5.f0 f0Var;
        fg2.g0 g0Var = this.f544187h;
        if (!z17) {
            g0Var.f343579d.n();
            return;
        }
        java.util.ArrayList arrayList = this.f544191o;
        if (arrayList != null) {
            g0Var.f343579d.r(m177203x2d258f88(), arrayList);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            g0Var.f343579d.n();
        }
    }

    public void c(boolean z17) {
        this.f544187h.f343580e.setVisibility(8);
        this.f544187h.f343581f.setVisibility(8);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicCommonFocusWidget", "fillAnchorContent: " + z17 + " coverUrl: " + this.f544184e + " drawable: " + this.f544187h.f343579d.getDrawable() + " micType: " + this.f544183d);
        if (!z17) {
            yj2.f fVar = this.f544186g;
            if (fVar != null && fVar.f544195c >= fVar.f544193a) {
                fVar.f544194b.mo152xb9724478();
            }
            this.f544187h.f343579d.setVisibility(4);
            return;
        }
        this.f544187h.f343579d.setVisibility(0);
        if (this.f544187h.f343579d.getDrawable() == null || this.f544187h.f343579d.getVisibility() == 8) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicCommonFocusWidget", "fillAnchorContent load anchorBitmap");
            java.lang.String str = this.f544184e;
            if (str == null || str.length() == 0) {
                return;
            }
            mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb());
            java.lang.String str2 = this.f544184e;
            if (str2 == null) {
                str2 = "";
            }
            wo0.c a17 = d1Var.a(new mn2.j0(str2));
            yj2.c cVar = new yj2.c(this, z17);
            a17.getClass();
            a17.f529406d = cVar;
            a17.f();
        }
    }

    public void d() {
        km2.q qVar = this.f544188i;
        if (qVar != null) {
            boolean z17 = true;
            if (this.f544192p != pm2.a.f438388h) {
                this.f544187h.f343580e.setVisibility(8);
                android.widget.ImageView micNormalHead = this.f544187h.f343581f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(micNormalHead, "micNormalHead");
                g(qVar, micNormalHead);
            } else {
                this.f544187h.f343581f.setVisibility(8);
                android.widget.ImageView micFocusHead = this.f544187h.f343580e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(micFocusHead, "micFocusHead");
                g(qVar, micFocusHead);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1512x373aa5.C14244x5bb442ce micBg = this.f544187h.f343579d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(micBg, "micBg");
            java.lang.String str = qVar.f390704b;
            if (str != null && str.length() != 0) {
                z17 = false;
            }
            if (z17) {
                ((ku5.t0) ku5.t0.f394148d).g(new po0.d(bp.b.m10969xb866ec1c(getContext().getResources(), com.p314xaae8f345.mm.R.raw.f78922x61de8d17, null), new yj2.d(micBg), 20.0f, getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77910xe61cad91)));
            } else {
                mn2.g1 g1Var = mn2.g1.f411508a;
                g1Var.c().c(new mn2.e0(qVar.f390704b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), micBg, g1Var.h(mn2.f1.f411490h));
            }
            b(this.f544189m);
        }
    }

    public final void e(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LiveMicMiniFocusWidget_");
        sb6.append(this.f544183d);
        sb6.append('_');
        km2.q qVar = this.f544188i;
        sb6.append(qVar != null ? qVar.f390703a : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(sb6.toString(), str);
    }

    public final void f(boolean z17) {
        int i17 = this.f544183d;
        if (i17 == 3 || i17 == 4) {
            e("onAnchorAudioChange: " + z17);
            c(z17);
        }
    }

    public final void g(km2.q userData, android.widget.ImageView imgView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userData, "userData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgView, "imgView");
        imgView.setVisibility(0);
        boolean S3 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.S3(userData.f390705c);
        mn2.g1 g1Var = mn2.g1.f411508a;
        if (S3) {
            g1Var.a().c(new mn2.n(userData.f390704b, null, 2, null), imgView, g1Var.h(mn2.f1.f411490h));
        } else {
            g1Var.l().c(new mn2.n(userData.f390704b, null, 2, null), imgView, g1Var.h(mn2.f1.f411494o));
        }
    }

    /* renamed from: getBattleResultWidgetCallback */
    public /* bridge */ /* synthetic */ ai2.a mo175548x1de6fcf4() {
        return null;
    }

    /* renamed from: getBindLinkMicUser */
    public final km2.q m177204x949ba2a5() {
        return this.f544188i;
    }

    /* renamed from: getBindSdkUserId */
    public final java.lang.String m177205xf44a6fad() {
        java.lang.String str;
        km2.q qVar = this.f544188i;
        return (qVar == null || (str = qVar.f390703a) == null) ? "" : str;
    }

    /* renamed from: getCoverUrl */
    public final java.lang.String m177206x66e287ae() {
        return this.f544184e;
    }

    /* renamed from: getMicType */
    public final int m177207x7c9c69eb() {
        return this.f544183d;
    }

    /* renamed from: getMicWidgetMode */
    public final pm2.a m177208x6bf697f8() {
        return this.f544192p;
    }

    /* renamed from: getPotholingRectList */
    public final java.util.ArrayList<android.graphics.RectF> m177209x145d661e() {
        return this.f544191o;
    }

    /* renamed from: getRightOffestSize */
    public final int m177210x9dd54f5e() {
        return this.f544190n;
    }

    /* renamed from: getScene */
    public final int m177211x7520bed6() {
        return this.f544185f;
    }

    /* renamed from: getViewBinding */
    public final fg2.g0 m177212xd2d0feea() {
        return this.f544187h;
    }

    /* renamed from: setBindLinkMicUser */
    public final void m177213xcb723c19(km2.q qVar) {
        this.f544188i = qVar;
    }

    /* renamed from: setCorner */
    public final void m177214x78dc957(int i17) {
        this.f544187h.f343576a.m81431x205ac394(i17);
    }

    /* renamed from: setMicWidgetMode */
    public final void m177215xfeccfe6c(pm2.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "<set-?>");
        this.f544192p = aVar;
    }

    /* renamed from: setNormalFocusMode */
    public final void m177216x75cc38b2(boolean z17) {
        this.f544189m = z17;
    }

    /* renamed from: setPotholingRectList */
    public final void m177217xeff37292(java.util.ArrayList<android.graphics.RectF> arrayList) {
        this.f544191o = arrayList;
    }

    /* renamed from: setRightOffestSize */
    public final void m177218xd4abe8d2(int i17) {
        this.f544190n = i17;
    }
}
