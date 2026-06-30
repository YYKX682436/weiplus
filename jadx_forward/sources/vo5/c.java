package vo5;

/* loaded from: classes14.dex */
public final class c implements uo5.p {

    /* renamed from: a, reason: collision with root package name */
    public final int f520248a;

    /* renamed from: b, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f520249b;

    /* renamed from: c, reason: collision with root package name */
    public final jo5.l f520250c;

    /* renamed from: d, reason: collision with root package name */
    public final u26.w f520251d;

    /* renamed from: e, reason: collision with root package name */
    public int f520252e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f520253f;

    public c(int i17, p3325xe03a0797.p3326xc267989b.y0 decodeScope, jo5.l lVar, u26.w dataChannel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(decodeScope, "decodeScope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataChannel, "dataChannel");
        this.f520248a = i17;
        this.f520249b = decodeScope;
        this.f520250c = lVar;
        this.f520251d = dataChannel;
    }

    @Override // uo5.p
    public void a(java.nio.ByteBuffer buffer, android.media.MediaCodec.BufferInfo info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
    }

    @Override // uo5.p
    public void b(java.nio.ByteBuffer buffer, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3325xe03a0797.p3326xc267989b.l.d(this.f520249b, null, null, new vo5.b(this, callback, buffer, null), 3, null);
    }

    @Override // uo5.p
    public void c(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.m mVar;
        jo5.l lVar = this.f520250c;
        if (lVar == null || (mVar = lVar.f382492a) == null) {
            return;
        }
        mVar.X0(this.f520248a, i17, i18);
    }
}
