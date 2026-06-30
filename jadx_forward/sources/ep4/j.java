package ep4;

/* loaded from: classes10.dex */
public final class j extends yt3.a implements bp4.b0, bp4.a0, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: s, reason: collision with root package name */
    public static int f337280s;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f337281f;

    /* renamed from: g, reason: collision with root package name */
    public long f337282g;

    /* renamed from: h, reason: collision with root package name */
    public int f337283h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f337284i;

    /* renamed from: m, reason: collision with root package name */
    public zu3.p f337285m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f337286n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f337287o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Runnable f337288p;

    /* renamed from: q, reason: collision with root package name */
    public final ep4.m f337289q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d f337290r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.view.ViewGroup parent, ju3.d0 status) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f337281f = parent;
        this.f337283h = -1;
        this.f337286n = jz5.h.b(new ep4.h(this));
        jz5.h.b(new ep4.i(this));
        jz5.g b17 = jz5.h.b(new ep4.f(this));
        this.f337287o = jz5.h.b(new ep4.g(this));
        this.f337288p = new ep4.c(this);
        android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a5u, parent, true);
        parent.setOnClickListener(new ep4.a(this));
        ((android.widget.TextView) ((jz5.n) b17).mo141623x754a37bb()).setOnClickListener(new ep4.b(this));
        gm0.j1.n().f354821b.a(5207, this);
        this.f337289q = new ep4.m();
        this.f337290r = d11.s.fj().hj();
    }

    public final void A() {
        ((android.view.ViewGroup) ((jz5.n) this.f337286n).mo141623x754a37bb()).setVisibility(4);
        ((android.view.ViewGroup) ((jz5.n) this.f337287o).mo141623x754a37bb()).setVisibility(0);
        this.f337281f.postDelayed(this.f337288p, 2000L);
        uo4.a.f511207a.b(112L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(zu3.a data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String valueOf = data instanceof zu3.a0 ? java.lang.String.valueOf(((zu3.a0) data).f557297g) : data instanceof zu3.y ? ((zu3.y) data).f557400i : "";
        this.f337285m = data instanceof zu3.p ? (zu3.p) data : null;
        this.f337284i = true;
        ((android.view.ViewGroup) ((jz5.n) this.f337286n).mo141623x754a37bb()).setVisibility(0);
        ((android.view.ViewGroup) ((jz5.n) this.f337287o).mo141623x754a37bb()).setVisibility(4);
        this.f337281f.setVisibility(0);
        ep4.k kVar = new ep4.k(((k40.f) ((l40.e) i95.n0.c(l40.e.class))).aj(), valueOf);
        int i17 = f337280s;
        f337280s = i17 + 1;
        this.f337283h = i17;
        kVar.f337294g = i17;
        gm0.j1.n().f354821b.g(kVar);
        uo4.a.f511207a.b(110L);
    }

    @Override // bp4.b0
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var, long j17, boolean z17) {
        this.f337282g = h1Var != null ? h1Var.g() : 0L;
    }

    @Override // bp4.a0
    public void c(long j17) {
    }

    @Override // bp4.a0
    public void n(bp4.c0 c0Var) {
    }

    @Override // bp4.a0
    /* renamed from: onFinish */
    public void mo10982x42fe6352() {
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof ep4.k) {
            ep4.k kVar = (ep4.k) m1Var;
            if (kVar.f337294g == this.f337283h) {
                this.f337284i = false;
                ((android.view.ViewGroup) ((jz5.n) this.f337286n).mo141623x754a37bb()).setVisibility(4);
                java.lang.String str2 = kVar.f337291d;
                if (i17 != 0 || i18 != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EditorReadPlugin", "tts error, input text:" + str2 + ", errType:" + i17 + ", errCode:" + i18);
                    A();
                    return;
                }
                java.lang.String str3 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.c.b() + '/' + java.util.UUID.randomUUID();
                java.lang.String str4 = str3 + ".tts";
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tts success, input text:");
                sb6.append(str2);
                sb6.append(", speech size:");
                byte[] bArr = kVar.f337295h;
                sb6.append(bArr != null ? java.lang.Integer.valueOf(bArr.length) : null);
                sb6.append(", speech duration:");
                sb6.append(kVar.f337296i);
                sb6.append(", path:");
                sb6.append(str3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorReadPlugin", sb6.toString());
                com.p314xaae8f345.mm.vfs.w6.R(str3, kVar.f337295h);
                p3325xe03a0797.p3326xc267989b.i2 i2Var = p3325xe03a0797.p3326xc267989b.i2.f392010d;
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                p3325xe03a0797.p3326xc267989b.l.d(i2Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new ep4.e(this, str4, m1Var, str3, null), 2, null);
            }
        }
    }

    @Override // yt3.r2
    /* renamed from: release */
    public void mo9065x41012807() {
        gm0.j1.n().f354821b.q(5207, this);
    }

    public final void z() {
        ((android.view.ViewGroup) ((jz5.n) this.f337287o).mo141623x754a37bb()).setVisibility(4);
        android.view.ViewGroup viewGroup = this.f337281f;
        viewGroup.getHandler().removeCallbacks(this.f337288p);
        viewGroup.setVisibility(8);
        ju3.c0 c0Var = ju3.c0.F2;
        ju3.d0 d0Var = this.f546865d;
        ju3.d0.k(d0Var, c0Var, null, 2, null);
        ju3.d0.k(d0Var, ju3.c0.f383447x2, null, 2, null);
    }
}
