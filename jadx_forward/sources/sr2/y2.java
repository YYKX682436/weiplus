package sr2;

/* loaded from: classes10.dex */
public final class y2 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public ya2.p1 f493333d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f493334e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f493335f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f493336g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f493337h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f493338i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f493339m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f493340n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f493341o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f493342p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f493343q;

    /* renamed from: r, reason: collision with root package name */
    public r45.gd1 f493344r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f493345s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f493346t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f493347u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f493348v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f493349w;

    /* renamed from: x, reason: collision with root package name */
    public r45.cd1 f493350x;

    /* renamed from: y, reason: collision with root package name */
    public r45.cd1 f493351y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f493335f = new java.util.ArrayList();
        this.f493338i = jz5.h.b(new sr2.i2(activity));
        this.f493339m = jz5.h.b(sr2.v1.f493271d);
        this.f493340n = jz5.h.b(sr2.x2.f493328d);
        this.f493341o = jz5.h.b(new sr2.u1(this, activity));
        this.f493343q = jz5.h.b(sr2.t1.f493254d);
        this.f493346t = "";
        this.f493348v = jz5.h.a(jz5.i.f384364f, new sr2.r1(this));
    }

    public final void O6() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        if (!(m158354x19263085 instanceof p012xc85e97e9.p093xedfae76a.y)) {
            m158354x19263085 = null;
        }
        if (m158354x19263085 == null) {
            return;
        }
        db2.r rVar = new db2.r(xy2.c.e(m158354x19263085()), 1, 1, xy2.c.d(m158354x19263085()));
        rVar.t(m158354x19263085(), m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), 500L);
        rVar.l().I(m158354x19263085).K(new sr2.s1(this));
    }

    public final boolean P6() {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            return true;
        }
        try {
            int m9698x3fed0563 = b3.l.m9698x3fed0563(m80379x76847179(), "android.permission.ACCESS_MEDIA_LOCATION");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PostLocationUIC", "checkMediaPermission selfPermission:" + m9698x3fed0563);
            return m9698x3fed0563 == 0;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("PostLocationUIC", e17, "", new java.lang.Object[0]);
            return false;
        }
    }

    public final jz5.l Q6() {
        return (jz5.l) ((jz5.n) this.f493343q).mo141623x754a37bb();
    }

    public final boolean R6() {
        return ((java.lang.Boolean) ((jz5.n) this.f493341o).mo141623x754a37bb()).booleanValue();
    }

    public final void S6(boolean z17) {
        r45.gd1 gd1Var = new r45.gd1();
        gd1Var.set(0, java.lang.Float.valueOf(((java.lang.Number) Q6().f384366d).floatValue()));
        gd1Var.set(1, java.lang.Float.valueOf(((java.lang.Number) Q6().f384367e).floatValue()));
        if (!z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getFinderLbsList] disallow materialLocation, materialLocation:[");
            r45.gd1 gd1Var2 = this.f493344r;
            sb6.append(gd1Var2 != null ? java.lang.Float.valueOf(gd1Var2.m75938x746dc8a6(0)) : null);
            sb6.append(',');
            r45.gd1 gd1Var3 = this.f493344r;
            sb6.append(gd1Var3 != null ? java.lang.Float.valueOf(gd1Var3.m75938x746dc8a6(1)) : null);
            sb6.append(']');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PostLocationUIC", sb6.toString());
            this.f493344r = null;
        }
        db2.i1.f309548t.a("", gd1Var, null, this.f493344r, null, false, 0, new sr2.x1(this, gd1Var));
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[getFinderLbsList] useMaterialLocation:");
        sb7.append(z17);
        sb7.append(" curLocation:[");
        sb7.append(gd1Var.m75938x746dc8a6(0));
        sb7.append(',');
        sb7.append(gd1Var.m75938x746dc8a6(1));
        sb7.append("] materialLocation:[");
        r45.gd1 gd1Var4 = this.f493344r;
        sb7.append(gd1Var4 != null ? java.lang.Float.valueOf(gd1Var4.m75938x746dc8a6(0)) : null);
        sb7.append(',');
        r45.gd1 gd1Var5 = this.f493344r;
        sb7.append(gd1Var5 != null ? java.lang.Float.valueOf(gd1Var5.m75938x746dc8a6(1)) : null);
        sb7.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PostLocationUIC", sb7.toString());
        pm0.v.X(new sr2.y1(this));
    }

    public final boolean T6() {
        ya2.p1 p1Var = this.f493333d;
        if (p1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("locationWidget");
            throw null;
        }
        r45.ze2 ze2Var = ((yv2.b) p1Var).f547735h;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ze2Var != null ? ze2Var.m75945x2fec8307(3) : null)) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ze2Var != null ? ze2Var.m75945x2fec8307(2) : null)) {
                return false;
            }
        }
        return true;
    }

    public final boolean U6() {
        if (!((java.lang.Boolean) ((jz5.n) this.f493339m).mo141623x754a37bb()).booleanValue()) {
            return false;
        }
        m92.b j37 = g92.a.j3(g92.b.f351302e, xy2.c.e(m158354x19263085()), false, 2, null);
        return ((j37 != null ? j37.u0().m75939xb282bd08(41) : 0) & 2) != 0;
    }

    public final boolean V6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0 ad0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207935a;
        return ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.W).mo141623x754a37bb()).r()).booleanValue();
    }

    public final boolean W6() {
        return 1 == ((java.lang.Number) this.f493348v.mo141623x754a37bb()).intValue();
    }

    public final boolean X6() {
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_POST_STORE_PROMOTE_DIALOG_SHOW_COUNT_INT_SYNC, 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[isShowLimitOk] showCount:");
        sb6.append(r17);
        sb6.append(" showLimit:");
        jz5.g gVar = this.f493340n;
        sb6.append(((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PostLocationUIC", sb6.toString());
        return r17 < ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue();
    }

    public final void Y6(android.content.Intent intent) {
        if (intent != null) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f493334e;
            if (c22849x81a93d25 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lbsRecyclerView");
                throw null;
            }
            c22849x81a93d25.setVisibility(8);
            ya2.p1 p1Var = this.f493333d;
            if (p1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("locationWidget");
                throw null;
            }
            yv2.b bVar = (yv2.b) p1Var;
            android.content.Intent intent2 = bVar.f547737m;
            if (intent2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
                throw null;
            }
            intent2.putExtra("saveLocation", true);
            android.content.Intent intent3 = bVar.f547737m;
            if (intent3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
                throw null;
            }
            java.lang.String stringExtra = intent.getStringExtra("get_poi_name");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (stringExtra == null) {
                stringExtra = "";
            }
            intent3.putExtra("get_poi_name", stringExtra);
            android.content.Intent intent4 = bVar.f547737m;
            if (intent4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
                throw null;
            }
            java.lang.String stringExtra2 = intent.getStringExtra("get_city");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            intent4.putExtra("get_city", stringExtra2);
            android.content.Intent intent5 = bVar.f547737m;
            if (intent5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
                throw null;
            }
            intent5.putExtra("get_lat", intent.getFloatExtra("get_lat", 0.0f));
            android.content.Intent intent6 = bVar.f547737m;
            if (intent6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
                throw null;
            }
            intent6.putExtra("get_lng", intent.getFloatExtra("get_lng", 0.0f));
            android.content.Intent intent7 = bVar.f547737m;
            if (intent7 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
                throw null;
            }
            java.lang.String stringExtra3 = intent.getStringExtra("get_poi_address");
            if (stringExtra3 == null) {
                stringExtra3 = "";
            }
            intent7.putExtra("get_poi_address", stringExtra3);
            android.content.Intent intent8 = bVar.f547737m;
            if (intent8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
                throw null;
            }
            java.lang.String stringExtra4 = intent.getStringExtra("get_poi_classify_id");
            if (stringExtra4 == null) {
                stringExtra4 = "";
            }
            intent8.putExtra("get_poi_classify_id", stringExtra4);
            android.content.Intent intent9 = bVar.f547737m;
            if (intent9 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
                throw null;
            }
            intent9.putExtra("key_is_multi_store_promotion", intent.getBooleanExtra("key_is_multi_store_promotion", false));
            android.content.Intent intent10 = bVar.f547737m;
            if (intent10 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
                throw null;
            }
            java.lang.String stringExtra5 = intent.getStringExtra("key_product_id");
            intent10.putExtra("key_product_id", stringExtra5 != null ? stringExtra5 : "");
            ya2.p1 p1Var2 = this.f493333d;
            if (p1Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("locationWidget");
                throw null;
            }
            ((yv2.b) p1Var2).d(false);
            if (W6()) {
                this.f493349w = true;
            }
            ya2.p1 p1Var3 = this.f493333d;
            if (p1Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("locationWidget");
                throw null;
            }
            r45.ze2 ze2Var = ((yv2.b) p1Var3).f547735h;
            if (ze2Var != null) {
                this.f493347u = intent.getBooleanExtra("key_is_from_media", false);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ze2Var.m75945x2fec8307(3)) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ze2Var.m75945x2fec8307(2))) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.X(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a, 3, ze2Var, 0, 4, null);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.X(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a, intent.getBooleanExtra("get_poi_is_search", false) ? 4 : 2, ze2Var, 0, 4, null);
                }
            }
        }
    }

    public final void Z6() {
        android.content.Intent intent = new android.content.Intent();
        ya2.p1 p1Var = this.f493333d;
        if (p1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("locationWidget");
            throw null;
        }
        r45.ze2 ze2Var = ((yv2.b) p1Var).f547735h;
        if (ze2Var != null) {
            intent.putExtra("key_location", ze2Var.mo14344x5f01b1f6());
        }
        r45.gd1 gd1Var = this.f493344r;
        if (gd1Var != null) {
            r45.ze2 ze2Var2 = new r45.ze2();
            ze2Var2.set(0, java.lang.Float.valueOf(gd1Var.m75938x746dc8a6(0)));
            ze2Var2.set(1, java.lang.Float.valueOf(gd1Var.m75938x746dc8a6(1)));
            intent.putExtra("key_material_location", ze2Var2.mo14344x5f01b1f6());
        }
        intent.putExtra("key_enable_store_promotion", U6());
        intent.putExtra("key_is_from_media", this.f493347u);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = m158354x19263085();
        i0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        bh5.c cVar = new bh5.c();
        cVar.f102455a.f102457a = context;
        cVar.d(intent);
        cVar.a("com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI");
        cVar.h(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059);
    }

    public final void a7(android.view.View view, java.lang.String str, int i17) {
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, str);
        cy1.a aVar2 = (cy1.a) aVar.ik(view, i17, 25496);
        aVar2.Tj(view, i17, 1, false);
        aVar2.Ai(view, new sr2.j2(view, str, this));
    }

    public final void b7() {
        ya2.p1 p1Var = this.f493333d;
        if (p1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("locationWidget");
            throw null;
        }
        if (((yv2.b) p1Var).f547735h != null) {
            return;
        }
        boolean N6 = ((ey2.k0) pf5.u.f435469a.e(c61.l7.class).a(ey2.k0.class)).N6();
        boolean Ri = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.LOCAION, d85.f0.f308696n);
        java.util.ArrayList arrayList = this.f493335f;
        int i17 = 1;
        if (N6 && Ri) {
            i17 = true ^ arrayList.isEmpty() ? 2 : 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PostLocationUIC", "[updateSubLbsFlag] subLbsFlag:" + i17 + " hasPermission:" + N6 + " hasBusinessPermission:" + Ri + " lbsList.size:" + arrayList.size());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
        if (c19783xd9a946b7 == null) {
            return;
        }
        c19783xd9a946b7.m76440xc2e7466b(i17);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onRequestPermissionsResult */
    public void mo2282x953457f1(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        super.mo2282x953457f1(i17, permissions, grantResults);
        if (i17 == 1001) {
            this.f493342p = P6();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PostLocationUIC", "[onRequestPermissionsResult] hasMediaLocationPermission:" + this.f493342p);
        }
    }
}
