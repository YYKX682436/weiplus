package ls4;

/* loaded from: classes8.dex */
public final class q implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ls4.u f402625a;

    public q(ls4.u uVar) {
        this.f402625a = uVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fVar);
        boolean g17 = os4.h.g(fVar);
        ls4.u uVar = this.f402625a;
        if (g17) {
            uVar.d(new pr4.a(pr4.j.f439545d));
            return jz5.f0.f384359a;
        }
        long j17 = ((r45.fs3) fVar.f152151d).f456118d;
        os4.h.l(j17);
        return new ks4.g(uVar.f402633a.f439553a, 0, 0).l().h(new ls4.p(uVar, j17));
    }
}
