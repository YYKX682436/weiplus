package h61;

/* loaded from: classes9.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final h61.g f360678a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f360679b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f360680c;

    /* renamed from: d, reason: collision with root package name */
    public final long f360681d;

    /* renamed from: e, reason: collision with root package name */
    public final dn.k f360682e = new h61.f(this);

    public h(java.lang.String str, h61.g gVar) {
        this.f360681d = 0L;
        this.f360681d = java.lang.System.currentTimeMillis();
        this.f360679b = str;
        this.f360678a = gVar;
        java.lang.String g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? "" : kk.k.g(str.getBytes());
        this.f360680c = g17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.AAImagUpload", "AAImagUpload imgPath:%s mediaId:%s", str, g17);
    }

    public boolean a() {
        dn.m mVar = new dn.m();
        mVar.f323318d = "task_AAImagUpload";
        mVar.f323320f = this.f360682e;
        java.lang.String str = this.f360680c;
        mVar.f69601xaca5bdda = str;
        mVar.f69595x6d25b0d9 = this.f360679b;
        mVar.f69619xe9ed65f6 = "";
        mVar.f69592xf1ebe47b = 20301;
        mVar.f69618x114ef53e = "";
        mVar.f69609xd84b8349 = 2;
        mVar.f69606xccdbf540 = true;
        mVar.f69597x853bb235 = false;
        mVar.f69580x454032b6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.cd.f33971x366c91de;
        mVar.f69584x89a4c0cf = 2;
        if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar)) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Aa.AAImagUpload", "cdntra addSendTask failed. mediaId:%s", str);
        return false;
    }
}
