package su4;

/* loaded from: classes.dex */
public class m1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f494539d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f494540e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.rn3 f494541f;

    /* renamed from: g, reason: collision with root package name */
    public r45.sn3 f494542g;

    /* renamed from: h, reason: collision with root package name */
    public final int f494543h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Bitmap f494544i = null;

    public m1(r45.rn3 rn3Var, int i17) {
        this.f494543h = -1;
        this.f494541f = rn3Var;
        this.f494543h = i17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 4614;
        lVar.f152199c = "/cgi-bin/mmsearch-bin/searchshare";
        lVar.f152197a = rn3Var;
        lVar.f152198b = new r45.sn3();
        this.f494540e = lVar.a();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f494539d = u0Var;
        return mo9409x10f9447a(sVar, this.f494540e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 4614;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str};
        int i27 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.NetSceneGetSearchShare", "onGYNetEnd errType:%s errCode:%s errMsg:%s", objArr);
        this.f494542g = (r45.sn3) this.f494540e.f152244b.f152233a;
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f494539d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
