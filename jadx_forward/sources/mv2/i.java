package mv2;

/* loaded from: classes10.dex */
public final class i extends mv2.b {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.r f413108i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i17, yz5.r rVar) {
        super(yj0Var, gVar, i17);
        this.f413108i = rVar;
    }

    @Override // mv2.b
    public void e(int i17, int i18, java.lang.String str, r45.ty0 ty0Var) {
        super.e(i17, i18, str, ty0Var);
        yz5.r rVar = this.f413108i;
        if (rVar != null) {
            rVar.C(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, ty0Var);
        }
    }
}
