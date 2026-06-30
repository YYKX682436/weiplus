package fu1;

/* loaded from: classes14.dex */
public class e extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f348366d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f348367e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f348368f;

    /* renamed from: g, reason: collision with root package name */
    public int f348369g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f348370h;

    public e(int i17, java.util.LinkedList linkedList, java.lang.String str, java.lang.String str2, r45.o46 o46Var, int i18, r45.pd6 pd6Var) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.y36();
        lVar.f152198b = new r45.z36();
        lVar.f152199c = "/cgi-bin/micromsg-bin/sharecarditem";
        lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.v0.f34420x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f348366d = a17;
        r45.y36 y36Var = (r45.y36) a17.f152243a.f152217a;
        y36Var.f472292d = i17;
        y36Var.f472293e = linkedList;
        y36Var.f472294f = str;
        y36Var.f472295g = str2;
        if (linkedList != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneShareCardItem", "list length is " + linkedList.size());
        }
        y36Var.f472296h = o46Var;
        y36Var.f472297i = i18;
        y36Var.f472298m = pd6Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f348367e = u0Var;
        return mo9409x10f9447a(sVar, this.f348366d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.v0.f34420x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneShareCardItem", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.v0.f34420x366c91de), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f348366d;
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneShareCardItem", "do ShareCardItem netscene success!");
            r45.z36 z36Var = (r45.z36) oVar.f152244b.f152233a;
            if (z36Var != null) {
                this.f348368f = z36Var.f473216f;
                this.f348369g = z36Var.f473214d;
                this.f348370h = z36Var.f473215e;
            }
        } else {
            r45.z36 z36Var2 = (r45.z36) oVar.f152244b.f152233a;
            if (z36Var2 != null) {
                this.f348368f = z36Var2.f473216f;
                this.f348369g = z36Var2.f473214d;
                this.f348370h = z36Var2.f473215e;
            }
        }
        this.f348367e.mo815x76e0bfae(i18, i19, str, this);
    }
}
