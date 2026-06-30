package wu3;

/* loaded from: classes10.dex */
public final class a2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17052x24b53ea f531247d;

    public a2(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17052x24b53ea c17052x24b53ea) {
        this.f531247d = c17052x24b53ea;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nt3.f0 f0Var = this.f531247d.f237621e;
        if (f0Var != null) {
            f0Var.f421316c = 0L;
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("render");
            throw null;
        }
    }
}
