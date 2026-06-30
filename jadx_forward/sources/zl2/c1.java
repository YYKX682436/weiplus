package zl2;

/* loaded from: classes.dex */
public final class c1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f555221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f555222e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f555223f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.u3 f555224g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f555225h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f555226i;

    public c1(android.content.Context context, int i17, int i18, com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        this.f555221d = context;
        this.f555222e = i17;
        this.f555223f = i18;
        this.f555224g = u3Var;
        this.f555225h = c0Var;
        this.f555226i = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$checkGiftLegalArgeement$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, null, null, new zl2.b1(this.f555221d, this.f555222e, this.f555223f, this.f555224g, this.f555225h, this.f555226i, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$checkGiftLegalArgeement$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
