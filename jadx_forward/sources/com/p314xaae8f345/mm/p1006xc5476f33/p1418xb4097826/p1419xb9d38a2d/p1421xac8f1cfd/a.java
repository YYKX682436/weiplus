package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd;

/* loaded from: classes2.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.c f183233d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.c cVar) {
        this.f183233d = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.ui4 ui4Var;
        java.lang.String m75945x2fec8307;
        r45.ui4 ui4Var2;
        r45.ui4 ui4Var3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/account/component/FinderAccCompleteTipsUIC$initAccCompleteTips$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.c cVar = this.f183233d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = cVar.f183235d;
        if (y1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomSheet");
            throw null;
        }
        m92.b j37 = g92.a.j3(g92.b.f351302e, xy2.c.e(cVar.m80379x76847179()), false, 2, null);
        android.widget.ImageView imageView = (android.widget.ImageView) y1Var.f293560f.findViewById(com.p314xaae8f345.mm.R.id.e7n);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((j37 == null || (ui4Var3 = (r45.ui4) j37.u0().m75936x14adae67(27)) == null) ? null : ui4Var3.m75945x2fec8307(2))) {
            mn2.g1 g1Var = mn2.g1.f411508a;
            vo0.d l17 = g1Var.l();
            mn2.n nVar = new mn2.n((j37 == null || (ui4Var2 = (r45.ui4) j37.u0().m75936x14adae67(27)) == null) ? null : ui4Var2.m75945x2fec8307(2), null, 2, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
            l17.c(nVar, imageView, g1Var.h(mn2.f1.f411494o));
        }
        com.p314xaae8f345.mm.ui.bk.s0(((android.widget.TextView) y1Var.f293560f.findViewById(com.p314xaae8f345.mm.R.id.e7p)).getPaint());
        java.lang.String str = j37 != null ? j37.f68710x21f9b213 : null;
        java.lang.String str2 = "";
        if (str == null) {
            str = "";
        }
        if (str.length() > 0) {
            android.widget.TextView textView = (android.widget.TextView) y1Var.f293560f.findViewById(com.p314xaae8f345.mm.R.id.e7v);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = textView.getContext();
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str));
            com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
        }
        if (j37 != null && (ui4Var = (r45.ui4) j37.u0().m75936x14adae67(27)) != null && (m75945x2fec8307 = ui4Var.m75945x2fec8307(0)) != null) {
            str2 = m75945x2fec8307;
        }
        ((android.widget.TextView) y1Var.f293560f.findViewById(com.p314xaae8f345.mm.R.id.e7r)).setText(cVar.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.chc, str2));
        ((android.widget.TextView) y1Var.f293560f.findViewById(com.p314xaae8f345.mm.R.id.f565953e81)).setText(cVar.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f_6, str2));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var2 = cVar.f183235d;
        if (y1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomSheet");
            throw null;
        }
        y1Var2.s();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/account/component/FinderAccCompleteTipsUIC$initAccCompleteTips$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
