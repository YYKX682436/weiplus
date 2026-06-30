package tz2;

/* loaded from: classes14.dex */
public class j {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f504820d;

    /* renamed from: g, reason: collision with root package name */
    public android.content.Intent f504823g;

    /* renamed from: j, reason: collision with root package name */
    public android.hardware.Camera.Parameters f504826j;

    /* renamed from: k, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f504827k;

    /* renamed from: a, reason: collision with root package name */
    public boolean f504817a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f504818b = false;

    /* renamed from: c, reason: collision with root package name */
    public long f504819c = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f504821e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f504822f = "";

    /* renamed from: h, reason: collision with root package name */
    public boolean f504824h = false;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Runnable f504825i = null;

    /* renamed from: l, reason: collision with root package name */
    public int f504828l = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f504829m = 0;

    public void a(android.content.Intent intent, int i17) {
        this.f504817a = intent.getBooleanExtra("needVideo", false);
        h72.s.e().f361007h = this.f504817a;
        this.f504820d = intent.getStringExtra("appId");
        this.f504821e = intent.getStringExtra("k_ticket");
        this.f504822f = intent.getStringExtra("request_verify_pre_info");
        this.f504829m = intent.getIntExtra("key_video_upload_type", 0);
        this.f504828l = i17;
        this.f504827k = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("face_video_upload_req_handler");
        if (i17 == 0) {
            this.f504824h = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerRecorder", "needVideo %s,mAppId %s acceptVoiceFromOutSide:%s", java.lang.Boolean.valueOf(this.f504817a), this.f504820d, java.lang.Boolean.valueOf(this.f504824h));
    }

    public void b(android.hardware.Camera.Parameters parameters) {
        if (this.f504817a) {
            try {
                boolean z17 = this.f504829m == 1;
                this.f504826j = parameters;
                int i17 = parameters.getInt("rotation");
                java.lang.String[] split = parameters.get("preview-size").split("x");
                h72.s.e().g(i17, java.lang.Integer.parseInt(split[0]), java.lang.Integer.parseInt(split[1]), false, 0, java.lang.Integer.parseInt(split[0]), java.lang.Integer.parseInt(split[1]), this.f504824h, z17);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public void c() {
        if (!this.f504817a || this.f504826j == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerRecorder", "resetRecord");
        if (this.f504817a && h72.s.e().h()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerRecorder", "releaseRecord");
            h72.s.e().d();
        }
        b(this.f504826j);
    }

    public void d() {
        if (this.f504823g != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerRecorder", "sendRequestUploadVideo");
            j45.l.A(this.f504823g);
            this.f504823g = null;
        }
    }

    public void e() {
        if (!this.f504817a || h72.s.e().h()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerRecorder", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.d3.f33784x24728b);
        h72.s.e().k();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f504819c = android.os.SystemClock.elapsedRealtime();
    }

    public void f(long j17) {
        if (this.f504817a && h72.s.e().h()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerRecorder", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.l3.f33808x24728b);
            synchronized (this) {
                this.f504818b = true;
            }
            h72.s.e().l(new tz2.k(this, j17));
        }
    }
}
