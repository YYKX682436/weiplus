package nr2;

/* loaded from: classes8.dex */
public final class u0 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f420846d;

    /* renamed from: e, reason: collision with root package name */
    public az2.f f420847e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f420848f;

    /* renamed from: g, reason: collision with root package name */
    public nr2.m f420849g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f420850h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f420851i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Set f420852m;

    /* renamed from: n, reason: collision with root package name */
    public final l75.q0 f420853n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f420846d = "";
        this.f420852m = new java.util.LinkedHashSet();
        this.f420853n = new nr2.m0(this);
    }

    public final void O6(android.view.View view, java.lang.String str) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        nr2.m mVar = this.f420849g;
        if (mVar == null) {
            return;
        }
        int i17 = mVar.i();
        long l17 = mVar.l();
        java.lang.String o17 = mVar.o();
        boolean p17 = mVar.p();
        boolean q17 = mVar.q();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean z18 = false;
        if (currentTimeMillis - qd2.h.f443300a >= 500) {
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f443300a);
            z17 = true;
        }
        qd2.h.f443300a = currentTimeMillis;
        if (z17 || i17 <= 0 || l17 == 0) {
            return;
        }
        cu2.g0 g0Var = cu2.g0.f303937a;
        java.lang.Long l18 = (java.lang.Long) cu2.g0.f303938b.get(java.lang.Long.valueOf(l17));
        if (l18 != null && android.os.SystemClock.elapsedRealtime() - l18.longValue() > com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
            z18 = true;
        }
        if (z18) {
            android.content.Context context = view.getContext();
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.f293309c = view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lq8);
            e4Var.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
            e4Var.c();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPaidCollectionPayUIC", "collectionWaiting");
            return;
        }
        android.content.Context context2 = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(o17, xy2.c.e(context2))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPaidCollectionPayUIC", "is author");
            return;
        }
        if (g0Var.b(l17) == null) {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new nr2.o0(this, view, i17, l17, o17, p17, q17, str, null), 3, null);
            return;
        }
        android.content.Context context3 = view.getContext();
        int i19 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context3);
        e4Var2.f293309c = mVar.p() ? view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lq6) : view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mgy);
        e4Var2.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
        e4Var2.c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPaidCollectionPayUIC", "collectionDuplicate");
    }

    public final java.lang.Object P6(android.content.Context context, byte[] bArr, java.lang.String str, int i17, int i18, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        boolean booleanValue;
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = nVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        pr4.l lVar = new pr4.l(i17, (p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) context, new nr2.p0(z17, h0Var), new nr2.q0(h0Var), new nr2.r0(h0Var));
        lVar.f439558f = pr4.k.f439550e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        lVar.f439559g = bArr;
        java.lang.String string = context.getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.lq9 : com.p314xaae8f345.mm.R.C30867xcad56011.mgz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        lVar.f439560h = string;
        java.lang.String string2 = context.getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.lqc : com.p314xaae8f345.mm.R.C30867xcad56011.f572876mh1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        lVar.f439561i = string2;
        lVar.f439562j = i18;
        java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m7p);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        lVar.f439565m = string3;
        java.lang.String string4 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m9s);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
        lVar.f439566n = string4;
        if (z17) {
            java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_COURSE_PAY_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
            booleanValue = ((java.lang.Boolean) m17).booleanValue();
        } else {
            java.lang.Object m18 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_DRAMA_PAY_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m18, "null cannot be cast to non-null type kotlin.Boolean");
            booleanValue = ((java.lang.Boolean) m18).booleanValue();
        }
        lVar.f439567o = booleanValue;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.emb));
        sb6.append("<_wc_custom_link_ href=\"https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/je7sPQCSulh7U9KS\">");
        sb6.append(context.getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.f572855lq4 : com.p314xaae8f345.mm.R.C30867xcad56011.mgx));
        sb6.append("</_wc_custom_link_>");
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        lVar.f439568p = sb7;
        ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).getClass();
        new ls4.u(lVar).f();
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        return a17;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|11)(2:13|14))(4:15|16|17|18))(10:43|44|45|46|47|48|49|50|51|(1:53)(1:54))|19|20|21|(2:23|24)(5:25|(1:27)(1:33)|(1:29)|30|(1:32)(1:11))))|64|6|(0)(0)|19|20|21|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q6(r45.qt2 r32, int r33, long r34, java.lang.String r36, java.lang.String r37, java.lang.String r38, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r39) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nr2.u0.Q6(r45.qt2, int, long, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|11)(2:13|14))(4:15|16|17|18))(10:43|44|45|46|47|48|49|50|51|(1:53)(1:54))|19|20|21|(2:23|24)(5:25|(1:27)(1:33)|(1:29)|30|(1:32)(1:11))))|64|6|(0)(0)|19|20|21|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R6(r45.qt2 r32, int r33, long r34, java.lang.String r36, java.lang.String r37, java.lang.String r38, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r39) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nr2.u0.R6(r45.qt2, int, long, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        long longExtra = m158359x1e885992().getLongExtra("paid_collection_feed_id", 0L);
        if (longExtra != 0) {
            this.f420846d = pm0.v.u(longExtra);
        }
        this.f420851i = m158359x1e885992().getBooleanExtra("KEY_FINDER_SELF_FLAG", false);
        byte[] byteArrayExtra = m80379x76847179().getIntent().getByteArrayExtra("paid_collection_info");
        if (byteArrayExtra != null) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new r45.do2().mo11468x92b714fd(byteArrayExtra);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderPaidCollectionInfo");
            this.f420849g = new nr2.m((r45.do2) mo11468x92b714fd);
        }
        this.f420850h = m158359x1e885992().getBooleanExtra("paid_collection_drawer_mode", false);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.bb0) ((jz5.n) ((c61.l7) i95.n0.c(c61.l7.class)).G).mo141623x754a37bb()).add(this.f420853n);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        this.f420852m.clear();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.bb0) ((jz5.n) ((c61.l7) i95.n0.c(c61.l7.class)).G).mo141623x754a37bb()).mo49775xc84af884(this.f420853n);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f420846d = "";
        this.f420852m = new java.util.LinkedHashSet();
        this.f420853n = new nr2.m0(this);
    }
}
