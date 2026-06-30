package nf2;

/* loaded from: classes10.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f418335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nf2.d1 f418336e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(boolean z17, nf2.d1 d1Var) {
        super(0);
        this.f418335d = z17;
        this.f418336e = d1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = this.f418335d;
        if (z17) {
            nf2.d1 d1Var = this.f418336e;
            jz5.l lVar = d1Var.D;
            if (lVar == null) {
                lVar = new jz5.l(java.lang.Float.valueOf(d1Var.f418215c.f418257f), java.lang.Float.valueOf(d1Var.f418215c.f418258g));
            }
            nf2.g0 g0Var = d1Var.B;
            if (g0Var != null) {
                nf2.g0.e(g0Var, ((java.lang.Number) lVar.f384366d).floatValue(), ((java.lang.Number) lVar.f384367e).floatValue(), false, null, 12, null);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLyricsView", "setupPosition: positionManager ready, setInitialPosition=" + z17);
        return jz5.f0.f384359a;
    }
}
