package pn2;

/* loaded from: classes3.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km2.z f438543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pn2.s f438544e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(km2.z zVar, pn2.s sVar) {
        super(0);
        this.f438543d = zVar;
        this.f438544e = sVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        km2.z zVar = this.f438543d;
        if (zVar.f390765d != null) {
            pn2.s sVar = this.f438544e;
            pn2.d0 c17 = pn2.s.c(sVar, zVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(sVar.f438548g, "updateStatus " + c17);
            boolean z17 = c17.f438518a;
            if (z17) {
                sVar.s(z17, c17.f438519b, c17.f438521d, c17.f438522e);
            }
        }
        return jz5.f0.f384359a;
    }
}
