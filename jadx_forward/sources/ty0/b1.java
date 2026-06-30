package ty0;

/* loaded from: classes5.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final n0.e5 f504324a;

    /* renamed from: b, reason: collision with root package name */
    public final n0.e5 f504325b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f504326c;

    /* renamed from: d, reason: collision with root package name */
    public final n0.e5 f504327d;

    /* renamed from: e, reason: collision with root package name */
    public final n0.e5 f504328e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f504329f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.p f504330g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.p f504331h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f504332i;

    /* renamed from: j, reason: collision with root package name */
    public final ty0.c f504333j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.Map f504334k;

    /* renamed from: l, reason: collision with root package name */
    public yz5.l f504335l;

    public b1(n0.e5 musicInfoListState, n0.e5 musicInfoState, yz5.l selectMusic, n0.e5 musicMutedState, n0.e5 originMutedState, yz5.a currentLyricInfoGetter, yz5.p setMovieOption, yz5.p switchMovieOption, boolean z17, ty0.c cVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 256) != 0 ? true : z17;
        cVar = (i17 & 512) != 0 ? null : cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicInfoListState, "musicInfoListState");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicInfoState, "musicInfoState");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectMusic, "selectMusic");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicMutedState, "musicMutedState");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originMutedState, "originMutedState");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(currentLyricInfoGetter, "currentLyricInfoGetter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(setMovieOption, "setMovieOption");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(switchMovieOption, "switchMovieOption");
        this.f504324a = musicInfoListState;
        this.f504325b = musicInfoState;
        this.f504326c = selectMusic;
        this.f504327d = musicMutedState;
        this.f504328e = originMutedState;
        this.f504329f = currentLyricInfoGetter;
        this.f504330g = setMovieOption;
        this.f504331h = switchMovieOption;
        this.f504332i = z17;
        this.f504333j = cVar;
        this.f504334k = new java.util.LinkedHashMap();
    }

    /* renamed from: equals */
    public boolean m167198xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty0.b1)) {
            return false;
        }
        ty0.b1 b1Var = (ty0.b1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f504324a, b1Var.f504324a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f504325b, b1Var.f504325b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f504326c, b1Var.f504326c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f504327d, b1Var.f504327d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f504328e, b1Var.f504328e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f504329f, b1Var.f504329f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f504330g, b1Var.f504330g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f504331h, b1Var.f504331h) && this.f504332i == b1Var.f504332i && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f504333j, b1Var.f504333j);
    }

    /* renamed from: hashCode */
    public int m167199x8cdac1b() {
        int hashCode = ((((((((((((((((this.f504324a.hashCode() * 31) + this.f504325b.hashCode()) * 31) + this.f504326c.hashCode()) * 31) + this.f504327d.hashCode()) * 31) + this.f504328e.hashCode()) * 31) + this.f504329f.hashCode()) * 31) + this.f504330g.hashCode()) * 31) + this.f504331h.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f504332i)) * 31;
        ty0.c cVar = this.f504333j;
        return hashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m167200x9616526c() {
        return "MusicState(musicInfoListState=" + this.f504324a + ", musicInfoState=" + this.f504325b + ", selectMusic=" + this.f504326c + ", musicMutedState=" + this.f504327d + ", originMutedState=" + this.f504328e + ", currentLyricInfoGetter=" + this.f504329f + ", setMovieOption=" + this.f504330g + ", switchMovieOption=" + this.f504331h + ", showOrigin=" + this.f504332i + ", reporter=" + this.f504333j + ')';
    }
}
