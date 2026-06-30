package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class s7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f232978d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f232979e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16677x5944b67e f232980f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f232981g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16677x5944b67e c16677x5944b67e, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        super(0);
        this.f232978d = i17;
        this.f232979e = i18;
        this.f232980f = c16677x5944b67e;
        this.f232981g = activityC0065xcd7aa112;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        java.util.List m82898xfb7e5820;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.w2 w2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.v2 v2Var;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de;
        int i18 = this.f232978d;
        if (i18 >= 0 && (i17 = this.f232979e) >= 0) {
            java.util.Collection<java.lang.ref.WeakReference> values = this.f232980f.f232541p.values();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
            for (java.lang.ref.WeakReference weakReference : values) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p1912x373aa5.C16639xd269873d c16639xd269873d = (com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p1912x373aa5.C16639xd269873d) weakReference.get();
                if (c16639xd269873d != null) {
                    c16639xd269873d.m67245x3ae760af(i18);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p1912x373aa5.C16639xd269873d c16639xd269873d2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p1912x373aa5.C16639xd269873d) weakReference.get();
                if (c16639xd269873d2 != null) {
                    c16639xd269873d2.m67243xadb2e1ef(i17);
                }
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f232981g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1 s1Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1.class);
            s1Var.f232954o = i18;
            int i19 = s1Var.f232955p;
            ll3.h1 h1Var = s1Var.f232953n;
            if (h1Var != null) {
                i19 = h1Var.a(i18);
            }
            int i27 = s1Var.f232955p;
            java.util.ArrayList arrayList = s1Var.f232951i;
            int i28 = 1;
            if (i19 != i27 && i19 >= 0) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) it.next();
                    if (c1163xf1deaba4.getVisibility() == 0 && (c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) c1163xf1deaba4.getLayoutManager()) != null) {
                        int w17 = c1162x665295de.w();
                        int y17 = c1162x665295de.y();
                        c1163xf1deaba4.f1();
                        if (((i19 > y17 + i28 || w17 - i28 > i19) ? 0 : i28) != 0) {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                            arrayList2.add(java.lang.Integer.valueOf(i19));
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(c1163xf1deaba4, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC", "setCurrentTime", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                            c1163xf1deaba4.c1(((java.lang.Integer) arrayList2.get(0)).intValue());
                            yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC", "setCurrentTime", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                        } else {
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                            arrayList3.add(java.lang.Integer.valueOf(i19));
                            java.util.Collections.reverse(arrayList3);
                            yj0.a.d(c1163xf1deaba4, arrayList3.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC", "setCurrentTime", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                            c1163xf1deaba4.a1(((java.lang.Integer) arrayList3.get(0)).intValue());
                            yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC", "setCurrentTime", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                        }
                    }
                    i28 = 1;
                }
            }
            s1Var.f232955p = i19;
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6 R6 = s1Var.R6();
            if (R6 != null && R6.getVisibility() == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6 R62 = s1Var.R6();
                if (R62 != null) {
                    int i29 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6.I;
                    pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.i3(R62, i18, true));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6 R63 = s1Var.R6();
                if (R63 != null && R63.A != 0) {
                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = R63.lyricRv;
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 B0 = c22849x81a93d25 != null ? c22849x81a93d25.B0(0) : null;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(B0, "null cannot be cast to non-null type com.tencent.mm.plugin.mv.ui.view.LyricItemDecoration");
                    com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.a0 a0Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.a0) B0;
                    if (R63.showPreludeLenNum <= 3) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicMvCommentView", "checkPreludeTime preludeLen:%d", java.lang.Long.valueOf(R63.A));
                        R63.showPreludeLenNum++;
                    }
                    long j17 = R63.A;
                    a0Var.f233303r = j17;
                    long j18 = i18;
                    if (j18 < j17 && !a0Var.f233302q) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicMvCommentView", "startAnim");
                        a0Var.g(j18);
                        R63.isShowLyricPrelude = true;
                        if (R63.f233228u == 0) {
                            R63.c(0, 0);
                        }
                    } else if (j18 > j17) {
                        if (a0Var.f233302q) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.a0.f233291x, "stopAnim");
                        }
                        a0Var.f233302q = false;
                        a0Var.f233293e.invalidate();
                        R63.isShowLyricPrelude = false;
                        if (R63.f233228u == 0) {
                            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = R63.f233215e;
                            if ((c22848x6ddd90cf == null || (m82898xfb7e5820 = c22848x6ddd90cf.m82898xfb7e5820()) == null || (w2Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.w2) m82898xfb7e5820.get(0)) == null || (v2Var = w2Var.f233512d) == null || v2Var.f233502f) ? false : true) {
                                R63.c(0, 0);
                            }
                        }
                    }
                }
            } else {
                long j19 = s1Var.f232963x;
                if (j19 != 0) {
                    int i37 = s1Var.I;
                    java.lang.String str = s1Var.f232946d;
                    if (i37 <= 10) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkPreludeTime preludeLen:%d, ", java.lang.Long.valueOf(j19));
                        s1Var.I++;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16692x9f29da01 c16692x9f29da01 = s1Var.f232962w;
                    if (c16692x9f29da01 != null) {
                        c16692x9f29da01.m67321x1d4ee7ea(s1Var.f232963x);
                        long j27 = i18;
                        if (j27 < s1Var.f232963x && !c16692x9f29da01.getEnableAnim()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkPreludeTime startAnim");
                            c16692x9f29da01.setVisibility(0);
                            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = s1Var.f232950h;
                            if (c1163xf1deaba42 != null) {
                                c1163xf1deaba42.setVisibility(4);
                            }
                            c16692x9f29da01.f(j27);
                            s1Var.f232964y = true;
                        } else if (j27 > s1Var.f232963x) {
                            if (c16692x9f29da01.getEnableAnim()) {
                                c16692x9f29da01.enableAnim = false;
                                c16692x9f29da01.invalidate();
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkPreludeTime stopAnim");
                            }
                            s1Var.f232964y = false;
                            if (c16692x9f29da01.getVisibility() == 0) {
                                c16692x9f29da01.setVisibility(8);
                            }
                            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = s1Var.f232950h;
                            if (!(c1163xf1deaba43 != null && c1163xf1deaba43.getVisibility() == 0)) {
                                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba44 = s1Var.f232950h;
                                if (c1163xf1deaba44 != null) {
                                    c1163xf1deaba44.setVisibility(0);
                                }
                                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba45 = s1Var.f232950h;
                                if (c1163xf1deaba45 != null) {
                                    c1163xf1deaba45.setAlpha(1.0f);
                                }
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "scrollToFistLine");
                                if (s1Var.f232955p <= 0) {
                                    java.util.Iterator it6 = arrayList.iterator();
                                    while (it6.hasNext()) {
                                        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba46 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) it6.next();
                                        if (c1163xf1deaba46.getVisibility() == 0 && ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) c1163xf1deaba46.getLayoutManager()) != null) {
                                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                                            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                                            arrayList4.add(0);
                                            java.util.Collections.reverse(arrayList4);
                                            yj0.a.d(c1163xf1deaba46, arrayList4.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC", "scrollToFistLine", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                                            c1163xf1deaba46.c1(((java.lang.Integer) arrayList4.get(0)).intValue());
                                            yj0.a.f(c1163xf1deaba46, "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC", "scrollToFistLine", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0.class)).f232843i.set(14, java.lang.Integer.valueOf(i17));
        }
        return jz5.f0.f384359a;
    }
}
