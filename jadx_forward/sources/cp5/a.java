package cp5;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.nio.ByteBuffer f302639a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f302640b;

    /* renamed from: c, reason: collision with root package name */
    public int f302641c;

    /* renamed from: d, reason: collision with root package name */
    public final long f302642d = java.lang.System.currentTimeMillis();

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f302643e = true;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f302644f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cp5.b f302645g;

    public a(cp5.b bVar, java.nio.ByteBuffer byteBuffer, boolean z17) {
        this.f302645g = bVar;
        this.f302639a = byteBuffer;
        this.f302640b = z17;
    }

    public final java.nio.ByteBuffer a() {
        boolean z17;
        if (this.f302645g.f302646d || !this.f302640b || java.lang.System.currentTimeMillis() - this.f302642d <= 200) {
            z17 = this.f302643e;
        } else {
            b();
            z17 = false;
        }
        if (z17) {
            return this.f302639a;
        }
        return null;
    }

    public final synchronized void b() {
        if (!this.f302640b) {
            int i17 = this.f302641c;
            this.f302641c = i17 + 1;
            if (i17 % 50 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.BufferManager", "current byte not allow to recycle");
            }
            return;
        }
        if (this.f302644f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.BufferManager", "already recyclered");
            return;
        }
        this.f302644f = true;
        this.f302643e = false;
        java.nio.ByteBuffer byteBuffer = this.f302639a;
        if (byteBuffer != null) {
            this.f302645g.b(byteBuffer);
        }
    }
}
