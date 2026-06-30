package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class co extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bxf;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        java.lang.String m76184x8010e5e4;
        so2.j3 item = (so2.j3) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d a17 = g1Var.a();
        r45.yf2 yf2Var = item.f491974d;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = yf2Var.f472567d;
        java.lang.String str2 = "";
        if (c19782x23db1cfa == null || (str = c19782x23db1cfa.m76175x6d346f39()) == null) {
            str = "";
        }
        mn2.n nVar = new mn2.n(str, null, 2, null);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.a9m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
        a17.c(nVar, (android.widget.ImageView) p17, g1Var.h(mn2.f1.f411494o));
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.obc);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = yf2Var.f472567d;
        if (c19782x23db1cfa2 != null && (m76184x8010e5e4 = c19782x23db1cfa2.m76184x8010e5e4()) != null) {
            str2 = m76184x8010e5e4;
        }
        objArr[0] = str2;
        android.content.Context context = holder.f374654e;
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.elv, objArr);
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, string, 15.0f));
        long j17 = yf2Var.f472570g * 1000;
        ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.dke)).setText(context.getString(j17 > c01.id.c() ? com.p314xaae8f345.mm.R.C30867xcad56011.f573436em0 : com.p314xaae8f345.mm.R.C30867xcad56011.f573437em1, k35.m1.f(context, j17, true, false)));
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) holder.p(com.p314xaae8f345.mm.R.id.qgi);
        r45.fz2 fz2Var = yf2Var.f472571h;
        if (item.f491975e == null) {
            ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).getClass();
            item.f491975e = new oc2.n(context);
        }
        oc2.k kVar = item.f491975e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(kVar);
        if (fz2Var == null) {
            frameLayout.setVisibility(8);
            return;
        }
        frameLayout.setVisibility(0);
        oc2.n nVar2 = (oc2.n) kVar;
        java.util.List a18 = nVar2.a(fz2Var);
        oc2.h hVar = new oc2.h((int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561186br), false, false);
        hVar.f425725d = oc2.f.f425698d;
        boolean c17 = nVar2.c(hVar, a18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMemberCardConvert", "intDslView isShouldUpdate:" + c17);
        if (frameLayout.getChildCount() == 1 && !c17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMemberCardConvert", "reuse last view!");
            return;
        }
        frameLayout.removeAllViews();
        android.view.ViewGroup d17 = nVar2.d("FinderMember", hVar, a18, fz2Var, null);
        if (d17.getParent() != null && (d17.getParent() instanceof android.view.ViewGroup)) {
            android.view.ViewParent parent = d17.getParent();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) parent).removeView(d17);
        }
        frameLayout.addView(d17);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.obc)).getPaint(), 0.8f);
    }
}
