package yr3;

/* loaded from: classes11.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yr3.o f546450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yr3.m f546451e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f546452f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(yr3.o oVar, yr3.m mVar, java.lang.String str) {
        super(1);
        this.f546450d = oVar;
        this.f546451e = mVar;
        this.f546452f = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        l81.b1 b1Var = new l81.b1();
        yr3.m mVar = this.f546451e;
        yr3.f fVar = mVar.f546462e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fVar);
        b1Var.f398565k = fVar.f546338d == sr3.a.f493362e ? 1338 : 1414;
        b1Var.f398567l = "3";
        b1Var.f398549c = intValue;
        b1Var.f398547b = "wx0b2ec076ec39c786";
        yr3.f fVar2 = mVar.f546462e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fVar2);
        b1Var.f398555f = fVar2.f546336b.f463452l1;
        r01.l1 l1Var = (r01.l1) i95.n0.c(r01.l1.class);
        yr3.f fVar3 = mVar.f546462e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fVar3);
        b1Var.f398561i = l1Var.Bi(fVar3.f546338d.f493365d, this.f546452f);
        if (((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Bi()) {
            b1Var.f398551d = 447;
        }
        i95.m c17 = i95.n0.c(tk.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        tk.r rVar = (tk.r) c17;
        yr3.o oVar = this.f546450d;
        boolean Wf = tk.r.Wf(rVar, oVar.f546494d, b1Var, null, 4, null);
        gr3.b bVar = gr3.b.f356380a;
        if (Wf) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeatureMsgUtil", "modify jumpWxa: use new editor");
            gr3.b.d(bVar, mVar.f546462e, 107L, mVar.f546461d, mVar.f546463f, 0, 16, null);
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(oVar.f546494d, b1Var);
            gr3.b.d(bVar, mVar.f546462e, 107L, mVar.f546461d, mVar.f546463f, 0, 16, null);
        }
        return jz5.f0.f384359a;
    }
}
