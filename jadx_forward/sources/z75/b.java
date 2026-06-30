package z75;

/* loaded from: classes15.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f552153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f552154e;

    public b(long j17, java.util.ArrayList arrayList) {
        this.f552153d = j17;
        this.f552154e = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6828xd0e163fc c6828xd0e163fc = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6828xd0e163fc();
        c6828xd0e163fc.f141486d = z75.c.f552155a;
        c6828xd0e163fc.f141487e = 3L;
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = z75.c.f552156b;
        c6828xd0e163fc.r(c21053xdbf1e5f4 != null ? c21053xdbf1e5f4.f68663x861009b5 : null);
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f42 = z75.c.f552156b;
        c6828xd0e163fc.q(c21053xdbf1e5f42 != null ? c21053xdbf1e5f42.mo42933xb5885648() : null);
        c6828xd0e163fc.f141492j = this.f552153d;
        c6828xd0e163fc.f141493k = 4L;
        c6828xd0e163fc.f141490h = c6828xd0e163fc.b("Pid", "", true);
        c6828xd0e163fc.f141491i = c6828xd0e163fc.b("Md5", "", true);
        c6828xd0e163fc.f141494l = c6828xd0e163fc.b("IsFree2", "", true);
        c6828xd0e163fc.f141495m = c6828xd0e163fc.b("Type2", "", true);
        c6828xd0e163fc.f141496n = c6828xd0e163fc.b("IsLocal2", "", true);
        for (com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb : this.f552154e) {
            c6828xd0e163fc.f141490h = c6828xd0e163fc.b("Pid", c6828xd0e163fc.f141490h + interfaceC4987x84e327cb.mo42930x4f4a97c4() + '#', true);
            c6828xd0e163fc.f141491i = c6828xd0e163fc.b("Md5", c6828xd0e163fc.f141491i + interfaceC4987x84e327cb.mo42933xb5885648() + '#', true);
            c6828xd0e163fc.f141494l = c6828xd0e163fc.b("IsFree2", c6828xd0e163fc.f141494l + interfaceC4987x84e327cb.x1() + '#', true);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(c6828xd0e163fc.f141496n);
            sb6.append(gr.t.g().j(interfaceC4987x84e327cb) ? "2" : "1");
            sb6.append('#');
            c6828xd0e163fc.f141496n = c6828xd0e163fc.b("IsLocal2", sb6.toString(), true);
            if (n22.m.p(interfaceC4987x84e327cb)) {
                c6828xd0e163fc.f141495m = c6828xd0e163fc.b("Type2", c6828xd0e163fc.f141495m + "1#", true);
            } else {
                c6828xd0e163fc.f141495m = c6828xd0e163fc.b("Type2", c6828xd0e163fc.f141495m + "2#", true);
            }
        }
        c6828xd0e163fc.p(z75.c.f552157c);
        c6828xd0e163fc.k();
    }
}
