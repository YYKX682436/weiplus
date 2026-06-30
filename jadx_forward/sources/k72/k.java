package k72;

/* loaded from: classes14.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f386259a;

    /* renamed from: b, reason: collision with root package name */
    public int f386260b;

    /* renamed from: c, reason: collision with root package name */
    public int f386261c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f386262d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f386263e;

    /* renamed from: f, reason: collision with root package name */
    public int f386264f;

    /* renamed from: g, reason: collision with root package name */
    public int f386265g;

    /* renamed from: h, reason: collision with root package name */
    public int f386266h;

    /* renamed from: i, reason: collision with root package name */
    public int f386267i;

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.PoseDetectOnFrame f386268j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f386269k = false;

    public k(k72.h hVar) {
    }

    public void a(byte[] bArr, android.hardware.Camera camera) {
        if (this.f386269k && com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.m121319xf1fe8a38()) {
            int m121251x2df20051 = com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27959xb3654810.m121251x2df20051(this.f386259a, this.f386260b, 1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.e.wi();
            com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.FaceStatus[] m121330x4e80e5a5 = com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.m121322x9cf0d20b().m121330x4e80e5a5(bArr, this.f386266h, this.f386267i, m121251x2df20051, null);
            if (m121330x4e80e5a5 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceActionLogic", "No face");
                return;
            }
            vz2.c.l("faceRecognized");
            com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.FaceStatus faceStatus = m121330x4e80e5a5[0];
            if (com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.m121358xd7250c55()) {
                if (faceStatus == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceActionLogic", "Detecting result：out of rect");
                    this.f386263e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c7l);
                    return;
                }
                com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27961xf8ea1f79.m121262x973e0932(faceStatus.f62630x5d4ea43d);
                com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.PoseDetectOnFrame poseDetectOnFrame = this.f386268j;
                if (poseDetectOnFrame != null) {
                    com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.m121361x2c993a94(faceStatus.xys, faceStatus.f62630x5d4ea43d, this.f386261c, bArr, camera, faceStatus.f62629x65bc340, faceStatus.yaw, faceStatus.f62631x35807d, poseDetectOnFrame, 0);
                }
            }
        }
    }
}
