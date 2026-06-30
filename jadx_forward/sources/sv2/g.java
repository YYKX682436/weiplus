package sv2;

/* loaded from: classes10.dex */
public final class g extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 f494811h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f494812i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 draftItem) {
        super("draft_" + draftItem.f66236x88be67a1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftItem, "draftItem");
        this.f494811h = draftItem;
        this.f494812i = "LogPost.FinderAdDraftPrepareStage";
    }

    @Override // pv2.g
    public int a() {
        return 1;
    }

    @Override // pv2.m
    public void d(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f494812i, "onFailed " + this.f494811h.f66236x88be67a1);
    }

    @Override // pv2.m
    public void e(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f494812i, "try post need upload task " + this.f494811h.f66236x88be67a1);
    }

    @Override // pv2.m
    public void f(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f494812i, "onWait " + this.f494811h.f66236x88be67a1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ov2.e
    public pv2.g j() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start localId:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var = this.f494811h;
        sb6.append(x80Var.f66236x88be67a1);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f494812i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f c5442xd807898f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f();
        long j17 = x80Var.f66236x88be67a1;
        am.ga gaVar = c5442xd807898f.f135783g;
        gaVar.f88282a = j17;
        gaVar.f88283b = 0;
        gaVar.f88284c = 1;
        c5442xd807898f.e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "try post need upload task " + x80Var.f66236x88be67a1);
        if (x80Var.t0().m59240x7c94657b().m76802x2dd01666() != null) {
            mv2.q.f413151a.n(x80Var);
            return new sv2.d(x80Var);
        }
        return new sv2.q(x80Var, null, 2, 0 == true ? 1 : 0);
    }
}
