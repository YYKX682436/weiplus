package wk1;

/* loaded from: classes7.dex */
public class f implements wk1.c {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f528462d = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public boolean f528463a;

    /* renamed from: b, reason: collision with root package name */
    public wk1.d f528464b;

    /* renamed from: c, reason: collision with root package name */
    public java.nio.ByteBuffer f528465c;

    public f(wk1.d dVar) {
        this.f528464b = dVar;
        this.f528465c = java.nio.ByteBuffer.wrap(f528462d);
    }

    @Override // wk1.e
    public java.nio.ByteBuffer a() {
        return this.f528465c;
    }

    @Override // wk1.c
    public void b(java.nio.ByteBuffer byteBuffer) {
        this.f528465c = byteBuffer;
    }

    public void c(wk1.e eVar) {
        java.nio.ByteBuffer a17 = eVar.a();
        if (this.f528465c == null) {
            this.f528465c = java.nio.ByteBuffer.allocate(a17.remaining());
            a17.mark();
            this.f528465c.put(a17);
            a17.reset();
        } else {
            a17.mark();
            java.nio.ByteBuffer byteBuffer = this.f528465c;
            byteBuffer.position(byteBuffer.limit());
            java.nio.ByteBuffer byteBuffer2 = this.f528465c;
            byteBuffer2.limit(byteBuffer2.capacity());
            if (a17.remaining() > this.f528465c.remaining()) {
                java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(a17.remaining() + this.f528465c.capacity());
                this.f528465c.flip();
                allocate.put(this.f528465c);
                allocate.put(a17);
                this.f528465c = allocate;
            } else {
                this.f528465c.put(a17);
            }
            this.f528465c.rewind();
            a17.reset();
        }
        this.f528463a = ((wk1.f) eVar).f528463a;
    }

    /* renamed from: toString */
    public java.lang.String mo174112x9616526c() {
        return "Framedata{ optcode:" + this.f528464b + ", fin:" + this.f528463a + ", payloadlength:[pos:" + this.f528465c.position() + ", len:" + this.f528465c.remaining() + "], payload:" + java.util.Arrays.toString(yk1.c.b(new java.lang.String(this.f528465c.array()))) + "}";
    }

    public f(wk1.e eVar) {
        wk1.f fVar = (wk1.f) eVar;
        this.f528463a = fVar.f528463a;
        this.f528464b = fVar.f528464b;
        this.f528465c = eVar.a();
    }
}
