package bp5;

/* loaded from: classes14.dex */
public final class f implements bp5.h, java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f23458d;

    /* renamed from: e, reason: collision with root package name */
    public final uo5.q f23459e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23460f;

    /* renamed from: g, reason: collision with root package name */
    public kotlinx.coroutines.r2 f23461g;

    public f(kotlinx.coroutines.y0 coroutineScope, uo5.q codec) {
        kotlin.jvm.internal.o.g(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.o.g(codec, "codec");
        this.f23458d = coroutineScope;
        this.f23459e = codec;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecEncoderWrapper", "close");
        uo5.l lVar = (uo5.l) this.f23459e;
        com.tencent.mars.xlog.Log.i(lVar.f429726c, "stopWorking");
        lVar.a();
        kotlinx.coroutines.r2 r2Var = this.f23461g;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f23461g = null;
    }

    @Override // bp5.h
    public boolean getNeedRecreate() {
        return this.f23460f;
    }

    @Override // bp5.h
    /* renamed from: getRenderSize */
    public android.util.Size getSize() {
        return ((uo5.l) this.f23459e).f429734k;
    }

    @Override // bp5.h
    public java.lang.Object getRenderTarget() {
        uo5.l lVar = (uo5.l) this.f23459e;
        if (kotlin.jvm.internal.o.b(((kotlinx.coroutines.flow.l2) kotlinx.coroutines.flow.l.b(lVar.f429727d)).getValue(), uo5.i.f429721a)) {
            return lVar.f429728e;
        }
        return null;
    }

    @Override // bp5.h
    public void setNeedRecreate(boolean z17) {
        this.f23460f = z17;
    }
}
