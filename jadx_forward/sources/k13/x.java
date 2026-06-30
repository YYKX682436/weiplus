package k13;

/* loaded from: classes8.dex */
public final class x extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 implements android.view.View.OnCreateContextMenuListener, db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f384810d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f384811e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.LinearLayout f384812f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f384813g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f384814h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f384815i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15562xa7b84ac6 f384816m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15562xa7b84ac6 activityC15562xa7b84ac6, android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f384816m = activityC15562xa7b84ac6;
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById);
        android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.odf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById2);
        android.view.View findViewById3 = itemView.findViewById(com.p314xaae8f345.mm.R.id.o7u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById3);
        this.f384810d = (android.widget.TextView) findViewById3;
        this.f384811e = (android.widget.TextView) itemView.findViewById(com.p314xaae8f345.mm.R.id.ovc);
        android.view.View findViewById4 = itemView.findViewById(com.p314xaae8f345.mm.R.id.f568186m06);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById4);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById4;
        this.f384812f = linearLayout;
        android.view.View findViewById5 = itemView.findViewById(com.p314xaae8f345.mm.R.id.lqy);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById5);
        this.f384813g = findViewById5;
        android.view.View findViewById6 = itemView.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        findViewById6.setOnTouchListener(new k13.t(activityC15562xa7b84ac6));
        findViewById6.setOnLongClickListener(new k13.u(activityC15562xa7b84ac6, this));
        linearLayout.setOnClickListener(new k13.w(activityC15562xa7b84ac6, this));
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu menu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        menu.add(this.f384816m.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fet));
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        boolean m40088x550b09c5 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40088x550b09c5(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15562xa7b84ac6 activityC15562xa7b84ac6 = this.f384816m;
        if (!m40088x550b09c5) {
            dp.a.m125854x26a183b(activityC15562xa7b84ac6.mo55332x76847179(), activityC15562xa7b84ac6.getResources().getText(com.p314xaae8f345.mm.R.C30867xcad56011.f572033wu), 1).show();
            return;
        }
        activityC15562xa7b84ac6.f218873i.remove(m8183xf806b362());
        k13.s sVar = activityC15562xa7b84ac6.f218870f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sVar);
        sVar.m8155x27702c4(m8183xf806b362());
        ((h13.l0) i95.n0.c(h13.l0.class)).wi(this.f384815i, 4);
        if (activityC15562xa7b84ac6.f218873i.isEmpty()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = activityC15562xa7b84ac6.f218869e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c1163xf1deaba4);
            c1163xf1deaba4.setVisibility(8);
            android.view.View view = activityC15562xa7b84ac6.f218872h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$ForceNotifyViewHolder", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$ForceNotifyViewHolder", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
