package xc2;

/* loaded from: classes2.dex */
public final class r2 implements ep0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f534816a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f534817b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xc2.o0 f534818c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f534819d;

    public r2(android.view.View view, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, xc2.o0 o0Var, int i17) {
        this.f534816a = view;
        this.f534817b = c22699x3dcdb352;
        this.f534818c = o0Var;
        this.f534819d = i17;
    }

    @Override // ep0.a
    public final void a(boolean z17, java.lang.Object[] objArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.JumperUtils", "loadLinkIcon success :" + z17);
        xc2.y2 y2Var = xc2.y2.f534876a;
        android.view.View view = this.f534816a;
        int i17 = this.f534819d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 iconView = this.f534817b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconView, "iconView");
        xc2.o0 cache = this.f534818c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cache, "cache");
        pm0.v.X(new xc2.p1(iconView, z17, i17, view, cache));
    }
}
