package ip2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ip2.a f375145a = new ip2.a();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f375146b = "";

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f375147c = "";

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f375148d = "";

    /* renamed from: e, reason: collision with root package name */
    public static boolean f375149e = true;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f375150f = "";

    /* renamed from: g, reason: collision with root package name */
    public static int f375151g = -1;

    /* renamed from: h, reason: collision with root package name */
    public static int f375152h = -1;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f375153i;

    public final void a(java.lang.String contextId, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301 fragment, java.lang.String clickTabContextId, java.lang.String byPass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextId, "contextId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickTabContextId, "clickTabContextId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(byPass, "byPass");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSquareTabLifeCycleReport", "enterLiveSquare contextId:" + contextId + " clickTabContextId:" + clickTabContextId + " byPass:" + byPass);
        f375146b = contextId;
        fragment.getF203049t();
        f375147c = clickTabContextId;
        f375150f = byPass;
        if (fragment instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14512xbce0ab98) {
            ae2.in inVar = ae2.in.f85221a;
            f375151g = ((java.lang.Number) ae2.in.U3.r()).intValue();
        }
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301 abstractC14499x6ba3301) {
        java.lang.String str;
        r45.dd2 dd2Var;
        if (f375153i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveSquareTabLifeCycleReport", "liveTabPageIn return for isInOnPauseState");
            return;
        }
        if ((abstractC14499x6ba3301 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd) || (abstractC14499x6ba3301 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1575xb830cb56.C14507xc6c296fb)) {
            java.lang.String f203049t = abstractC14499x6ba3301.getF203049t();
            java.lang.String t07 = abstractC14499x6ba3301.t0();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd c14521x246f2bd = abstractC14499x6ba3301 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd) abstractC14499x6ba3301 : null;
            if (c14521x246f2bd == null || (dd2Var = c14521x246f2bd.f203053t) == null || (str = java.lang.Integer.valueOf(dd2Var.m75939xb282bd08(0)).toString()) == null) {
                str = "";
            }
            int b17 = abstractC14499x6ba3301.getB();
            java.lang.String str2 = "page_tab_" + f203049t + '_' + t07;
            java.lang.String s07 = abstractC14499x6ba3301.s0();
            if (!(str.length() == 0)) {
                str2 = str2 + '_' + str;
            }
            if (android.text.TextUtils.isEmpty(f375148d)) {
                if (b17 / 100000 == 80 || b17 == 80) {
                    f375148d = "page_live_flow";
                }
            }
            java.lang.String valueOf = java.lang.String.valueOf(abstractC14499x6ba3301.m7479x8cdac1b());
            java.lang.String valueOf2 = java.lang.String.valueOf(b17);
            java.lang.String str3 = f375148d;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6465xc36db3c4 c6465xc36db3c4 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6465xc36db3c4();
            c6465xc36db3c4.f138086d = c01.id.c();
            c6465xc36db3c4.r(str2);
            c6465xc36db3c4.f138088f = c6465xc36db3c4.b("tab_id", f203049t, true);
            c6465xc36db3c4.f138089g = c6465xc36db3c4.b("sub_tab_id", t07, true);
            java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
            c6465xc36db3c4.f138090h = c6465xc36db3c4.b("sessionid", Ri != null ? Ri : "", true);
            c6465xc36db3c4.q(f375146b);
            c6465xc36db3c4.f138092j = c6465xc36db3c4.b("TabContextID", f375147c, true);
            c6465xc36db3c4.f138093k = c6465xc36db3c4.b("SubTabContextID", s07, true);
            c6465xc36db3c4.f138095m = c6465xc36db3c4.b("ref_page_id", str3, true);
            c6465xc36db3c4.p(valueOf2);
            cl0.g gVar = new cl0.g();
            int i17 = f375151g;
            if (i17 != -1) {
                gVar.s("is_new_square", java.lang.Integer.valueOf(i17));
                gVar.s("enter_type", java.lang.Integer.valueOf(f375152h));
            }
            d(gVar);
            java.lang.String gVar2 = gVar.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
            c6465xc36db3c4.s(r26.i0.t(gVar2, ",", ";", false));
            c6465xc36db3c4.f138097o = c6465xc36db3c4.b("switch_extra", ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ck(), true);
            ml2.b1.f408744a.b(new ml2.a1(valueOf, c6465xc36db3c4));
            f375148d = str2;
            f375149e = false;
        }
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301 abstractC14499x6ba3301) {
        r45.dd2 dd2Var;
        if (f375149e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveSquareTabLifeCycleReport", "liveTabPageOut return for isNeverPageIn");
            return;
        }
        if ((abstractC14499x6ba3301 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd) || (abstractC14499x6ba3301 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1575xb830cb56.C14507xc6c296fb)) {
            java.lang.String f203049t = abstractC14499x6ba3301.getF203049t();
            java.lang.String t07 = abstractC14499x6ba3301.t0();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd c14521x246f2bd = abstractC14499x6ba3301 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd) abstractC14499x6ba3301 : null;
            if (c14521x246f2bd != null && (dd2Var = c14521x246f2bd.f203053t) != null) {
                java.lang.Integer.valueOf(dd2Var.m75939xb282bd08(0)).toString();
            }
            abstractC14499x6ba3301.getB();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("page_tab_");
            sb6.append(f203049t);
            sb6.append('_');
            sb6.append(t07);
            abstractC14499x6ba3301.s0();
            abstractC14499x6ba3301.f202995r = "";
            ml2.b1.a(ml2.b1.f408744a, java.lang.String.valueOf(abstractC14499x6ba3301.m7479x8cdac1b()), null, 2, null);
        }
    }

    public final void d(cl0.g jsonObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonObject, "jsonObject");
        if (android.text.TextUtils.isEmpty(f375150f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSquareTabLifeCycleReport", "parseByPassToJson byPass is empty.");
            return;
        }
        try {
            cl0.g gVar = new cl0.g(f375150f);
            java.lang.String mo15082x48bce8a4 = gVar.mo15082x48bce8a4("appId");
            java.lang.String mo15082x48bce8a42 = gVar.mo15082x48bce8a4("versionType");
            if (!android.text.TextUtils.isEmpty(mo15082x48bce8a4)) {
                jsonObject.h("appid", mo15082x48bce8a4);
            }
            if (android.text.TextUtils.isEmpty(mo15082x48bce8a42)) {
                return;
            }
            jsonObject.h("versiontype", mo15082x48bce8a42);
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSquareTabLifeCycleReport", "parseByPassToJson error.");
        }
    }
}
