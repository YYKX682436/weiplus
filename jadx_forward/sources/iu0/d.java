package iu0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f376335a;

    /* renamed from: b, reason: collision with root package name */
    public volatile int f376336b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f376337c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f376338d = new android.os.Handler(android.os.Looper.getMainLooper());

    public static final void a(iu0.d dVar, java.lang.String str, iu0.a aVar, int i17, int i18, java.lang.String str2) {
        if (dVar.f376337c) {
            return;
        }
        dVar.f376336b++;
        if (dVar.f376336b > 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MJCC.CdnUpload", "maybeRetry: max retry count reached (3), giving up");
            ((p3325xe03a0797.p3326xc267989b.r) ((gu0.i2) aVar).f357236a).s(null, gu0.g2.f357216d);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.CdnUpload", "maybeRetry: scheduling retry #" + dVar.f376336b + " after 2000ms");
            dVar.f376338d.postDelayed(new iu0.c(dVar, str, aVar), 2000L);
        }
    }

    public final void b() {
        this.f376337c = true;
        this.f376338d.removeCallbacksAndMessages(null);
        java.lang.String str = this.f376335a;
        if (str != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.CdnUpload", "cancel: taskId=".concat(str));
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(this.f376335a);
        }
        this.f376335a = null;
    }

    public final void c(java.lang.String str, iu0.a aVar) {
        if (this.f376337c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MJCC.CdnUpload", "upload cancelled, skip");
            return;
        }
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(str);
        gu0.g2 g2Var = gu0.g2.f357216d;
        if (!j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.CdnUpload", "uploadZip: file not exist, path=" + str);
            ((p3325xe03a0797.p3326xc267989b.r) ((gu0.i2) aVar).f357236a).s(null, g2Var);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cc-upload-");
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes()));
        sb6.append('-');
        sb6.append(java.lang.System.currentTimeMillis());
        java.lang.String sb7 = sb6.toString();
        this.f376335a = sb7;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.CdnUpload", "doUpload: start, path=" + str + ", mediaId=" + sb7 + ", fileSize=" + com.p314xaae8f345.mm.vfs.w6.k(str) + ", retryCount=" + this.f376336b);
        dn.m mVar = new dn.m();
        mVar.f323318d = "CDN_TASK_ComposingCreationUpload";
        mVar.f323320f = new iu0.b(this, str, aVar);
        mVar.f69601xaca5bdda = sb7;
        mVar.f69584x89a4c0cf = 3;
        mVar.f69580x454032b6 = 251;
        mVar.f69592xf1ebe47b = 20303;
        mVar.f69595x6d25b0d9 = str;
        mVar.f69606xccdbf540 = true;
        mVar.f69609xd84b8349 = 2;
        mVar.A = 120;
        mVar.B = 300;
        if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.CdnUpload", "doUpload: addSendTask success");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.CdnUpload", "doUpload: addSendTask failed");
        this.f376335a = null;
        ((p3325xe03a0797.p3326xc267989b.r) ((gu0.i2) aVar).f357236a).s(null, g2Var);
    }
}
