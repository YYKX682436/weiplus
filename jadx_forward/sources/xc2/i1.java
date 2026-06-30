package xc2;

/* loaded from: classes2.dex */
public final class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15268x6a41bd8a f534693d;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15268x6a41bd8a c15268x6a41bd8a) {
        this.f534693d = c15268x6a41bd8a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 presenter = this.f534693d.getPresenter();
        if (presenter != null) {
            presenter.B0(true);
        }
    }
}
