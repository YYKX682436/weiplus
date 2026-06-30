package k72;

/* loaded from: classes14.dex */
public class z implements h72.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k72.a0 f386313a;

    public z(k72.a0 a0Var) {
        this.f386313a = a0Var;
    }

    @Override // h72.r
    public void a(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceCheckVideoRecordMgr", "onStop filePath: %s", str);
        ((be0.e) ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(str, true);
        if (d17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceCheckVideoRecordMgr", "face record video size:%sx%s rotate:%s", java.lang.Integer.valueOf(d17.f243917c), java.lang.Integer.valueOf(d17.f243918d), java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544.class)).mo10218x9787f6ed(str)));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(917L, 46L, 1L, false);
        k72.d0 d0Var = this.f386313a.f386236e;
        java.lang.String str2 = d0Var.f386244a;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceCheckVideoRecordMgr", "encryptAndUploadVideoFile: %s", str);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !com.p314xaae8f345.mm.vfs.w6.j(str)) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceCheckVideoRecordMgr", "%s MD5: %s", str, com.p314xaae8f345.mm.vfs.w6.p(str));
            d0Var.a(str);
            java.lang.String str3 = str + "_encrypt";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceCheckVideoRecordMgr", "encrypt video file, personId: %s", str2);
            d0Var.c(str2, str, str3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceCheckVideoRecordMgr", "%s MD5: %s", str3, com.p314xaae8f345.mm.vfs.w6.p(str3));
            com.p314xaae8f345.mm.vfs.w6.h(str);
            d0Var.b(str3);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceCheckVideoRecordMgr", e17, "encryptAndUploadVideoFile error", new java.lang.Object[0]);
            k72.b0 b0Var = d0Var.f386249f;
            if (b0Var != null) {
                ((k72.r) b0Var).a();
            }
        }
    }
}
