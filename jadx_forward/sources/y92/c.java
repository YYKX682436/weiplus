package y92;

/* loaded from: classes2.dex */
public final class c extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f541866d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f541867e;

    public c(java.lang.String shortUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shortUrl, "shortUrl");
        r45.la1 la1Var = new r45.la1();
        la1Var.set(1, db2.t4.f309704a.a(6277));
        la1Var.set(7, shortUrl);
        this.f541866d = y92.b.f541864u.a(la1Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneFinderGetTopicInfo", "[init] shortUrl:".concat(shortUrl));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f541867e = u0Var;
        return mo9409x10f9447a(sVar, this.f541866d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 6277;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneFinderGetTopicInfo", "errType " + i18 + ", errCode " + i19 + ", errMsg " + str);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f541867e;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
