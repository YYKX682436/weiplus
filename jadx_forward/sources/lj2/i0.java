package lj2;

/* loaded from: classes3.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f400397a;

    /* renamed from: b, reason: collision with root package name */
    public final lj2.v0 f400398b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f400399c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f400400d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.PopupWindow f400401e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f400402f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f400403g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f400404h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f400405i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f400406j;

    public i0(android.content.Context context, lj2.v0 pluginAbility, yz5.a keyBlock) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyBlock, "keyBlock");
        this.f400397a = context;
        this.f400398b = pluginAbility;
        this.f400399c = keyBlock;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570485ds2, (android.view.ViewGroup) null);
        this.f400400d = inflate;
        this.f400401e = new android.widget.PopupWindow(inflate, -1, -2, false);
        this.f400402f = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.rmt);
        this.f400403g = inflate.findViewById(com.p314xaae8f345.mm.R.id.rmu);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.rmv);
        this.f400404h = findViewById;
        findViewById.setOnClickListener(new lj2.d0(this));
    }
}
