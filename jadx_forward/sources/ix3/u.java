package ix3;

/* loaded from: classes10.dex */
public final class u extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f377101d;

    public u(java.util.List itemList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemList, "itemList");
        this.f377101d = itemList;
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i scope, ym3.c request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        xm3.r0 r0Var = xm3.s0.f536911a;
        return r0Var.a(scope, r0Var.b(this.f377101d.size(), request, new ix3.t(this)));
    }

    @Override // ym3.f
    /* renamed from: onCreate */
    public void mo10202x3e5a77bb() {
    }
}
