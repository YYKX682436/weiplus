package bp5;

/* loaded from: classes14.dex */
public final class f implements bp5.h, java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f104991d;

    /* renamed from: e, reason: collision with root package name */
    public final uo5.q f104992e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f104993f;

    /* renamed from: g, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f104994g;

    public f(p3325xe03a0797.p3326xc267989b.y0 coroutineScope, uo5.q codec) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coroutineScope, "coroutineScope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codec, "codec");
        this.f104991d = coroutineScope;
        this.f104992e = codec;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecEncoderWrapper", "close");
        uo5.l lVar = (uo5.l) this.f104992e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f511259c, "stopWorking");
        lVar.a();
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f104994g;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f104994g = null;
    }

    @Override // bp5.h
    public boolean getNeedRecreate() {
        return this.f104993f;
    }

    @Override // bp5.h
    /* renamed from: getRenderSize */
    public android.util.Size getSize() {
        return ((uo5.l) this.f104992e).f511267k;
    }

    @Override // bp5.h
    /* renamed from: getRenderTarget */
    public java.lang.Object mo11009x8dd3293d() {
        uo5.l lVar = (uo5.l) this.f104992e;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((p3325xe03a0797.p3326xc267989b.p3328x30012e.l2) p3325xe03a0797.p3326xc267989b.p3328x30012e.l.b(lVar.f511260d)).mo144003x754a37bb(), uo5.i.f511254a)) {
            return lVar.f511261e;
        }
        return null;
    }

    @Override // bp5.h
    /* renamed from: setNeedRecreate */
    public void mo11010xc3db8127(boolean z17) {
        this.f104993f = z17;
    }
}
