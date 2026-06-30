package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes10.dex */
public final class u6 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g7 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f217629d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f217630e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f217631f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f217632g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashSet f217633h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f217634i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f217630e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.r6(this, activity));
        this.f217632g = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t6.f217518d);
        this.f217633h = new java.util.HashSet();
        this.f217634i = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q6.f217199d);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.f5 O6() {
        if (this.f217629d) {
            return P6();
        }
        return null;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.f5 P6() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.f5) ((jz5.n) this.f217630e).mo141623x754a37bb();
    }

    public final void Q6(so2.w0 msg) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15268x6a41bd8a c15268x6a41bd8a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 presenter;
        yw2.a0 a0Var;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.f5 O6 = O6();
        if (O6 == null || (c15268x6a41bd8a = O6.f213600a) == null || (presenter = c15268x6a41bd8a.getPresenter()) == null) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        long Z = pm0.v.Z(msg.f492214c);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y yVar = presenter.f187743g;
        so2.z0 z0Var = yVar.f190001c;
        boolean z17 = true;
        int e17 = z0Var != null && (Z > z0Var.E.f66939xc8a07680 ? 1 : (Z == z0Var.E.f66939xc8a07680 ? 0 : -1)) == 0 ? 0 : yVar.e(Z);
        if (e17 == -1) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DrawerPresenter", "onCommentTranslated " + Z);
        so2.y0 f17 = yVar.f(e17);
        java.lang.String str = msg.f492217f;
        if (str == null || str.length() == 0) {
            f17.f492242m = 3;
        } else {
            f17.f492242m = 2;
        }
        f17.f492244o = msg.f492219h;
        f17.f492245p = msg;
        android.text.SpannableString spannableString = f17.f492246q;
        if (spannableString != null && spannableString.length() != 0) {
            z17 = false;
        }
        if (z17) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str2 = msg.f492217f;
            if (str2 == null) {
                str2 = "";
            }
            ((ke0.e) xVar).getClass();
            f17.f492246q = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.n(presenter.f187740d, str2, 0.0f);
        }
        if ((msg.f492216e && !presenter.R) || f17.f492243n == 0 || (a0Var = presenter.f187749o) == null || (m82555x4905e9fa = a0Var.s().m82555x4905e9fa()) == null || (mo7946xf939df19 = m82555x4905e9fa.mo7946xf939df19()) == null) {
            return;
        }
        mo7946xf939df19.m8147xed6e4d18(e17);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0020 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R6(java.util.List r11) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u6.R6(java.util.List):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 footer;
        long[] longArrayExtra;
        java.util.ArrayList<java.lang.String> stringArrayListExtra;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 footer2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 footer3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.CloseDrawerCallback closeDrawerCallback;
        super.mo2273x9d4787cb(i17, i18, intent);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.f5 O6 = O6();
        if (O6 != null) {
            boolean z17 = i17 == 503;
            if (i17 == 502 || z17) {
                java.lang.Long l17 = null;
                java.lang.String str = (intent == null || (stringArrayListExtra = intent.getStringArrayListExtra("key_select_image_list")) == null) ? null : (java.lang.String) kz5.n0.Z(stringArrayListExtra);
                if (intent != null && (longArrayExtra = intent.getLongArrayExtra("SELECT_IMAGES_MODIFIED_TIME")) != null) {
                    l17 = kz5.z.N(longArrayExtra);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCommentComponent", "image %s", str);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15268x6a41bd8a c15268x6a41bd8a = O6.f213600a;
                if (c15268x6a41bd8a != null && (footer = c15268x6a41bd8a.getFooter()) != null) {
                    footer.t(str, z17, l17);
                }
            }
            if (intent == null) {
                return;
            }
            if (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.r().r()).intValue() == 1 && i17 == 500) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.c5 c5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.c5) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.f5.f213599k.remove(java.lang.Long.valueOf(intent.getLongExtra("COMMENT_RESULT_KEY", 0L)));
                if (c5Var != null && (closeDrawerCallback = O6.f213604e) != null) {
                    closeDrawerCallback.a(c5Var.f213282a, c5Var.f213283b, false);
                }
            }
            if (i17 == 501) {
                if (i18 != -1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15268x6a41bd8a c15268x6a41bd8a2 = O6.f213600a;
                    if (c15268x6a41bd8a2 == null || (footer2 = c15268x6a41bd8a2.getFooter()) == null) {
                        return;
                    }
                    footer2.m61859xdb574fcd().postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.u5(footer2), 300L);
                    return;
                }
                byte[] byteArrayExtra = intent.getByteArrayExtra("key_select_contact");
                if (byteArrayExtra != null) {
                    try {
                        r45.gb4 gb4Var = new r45.gb4();
                        gb4Var.mo11468x92b714fd(byteArrayExtra);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15268x6a41bd8a c15268x6a41bd8a3 = O6.f213600a;
                        if (c15268x6a41bd8a3 == null || (footer3 = c15268x6a41bd8a3.getFooter()) == null) {
                            return;
                        }
                        footer3.q(gb4Var);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderCommentComponent", "onActivityResult LocalFinderAtContact parseFrom:%s", e17.getMessage());
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo2274xbdc3c5dc() {
        /*
            r7 = this;
            com.tencent.mm.plugin.finder.view.f5 r0 = r7.O6()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            boolean r0 = r0.b()
            if (r0 != r1) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            if (r0 == 0) goto L97
            android.app.Activity r0 = r7.m80379x76847179()
            java.lang.String r3 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r0, r3)
            pf5.z r4 = pf5.z.f435481a
            boolean r5 = r0 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112
            java.lang.String r6 = "Check failed."
            if (r5 == 0) goto L8d
            androidx.appcompat.app.AppCompatActivity r0 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) r0
            pf5.v r0 = r4.a(r0)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.di> r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.di.class
            androidx.lifecycle.c1 r0 = r0.a(r5)
            com.tencent.mm.plugin.finder.viewmodel.component.di r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.di) r0
            com.tencent.mm.plugin.finder.webview.l0 r0 = r0.f215676d
            if (r0 == 0) goto L4a
            oy2.l r5 = r0.f218415b
            boolean r5 = r5.isAttachedToWindow()
            if (r5 != 0) goto L45
            boolean r0 = r0.f218419f
            if (r0 == 0) goto L43
            goto L45
        L43:
            r0 = r2
            goto L46
        L45:
            r0 = r1
        L46:
            if (r0 != r1) goto L4a
            r0 = r1
            goto L4b
        L4a:
            r0 = r2
        L4b:
            if (r0 != 0) goto L97
            android.app.Activity r0 = r7.m80379x76847179()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r0, r3)
            boolean r3 = r0 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112
            if (r3 == 0) goto L83
            androidx.appcompat.app.AppCompatActivity r0 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) r0
            pf5.v r0 = r4.a(r0)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.v6> r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.v6.class
            pf5.b0 r0 = r0.e(r3)
            com.tencent.mm.plugin.finder.viewmodel.component.v6 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.v6) r0
            if (r0 == 0) goto L76
            com.tencent.mm.plugin.finder.view.FinderLikeDrawer r0 = r0.f217745d
            if (r0 == 0) goto L71
            boolean r0 = r0.q()
            goto L72
        L71:
            r0 = r2
        L72:
            if (r0 != r1) goto L76
            r0 = r1
            goto L77
        L76:
            r0 = r2
        L77:
            if (r0 != 0) goto L97
            com.tencent.mm.plugin.finder.view.f5 r0 = r7.O6()
            if (r0 == 0) goto L82
            r0.a()
        L82:
            return r1
        L83:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r6.toString()
            r0.<init>(r1)
            throw r0
        L8d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r6.toString()
            r0.<init>(r1)
            throw r0
        L97:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u6.mo2274xbdc3c5dc():boolean");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        m80379x76847179().getWindow().setSoftInputMode(50);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15268x6a41bd8a c15268x6a41bd8a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.f5 O6 = O6();
        if (O6 != null && (c15268x6a41bd8a = O6.f213600a) != null) {
            c15268x6a41bd8a.b();
        }
        jz5.g gVar = this.f217634i;
        java.util.ArrayList arrayList = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.h7) ((jz5.n) gVar).mo141623x754a37bb()).f188438b;
        if (arrayList.contains(this)) {
            arrayList.remove(this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.h7 h7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.h7) ((jz5.n) gVar).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.j30 j30Var = h7Var.f188437a;
        if (j30Var != null) {
            if (j30Var.f188614d != null) {
                j30Var.f188615e.d();
                db2.x3 x3Var = j30Var.f188614d;
                if (x3Var != null) {
                    x3Var.j();
                }
            }
            j30Var.f188614d = null;
            j30Var.f188613c = false;
        }
        h7Var.f188440d.clear();
        h7Var.f188439c.clear();
        h7Var.f188438b.clear();
        ((android.util.LruCache) ((jz5.n) this.f217632g).mo141623x754a37bb()).evictAll();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        O6();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15268x6a41bd8a c15268x6a41bd8a;
        yw2.a0 a0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.f5 O6 = O6();
        if (O6 == null || (c15268x6a41bd8a = O6.f213600a) == null) {
            return;
        }
        c15268x6a41bd8a.x(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var = c15268x6a41bd8a.presenter;
        android.view.View view = (a7Var == null || (a0Var = a7Var.f187749o) == null) ? null : a0Var.A;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            android.view.View view2 = view;
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderCommentDrawer", "onUIResume", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/view/FinderCommentDrawer", "onUIResume", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var2 = c15268x6a41bd8a.presenter;
        yw2.a0 a0Var2 = a7Var2 != null ? a7Var2.f187749o : null;
        if (a0Var2 != null) {
            a0Var2.A = null;
        }
        if (c15268x6a41bd8a.q()) {
            c15268x6a41bd8a.w();
        }
    }
}
