package u85;

/* loaded from: classes10.dex */
public final class e extends u85.o implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f507231h;

    /* renamed from: i, reason: collision with root package name */
    public final dn.m f507232i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f507233m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f507234n;

    /* renamed from: o, reason: collision with root package name */
    public int f507235o;

    /* renamed from: p, reason: collision with root package name */
    public w85.a f507236p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f507237q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f507238r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.p314xaae8f345.mm.p2618x8f55093d.p2619xbe953013.C21046x5cf452f1 info) {
        super(info);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f507231h = "MicroMsg.StickerTask";
        this.f507233m = info.f275224f;
        this.f507234n = info.f275225g;
        this.f507235o = info.f275226h;
        this.f507237q = u85.i.f507240a.b(info.f275223e);
        this.f507238r = u85.i.f507243d + info.f275223e;
        dn.m mVar = new dn.m();
        this.f507232i = mVar;
        mVar.f323318d = "task_StickerFileIdTask";
        mVar.f323320f = new u85.d(this);
    }

    @Override // fp0.d
    public void a() {
        com.p314xaae8f345.mm.p2618x8f55093d.p2619xbe953013.C21046x5cf452f1 c21046x5cf452f1 = this.f507252f;
        boolean z17 = c21046x5cf452f1.f275223e.length() == 0;
        java.lang.String str = this.f507231h;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "call: lensId is " + c21046x5cf452f1.f275223e);
            e(false);
            return;
        }
        t85.g gVar = t85.j.f498006l;
        java.lang.String str2 = this.f507237q;
        if (gVar.a(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "call: file exists " + str2);
            e(true);
            return;
        }
        if (!(this.f507233m.length() == 0)) {
            if (!(this.f507234n.length() == 0)) {
                f();
                return;
            }
        }
        this.f507236p = new w85.a();
        gm0.j1.n().f354821b.a(3903, this);
        gm0.j1.n().f354821b.g(this.f507236p);
    }

    @Override // fp0.d
    public java.lang.String d() {
        return this.f507252f.f275223e;
    }

    @Override // u85.o
    public void e(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f507231h, "onResult: " + z17);
        super.e(z17);
    }

    public final void f() {
        if (!(this.f507233m.length() == 0)) {
            if (!(this.f507234n.length() == 0)) {
                dn.m mVar = this.f507232i;
                mVar.f69592xf1ebe47b = 5;
                mVar.f69606xccdbf540 = true;
                mVar.f69601xaca5bdda = "lensInfo_" + this.f507252f.f275223e;
                mVar.f69591xf9dbbe9c = this.f507233m;
                mVar.f69575xf11df5f5 = this.f507234n;
                mVar.f69620xeb1a61d6 = this.f507235o;
                mVar.f69595x6d25b0d9 = this.f507238r;
                ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(mVar);
                return;
            }
        }
        e(false);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.vh3 vh3Var;
        r45.r64 r64Var;
        r45.r64 r64Var2;
        r45.r64 r64Var3;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m1Var, this.f507236p)) {
            gm0.j1.n().f354821b.q(3903, this);
            w85.a aVar = this.f507236p;
            java.lang.String str2 = null;
            if (aVar != null) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = aVar.f525565e.f152244b.f152233a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetLensInfoResponse");
                vh3Var = (r45.vh3) fVar;
            } else {
                vh3Var = null;
            }
            int i19 = 0;
            if (i17 != 0 || i18 != 0 || vh3Var == null) {
                e(false);
                return;
            }
            r45.p64 p64Var = vh3Var.f469766d;
            java.lang.String str3 = (p64Var == null || (r64Var3 = p64Var.f464329h) == null) ? null : r64Var3.f466103d;
            if (str3 == null) {
                str3 = "";
            }
            this.f507233m = str3;
            if (p64Var != null && (r64Var2 = p64Var.f464329h) != null) {
                str2 = r64Var2.f466104e;
            }
            this.f507234n = str2 != null ? str2 : "";
            if (p64Var != null && (r64Var = p64Var.f464329h) != null) {
                i19 = r64Var.f466105f;
            }
            this.f507235o = i19;
            f();
        }
    }
}
