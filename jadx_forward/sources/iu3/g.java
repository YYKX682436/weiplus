package iu3;

/* loaded from: classes5.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a f376536d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ iu3.i f376537e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, iu3.i iVar) {
        super(2);
        this.f376536d = c16997xb0aa383a;
        this.f376537e = iVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj2).intValue();
        if (intValue == 0) {
            this.f376536d.f237249m = true;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f376537e.f376540b, "onPlayMusicError, ret:" + intValue);
            if (this.f376536d.f237262z) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f376537e.f376540b, "onPlayMusicError, try switch to video!");
                this.f376536d.f237262z = false;
                ((ku5.t0) ku5.t0.f394148d).B(new iu3.f(this.f376537e, this.f376536d));
            }
        }
        return jz5.f0.f384359a;
    }
}
