package qt2;

/* loaded from: classes2.dex */
public final class b0 extends qt2.j implements cw2.ea {

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f448081r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ProgressBar f448082s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f448083t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f448084u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f448085v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f448086w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.Runnable f448087x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f448081r = "Finder.ShareGuideNextUIC";
    }

    public static final void a7(qt2.b0 b0Var, int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = b0Var.f448123g;
        if (c1163xf1deaba4 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(1);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "com/tencent/mm/plugin/finder/share/FinderShareGuideNextUIC", "scrollToNext", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            c1163xf1deaba4.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/finder/share/FinderShareGuideNextUIC", "scrollToNext", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b0Var.f448081r, "[doPullDown]");
        b0Var.c7(0L);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y3.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y3.f207005a, b0Var.m158354x19263085(), i17, null, 4, null);
        b0Var.m160881x5a5b64d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: clear */
    public final void m160881x5a5b64d() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07;
        android.view.View view;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f448123g;
        if (c1163xf1deaba4 == null || (p07 = c1163xf1deaba4.p0(0)) == null || (view = p07.f3639x46306858) == null) {
            return;
        }
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.e_k);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = findViewById instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) findViewById : null;
        if (c15196x85976f5f != null) {
            c15196x85976f5f.T(this);
        }
    }

    @Override // qt2.j
    public int Q6() {
        return com.p314xaae8f345.mm.R.id.aue;
    }

    @Override // qt2.j
    public void R6(java.util.List feeds) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feeds, "feeds");
        this.f448128o = feeds;
        if (feeds.size() > 1) {
            java.lang.Object obj = feeds.get(1);
            this.f448085v = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
        }
    }

    @Override // qt2.j
    public void S6(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07;
        android.view.View view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        super.S6(recyclerView);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f448123g;
        if (c1163xf1deaba4 != null && (p07 = c1163xf1deaba4.p0(0)) != null && (view = p07.f3639x46306858) != null) {
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.e_k);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = findViewById instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) findViewById : null;
            if (c15196x85976f5f != null) {
                c15196x85976f5f.t(this);
            }
            this.f448083t = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.g99);
            this.f448084u = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.dq6);
            int[] iArr = new int[2];
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f448083t;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.getLocationInWindow(iArr);
            }
            int i17 = iArr[0];
            int i18 = iArr[1];
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f448084u;
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.setVisibility(4);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = this.f448084u;
            java.lang.Object layoutParams = c22699x3dcdb3523 != null ? c22699x3dcdb3523.getLayoutParams() : null;
            android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.leftMargin = i17;
                layoutParams2.topMargin = i18;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = this.f448084u;
                if (c22699x3dcdb3524 != null) {
                    c22699x3dcdb3524.setLayoutParams(layoutParams2);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff90 = this.f448126m;
            if (c15178x4303ff90 != null) {
                c15178x4303ff90.m61275xae8a2ab2(this.f448084u);
            }
        }
        android.view.View view2 = this.f448121e;
        if (view2 == null || (c22645x24069159 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159) view2.findViewById(com.p314xaae8f345.mm.R.id.gvv)) == null) {
            return;
        }
        c22645x24069159.setOnClickListener(qt2.y.f448162d);
    }

    @Override // qt2.j
    public void U6() {
        super.U6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f448085v;
        if (!(abstractC14490x69736cb5 != null && 2 == abstractC14490x69736cb5.h()) && this.f448086w) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f448083t;
            if (!(c22699x3dcdb352 != null && c22699x3dcdb352.getVisibility() == 0)) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f448083t;
                if (c22699x3dcdb3522 != null) {
                    c22699x3dcdb3522.setVisibility(0);
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = this.f448083t;
                if (c22699x3dcdb3523 != null) {
                    c22699x3dcdb3523.setAlpha(1.0f);
                }
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = this.f448084u;
        if (c22699x3dcdb3524 != null) {
            c22699x3dcdb3524.setVisibility(8);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f448081r, "[hide]");
    }

    @Override // qt2.j
    public void V6(float f17) {
        super.V6(f17);
        c7(0L);
    }

    @Override // qt2.j
    public boolean X6() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209241g3).mo141623x754a37bb()).r()).intValue() != 1) {
            return false;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        int m75939xb282bd08 = nyVar != null ? nyVar.V6().m75939xb282bd08(5) : 0;
        if (!(m75939xb282bd08 == 25 || m75939xb282bd08 == 38)) {
            return false;
        }
        java.util.List list = this.f448128o;
        if (list != null && list.size() > 1) {
            java.lang.Object obj = list.get(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
            if (!((((abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null || (feedObject2 = feedObject.getFeedObject()) == null) ? 0 : feedObject2.m76810x98d986d1()) & 256) != 0)) {
                z17 = true;
                return z17 && hc2.e.a();
            }
        }
        z17 = false;
        if (z17) {
            return false;
        }
    }

    @Override // qt2.j
    public void Y6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        java.lang.String sb6;
        boolean z17 = this.f448122f;
        java.lang.String str = this.f448081r;
        if (z17 || T6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[show] return due to isShowing:" + this.f448122f + " or isNotAllow:false");
            return;
        }
        android.view.View view = this.f448121e;
        android.widget.ImageView imageView = view != null ? (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.gvx) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f448085v;
        if (abstractC14490x69736cb5 != null && (feedObject = abstractC14490x69736cb5.getFeedObject()) != null && (feedObject2 = feedObject.getFeedObject()) != null && (m76802x2dd01666 = feedObject2.m76802x2dd01666()) != null && (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) != null && m76962x74cd162e.size() > 0) {
            java.lang.String m76585x66e287ae = m76962x74cd162e.get(0).m76585x66e287ae();
            if (m76585x66e287ae == null || m76585x66e287ae.length() == 0) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(m76962x74cd162e.get(0).m76623xd93f812f());
                java.lang.String m76624x4c9b7dca = m76962x74cd162e.get(0).m76624x4c9b7dca();
                if (m76624x4c9b7dca == null) {
                    m76624x4c9b7dca = "";
                }
                sb7.append(m76624x4c9b7dca);
                sb6 = sb7.toString();
            } else {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(m76962x74cd162e.get(0).m76585x66e287ae());
                java.lang.String m76587x815afa6b = m76962x74cd162e.get(0).m76587x815afa6b();
                if (m76587x815afa6b == null) {
                    m76587x815afa6b = "";
                }
                sb8.append(m76587x815afa6b);
                sb6 = sb8.toString();
            }
            if (imageView != null) {
                mn2.g1 g1Var = mn2.g1.f411508a;
                g1Var.e().b(new mn2.q3(sb6, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), g1Var.h(mn2.f1.f411503x)).c(imageView);
            }
        }
        if (imageView != null) {
            imageView.setOnClickListener(new qt2.x(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = this.f448085v;
        if (abstractC14490x69736cb52 != null) {
            android.app.Activity m80379x76847179 = m80379x76847179();
            android.view.View view2 = this.f448121e;
            android.widget.TextView textView = view2 != null ? (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.gvw) : null;
            if (textView != null) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662 = abstractC14490x69736cb52.getFeedObject().getFeedObject().m76802x2dd01666();
                java.util.LinkedList<r45.cw2> m76976x275e039f = m76802x2dd016662 != null ? m76802x2dd016662.m76976x275e039f() : null;
                android.text.SpannableString flowCardDescSpan = abstractC14490x69736cb52.getFeedObject().getFlowCardDescSpan();
                if (flowCardDescSpan == null || flowCardDescSpan.length() == 0) {
                    if (m76976x275e039f != null && (m76976x275e039f.isEmpty() ^ true)) {
                        textView.setVisibility(0);
                        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                        java.lang.String m75945x2fec8307 = ((r45.cw2) kz5.n0.X(m76976x275e039f)).m75945x2fec8307(0);
                        ((ke0.e) xVar).getClass();
                        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(m80379x76847179, m75945x2fec8307));
                    } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(abstractC14490x69736cb52.getFeedObject().m59226x730bcac6())) {
                        textView.setVisibility(8);
                        textView.setText("");
                    } else {
                        textView.setVisibility(0);
                        textView.setText(abstractC14490x69736cb52.getFeedObject().getDescriptionSpan());
                    }
                } else {
                    textView.setVisibility(0);
                    textView.setText(abstractC14490x69736cb52.getFeedObject().getFlowCardDescSpan());
                }
                com.p314xaae8f345.mm.ui.fk.a(textView);
                textView.setOnClickListener(new qt2.a0(this));
            }
        }
        android.view.View view3 = this.f448121e;
        android.view.View findViewById = view3 != null ? view3.findViewById(com.p314xaae8f345.mm.R.id.gvu) : null;
        if (findViewById != null) {
            findViewById.setOnClickListener(new qt2.w(this));
        }
        android.view.View view4 = this.f448121e;
        android.widget.ImageView imageView2 = view4 != null ? (android.widget.ImageView) view4.findViewById(com.p314xaae8f345.mm.R.id.age) : null;
        android.view.View view5 = this.f448121e;
        android.widget.ImageView imageView3 = view5 != null ? (android.widget.ImageView) view5.findViewById(com.p314xaae8f345.mm.R.id.agq) : null;
        um5.d dVar = new um5.d();
        int b17 = com.p314xaae8f345.mm.ui.bh.a(m80379x76847179()).f278668a - i65.a.b(m80379x76847179(), 32);
        int b18 = i65.a.b(m80379x76847179(), 122);
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(b18));
        arrayList.add(java.lang.Integer.valueOf(b17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/share/FinderShareGuideNextUIC", "initBlur", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/finder/share/FinderShareGuideNextUIC", "initBlur", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        createBitmap.eraseColor(android.graphics.Color.parseColor("#61F0F0F0"));
        dVar.b(createBitmap);
        dVar.f510674b = b17;
        dVar.f510675c = b18;
        uq5.b b19 = dVar.f510677e.f510726b.b();
        b19.d(20.0f);
        b19.e(5.0f);
        dVar.a(new qt2.v(imageView2));
        if (imageView3 != null) {
            imageView3.setImageDrawable(new android.graphics.drawable.ColorDrawable(m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560033k)));
        }
        if (this.f448121e != null) {
            W6(i65.a.b(m80379x76847179(), 176), 300L);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y3.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y3.f207005a, m158354x19263085(), 3, null, 4, null);
        android.view.View view6 = this.f448121e;
        android.widget.ProgressBar progressBar = view6 != null ? (android.widget.ProgressBar) view6.findViewById(com.p314xaae8f345.mm.R.id.gvy) : null;
        this.f448082s = progressBar;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        this.f448122f = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[show]");
    }

    public final void b7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f448081r, "[forbidToShow]");
    }

    public final void c7(long j17) {
        android.view.View view = this.f448121e;
        if (view != null) {
            view.removeCallbacks(this.f448087x);
        }
        qt2.z zVar = new qt2.z(this);
        this.f448087x = zVar;
        android.view.View view2 = this.f448121e;
        if (view2 != null) {
            view2.postDelayed(zVar, j17);
        }
    }

    @Override // qt2.j
    /* renamed from: getTag */
    public java.lang.String mo160882xb5887064() {
        return this.f448081r;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        android.view.View view = this.f448121e;
        if (view != null) {
            view.removeCallbacks(this.f448087x);
        }
        m160881x5a5b64d();
    }

    @Override // cw2.ea
    /* renamed from: onVideoPause */
    public void mo1057x65d3157a() {
        this.f448086w = true;
        android.widget.ProgressBar progressBar = this.f448082s;
        if (progressBar == null || progressBar.getVisibility() != 0) {
            return;
        }
        progressBar.setVisibility(8);
        android.view.View view = this.f448121e;
        if (view != null) {
            view.removeCallbacks(this.f448087x);
        }
    }

    @Override // cw2.ea
    /* renamed from: onVideoPlay */
    public void mo1058x4d9b9b30() {
        this.f448086w = false;
    }

    @Override // cw2.ea
    public void p4(long j17, long j18) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f448081r = "Finder.ShareGuideNextUIC";
    }
}
