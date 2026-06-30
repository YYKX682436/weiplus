package yw3;

/* loaded from: classes4.dex */
public final class f extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f548268d;

    public f(java.util.List dataList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        this.f548268d = dataList;
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i scope, ym3.c request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        xm3.r0 r0Var = xm3.s0.f536911a;
        return r0Var.a(scope, r0Var.b(this.f548268d.size(), request, new yw3.e(this)));
    }
}
