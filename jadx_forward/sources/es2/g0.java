package es2;

/* loaded from: classes2.dex */
public final class g0 implements vr2.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ es2.h0 f337896a;

    public g0(es2.h0 h0Var) {
        this.f337896a = h0Var;
    }

    @Override // vr2.i
    public void a(java.lang.String mediaId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        es2.h0 h0Var = this.f337896a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(h0Var.f337908h, "[onFormatChange] mediaId=".concat(mediaId));
        java.util.Iterator it = h0Var.f337907g.iterator();
        while (it.hasNext()) {
            ((vr2.i) it.next()).a(mediaId);
        }
        h0Var.a(mediaId, false, "onFormatChange");
        cu2.x xVar = cu2.x.f303982a;
        com.p314xaae8f345.mm.vfs.w6.h(cu2.x.c(xVar, mediaId, false, false, false, 14, null).u0());
        xVar.n(mediaId, 0L, 0L, -2);
    }

    @Override // vr2.i
    public void b(java.lang.String mediaId, cs2.p task, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        es2.h0 h0Var = this.f337896a;
        java.util.Iterator it = h0Var.f337907g.iterator();
        while (it.hasNext()) {
            ((vr2.i) it.next()).b(mediaId, task, i17, i18);
        }
        h0Var.h();
    }

    @Override // vr2.i
    public void c(java.lang.String mediaId, int i17, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        java.util.Iterator it = this.f337896a.f337907g.iterator();
        while (it.hasNext()) {
            ((vr2.i) it.next()).c(mediaId, i17, j17);
        }
    }

    @Override // vr2.i
    public void d(java.lang.String mediaId, boolean z17, int i17, cs2.p task, long j17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        cu2.x xVar = cu2.x.f303982a;
        if (!cu2.x.c(xVar, mediaId, false, false, false, 14, null).f68982x84465715 && z17) {
            xVar.k(mediaId, task.k());
        }
        es2.h0 h0Var = this.f337896a;
        java.util.Iterator it = h0Var.f337907g.iterator();
        while (it.hasNext()) {
            ((vr2.i) it.next()).d(mediaId, z17, i17, task, j17, i18, i19);
        }
        h0Var.h();
    }

    @Override // vr2.i
    public void e(java.lang.String mediaId, java.lang.String msg, cs2.p task, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        es2.h0 h0Var = this.f337896a;
        java.util.Iterator it = h0Var.f337907g.iterator();
        while (it.hasNext()) {
            ((vr2.i) it.next()).e(mediaId, msg, task, i17, i18);
        }
        h0Var.h();
    }

    @Override // vr2.i
    public void f(java.lang.String mediaId, cs2.p task, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        java.util.Iterator it = this.f337896a.f337907g.iterator();
        while (it.hasNext()) {
            ((vr2.i) it.next()).f(mediaId, task, i17, i18);
        }
    }

    @Override // vr2.i
    public void g(java.lang.String mediaId, int i17, int i18, java.lang.String fileFormat, java.lang.String codingFormat, cs2.p task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileFormat, "fileFormat");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codingFormat, "codingFormat");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        java.util.Iterator it = this.f337896a.f337907g.iterator();
        while (it.hasNext()) {
            ((vr2.i) it.next()).g(mediaId, i17, i18, fileFormat, codingFormat, task);
        }
    }

    @Override // vr2.i
    public void h(java.lang.String mediaId, cs2.p task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        es2.h0 h0Var = this.f337896a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(h0Var.f337908h, "[onReject] mediaId=".concat(mediaId));
        java.util.Iterator it = h0Var.f337907g.iterator();
        while (it.hasNext()) {
            ((vr2.i) it.next()).h(mediaId, task);
        }
    }
}
