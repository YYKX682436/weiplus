package ot0;

/* loaded from: classes9.dex */
public class j extends ot0.h {
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public int D;
    public java.lang.String E;
    public java.lang.String F;
    public java.lang.String G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f430062J;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f430063b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f430064c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f430065d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f430066e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f430067f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f430068g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f430069h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f430070i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f430071j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f430072k;

    /* renamed from: l, reason: collision with root package name */
    public int f430073l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f430074m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f430075n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f430076o;

    /* renamed from: p, reason: collision with root package name */
    public int f430077p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f430078q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f430079r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f430080s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f430081t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f430082u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f430083v;

    /* renamed from: w, reason: collision with root package name */
    public int f430084w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f430085x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f430086y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f430087z;

    @Override // ot0.h
    public ot0.h a() {
        return new ot0.j();
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        java.lang.String str = (java.lang.String) map.get(".msg.appmsg.wcpayinfo.coverinfo");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        r45.jm5 jm5Var = new r45.jm5();
        try {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                jm5Var.mo11468x92b714fd(android.util.Base64.decode(str, 0));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppContentRedPacketCoverInfoPiece", e17, "", new java.lang.Object[0]);
        }
        this.f430063b = jm5Var.f459468d;
        this.f430064c = jm5Var.f459469e;
        this.f430065d = jm5Var.f459470f;
        this.f430066e = jm5Var.f459471g;
        this.f430067f = jm5Var.f459472h;
        this.f430068g = jm5Var.f459473i;
        this.f430069h = jm5Var.f459474m;
        this.f430070i = jm5Var.f459475n;
        this.f430071j = jm5Var.f459476o;
        this.f430072k = jm5Var.f459477p;
        this.f430073l = jm5Var.f459478q;
        this.f430074m = jm5Var.f459479r;
        this.f430075n = jm5Var.f459480s;
        this.f430076o = jm5Var.f459481t;
        this.f430077p = jm5Var.f459482u;
        this.f430078q = jm5Var.f459483v;
        this.f430079r = jm5Var.f459484w;
        this.f430080s = jm5Var.f459485x;
        this.f430081t = jm5Var.f459486y;
        this.f430082u = jm5Var.f459487z;
        this.f430083v = jm5Var.A;
        this.f430084w = jm5Var.B;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = jm5Var.C;
        if (gVar != null) {
            try {
                byte[] bArr = gVar.f273689a;
                if (bArr != null && bArr.length > 0) {
                    this.f430085x = android.util.Base64.encodeToString(bArr, 2);
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppContentRedPacketCoverInfoPiece", th6, "[parseContent] Fail to encodeToString", new java.lang.Object[0]);
            }
        }
        this.f430086y = jm5Var.D;
        this.f430087z = jm5Var.M;
        this.A = jm5Var.E;
        this.B = jm5Var.H;
        this.C = jm5Var.I;
        this.D = jm5Var.L;
        this.E = jm5Var.f459467J;
        this.F = jm5Var.K;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jm5Var.R)) {
            this.G = jm5Var.N;
        } else {
            this.G = jm5Var.R;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jm5Var.S)) {
            this.H = jm5Var.P;
        } else {
            this.H = jm5Var.S;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jm5Var.T)) {
            this.I = jm5Var.Q;
        } else {
            this.I = jm5Var.T;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jm5Var.X)) {
            this.f430062J = jm5Var.W;
        } else {
            this.f430062J = jm5Var.X;
        }
    }
}
