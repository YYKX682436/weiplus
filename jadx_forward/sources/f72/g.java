package f72;

/* loaded from: classes14.dex */
public class g implements h72.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f341576a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f72.h f341577b;

    public g(f72.h hVar, long j17) {
        this.f341577b = hVar;
        this.f341576a = j17;
    }

    @Override // h72.r
    public void a(java.lang.String str) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectServiceControllerMp", "hy: video release done. using: %d ms. file path: %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - this.f341576a), str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1406x7643c6b5.C13519x2c4403b8.class);
        intent.putExtra("key_video_file_name", str);
        f72.h hVar = this.f341577b;
        intent.putExtra("k_bio_id", hVar.f341578a);
        intent.putExtra("key_app_id", hVar.f341579b);
        j45.l.A(intent);
    }
}
