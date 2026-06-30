package hb2;

/* loaded from: classes8.dex */
public final class n0 implements com.p314xaae8f345.mm.p947xba6de98f.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zy2.gc f361607b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361608c;

    public n0(java.lang.String str, zy2.gc gcVar, java.lang.String str2) {
        this.f361606a = str;
        this.f361607b = gcVar;
        this.f361608c = str2;
    }

    @Override // com.p314xaae8f345.mm.p947xba6de98f.q0
    public void a(com.p314xaae8f345.mm.p947xba6de98f.n1 event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        zy2.gc gcVar = this.f361607b;
        java.lang.String str = this.f361608c;
        hb2.s0 s0Var = hb2.s0.f361623e;
        s0Var.getClass();
        java.lang.String str2 = hb2.s0.f361624f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("upload head img action cdn ");
        com.p314xaae8f345.mm.p947xba6de98f.m1 m1Var = event.f152636a;
        sb6.append(m1Var);
        sb6.append(" ret ");
        sb6.append(event.f152638c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
        if (m1Var == com.p314xaae8f345.mm.p947xba6de98f.m1.f152612h) {
            dn.h hVar = event.f152641f;
            java.lang.String str3 = hVar != null ? hVar.f69524x419c440e : null;
            boolean z17 = str3 == null || str3.length() == 0;
            java.lang.String str4 = this.f361606a;
            if (z17 || str4 == null) {
                s0Var.getClass();
                hb2.r0 r0Var = new hb2.r0(gcVar);
                i95.m c17 = i95.n0.c(cq.k.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                cq.j1.j((cq.k) c17, str, 2, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? null : null, (r18 & 32) != 0 ? null : new hb2.p0(str4, r0Var, gcVar), (r18 & 64) != 0 ? null : new hb2.q0(r0Var));
                return;
            }
            r45.ri2 ri2Var = new r45.ri2();
            dn.h hVar2 = event.f152641f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hVar2);
            ri2Var.set(3, hVar2.f69524x419c440e);
            pm0.v.X(hb2.m0.f361604d);
            hb2.w0.a(s0Var, str4, ri2Var, gcVar, false, false, null, 56, null);
        }
    }
}
