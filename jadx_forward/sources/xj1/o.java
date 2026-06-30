package xj1;

/* loaded from: classes7.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1202x9835ae9e.C12708x81c12732 f536342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f536343e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.c0 f536344f;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1202x9835ae9e.C12708x81c12732 c12708x81c12732, java.util.List list, p012xc85e97e9.p103xe821e364.p104xd1075a44.c0 c0Var) {
        this.f536342d = c12708x81c12732;
        this.f536343e = list;
        this.f536344f = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xj1.b0 b0Var = this.f536342d.f171173i;
        if (b0Var != null) {
            java.util.List list = this.f536343e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
            synchronized (b0Var.f536313d) {
                b0Var.f536313d.clear();
                b0Var.f536313d.addAll(list);
            }
            this.f536344f.b(b0Var);
        }
    }
}
