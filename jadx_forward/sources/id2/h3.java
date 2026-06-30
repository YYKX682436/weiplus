package id2;

/* loaded from: classes2.dex */
public final class h3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.lo1 f372130d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f372131e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f372132f;

    public h3(r45.lo1 lo1Var, id2.u3 u3Var, java.lang.String str) {
        this.f372130d = lo1Var;
        this.f372131e = u3Var;
        this.f372132f = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/uic/FinderLivePersonalCenterUIC$refreshAnchorSetting$3$1$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onItemClick, title:");
        r45.lo1 lo1Var = this.f372130d;
        sb6.append(lo1Var.m75945x2fec8307(1));
        sb6.append(", jumpInfo:");
        sb6.append((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) lo1Var.m75936x14adae67(0));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePersonalCente", sb6.toString());
        r45.no1 no1Var = (r45.no1) lo1Var.m75936x14adae67(3);
        id2.u3 u3Var = this.f372131e;
        if (no1Var != null) {
            android.content.Intent intent = new android.content.Intent(u3Var.m80379x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13987x4e1170fd.class);
            r45.no1 no1Var2 = (r45.no1) lo1Var.m75936x14adae67(3);
            intent.putExtra("service", no1Var2 != null ? no1Var2.mo14344x5f01b1f6() : null);
            intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, lo1Var.m75945x2fec8307(1));
            u3Var.m158359x1e885992().addFlags(268435456);
            android.app.Activity m80379x76847179 = u3Var.m80379x76847179();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(m80379x76847179, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLivePersonalCenterUIC$refreshAnchorSetting$3$1$2$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            m80379x76847179.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(m80379x76847179, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLivePersonalCenterUIC$refreshAnchorSetting$3$1$2$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            java.lang.String str2 = this.f372132f;
            int i17 = ((str2.length() > 0) && ll2.e.f400666a.h(str2)) ? 1 : 0;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) lo1Var.m75936x14adae67(0);
            if (c19786x6a1e2862 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4 a4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4.f183535a;
                android.app.Activity m80379x768471792 = u3Var.m80379x76847179();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa = m80379x768471792 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) m80379x768471792 : null;
                if (abstractActivityC15087xee12defa == null || (str = java.lang.Integer.valueOf(abstractActivityC15087xee12defa.getD()).toString()) == null) {
                    str = "";
                }
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                java.lang.String b17 = b52.b.b();
                ml2.u1 u1Var = ml2.u1.f409573e;
                a4Var.b(str, b17, "person_page_ext_entrance", "{\"entrance_id\":\"" + lo1Var.m75939xb282bd08(2) + "\";\"is_reddot\":\"" + i17 + "\"}");
                android.app.Activity context = u3Var.m80379x76847179();
                if (c19786x6a1e2862.m76503x92bc3c07() == 6) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s();
                    cl0.g gVar = new cl0.g();
                    gVar.o("isFromPersonalCenter", 1);
                    ll2.e.f400666a.k(context instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) context : null, "LivePersonalCenterLiveRecordEntryRight", new id2.w2(gVar));
                    sVar.d(kz5.b1.e(new jz5.l("nativeData", gVar)));
                    sVar.f225700d = new id2.z2(u3Var, sVar, context);
                    ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Oj(context, c19786x6a1e2862, sVar);
                } else {
                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                    xc2.y2 y2Var = xc2.y2.f534876a;
                    xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
                    p0Var.f534785n = 0;
                    xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
                }
                if (lo1Var.m75939xb282bd08(2) == 3) {
                    ll2.e eVar = ll2.e.f400666a;
                    ll2.e.d(eVar, "LivePersonalCenterLiveRecordEntryLeft", false, false, 6, null);
                    ll2.e.d(eVar, "LivePersonalCenterLiveRecordEntryRight", false, false, 6, null);
                }
                if (i17 > 0) {
                    ll2.e eVar2 = ll2.e.f400666a;
                    ll2.b[] bVarArr = ll2.b.f400661d;
                    java.lang.String valueOf = java.lang.String.valueOf(14);
                    ll2.a aVar = ll2.a.f400657e;
                    eVar2.n(valueOf, str2, 2, "");
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLivePersonalCenterUIC$refreshAnchorSetting$3$1$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
