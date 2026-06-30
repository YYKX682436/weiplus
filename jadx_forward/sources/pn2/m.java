package pn2;

/* loaded from: classes3.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pn2.s f438537d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km2.z f438538e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(pn2.s sVar, km2.z zVar) {
        super(0);
        this.f438537d = sVar;
        this.f438538e = zVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f438537d.f438548g, "resumeStatus statusResume:" + this.f438537d.f438553o + ",lotteryInfo:" + this.f438538e);
        if (this.f438538e.f390765d != null && !this.f438537d.f438553o) {
            this.f438537d.f438553o = true;
            pn2.d0 c17 = pn2.s.c(this.f438537d, this.f438538e);
            c17.f438522e = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f438537d.f438548g, "resumeStatus " + c17);
            this.f438537d.s(c17.f438518a, c17.f438519b, c17.f438521d, c17.f438522e);
        }
        return jz5.f0.f384359a;
    }
}
