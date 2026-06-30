package ue0;

/* loaded from: classes4.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f508315d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f508316e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f508317f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f508318g;

    public i(ue0.j jVar, java.lang.String str, java.lang.String str2, int i17, long j17) {
        this.f508315d = str;
        this.f508316e = str2;
        this.f508317f = i17;
        this.f508318g = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27;
        ot0.q v17;
        ((uh4.c0) i95.n0.c(uh4.c0.class)).b8();
        if (c01.z1.r().equalsIgnoreCase(this.f508315d)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            f9Var.j1(0);
            f9Var.r1(3);
            f9Var.u1(this.f508316e);
            f9Var.e1(c01.w9.m(this.f508316e, c01.id.a() / 1000));
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 l17 = c01.e2.l(this.f508316e);
            android.content.res.Resources resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e;
            int i17 = this.f508317f == 7 ? com.p314xaae8f345.mm.R.C30867xcad56011.jqh : com.p314xaae8f345.mm.R.C30867xcad56011.jqg;
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = l17 != null ? l17.g2() : "";
            objArr[1] = ((uh4.c0) i95.n0.c(uh4.c0.class)).xf(this.f508317f).b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            objArr[2] = "<_wc_custom_link_ href='weixin://teenagerModeAgreenAuthorization/" + this.f508318g + "'>";
            objArr[3] = "</_wc_custom_link_>";
            f9Var.d1(resources.getString(i17, objArr));
            f9Var.m124850x7650bebc(10000);
            f9Var.f1(f9Var.w0() | 8);
            c01.w9.x(f9Var);
            if (this.f508317f == 7) {
                r45.v26 v26Var = new r45.v26();
                v26Var.f469363g = 4;
                v26Var.f469366m = this.f508316e;
                com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
                lVar.f152200d = 4277;
                lVar.f152199c = "/cgi-bin/micromsg-bin/setteenagermodepwd";
                lVar.f152197a = v26Var;
                lVar.f152198b = new r45.w26();
                com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
                com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
                iVar.p(a17);
                iVar.l();
            }
            o27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(this.f508316e, this.f508318g);
        } else {
            o27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(this.f508315d, this.f508318g);
        }
        if (o27 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o27.j()) || (v17 = ot0.q.v(o27.j())) == null) {
            return;
        }
        v17.f430187f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.jqa) + v17.f430187f;
        o27.d1(ot0.q.u(v17, null, null));
        c01.w9.C(o27);
    }
}
