package pl4;

/* loaded from: classes15.dex */
public final class f extends pl4.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pl4.k f438242d;

    public f(pl4.k kVar) {
        this.f438242d = kVar;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoStreamingCallback
    /* renamed from: onDataAvailable */
    public void mo37930x9bb59ea0(java.lang.String str, long j17, long j18) {
        pl4.k kVar = this.f438242d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, kVar.f438251b)) {
            kVar.g();
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoStreamingCallback
    /* renamed from: onMoovReady */
    public void mo37933xe7d268fb(java.lang.String str, long j17, long j18, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingTPResourceLoader", "onMoovReady filekey:" + str + " onProgress offset:" + j17 + ", length:" + j18);
        pl4.k kVar = this.f438242d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, kVar.f438251b)) {
            kVar.f438262m = true;
            kVar.f438266q.execute(new pl4.e(kVar));
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoStreamingCallback
    /* renamed from: onObtainMoovFailed */
    public void mo37935x6e07772a(java.lang.String str, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingTPResourceLoader", "onObtainMoovFailed filekey:" + str + " onProgress reason:" + i17);
        pl4.k kVar = this.f438242d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, kVar.f438251b)) {
            kVar.f438262m = true;
            kVar.b();
            kVar.g();
        }
    }
}
