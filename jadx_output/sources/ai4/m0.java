package ai4;

/* loaded from: classes11.dex */
public final class m0 implements ai4.b {

    /* renamed from: a, reason: collision with root package name */
    public static final ai4.m0 f5173a = new ai4.m0();

    /* renamed from: b, reason: collision with root package name */
    public static ai4.b f5174b;

    static {
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(ai4.k0.f5164d);
    }

    @Override // ai4.b
    public boolean A(mj4.e eVar) {
        return O().A(eVar);
    }

    @Override // ai4.b
    public java.util.List B() {
        return O().B();
    }

    @Override // ai4.b
    public boolean C(mj4.l item) {
        kotlin.jvm.internal.o.g(item, "item");
        return O().C(item);
    }

    @Override // ai4.b
    public java.util.List D() {
        return O().D();
    }

    @Override // ai4.b
    public mj4.h E() {
        return O().E();
    }

    @Override // ai4.b
    public void F(int i17) {
        O().F(i17);
    }

    @Override // ai4.b
    public si4.a G() {
        return O().G();
    }

    @Override // ai4.b
    public boolean H(int i17, java.lang.String str, int i18) {
        return O().H(i17, str, i18);
    }

    @Override // ai4.b
    public void I(java.lang.String str) {
        O().I(str);
    }

    @Override // ai4.b
    public void J(qi4.b bVar, qi4.b bVar2) {
        O().J(bVar, bVar2);
    }

    @Override // ai4.b
    public java.util.List K() {
        return O().K();
    }

