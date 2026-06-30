package ye5;

/* loaded from: classes9.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rd5.d f542814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f542815e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(rd5.d dVar, yb5.d dVar2) {
        super(1);
        this.f542814d = dVar;
        this.f542815e = dVar2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String string;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f542814d.f475787d.f526833b;
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        t21.v2 g17 = t21.o2.Ui().g(f9Var.z0());
        if (g17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingItemMediaGroupItem", "onUploadingBtnClick, videoInfo is null, imgPath: " + f9Var.z0() + ", skip");
        } else {
            int i17 = g17.f496544i;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemMediaGroupItem", "onUploadingBtnClick, videoStatus: " + i17);
            if (booleanValue) {
                if (i17 == 112) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemMediaGroupItem", "onUploadingBtnClick, video comes from PC, pause recv");
                    t21.d3.y(f9Var.z0());
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemMediaGroupItem", "onUploadingBtnClick, pause sending video");
                    t21.d3.z(f9Var.z0());
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5991xa0d42363 c5991xa0d42363 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5991xa0d42363();
                    c5991xa0d42363.f136286g.f88994a = f9Var;
                    c5991xa0d42363.e();
                }
            } else if (i17 == 113) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemMediaGroupItem", "onUploadingBtnClick, video comes from PC, restart recv");
                if (!c01.d9.b().E()) {
                    db5.t7.k(this.f542815e.g(), this.f542815e.f542250l.m78646xc2a54588());
                } else if (com.p314xaae8f345.mm.p971x6de15a2e.y2.a(this.f542815e.g())) {
                    wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
                    java.lang.String d17 = g17.d();
                    ((vf0.y1) x1Var).getClass();
                    t21.d3.L(d17);
                } else {
                    db5.e1.n(this.f542815e.g(), com.p314xaae8f345.mm.R.C30867xcad56011.k77, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new ye5.p(g17), ye5.q.f542812d);
                }
            } else if (g17.k()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemMediaGroupItem", "onUploadingBtnClick, video comes from gallery illegal");
                switch (i17) {
                    case 140:
                        string = this.f542815e.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574977k74);
                        break;
                    case 141:
                        string = this.f542815e.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k76);
                        break;
                    case com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50673x992affbf /* 142 */:
                        string = this.f542815e.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574978k75);
                        break;
                    default:
                        string = this.f542815e.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574978k75);
                        break;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                db5.e1.s(this.f542815e.g(), string, this.f542815e.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jz9));
            } else {
                f9Var.m78015x9dfe85a();
                ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(f9Var.m124847x74d37ac6(), f9Var, true);
                if (c01.id.a() - f9Var.mo78012x3fdd41df() >= 432000000) {
                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.Q(this.f542815e, f9Var, i17 == 198 ? com.p314xaae8f345.mm.R.C30867xcad56011.f572022wi : com.p314xaae8f345.mm.R.C30867xcad56011.f572023wj);
                } else if (i17 == 198) {
                    t21.d3.C(f9Var.z0());
                } else {
                    wf0.x1 x1Var2 = (wf0.x1) i95.n0.c(wf0.x1.class);
                    java.lang.String z07 = f9Var.z0();
                    ((vf0.y1) x1Var2).getClass();
                    t21.d3.M(z07);
                    ((ku5.t0) ku5.t0.f394148d).g(new ye5.r(f9Var));
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
