package pf2;

/* loaded from: classes10.dex */
public final class c implements pf2.b {

    /* renamed from: a, reason: collision with root package name */
    public final oh2.h f435342a;

    public c(android.content.Context context, java.lang.String rotateCharsPattern) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rotateCharsPattern, "rotateCharsPattern");
        this.f435342a = new oh2.h(context, rotateCharsPattern);
    }

    @Override // pf2.b
    public void a(android.graphics.Canvas canvas, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        this.f435342a.g(canvas, i17, i18, null);
    }

    @Override // pf2.b
    public void b(my5.a lyric) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lyric, "lyric");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VerticalLyricsRenderer", "bindLyrics: size=" + lyric.b());
        this.f435342a.a(lyric);
    }

    @Override // pf2.b
    public void c(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VerticalLyricsRenderer", "setTextColors: normal=" + i17 + ", highlight=" + i18);
        this.f435342a.j(i17, i18);
    }

    @Override // pf2.b
    /* renamed from: release */
    public void mo158338x41012807() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VerticalLyricsRenderer", "release");
    }

    @Override // pf2.b
    /* renamed from: reset */
    public void mo158339x6761d4f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VerticalLyricsRenderer", "reset");
        this.f435342a.h();
    }
}
