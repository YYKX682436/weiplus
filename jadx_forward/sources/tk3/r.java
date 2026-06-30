package tk3;

/* loaded from: classes8.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tk3.t f501476d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f501477e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(tk3.t tVar, boolean z17) {
        super(0);
        this.f501476d = tVar;
        this.f501477e = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        tk3.d dVar = this.f501476d.f501482d;
        if (dVar != null && dVar.f501446a != null) {
            boolean z17 = this.f501477e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskNewFloatBallContainer", "resume FloatBallView, animation:%s", java.lang.Boolean.valueOf(z17));
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1899x822d9a5b.C16608xd141945e c16608xd141945e = dVar.f501446a;
            if (c16608xd141945e != null) {
                c16608xd141945e.u(z17, false, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
