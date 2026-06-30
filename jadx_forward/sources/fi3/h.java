package fi3;

/* loaded from: classes10.dex */
public class h implements fi3.a {

    /* renamed from: a, reason: collision with root package name */
    public fi3.p f344537a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f344538b = null;

    /* renamed from: c, reason: collision with root package name */
    public boolean f344539c = false;

    /* renamed from: d, reason: collision with root package name */
    public int f344540d = 0;

    /* renamed from: e, reason: collision with root package name */
    public double f344541e;

    @Override // fi3.a
    public android.graphics.Point a() {
        return new android.graphics.Point(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16537x7c20fff9.m66883x10c4f07(), com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16537x7c20fff9.m66881xd8f702bc());
    }

    @Override // fi3.a
    public void b(fi3.p pVar) {
        this.f344537a = pVar;
    }

    @Override // fi3.a
    public void c(int i17) {
        this.f344541e = i17;
    }

    @Override // fi3.a
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FFMpegTranscodeDecoder", "startDecodeBlockLoop");
        this.f344539c = true;
        this.f344540d = 0;
        while (this.f344539c) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            android.os.SystemClock.elapsedRealtime();
            this.f344538b = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16537x7c20fff9.m66879xf4ce344b(this.f344538b);
            android.os.SystemClock.elapsedRealtime();
            boolean m66877x32fcc779 = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16537x7c20fff9.m66877x32fcc779();
            int i17 = this.f344540d + 1;
            this.f344540d = i17;
            fi3.p pVar = this.f344537a;
            if (pVar != null) {
                byte[] bArr = this.f344538b;
                pVar.a(bArr, bArr == null || m66877x32fcc779, (long) (i17 * this.f344541e * 1000.0d));
            }
            if (this.f344538b == null || m66877x32fcc779) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FFMpegTranscodeDecoder", "ret buffer is null or reachEnd? %s", java.lang.Boolean.valueOf(m66877x32fcc779));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FFMpegTranscodeDecoder", "decode finish, frame count: %s", java.lang.Integer.valueOf(this.f344540d));
                this.f344539c = false;
                return;
            }
        }
    }

    @Override // fi3.a
    public int e() {
        return 2;
    }

    @Override // fi3.a
    public int f(java.lang.String str, long j17, long j18, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FFMpegTranscodeDecoder", "initDecoder, srcFilePath: %s, start: %s, end: %s, videoFps: %s", str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(i17));
        this.f344541e = 1000.0d / i17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return -1;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int m66885x5ea468a7 = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16537x7c20fff9.m66885x5ea468a7(str, j17 * 1000.0d, j18 * 1000.0d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FFMpegTranscodeDecoder", "ffmpegOpenAndSeekFile used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        return m66885x5ea468a7;
    }
}
