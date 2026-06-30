package gp2;

/* loaded from: classes2.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f355840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f355841e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.h1 f355842f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(yz5.p pVar, gp2.l0 l0Var, so2.h1 h1Var) {
        super(2);
        this.f355840d = pVar;
        this.f355841e = l0Var;
        this.f355842f = h1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        yz5.p pVar = this.f355840d;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2));
        }
        boolean z17 = gp2.l0.N;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f355841e.t(), "checkAutoPlayByOutside: videoSizeChangeCallback feed=" + this.f355842f + " w=" + intValue + " h=" + intValue2);
        return jz5.f0.f384359a;
    }
}
