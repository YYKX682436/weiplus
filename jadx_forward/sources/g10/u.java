package g10;

/* loaded from: classes5.dex */
public final class u implements k10.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g10.v f349084a;

    public u(g10.v vVar) {
        this.f349084a = vVar;
    }

    public void a(java.lang.String error) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(error, "error");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MagicEcsNirvanaFeatureService", "hy: on fail with error: ".concat(error));
        ((ku5.t0) ku5.t0.f394148d).B(new g10.t(error));
    }

    public void b(com.p314xaae8f345.mm.vfs.r6 wspkgFile, java.lang.String bizName, int i17, java.lang.String ecsExt) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wspkgFile, "wspkgFile");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ecsExt, "ecsExt");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "hy: on success with file length: " + com.p314xaae8f345.mm.vfs.w6.k(wspkgFile.o()) + ", bizName: " + bizName);
        m45.b.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ":appbrand1");
        this.f349084a.getClass();
        ((ku5.t0) ku5.t0.f394148d).g(new g10.k(bizName, wspkgFile));
    }
}
