package xn4;

/* loaded from: classes11.dex */
public final class b implements xn4.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2319xf206e0c9.p2321xbe57a114.AbstractActivityC18781x2874f4a4 f537133a;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2319xf206e0c9.p2321xbe57a114.AbstractActivityC18781x2874f4a4 abstractActivityC18781x2874f4a4) {
        this.f537133a = abstractActivityC18781x2874f4a4;
    }

    @Override // xn4.q
    public void a(java.lang.String mediaId, double d17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XUpdate.DialogDownloadUI", "onDownloadProgress: " + d17);
        xn4.c0 c0Var = xn4.c0.f537137a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2319xf206e0c9.p2321xbe57a114.AbstractActivityC18781x2874f4a4 abstractActivityC18781x2874f4a4 = this.f537133a;
        java.lang.String cdnUrl = abstractActivityC18781x2874f4a4.V6().f462210p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cdnUrl, "cdnUrl");
        c0Var.i(cdnUrl, 1);
        abstractActivityC18781x2874f4a4.X6(d17);
    }

    @Override // xn4.q
    public void b(java.lang.String mediaId, r45.mm6 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        xn4.c0 c0Var = xn4.c0.f537137a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2319xf206e0c9.p2321xbe57a114.AbstractActivityC18781x2874f4a4 abstractActivityC18781x2874f4a4 = this.f537133a;
        java.lang.String cdnUrl = abstractActivityC18781x2874f4a4.V6().f462210p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cdnUrl, "cdnUrl");
        c0Var.i(cdnUrl, 4);
        abstractActivityC18781x2874f4a4.a7(mediaId, info);
    }

    @Override // xn4.q
    public void c(java.lang.String mediaId, java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XUpdate.DialogDownloadUI", "onDownloadSuccess: ".concat(path));
        xn4.c0 c0Var = xn4.c0.f537137a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2319xf206e0c9.p2321xbe57a114.AbstractActivityC18781x2874f4a4 abstractActivityC18781x2874f4a4 = this.f537133a;
        java.lang.String cdnUrl = abstractActivityC18781x2874f4a4.V6().f462210p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cdnUrl, "cdnUrl");
        c0Var.i(cdnUrl, 2);
        abstractActivityC18781x2874f4a4.Y6(abstractActivityC18781x2874f4a4.V6());
    }

    @Override // xn4.q
    public void d(java.lang.String mediaId, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XUpdate.DialogDownloadUI", "onDownloadFail: ".concat(msg));
        xn4.c0 c0Var = xn4.c0.f537137a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2319xf206e0c9.p2321xbe57a114.AbstractActivityC18781x2874f4a4 abstractActivityC18781x2874f4a4 = this.f537133a;
        java.lang.String cdnUrl = abstractActivityC18781x2874f4a4.V6().f462210p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cdnUrl, "cdnUrl");
        c0Var.i(cdnUrl, 0);
        java.lang.String cdnUrl2 = abstractActivityC18781x2874f4a4.V6().f462210p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cdnUrl2, "cdnUrl");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MMKV_NAME_FILE_NAME").remove(cdnUrl2);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MMKV_NAME_MEDIA_ID").remove(cdnUrl2);
        abstractActivityC18781x2874f4a4.W6(msg);
    }
}
