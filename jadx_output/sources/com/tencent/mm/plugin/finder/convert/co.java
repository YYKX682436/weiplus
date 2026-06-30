package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class co extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.bxf;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        java.lang.String nickname;
        so2.j3 item = (so2.j3) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d a17 = g1Var.a();
        r45.yf2 yf2Var = item.f410441d;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = yf2Var.f391034d;
        java.lang.String str2 = "";
        if (finderContact == null || (str = finderContact.getHeadUrl()) == null) {
            str = "";
        }
        mn2.n nVar = new mn2.n(str, null, 2, null);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.a9m);
        kotlin.jvm.internal.o.f(p17, "getView(...)");
        a17.c(nVar, (android.widget.ImageView) p17, g1Var.h(mn2.f1.f329961o));
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.obc);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = yf2Var.f391034d;
        if (finderContact2 != null && (nickname = finderContact2.getNickname()) != null) {
            str2 = nickname;
        }
        objArr[0] = str2;
        android.content.Context context = holder.f293121e;
        java.lang.String string = context.getString(com.tencent.mm.R.string.elv, objArr);
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, string, 15.0f));
        long j17 = yf2Var.f391037g * 1000;
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.dke)).setText(context.getString(j17 > c01.id.c() ? com.tencent.mm.R.string.f491903em0 : com.tencent.mm.R.string.f491904em1, k35.m1.f(context, j17, true, false)));
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) holder.p(com.tencent.mm.R.id.qgi);
        r45.fz2 fz2Var = yf2Var.f391038h;
        if (item.f410442e == null) {
            ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).getClass();
            item.f410442e = new oc2.n(context);
        }
        oc2.k kVar = item.f410442e;
        kotlin.jvm.internal.o.d(kVar);
        if (fz2Var == null) {
            frameLayout.setVisibility(8);
            return;
        }
        frameLayout.setVisibility(0);
        oc2.n nVar2 = (oc2.n) kVar;
        java.util.List a18 = nVar2.a(fz2Var);
        oc2.h hVar = new oc2.h((int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479653br), false, false);
        hVar.f344192d = oc2.f.f344165d;
        boolean c17 = nVar2.c(hVar, a18);
        com.tencent.mars.xlog.Log.i("Finder.FinderMemberCardConvert", "intDslView isShouldUpdate:" + c17);
        if (frameLayout.getChildCount() == 1 && !c17) {
            com.tencent.mars.xlog.Log.i("Finder.FinderMemberCardConvert", "reuse last view!");
            return;
        }
        frameLayout.removeAllViews();
        android.view.ViewGroup d17 = nVar2.d("FinderMember", hVar, a18, fz2Var, null);
        if (d17.getParent() != null && (d17.getParent() instanceof android.view.ViewGroup)) {
            android.view.ViewParent parent = d17.getParent();
            kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) parent).removeView(d17);
        }
        frameLayout.addView(d17);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) holder.p(com.tencent.mm.R.id.obc)).getPaint(), 0.8f);
    }
}
