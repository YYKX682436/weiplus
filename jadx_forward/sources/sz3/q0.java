package sz3;

/* loaded from: classes15.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz3.v0 f495635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sz3.c1 f495636e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17282x335f2f60 f495637f;

    public q0(sz3.v0 v0Var, sz3.c1 c1Var, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17282x335f2f60 c17282x335f2f60) {
        this.f495635d = v0Var;
        this.f495636e = c1Var;
        this.f495637f = c17282x335f2f60;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sz3.c1 c1Var = this.f495636e;
        sz3.x0 x0Var = new sz3.x0(c1Var.f495507a, c1Var.f495508b, 1, c1Var.f495509c);
        java.util.ArrayList arrayList = x0Var.f495684e;
        sz3.w0 w0Var = new sz3.w0();
        w0Var.f495671i = this.f495637f.getId();
        arrayList.add(w0Var);
        this.f495635d.m(x0Var, 1001, "convert yuv to jpg failed");
    }
}
