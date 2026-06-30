package xm2;

/* loaded from: classes14.dex */
public final class o extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 implements lo0.h, lo0.g {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f536766d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f536767e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f536768f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f536769g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f536770h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f536771i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f536772m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f536773n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f536774o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Integer f536775p;

    /* renamed from: q, reason: collision with root package name */
    public zm2.c f536776q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.content.Context context, yz5.l itemSelectionHandler, yz5.l itemFineTuningHandler) {
        super(android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e8y, (android.view.ViewGroup) null));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemSelectionHandler, "itemSelectionHandler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemFineTuningHandler, "itemFineTuningHandler");
        this.f536766d = itemSelectionHandler;
        this.f536767e = itemFineTuningHandler;
        android.view.View findViewById = this.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.v2v);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget$ItemViewHolder", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget$ItemViewHolder", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f536768f = findViewById;
        android.view.View findViewById2 = this.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.veu);
        findViewById2.setOnClickListener(new xm2.m(this));
        this.f536769g = findViewById2;
        android.view.View findViewById3 = this.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.hrz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f536770h = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = this.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.twe);
        findViewById4.setOnClickListener(new xm2.n(this));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget$ItemViewHolder", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget$ItemViewHolder", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f536771i = findViewById4;
        android.view.View findViewById5 = this.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.uzf);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(4);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById5, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget$ItemViewHolder", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget$ItemViewHolder", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f536772m = findViewById5;
        android.view.View findViewById6 = this.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.sgs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f536773n = findViewById6;
        android.view.View findViewById7 = this.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.twd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f536774o = findViewById7;
    }

    @Override // lo0.h
    public void c(lo0.b badge) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(badge, "badge");
        badge.c(this);
        android.view.View view = this.f536773n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget$ItemViewHolder", "onBadgeDismissed", "(Lcom/tencent/mm/live/core/util/beautyModel/LiveBeautyBadge;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget$ItemViewHolder", "onBadgeDismissed", "(Lcom/tencent/mm/live/core/util/beautyModel/LiveBeautyBadge;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void i(boolean z17) {
        int i17;
        lo0.f fVar;
        android.view.View view = this.f536768f;
        int i18 = 4;
        int i19 = z17 ? 0 : 4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget$ItemViewHolder", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget$ItemViewHolder", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f536771i;
        if (z17) {
            zm2.c cVar = this.f536776q;
            if (cVar != null && cVar.f555702e) {
                i18 = 0;
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget$ItemViewHolder", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget$ItemViewHolder", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f536774o;
        if (z17) {
            zm2.c cVar2 = this.f536776q;
            if ((cVar2 == null || (fVar = cVar2.f555703f) == null || !fVar.a()) ? false : true) {
                i17 = 0;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget$ItemViewHolder", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget$ItemViewHolder", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view4 = this.f536772m;
                int visibility = this.f536771i.getVisibility();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(java.lang.Integer.valueOf(visibility));
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget$ItemViewHolder", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget$ItemViewHolder", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        i17 = 8;
        java.util.ArrayList arrayList32 = new java.util.ArrayList();
        arrayList32.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList32);
        yj0.a.d(view3, arrayList32.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget$ItemViewHolder", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList32.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget$ItemViewHolder", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view42 = this.f536772m;
        int visibility2 = this.f536771i.getVisibility();
        java.util.ArrayList arrayList42 = new java.util.ArrayList();
        arrayList42.add(java.lang.Integer.valueOf(visibility2));
        java.util.Collections.reverse(arrayList42);
        yj0.a.d(view42, arrayList42.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget$ItemViewHolder", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view42.setVisibility(((java.lang.Integer) arrayList42.get(0)).intValue());
        yj0.a.f(view42, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget$ItemViewHolder", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
