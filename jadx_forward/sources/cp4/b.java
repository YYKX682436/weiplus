package cp4;

/* loaded from: classes8.dex */
public final class b implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: v, reason: collision with root package name */
    public static long f302505v;

    /* renamed from: d, reason: collision with root package name */
    public yz5.r f302506d;

    /* renamed from: e, reason: collision with root package name */
    public cp4.h1 f302507e;

    /* renamed from: f, reason: collision with root package name */
    public gp.c f302508f;

    /* renamed from: h, reason: collision with root package name */
    public java.nio.ByteBuffer f302510h;

    /* renamed from: m, reason: collision with root package name */
    public int f302512m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f302513n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f302515p;

    /* renamed from: q, reason: collision with root package name */
    public int f302516q;

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f302520u;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f302509g = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f302511i = "";

    /* renamed from: o, reason: collision with root package name */
    public boolean f302514o = true;

    /* renamed from: r, reason: collision with root package name */
    public int f302517r = 2;

    /* renamed from: s, reason: collision with root package name */
    public int f302518s = 44100;

    /* renamed from: t, reason: collision with root package name */
    public int f302519t = 1;

    public b() {
        gm0.j1.n().f354821b.a(3835, this);
    }

    public final void a(int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i18, int i19) {
        int i27 = this.f302512m;
        cp4.h1 h1Var = this.f302507e;
        cp4.h1 h1Var2 = new cp4.h1(i17, gVar, i18, i19, i27, h1Var != null ? h1Var.f302562f : null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        sb6.append(hashCode());
        sb6.append("]do voiceTransLate vid:");
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = h1Var2.f302562f;
        sb6.append(gVar2 != null ? gVar2.h(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c) : null);
        sb6.append(" seq:");
        sb6.append(i18);
        sb6.append(" size:");
        sb6.append(gVar != null ? java.lang.Integer.valueOf(gVar.f273689a.length) : null);
        sb6.append(" offset:");
        sb6.append(i19);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditCaptionDataManager", sb6.toString());
        java.lang.String str = this.f302511i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        h1Var2.f302566m = str;
        this.f302507e = h1Var2;
        gm0.j1.n().f354821b.g(this.f302507e);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.ui.plugin.caption.NetSceneGetVideoCaption");
        cp4.h1 h1Var = (cp4.h1) m1Var;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h1Var.f302566m, this.f302511i) || this.f302520u) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditCaptionDataManager", "[" + hashCode() + "]onSceneEnd errType:" + i17 + " errCode:" + i18 + " errMsg:" + str);
        int i19 = h1Var.f302560d;
        if (i17 != 0 || i18 != 0) {
            if (h1Var.f302565i) {
                this.f302516q = -1;
                this.f302515p = false;
                yz5.r rVar = this.f302506d;
                if (rVar != null) {
                    rVar.C(java.lang.Integer.valueOf(i19), this.f302511i, -1, null);
                }
                this.f302514o = true;
                return;
            }
            return;
        }
        this.f302509g = h1Var.f302564h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        sb6.append(hashCode());
        sb6.append("]scene seq:");
        sb6.append(h1Var.f302561e);
        sb6.append(" isLastRequest:");
        sb6.append(h1Var.f302565i);
        sb6.append(" progress:");
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = h1Var.f302563g.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.CCVoiceTransResponse");
        sb6.append(((r45.ks) fVar).f460447e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditCaptionDataManager", sb6.toString());
        java.util.Iterator it = this.f302509g.iterator();
        int i27 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i28 = i27 + 1;
            if (i27 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.is isVar = (r45.is) next;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditCaptionDataManager", "[" + hashCode() + "]result" + i27 + ": start:" + isVar.f458831e + " end:" + isVar.f458832f + " text:" + isVar.f458830d.h(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
            if (h1Var.f302565i) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = h1Var.f302563g.f152244b.f152233a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.CCVoiceTransResponse");
                if (((r45.ks) fVar2).f460447e >= 100) {
                    long j17 = f302505v + 1;
                    f302505v = j17;
                    isVar.f458834h = j17;
                }
            }
            i27 = i28;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditCaptionDataManager", "\n");
        if (h1Var.f302565i) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar3 = h1Var.f302563g.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.CCVoiceTransResponse");
            if (((r45.ks) fVar3).f460447e >= 100) {
                this.f302515p = false;
                yz5.r rVar2 = this.f302506d;
                if (rVar2 != null) {
                    rVar2.C(java.lang.Integer.valueOf(i19), this.f302511i, java.lang.Integer.valueOf(this.f302509g.isEmpty() ^ true ? 0 : -2), this.f302509g);
                    return;
                }
                return;
            }
            yz5.r rVar3 = this.f302506d;
            if (rVar3 != null) {
                rVar3.C(java.lang.Integer.valueOf(i19), this.f302511i, 0, this.f302509g);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditCaptionDataManager", "[" + hashCode() + "]repeat query voice data");
            cp4.h1 h1Var2 = this.f302507e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h1Var2);
            a(i19, null, h1Var2.f302561e, 0);
        }
    }
}
