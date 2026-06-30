package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2665xc4e39b55;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/ui/chatting/history/person/MsgHistoryGalleryPersonRecommendUI;", "Lcom/tencent/mm/ui/immersive/ImmersiveBaseActivity;", "Lzc5/p;", "Lzc5/o;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.history.person.MsgHistoryGalleryPersonRecommendUI */
/* loaded from: classes10.dex */
public final class ActivityC21828xc79db19c extends com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractActivityC22432xeb4f0b3b implements zc5.p, zc5.o {
    public static final /* synthetic */ int F = 0;
    public boolean A;
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 B;
    public boolean C;
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2665xc4e39b55.C21829x8ea9a89d E;

    /* renamed from: v, reason: collision with root package name */
    public em.w1 f283344v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f283345w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f283346x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f283347y;

    /* renamed from: t, reason: collision with root package name */
    public final int f283342t = com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f283343u = kz5.c0.k(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2665xc4e39b55.C21827xd3270e1a.class);

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f283348z = jz5.h.b(new bd5.g(this));
    public final jz5.g D = jz5.h.b(new bd5.h(this));

    /* JADX WARN: Type inference failed for: r1v1, types: [com.tencent.mm.ui.chatting.history.person.MsgHistoryGalleryPersonRecommendUI$previewExitEventListener$1] */
    public ActivityC21828xc79db19c() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.E = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5711xb2c0933>(a0Var) { // from class: com.tencent.mm.ui.chatting.history.person.MsgHistoryGalleryPersonRecommendUI$previewExitEventListener$1
            {
                this.f39173x3fe91575 = -801824477;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5711xb2c0933 c5711xb2c0933) {
                android.view.View mo7935xa188593e;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5711xb2c0933 event = c5711xb2c0933;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                int i17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2665xc4e39b55.ActivityC21828xc79db19c.F;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2665xc4e39b55.ActivityC21828xc79db19c activityC21828xc79db19c = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2665xc4e39b55.ActivityC21828xc79db19c.this;
                xm3.t0 b17 = xm3.u0.b(activityC21828xc79db19c.h7());
                if (b17 == null) {
                    return false;
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = activityC21828xc79db19c.h7().getLayoutManager();
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) layoutManager : null;
                if (c1161x57298f5d == null) {
                    return false;
                }
                long j17 = event.f136031g.f89731a;
                int w17 = c1161x57298f5d.w();
                int y17 = c1161x57298f5d.y();
                java.util.List m82898xfb7e5820 = b17.m82898xfb7e5820();
                java.util.Iterator it = new e06.k(w17, y17).iterator();
                while (((e06.j) it).hasNext()) {
                    int b18 = ((kz5.x0) it).b();
                    java.lang.Object a07 = kz5.n0.a0(m82898xfb7e5820, b18);
                    uc5.h0 h0Var = a07 instanceof uc5.h0 ? (uc5.h0) a07 : null;
                    if (h0Var != null) {
                        uc5.d dVar = h0Var.f508027d;
                        uc5.d dVar2 = dVar instanceof dd5.n1 ? (dd5.n1) dVar : null;
                        if (dVar2 == null) {
                            dVar2 = dVar instanceof dd5.d3 ? (dd5.d3) dVar : null;
                            if (dVar2 != null) {
                            }
                        }
                        if (dVar2.p().m124847x74d37ac6() == j17 && (mo7935xa188593e = c1161x57298f5d.mo7935xa188593e(b18)) != null) {
                            int[] iArr = new int[2];
                            mo7935xa188593e.getLocationOnScreen(iArr);
                            int i18 = iArr[0];
                            am.wj wjVar = event.f136032h;
                            wjVar.f89821a = i18;
                            wjVar.f89822b = iArr[1];
                            wjVar.f89823c = mo7935xa188593e.getWidth();
                            wjVar.f89824d = mo7935xa188593e.getHeight();
                        }
                    }
                }
                return true;
            }
        };
    }

    @Override // zc5.p
    public void E1() {
        this.C = true;
    }

    @Override // zc5.p
    public long[] G() {
        java.util.List<uc5.l0> m82898xfb7e5820;
        xm3.t0 b17 = xm3.u0.b(h7());
        if (b17 == null || (m82898xfb7e5820 = b17.m82898xfb7e5820()) == null) {
            return new long[0];
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (uc5.l0 l0Var : m82898xfb7e5820) {
            if (l0Var instanceof uc5.h0) {
                uc5.d dVar = ((uc5.h0) l0Var).f508027d;
                if ((dVar instanceof dd5.n1) || (dVar instanceof dd5.d3)) {
                    arrayList.add(java.lang.Long.valueOf(dVar.p().m124847x74d37ac6()));
                }
            }
        }
        return kz5.n0.T0(arrayList);
    }

    @Override // com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractActivityC22432xeb4f0b3b
    public android.view.View V6() {
        android.view.View inflate = android.view.LayoutInflater.from(mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eke, (android.view.ViewGroup) null);
        this.f283344v = new em.w1(inflate);
        android.view.View view = X6().f336157a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view, "getInflateRootView(...)");
        view.setBackgroundColor(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a, null));
        em.w1 w1Var = this.f283344v;
        if (w1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 a17 = w1Var.a();
        bd5.f fVar = new bd5.f(this);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.a1.u(a17, fVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractActivityC22432xeb4f0b3b
    /* renamed from: Y6 */
    public boolean getF290471m() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractActivityC22432xeb4f0b3b
    /* renamed from: b7, reason: from getter */
    public int getF283342t() {
        return this.f283342t;
    }

    @Override // com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractActivityC22432xeb4f0b3b
    /* renamed from: c7, reason: from getter */
    public java.util.List getF283343u() {
        return this.f283343u;
    }

    @Override // zc5.o
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2664x62f6fe4.C21826x3a78e574 d3() {
        return (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2664x62f6fe4.C21826x3a78e574) ((jz5.n) this.D).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 h7() {
        em.w1 w1Var = this.f283344v;
        if (w1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 a17 = w1Var.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getRecyclerView(...)");
        return a17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractActivityC22432xeb4f0b3b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("kTalker");
        if (stringExtra == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PersonRecommendUI", "talker is null, finishing");
            finish();
            return;
        }
        this.f283345w = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("kLabelId");
        if (stringExtra2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PersonRecommendUI", "labelId is null, finishing");
            finish();
            return;
        }
        this.f283346x = stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra("kCropImagePath");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.f283347y = stringExtra3;
        int h17 = i65.a.h(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561177bj);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 h76 = h7();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(mo55332x76847179(), 4);
        c1161x57298f5d.B = new bd5.e(this);
        h76.mo7967x900dcbe1(c1161x57298f5d);
        h7().N(new ed5.a(4, h17, 0, 4, null));
        h7().m7964x8d4ad49c(null);
        v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) ((jz5.n) this.f283348z).mo141623x754a37bb(), null, new bd5.j(this, null), 1, null);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 w2Var = this.B;
        if (w2Var != null) {
            h7().V0(w2Var);
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractActivityC22432xeb4f0b3b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!this.C) {
            return;
        }
        this.C = false;
        java.util.Set set = xc5.l.f535054r;
        xc5.l.f535054r = null;
        xm3.t0 b17 = xm3.u0.b(h7());
        if (b17 == null) {
            return;
        }
        java.util.List m82898xfb7e5820 = b17.m82898xfb7e5820();
        if (!(set == null || set.isEmpty())) {
            java.util.HashSet hashSet = new java.util.HashSet(set);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = h7().getLayoutManager();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) layoutManager : null;
            int w17 = c1161x57298f5d != null ? c1161x57298f5d.w() : -1;
            int y17 = c1161x57298f5d != null ? c1161x57298f5d.y() : -1;
            int i17 = 0;
            for (java.lang.Object obj : m82898xfb7e5820) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                uc5.l0 l0Var = (uc5.l0) obj;
                if (hashSet.isEmpty()) {
                    return;
                }
                uc5.h0 h0Var = l0Var instanceof uc5.h0 ? (uc5.h0) l0Var : null;
                if (h0Var != null) {
                    uc5.d dVar = h0Var.f508027d;
                    dd5.n1 n1Var = dVar instanceof dd5.n1 ? (dd5.n1) dVar : null;
                    if (n1Var != null && hashSet.contains(java.lang.Long.valueOf(n1Var.f310764h.m124847x74d37ac6()))) {
                        hashSet.remove(java.lang.Long.valueOf(n1Var.f310764h.m124847x74d37ac6()));
                        n1Var.f508010e = null;
                        if (w17 <= i17 && i17 <= y17) {
                            b17.m8152xc67946d3(i17, 1, "force_content_refresh");
                        }
                    }
                }
                i17 = i18;
            }
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager2 = h7().getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d2 = layoutManager2 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) layoutManager2 : null;
        if (c1161x57298f5d2 == null) {
            return;
        }
        int w18 = c1161x57298f5d2.w();
        int y18 = c1161x57298f5d2.y();
        if (w18 < 0 || w18 > y18) {
            return;
        }
        while (true) {
            java.lang.Object a07 = kz5.n0.a0(m82898xfb7e5820, w18);
            uc5.h0 h0Var2 = a07 instanceof uc5.h0 ? (uc5.h0) a07 : null;
            if (h0Var2 != null) {
                uc5.d dVar2 = h0Var2.f508027d;
                dd5.n1 n1Var2 = dVar2 instanceof dd5.n1 ? (dd5.n1) dVar2 : null;
                if (n1Var2 != null) {
                    n1Var2.f508010e = null;
                    b17.m8152xc67946d3(w18, 1, "force_content_refresh");
                }
            }
            if (w18 == y18) {
                return;
            } else {
                w18++;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        super.onStart();
        mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        mo48814x2efc64();
    }
}
