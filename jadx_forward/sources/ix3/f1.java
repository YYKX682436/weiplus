package ix3;

/* loaded from: classes10.dex */
public final class f1 extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f376938d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f376939e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f376940f;

    public f1(java.lang.String dirPath, java.lang.String pickFileName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dirPath, "dirPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pickFileName, "pickFileName");
        this.f376938d = dirPath;
        this.f376939e = pickFileName;
        this.f376940f = new java.util.ArrayList();
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i scope, ym3.c request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        xm3.r0 r0Var = xm3.s0.f536911a;
        return r0Var.a(scope, r0Var.b(((java.util.ArrayList) this.f376940f).size(), request, new ix3.d1(this)));
    }

    @Override // ym3.f
    /* renamed from: onCreate */
    public void mo10202x3e5a77bb() {
        java.util.List list = this.f376940f;
        ((java.util.ArrayList) list).clear();
        java.lang.Iterable s17 = com.p314xaae8f345.mm.vfs.w6.s(this.f376938d, false);
        int i17 = 0;
        for (java.lang.Object obj : kz5.n0.F0(s17 != null ? kz5.n0.S0(s17) : kz5.p0.f395529d, ix3.e1.f376925d)) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.vfs.x1 x1Var = (com.p314xaae8f345.mm.vfs.x1) obj;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f376939e, x1Var.f294765b)) {
                ((java.util.ArrayList) list).add(new ix3.l1(x1Var, -1, true));
            } else {
                ((java.util.ArrayList) list).add(new ix3.l1(x1Var, i17, false));
            }
            i17 = i18;
        }
    }
}
