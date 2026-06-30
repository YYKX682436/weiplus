package su4;

/* loaded from: classes.dex */
public class k1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f494507d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f494508e;

    /* renamed from: f, reason: collision with root package name */
    public r45.aa7 f494509f;

    /* renamed from: g, reason: collision with root package name */
    public final su4.r1 f494510g;

    public k1(su4.r1 r1Var) {
        this.f494510g = r1Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 4384;
        lVar.f152199c = "/cgi-bin/mmsearch-bin/emojichatsearch";
        lVar.f152197a = new r45.z97();
        lVar.f152198b = new r45.aa7();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f494508e = a17;
        r1Var.a((r45.z97) a17.f152243a.f152217a, 10, su4.r2.i(), su4.r2.g());
        su4.k2.d(r1Var.f494599f, r1Var.f494615v, r1Var.f494616w, r1Var.f494600g, r1Var.f494596c, r1Var.f494594a == 1, r1Var.f494618y, r1Var.f494595b, r1Var.f494597d);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f494507d = u0Var;
        return mo9409x10f9447a(sVar, this.f494508e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 4384;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str};
        int i27 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.NetSceneEmojiSearch", "onGYNetEnd errType:%s errCode:%s errMsg:%s", objArr);
        r45.aa7 aa7Var = (r45.aa7) this.f494508e.f152244b.f152233a;
        this.f494509f = aa7Var;
        su4.r1 r1Var = this.f494510g;
        if (i18 != 0 || i19 != 0) {
            su4.k2.e(r1Var.f494599f, r1Var.f494615v, r1Var.f494616w, r1Var.f494600g, r1Var.f494596c, r1Var.f494594a == 1, r1Var.f494618y, false, r1Var.f494595b, r1Var.f494597d);
        } else if (aa7Var != null) {
            su4.k2.e(r1Var.f494599f, r1Var.f494615v, r1Var.f494616w, r1Var.f494600g, r1Var.f494596c, r1Var.f494594a == 1, r1Var.f494618y, true, r1Var.f494595b, r1Var.f494597d);
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f494507d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
