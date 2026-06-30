package mj2;

/* loaded from: classes10.dex */
public class j extends mj2.e {

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f408567v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View f408568w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f408569x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.content.Context context, gk2.e liveData, android.view.View root, zh2.c pluginAbility, zh2.e micUserInterface, zh2.d dVar) {
        super(context, liveData, root, pluginAbility, micUserInterface, dVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micUserInterface, "micUserInterface");
        this.f408567v = root.findViewById(com.p314xaae8f345.mm.R.id.jjc);
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.f567018qu5);
        this.f408568w = findViewById;
        this.f408569x = jz5.h.b(new mj2.i(liveData, context, pluginAbility));
        findViewById.setOnClickListener(this);
    }

    @Override // mj2.e
    public mi2.h j() {
        zh2.c cVar = this.f408549g;
        boolean z17 = ((mm2.c1) cVar.g().a(mm2.c1.class)).S4;
        android.content.Context context = this.f408546d;
        return z17 ? new mi2.h(context, cVar, new mj2.g(this)) : new mi2.l(context, cVar, new z.g4(this));
    }

    @Override // mj2.e, android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        kn0.p pVar;
        super.onClick(view);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int id6 = this.f408568w.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            zh2.c cVar = this.f408549g;
            tn0.w0 h17 = cVar.h();
            boolean z17 = false;
            boolean z18 = (h17 == null || (pVar = h17.D) == null || !pVar.f391122i) ? false : true;
            android.content.Context context = this.f408546d;
            if (z18) {
                db5.t7.m(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mln));
            } else if (((mm2.y2) cVar.g().a(mm2.y2.class)).Y6()) {
                db5.t7.m(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m0r));
            } else {
                z17 = true;
            }
            if (z17) {
                ((qi2.q1) ((jz5.n) this.f408569x).mo141623x754a37bb()).F(((mm2.y2) this.f408547e.a(mm2.y2.class)).f411096p, true);
                m();
            }
        }
    }

    @Override // mj2.e
    public void r(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        super.r(source);
        if (s()) {
            android.view.View view = this.f408568w;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/acceptpanel/FinderLiveMicVisitorAcceptPanelWidget", "updatePanelData", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/acceptpanel/FinderLiveMicVisitorAcceptPanelWidget", "updatePanelData", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f408567v;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/acceptpanel/FinderLiveMicVisitorAcceptPanelWidget", "updatePanelData", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/widget/acceptpanel/FinderLiveMicVisitorAcceptPanelWidget", "updatePanelData", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view3 = this.f408567v;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/acceptpanel/FinderLiveMicVisitorAcceptPanelWidget", "updatePanelData", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/mic/widget/acceptpanel/FinderLiveMicVisitorAcceptPanelWidget", "updatePanelData", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f408568w;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/acceptpanel/FinderLiveMicVisitorAcceptPanelWidget", "updatePanelData", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/mic/widget/acceptpanel/FinderLiveMicVisitorAcceptPanelWidget", "updatePanelData", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        jz5.g gVar = this.f408559t;
        if (((mi2.h) ((jz5.n) gVar).mo141623x754a37bb()).q()) {
            mi2.h hVar = (mi2.h) ((jz5.n) gVar).mo141623x754a37bb();
            mi2.l lVar = hVar instanceof mi2.l ? (mi2.l) hVar : null;
            if (lVar != null) {
                lVar.B.k(lVar.f408286h.g());
            }
        }
    }

    public boolean s() {
        zh2.c cVar = this.f408549g;
        return ((mm2.e1) cVar.g().a(mm2.e1.class)).g7() ? ((mm2.e1) cVar.g().a(mm2.e1.class)).c7() : ((mm2.c1) cVar.g().a(mm2.c1.class)).G;
    }
}
