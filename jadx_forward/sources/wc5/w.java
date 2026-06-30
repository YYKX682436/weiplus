package wc5;

/* loaded from: classes10.dex */
public final class w extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f526180d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f526181e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f526182f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 baseActivity) {
        super(baseActivity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseActivity, "baseActivity");
        this.f526180d = baseActivity;
        this.f526182f = new java.util.ArrayList();
    }

    public final uc5.r T6() {
        android.view.LayoutInflater.Factory factory = this.f526180d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(factory, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.history.base.MsgHistoryGalleryController");
        return (uc5.r) factory;
    }

    public final void U6(ad5.l0 operation, ad5.j result, java.util.List msgInfoList) {
        uc5.d dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operation, "operation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfoList, "msgInfoList");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(operation, ad5.d.f84775a)) {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(operation, ad5.q.f84827a)) {
                if (!(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(operation, ad5.e.f84777a) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(operation, ad5.j0.f84806a) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(operation, ad5.y.f84861a))) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.b(operation, ad5.f.f84782a);
                    return;
                }
                if ((result instanceof ad5.i) && ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) T6()).r7()) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3 activityC21814x1938a8b3 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) T6();
                    com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractC22433x7fa3716b W6 = activityC21814x1938a8b3.W6(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21816x74d192a3.class);
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21816x74d192a3 c21816x74d192a3 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21816x74d192a3) (W6 instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21816x74d192a3 ? W6 : null);
                    if (c21816x74d192a3 != null) {
                        c21816x74d192a3.m79668xf579a324(false);
                    }
                    activityC21814x1938a8b3.w7(false);
                    return;
                }
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryOperationUIC", "onRetransmitFinished: result=" + result + ", isSelecting=" + ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) T6()).r7());
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(result, ad5.i.f84800a)) {
                if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) T6()).r7()) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3 activityC21814x1938a8b32 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) T6();
                    com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractC22433x7fa3716b W62 = activityC21814x1938a8b32.W6(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21816x74d192a3.class);
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21816x74d192a3 c21816x74d192a32 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21816x74d192a3) (W62 instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21816x74d192a3 ? W62 : null);
                    if (c21816x74d192a32 != null) {
                        c21816x74d192a32.m79668xf579a324(false);
                    }
                    activityC21814x1938a8b32.w7(false);
                    return;
                }
                return;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(result, ad5.g.f84788a)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryOperationUIC", "onRetransmitFinished: user cancelled");
                return;
            } else {
                if (result instanceof ad5.h) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryOperationUIC", "onRetransmitFinished: failed - " + ((ad5.h) result).f84794b);
                    return;
                }
                return;
            }
        }
        if (!(result instanceof ad5.i)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryOperationUIC", "onDeleteFinished: result is not success");
            return;
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 m76 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) T6()).m7();
        xm3.t0 b17 = xm3.u0.b(m76);
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryOperationUIC", "onGalleryMessagesDeleted: adapter is not MsgHistoryGalleryRow");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(msgInfoList, 10));
        java.util.Iterator it = msgInfoList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
            arrayList.add(f9Var.Q0() + '#' + f9Var.m124847x74d37ac6());
        }
        java.util.HashSet Q0 = kz5.n0.Q0(arrayList);
        boolean r76 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) T6()).r7();
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe = b17.I;
        c16718x7059cefe.getClass();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(new java.util.ArrayList(c16718x7059cefe.f233598o));
        kz5.h0.B(arrayList2, new wc5.t(Q0));
        yc5.m.f542447a.a(arrayList2);
        if (r76) {
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                uc5.l0 l0Var = (uc5.l0) it6.next();
                uc5.h0 h0Var = l0Var instanceof uc5.h0 ? (uc5.h0) l0Var : null;
                if (h0Var != null && (dVar = h0Var.f508027d) != null) {
                    dVar.f508009d = uc5.a.f508002a;
                }
            }
        }
        ym3.f fVar = c16718x7059cefe.f233590d;
        uc5.y yVar = fVar instanceof uc5.y ? (uc5.y) fVar : null;
        if (yVar != null) {
            yVar.d(msgInfoList);
        }
        c16718x7059cefe.z(new wc5.u(arrayList2));
        if (r76) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3 activityC21814x1938a8b33 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) T6();
            com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractC22433x7fa3716b W63 = activityC21814x1938a8b33.W6(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21816x74d192a3.class);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21816x74d192a3 c21816x74d192a33 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21816x74d192a3) (W63 instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21816x74d192a3 ? W63 : null);
            if (c21816x74d192a33 != null) {
                c21816x74d192a33.m79668xf579a324(false);
            }
            activityC21814x1938a8b33.w7(false);
        }
        m76.post(new wc5.v(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onFinished */
    public void mo13982x7cf2e371() {
        ((java.util.ArrayList) this.f526182f).clear();
        super.mo13982x7cf2e371();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        ad5.g gVar = null;
        if (this.f526181e) {
            this.f526181e = false;
            java.util.Set set = xc5.l.f535054r;
            xc5.l.f535054r = null;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 m76 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) T6()).m7();
            xm3.t0 b17 = xm3.u0.b(m76);
            if (b17 != null) {
                java.util.List m82898xfb7e5820 = b17.m82898xfb7e5820();
                if (set == null || set.isEmpty()) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = m76.getLayoutManager();
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) layoutManager : null;
                    if (c1161x57298f5d != null) {
                        int w17 = c1161x57298f5d.w();
                        int y17 = c1161x57298f5d.y();
                        if (w17 >= 0 && w17 <= y17) {
                            while (true) {
                                java.lang.Object a07 = kz5.n0.a0(m82898xfb7e5820, w17);
                                uc5.h0 h0Var = a07 instanceof uc5.h0 ? (uc5.h0) a07 : null;
                                if (h0Var != null) {
                                    uc5.d dVar = h0Var.f508027d;
                                    dd5.n1 n1Var = dVar instanceof dd5.n1 ? (dd5.n1) dVar : null;
                                    if (n1Var != null) {
                                        n1Var.f508010e = null;
                                        b17.m8152xc67946d3(w17, 1, "force_content_refresh");
                                    }
                                }
                                if (w17 == y17) {
                                    break;
                                } else {
                                    w17++;
                                }
                            }
                        }
                    }
                } else {
                    java.util.HashSet hashSet = new java.util.HashSet(set);
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager2 = m76.getLayoutManager();
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d2 = layoutManager2 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) layoutManager2 : null;
                    int w18 = c1161x57298f5d2 != null ? c1161x57298f5d2.w() : -1;
                    int y18 = c1161x57298f5d2 != null ? c1161x57298f5d2.y() : -1;
                    int i17 = 0;
                    for (java.lang.Object obj : m82898xfb7e5820) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        uc5.l0 l0Var = (uc5.l0) obj;
                        if (hashSet.isEmpty()) {
                            break;
                        }
                        uc5.h0 h0Var2 = l0Var instanceof uc5.h0 ? (uc5.h0) l0Var : null;
                        if (h0Var2 != null) {
                            uc5.d dVar2 = h0Var2.f508027d;
                            dd5.n1 n1Var2 = dVar2 instanceof dd5.n1 ? (dd5.n1) dVar2 : null;
                            if (n1Var2 != null && hashSet.contains(java.lang.Long.valueOf(n1Var2.f310764h.m124847x74d37ac6()))) {
                                hashSet.remove(java.lang.Long.valueOf(n1Var2.f310764h.m124847x74d37ac6()));
                                n1Var2.f508010e = null;
                                if (w18 <= i17 && i17 <= y18) {
                                    b17.m8152xc67946d3(i17, 1, "force_content_refresh");
                                }
                            }
                        }
                        i17 = i18;
                    }
                }
            }
        }
        boolean z17 = ad5.q.f84832f;
        ad5.g gVar2 = ad5.g.f84788a;
        if (!z17) {
            yz5.p pVar = ad5.q.f84828b;
            java.lang.Object obj2 = ad5.q.f84829c;
            if (obj2 == null) {
                obj2 = kz5.p0.f395529d;
            }
            ad5.q.f84828b = null;
            ad5.q.f84829c = null;
            if (pVar != null) {
                pVar.mo149xb9724478(gVar2, obj2);
                gVar = gVar2;
            }
        }
        if (gVar == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar, gVar2)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryOperationUIC", "onResume: user cancelled retransmit");
    }
}
