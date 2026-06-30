package aw2;

/* loaded from: classes2.dex */
public final class j0 implements ya2.r1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f14757d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.FinderJumperView f14758e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f14759f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f14760g;

    /* renamed from: h, reason: collision with root package name */
    public r45.ao2 f14761h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.lite.s f14762i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f14763m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f14764n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f14765o;

    public j0(com.tencent.mm.ui.MMActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f14757d = activity;
        com.tencent.mm.plugin.finder.storage.ad0 ad0Var = com.tencent.mm.plugin.finder.storage.ad0.f126402a;
        com.tencent.mm.plugin.finder.view.FinderJumperView finderJumperView = ((java.lang.Boolean) ad0Var.a().r()).booleanValue() ? (com.tencent.mm.plugin.finder.view.FinderJumperView) activity.findViewById(com.tencent.mm.R.id.f486360ur3) : (com.tencent.mm.plugin.finder.view.FinderJumperView) activity.findViewById(com.tencent.mm.R.id.f486359l03);
        this.f14758e = finderJumperView;
        this.f14763m = jz5.h.b(new aw2.g0(this));
        this.f14764n = jz5.h.b(new aw2.i0(this));
        this.f14765o = jz5.h.b(new aw2.h0(this));
        java.lang.String string = activity.getString(com.tencent.mm.R.string.evz);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        finderJumperView.setDefaultTitle(string);
        finderJumperView.setDefaultIconId(com.tencent.mm.R.raw.icons_outlined_music_finder);
        finderJumperView.setFilledIconId(com.tencent.mm.R.raw.icons_filled_music_finder);
        finderJumperView.setOnClickListener(new aw2.d0(this));
        if (((java.lang.Boolean) ad0Var.a().r()).booleanValue()) {
            int dimension = (int) activity.getResources().getDimension(com.tencent.mm.R.dimen.f479706d1);
            int dimension2 = (int) activity.getResources().getDimension(com.tencent.mm.R.dimen.f479693cs);
            android.view.View findViewById = finderJumperView.findViewById(com.tencent.mm.R.id.f483719kk1);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            com.tencent.mm.ui.kk.e(findViewById, dimension);
            android.view.ViewGroup.LayoutParams layoutParams = finderJumperView.findViewById(com.tencent.mm.R.id.buj).getLayoutParams();
            layoutParams.width = dimension2;
            layoutParams.height = dimension2;
        }
    }
}
