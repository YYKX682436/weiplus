package yf2;

/* loaded from: classes3.dex */
public final class g0 extends if2.b implements jm2.b, if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f543230m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f543231n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f543232o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f543230m = "FinderStartLivePostGroupVisibilityUIC";
        this.f543231n = true;
    }

    public static void a7(yf2.g0 g0Var, mm2.y6 y6Var, r45.q12 q12Var, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            y6Var = (mm2.y6) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) g0Var.m56788xbba4bfc0(mm2.g1.class)).f410611s).mo144003x754a37bb();
        }
        if ((i17 & 2) != 0) {
            q12Var = (r45.q12) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) g0Var.m56788xbba4bfc0(mm2.g1.class)).f410601f).mo144003x754a37bb();
        }
        g0Var.getClass();
        if (!zl2.r4.f555483a.T1(q12Var) || y6Var == null) {
            return;
        }
        y6Var.i(null);
    }

    public final void Z6(r45.q12 q12Var, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", "visibilityGroup click, firstShow:" + this.f543231n + '!');
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6 = N6();
        if (N6 != null) {
            c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_PARAMS_FIRST_ENTER_WHITE_LIST", this.f543231n);
            if (this.f543231n) {
                this.f543231n = false;
            }
            ((mm2.y6) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) m56788xbba4bfc0(mm2.g1.class)).f410611s).mo144003x754a37bb()).c(intent);
            intent.putExtra("KEY_PARAMS_WHITE_LIST_CHATROOM_ID", ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).H5);
            intent.putExtra("KEY_PARAMS_MAX_ROOM_COUNT", ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).a7() ? ((mm2.o2) m56788xbba4bfc0(mm2.o2.class)).f410834g : ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).f410402q4);
            intent.putExtra("KEY_PARAMS_MAX_USER_COUNT", ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).a7() ? ((mm2.o2) m56788xbba4bfc0(mm2.o2.class)).f410836i : ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).f410408r4);
            intent.putExtra("KEY_PARAMS_IS_NOTICE_PAY_LIVE", ((mm2.y6) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) m56788xbba4bfc0(mm2.g1.class)).f410611s).mo144003x754a37bb()).f411124o);
            r45.eq1 eq1Var = ((mm2.n2) getStore().getLiveRoomData().a(mm2.n2.class)).f410812g;
            intent.putExtra("KEY_PARAMS_IS_SUPER_FANS_CLUB", eq1Var != null ? eq1Var.m75933x41a8a7f2(10) : false);
            intent.putExtra("KEY_PARAMS_FREE_OF_CHARGE_FLAG", ((mm2.y6) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) m56788xbba4bfc0(mm2.g1.class)).f410611s).mo144003x754a37bb()).f411122m);
            if (z17) {
                intent.putExtra("KEY_PARAMS_IS_TEST_LIVE", true);
                intent.putExtra("KEY_PARAMS_VISIBILITY_MODE", 128);
            } else {
                zl2.r4 r4Var = zl2.r4.f555483a;
                if (r4Var.T1(q12Var) || r4Var.X1(q12Var)) {
                    intent.putExtra("KEY_PARAMS_LIVE_CHARGE_HIDE", true);
                }
            }
            if (zl2.r4.E1(getStore().getLiveRoomData())) {
                intent.putExtra("KEY_PARAMS_IS_CO_LIVE", true);
                intent.putExtra("KEY_PARAMS_LIVE_CHARGE_HIDE", true);
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ubVar).getClass();
            intent.setClass(N6, (java.lang.Class) ((jz5.n) jz2.x0.f384300n).mo141623x754a37bb());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(1001);
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(N6, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderLiveVisitorWhiteListUI", "(Landroid/app/Activity;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v31, types: [java.util.LinkedList] */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v51, types: [java.util.ArrayList] */
    @Override // if2.e
    /* renamed from: onActivityResult */
    public void mo57866x9d4787cb(int i17, int i18, android.content.Intent intent) {
        java.lang.String string;
        java.util.Collection collection;
        java.util.Collection collection2;
        ?? p07;
        java.util.Collection collection3;
        r45.re2 re2Var;
        r45.re2 re2Var2;
        java.util.LinkedList m75941xfb821914;
        r45.re2 re2Var3;
        r45.re2 re2Var4;
        if (i18 == -1 && i17 == 1001) {
            mm2.y6 y6Var = (mm2.y6) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) m56788xbba4bfc0(mm2.g1.class)).f410611s).mo144003x754a37bb();
            y6Var.g(intent);
            boolean z17 = y6Var.f411115f == 1;
            boolean d17 = y6Var.d();
            zl2.r4 r4Var = zl2.r4.f555483a;
            int i19 = y6Var.f411114e;
            if (d17) {
                string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e57);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            } else if (z17) {
                string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e6d);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            } else if (i19 == 0) {
                string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e5z);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            } else if (pm0.v.z(i19, 231)) {
                string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e6d);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            } else if (i19 == 8) {
                string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e6c);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            } else if (i19 == 16) {
                string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.luv);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            } else if (pm0.v.z(i19, 8) && pm0.v.z(i19, 16)) {
                string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.luu);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            } else {
                string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e5z);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            }
            db5.t7.f(O6(), string, yf2.a0.f543187a);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onActivityResult visibilityChooseByteArray size:");
            java.util.List list = y6Var.f411113d;
            sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
            sb6.append(",chooseRoomList:");
            sb6.append(y6Var.f411116g);
            sb6.append(",chooseUserList:");
            sb6.append(y6Var.f411117h);
            sb6.append(",chooseLabelList:");
            sb6.append(y6Var.f411118i);
            sb6.append(",partWhiteList:");
            r45.re2 re2Var5 = y6Var.f411123n;
            sb6.append(re2Var5 != null ? pm0.b0.b(re2Var5) : null);
            sb6.append(",liveChargePost:");
            r45.hn1 hn1Var = y6Var.f411120k;
            sb6.append(hn1Var != null ? pm0.b0.b(hn1Var) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", sb6.toString());
            a7(this, null, (r45.q12) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) m56788xbba4bfc0(mm2.g1.class)).f410601f).mo144003x754a37bb(), 1, null);
            android.content.Context O6 = O6();
            pf5.z zVar = pf5.z.f435481a;
            if (!(O6 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 b8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) O6).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8.class);
            if (b8Var != null) {
                b8Var.c7(false);
            }
            mm2.y6 y6Var2 = (mm2.y6) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) m56788xbba4bfc0(mm2.g1.class)).f410611s).mo144003x754a37bb();
            int i27 = pm0.v.z(y6Var2.f411114e, 64) ? 3 : y6Var2.e() ? 2 : 1;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            boolean d18 = y6Var2.d();
            if (d18) {
                r45.hn1 hn1Var2 = y6Var2.f411120k;
                collection = (hn1Var2 == null || (re2Var4 = (r45.re2) hn1Var2.m75936x14adae67(2)) == null) ? null : re2Var4.m75941xfb821914(0);
            } else {
                collection = y6Var2.f411116g;
            }
            if (collection != null) {
                java.util.Collection collection4 = collection.isEmpty() ^ true ? collection : null;
                if (collection4 != null) {
                    sb7.append("1:");
                    sb7.append(kz5.n0.g0(collection4, "|", null, null, 0, null, null, 62, null));
                }
            }
            if (d18) {
                r45.hn1 hn1Var3 = y6Var2.f411120k;
                collection2 = (hn1Var3 == null || (re2Var3 = (r45.re2) hn1Var3.m75936x14adae67(2)) == null) ? null : re2Var3.m75941xfb821914(1);
            } else {
                collection2 = y6Var2.f411117h;
            }
            if (collection2 != null) {
                java.util.Collection collection5 = collection2.isEmpty() ^ true ? collection2 : null;
                if (collection5 != null) {
                    if (sb7.length() > 0) {
                        sb7.append("#");
                    }
                    sb7.append("2:");
                    sb7.append(kz5.n0.g0(collection5, "|", null, null, 0, null, null, 62, null));
                }
            }
            if (d18) {
                r45.hn1 hn1Var4 = y6Var2.f411120k;
                if (hn1Var4 != null && (re2Var2 = (r45.re2) hn1Var4.m75936x14adae67(2)) != null && (m75941xfb821914 = re2Var2.m75941xfb821914(3)) != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : m75941xfb821914) {
                        java.lang.String m75945x2fec8307 = ((r45.il1) obj).m75945x2fec8307(0);
                        if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                            arrayList.add(obj);
                        }
                    }
                    p07 = new java.util.ArrayList();
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        java.lang.String m75945x2fec83072 = ((r45.il1) it.next()).m75945x2fec8307(0);
                        if (m75945x2fec83072 != null) {
                            p07.add(m75945x2fec83072);
                        }
                    }
                }
                p07 = 0;
            } else {
                java.util.List list2 = y6Var2.f411113d;
                if (!(!(list2 == null || list2.isEmpty()))) {
                    list2 = null;
                }
                if (list2 != null) {
                    p07 = r4Var.p0(list2);
                }
                p07 = 0;
            }
            if (p07 != 0) {
                java.lang.Iterable iterable = p07.isEmpty() ^ true ? p07 : null;
                if (iterable != null) {
                    if (sb7.length() > 0) {
                        sb7.append("#");
                    }
                    sb7.append("3:");
                    sb7.append(kz5.n0.g0(iterable, "|", null, null, 0, null, yf2.f0.f543221d, 30, null));
                }
            }
            if (d18) {
                r45.hn1 hn1Var5 = y6Var2.f411120k;
                collection3 = (hn1Var5 == null || (re2Var = (r45.re2) hn1Var5.m75936x14adae67(2)) == null) ? null : re2Var.m75941xfb821914(4);
            } else {
                collection3 = y6Var2.f411118i;
            }
            if (collection3 != null) {
                java.util.Collection collection6 = collection3.isEmpty() ^ true ? collection3 : null;
                if (collection6 != null) {
                    if (sb7.length() > 0) {
                        sb7.append("#");
                    }
                    sb7.append("4:");
                    sb7.append(kz5.n0.g0(collection6, "|", null, null, 0, null, null, 62, null));
                }
            }
            cl0.g gVar = new cl0.g();
            gVar.o("type", i27);
            gVar.h("result", sb7.toString());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f543230m, "[report] " + gVar);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.c1 c1Var = ml2.c1.f408858e;
            zy2.zb.j5(zbVar, 65L, gVar.toString(), null, 4, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new yf2.c0(this, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new yf2.e0(this, null), 3, null);
    }
}