    @Override // ai4.b
    public long L(java.lang.String userName, java.lang.String id6, pj4.b0 info, int i17, java.lang.String str, long j17, float f17, pj4.s sVar, pj4.r rVar, boolean z17) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(info, "info");
        return O().L(userName, id6, info, i17, str, j17, f17, sVar, rVar, z17);
    }

    @Override // ai4.b
    public mj4.h M(java.lang.String str) {
        return O().M(str);
    }

    @Override // ai4.b
    public java.util.List N() {
        return O().N();
    }

    public final ai4.b O() {
        ai4.b s0Var;
        if (f5174b == null) {
            ai4.b0 b0Var = ai4.b0.f5123a;
            b0Var.getClass();
            if (ai4.b0.f5126d) {
                s0Var = new ai4.i0(new ai4.s0(null));
            } else {
                b0Var.getClass();
                s0Var = new ai4.s0(ai4.b0.f5125c ? new ai4.i0(null) : null);
            }
            f5174b = s0Var;
        }
        ai4.b bVar = f5174b;
        kotlin.jvm.internal.o.d(bVar);
        return bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if ((p94.w0.f() != null ? ((com.tencent.mm.plugin.sns.storage.r2) p94.w0.f()).P0(r8, 5) : false) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.Class<e42.e0> r0 = e42.e0.class
            i95.m r0 = i95.n0.c(r0)
            e42.e0 r0 = (e42.e0) r0
            e42.d0 r1 = e42.d0.clicfg_text_status_fix_privacy
            h62.d r0 = (h62.d) r0
            r2 = 0
            int r0 = r0.Ni(r1, r2)
            r1 = 1
            if (r0 != r1) goto L16
            r0 = r1
            goto L17
        L16:
            r0 = r2
        L17:
            if (r0 != 0) goto L1a
            return
        L1a:
            if (r8 != 0) goto L1d
            return
        L1d:
            java.lang.Class<vg3.x3> r0 = vg3.x3.class
            lm0.a r0 = gm0.j1.s(r0)
            vg3.x3 r0 = (vg3.x3) r0
            com.tencent.mm.plugin.messenger.foundation.h2 r0 = (com.tencent.mm.plugin.messenger.foundation.h2) r0
            com.tencent.mm.storage.k4 r0 = r0.Bi()
            com.tencent.mm.storage.z3 r0 = r0.n(r8, r1)
            if (r0 == 0) goto L59
            boolean r3 = r0.r2()
            if (r3 == 0) goto L59
            boolean r3 = r0.o2()
            if (r3 != 0) goto L59
            boolean r0 = r0.y2()
            if (r0 != 0) goto L59
            p94.q0 r0 = p94.w0.f()
            if (r0 == 0) goto L56
            p94.q0 r0 = p94.w0.f()
            r3 = 5
            com.tencent.mm.plugin.sns.storage.r2 r0 = (com.tencent.mm.plugin.sns.storage.r2) r0
            boolean r0 = r0.P0(r8, r3)
            goto L57
        L56:
            r0 = r2
        L57:
            if (r0 == 0) goto L5a
        L59:
            r2 = r1
        L5a:
            if (r2 == 0) goto L6e
            si4.a r0 = r7.G()
            r0.n(r8)
            ej4.c0 r1 = ej4.c0.f253335a
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r2 = r8
            ej4.c0.d(r1, r2, r3, r4, r5, r6)
            goto L91
        L6e:
            c01.p8 r0 = c01.n8.a()
            c01.k7 r0 = (c01.k7) r0
            r0.e(r8)
            java.lang.Class<ct.z2> r0 = ct.z2.class
            i95.m r0 = i95.n0.c(r0)
            ct.z2 r0 = (ct.z2) r0
            j11.q r0 = (j11.q) r0
            c01.p8 r0 = r0.wi()
            ai4.l0 r1 = new ai4.l0
            r1.<init>(r8)
            c01.k7 r0 = (c01.k7) r0
            r2 = 20
            r0.b(r8, r2, r1)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai4.m0.P(java.lang.String):void");
    }

    @Override // ai4.b
    public d95.b0 a() {
        return O().a();
    }

    @Override // ai4.b
    public void b() {
        O().b();
    }

    @Override // ai4.b
    public int c() {
        return O().c();
    }

    @Override // ai4.b
    public java.util.List d() {
        return O().d();
    }

    @Override // ai4.b
    public void e() {
        O().e();
    }

    @Override // ai4.b
    public void f() {
        O().f();
    }

    @Override // ai4.b
    public int h(int i17) {
        return O().h(i17);
    }

    @Override // ai4.b
    public hj4.b i() {
        return O().i();
    }

    @Override // ai4.b
    public int j() {
        return O().j();
    }

    @Override // ai4.b
    public java.util.List k() {
        return O().k();
    }

    @Override // ai4.b
    public java.util.List l() {
        return O().l();
    }

    @Override // ai4.b
    public void m(boolean z17) {
        O().m(z17);
    }

    @Override // ai4.b
    public void n() {
        O().n();
    }

    @Override // ai4.b
    public boolean o(java.lang.String str) {
        return O().o(str);
    }

    @Override // ai4.b
    public void p(qi4.b bVar, qi4.b bVar2) {
        O().p(bVar, bVar2);
    }

    @Override // ai4.b
    public boolean q(mj4.e eVar) {
        return O().q(eVar);
    }

    @Override // ai4.b
    public boolean r() {
        return O().r();
    }

    @Override // ai4.b
    public boolean t(mj4.l item) {
        kotlin.jvm.internal.o.g(item, "item");
        return O().t(item);
    }

    @Override // ai4.b
    public boolean u(mj4.l item) {
        kotlin.jvm.internal.o.g(item, "item");
        return O().u(item);
    }

    @Override // ai4.b
    public boolean v(java.lang.String str, boolean z17) {
        return O().v(str, z17);
    }

    @Override // ai4.b
    public java.util.List w() {
        return O().w();
    }

    @Override // ai4.b
    public boolean x() {
        return O().x();
    }

    @Override // ai4.b
    public mj4.l y(java.lang.String hashUserName, java.lang.String statusId) {
        kotlin.jvm.internal.o.g(hashUserName, "hashUserName");
        kotlin.jvm.internal.o.g(statusId, "statusId");
        return O().y(hashUserName, statusId);
    }

    @Override // ai4.b
    public void z(java.util.Map values) {
        kotlin.jvm.internal.o.g(values, "values");
        O().z(values);
    }
}
