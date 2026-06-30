package qp2;

/* loaded from: classes2.dex */
public final class y extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {
    public boolean A;

    /* renamed from: d, reason: collision with root package name */
    public boolean f447340d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f447341e;

    /* renamed from: f, reason: collision with root package name */
    public qp2.g f447342f;

    /* renamed from: g, reason: collision with root package name */
    public int f447343g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f447344h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f447345i;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f447346m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f447347n;

    /* renamed from: o, reason: collision with root package name */
    public int f447348o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f447349p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f447350q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f447351r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f447352s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f447353t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f447354u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f447355v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f447356w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f447357x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f447358y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f447359z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f447341e = new java.util.LinkedList();
        this.f447349p = "";
        this.f447350q = "";
        this.f447351r = "";
        this.f447352s = "";
        this.f447353t = jz5.h.b(new qp2.l(this));
        this.f447354u = jz5.h.b(new qp2.v(this));
        this.f447355v = jz5.h.b(new qp2.j(this));
        this.f447356w = jz5.h.b(new qp2.w(this));
        this.f447357x = jz5.h.b(new qp2.x(this));
        this.f447358y = jz5.h.b(new qp2.m(this));
    }

    public final void O6(java.util.List list) {
        p012xc85e97e9.p114xa324943e.p115xd1075a44.a m8299xf939df19;
        android.view.View m7474xfb86a31b;
        if (this.A) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveSquareTabLayoutUIC", "buildTab hasBuildTab:" + this.A);
            return;
        }
        if (!this.f447359z) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveSquareTabLayoutUIC", "buildTab onUserVisibleFocused:" + this.f447359z);
            return;
        }
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = m158358x197d1fc6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m158358x197d1fc6);
        if (m158358x197d1fc6.m7482xefa32bc()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveSquareTabLayoutUIC", "buildTab after fragment detached");
            return;
        }
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc62 = m158358x197d1fc6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m158358x197d1fc62);
        if (m158358x197d1fc62.m7474xfb86a31b() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveSquareTabLayoutUIC", "buildTab view is null");
            return;
        }
        boolean isEmpty = list.isEmpty();
        jz5.g gVar = this.f447357x;
        if (isEmpty) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveSquareTabLayoutUIC", "buildTab liveTabList:" + list);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78) ((jz5.n) gVar).mo141623x754a37bb()).setVisibility(8);
            Q6().setVisibility(8);
            return;
        }
        Q6().setVisibility(0);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78) ((jz5.n) gVar).mo141623x754a37bb()).setVisibility(0);
        boolean z17 = this.f447340d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveSquareTabLayoutUIC", "checkIfHideTabs isHideTabs:" + z17);
        Q6().setVisibility(z17 ? 8 : 0);
        ((android.widget.TextView) ((jz5.n) this.f447358y).mo141623x754a37bb()).setVisibility(((java.util.LinkedList) this.f447341e).size() == 0 ? 0 : 8);
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc63 = m158358x197d1fc6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m158358x197d1fc63);
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.b(m158358x197d1fc63).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        while (true) {
            p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = null;
            if (!it.hasNext()) {
                int i18 = 0;
                for (java.lang.Object obj : linkedList) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd c14521x246f2bd = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd) obj;
                    qp2.i iVar = new qp2.i(R6().l(), c14521x246f2bd.f202993p, this.f447347n);
                    java.lang.String title = c14521x246f2bd.f202992o;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
                    android.widget.TextView textView = iVar.f447320d;
                    if (textView != null) {
                        textView.setText(title);
                    }
                    iVar.f447318b = i18;
                    r45.dd2 dd2Var = c14521x246f2bd.f203052s;
                    iVar.f447319c = dd2Var != null ? dd2Var.m75939xb282bd08(0) : 0;
                    R6().d(iVar.f447317a, false);
                    i18 = i19;
                }
                R6().a(new qp2.k(this));
                p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc64 = m158358x197d1fc6();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m158358x197d1fc64);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07 c14513x218d4a07 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07) pf5.z.f435481a.b(m158358x197d1fc64).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07.class);
                c14513x218d4a07.getClass();
                c14513x218d4a07.f203035p.addAll(list);
                java.util.LinkedList linkedList2 = c14513x218d4a07.f203034o;
                linkedList2.addAll(linkedList);
                p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc65 = c14513x218d4a07.m158358x197d1fc6();
                if (m158358x197d1fc65 != null && (m7474xfb86a31b = m158358x197d1fc65.m7474xfb86a31b()) != null) {
                    c1190x18d3c3fe = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) m7474xfb86a31b.findViewById(com.p314xaae8f345.mm.R.id.f569103p16);
                }
                if (c1190x18d3c3fe != null) {
                    p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc66 = c14513x218d4a07.m158358x197d1fc6();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m158358x197d1fc66);
                    p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d m7437x54c0aef7 = m158358x197d1fc66.m7437x54c0aef7();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7437x54c0aef7, "getChildFragmentManager(...)");
                    c1190x18d3c3fe.m8315x6cab2c8d(new zo2.c(m7437x54c0aef7, linkedList2));
                    c1190x18d3c3fe.m8289xa5a25773(c14513x218d4a07.f203037r);
                    c1190x18d3c3fe.m8321x40341e13(2);
                    c1190x18d3c3fe.post(new kp2.b(c14513x218d4a07, c1190x18d3c3fe));
                    int intValue = ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.D2().r()).intValue();
                    if (intValue > 0) {
                        android.content.Context context = c1190x18d3c3fe.getContext();
                        try {
                            java.lang.reflect.Field declaredField = p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.class.getDeclaredField("mScroller");
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredField, "getDeclaredField(...)");
                            declaredField.setAccessible(true);
                            declaredField.set(c1190x18d3c3fe, new hc2.h1(context, intValue));
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("ViewPagerExt", e17, "", new java.lang.Object[0]);
                        }
                    }
                }
                if (c1190x18d3c3fe != null && (m8299xf939df19 = c1190x18d3c3fe.m8299xf939df19()) != null) {
                    m8299xf939df19.mo8343xced61ae5();
                }
                this.A = true;
                return;
            }
            java.lang.Object next = it.next();
            int i27 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.dd2 dd2Var2 = (r45.dd2) next;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putByteArray("nearby_live_square_tab_info_key", dd2Var2.mo14344x5f01b1f6());
            bundle.putInt("key_from_comment_scene", V6.m75939xb282bd08(5));
            bundle.putString("key_click_tab_context_id", V6.m75945x2fec8307(2));
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc67 = m158358x197d1fc6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158358x197d1fc67, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment");
            bundle.putString("key_click_tab_id", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301) m158358x197d1fc67).getF202994q());
            bundle.putInt("key_use_dark_style", this.f447347n ? 1 : 0);
            bundle.putString("key_by_pass", this.f447349p);
            bundle.putBoolean("nearby_live_target_auto_refresh_params_key", this.f447344h);
            int i28 = this.f447343g;
            if ((i28 == 0 && i17 == 0) || i28 == dd2Var2.m75939xb282bd08(0)) {
                bundle.putBoolean("nearby_live_target_auto_refresh_params_key", this.f447345i);
                bundle.putByteArray("nearby_live_target_last_buffer_params_key", this.f447346m);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd c14521x246f2bd2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd(dd2Var2, null, 2, null);
            c14521x246f2bd2.f202992o = java.lang.String.valueOf(dd2Var2.m75945x2fec8307(1));
            c14521x246f2bd2.mo7562xe26dab14(bundle);
            linkedList.add(c14521x246f2bd2);
            i17 = i27;
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301 P6() {
        if (m158358x197d1fc6() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("NearbyLiveSquareTabLayoutUIC", "getActivityFragment return for fragment is null.");
            return null;
        }
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = m158358x197d1fc6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m158358x197d1fc6);
        if (m158358x197d1fc6.mo7430x19263085() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("NearbyLiveSquareTabLayoutUIC", "getActivityFragment return for activity is null.");
            return null;
        }
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc62 = m158358x197d1fc6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m158358x197d1fc62);
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07) pf5.z.f435481a.b(m158358x197d1fc62).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07.class)).P6();
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.C22785xca931918 Q6() {
        return (com.p314xaae8f345.mm.p2776x373aa5.C22785xca931918) ((jz5.n) this.f447354u).mo141623x754a37bb();
    }

    public final com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff R6() {
        return (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) ((jz5.n) this.f447356w).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        int i17;
        byte[] byteArray;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = m158358x197d1fc6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m158358x197d1fc6);
        android.os.Bundle arguments = getArguments();
        this.f447347n = arguments != null && arguments.getInt("key_use_dark_style", 1) == 1;
        android.os.Bundle arguments2 = getArguments();
        java.lang.String string = arguments2 != null ? arguments2.getString("key_by_pass") : null;
        if (string == null) {
            string = "";
        }
        this.f447349p = string;
        android.os.Bundle arguments3 = getArguments();
        java.lang.String string2 = arguments3 != null ? arguments3.getString("key_feed_export_id") : null;
        if (string2 == null) {
            string2 = "";
        }
        this.f447350q = string2;
        android.os.Bundle arguments4 = getArguments();
        java.lang.String string3 = arguments4 != null ? arguments4.getString("key_feed_nonce_id") : null;
        if (string3 == null) {
            string3 = "";
        }
        this.f447351r = string3;
        android.os.Bundle arguments5 = getArguments();
        java.lang.String string4 = arguments5 != null ? arguments5.getString("key_page_title") : null;
        this.f447352s = string4 != null ? string4 : "";
        android.os.Bundle arguments6 = getArguments();
        this.f447348o = arguments6 != null ? arguments6.getInt("key_request_scene") : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveSquareTabLayoutUIC", "onCreate isForceNightMode:" + this.f447347n + " fetchTabListScene:" + this.f447348o + " byPass:" + this.f447349p);
        boolean z17 = this.f447347n;
        jz5.g gVar = this.f447353t;
        if (z17) {
            ((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) ((jz5.n) gVar).mo141623x754a37bb()).setBackgroundColor(m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560045u));
        } else {
            ((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) ((jz5.n) gVar).mo141623x754a37bb()).setBackgroundDrawable(m158361x893a2f6f().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.asq));
        }
        android.view.View view = (android.view.View) ((jz5.n) this.f447355v).mo141623x754a37bb();
        if (view != null) {
            if (((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).lk() && c92.g.f121271a.b()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/live/square/tab/NearbyLiveSquareTabLayoutUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/nearby/live/square/tab/NearbyLiveSquareTabLayoutUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setOnClickListener(new qp2.n(this));
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/nearby/live/square/tab/NearbyLiveSquareTabLayoutUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/nearby/live/square/tab/NearbyLiveSquareTabLayoutUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        android.os.Bundle arguments7 = getArguments();
        if (arguments7 == null || (byteArray = arguments7.getByteArray("nearby_live_target_square_page_params_key")) == null) {
            i17 = 0;
        } else {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new r45.dd2().mo11468x92b714fd(byteArray);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveTabInfo");
            i17 = ((r45.dd2) mo11468x92b714fd).m75939xb282bd08(0);
        }
        this.f447343g = i17;
        android.os.Bundle arguments8 = getArguments();
        this.f447344h = arguments8 != null ? arguments8.getBoolean("nearby_live_all_auto_refresh_params_key", false) : false;
        android.os.Bundle arguments9 = getArguments();
        this.f447345i = arguments9 != null ? arguments9.getBoolean("nearby_live_target_auto_refresh_params_key", false) : false;
        android.os.Bundle arguments10 = getArguments();
        this.f447346m = arguments10 != null ? arguments10.getByteArray("nearby_live_target_last_buffer_params_key") : null;
        Q6().m82546x198fa353(new qp2.p(this));
        Q6().m82541x74caf26a(new qp2.r(this));
        android.view.View m7474xfb86a31b = m158358x197d1fc6.m7474xfb86a31b();
        android.view.View findViewById = m7474xfb86a31b != null ? m7474xfb86a31b.findViewById(com.p314xaae8f345.mm.R.id.afd) : null;
        pf5.z zVar = pf5.z.f435481a;
        bp2.m mVar = ((op2.a) zVar.b(m158358x197d1fc6).a(op2.a.class)).f428770d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78 c15359x536ace78 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78) ((jz5.n) this.f447357x).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c15359x536ace78, "<get-viewPager>(...)");
        mVar.getClass();
        mVar.f104607c = findViewById;
        mVar.f104608d = c15359x536ace78;
        int[] iArr = mVar.f104609e;
        c15359x536ace78.getLocationOnScreen(iArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePageScrollGuideHelper", "setTargetView pos[" + iArr[0] + ", " + iArr[1] + "] targetView:" + c15359x536ace78);
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.b(m158358x197d1fc6).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        if (this.f447342f == null) {
            this.f447342f = new qp2.g(m80379x76847179(), this.f447348o, this.f447349p, this.f447350q, this.f447351r, this.f447352s);
        }
        boolean z18 = this.f447348o == 0;
        qp2.g gVar2 = this.f447342f;
        if (gVar2 != null) {
            gVar2.a(V6, false, z18, new qp2.t(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        qp2.g gVar = this.f447342f;
        if (gVar != null) {
            gm0.j1.d().q(4210, gVar);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveSquareTabLayoutUIC", "onDestroy");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        su4.f1 f1Var;
        if (!(((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).lk() && c92.g.f121271a.b()) || (f1Var = (su4.f1) i95.n0.c(su4.f1.class)) == null) {
            return;
        }
        ((sg0.h3) f1Var).Ai(125, m80379x76847179());
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleFocused */
    public void mo58275xd317978f() {
        super.mo58275xd317978f();
        this.f447359z = true;
        O6(this.f447341e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveSquareTabLayoutUIC", "onUserVisibleFocused");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleUnFocused */
    public void mo58437xaa858cb6() {
        super.mo58437xaa858cb6();
        this.f447359z = false;
    }
}
