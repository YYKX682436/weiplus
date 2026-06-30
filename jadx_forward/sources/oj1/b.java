package oj1;

/* loaded from: classes4.dex */
public final class b implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427283d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f427284e;

    public b(java.lang.String str, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        this.f427283d = str;
        this.f427284e = abstractActivityC21394xb3d2c0cf;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        java.lang.String uuid = this.f427283d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uuid, "uuid");
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.c(uuid, 5, "{\"errMsg\":\"standaloneFunctionalDirectApi:ok\"}").l();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StandaloneFunctionalDirectApiHandler", "openFeedback: uuid(" + uuid + ") feedback finished");
        this.f427284e.finish();
    }
}
