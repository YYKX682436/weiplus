package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f;

/* loaded from: classes12.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f279979a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f279980b;

    /* renamed from: c, reason: collision with root package name */
    public final int f279981c;

    /* renamed from: d, reason: collision with root package name */
    public final long f279982d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f279983e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f279984f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.v f279985g;

    public w(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.lang.String str;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d D0;
        ot0.m1 m1Var;
        this.f279981c = 0;
        this.f279984f = false;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.v vVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.v(this);
        this.f279985g = vVar;
        this.f279980b = f9Var;
        java.lang.String str2 = "";
        if (f9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaHistoryGalleryAdapter", "[getImagePath] msg is null !");
        } else {
            if (!f9Var.m78014x7b98c171() && !f9Var.Y2()) {
                if (f9Var.M2()) {
                    this.f279984f = true;
                    ot0.q v17 = ot0.q.v(f9Var.j());
                    if (v17 != null) {
                        str2 = v17.f430267z;
                        ot0.f fVar = (ot0.f) v17.y(ot0.f.class);
                        if (fVar != null && (m1Var = fVar.f429998l) != null) {
                            vVar.f279978a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.u(m1Var.f454877i);
                        }
                    }
                } else {
                    ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                    str2 = m11.b1.Di().D2(f9Var, f9Var.z0(), false);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && !str2.endsWith("hd") && com.p314xaae8f345.mm.vfs.w6.j(str2.concat("hd"))) {
                        str2 = str2.concat("hd");
                    }
                }
            } else {
                this.f279983e = true;
                str2 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(f9Var, f9Var.z0(), false);
                wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
                java.lang.String z07 = f9Var.z0();
                ((vf0.y1) x1Var).getClass();
                t21.v2 h17 = t21.d3.h(z07);
                if (h17 != null) {
                    vVar.f279978a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.u(h17.f496548m);
                }
                ot0.q.v(f9Var.U1());
            }
            if (f9Var.o2()) {
                ot0.q v18 = ot0.q.v(f9Var.j());
                java.lang.String str3 = (v18 == null || (str = v18.f430227p) == null || str.length() <= 0 || (D0 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().D0(v18.f430227p)) == null) ? null : D0.f68099xfeae815;
                if (str3 != null) {
                    str2 = str3;
                }
            }
        }
        this.f279979a = str2;
        this.f279982d = f9Var.mo78012x3fdd41df();
    }

    /* renamed from: equals */
    public boolean m79421xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f279980b;
        return (f9Var == null || !(obj instanceof com.p314xaae8f345.mm.p2621x8fb0427b.f9) || obj == null) ? super.equals(obj) : f9Var.m124847x74d37ac6() == ((com.p314xaae8f345.mm.p2621x8fb0427b.f9) obj).m124847x74d37ac6();
    }

    public w(long j17) {
        this.f279981c = 0;
        this.f279984f = false;
        this.f279985g = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.v(this);
        this.f279982d = j17;
        this.f279981c = Integer.MAX_VALUE;
    }
}
