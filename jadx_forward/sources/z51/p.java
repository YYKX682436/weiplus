package z51;

/* loaded from: classes10.dex */
public final class p extends z51.x {

    /* renamed from: f, reason: collision with root package name */
    public android.widget.FrameLayout f551732f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 f551733g;

    /* renamed from: h, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f551734h;

    /* renamed from: i, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f551735i;

    /* renamed from: j, reason: collision with root package name */
    public y51.d f551736j;

    /* renamed from: k, reason: collision with root package name */
    public a61.c f551737k;

    /* renamed from: l, reason: collision with root package name */
    public a61.d f551738l;

    /* renamed from: m, reason: collision with root package name */
    public y51.e f551739m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f551740n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f551741o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f551742p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(y51.a pcContext) {
        super(pcContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pcContext, "pcContext");
    }

    @Override // z51.x
    public java.lang.String c() {
        return "MicroMsg.LivePhotoTPPlayerViewPc";
    }

    @Override // z51.x
    public void d(a61.a config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        super.d(config);
        a61.c cVar = config.f83251b;
        this.f551737k = cVar;
        this.f551738l = config.f83250a;
        this.f551740n = cVar.f83253b;
        if (cVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sourceConfig");
            throw null;
        }
        this.f551736j = cVar.f83256e;
        f("init isParsed " + this.f551740n);
    }

    @Override // z51.x
    public void h() {
        f("pausePlay isBitmapLoadFinish: " + this.f551742p + " isParseFinish: " + this.f551740n + " isPlaying: " + k());
        this.f551741o = true;
        if (k()) {
            ((z51.g) a(z51.g.class)).k();
            com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 c18697xb57c3465 = this.f551733g;
            if (c18697xb57c3465 != null) {
                c18697xb57c3465.mo69303x360802();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tpPlayerView");
                throw null;
            }
        }
    }

    @Override // z51.x
    public void i() {
        boolean k17 = k();
        if (k17) {
            g("go to play but isPlaying to return");
            return;
        }
        f("startPlay parseFinish: " + this.f551740n + " isPause: " + this.f551741o + " isBitmapLoadFinish: " + this.f551742p + " isPlaying: " + k17);
        boolean z17 = false;
        this.f551741o = false;
        boolean z18 = this.f551740n;
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f551769c;
        if (!z18) {
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f551734h;
            if (r2Var != null && r2Var.a()) {
                z17 = true;
            }
            if (z17) {
                g("waitParseJob is active return");
                return;
            } else {
                this.f551734h = p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new z51.m(this, null), 3, null);
                return;
            }
        }
        boolean z19 = ((z51.c) a(z51.c.class)).f551709h;
        f("parsed finish case >> parseIsSuccess: " + z19);
        if (z19) {
            if (!this.f551742p) {
                this.f551735i = p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new z51.o(this, null), 3, null);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 c18697xb57c3465 = this.f551733g;
            if (c18697xb57c3465 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tpPlayerView");
                throw null;
            }
            a61.c cVar = this.f551737k;
            if (cVar != null) {
                c18697xb57c3465.mo69327xab3268fe(cVar.f83254c);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sourceConfig");
                throw null;
            }
        }
    }

    @Override // z51.x
    public void j() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f551734h;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f551735i;
        if (r2Var2 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 c18697xb57c3465 = this.f551733g;
        if (c18697xb57c3465 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tpPlayerView");
            throw null;
        }
        c18697xb57c3465.mo69303x360802();
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 c18697xb57c34652 = this.f551733g;
        if (c18697xb57c34652 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tpPlayerView");
            throw null;
        }
        c18697xb57c34652.mo69312x3f5eee52();
        super.j();
    }

    public final boolean k() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 c18697xb57c3465 = this.f551733g;
        if (c18697xb57c3465 != null) {
            return c18697xb57c3465.mo69311xc00617a4();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tpPlayerView");
        throw null;
    }
}
