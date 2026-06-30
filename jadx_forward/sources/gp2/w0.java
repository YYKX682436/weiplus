package gp2;

/* loaded from: classes10.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f355872a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f355873b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f355874c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f355875d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f355876e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f355877f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f355878g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f355879h;

    public w0(android.view.View view, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f355872a = z17;
        this.f355873b = view.findViewById(com.p314xaae8f345.mm.R.id.a7s);
        this.f355874c = view.findViewById(com.p314xaae8f345.mm.R.id.f567065i02);
        this.f355875d = view.findViewById(com.p314xaae8f345.mm.R.id.f567066i03);
        this.f355876e = view.findViewById(com.p314xaae8f345.mm.R.id.f567067i04);
        this.f355877f = view.findViewById(com.p314xaae8f345.mm.R.id.m3f);
        this.f355878g = view.findViewById(com.p314xaae8f345.mm.R.id.m3g);
        this.f355879h = view.findViewById(com.p314xaae8f345.mm.R.id.m3h);
    }

    public final boolean a() {
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_SQUARE_AUDIO_TIPS_COUNT_INT_SYNC;
        int r17 = c17.r(u3Var, 10);
        gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(r17 - 1));
        return r17 >= 0;
    }
}
