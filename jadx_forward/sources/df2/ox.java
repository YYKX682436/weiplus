package df2;

/* loaded from: classes3.dex */
public final class ox extends if2.b implements if2.e, mf2.v {

    /* renamed from: m, reason: collision with root package name */
    public if2.d0 f312545m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f312546n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f312547o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f312548p;

    /* renamed from: q, reason: collision with root package name */
    public pk2.o9 f312549q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ox(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    public final void Z6(android.content.Intent intent) {
        android.content.Intent intent2;
        java.lang.Integer valueOf = intent != null ? java.lang.Integer.valueOf(intent.getIntExtra("KEY_PARAMS_DO_ACTION", 0)) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MoreActionController", "checkAutoShow, doAction:" + valueOf + ", isLiveStarted:" + ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).a8());
        if (valueOf != null && valueOf.intValue() == 1 && ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).a8()) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6 = N6();
            if (N6 != null && (intent2 = N6.getIntent()) != null) {
                intent2.putExtra("KEY_PARAMS_DO_ACTION", 0);
            }
            pm0.v.V(1000L, new df2.lx(this));
        }
    }

    public final void a7() {
        el2.r2 r2Var;
        jz5.f0 f0Var;
        android.view.View reddotView = this.f312547o;
        if (c7()) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f312548p;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(O6(), com.p314xaae8f345.mm.R.raw.f79163x25927cc9, -1));
            }
        } else if (zl2.r4.f555483a.w1()) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f312548p;
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(O6(), com.p314xaae8f345.mm.R.raw.f79163x25927cc9, -1));
            }
        } else {
            android.view.View view = this.f312546n;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/MoreActionController", "enableBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/MoreActionController", "enableBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if2.d0 d0Var = this.f312545m;
            if (d0Var != null) {
                d0Var.d(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 ag0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0) R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0.class);
            if (ag0Var == null || (r2Var = ag0Var.I) == null) {
                reddotView = this.f312547o;
            } else {
                reddotView = r2Var.f335436h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(reddotView, "reddotView");
            }
        }
        if2.d0 d0Var2 = this.f312545m;
        if (d0Var2 != null) {
            d0Var2.d(0);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("enableBtn moreActionBtn:");
        android.view.View view2 = this.f312546n;
        sb6.append(view2 != null ? view2.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MoreActionController", sb6.toString());
        android.view.View view3 = this.f312546n;
        if (view3 != null) {
            view3.setOnClickListener(new df2.mx(this));
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6 = N6();
        if (N6 != null) {
            pk2.o9 o9Var = new pk2.o9(this, N6);
            this.f312549q = o9Var;
            zl2.r4 r4Var = zl2.r4.f555483a;
            boolean w17 = r4Var.w1();
            pk2.d9 d9Var = o9Var.f437615f;
            if (w17 || c7()) {
                qk2.a aVar = new qk2.a(o9Var, r4Var.w1() ? this.f312547o : null);
                if (d9Var != null) {
                    pk2.o9 o9Var2 = d9Var.f437213w;
                    o9Var2.f437619h = aVar;
                    d9Var.d(new pk2.b8(o9Var2, 0));
                    d9Var.d(new pk2.d8(o9Var2, 0));
                    d9Var.d(new pk2.r7(o9Var2, 0));
                    d9Var.d(new pk2.t7(o9Var2, 0));
                    aVar.m();
                }
            } else if (((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).T) {
                qk2.b bVar = new qk2.b(o9Var, this.f312547o);
                if (d9Var != null) {
                    pk2.o9 o9Var3 = d9Var.f437213w;
                    o9Var3.f437619h = bVar;
                    d9Var.d(new pk2.b8(o9Var3, 3));
                    d9Var.d(new pk2.d8(o9Var3, 3));
                    d9Var.d(new pk2.q7(o9Var3, 3));
                    d9Var.b(new pk2.o2(o9Var3, 3));
                    d9Var.c(new pk2.t1(o9Var3, 3));
                    d9Var.c(new pk2.g6(o9Var3, 3));
                    d9Var.c(new pk2.p2(o9Var3, 3));
                    d9Var.c(new pk2.j6(o9Var3, 3));
                    bVar.m();
                }
            } else {
                qk2.i iVar = new qk2.i(o9Var, reddotView);
                if (d9Var != null) {
                    pk2.o9 o9Var4 = d9Var.f437213w;
                    o9Var4.f437619h = iVar;
                    d9Var.b(new pk2.b8(o9Var4, 2));
                    d9Var.b(new pk2.d8(o9Var4, 2));
                    d9Var.b(new pk2.q7(o9Var4, 2));
                    d9Var.b(new pk2.pb(o9Var4, 2));
                    d9Var.b(new pk2.r7(o9Var4, 2));
                    d9Var.b(new pk2.w9(o9Var4, 2));
                    d9Var.c(new pk2.x9(o9Var4, 2));
                    d9Var.c(new pk2.ua(o9Var4, 2));
                    d9Var.c(new pk2.ka(o9Var4, 2));
                    d9Var.c(new pk2.nb(o9Var4, 2));
                    d9Var.c(new pk2.qb(o9Var4, 2));
                    d9Var.c(new pk2.sb(o9Var4, 2));
                    d9Var.c(new pk2.wb(o9Var4, 2));
                    d9Var.c(new pk2.bb(o9Var4, 2));
                    d9Var.c(new pk2.kb(o9Var4, 2));
                    d9Var.c(new pk2.fa(o9Var4, 2));
                    d9Var.c(new pk2.sa(o9Var4, 2));
                    iVar.m();
                }
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            this.f312549q = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.MoreActionController", "enbleBtn but activity is null");
        }
    }

    public final if2.d0 b7() {
        return this.f312545m;
    }

    public final boolean c7() {
        mm2.n0 n0Var = (mm2.n0) m56788xbba4bfc0(mm2.n0.class);
        return (n0Var != null && n0Var.f410806r) || ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).T;
    }

    public final void d7() {
        pk2.d9 d9Var;
        p3325xe03a0797.p3326xc267989b.f1 f1Var;
        android.widget.TextView textView;
        pk2.d9 d9Var2;
        if (!zl2.r4.f555483a.w1() && !c7()) {
            pk2.o9 o9Var = this.f312549q;
            if (o9Var == null || (d9Var2 = o9Var.f437615f) == null) {
                return;
            }
            d9Var2.e();
            return;
        }
        pk2.o9 o9Var2 = this.f312549q;
        if (o9Var2 == null || (d9Var = o9Var2.f437615f) == null) {
            return;
        }
        pk2.o9 o9Var3 = d9Var.f437213w;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = o9Var3.f437611d;
        if (d9Var.f437194d == null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) abstractActivityC21394xb3d2c0cf, 0, true);
            d9Var.f437194d = k0Var;
            k0Var.X1 = o9Var3.h();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = d9Var.f437194d;
            if (k0Var2 != null) {
                k0Var2.U1 = true;
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var3 = d9Var.f437194d;
        if (k0Var3 != null) {
            k0Var3.f293409p = new pk2.j8(d9Var, o9Var3);
        }
        if (d9Var.f437199i == null) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
            d9Var.f437199i = new com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m();
            r45.pk5 pk5Var = (r45.pk5) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ai(abstractActivityC21394xb3d2c0cf, 14, r45.pk5.class);
            if (pk5Var != null) {
                pk5Var.f464670i = 8;
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var4 = d9Var.f437194d;
        if (k0Var4 != null) {
            int color = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560534n5);
            if (k0Var4.W != null && (textView = k0Var4.f293420x0) != null) {
                textView.setTextColor(color);
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var5 = d9Var.f437194d;
        if (k0Var5 != null) {
            k0Var5.f293405n = new pk2.p8(d9Var);
        }
        if (k0Var5 != null) {
            k0Var5.f293418w = d9Var.f437210t;
        }
        if (k0Var5 != null) {
            k0Var5.f293414s = d9Var.f437209s;
        }
        if (k0Var5 != null) {
            k0Var5.p(new pk2.k8(d9Var, o9Var3));
        }
        p3325xe03a0797.p3326xc267989b.f1 f1Var2 = null;
        pk2.d9 d9Var3 = o9Var3.f437615f;
        if (d9Var3 != null && (f1Var = d9Var3.f437201k) != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(f1Var, null, 1, null);
        }
        if (d9Var3 != null) {
            pk2.g8 g8Var = d9Var3.f437191a;
            if (g8Var != null) {
                f1Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.i(((pk2.k9) g8Var).f437457a, oz5.m.f431862d, p3325xe03a0797.p3326xc267989b.a1.DEFAULT, new pk2.u7(o9Var3, null));
            }
            d9Var3.f437201k = f1Var2;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var6 = d9Var.f437194d;
        if (k0Var6 != null) {
            k0Var6.v();
        }
    }

    @Override // mf2.v
    public void e0() {
        pk2.o9 o9Var = this.f312549q;
        if (o9Var != null) {
            pk2.la.a(o9Var, true);
        }
    }

    @Override // if2.e
    /* renamed from: onActivityResult */
    public void mo57866x9d4787cb(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1009) {
            boolean booleanExtra = intent != null ? intent.getBooleanExtra("KEY_IS_FROM_SETTING", false) : false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MoreActionController", "REQUEST_FINDER_LIVE_ROLE fromUserGuide:" + booleanExtra);
            df2.ve veVar = (df2.ve) m56789x25fe639c(df2.ve.class);
            if (veVar != null) {
                veVar.f313129n = null;
                veVar.f313130o = null;
                veVar.f313131p = null;
                veVar.f313132q = null;
            }
            if (i18 != -1 || booleanExtra) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MoreActionController", "REQUEST_FINDER_LIVE_ROLE resultCode:" + i18 + ",data:" + intent);
            } else {
                dk2.xf P6 = P6();
                if (P6 != null) {
                    ((dk2.r4) P6).q(intent);
                }
            }
            int m75939xb282bd08 = g92.b.f351302e.k2().m75939xb282bd08(4);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("element", 2);
            jSONObject.put("type", 2);
            jSONObject.put("sub_element", m75939xb282bd08);
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0.hj((ml2.r0) c17, ml2.b4.P1, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        }
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
        dk2.ef efVar = dk2.ef.f314905a;
        dk2.ef.f314925k.f(23);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveEnd */
    public void mo56792x5aa1a970() {
        super.mo56792x5aa1a970();
        pk2.o9 o9Var = this.f312549q;
        if (o9Var != null) {
            pk2.d9 d9Var = o9Var.f437615f;
        }
        if2.d0 d0Var = this.f312545m;
        if (d0Var != null) {
            d0Var.d(4);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        super.mo14863x39a513b7(hc1Var);
        ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).Q5 = hc1Var != null ? (r45.qw1) hc1Var.m75936x14adae67(70) : null;
        a7();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6 = N6();
        Z6(N6 != null ? N6.getIntent() : null);
    }

    @Override // if2.e
    /* renamed from: onNewIntent */
    public void mo57867xc944513d(android.content.Intent intent) {
        Z6(intent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) pluginLayout.findViewById(com.p314xaae8f345.mm.R.id.fbg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup);
        this.f312545m = new if2.d0(viewGroup, this);
        this.f372636i = new df2.nx(this);
        this.f312546n = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.fbf);
        this.f312548p = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.fbe);
        android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.lqe);
        this.f312547o = findViewById;
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/MoreActionController", "onViewMount", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/controller/MoreActionController", "onViewMount", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        zl2.r4 r4Var = zl2.r4.f555483a;
        if (!r4Var.w1()) {
            android.view.View findViewById2 = pluginLayout.findViewById(com.p314xaae8f345.mm.R.id.fbg);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
            r4Var.c((android.view.ViewGroup) findViewById2, U6());
        }
        if (c7()) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f312548p;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(pluginLayout.getContext(), com.p314xaae8f345.mm.R.raw.f79163x25927cc9, -1));
            }
        } else if (r4Var.w1()) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f312548p;
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(pluginLayout.getContext(), com.p314xaae8f345.mm.R.raw.f79163x25927cc9, -1));
            }
        } else {
            ae2.in inVar = ae2.in.f85221a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85316j4).mo141623x754a37bb()).r()).intValue() == 0) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = this.f312548p;
                if (c22699x3dcdb3523 != null) {
                    c22699x3dcdb3523.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(pluginLayout.getContext(), com.p314xaae8f345.mm.R.raw.f79163x25927cc9, -1));
                }
            } else {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = this.f312548p;
                if (c22699x3dcdb3524 != null) {
                    c22699x3dcdb3524.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(pluginLayout.getContext(), com.p314xaae8f345.mm.R.raw.f79813xc8512e6d, -1));
                }
            }
        }
        if2.d0 d0Var = this.f312545m;
        if (d0Var != null) {
            d0Var.d(8);
        }
        if (((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).a8()) {
            a7();
        }
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        if2.d0 d0Var;
        pk2.d9 d9Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        pk2.o9 o9Var = this.f312549q;
        if (o9Var != null && (d9Var = o9Var.f437615f) != null) {
            d9Var.i();
        }
        this.f312549q = null;
        if (!zl2.r4.f555483a.w1() && (d0Var = this.f312545m) != null) {
            d0Var.d(8);
        }
        this.f312545m = null;
        this.f312546n = null;
        this.f312547o = null;
        this.f312548p = null;
    }

    @Override // if2.e
    /* renamed from: resume */
    public void mo57157xc84dc82d() {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6 = N6();
        Z6(N6 != null ? N6.getIntent() : null);
    }

    @Override // mf2.v
    public void s6(int i17, android.os.Bundle bundle) {
        pk2.o9 o9Var;
        if (i17 == 22) {
            pk2.o9 o9Var2 = this.f312549q;
            if (o9Var2 != null) {
                pk2.la.a(o9Var2, true);
                return;
            }
            return;
        }
        if (i17 != 23 || (o9Var = this.f312549q) == null) {
            return;
        }
        pk2.la.a(o9Var, false);
    }
}
