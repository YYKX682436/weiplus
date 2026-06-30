package nj3;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f419413a;

    /* renamed from: b, reason: collision with root package name */
    public final java.nio.ByteBuffer f419414b;

    /* renamed from: c, reason: collision with root package name */
    public final int f419415c;

    /* renamed from: d, reason: collision with root package name */
    public final long f419416d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f419417e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f419418f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nj3.b f419419g;

    public a(nj3.b bVar, byte[] bArr, java.nio.ByteBuffer byteBuffer, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        bArr = (i17 & 1) != 0 ? null : bArr;
        byteBuffer = (i17 & 2) != 0 ? null : byteBuffer;
        this.f419419g = bVar;
        this.f419413a = bArr;
        this.f419414b = byteBuffer;
        int i18 = byteBuffer != null ? 1 : 0;
        this.f419415c = i18;
        bVar.f419423g += i18;
        this.f419416d = java.lang.System.currentTimeMillis();
        this.f419417e = true;
    }

    public final synchronized void a() {
        if (this.f419418f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.BufferManager", "already recyclered");
            return;
        }
        this.f419419g.f419423g -= this.f419415c;
        this.f419418f = true;
        this.f419417e = false;
        byte[] bArr = this.f419413a;
        if (bArr != null) {
            this.f419419g.b(bArr);
        } else {
            java.nio.ByteBuffer byteBuffer = this.f419414b;
            if (byteBuffer != null) {
                this.f419419g.c(byteBuffer);
            }
        }
    }
}
