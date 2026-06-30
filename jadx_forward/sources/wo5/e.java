package wo5;

/* loaded from: classes13.dex */
public final class e implements uo5.p {

    /* renamed from: a, reason: collision with root package name */
    public final to5.c f529854a;

    /* renamed from: b, reason: collision with root package name */
    public final int f529855b;

    /* renamed from: c, reason: collision with root package name */
    public java.nio.ByteBuffer f529856c;

    /* renamed from: d, reason: collision with root package name */
    public final int f529857d;

    /* renamed from: e, reason: collision with root package name */
    public int f529858e;

    public e(to5.c engineOp, boolean z17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(engineOp, "engineOp");
        this.f529854a = engineOp;
        this.f529855b = i17;
        this.f529856c = java.nio.ByteBuffer.allocateDirect(0);
        this.f529857d = z17 ? 19 : 18;
    }

    @Override // uo5.p
    public void a(java.nio.ByteBuffer buffer, android.media.MediaCodec.BufferInfo info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        int i17 = info.flags;
        if (i17 == 2) {
            if (info.size != this.f529856c.capacity()) {
                this.f529856c = java.nio.ByteBuffer.allocateDirect(info.size);
            }
            this.f529856c.clear();
            buffer.clear();
            buffer.position(info.offset);
            buffer.limit(info.offset + info.size);
            this.f529856c.put(buffer);
            return;
        }
        if (i17 == 1) {
            this.f529856c.clear();
            to5.c cVar = this.f529854a;
            java.nio.ByteBuffer spsArray = this.f529856c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(spsArray, "spsArray");
            cVar.a(spsArray, this.f529855b, 2, this.f529857d, wo5.c.f529852d);
        }
        buffer.clear();
        buffer.position(info.offset);
        buffer.limit(info.offset + info.size);
        this.f529854a.a(buffer, this.f529855b, info.flags, this.f529857d, wo5.d.f529853d);
        int i18 = this.f529858e + 1;
        this.f529858e = i18;
        if (i18 % 60 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HW.ILinkVoIPEncodeDataCallbackProxy", "onOutputBufferAvailable: send data " + this.f529858e + " for " + this.f529855b);
        }
    }

    @Override // uo5.p
    public void b(java.nio.ByteBuffer buffer, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        throw new java.lang.RuntimeException("encoder not call this func");
    }

    @Override // uo5.p
    public void c(int i17, int i18) {
    }
}
