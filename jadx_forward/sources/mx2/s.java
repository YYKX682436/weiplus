package mx2;

/* loaded from: classes2.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15402xc40c224a f414051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mn2.g4 f414052e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 f414053f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15402xc40c224a c15402xc40c224a, mn2.g4 g4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88) {
        super(1);
        this.f414051d = c15402xc40c224a;
        this.f414052e = g4Var;
        this.f414053f = c14989xf862ae88;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String f213863e;
        cw2.da daVar = (cw2.da) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15402xc40c224a c15402xc40c224a = this.f414051d;
        c15402xc40c224a.m62738xab353f7e(daVar);
        if (daVar != null && cq.k.f302754n.a()) {
            daVar.m122873xca0297d8(com.p314xaae8f345.mm.R.id.twb, java.lang.Boolean.TRUE);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) c15402xc40c224a.f213867i).X6(daVar);
        if (daVar != null) {
            ym5.a1.f(new mx2.u(c15402xc40c224a));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15402xc40c224a.O(c15402xc40c224a, daVar, this.f414052e, this.f414053f);
            boolean F = daVar.F();
            c15402xc40c224a.f213869n = F;
            f213863e = c15402xc40c224a.getF213863e();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f213863e, "preload prepareToPlay done result:" + F + ' ' + c15402xc40c224a);
        }
        return jz5.f0.f384359a;
    }
}
