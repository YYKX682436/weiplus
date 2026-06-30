package vg2;

/* loaded from: classes3.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f518133a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ViewGroup f518134b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f518135c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f518136d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f518137e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f518138f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f518139g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f518140h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f518141i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f518142j;

    public v0(android.content.Context context, android.view.ViewGroup parentRoot, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l plugin, yz5.a aVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentRoot, "parentRoot");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
        this.f518133a = context;
        this.f518134b = parentRoot;
        this.f518135c = plugin;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.diw, (android.view.ViewGroup) null);
        this.f518136d = inflate;
        this.f518137e = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a4f);
        this.f518138f = jz5.h.b(new vg2.n0(this));
        this.f518139g = jz5.h.b(new vg2.m0(this));
        this.f518140h = jz5.h.b(new vg2.p0(this));
        this.f518141i = jz5.h.b(new vg2.o0(this));
        this.f518142j = jz5.h.b(new vg2.l0(this));
    }

    public final android.view.View a() {
        return (android.view.View) ((jz5.n) this.f518138f).mo141623x754a37bb();
    }

    public final void b() {
        android.view.View view = this.f518136d;
        if (view.getVisibility() == 0) {
            android.view.View view2 = this.f518136d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/GiftPkSelectPanelWidget", "hideWidget", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/gift/widget/GiftPkSelectPanelWidget", "hideWidget", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f518134b.removeView(view);
        }
    }
}
