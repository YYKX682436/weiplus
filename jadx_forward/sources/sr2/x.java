package sr2;

/* loaded from: classes5.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.w0 f493324d;

    public x(sr2.w0 w0Var) {
        this.f493324d = w0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sr2.w0 w0Var = this.f493324d;
        android.widget.RelativeLayout relativeLayout = w0Var.f493292m;
        if (relativeLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("shortTitleLayout");
            throw null;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = w0Var.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6.class)).X6(relativeLayout, true);
    }
}
