package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f;

/* renamed from: com.tencent.mm.plugin.finder.nearby.NearbyHomeUIC */
/* loaded from: classes2.dex */
public final class C14496x6858d351 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f202983d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f202984e;

    /* renamed from: f, reason: collision with root package name */
    public int f202985f;

    /* renamed from: g, reason: collision with root package name */
    public int f202986g;

    /* renamed from: h, reason: collision with root package name */
    public ap2.a f202987h;

    /* renamed from: i, reason: collision with root package name */
    public final wo2.o0 f202988i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f202989m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14496x6858d351(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.util.ArrayList d17 = ((((long) c01.z1.n()) & 512) > 0L ? 1 : ((((long) c01.z1.n()) & 512) == 0L ? 0 : -1)) == 0 ? kz5.c0.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.C14576x1ff6c38c(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1575xb830cb56.C14507xc6c296fb(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1592xc4e39b55.C14557x32951d44()) : kz5.c0.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.C14576x1ff6c38c(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1575xb830cb56.C14507xc6c296fb());
        this.f202984e = d17;
        this.f202985f = 1;
        this.f202986g = 1002;
        this.f202988i = new wo2.o0(activity, this, d17);
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f202989m = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5538x56837f90>(a0Var) { // from class: com.tencent.mm.plugin.finder.nearby.NearbyHomeUIC$eventListener$1
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
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.C14496x6858d351.this.R6(idVar.f88471a);
                return true;
            }
        };
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301 O6() {
        ap2.a aVar = this.f202987h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78 c15359x536ace78 = aVar != null ? aVar.f94308b : null;
        if (c15359x536ace78 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("NearbyHomeUIC", "[getActiveFragment] viewPager==null lastIndex=" + this.f202985f);
        }
        int m8300xfda78ef6 = c15359x536ace78 != null ? c15359x536ace78.m8300xfda78ef6() : this.f202985f;
        if (m8300xfda78ef6 < 0) {
            return null;
        }
        java.util.ArrayList arrayList = this.f202984e;
        if (m8300xfda78ef6 >= arrayList.size() || arrayList.size() == 0) {
            return null;
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301) arrayList.get(m8300xfda78ef6);
    }

    public final int P6(int i17) {
        java.util.Iterator it = this.f202984e.iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                i18 = -1;
                break;
            }
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301) it.next()).f202993p == i17) {
                break;
            }
            i18++;
        }
        if (i18 >= 0) {
            return i18;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.HomeUIC", "[getIndex] type=" + i17 + " is invalid.");
        return 0;
    }

    public final void Q6(int i17, boolean z17) {
        java.lang.String str;
        switch (i17) {
            case 1001:
                str = ".ui.nearby.Live";
                break;
            case 1002:
                str = ".ui.nearby.FinderVideo";
                break;
            case 1003:
                str = ".ui.nearby.Person";
                break;
            default:
                str = null;
                break;
        }
        if (str != null) {
            if (!z17) {
                ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).rj(str);
            } else {
                this.f202986g = i17;
                ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).qj(str);
            }
        }
    }

    public final void R6(int i17) {
        int P6 = P6(i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setCurrentTabIndex size:");
        java.util.ArrayList arrayList = this.f202984e;
        sb6.append(arrayList.size());
        sb6.append(" index:");
        sb6.append(P6);
        sb6.append(" args:null");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyHomeUIC", sb6.toString());
        if (P6 >= 0 && P6 < arrayList.size()) {
            ap2.a aVar = this.f202987h;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78 c15359x536ace78 = aVar != null ? aVar.f94308b : null;
            if (c15359x536ace78 == null) {
                return;
            }
            c15359x536ace78.m8316x940d026a(P6);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c6c;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        ap2.a aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78 c15359x536ace78;
        wo2.n0 n0Var = wo2.n0.f529638a;
        int b17 = n0Var.b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyHomeUIC", "[onCreate] targetTabType=" + b17);
        tq2.a aVar2 = tq2.d.f502763a;
        aVar2.c("nearbyHomeOnCreate");
        aVar2.f502752e = m158354x19263085().hashCode();
        this.f202989m.mo48813x58998cd();
        android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f567631k60);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) mo144222x4ff8c0f0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78 c15359x536ace782 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78) x4.b.a(mo144222x4ff8c0f0, com.p314xaae8f345.mm.R.id.f569103p16);
        if (c15359x536ace782 == null) {
            throw new java.lang.NullPointerException("Missing required view with ID: ".concat(mo144222x4ff8c0f0.getResources().getResourceName(com.p314xaae8f345.mm.R.id.f569103p16)));
        }
        this.f202987h = new ap2.a(linearLayout, linearLayout, c15359x536ace782);
        c15359x536ace782.m62442xecae6946(true);
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d mo7595x9cdc264 = m158354x19263085().mo7595x9cdc264();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo7595x9cdc264, "getSupportFragmentManager(...)");
        java.util.ArrayList arrayList = this.f202984e;
        c15359x536ace782.m8315x6cab2c8d(new zo2.c(mo7595x9cdc264, arrayList));
        c15359x536ace782.m8289xa5a25773(this.f202988i);
        c15359x536ace782.m8321x40341e13(3);
        c15359x536ace782.post(new wo2.p0(this, b17));
        int intValue = ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.D2().r()).intValue();
        if (intValue > 0 && (aVar = this.f202987h) != null && (c15359x536ace78 = aVar.f94308b) != null) {
            android.content.Context context = c15359x536ace782.getContext();
            try {
                java.lang.reflect.Field declaredField = p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.class.getDeclaredField("mScroller");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredField, "getDeclaredField(...)");
                declaredField.setAccessible(true);
                declaredField.set(c15359x536ace78, new hc2.h1(context, intValue));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("ViewPagerExt", e17, "", new java.lang.Object[0]);
            }
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f435481a;
        java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216915p;
        java.lang.String str2 = str != null ? str : "";
        java.lang.String enterClickTabContextID = n0Var.d() + '-' + c01.id.c();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Zi(m158354x19263085(), null);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).Bi(str2);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).Di(enterClickTabContextID);
        rq2.x xVar = rq2.x.f480447a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterClickTabContextID, "enterClickTabContextID");
        rq2.x.f480448b = str2;
        long c17 = c01.id.c();
        rq2.x.f480449c = c17;
        rq2.x.f480450d = c17;
        this.f202983d = true;
        R6(b17);
        if (c92.g.f121271a.b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("NearbyHomeUIC", "prepareLiveSquare not NearbyLiveSquareFragment");
        } else if (arrayList.get(1) instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14512xbce0ab98) {
            java.lang.Object obj = arrayList.get(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14512xbce0ab98) obj).B0(m158354x19263085());
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
            ((wo2.n) zVar.a(activity2).a(wo2.n.class)).R6();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("NearbyHomeUIC", "prepareLiveSquare return for !is NearbyLiveSquareFragment");
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_ENTER_NEARBY_LONG_SYNC, java.lang.Long.valueOf(c01.id.c()));
        ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("NearbyEntrance");
        cy1.a aVar3 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar3.dk(this, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.C14496x6858d351.class.getSimpleName());
        ((cy1.a) aVar3.ak(this, iy1.c.NearbyHomeUI)).Rj(this, iy1.a.NewNearBy);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        int b17;
        this.f202989m.mo48814x2efc64();
        nq2.d.f420513a.g();
        wo2.n0 n0Var = wo2.n0.f529638a;
        if (this.f202983d) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301 O6 = O6();
            b17 = O6 != null ? O6.f202993p : 1001;
        } else {
            b17 = n0Var.b();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyConfig", "saveExitTabType tabType:" + b17);
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_NEARBY_LAST_TAB_TYPE_INT_SYNC, java.lang.Integer.valueOf(b17));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_EXIT_NEARBY_LONG_SYNC, java.lang.Long.valueOf(c01.id.c()));
        dp2.e eVar = dp2.e.f323725a;
        dp2.e.f323726b = false;
        dp2.e.f323727c.clear();
        synchronized (eVar.e()) {
            eVar.e().clear();
        }
        Q6(this.f202986g, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyHomeUIC", "onDestroy fragments:" + this.f202984e);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyHomeUIC", "onPause()");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301 O6 = O6();
        if (O6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14512xbce0ab98) {
            return;
        }
        rq2.x.f480447a.d(O6);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        java.lang.String str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyHomeUIC", "onResume()");
        rq2.x xVar = rq2.x.f480447a;
        rq2.x.f480450d = c01.id.c();
        tq2.d.f502763a.c("nearbyHomeOnResume");
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ga gaVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ha.f187090a;
        gaVar.p(1, V6);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301 O6 = O6();
        if (O6 == null || (str = O6.getF203049t()) == null) {
            str = "";
        }
        gaVar.n(1, V6, 0, str);
        gaVar.o(1, V6);
    }
}
