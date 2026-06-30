package hd2;

/* loaded from: classes8.dex */
public final class l implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14133xabc4217e f362025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f362026e;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14133xabc4217e c14133xabc4217e, android.view.View view) {
        this.f362025d = c14133xabc4217e;
        this.f362026e = view;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14133xabc4217e c14133xabc4217e = this.f362025d;
        o25.y1 y1Var = c14133xabc4217e.f191574m;
        if (y1Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) y1Var).aj((db5.h4) menuItem, new hd2.k(c14133xabc4217e, this.f362026e));
        }
    }
}
