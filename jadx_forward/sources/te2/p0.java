package te2;

/* loaded from: classes3.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.p1 f499818d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(te2.p1 p1Var) {
        super(1);
        this.f499818d = p1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveAnchorMusicPresenter", "showMusic loadMoreData incrementNum:" + intValue + '!');
        te2.p1 p1Var = this.f499818d;
        if (intValue <= 0) {
            te2.k0 k0Var = p1Var.f499823h;
            if (k0Var != null) {
                ((te2.q1) k0Var).d(false);
            }
        } else {
            te2.k0 k0Var2 = p1Var.f499823h;
            if (k0Var2 != null) {
                ((te2.q1) k0Var2).a(((mm2.c1) p1Var.f499820e.a(mm2.c1.class)).Z6().f315410f);
            }
            bm2.m mVar = p1Var.f499824i;
            if (mVar != null) {
                mVar.b(true);
            }
        }
        return jz5.f0.f384359a;
    }
}
