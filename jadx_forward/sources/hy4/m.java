package hy4;

/* loaded from: classes5.dex */
public class m {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f367703d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f367704e;

    /* renamed from: a, reason: collision with root package name */
    public final hy4.k f367700a = new hy4.k(this, null);

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f367701b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f367702c = new p012xc85e97e9.p093xedfae76a.j0();

    /* renamed from: f, reason: collision with root package name */
    public hy4.l f367705f = hy4.l.NONE;

    public void a(java.lang.String str, java.lang.String str2) {
        this.f367703d = str2;
        this.f367704e = str;
        this.f367705f = hy4.l.LOADING;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String b17 = com.p314xaae8f345.mm.p947xba6de98f.i2.b("vestacountavatar", currentTimeMillis, c01.z1.g().d1(), java.lang.String.valueOf(currentTimeMillis));
        ((java.util.HashMap) this.f367701b).put(b17 == null ? "" : b17, str);
        dn.m mVar = new dn.m();
        mVar.f323318d = "task_VestImgUploadEngine";
        mVar.f323320f = this.f367700a;
        mVar.f69601xaca5bdda = b17;
        mVar.f69595x6d25b0d9 = str;
        mVar.f69592xf1ebe47b = 20321;
        mVar.f69609xd84b8349 = 1;
        mVar.f69606xccdbf540 = true;
        mVar.f69597x853bb235 = false;
        mVar.f69580x454032b6 = 200;
        mVar.f69584x89a4c0cf = 2;
        if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VestImgUploadEngine", "hy: cdntra addSendTask failed. clientid:%s", b17);
        this.f367705f = hy4.l.FAIL;
    }
}
