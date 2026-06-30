package tz2;

/* loaded from: classes14.dex */
public class k implements h72.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f504833a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tz2.j f504834b;

    public k(tz2.j jVar, long j17) {
        this.f504834b = jVar;
        this.f504833a = j17;
    }

    @Override // h72.r
    public void a(java.lang.String str) {
        long j17 = this.f504834b.f504819c;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerRecorder", "hy: video release done. using: %d ms. file path: %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j17), str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && com.p314xaae8f345.mm.vfs.w6.j(str)) {
            return;
        }
        this.f504834b.f504823g = new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1406x7643c6b5.C13519x2c4403b8.class);
        this.f504834b.f504823g.putExtra("key_video_file_name", str);
        this.f504834b.f504823g.putExtra("k_bio_id", this.f504833a);
        tz2.j jVar = this.f504834b;
        jVar.f504823g.putExtra("key_face_type", jVar.f504828l);
        tz2.j jVar2 = this.f504834b;
        jVar2.f504823g.putExtra("key_app_id", jVar2.f504820d);
        tz2.j jVar3 = this.f504834b;
        jVar3.f504823g.putExtra("k_ticket", jVar3.f504821e);
        tz2.j jVar4 = this.f504834b;
        jVar4.f504823g.putExtra("request_verify_pre_info", jVar4.f504822f);
        tz2.j jVar5 = this.f504834b;
        jVar5.f504823g.putExtra("key_video_upload_type", jVar5.f504829m);
        synchronized (this) {
            tz2.j jVar6 = this.f504834b;
            jVar6.f504818b = false;
            java.lang.Runnable runnable = jVar6.f504825i;
            if (runnable == null) {
                return;
            }
            runnable.run();
            this.f504834b.f504825i = null;
        }
    }
}
