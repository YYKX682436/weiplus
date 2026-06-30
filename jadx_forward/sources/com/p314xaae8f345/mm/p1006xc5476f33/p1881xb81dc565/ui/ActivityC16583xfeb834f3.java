package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.multitalk.ui.MultiTalkSelectContactUI */
/* loaded from: classes11.dex */
public class ActivityC16583xfeb834f3 extends com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 {
    public java.lang.String C;
    public java.util.HashSet E;
    public java.util.HashSet F;
    public java.util.ArrayList G;
    public boolean H;
    public sj3.p3 I;

    /* renamed from: J, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f231783J;
    public android.widget.FrameLayout K;
    public sj3.f1 M;
    public boolean D = true;
    public boolean L = false;
    public final android.view.View.OnClickListener N = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.v(this);
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d P = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5716x51d5635f>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.multitalk.ui.MultiTalkSelectContactUI.3
        {
            this.f39173x3fe91575 = 1177822575;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5716x51d5635f c5716x51d5635f) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5716x51d5635f c5716x51d5635f2 = c5716x51d5635f;
            if (!(c5716x51d5635f2 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5716x51d5635f) || c5716x51d5635f2.f136037g.f87792a != 0) {
                return false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ActivityC16583xfeb834f3.this.finish();
            return false;
        }
    };

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.a5 Z6() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.w(this, this.C);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.o4 a7() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.x(this, this.C);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public java.lang.String g7() {
        return getIntent().getStringExtra("titile");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c3x;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String string;
        java.lang.String string2;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p4 b76 = b7();
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d item = b76.getItem(i17 - this.f287979d.getHeaderViewsCount());
        if (item == null || (str = item.f288383s) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.multitalk.MultiTalkSelectContactUI", "ClickUser=%s", str);
        java.lang.String str4 = item.f288383s;
        if (c01.z1.r().equals(str4)) {
            return;
        }
        Y6();
        if (this.E.contains(str4)) {
            return;
        }
        boolean contains = this.F.contains(str4);
        android.view.View.OnClickListener onClickListener = this.N;
        if (contains) {
            if (this.H) {
                this.I.b(str4);
            }
            this.F.remove(str4);
            int indexOf = this.G.indexOf(str4);
            this.G.remove(str4);
            sj3.q5 q5Var = (sj3.q5) this.f231783J.mo7946xf939df19();
            java.util.ArrayList userNameList = this.G;
            q5Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userNameList, "userNameList");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onClickListener, "onClickListener");
            java.util.ArrayList arrayList = q5Var.f490251e;
            arrayList.clear();
            arrayList.add(c01.z1.r());
            int size = userNameList.size();
            for (int i18 = 0; i18 < size; i18++) {
                java.lang.Object obj = userNameList.get(i18);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                if (!q5Var.x((java.lang.String) obj) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(userNameList.get(i18), c01.z1.r())) {
                    arrayList.add(userNameList.get(i18));
                }
            }
            q5Var.f490252f = onClickListener;
            int size2 = arrayList.size();
            int i19 = q5Var.f490253g;
            if (size2 < 5) {
                for (int i27 = 0; i27 < 5; i27++) {
                    q5Var.m8147xed6e4d18(i27 + i19);
                }
            }
            q5Var.m8155x27702c4(indexOf + i19);
            this.K.setContentDescription(((sj3.q5) this.f231783J.mo7946xf939df19()).y().toString());
        } else {
            if (this.E.size() + this.F.size() == zj3.j.e()) {
                this.L = true;
                if (!zj3.c.k()) {
                    dp.a.m125854x26a183b(this, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h2v, java.lang.Integer.valueOf(zj3.j.e())), 0).show();
                    return;
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zj3.c.d()) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zj3.c.e())) {
                    string = zj3.c.d();
                    string2 = zj3.c.e();
                } else if (zj3.c.l()) {
                    string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.h2g);
                    string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574119h20);
                } else {
                    if (!zj3.c.n()) {
                        str2 = "";
                        str3 = str2;
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MeetingLinkHelper", "cannot get dialog wording, ignore");
                            return;
                        } else {
                            db5.e1.B(this, str2, "", str3, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new zj3.a(this), new zj3.b(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560057a5);
                            zj3.d.c(zj3.c.i(), 0, 1, 0, 0, 0, 0, 0, 0, "", 0);
                            return;
                        }
                    }
                    string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.h2h);
                    string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574120h21);
                }
                str3 = string2;
                str2 = string;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MeetingLinkHelper", "cannot get dialog wording, ignore");
                return;
            }
            if (this.H) {
                this.I.a(str4);
            }
            this.F.add(str4);
            this.G.add(str4);
            sj3.q5 q5Var2 = (sj3.q5) this.f231783J.mo7946xf939df19();
            java.util.ArrayList userNameList2 = this.G;
            q5Var2.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userNameList2, "userNameList");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onClickListener, "onClickListener");
            java.util.ArrayList arrayList2 = q5Var2.f490251e;
            arrayList2.clear();
            arrayList2.add(c01.z1.r());
            int size3 = userNameList2.size();
            for (int i28 = 0; i28 < size3; i28++) {
                java.lang.Object obj2 = userNameList2.get(i28);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                if (!q5Var2.x((java.lang.String) obj2) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(userNameList2.get(i28), c01.z1.r())) {
                    arrayList2.add(userNameList2.get(i28));
                }
            }
            q5Var2.f490252f = onClickListener;
            if (arrayList2.size() < 5) {
                for (int i29 = 0; i29 < 5; i29++) {
                    q5Var2.m8147xed6e4d18(q5Var2.f490253g + i29);
                }
            }
            q5Var2.m8149x8b456734(q5Var2.mo1894x7e414b06());
            this.K.setContentDescription(((sj3.q5) this.f231783J.mo7946xf939df19()).y().toString());
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f231783J;
        int mo1894x7e414b06 = c1163xf1deaba4.mo7946xf939df19().mo1894x7e414b06() - 1;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList3.add(java.lang.Integer.valueOf(mo1894x7e414b06));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(c1163xf1deaba4, arrayList3.toArray(), "com/tencent/mm/plugin/multitalk/ui/MultiTalkSelectContactUI", "handleItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "scrollToPosition", "(I)V");
        c1163xf1deaba4.a1(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/multitalk/ui/MultiTalkSelectContactUI", "handleItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "scrollToPosition", "(I)V");
        b76.notifyDataSetChanged();
        w7();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ff  */
    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo43517x10010bd5() {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ActivityC16583xfeb834f3.mo43517x10010bd5():void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void j7() {
        super.j7();
        this.H = getIntent().getBooleanExtra("key_need_gallery", false);
        java.lang.String stringExtra = getIntent().getStringExtra("chatroomName");
        this.C = stringExtra;
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(stringExtra)) {
            finish();
        }
        this.F = new java.util.HashSet();
        this.E = new java.util.HashSet();
        this.G = new java.util.ArrayList();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean l7() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean m7() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        android.view.ViewTreeObserver.OnDrawListener onDrawListener;
        sj3.f1 f1Var = this.M;
        android.view.View view = f1Var.f490039c;
        if (view != null && (onDrawListener = f1Var.f490044h) != null) {
            view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
            f1Var.f490037a = null;
        }
        this.P.mo48814x2efc64();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        qp1.h0.a(true, false, true);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        super.onStart();
        java.lang.String stringExtra = getIntent().getStringExtra("always_select_contact");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            this.E.addAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra.split(",")));
        }
        this.E.add(c01.z1.r());
        this.G.addAll(this.E);
        if (this.H) {
            this.I.a(c01.z1.r());
        }
        this.f231783J = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.n0b);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this);
        c1162x665295de.Q(0);
        this.f231783J.mo7967x900dcbe1(c1162x665295de);
        this.f231783J.mo7960x6cab2c8d(new sj3.q5(this));
        ((sj3.q5) this.f231783J.mo7946xf939df19()).B(this.G, this.N);
        this.P.mo48813x58998cd();
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.n0c);
        this.K = frameLayout;
        frameLayout.setContentDescription(((sj3.q5) this.f231783J.mo7946xf939df19()).y().toString());
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public boolean p5(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        java.lang.String str;
        if (!dVar.d() || (str = dVar.f288383s) == null) {
            return false;
        }
        return this.E.contains(str);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void p7() {
        super.p7();
        mo48674x36654fab();
        if (this.D) {
            qp1.h0.b();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(yi3.e.class);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public boolean t4(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        java.lang.String str;
        if (!dVar.d() || (str = dVar.f288383s) == null) {
            return false;
        }
        return this.F.contains(str);
    }

    public final void w7() {
        if (this.F.size() > 0) {
            mo60878xf6b21fea(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.h2l, java.lang.Integer.valueOf(this.E.size() + this.F.size())));
            m78500x43e00957(1, true);
        } else {
            mo60878xf6b21fea(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.h2m));
            m78500x43e00957(1, false);
        }
    }
}
