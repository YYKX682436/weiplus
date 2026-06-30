package h34;

/* loaded from: classes15.dex */
public class c implements tl.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h34.f f360022a;

    public c(h34.f fVar) {
        this.f360022a = fVar;
    }

    @Override // tl.c
    public void a(int i17, int i18) {
    }

    @Override // tl.c
    public void b(byte[] bArr, int i17) {
        h34.f fVar;
        fp.j jVar = new fp.j();
        synchronized (this.f360022a.f360045n) {
            if (this.f360022a.f360042h == 408) {
                com.p314xaae8f345.p2890x4f7fd00.C25301x6ac8ff91.m93509xaf3daf77(bArr, i17);
            } else {
                com.p314xaae8f345.p2890x4f7fd00.C25301x6ac8ff91.m93508x74dc5e35(bArr, i17);
            }
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f360022a.f360053v;
        jVar.a();
        if (currentTimeMillis > (this.f360022a.f360054w * 3000) + 4000) {
            byte[] bArr2 = new byte[com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb];
            fp.j jVar2 = new fp.j();
            int m93505x9890714c = this.f360022a.f360042h == 408 ? com.p314xaae8f345.p2890x4f7fd00.C25301x6ac8ff91.m93505x9890714c(bArr2) : com.p314xaae8f345.p2890x4f7fd00.C25301x6ac8ff91.m93504x662f914a(bArr2);
            int i18 = this.f360022a.f360050s;
            jVar2.a();
            if (m93505x9890714c >= 10240 || m93505x9890714c <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MusicFingerPrintRecorder", "QAFPGetAudioFingerPrint clientid:%d  out ret:%d  !stop record now", java.lang.Integer.valueOf(this.f360022a.f360050s), java.lang.Integer.valueOf(m93505x9890714c));
                this.f360022a.b();
                return;
            }
            synchronized (this.f360022a.f360038d) {
                java.lang.System.arraycopy(bArr2, 0, this.f360022a.f360038d, 0, m93505x9890714c);
                fVar = this.f360022a;
                fVar.f360039e = m93505x9890714c;
                fVar.f360049r = fVar.f360054w >= 3;
                fVar.f360040f = (int) (currentTimeMillis / 1000);
            }
            gm0.j1.e().j(new h34.e(fVar));
            this.f360022a.f360054w++;
        }
        h34.f fVar2 = this.f360022a;
        if (fVar2.f360049r) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MusicFingerPrintRecorder", "client:%d stop now! duration:%d  ", java.lang.Integer.valueOf(fVar2.f360050s), java.lang.Long.valueOf(currentTimeMillis));
            this.f360022a.b();
        }
    }
}
