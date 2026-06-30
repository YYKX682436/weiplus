package ei3;

/* loaded from: classes10.dex */
public class l0 implements ei3.n {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h f334639a;

    /* renamed from: b, reason: collision with root package name */
    public final float f334640b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f334641c;

    /* renamed from: d, reason: collision with root package name */
    public final int f334642d;

    /* renamed from: e, reason: collision with root package name */
    public final int f334643e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f334644f;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h hVar, java.lang.String str, float f17, int i17, int i18, int i19, boolean z17, boolean z18, boolean z19) {
        this.f334639a = hVar;
        this.f334641c = str;
        this.f334640b = f17;
        this.f334642d = i18;
        this.f334643e = i19;
        this.f334644f = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightMP4Muxer", "create MMSightMP4Muxer, bufId: %s, recordPath: %s, fps: %s, bitrate: %s, videoDuration: %s, audioSampleRate%s, mute: %s, useSoftEncode:%s, enableHevc:%s", java.lang.Integer.valueOf(hVar.f243948a), str, java.lang.Float.valueOf(f17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19));
    }

    public boolean a(boolean z17) {
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.String str = this.f334641c;
        new com.p314xaae8f345.mm.vfs.r6(str).s().J();
        java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.a(str);
        java.lang.String str2 = null;
        try {
            if (!com.p314xaae8f345.mm.vfs.w6.j(a17)) {
                a17 = null;
            }
            str2 = a17;
        } catch (java.lang.Exception unused) {
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightMP4Muxer", "start mux, bufId: %s, aacFile: %s useFFMpeg:%b", java.lang.Integer.valueOf(this.f334639a.f243948a), str2, java.lang.Boolean.valueOf(z17));
        int b17 = this.f334639a.b(this.f334641c, java.lang.Math.max(1000, this.f334642d), this.f334640b, this.f334644f, this.f334643e, 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightMP4Muxer", "mux sight end, duration %ds, used %sms", java.lang.Integer.valueOf(b17), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            try {
                com.p314xaae8f345.mm.vfs.w6.h(str2);
            } catch (java.lang.Exception unused2) {
            }
        }
        return b17 >= 0;
    }
}
