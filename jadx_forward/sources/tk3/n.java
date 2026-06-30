package tk3;

/* loaded from: classes8.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tk3.t f501465d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f501466e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f501467f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(tk3.t tVar, java.lang.Boolean bool, java.lang.Boolean bool2) {
        super(0);
        this.f501465d = tVar;
        this.f501466e = bool;
        this.f501467f = bool2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        tk3.d dVar;
        tk3.t tVar = this.f501465d;
        if (tVar.p() && (dVar = tVar.f501482d) != null) {
            java.lang.Boolean bool = this.f501466e;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            java.lang.Boolean bool2 = this.f501467f;
            boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
            if (dVar.f501446a != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskNewFloatBallContainer", "hide MultiTaskFloatBallView, transAnim:" + booleanValue + ", alphaAnim:" + booleanValue2);
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1899x822d9a5b.C16608xd141945e c16608xd141945e = dVar.f501446a;
                if (c16608xd141945e != null) {
                    c16608xd141945e.p(booleanValue, booleanValue2, null);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
