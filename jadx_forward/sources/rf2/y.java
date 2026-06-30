package rf2;

/* loaded from: classes7.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rf2.v0 f476494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f476495e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f476496f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(rf2.v0 v0Var, java.lang.String str, p3325xe03a0797.p3326xc267989b.q qVar) {
        super(1);
        this.f476494d = v0Var;
        this.f476495e = str;
        this.f476496f = qVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f476494d.f476449c, "follow biz " + this.f476495e + " result = " + booleanValue);
        ((p3325xe03a0797.p3326xc267989b.r) this.f476496f).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(booleanValue)));
        return jz5.f0.f384359a;
    }
}
