package n72;

/* loaded from: classes14.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f416790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n72.q f416791e;

    public g(n72.q qVar, android.graphics.SurfaceTexture surfaceTexture) {
        this.f416791e = qVar;
        this.f416790d = surfaceTexture;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            n72.q.a(this.f416791e, this.f416790d);
            n72.q qVar = this.f416791e;
            qVar.e(qVar.P);
            vz2.c.j("openCamera");
        } catch (java.lang.Exception unused) {
            vz2.c.k("openCamera", -1);
            if (this.f416791e.G == 1) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "preview error");
            com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13534x1dc4b4e7 activityC13534x1dc4b4e7 = this.f416791e.f416822x;
            activityC13534x1dc4b4e7.getClass();
            ((ku5.t0) ku5.t0.f394148d).B(new l72.b(activityC13534x1dc4b4e7));
        }
    }
}
