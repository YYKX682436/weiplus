package sz4;

/* loaded from: classes12.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.ImageView f495750a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f495751b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f495752c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f495753d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f495754e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a f495755f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a f495756g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f495757h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ sz4.t f495758i;

    public r(sz4.t tVar, android.widget.ImageView subItemImg, android.view.View subItemView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subItemImg, "subItemImg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subItemView, "subItemView");
        this.f495758i = tVar;
        this.f495750a = subItemImg;
        this.f495751b = subItemView;
        this.f495752c = subItemView.findViewById(com.p314xaae8f345.mm.R.id.nqg);
        this.f495753d = subItemView.findViewById(com.p314xaae8f345.mm.R.id.nqh);
        this.f495754e = subItemView.findViewById(com.p314xaae8f345.mm.R.id.nqj);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a = this.f495756g;
        if (c19515x154ec45a != null) {
            return c19515x154ec45a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("btnNext");
        throw null;
    }

    public final void b(boolean z17) {
        int i17 = z17 ? 0 : 8;
        android.view.View view = this.f495753d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteMediaGroupItemHolder$SubItemHolder", "showMask", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteMediaGroupItemHolder$SubItemHolder", "showMask", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
