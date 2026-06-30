package wt3;

/* loaded from: classes5.dex */
public final class b1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wt3.c1 f530916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f530917e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a f530918f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(wt3.c1 c1Var, yz5.p pVar, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a) {
        super(2);
        this.f530916d = c1Var;
        this.f530917e = pVar;
        this.f530918f = c16997xb0aa383a;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String str = (java.lang.String) obj2;
        wt3.c1 c1Var = this.f530916d;
        wt3.c1.a(c1Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cacheAudio callback ");
        sb6.append(booleanValue);
        sb6.append(", ");
        yz5.p pVar = this.f530917e;
        sb6.append(pVar == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryAudioManager", sb6.toString());
        c1Var.f530921a.remove(java.lang.Integer.valueOf(this.f530918f.f237244e));
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Boolean.valueOf(booleanValue), str);
        }
        return jz5.f0.f384359a;
    }
}
