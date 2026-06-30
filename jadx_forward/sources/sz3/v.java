package sz3;

/* loaded from: classes15.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz3.w f495657d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sz3.c1 f495658e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17282x335f2f60 f495659f;

    public v(sz3.w wVar, sz3.c1 c1Var, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17282x335f2f60 c17282x335f2f60) {
        this.f495657d = wVar;
        this.f495658e = c1Var;
        this.f495659f = c17282x335f2f60;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sz3.c1 c1Var = this.f495658e;
        sz3.x0 x0Var = new sz3.x0(c1Var.f495507a, c1Var.f495508b, 1, c1Var.f495509c);
        java.util.ArrayList arrayList = x0Var.f495684e;
        sz3.w0 w0Var = new sz3.w0();
        w0Var.f495671i = this.f495659f.getId();
        arrayList.add(w0Var);
        this.f495657d.m(x0Var, 1001, "convert yuv to jpg failed");
    }
}
