package bm2;

/* loaded from: classes3.dex */
public final class t extends in5.q0 {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f103829h = "FinderLiveAnchorMusicEditAdapter";

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f103830i = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f103831m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f103832n;

    /* renamed from: o, reason: collision with root package name */
    public final dk2.vg f103833o;

    /* renamed from: p, reason: collision with root package name */
    public dk2.vg f103834p;

    /* renamed from: q, reason: collision with root package name */
    public dk2.vg f103835q;

    /* renamed from: r, reason: collision with root package name */
    public yz5.q f103836r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f103837s;

    public t() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f103831m = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.f103832n = arrayList2;
        dk2.vg vgVar = new dk2.vg(new r45.d22(), 0, 0, 1, false, 0L, 48, null);
        this.f103833o = vgVar;
        this.f103835q = this.f103834p;
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Hk();
        this.f103837s = true;
        zl2.q4.f555466a.R("FinderLiveAnchorMusicEditAdapter");
        arrayList2.add(vgVar);
        arrayList.addAll(arrayList2);
    }

    @Override // in5.q0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void x(bm2.n holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (!(holder instanceof bm2.p)) {
            if (holder instanceof bm2.o) {
                bm2.o oVar = (bm2.o) holder;
                int size = ((java.util.ArrayList) this.f103830i).size();
                android.widget.TextView textView = oVar.f103704e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textView, "<get-musicCount>(...)");
                com.p314xaae8f345.mm.ui.fk.a(textView);
                textView.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d4q, java.lang.Integer.valueOf(size)));
                android.view.View view = oVar.f103705f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view, "<get-divider>(...)");
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.leftMargin = (int) view.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
                }
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        bm2.p pVar = (bm2.p) holder;
        java.lang.Object obj = this.f103831m.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        dk2.vg vgVar = (dk2.vg) obj;
        boolean z17 = false;
        pVar.f103742e.setChecked(vgVar.f315791e);
        android.content.res.Resources resources = pVar.f3639x46306858.getContext().getResources();
        r45.d22 d22Var = vgVar.f315787a;
        java.lang.String string = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d4r, d22Var.m75945x2fec8307(2), no0.m.f420263a.b(d22Var.m75939xb282bd08(12), ":"));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb());
        mn2.q3 q3Var = new mn2.q3(d22Var.m75945x2fec8307(4), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f);
        yo0.f fVar = new yo0.f();
        fVar.f545616g = com.p314xaae8f345.mm.R.C30861xcebc809e.co_;
        wo0.c b17 = d1Var.b(q3Var, fVar.a());
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = pVar.f103744g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22628xfde5d61d, "<get-musicCover>(...)");
        ((wo0.b) b17).b(c22628xfde5d61d, true);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.String m75945x2fec8307 = d22Var.m75945x2fec8307(1);
        android.widget.TextView textView2 = pVar.f103745h;
        float textSize = textView2.getTextSize();
        ((ke0.e) xVar).getClass();
        textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, m75945x2fec8307, textSize));
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        android.widget.TextView textView3 = pVar.f103746i;
        float textSize2 = textView3.getTextSize();
        ((ke0.e) xVar2).getClass();
        textView3.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context2, string, textSize2));
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = pVar.f103743f;
        if (c22789xd23e9a9b != null) {
            if (this.f103837s && vgVar.f315788b == 1) {
                z17 = true;
            }
            if (pVar.f103748n || !z17) {
                android.view.View view2 = pVar.f103747m;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view2, "<get-playingBg>(...)");
                J(c22789xd23e9a9b, view2, vgVar.f315788b);
            } else {
                p3325xe03a0797.p3326xc267989b.y0 y0Var = pVar.f374653d;
                if (y0Var != null) {
                    p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new bm2.r(c22789xd23e9a9b, pVar, this, vgVar, null), 3, null);
                }
            }
        }
        pVar.f3639x46306858.setOnClickListener(new bm2.s(this, pVar, i17, vgVar));
    }

    public final void I(java.util.ArrayList arrayList, java.lang.String str) {
        if (zl2.q4.f555466a.E()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str + "(MusicList):");
            if (arrayList != null) {
                int i17 = 0;
                for (java.lang.Object obj : arrayList) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    sb6.append("[" + i17 + ',' + ((dk2.vg) obj) + ']');
                    i17 = i18;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f103829h, sb6.toString());
        }
    }

    public final void J(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b, android.view.View view, int i17) {
        boolean z17 = this.f103837s;
        if (i17 == 1) {
            if (!z17) {
                c22789xd23e9a9b.setVisibility(8);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicEditAdapter", "setPagViewState", "(Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicEditAdapter", "setPagViewState", "(Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            c22789xd23e9a9b.setVisibility(0);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicEditAdapter", "setPagViewState", "(Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicEditAdapter", "setPagViewState", "(Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (c22789xd23e9a9b.f()) {
                return;
            }
            c22789xd23e9a9b.g();
            return;
        }
        if (i17 != 2) {
            if (z17) {
                c22789xd23e9a9b.n();
            }
            c22789xd23e9a9b.setVisibility(8);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicEditAdapter", "setPagViewState", "(Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicEditAdapter", "setPagViewState", "(Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (!z17) {
            c22789xd23e9a9b.setVisibility(8);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicEditAdapter", "setPagViewState", "(Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicEditAdapter", "setPagViewState", "(Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicEditAdapter", "setPagViewState", "(Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicEditAdapter", "setPagViewState", "(Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c22789xd23e9a9b.n();
        c22789xd23e9a9b.m82582x3ae760af(0.0d);
        c22789xd23e9a9b.setVisibility(0);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        int size = this.f103831m.size();
        zl2.r4.f555483a.M2(this.f103829h, "getItemCount " + size);
        return size;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return ((dk2.vg) this.f103831m.get(i17)).f315790d;
    }

    @Override // in5.q0
    public void y(in5.r0 r0Var, int i17, java.util.List payloads) {
        bm2.n holder = (bm2.n) r0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        x(holder, i17);
    }

    @Override // in5.q0
    public in5.r0 z(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (i17 == 1) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.amc, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
            return new bm2.o(this, inflate);
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.amf, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate2);
        return new bm2.p(this, inflate2);
    }
}
