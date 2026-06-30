package oc4;

/* loaded from: classes4.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2191xcdea73af.C18249xbd6bf5ee f425869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f425870e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f425871f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xc4.p f425872g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2189x2eefaa.C18246x9a0ff9cd f425873h;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2191xcdea73af.C18249xbd6bf5ee c18249xbd6bf5ee, int i17, int i18, xc4.p pVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2189x2eefaa.C18246x9a0ff9cd c18246x9a0ff9cd) {
        this.f425869d = c18249xbd6bf5ee;
        this.f425870e = i17;
        this.f425871f = i18;
        this.f425872g = pVar;
        this.f425873h = c18246x9a0ff9cd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        oc4.v vVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$showUnreadTierView$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/component/unread/ImproveUnreadTierView$showUnreadTierView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2191xcdea73af.C18249xbd6bf5ee.f250536i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getHolder$p", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2191xcdea73af.C18249xbd6bf5ee c18249xbd6bf5ee = this.f425869d;
        in5.s0 s0Var = c18249xbd6bf5ee.f250540g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getHolder$p", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
        i64.u1.a(204, (s0Var != null ? s0Var.m8183xf806b362() : 0) - 1);
        rc4.e eVar = rc4.e.f475669a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setUnreadTierClicked", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        rc4.e.f475676h = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUnreadTierClicked", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        int i18 = this.f425870e;
        int i19 = i18 - this.f425871f;
        android.content.Context context = c18249xbd6bf5ee.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2191xcdea73af.C18250x12aff9a8 c18250x12aff9a8 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2191xcdea73af.C18250x12aff9a8) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2191xcdea73af.C18250x12aff9a8.class);
        c18250x12aff9a8.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("unreadBtnClick", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        xc4.p info = this.f425872g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        c18250x12aff9a8.f250554q++;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("unreadBtnClickReport", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        oc4.v vVar2 = c18250x12aff9a8.f250548h;
        if (vVar2 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unreadBtnClickReport", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
            str = "onClick";
            str2 = "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$showUnreadTierView$2";
            vVar = null;
        } else {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6970x515648f8 c6970x515648f8 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6970x515648f8();
            c6970x515648f8.f142793d = c6970x515648f8.b("SessionId", ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni(), true);
            c6970x515648f8.f142794e = info.y0();
            c6970x515648f8.f142795f = ca4.z0.F0((java.lang.String) kz5.n0.X(vVar2.a()));
            c6970x515648f8.f142796g = 1L;
            c6970x515648f8.f142797h = i19;
            c6970x515648f8.f142800k = c6970x515648f8.b("JumpBreakLayerExposureFeeds", "", true);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2 Fj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj();
            if ((Fj != null ? Fj.n1((java.lang.String) kz5.n0.X(vVar2.a())) : null) != null) {
                c6970x515648f8.f142801l = java.lang.System.currentTimeMillis() - r3.m70357x3fdd41df();
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int i27 = 0;
            for (java.lang.Object obj : vVar2.a()) {
                int i28 = i27 + 1;
                if (i27 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                sb6.append((java.lang.String) obj);
                sb6.append("|");
                if (i27 != 0 && (i27 % 50 == 0 || i27 == c18250x12aff9a8.f250551n.size() - 1)) {
                    arrayList2.add(sb6.toString());
                    r26.e0.d(sb6);
                }
                i27 = i28;
            }
            str = "onClick";
            str2 = "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$showUnreadTierView$2";
            c6970x515648f8.f142802m = java.lang.System.currentTimeMillis();
            int size = arrayList2.size();
            for (int i29 = 0; i29 < size; i29++) {
                c6970x515648f8.f142798i = c6970x515648f8.b("JumpBreakLayerFeeds", (java.lang.String) arrayList2.get(i29), true);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrayList2.get(i29), "get(...)");
                c6970x515648f8.f142799j = r26.n0.f0((java.lang.CharSequence) r12, new java.lang.String[]{"|"}, false, 0, 6, null).size() - 1;
                c6970x515648f8.f142803n = i29;
                c6970x515648f8.f142804o = size;
                c6970x515648f8.k();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unreadBtnClickReport", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
            vVar = null;
        }
        c18250x12aff9a8.Z6(vVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unreadBtnClick", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        if (i18 > 0) {
            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6052x56a4ad9d().e();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6094x91aef55 c6094x91aef55 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6094x91aef55();
            c6094x91aef55.f136371g.f89673a = i18 + 1;
            c6094x91aef55.e();
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2189x2eefaa.C18246x9a0ff9cd c18246x9a0ff9cd = this.f425873h;
            c18246x9a0ff9cd.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("changeToUnreadData", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
            java.util.ArrayList b17 = c18246x9a0ff9cd.f250300e.b();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.DataUIC", "changeToUnreadData size:" + b17.size());
            java.util.Iterator it = b17.iterator();
            int i37 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i38 = i37 + 1;
                if (i37 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.DataUIC", "index:" + i37 + "  value:" + ((zc4.b) next).n());
                i37 = i38;
            }
            if (!b17.isEmpty()) {
                c18246x9a0ff9cd.T6().d7(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p0.f250502e, true);
                com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe S6 = c18246x9a0ff9cd.S6();
                lc4.f fVar = new lc4.f(b17);
                S6.getClass();
                v65.i.b(S6.f233593g, null, new xm3.i0(fVar, S6, false, null), 1, null);
                c18246x9a0ff9cd.S6().d(new lc4.g(c18246x9a0ff9cd));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("changeToUnreadData", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/component/unread/ImproveUnreadTierView$showUnreadTierView$2", "android/view/View$OnClickListener", str, "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
    }
}
