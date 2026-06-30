package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class dc0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f193787d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f193788e;

    /* renamed from: f, reason: collision with root package name */
    public final qo0.c f193789f;

    /* renamed from: g, reason: collision with root package name */
    public final cm2.t f193790g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f193791h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.ViewGroup f193792i;

    /* renamed from: m, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f193793m;

    /* renamed from: n, reason: collision with root package name */
    public final long f193794n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f193795o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f193796p;

    /* renamed from: q, reason: collision with root package name */
    public cm2.g0 f193797q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.ImageView f193798r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.sb0 f193799s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.C14270x12d87215 f193800t;

    /* JADX WARN: Type inference failed for: r3v2, types: [com.tencent.mm.plugin.finder.live.plugin.FinderLiveTingBubble$tingEventListener$1] */
    public dc0(android.content.Context context, gk2.e buContext, qo0.c statusMonitor, yz5.l lVar, cm2.t tVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f193787d = context;
        this.f193788e = buContext;
        this.f193789f = statusMonitor;
        this.f193790g = tVar;
        this.f193791h = "FinderLiveTingBubble";
        this.f193794n = 5000L;
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m5p);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        this.f193795o = string;
        this.f193799s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.sb0(this);
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f193800t = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6166xea7b16fe>(a0Var) { // from class: com.tencent.mm.plugin.finder.live.plugin.FinderLiveTingBubble$tingEventListener$1
            {
                this.f39173x3fe91575 = -1986766098;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6166xea7b16fe c6166xea7b16fe) {
                r45.qy1 qy1Var;
                r45.qy1 qy1Var2;
                bw5.mb0 P0;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6166xea7b16fe event = c6166xea7b16fe;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dc0 dc0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dc0.this;
                java.lang.String str = dc0Var.f193791h;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[tingEventListener] action = ");
                am.yy yyVar = event.f136426g;
                sb6.append(yyVar.f90024a);
                sb6.append(", isLike = ");
                sb6.append(yyVar.f90025b);
                sb6.append(", isPublic = ");
                sb6.append(yyVar.f90026c);
                sb6.append(", itemId = ");
                sb6.append(yyVar.f90027d.c());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                java.lang.String c17 = yyVar.f90027d.c();
                cm2.g0 g0Var = dc0Var.f193797q;
                byte[] bArr = null;
                java.lang.String b17 = (g0Var == null || (qy1Var2 = g0Var.f124879v) == null || (P0 = zl2.r4.f555483a.P0(qy1Var2)) == null) ? null : P0.b();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c17, b17)) {
                    int i17 = yyVar.f90024a;
                    if (i17 == 1) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dc0.a(dc0Var, "tingEventListener", yyVar.f90025b);
                    } else if (i17 == 5) {
                        r45.qy1 qy1Var3 = new r45.qy1();
                        cm2.g0 g0Var2 = dc0Var.f193797q;
                        if (g0Var2 != null && (qy1Var = g0Var2.f124879v) != null) {
                            bArr = qy1Var.mo14344x5f01b1f6();
                        }
                        qy1Var3.mo11468x92b714fd(bArr);
                        cm2.g0 g0Var3 = new cm2.g0(qy1Var3);
                        il4.l lVar2 = il4.l.f373675a;
                        bw5.o50 item = yyVar.f90027d;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(item, "item");
                        g0Var3.f124879v.set(0, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(lVar2.n(item).mo14344x5f01b1f6()));
                        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.cc0(dc0Var, g0Var3));
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(dc0Var.f193791h, "eventCategoryId = " + c17 + ", bubbleCategoryId = " + b17 + ", not same categoryId, do nothing");
                }
                return false;
            }
        };
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570535dn2, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.f193792i = viewGroup;
        android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.r3c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f193798r = (android.widget.ImageView) findViewById;
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dc0 dc0Var, java.lang.String str, boolean z17) {
        r45.qy1 qy1Var;
        r45.qy1 qy1Var2;
        cm2.g0 g0Var = dc0Var.f193797q;
        boolean m75933x41a8a7f2 = (g0Var == null || (qy1Var2 = g0Var.f124879v) == null) ? false : qy1Var2.m75933x41a8a7f2(2);
        java.lang.String str2 = dc0Var.f193791h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[changeLikeStatus-" + str + "] isLiked = " + z17 + ", currentBubbleLiked = " + m75933x41a8a7f2);
        if (m75933x41a8a7f2 == z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[changeLikeStatus-" + str + "] isLiked is same, do nothing");
            return;
        }
        r45.qy1 qy1Var3 = new r45.qy1();
        cm2.g0 g0Var2 = dc0Var.f193797q;
        qy1Var3.mo11468x92b714fd((g0Var2 == null || (qy1Var = g0Var2.f124879v) == null) ? null : qy1Var.mo14344x5f01b1f6());
        cm2.g0 g0Var3 = new cm2.g0(qy1Var3);
        g0Var3.f124879v.set(2, java.lang.Boolean.valueOf(z17));
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pb0(dc0Var, g0Var3));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public cm2.t A() {
        return this.f193790g;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
        jz5.f0 f0Var = null;
        java.lang.String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(string != null ? string : "", "POST_TING_PORTRAIT")) {
            android.os.Bundle bundle2 = obj instanceof android.os.Bundle ? (android.os.Bundle) obj : null;
            if (bundle2 != null) {
                r45.qy1 qy1Var = new r45.qy1();
                qy1Var.mo11468x92b714fd(bundle2.getByteArray("POST_TING_PORTRAIT_DATA"));
                zl2.r4 r4Var = zl2.r4.f555483a;
                bw5.mb0 P0 = r4Var.P0(qy1Var);
                if (P0 != null) {
                    android.view.ViewGroup viewGroup = this.f193792i;
                    if (viewGroup == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
                        throw null;
                    }
                    android.content.Context context = viewGroup.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    r4Var.r2(context, P0, bw5.ar0.TingScene_Live_CategoryBubble);
                    f0Var = jz5.f0.f384359a;
                }
                if (f0Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193791h, "[jumpTing] play info null!");
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void U() {
    }

    public final void b(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193791h, str + " [bubble-cleared]");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f193793m;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        mo48814x2efc64();
    }

    public final void c(cm2.g0 g0Var, boolean z17, boolean z18) {
        int parseColor;
        int color;
        android.view.ViewGroup viewGroup = this.f193792i;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.r3g);
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.r3d);
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.widget.TextView textView3 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.r3e);
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.r3b);
        r45.ry1 ry1Var = (r45.ry1) g0Var.f124879v.m75936x14adae67(5);
        android.widget.ImageView imageView = this.f193798r;
        if (ry1Var != null && !z17) {
            try {
                r45.ry1 ry1Var2 = (r45.ry1) g0Var.f124879v.m75936x14adae67(5);
                if (ry1Var2 != null) {
                    int parseColor2 = android.graphics.Color.parseColor(ry1Var2.m75945x2fec8307(0));
                    int parseColor3 = android.graphics.Color.parseColor(ry1Var2.m75945x2fec8307(1));
                    textView.setTextColor(parseColor2);
                    textView3.setTextColor(parseColor3);
                    int parseColor4 = !z18 ? android.graphics.Color.parseColor(ry1Var2.m75945x2fec8307(2)) : android.graphics.Color.parseColor(ry1Var2.m75945x2fec8307(4));
                    findViewById.setBackgroundDrawable(null);
                    findViewById.setBackgroundColor(parseColor4);
                    int parseColor5 = !z18 ? android.graphics.Color.parseColor(ry1Var2.m75945x2fec8307(3)) : android.graphics.Color.parseColor(ry1Var2.m75945x2fec8307(5));
                    textView2.setTextColor(parseColor5);
                    if (imageView == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("btnIconView");
                        throw null;
                    }
                    if (viewGroup != null) {
                        imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(viewGroup.getContext(), com.p314xaae8f345.mm.R.raw.f79703xc84d169a, parseColor5));
                        return;
                    } else {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
                        throw null;
                    }
                }
                return;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193791h, "use sp_config err = " + e17.getMessage());
                return;
            }
        }
        if (!z17) {
            parseColor = android.graphics.Color.parseColor("#E6ffffff");
        } else {
            if (viewGroup == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
                throw null;
            }
            parseColor = viewGroup.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96);
        }
        if (z17) {
            if (viewGroup == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
                throw null;
            }
            color = viewGroup.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77911xe61cad92);
        } else {
            if (viewGroup == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
                throw null;
            }
            color = viewGroup.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d);
        }
        textView.setTextColor(parseColor);
        textView3.setTextColor(color);
        if (z18) {
            parseColor = color;
        }
        textView2.setTextColor(parseColor);
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("btnIconView");
            throw null;
        }
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(viewGroup.getContext(), com.p314xaae8f345.mm.R.raw.f79703xc84d169a, parseColor));
        if (z17) {
            if (viewGroup != null) {
                findViewById.setBackgroundDrawable(viewGroup.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a6d));
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
                throw null;
            }
        }
        if (z18) {
            if (viewGroup != null) {
                findViewById.setBackgroundDrawable(viewGroup.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563304a31));
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
                throw null;
            }
        }
        if (viewGroup != null) {
            findViewById.setBackgroundDrawable(viewGroup.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563303a30));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
    }

    public final void d(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, cm2.g0 g0Var, boolean z17) {
        jz5.f0 f0Var;
        if (bitmap != null) {
            ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).hj(str, view, bitmap, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tb0(view, this, g0Var, z17));
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.a8s);
            c(g0Var, true, z17);
        }
    }

    public final void e(cm2.g0 g0Var) {
        android.view.View view;
        bw5.mb0 mb0Var;
        r45.qy1 qy1Var;
        r45.qy1 qy1Var2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("data = ");
        sb6.append(pm0.b0.g(g0Var.f124879v));
        sb6.append(", oldData = ");
        cm2.g0 g0Var2 = this.f193797q;
        sb6.append((g0Var2 == null || (qy1Var2 = g0Var2.f124879v) == null) ? null : pm0.b0.g(qy1Var2));
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f193791h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        android.view.ViewGroup viewGroup = this.f193792i;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.hhj);
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.view.View findViewById2 = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.eqy);
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.r3g);
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.view.View findViewById3 = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.r3b);
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.r3e);
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        textView2.setTextColor(viewGroup.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77911xe61cad92));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        com.p314xaae8f345.mm.ui.fk.a(textView);
        zl2.r4 r4Var = zl2.r4.f555483a;
        r45.qy1 qy1Var3 = g0Var.f124879v;
        bw5.mb0 P0 = r4Var.P0(qy1Var3);
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.r3f);
        android.content.Context context = this.f193787d;
        this.f193795o = r4Var.d1(context, P0);
        this.f193796p = qy1Var3.m75945x2fec8307(3);
        android.graphics.drawable.Drawable e17 = com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f81196x18aa6dd2, 0);
        imageView.setImageDrawable(e17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById);
        d("DEFAULT_TING_COLOR_BG_KEY", findViewById, com.p314xaae8f345.mm.sdk.p2603x2137b148.x.K0(e17), g0Var, qy1Var3.m75933x41a8a7f2(2));
        mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb());
        java.lang.String c17 = P0 != null ? P0.c() : null;
        if (c17 == null) {
            c17 = "";
        }
        wo0.c a17 = d1Var.a(new mn2.q3(c17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wb0 wb0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wb0(imageView, this, g0Var, findViewById);
        a17.getClass();
        a17.f529406d = wb0Var;
        a17.f();
        textView.setText(P0 != null ? P0.m12484xfb82e301() : null);
        int i17 = r4Var.w1() ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById3, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTingBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteTingItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTingBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteTingItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ub0(this, qy1Var3.m75933x41a8a7f2(2)));
        boolean m75933x41a8a7f2 = qy1Var3.m75933x41a8a7f2(2);
        gk2.e eVar = this.f193788e;
        if (m75933x41a8a7f2) {
            cm2.g0 g0Var3 = this.f193797q;
            if (!((g0Var3 == null || (qy1Var = g0Var3.f124879v) == null || !qy1Var.m75933x41a8a7f2(2)) ? false : true)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[launchDismissJob]");
                p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f193793m;
                if (r2Var != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                }
                yg2.b bVar = eVar.f354008i;
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                p3325xe03a0797.p3326xc267989b.l.d(bVar, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.rb0(this, null), 2, null);
            }
        } else {
            p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f193793m;
            if (r2Var2 != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
            }
        }
        if (r4Var.y1(eVar)) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            view = findViewById3;
            mb0Var = P0;
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTingBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteTingItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTingBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteTingItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            view = findViewById3;
            mb0Var = P0;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTingBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteTingItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTingBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteTingItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.xb0(this, mb0Var, g0Var));
        }
        view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yb0(g0Var, this, mb0Var));
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zb0(this, mb0Var, g0Var));
        this.f193797q = g0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public int e0() {
        return com.p314xaae8f345.mm.R.id.eqy;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void f0(java.lang.Object data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (data instanceof cm2.g0) {
            e((cm2.g0) data);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    /* renamed from: getView */
    public android.view.View mo56902xfb86a31b() {
        android.view.ViewGroup viewGroup = this.f193792i;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void l(java.lang.Object data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (data instanceof cm2.g0) {
            cm2.g0 g0Var = (cm2.g0) data;
            e(g0Var);
            mo48813x58998cd();
            bw5.mb0 P0 = zl2.r4.f555483a.P0(g0Var.f124879v);
            bf2.c cVar = bf2.c.f101131a;
            gk2.e eVar = this.f193788e;
            java.lang.String b17 = P0 != null ? P0.b() : null;
            if (b17 == null) {
                b17 = "";
            }
            bf2.c.c(cVar, eVar, 1, 12, b17, 0, null, 0, 1, null, 0, nd1.y0.f72985x366c91de, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void l0() {
        b("onBubbleDel");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public int p0() {
        return com.p314xaae8f345.mm.R.id.hhj;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void t() {
        b("onViewUnMount");
    }
}
