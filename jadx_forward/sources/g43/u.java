package g43;

/* loaded from: classes5.dex */
public final class u implements u33.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g43.x f350320a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f350321b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15701x78babc7d f350322c;

    public u(g43.x xVar, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15701x78babc7d c15701x78babc7d) {
        this.f350320a = xVar;
        this.f350321b = str;
        this.f350322c = c15701x78babc7d;
    }

    public void a(java.util.List users) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(users, "users");
        g43.x xVar = this.f350320a;
        w33.b O6 = xVar.O6();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(users, 10));
        int i17 = 0;
        for (java.lang.Object obj : users) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            y33.g gVar = (y33.g) obj;
            arrayList.add(i17 == 0 ? new w33.c(new jz5.l(java.lang.Boolean.TRUE, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573736fl5)), gVar.t0(), false, 1, 4, null) : new w33.c(null, gVar.t0(), false, 1, 5, null));
            i17 = i18;
        }
        xVar.f350327d.mo7808x76db6cb1(w33.b.a(O6, null, new jz5.l(bool, arrayList), null, null, 13, null));
    }
}
