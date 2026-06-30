package yt3;

/* loaded from: classes10.dex */
public final class e4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a f546955d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f546956e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yt3.r4 f546957f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, yz5.a aVar, yt3.r4 r4Var) {
        super(2);
        this.f546955d = c16997xb0aa383a;
        this.f546956e = aVar;
        this.f546957f = r4Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemuxPlugin", "cacheAudio callback success " + booleanValue);
        if (booleanValue) {
            this.f546955d.f237249m = true;
            this.f546956e.mo152xb9724478();
            ru3.f fVar = this.f546957f.f547180e;
            if (fVar != null) {
                fVar.f481288b = yt3.c4.f546927d;
            }
        } else {
            ((ku5.t0) ku5.t0.f394148d).B(new yt3.d4(this.f546957f));
            yt3.r4.b(this.f546957f);
        }
        return jz5.f0.f384359a;
    }
}
