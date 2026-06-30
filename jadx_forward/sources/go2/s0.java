package go2;

/* loaded from: classes3.dex */
public final class s0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go2.a1 f355596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f355597e;

    public s0(go2.a1 a1Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var) {
        this.f355596d = a1Var;
        this.f355597e = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/area/uic/FinderMemberPayUIC$pay$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        go2.a1 a1Var = this.f355596d;
        android.app.Activity context = a1Var.m80379x76847179();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = this.f355597e;
        go2.r0 r0Var = new go2.r0(y1Var);
        a1Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(context);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b2u, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.hcj);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.hcu)).setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.emd));
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f567812kr3);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberPayUIC", "showMemberPayInfoDialog", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberPayUIC", "showMemberPayInfoDialog", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.jfg);
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.emk, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.eml));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add("https://kf.qq.com/touch/product/WXDB_app.html");
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.eml));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("showShare", false);
        intent.putExtra(com.p314xaae8f345.mm.ui.w2.f292738r, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d8 d8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d8.f183625a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d8.f(d8Var, context, textView, "Finder.FinderMemberPayUIC", string, arrayList3, arrayList4, null, 64, null);
        findViewById.setOnClickListener(new go2.x0(y1Var2));
        y1Var2.f293570s = new go2.y0(r0Var);
        y1Var2.n(new go2.z0(r0Var));
        y1Var2.k(inflate);
        y1Var2.s();
        y1Var.r(true);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberPayUIC$pay$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
