package wu3;

/* loaded from: classes10.dex */
public final class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17052x24b53ea f531250d;

    public b2(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17052x24b53ea c17052x24b53ea) {
        this.f531250d = c17052x24b53ea;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17052x24b53ea c17052x24b53ea = this.f531250d;
        wu3.y1 callback = c17052x24b53ea.getCallback();
        if (callback != null) {
            yt3.x0 x0Var = (yt3.x0) callback;
            yt3.y0 y0Var = x0Var.f547246a;
            y0Var.f547255d.post(new yt3.w0(y0Var, x0Var.f547247b));
        }
        c17052x24b53ea.m68270x6c4ebec7(null);
    }
}
