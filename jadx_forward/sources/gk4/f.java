package gk4;

/* loaded from: classes10.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk4.r f354083d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(gk4.r rVar) {
        super(0);
        this.f354083d = rVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        dk4.a aVar;
        gk4.r rVar;
        yz5.p pVar;
        if ((!this.f354083d.f354139k.isEmpty()) && this.f354083d.f354144p == gk4.e.f354076e) {
            gk4.s sVar = ((hk4.a) this.f354083d.f354139k.getFirst()).f363462h;
            if (sVar != null && (aVar = sVar.f354162h) != null && (pVar = (rVar = this.f354083d).f354133e) != null) {
                pVar.mo149xb9724478(java.lang.Long.valueOf(rVar.f354145q), aVar);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f354083d.f354135g, "not callback progress");
        }
        return jz5.f0.f384359a;
    }
}
