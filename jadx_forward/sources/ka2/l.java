package ka2;

/* loaded from: classes10.dex */
public final class l implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4 f387570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f387571e;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4 activityC13659x4f0951e4, java.util.ArrayList arrayList) {
        this.f387570d = activityC13659x4f0951e4;
        this.f387571e = arrayList;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        java.lang.String str;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4 activityC13659x4f0951e4 = this.f387570d;
        java.lang.Object obj = null;
        if (i17 == activityC13659x4f0951e4.f183328v && activityC13659x4f0951e4.f183327u != null) {
            activityC13659x4f0951e4.f183328v = -1;
            activityC13659x4f0951e4.f183327u = null;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = activityC13659x4f0951e4.f183331y;
            if (c22661xa3a2b3c0 != null) {
                c22661xa3a2b3c0.setEnabled(false);
            }
            adapter.m8147xed6e4d18(i17);
            return;
        }
        java.lang.Object obj2 = this.f387571e.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
        ha2.a aVar = (ha2.a) obj2;
        switch (aVar.f361325e) {
            case 4:
            case 7:
                return;
            case 5:
                boolean z17 = activityC13659x4f0951e4.f183326t;
                ka2.d dVar = activityC13659x4f0951e4.L;
                java.util.Iterator it = (z17 ? dVar.f387550b : dVar.f387549a).iterator();
                while (true) {
                    if (it.hasNext()) {
                        java.lang.Object next = it.next();
                        if (((ha2.a) next).f361325e == 5) {
                            obj = next;
                        }
                    }
                }
                ha2.a aVar2 = (ha2.a) obj;
                if (aVar2 != null) {
                    aVar2.f361329i = true;
                }
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = activityC13659x4f0951e4.f183326t ? dVar.f387554f : dVar.f387553e;
                if (c22848x6ddd90cf != null) {
                    c22848x6ddd90cf.m8146xced61ae5();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4.n7(activityC13659x4f0951e4, activityC13659x4f0951e4.f183332z, activityC13659x4f0951e4.f183326t, true, false, ka2.f.f387562e, 0, 40, null);
                return;
            case 6:
            case 8:
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("is_only_show_media_with_location", true);
                ((w40.e) i95.n0.c(w40.e.class)).getClass();
                qs2.v vVar = qs2.v.f447860a;
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC13659x4f0951e4.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
                qs2.t.a(vVar, mo55332x76847179, intent, 3, 1, java.lang.Boolean.TRUE, 10001, 41, false, 128, null);
                return;
            default:
                int i18 = activityC13659x4f0951e4.f183328v;
                if (i18 >= 0) {
                    adapter.m8147xed6e4d18(i18);
                }
                activityC13659x4f0951e4.f183327u = aVar;
                activityC13659x4f0951e4.f183328v = i17;
                adapter.m8147xed6e4d18(i17);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c02 = activityC13659x4f0951e4.f183331y;
                if (c22661xa3a2b3c02 != null) {
                    c22661xa3a2b3c02.setEnabled(true);
                }
                if (1 == aVar.f361325e) {
                    r45.hd1 hd1Var = aVar.f361324d;
                    if (hd1Var.m75939xb282bd08(5) == 1 && activityC13659x4f0951e4.f7()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = activityC13659x4f0951e4.mo55332x76847179();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471792, "getContext(...)");
                        ka2.j jVar = new ka2.j(activityC13659x4f0951e4, aVar);
                        i0Var.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("FinderPostPromotionShopAppId");
                        if (d17 == null) {
                            d17 = "wxalitecd3434f9a28b4db218f4730961d39d55";
                        }
                        java.lang.String str2 = d17;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderConfig", "FINDER_POST_PROMOTION_SHOP_APP_ID appId = ".concat(str2));
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
                        if (c19783xd9a946b7 == null || (str = c19783xd9a946b7.m76317x2a881cd1()) == null) {
                            str = "";
                        }
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        java.lang.String d18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("FinderPostPromotionShopPath");
                        if (d18 == null) {
                            d18 = "pages/local/postWithCoupon/index";
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderConfig", "FINDER_POST_PROMOTION_SHOP_PATH path = ".concat(d18));
                        sb6.append(d18);
                        sb6.append("?sessionId=");
                        sb6.append(str);
                        sb6.append("&poiId=");
                        sb6.append(hd1Var.m75945x2fec8307(0));
                        java.lang.String sb7 = sb6.toString();
                        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                        zy2.ta.f(ya2.e1.f542005a, mo55332x768471792, str2, sb7, null, false, true, false, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.h0(i0Var, jVar), 216, null);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
