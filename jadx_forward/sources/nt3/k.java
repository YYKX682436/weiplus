package nt3;

/* loaded from: classes10.dex */
public final class k extends fs0.g {
    public final boolean A;
    public final yz5.p B;
    public final nt3.f0 C;
    public final nt3.f D;
    public long E;
    public final long F;
    public boolean G;
    public yz5.l H;
    public yz5.p I;

    /* renamed from: J, reason: collision with root package name */
    public java.nio.ByteBuffer f421325J;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.ArrayList f421326x;

    /* renamed from: y, reason: collision with root package name */
    public final int f421327y;

    /* renamed from: z, reason: collision with root package name */
    public final int f421328z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.util.ArrayList imageList, long j17, long j18, hs0.a aVar, android.view.Surface surface, int i17, int i18, boolean z17, int i19, yz5.p pVar) {
        super(j17, j18, aVar, surface, i19, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageList, "imageList");
        this.f421326x = imageList;
        this.f421327y = i17;
        this.f421328z = i18;
        this.A = z17;
        this.B = pVar;
        nt3.f0 f0Var = new nt3.f0();
        this.C = f0Var;
        long j19 = 1000 / 15;
        this.F = j19;
        f0Var.f421317d = j19;
        if (this.f347767d == null && z17) {
            android.media.ImageReader newInstance = android.media.ImageReader.newInstance(i17, i18, 1, 3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(newInstance);
            newInstance.setOnImageAvailableListener(new nt3.g(this), null);
            this.f347767d = newInstance.getSurface();
        }
        nt3.f fVar = new nt3.f(this.f347767d, f0Var);
        this.D = fVar;
        f0Var.f421314a = i17;
        f0Var.f421315b = i18;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecFakeDecoder", "init useX264Encoder width:%s, height:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            if (i17 > 0 && i18 > 0 && this.f421325J == null) {
                this.f421325J = java.nio.ByteBuffer.allocateDirect(i17 * i18 * 4);
            }
        }
        fVar.b();
        fVar.a(new nt3.h(this));
    }

    @Override // fs0.g
    public void c() {
        super.c();
        nt3.f fVar = this.D;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = fVar.f421313f;
        if (n3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Story.GLThread", "stop but handler is null");
        } else {
            n3Var.mo50302x6b17ad39(null);
            fVar.f421313f.mo50293x3498a0(new nt3.e(fVar));
        }
    }

    @Override // fs0.g
    public void d(boolean z17) {
        if (z17) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecFakeDecoder", "requestRender");
        if (this.G) {
            return;
        }
        this.D.a(new nt3.i(this));
    }

    @Override // fs0.g
    public void e() {
        nt3.j jVar = new nt3.j(this);
        nt3.f fVar = this.D;
        fVar.a(jVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecFakeDecoder", "requestRender");
        if (this.G) {
            return;
        }
        fVar.a(new nt3.i(this));
    }
}
