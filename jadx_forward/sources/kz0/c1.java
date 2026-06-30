package kz0;

/* loaded from: classes5.dex */
public final class c1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ty0.b1 f395203d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f395204e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(ty0.b1 b1Var, n0.v2 v2Var) {
        super(2);
        this.f395203d = b1Var;
        this.f395204e = v2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj2).booleanValue();
        int i17 = kz0.k1.f395300a;
        if (((java.lang.Boolean) this.f395204e.mo128745x754a37bb()).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplateUIPage", "TemplateUIPage: no need to mute music");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplateUIPage", "TemplateUIPage: muteMusic " + booleanValue);
            ty0.b1 b1Var = this.f395203d;
            if (booleanValue2) {
                b1Var.f504331h.mo149xb9724478(java.lang.Boolean.valueOf(booleanValue), b1Var.f504328e.mo128745x754a37bb());
            } else {
                b1Var.f504330g.mo149xb9724478(java.lang.Boolean.valueOf(booleanValue), b1Var.f504328e.mo128745x754a37bb());
            }
        }
        return jz5.f0.f384359a;
    }
}
