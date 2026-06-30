package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1;

/* loaded from: classes2.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.e0 f186795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qj2 f186796e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f186797f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186798g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f186799h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186800i;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.e0 e0Var, r45.qj2 qj2Var, long j17, java.lang.String str, int i17, java.lang.String str2) {
        this.f186795d = e0Var;
        this.f186796e = qj2Var;
        this.f186797f = j17;
        this.f186798g = str;
        this.f186799h = i17;
        this.f186800i = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.app.Activity m81193x1252e2cf;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC$initNativeDramaTab$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.e0 e0Var = this.f186795d;
        android.app.Activity m80379x76847179 = e0Var.m80379x76847179();
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = m80379x76847179 instanceof com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 ? (com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) m80379x76847179 : null;
        if (abstractActivityC22579xbed01a37 != null && (m81193x1252e2cf = abstractActivityC22579xbed01a37.m81193x1252e2cf()) != null) {
            pf5.z zVar = pf5.z.f435481a;
            if (!(m81193x1252e2cf instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.y) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) m81193x1252e2cf).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.y.class);
            if (yVar != null) {
                java.util.ArrayList episodeList = e0Var.f186759p;
                int i17 = e0Var.f186762s;
                r45.qj2 nativeDramaInfo = this.f186796e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nativeDramaInfo, "nativeDramaInfo");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(episodeList, "episodeList");
                long m75942xfb822ef2 = nativeDramaInfo.m75942xfb822ef2(0);
                if (m75942xfb822ef2 == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderNativeDramaDramaUIC", "no id");
                } else {
                    com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = yVar.f186725m;
                    long j17 = this.f186797f;
                    java.lang.String str = this.f186798g;
                    int i18 = this.f186799h;
                    if (c22584xf7d97e83 == null) {
                        if (yVar.f186726n == null) {
                            android.view.View decorView = yVar.m158354x19263085().getWindow().getDecorView();
                            android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
                            if (viewGroup != null) {
                                android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(yVar.m80379x76847179());
                                frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
                                frameLayout.setId(com.p314xaae8f345.mm.R.id.tfe);
                                frameLayout.setBackgroundColor(frameLayout.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
                                yVar.f186727o = frameLayout;
                                int k17 = i65.a.k(yVar.m80379x76847179()) + com.p314xaae8f345.mm.ui.bk.p(yVar.m80379x76847179());
                                float a17 = kx2.a.f394811a.a(yVar.m80379x76847179());
                                float dimension = yVar.m80379x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561259di);
                                float f17 = k17 * a17;
                                if (dimension < f17) {
                                    dimension = f17;
                                }
                                android.widget.FrameLayout frameLayout2 = yVar.f186727o;
                                if (frameLayout2 != null) {
                                    gx2.a aVar = new gx2.a();
                                    aVar.f358870c = dimension;
                                    aVar.f358871d = new hx2.g(yVar.m80379x76847179(), 0, 0, 0, false, false, 62, null);
                                    aVar.f358872e = new hx2.c(frameLayout2);
                                    aVar.f358873f = new hx2.b(yVar.m80379x76847179(), false, 2, null);
                                    yVar.f186726n = aVar.b(viewGroup);
                                }
                            }
                        }
                        android.content.Intent intent = new android.content.Intent();
                        p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = yVar.m158354x19263085().mo7595x9cdc264().m7630xb2c12e75();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7630xb2c12e75, "beginTransaction(...)");
                        android.widget.FrameLayout frameLayout3 = yVar.f186727o;
                        if (frameLayout3 != null) {
                            frameLayout3.removeAllViews();
                        }
                        intent.putExtra("native_drama_id", nativeDramaInfo.m75942xfb822ef2(0));
                        intent.putExtra("native_drama_init_position", i17);
                        intent.putExtra("native_drama_enter_object_id", j17);
                        intent.putExtra("native_drama_enter_promotion_comment_scene", i18);
                        intent.putExtra("native_drama_enter_dupflag", str);
                        r45.nb4 nb4Var = new r45.nb4();
                        java.util.LinkedList m75941xfb821914 = nb4Var.m75941xfb821914(0);
                        if (m75941xfb821914 != null) {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(episodeList, 10));
                            java.util.Iterator it = episodeList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((zb2.b) it.next()).f552791d);
                            }
                            m75941xfb821914.addAll(arrayList2);
                        }
                        intent.putExtra("native_drama_episode", nb4Var.mo14344x5f01b1f6());
                        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 b17 = lk5.q0.b("com.tencent.mm.plugin.finder.drama.drawer.FinderNativeDramaAllEpisodeUI", intent, false, 4, null);
                        yVar.f186725m = b17;
                        b17.q0(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.r(yVar));
                        gx2.q qVar = yVar.f186726n;
                        if (qVar != null) {
                            qVar.m132474x77f391b9(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.s(yVar));
                        }
                        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e832 = yVar.f186725m;
                        if (c22584xf7d97e832 != null) {
                            m7630xb2c12e75.k(com.p314xaae8f345.mm.R.id.tfe, c22584xf7d97e832, null);
                            m7630xb2c12e75.f();
                        }
                    } else {
                        gx2.q qVar2 = yVar.f186726n;
                        if (qVar2 != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1.m(qVar2, false, 1, null);
                        }
                        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e833 = yVar.f186725m;
                        if (c22584xf7d97e833 != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.c cVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.c) pf5.z.f435481a.b(c22584xf7d97e833).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.c.class);
                            cVar.getClass();
                            cVar.f186736f = i17;
                            cVar.f186737g = m75942xfb822ef2;
                            java.util.ArrayList arrayList3 = cVar.f186735e;
                            arrayList3.clear();
                            arrayList3.addAll(episodeList);
                            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = cVar.f186734d;
                            if (c1163xf1deaba4 != null && (mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19()) != null) {
                                mo7946xf939df19.m8146xced61ae5();
                            }
                            cVar.f186740m = i18;
                            cVar.f186738h = j17;
                            cVar.f186739i = str;
                            cVar.f186742o = this.f186800i;
                        }
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC$initNativeDramaTab$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
