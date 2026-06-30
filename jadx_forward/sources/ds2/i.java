package ds2;

/* loaded from: classes2.dex */
public final class i implements vr2.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ds2.b0 f324402a;

    public i(ds2.b0 b0Var) {
        this.f324402a = b0Var;
    }

    @Override // vr2.i
    public void a(java.lang.String mediaId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        ds2.b0 b0Var = this.f324402a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(b0Var.f324392g, "[onFormatChange] mediaId=".concat(mediaId));
        b0Var.a(mediaId, false, "onFormatChange");
        cu2.x xVar = cu2.x.f303982a;
        com.p314xaae8f345.mm.vfs.w6.h(cu2.x.c(xVar, mediaId, false, false, false, 14, null).u0());
        xVar.n(mediaId, 0L, 0L, -2);
    }

    @Override // vr2.i
    public void b(java.lang.String mediaId, cs2.p task, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        this.f324402a.d();
    }

    @Override // vr2.i
    public void c(java.lang.String mediaId, int i17, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
    }

    @Override // vr2.i
    public void d(java.lang.String mediaId, boolean z17, int i17, cs2.p task, long j17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        cu2.x xVar = cu2.x.f303982a;
        so2.i3 c17 = cu2.x.c(xVar, mediaId, false, false, false, 14, null);
        ds2.b0 b0Var = this.f324402a;
        b0Var.f324386a.getClass();
        if (!c17.f68982x84465715 && z17) {
            xVar.k(mediaId, task.k());
        }
        b0Var.d();
    }

    @Override // vr2.i
    public void e(java.lang.String mediaId, java.lang.String msg, cs2.p task, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        this.f324402a.d();
    }

    @Override // vr2.i
    public void f(java.lang.String mediaId, cs2.p task, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
    }

    @Override // vr2.i
    public void g(java.lang.String mediaId, int i17, int i18, java.lang.String fileFormat, java.lang.String codingFormat, cs2.p task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileFormat, "fileFormat");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codingFormat, "codingFormat");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
    }

    @Override // vr2.i
    public void h(java.lang.String mediaId, cs2.p task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f324402a.f324392g, "[onReject] mediaId=".concat(mediaId));
    }
}
