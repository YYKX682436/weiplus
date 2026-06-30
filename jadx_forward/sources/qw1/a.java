package qw1;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f448601a;

    /* renamed from: b, reason: collision with root package name */
    public final java.nio.ByteBuffer f448602b;

    /* renamed from: c, reason: collision with root package name */
    public final long f448603c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f448604d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f448605e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qw1.b f448606f;

    public a(qw1.b bVar, byte[] bArr, java.nio.ByteBuffer byteBuffer, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        bArr = (i17 & 1) != 0 ? null : bArr;
        byteBuffer = (i17 & 2) != 0 ? null : byteBuffer;
        this.f448606f = bVar;
        this.f448601a = bArr;
        this.f448602b = byteBuffer;
        this.f448603c = java.lang.System.currentTimeMillis();
        this.f448604d = true;
    }

    public final synchronized void a() {
        if (this.f448605e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.BufferManager", "already recyclered");
            return;
        }
        this.f448605e = true;
        this.f448604d = false;
        byte[] bArr = this.f448601a;
        if (bArr != null) {
            this.f448606f.a(bArr);
        } else {
            java.nio.ByteBuffer byteBuffer = this.f448602b;
            if (byteBuffer != null) {
                this.f448606f.b(byteBuffer);
            }
        }
    }
}
