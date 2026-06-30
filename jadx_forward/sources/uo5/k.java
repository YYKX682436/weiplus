package uo5;

/* loaded from: classes5.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.media.MediaCodec f511255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f511256e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.media.MediaCodec mediaCodec, int i17) {
        super(1);
        this.f511255d = mediaCodec;
        this.f511256e = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        uo5.o it = (uo5.o) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f511255d.queueInputBuffer(this.f511256e, 0, it.f511270a, it.f511271b, 0);
        return jz5.f0.f384359a;
    }
}
