package yz3;

/* loaded from: classes12.dex */
public final class u implements ry3.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ry3.r f550079a;

    public u(ry3.r rVar) {
        this.f550079a = rVar;
    }

    @Override // ry3.r
    public final void a(long j17, ry3.q result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanServiceImpl", "uploadImageForOcr onCallback success: %b, imagePath: %s, reqKey: %s, jumpType: %d", java.lang.Boolean.valueOf(result.f483077b), result.f483081f, result.f483082g, java.lang.Integer.valueOf(result.f483083h));
        ry3.r rVar = this.f550079a;
        if (rVar != null) {
            rVar.a(j17, result);
        }
    }
}
