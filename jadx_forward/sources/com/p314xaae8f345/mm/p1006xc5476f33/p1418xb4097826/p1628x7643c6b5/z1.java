package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5;

/* loaded from: classes2.dex */
public final class z1 implements vr2.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.b2 f207801a;

    public z1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.b2 b2Var) {
        this.f207801a = b2Var;
    }

    @Override // vr2.i
    public void a(java.lang.String mediaId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
    }

    @Override // vr2.i
    public void b(java.lang.String mediaId, cs2.p task, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        zy2.t9 t9Var = this.f207801a.f207542b;
        if (t9Var != null) {
            ((l44.z4) t9Var).a(task.f303622f2);
        }
    }

    @Override // vr2.i
    public void c(java.lang.String mediaId, int i17, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
    }

    @Override // vr2.i
    public void d(java.lang.String mediaId, boolean z17, int i17, cs2.p task, long j17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        if (this.f207801a.f207542b != null) {
            long j18 = task.f303622f2;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSuccessfully", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$AdPreloadVideoCallback");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAdPreloadHelper", "preloadVideo onSuccessfully, feedId is " + j18 + ", isAllCompleted is " + z17 + ", percent is " + i17 + ", receivedSize is " + j17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSuccessfully", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$AdPreloadVideoCallback");
        }
    }

    @Override // vr2.i
    public void e(java.lang.String mediaId, java.lang.String msg, cs2.p task, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        zy2.t9 t9Var = this.f207801a.f207542b;
        if (t9Var != null) {
            ((l44.z4) t9Var).a(task.f303622f2);
        }
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
        if (this.f207801a.f207542b != null) {
            long j17 = task.f303622f2;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStart", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$AdPreloadVideoCallback");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAdPreloadHelper", "preloadVideo onStart, feedId is " + j17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStart", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$AdPreloadVideoCallback");
        }
    }

    @Override // vr2.i
    public void h(java.lang.String mediaId, cs2.p task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        zy2.t9 t9Var = this.f207801a.f207542b;
        if (t9Var != null) {
            ((l44.z4) t9Var).a(task.f303622f2);
        }
    }
}
