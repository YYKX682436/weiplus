package mr3;

/* loaded from: classes10.dex */
public final class n extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f412416d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f412417e;

    /* renamed from: f, reason: collision with root package name */
    public mr3.l f412418f;

    /* renamed from: g, reason: collision with root package name */
    public final int f412419g;

    public n(boolean z17, java.util.List dataList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        this.f412416d = z17;
        this.f412417e = dataList;
        this.f412419g = 9;
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i scope, ym3.c request) {
        int min;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        boolean z17 = this.f412416d;
        java.util.List list = this.f412417e;
        if (z17) {
            min = list.size();
        } else {
            min = java.lang.Math.min(this.f412419g, list.size() + 1);
        }
        xm3.r0 r0Var = xm3.s0.f536911a;
        return r0Var.a(scope, r0Var.b(min, request, new mr3.m(this)));
    }
}
