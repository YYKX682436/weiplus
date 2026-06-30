package pf2;

/* loaded from: classes10.dex */
public final class a implements pf2.b {

    /* renamed from: a, reason: collision with root package name */
    public final oh2.f f435341a;

    public a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f435341a = new oh2.f(context);
    }

    @Override // pf2.b
    public void a(android.graphics.Canvas canvas, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        this.f435341a.g(canvas, i17, i18, null);
    }

    @Override // pf2.b
    public void b(my5.a lyric) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lyric, "lyric");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HorizontalLyricsRenderer", "bindLyrics: size=" + lyric.b());
        this.f435341a.a(lyric);
    }

    @Override // pf2.b
    public void c(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HorizontalLyricsRenderer", "setTextColors: normal=" + i17 + ", highlight=" + i18);
        this.f435341a.j(i17, i18);
    }

    @Override // pf2.b
    public void d(nf2.j1 alignment) {
        oh2.e eVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(alignment, "alignment");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HorizontalLyricsRenderer", "setHorizontalAlignment: " + alignment);
        int ordinal = alignment.ordinal();
        if (ordinal == 0) {
            eVar = oh2.e.f426899d;
        } else if (ordinal == 1) {
            eVar = oh2.e.f426900e;
        } else {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            eVar = oh2.e.f426901f;
        }
        oh2.f fVar = this.f435341a;
        fVar.getClass();
        if (fVar.f426904y != eVar) {
            fVar.f426904y = eVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNormalRoomHorizontalLyricsDrawer", "setHorizontalAlignment: " + eVar);
        }
    }

    @Override // pf2.b
    /* renamed from: release */
    public void mo158338x41012807() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HorizontalLyricsRenderer", "release");
    }

    @Override // pf2.b
    /* renamed from: reset */
    public void mo158339x6761d4f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HorizontalLyricsRenderer", "reset");
        this.f435341a.h();
    }
}
