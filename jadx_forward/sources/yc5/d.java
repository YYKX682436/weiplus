package yc5;

/* loaded from: classes5.dex */
public final class d implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.z f542433a;

    public d(p3325xe03a0797.p3326xc267989b.z zVar) {
        this.f542433a = zVar;
    }

    @Override // zb0.a0
    public void a(java.lang.String srcPath, java.lang.String destPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcPath, "srcPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(destPath, "destPath");
        ((p3325xe03a0797.p3326xc267989b.a0) this.f542433a).U(java.lang.Boolean.TRUE);
    }

    @Override // zb0.a0
    public void b(java.lang.String srcPath, java.lang.String destPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcPath, "srcPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(destPath, "destPath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryFileHelper", "exportFileToPublicDownload: failed, src=".concat(srcPath));
        ((p3325xe03a0797.p3326xc267989b.a0) this.f542433a).U(java.lang.Boolean.FALSE);
    }
}
