package bp5;

/* loaded from: classes14.dex */
public final class d implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp5.f f23455d;

    public d(bp5.f fVar) {
        this.f23455d = fVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        if (kotlin.jvm.internal.o.b((uo5.j) obj, uo5.g.f429719a)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MediaCodecEncoderWrapper", "need recreate");
            this.f23455d.f23460f = true;
        }
        return jz5.f0.f302826a;
    }
}
