package ni2;

/* loaded from: classes3.dex */
public final class w extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g implements ni2.v2 {

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f419020h;

    /* renamed from: i, reason: collision with root package name */
    public fg2.i0 f419021i;

    /* renamed from: m, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff f419022m;

    /* renamed from: n, reason: collision with root package name */
    public p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe f419023n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f419024o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f419025p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f419026q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f419027r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f419028s;

    /* renamed from: t, reason: collision with root package name */
    public final int f419029t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        super(context, false, zl2.u4.f555522e, false, 8, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f419020h = basePlugin;
        this.f419028s = jz5.h.b(new ni2.s(this));
        int h07 = ((int) (com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y * (ae2.in.f85221a.h0() / 100.0f))) - com.p314xaae8f345.mm.ui.bl.c(context);
        this.f419029t = h07;
        fg2.i0 i0Var = this.f419021i;
        if (i0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = i0Var.f343607a.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = h07;
        }
        this.f199917g.c(null);
    }

    public final void A(km2.q qVar, java.util.List list, km2.q qVar2) {
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = this.f419023n;
        if (c1190x18d3c3fe == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
            throw null;
        }
        c1190x18d3c3fe.m8315x6cab2c8d(new ni2.k(this.f419020h, qVar, list, this));
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe2 = this.f419023n;
        if (c1190x18d3c3fe2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
            throw null;
        }
        c1190x18d3c3fe2.m8321x40341e13(list.size() - 1);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = this.f419022m;
        if (c2718xca2902ff == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tabLayout");
            throw null;
        }
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe3 = this.f419023n;
        if (c1190x18d3c3fe3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
            throw null;
        }
        c2718xca2902ff.m20382x3da43a7b(c1190x18d3c3fe3);
        if (qVar2 != null) {
            java.util.Iterator it = list.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) it.next()).f390703a, qVar2.f390703a)) {
                    break;
                } else {
                    i17++;
                }
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            if (!(valueOf.intValue() != -1)) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe4 = this.f419023n;
                if (c1190x18d3c3fe4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
                    throw null;
                }
                c1190x18d3c3fe4.m8316x940d026a(intValue);
            }
        }
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe5 = this.f419023n;
        if (c1190x18d3c3fe5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
            throw null;
        }
        c1190x18d3c3fe5.m8289xa5a25773(new ni2.v(this));
        if (zl2.r4.f555483a.w1()) {
            ml2.q2 q2Var = ml2.q2.F;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "report21054 op: 33 ");
            ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(q2Var, "", -1, -1);
            return;
        }
        ml2.n4 n4Var = ml2.n4.G;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 30");
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.ik((ml2.r0) c17, n4Var, null, 0, 6, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void a() {
        yh2.h memberAdapter;
        super.a();
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = this.f419023n;
        if (c1190x18d3c3fe == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
            throw null;
        }
        n3.t1 t1Var = new n3.t1(c1190x18d3c3fe);
        while (t1Var.hasNext()) {
            android.view.View view = (android.view.View) t1Var.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1508x6580a04.C14234xd22fbb35 c14234xd22fbb35 = view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1508x6580a04.C14234xd22fbb35 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1508x6580a04.C14234xd22fbb35) view : null;
            if (c14234xd22fbb35 != null && (memberAdapter = c14234xd22fbb35.getMemberAdapter()) != null) {
                memberAdapter.f543927p.clear();
                memberAdapter.m8146xced61ae5();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.deu;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int l() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        int i17 = com.p314xaae8f345.mm.R.id.f6b;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f6b);
        if (c22699x3dcdb352 != null) {
            i17 = com.p314xaae8f345.mm.R.id.f6c;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f6c);
            if (frameLayout != null) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22652x7ce5f495 c22652x7ce5f495 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22652x7ce5f495) rootView;
                i17 = com.p314xaae8f345.mm.R.id.f8x;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f8x);
                if (textView != null) {
                    i17 = com.p314xaae8f345.mm.R.id.f566354tp4;
                    android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f566354tp4);
                    if (textView2 != null) {
                        i17 = com.p314xaae8f345.mm.R.id.qz6;
                        android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.qz6);
                        if (imageView != null) {
                            i17 = com.p314xaae8f345.mm.R.id.r1b;
                            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.r1b);
                            if (c2718xca2902ff != null) {
                                i17 = com.p314xaae8f345.mm.R.id.r1p;
                                p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.r1p);
                                if (c1190x18d3c3fe != null) {
                                    this.f419021i = new fg2.i0(c22652x7ce5f495, c22699x3dcdb352, frameLayout, c22652x7ce5f495, textView, textView2, imageView, c2718xca2902ff, c1190x18d3c3fe);
                                    c22699x3dcdb352.setOnClickListener(new ni2.t(this));
                                    fg2.i0 i0Var = this.f419021i;
                                    if (i0Var == null) {
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                        throw null;
                                    }
                                    com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff tlLinkMicContributor = i0Var.f343611e;
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tlLinkMicContributor, "tlLinkMicContributor");
                                    this.f419022m = tlLinkMicContributor;
                                    fg2.i0 i0Var2 = this.f419021i;
                                    if (i0Var2 == null) {
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                        throw null;
                                    }
                                    p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe vpLinkMicContributor = i0Var2.f343612f;
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(vpLinkMicContributor, "vpLinkMicContributor");
                                    this.f419023n = vpLinkMicContributor;
                                    fg2.i0 i0Var3 = this.f419021i;
                                    if (i0Var3 == null) {
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                        throw null;
                                    }
                                    android.widget.TextView finderLiveMainTitleText = i0Var3.f343608b;
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveMainTitleText, "finderLiveMainTitleText");
                                    this.f419024o = finderLiveMainTitleText;
                                    fg2.i0 i0Var4 = this.f419021i;
                                    if (i0Var4 == null) {
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                        throw null;
                                    }
                                    android.widget.ImageView ivBgPkRanklist = i0Var4.f343610d;
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ivBgPkRanklist, "ivBgPkRanklist");
                                    this.f419025p = ivBgPkRanklist;
                                    fg2.i0 i0Var5 = this.f419021i;
                                    if (i0Var5 == null) {
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                        throw null;
                                    }
                                    android.widget.TextView finderLiveSubtitleText = i0Var5.f343609c;
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveSubtitleText, "finderLiveSubtitleText");
                                    this.f419026q = finderLiveSubtitleText;
                                    android.widget.TextView textView3 = this.f419024o;
                                    if (textView3 != null) {
                                        com.p314xaae8f345.mm.ui.fk.a(textView3);
                                        return;
                                    } else {
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tvTitle");
                                        throw null;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i17)));
    }

    public final void y(km2.q qVar, boolean z17) {
        java.lang.String str;
        java.lang.String str2 = qVar.f390706d;
        if (str2 == null) {
            str2 = "";
        }
        if (!(str2.length() > 10)) {
            str2 = null;
        }
        if (str2 == null || (str = r26.p0.E0(str2, 10).concat("...")) == null) {
            str = qVar.f390706d;
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = this.f419022m;
        if (c2718xca2902ff == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tabLayout");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c2718xca2902ff, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicGiftMemberPanelWidget", "openPanelForSingleUser", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/FinderLiveLinkMicUser;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c2718xca2902ff.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c2718xca2902ff, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicGiftMemberPanelWidget", "openPanelForSingleUser", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/FinderLiveLinkMicUser;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.ImageView imageView = this.f419025p;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ivBgPkRanklist");
            throw null;
        }
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(imageView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicGiftMemberPanelWidget", "openPanelForSingleUser", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/FinderLiveLinkMicUser;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        imageView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(imageView, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicGiftMemberPanelWidget", "openPanelForSingleUser", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/FinderLiveLinkMicUser;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.content.Context context = this.f199914d;
        if (z17) {
            android.widget.TextView textView = this.f419024o;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tvTitle");
                throw null;
            }
            textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m3f, str));
        } else {
            android.widget.TextView textView2 = this.f419024o;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tvTitle");
                throw null;
            }
            textView2.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m3b, str));
        }
        this.f419027r = true;
        A(qVar, kz5.p0.f395529d, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0247, code lost:
    
        if ((!r8.isEmpty()) != false) goto L119;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Type inference failed for: r12v10, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v15, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r12v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r21v0, types: [com.tencent.mm.plugin.finder.live.widget.g, ni2.w] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.util.List, java.util.Collection, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v27, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r7v6, types: [kz5.p0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(fj2.k r22, km2.q r23) {
        /*
            Method dump skipped, instructions count: 828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ni2.w.z(fj2.k, km2.q):void");
    }
}
