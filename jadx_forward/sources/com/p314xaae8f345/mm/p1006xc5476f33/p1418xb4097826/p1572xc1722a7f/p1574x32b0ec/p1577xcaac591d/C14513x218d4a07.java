package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d;

/* renamed from: com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC */
/* loaded from: classes2.dex */
public final class C14513x218d4a07 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78 f203026d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f203027e;

    /* renamed from: f, reason: collision with root package name */
    public jp2.a f203028f;

    /* renamed from: g, reason: collision with root package name */
    public yl2.g f203029g;

    /* renamed from: h, reason: collision with root package name */
    public r45.dd2 f203030h;

    /* renamed from: i, reason: collision with root package name */
    public long f203031i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f203032m;

    /* renamed from: n, reason: collision with root package name */
    public int f203033n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f203034o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f203035p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f203036q;

    /* renamed from: r, reason: collision with root package name */
    public final kp2.c f203037r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f203038s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14513x218d4a07(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f203031i = -1L;
        this.f203032m = "";
        this.f203033n = -1;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f203034o = linkedList;
        this.f203035p = new java.util.LinkedList();
        this.f203037r = new kp2.c(this, m158354x19263085(), linkedList);
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f203038s = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5538x56837f90>(a0Var) { // from class: com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC$eventListener$1
            {
                this.f39173x3fe91575 = -1371931232;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5538x56837f90 c5538x56837f90) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5538x56837f90 event = c5538x56837f90;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.id idVar = event.f135862g;
                if (idVar == null) {
                    return true;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07.this.S6(idVar.f88471a);
                return true;
            }
        };
    }

    public static final void O6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07 c14513x218d4a07) {
        java.lang.String s07;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = c14513x218d4a07.m158358x197d1fc6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m158358x197d1fc6);
        java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.b(m158358x197d1fc6).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216915p;
        java.lang.String str2 = "";
        if (str == null) {
            str = "";
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_context_id", str);
        intent.putExtra("key_click_tab_context_id", ip2.a.f375147c);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd P6 = c14513x218d4a07.P6();
        if (P6 != null && (s07 = P6.s0()) != null) {
            str2 = s07;
        }
        intent.putExtra("key_click_sub_tab_context_id", str2);
        jp2.a aVar = c14513x218d4a07.f203028f;
        if (aVar != null) {
            aVar.a(intent);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveSearchHelper");
            throw null;
        }
    }

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07 c14513x218d4a07, int i17, boolean z17, android.os.Bundle bundle, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            z17 = true;
        }
        if ((i18 & 4) != 0) {
            bundle = null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setCurrentTabIndex size:");
        java.util.LinkedList linkedList = c14513x218d4a07.f203034o;
        sb6.append(linkedList.size());
        sb6.append(" index:");
        sb6.append(i17);
        sb6.append(" withAnim:");
        sb6.append(z17);
        sb6.append(" args:");
        sb6.append(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveSquareUIC", sb6.toString());
        if (i17 >= 0 && i17 < linkedList.size()) {
            if (bundle != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd) linkedList.get(i17)).getClass();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78 c15359x536ace78 = c14513x218d4a07.f203026d;
            if (c15359x536ace78 != null) {
                c15359x536ace78.m8317x940d026a(i17, z17);
            }
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd P6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78 c15359x536ace78;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = m158358x197d1fc6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m158358x197d1fc6);
        int m8300xfda78ef6 = (m158358x197d1fc6.m7474xfb86a31b() == null || (c15359x536ace78 = this.f203026d) == null) ? this.f203033n : c15359x536ace78.m8300xfda78ef6();
        if (m8300xfda78ef6 >= 0) {
            java.util.LinkedList linkedList = this.f203034o;
            if (m8300xfda78ef6 < linkedList.size() && linkedList.size() != 0) {
                return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd) linkedList.get(m8300xfda78ef6);
            }
        }
        return null;
    }

    public final int Q6() {
        r45.dd2 dd2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd P6 = P6();
        int i17 = 0;
        if (P6 != null && (dd2Var = P6.f203052s) != null) {
            i17 = dd2Var.m75939xb282bd08(0);
        }
        return R6(i17);
    }

    public final int R6(int i17) {
        java.util.Iterator it = this.f203035p.iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                i18 = -1;
                break;
            }
            if (((r45.dd2) it.next()).m75939xb282bd08(0) == i17) {
                break;
            }
            i18++;
        }
        if (i18 >= 0) {
            return i18;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("NearbyLiveSquareUIC", "[getIndex] tabId=" + i17 + " is invalid.");
        return 0;
    }

    public final void S6(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78 c15359x536ace78;
        int R6 = R6(i17);
        if (!(R6 >= 0 && R6 < this.f203034o.size()) || (c15359x536ace78 = this.f203026d) == null) {
            return;
        }
        c15359x536ace78.m8316x940d026a(R6);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c79;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        if (this.f203029g != null) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("livePostHelper");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        r45.dd2 dd2Var;
        java.lang.String string;
        byte[] byteArray;
        android.view.View m7474xfb86a31b;
        android.view.View m7474xfb86a31b2;
        android.view.View m7474xfb86a31b3;
        android.os.Bundle arguments = getArguments();
        this.f203036q = arguments != null && arguments.getInt("key_use_dark_style", 1) == 1;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = m158358x197d1fc6();
        this.f203026d = (m158358x197d1fc6 == null || (m7474xfb86a31b3 = m158358x197d1fc6.m7474xfb86a31b()) == null) ? null : (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78) m7474xfb86a31b3.findViewById(com.p314xaae8f345.mm.R.id.f569103p16);
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc62 = m158358x197d1fc6();
        android.view.View findViewById = (m158358x197d1fc62 == null || (m7474xfb86a31b2 = m158358x197d1fc62.m7474xfb86a31b()) == null) ? null : m7474xfb86a31b2.findViewById(com.p314xaae8f345.mm.R.id.afd);
        if (this.f203036q) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78 c15359x536ace78 = this.f203026d;
            if (c15359x536ace78 != null) {
                c15359x536ace78.setBackgroundColor(m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560045u));
            }
            if (findViewById != null) {
                findViewById.setBackgroundColor(m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560045u));
            }
        } else {
            if (findViewById != null) {
                findViewById.setBackgroundColor(m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77698x3cb0744));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78 c15359x536ace782 = this.f203026d;
            if (c15359x536ace782 != null) {
                c15359x536ace782.setBackgroundColor(m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77660x7595c307));
            }
        }
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc63 = m158358x197d1fc6();
        this.f203026d = (m158358x197d1fc63 == null || (m7474xfb86a31b = m158358x197d1fc63.m7474xfb86a31b()) == null) ? null : (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78) m7474xfb86a31b.findViewById(com.p314xaae8f345.mm.R.id.f569103p16);
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 == null || (byteArray = arguments2.getByteArray("nearby_live_target_square_page_params_key")) == null) {
            dd2Var = null;
        } else {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new r45.dd2().mo11468x92b714fd(byteArray);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveTabInfo");
            dd2Var = (r45.dd2) mo11468x92b714fd;
        }
        this.f203030h = dd2Var;
        android.os.Bundle arguments3 = getArguments();
        this.f203031i = arguments3 != null ? arguments3.getLong("nearby_live_target_object_id_params_key", -1L) : -1L;
        android.os.Bundle arguments4 = getArguments();
        java.lang.String str = "";
        java.lang.String string2 = arguments4 != null ? arguments4.getString("nearby_live_target_nonce_id_params_key", "") : null;
        if (string2 == null) {
            string2 = "";
        }
        this.f203032m = string2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreate targetTabInfo=");
        r45.dd2 dd2Var2 = this.f203030h;
        sb6.append(dd2Var2 != null ? java.lang.Integer.valueOf(dd2Var2.m75939xb282bd08(0)) : null);
        sb6.append('-');
        r45.dd2 dd2Var3 = this.f203030h;
        sb6.append(dd2Var3 != null ? dd2Var3.m75945x2fec8307(1) : null);
        sb6.append(" targetObjectId:");
        sb6.append(this.f203031i);
        sb6.append(" targetObjectNonceId:");
        sb6.append(this.f203032m);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveSquareUIC", sb6.toString());
        this.f203038s.mo48813x58998cd();
        this.f203029g = new yl2.g(m158354x19263085());
        this.f203028f = new jp2.a(m158354x19263085());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78 c15359x536ace783 = this.f203026d;
        if (c15359x536ace783 != null) {
            c15359x536ace783.m62442xecae6946(true);
        }
        this.f203027e = true;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc64 = m158358x197d1fc6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m158358x197d1fc64);
        pf5.z zVar = pf5.z.f435481a;
        java.lang.String str2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.b(m158358x197d1fc64).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216915p;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String enterClickTabContextID = "1001-" + c01.id.c();
        android.view.View findViewById2 = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.meo);
        if (findViewById2 != null) {
            if (c92.g.f121271a.b()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/live/square/NearbyLiveSquareUIC", "initSearchItem", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/nearby/live/square/NearbyLiveSquareUIC", "initSearchItem", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setOnClickListener(new kp2.d(this));
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/nearby/live/square/NearbyLiveSquareUIC", "initSearchItem", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/nearby/live/square/NearbyLiveSquareUIC", "initSearchItem", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        android.view.View findViewById3 = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.md6);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new kp2.e(this));
        }
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).Bi(str2);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).Di(enterClickTabContextID);
        rq2.x xVar = rq2.x.f480447a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterClickTabContextID, "enterClickTabContextID");
        rq2.x.f480448b = str2;
        long c17 = c01.id.c();
        rq2.x.f480449c = c17;
        rq2.x.f480450d = c17;
        if (m158358x197d1fc6() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14512xbce0ab98) {
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc65 = m158358x197d1fc6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158358x197d1fc65, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment");
            java.lang.String str3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.b((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14512xbce0ab98) m158358x197d1fc65).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216919r;
            if (str3 == null) {
                str3 = "";
            }
            android.os.Bundle arguments5 = getArguments();
            if (arguments5 != null && (string = arguments5.getString("key_by_pass")) != null) {
                str = string;
            }
            ip2.a aVar = ip2.a.f375145a;
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc66 = m158358x197d1fc6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158358x197d1fc66, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment");
            aVar.a(str2, (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14512xbce0ab98) m158358x197d1fc66, str3, str);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        yl2.g gVar = this.f203029g;
        if (gVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("livePostHelper");
            throw null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostForNearby", "reset()");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d9 d9Var = gVar.f544535e;
        if (d9Var != null) {
            d9Var.f183627e = 0;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onPreDestroyed */
    public void mo47482x6fa9d635() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd P6;
        r45.dd2 dd2Var;
        super.mo47482x6fa9d635();
        dp2.e eVar = dp2.e.f323725a;
        dp2.e.f323726b = false;
        dp2.e.f323727c.clear();
        synchronized (eVar.e()) {
            eVar.e().clear();
        }
        wo2.n0 n0Var = wo2.n0.f529638a;
        int m75939xb282bd08 = (!this.f203027e || (P6 = P6()) == null || (dd2Var = P6.f203052s) == null) ? 0 : dd2Var.m75939xb282bd08(0);
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = m158358x197d1fc6();
        int i17 = m158358x197d1fc6 != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.b(m158358x197d1fc6).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216913n : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyConfig", "saveExitLiveTabId tabId:" + m75939xb282bd08 + " commentScene: " + i17);
        wo2.n0.f529640c = android.os.SystemClock.elapsedRealtime();
        wo2.n0.f529641d.put(i17, java.lang.Integer.valueOf(m75939xb282bd08));
        ip2.a.f375146b = "";
        ip2.a.f375148d = "";
        ip2.a.f375147c = "";
        ip2.a.f375149e = true;
        ip2.a.f375153i = false;
        ip2.a.f375150f = "";
        ip2.a.f375151g = -1;
        ip2.a.f375152h = -1;
        this.f203038s.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onRequestPermissionsResult */
    public void mo2282x953457f1(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        if (this.f203029g == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("livePostHelper");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd P6 = P6();
        if (P6 != null) {
            P6.mo7516x953457f1(i17, permissions, grantResults);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78 c15359x536ace78;
        if (!ig2.e.f372905a.c() || (c15359x536ace78 = this.f203026d) == null) {
            return;
        }
        c15359x536ace78.m62443xe4399af7(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14513x218d4a07(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f203031i = -1L;
        this.f203032m = "";
        this.f203033n = -1;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f203034o = linkedList;
        this.f203035p = new java.util.LinkedList();
        this.f203037r = new kp2.c(this, m158354x19263085(), linkedList);
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f203038s = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5538x56837f90>(a0Var) { // from class: com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC$eventListener$1
            {
                this.f39173x3fe91575 = -1371931232;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5538x56837f90 c5538x56837f90) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5538x56837f90 event = c5538x56837f90;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.id idVar = event.f135862g;
                if (idVar == null) {
                    return true;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07.this.S6(idVar.f88471a);
                return true;
            }
        };
    }
}
