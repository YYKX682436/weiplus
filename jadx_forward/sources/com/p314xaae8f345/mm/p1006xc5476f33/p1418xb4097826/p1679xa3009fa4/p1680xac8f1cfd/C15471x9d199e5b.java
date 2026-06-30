package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC */
/* loaded from: classes2.dex */
public final class C15471x9d199e5b extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements zy2.w9 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 f215152d;

    /* renamed from: e, reason: collision with root package name */
    public int f215153e;

    /* renamed from: f, reason: collision with root package name */
    public gx2.q f215154f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f215155g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f215156h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f215157i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f215158m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f215159n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f215160o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f215161p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f215162q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15472x10c6eaf8 f215163r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC$changeFeedListener$1] */
    public C15471x9d199e5b(final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f215156h = true;
        this.f215157i = "";
        this.f215158m = true;
        this.f215162q = new java.util.concurrent.CopyOnWriteArrayList();
        this.f215163r = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5523x3ee720c9>(activity) { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC$changeFeedListener$1
            {
                this.f39173x3fe91575 = 363516633;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5523x3ee720c9 c5523x3ee720c9) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5523x3ee720c9 event = c5523x3ee720c9;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.wc wcVar = event.f135850g;
                if (wcVar == null) {
                    return true;
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[changeFeedListener], ");
                sb6.append(wcVar.f89809a);
                sb6.append(", ");
                sb6.append(wcVar.f89810b);
                sb6.append(", ");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15471x9d199e5b c15471x9d199e5b = this;
                sb6.append(c15471x9d199e5b.f215158m);
                sb6.append(", ");
                sb6.append(c15471x9d199e5b.f215157i);
                sb6.append(", ");
                sb6.append(c15471x9d199e5b);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderProfileDrawerUIC", sb6.toString());
                if (!c15471x9d199e5b.f215158m) {
                    return true;
                }
                gx2.q qVar = c15471x9d199e5b.f215154f;
                if (qVar != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1.b(qVar, false, null, false, null, 15, null);
                }
                c15471x9d199e5b.S6(wcVar.f89809a, 30, null);
                return true;
            }
        };
    }

    public final void O6(int i17) {
        gx2.q qVar = this.f215154f;
        if (qVar != null) {
            if (i17 <= 0 || qVar == null) {
                return;
            }
            qVar.mo62645x46e30de3(i17);
            return;
        }
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(m80379x76847179());
        frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        frameLayout.setId(com.p314xaae8f345.mm.R.id.g3v);
        frameLayout.setBackgroundColor(frameLayout.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        this.f215155g = frameLayout;
        float k17 = i17 > 0 ? i17 : (i65.a.k(m80379x76847179()) + com.p314xaae8f345.mm.ui.bk.p(m80379x76847179())) * kx2.a.f394811a.a(m80379x76847179());
        gx2.a aVar = new gx2.a();
        aVar.f358870c = k17;
        aVar.f358871d = new hx2.g(m80379x76847179(), 0, 0, 0, false, false, 62, null);
        android.widget.FrameLayout frameLayout2 = this.f215155g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(frameLayout2);
        aVar.f358872e = new hx2.c(frameLayout2);
        aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.av(this));
        aVar.f358873f = new hx2.b(m80379x76847179(), false, 2, null);
        gx2.q b17 = aVar.b(lk5.s.a(m158354x19263085()));
        this.f215154f = b17;
        b17.m132481xfadc8465(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bv(this));
        gx2.q qVar2 = this.f215154f;
        if (qVar2 == null) {
            return;
        }
        qVar2.m132485xe3fdb34(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.cv(this));
    }

    public final boolean P6() {
        gx2.q qVar = this.f215154f;
        if (qVar != null) {
            return qVar.isDrawerOpen;
        }
        return false;
    }

    public final void Q6(android.content.Intent intent, int i17) {
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37;
        android.content.Intent intent2;
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a372;
        android.content.Intent intent3;
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a373;
        android.content.Intent intent4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        java.lang.String stringExtra = intent.getStringExtra("finder_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f215157i = stringExtra;
        int hashCode = this.f215157i.hashCode() ^ java.lang.Long.hashCode(intent.getLongExtra("finder_read_feed_id", 0L));
        if (this.f215153e != hashCode) {
            O6(i17);
            intent.putExtra("key_is_auto_report", false);
            p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = m158354x19263085().mo7595x9cdc264().m7630xb2c12e75();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7630xb2c12e75, "beginTransaction(...)");
            android.widget.FrameLayout frameLayout = this.f215155g;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 b17 = lk5.q0.b("com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI", intent, false, 4, null);
            this.f215152d = b17;
            b17.m7571x41119ed3(false);
            com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = this.f215152d;
            if (c22584xf7d97e83 != null) {
                c22584xf7d97e83.q0(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fv(this));
            }
            gx2.q qVar = this.f215154f;
            if (qVar != null) {
                qVar.m132474x77f391b9(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gv(this));
            }
            com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e832 = this.f215152d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22584xf7d97e832);
            m7630xb2c12e75.k(com.p314xaae8f345.mm.R.id.g3v, c22584xf7d97e832, null);
            m7630xb2c12e75.f();
            this.f215153e = hashCode;
            return;
        }
        O6(0);
        int intExtra = intent.getIntExtra("key_click_avatar_type", 0);
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e833 = this.f215152d;
        if (c22584xf7d97e833 != null && (abstractActivityC22579xbed01a373 = c22584xf7d97e833.f292654p) != null && (intent4 = abstractActivityC22579xbed01a373.getIntent()) != null) {
            intent4.putExtra("key_click_avatar_type", intExtra);
        }
        boolean booleanExtra = intent.getBooleanExtra("key_if_living", false);
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e834 = this.f215152d;
        if (c22584xf7d97e834 != null && (abstractActivityC22579xbed01a372 = c22584xf7d97e834.f292654p) != null && (intent3 = abstractActivityC22579xbed01a372.getIntent()) != null) {
            intent3.putExtra("key_if_living", booleanExtra);
        }
        long longExtra = intent.getLongExtra("finder_from_feed_id", 0L);
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e835 = this.f215152d;
        if (c22584xf7d97e835 != null && (abstractActivityC22579xbed01a37 = c22584xf7d97e835.f292654p) != null && (intent2 = abstractActivityC22579xbed01a37.getIntent()) != null) {
            intent2.putExtra("finder_from_feed_id", longExtra);
        }
        this.f215160o = true;
        gx2.q qVar2 = this.f215154f;
        if (qVar2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1.m(qVar2, false, 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
    public final void R6(boolean z17) {
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37;
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = this.f215152d;
        android.content.Intent intent = null;
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a372 = c22584xf7d97e83 != null ? c22584xf7d97e83.f292654p : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderProfileDrawerUIC", "reportPageEvent isExit:" + z17);
        if (abstractActivityC22579xbed01a372 != null) {
            com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e832 = this.f215152d;
            if (c22584xf7d97e832 != null && (abstractActivityC22579xbed01a37 = c22584xf7d97e832.f292654p) != null) {
                intent = abstractActivityC22579xbed01a37.getIntent();
            }
            long longExtra = intent != null ? intent.getLongExtra("finder_from_feed_id", 0L) : 0L;
            int intExtra = intent != null ? intent.getIntExtra("key_click_avatar_type", 0) : 0;
            int booleanExtra = intent != null ? intent.getBooleanExtra("key_if_living", false) : 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ut utVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ut) pf5.z.f435481a.a(abstractActivityC22579xbed01a372).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ut.class);
            utVar.P6("source_feedid", pm0.v.u(longExtra));
            utVar.O6("click_avatar_type", intExtra);
            utVar.O6("if_living", booleanExtra);
            utVar.R6(z17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object] */
    public final void S6(long j17, int i17, so2.j5 j5Var) {
        so2.j5 j5Var2;
        so2.j5 j5Var3;
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderProfileDrawerUIC", "tryScrollToFeed feedId=" + j17 + ", maxFindPage=0, return");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f215161p;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            this.f215161p = null;
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderProfileDrawerUIC", "tryScrollToFeed feedId=" + pm0.v.u(j17) + ", maxFindPage=" + i17);
        android.app.Activity m80379x76847179 = m80379x76847179();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14074xf8b1598 activityC14074xf8b1598 = m80379x76847179 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14074xf8b1598 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14074xf8b1598) m80379x76847179 : null;
        if (activityC14074xf8b1598 == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kr krVar = activityC14074xf8b1598.f191039u;
        if (krVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13888xeed42a34 m17 = krVar.m();
        if (j5Var == null) {
            java.util.Iterator it = m17.m56387xe6796cde().iterator();
            while (true) {
                if (!it.hasNext()) {
                    j5Var3 = 0;
                    break;
                } else {
                    j5Var3 = it.next();
                    if (((so2.j5) j5Var3).mo2128x1ed62e84() == j17) {
                        break;
                    }
                }
            }
            j5Var2 = j5Var3;
        } else {
            j5Var2 = j5Var;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        if (V6 != null) {
            V6.m75939xb282bd08(5);
        }
        if (j5Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
            int i18 = ((c61.l7) i95.n0.c(c61.l7.class)).ek().I;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xr xrVar = activityC14074xf8b1598.f191044z;
        java.lang.Integer valueOf = xrVar != null ? java.lang.Integer.valueOf(xrVar.g(j17)) : null;
        if (valueOf == null || valueOf.intValue() != -1) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = this.f215161p;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
            this.f215161p = null;
            return;
        }
        if (m17.getHasMore()) {
            if (this.f215161p == null) {
                this.f215161p = db5.e1.Q(m80379x76847179(), "", m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), false, false, null);
            }
            m17.m56179xdbd64f2a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hv(this, j17, i17));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122.m56346x54c164a7(m17, false, 1, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderProfileDrawerUIC", "tryScrollToFeed feedId=" + j17 + ", hasMore=false, return");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var3 = this.f215161p;
        if (u3Var3 != null) {
            u3Var3.dismiss();
        }
        this.f215161p = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        if (!P6()) {
            return super.mo2274xbdc3c5dc();
        }
        gx2.q qVar = this.f215154f;
        if (qVar == null) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1.b(qVar, false, null, false, null, 15, null);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        mo48813x58998cd();
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.s0().r()).booleanValue()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bh bhVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bh.f215410a;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(activity), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sg(activity, null), 3, null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        mo48814x2efc64();
        this.f215154f = null;
        this.f215152d = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        gx2.q qVar;
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37;
        android.content.Intent intent;
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a372;
        android.content.Intent intent2;
        super.mo2281xb01dfb57();
        boolean z17 = false;
        this.f215158m = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderProfileDrawerUIC", "onPause isOpen:" + this.f215159n + " toOpen:" + this.f215160o);
        if (this.f215159n) {
            R6(true);
            return;
        }
        if (this.f215160o) {
            com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = this.f215152d;
            int intExtra = (c22584xf7d97e83 == null || (abstractActivityC22579xbed01a372 = c22584xf7d97e83.f292654p) == null || (intent2 = abstractActivityC22579xbed01a372.getIntent()) == null) ? 0 : intent2.getIntExtra("key_click_avatar_type", 0);
            com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e832 = this.f215152d;
            boolean booleanExtra = (c22584xf7d97e832 == null || (abstractActivityC22579xbed01a37 = c22584xf7d97e832.f292654p) == null || (intent = abstractActivityC22579xbed01a37.getIntent()) == null) ? false : intent.getBooleanExtra("key_if_living", false);
            if (intExtra == 1 && booleanExtra) {
                z17 = true;
            }
            if (!z17 || (qVar = this.f215154f) == null) {
                return;
            }
            qVar.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.dv(this), 1000L);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        this.f215158m = true;
        if (this.f215156h) {
            this.f215156h = false;
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderProfileDrawerUIC", "onResume isOpen:" + this.f215159n + " toOpen:" + this.f215160o);
        gx2.q qVar = this.f215154f;
        if (qVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1.o(qVar, 0, false, null, false, null, 31, null);
        }
        if (this.f215159n) {
            R6(false);
        }
    }
}
