package xm2;

/* loaded from: classes14.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f536791a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f536792b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f536793c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f536794d;

    /* renamed from: e, reason: collision with root package name */
    public final xm2.p f536795e;

    /* renamed from: f, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f536796f;

    public t(android.view.ViewGroup controlPanelLayout, java.util.List items, java.lang.Object obj, ym2.c itemsAdapter, yz5.l itemSelectionHandler, yz5.l itemFineTuningHandler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controlPanelLayout, "controlPanelLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemsAdapter, "itemsAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemSelectionHandler, "itemSelectionHandler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemFineTuningHandler, "itemFineTuningHandler");
        this.f536791a = items;
        this.f536792b = itemSelectionHandler;
        this.f536793c = itemFineTuningHandler;
        this.f536794d = obj;
        xm2.p pVar = new xm2.p(items, obj, itemsAdapter, new xm2.s(this), new xm2.r(this));
        this.f536795e = pVar;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) controlPanelLayout.findViewById(com.p314xaae8f345.mm.R.id.usx);
        android.content.Context context = controlPanelLayout.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        c1163xf1deaba4.mo7967x900dcbe1(new xm2.q(context));
        c1163xf1deaba4.mo7960x6cab2c8d(pVar);
        this.f536796f = c1163xf1deaba4;
    }

    public final void a() {
        int indexOf = this.f536791a.indexOf(this.f536794d);
        if (indexOf == -1) {
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f536796f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(indexOf));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget", "revealSelectedItem", "()V", "Undefined", "scrollToPosition", "(I)V");
        c1163xf1deaba4.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget", "revealSelectedItem", "()V", "Undefined", "scrollToPosition", "(I)V");
    }
}
