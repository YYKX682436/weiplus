package fn2;

/* loaded from: classes10.dex */
public final class x1 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final sf2.d3 f345972d;

    /* renamed from: e, reason: collision with root package name */
    public final int f345973e;

    /* renamed from: f, reason: collision with root package name */
    public final fn2.u1 f345974f;

    /* renamed from: g, reason: collision with root package name */
    public final fn2.v1 f345975g;

    /* renamed from: h, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f345976h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f345977i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f345978m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(android.content.Context context, sf2.d3 controller, int i17, fn2.u1 sourceScene, fn2.v1 tabType, p3325xe03a0797.p3326xc267989b.y0 y0Var, java.lang.String str) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceScene, "sourceScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabType, "tabType");
        this.f345972d = controller;
        this.f345973e = i17;
        this.f345974f = sourceScene;
        this.f345975g = tabType;
        this.f345976h = y0Var;
        this.f345977i = str;
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570537ec5, (android.view.ViewGroup) this, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUnifiedSongTabView", "TabView created for tabType: " + tabType);
    }
}
