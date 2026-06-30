package xm2;

/* loaded from: classes14.dex */
public final class v extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 implements lo0.h {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f536798d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f536799e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f536800f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f536801g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f536802h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Integer f536803i;

    /* renamed from: m, reason: collision with root package name */
    public zm2.d f536804m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(android.content.Context context, yz5.l itemSelectionHandler) {
        super(android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570393e90, (android.view.ViewGroup) null));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemSelectionHandler, "itemSelectionHandler");
        this.f536798d = itemSelectionHandler;
        android.view.View findViewById = this.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.v2v);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautySingleLevelControlPanelWidget$ItemViewHolder", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautySingleLevelControlPanelWidget$ItemViewHolder", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f536799e = findViewById;
        android.view.View findViewById2 = this.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.veu);
        findViewById2.setOnClickListener(new xm2.u(this));
        this.f536800f = findViewById2;
        android.view.View findViewById3 = this.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.hrz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f536801g = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = this.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.sgs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f536802h = findViewById4;
    }

    @Override // lo0.h
    public void c(lo0.b badge) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(badge, "badge");
        badge.c(this);
        android.view.View view = this.f536802h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautySingleLevelControlPanelWidget$ItemViewHolder", "onBadgeDismissed", "(Lcom/tencent/mm/live/core/util/beautyModel/LiveBeautyBadge;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautySingleLevelControlPanelWidget$ItemViewHolder", "onBadgeDismissed", "(Lcom/tencent/mm/live/core/util/beautyModel/LiveBeautyBadge;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void i(boolean z17) {
        android.view.View view = this.f536799e;
        int i17 = z17 ? 0 : 4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautySingleLevelControlPanelWidget$ItemViewHolder", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautySingleLevelControlPanelWidget$ItemViewHolder", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
