package sf4;

/* loaded from: classes4.dex */
public final class x1 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18499x2fc2446b f489148d;

    public x1(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18499x2fc2446b c18499x2fc2446b) {
        this.f489148d = c18499x2fc2446b;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    public void T4(int i17, int i18) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onCompletion */
    public void mo9755xa6db431b() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18499x2fc2446b.f253643a2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18499x2fc2446b c18499x2fc2446b = this.f489148d;
        java.lang.String str = c18499x2fc2446b.f271272e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("localVideo onCompleted, isFakeVideo:");
        if4.h hVar = c18499x2fc2446b.W1;
        sb6.append(hVar != null ? java.lang.Boolean.valueOf(hVar.a()) : null);
        sb6.append(", fakeStartTime:0");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if4.h hVar2 = c18499x2fc2446b.W1;
        if (hVar2 == null || !hVar2.a()) {
        }
        c18499x2fc2446b.f271281q.a(0.0d, true);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 b1Var = c18499x2fc2446b.f271284t;
        if (b1Var != null) {
            b1Var.E(c18499x2fc2446b.mo66135x23a7af9b(), c18499x2fc2446b.mo48228x75e04be9());
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onError */
    public void mo9756xaf8aa769(int i17, int i18) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onPrepared */
    public void mo9757x58d5b73c() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18499x2fc2446b.f253643a2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18499x2fc2446b c18499x2fc2446b = this.f489148d;
        java.lang.String str = c18499x2fc2446b.f271272e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("localVideo onPrepared, isLocalVideoPause:");
        sb6.append(c18499x2fc2446b.T1);
        sb6.append(", isFakeVideo:");
        if4.h hVar = c18499x2fc2446b.W1;
        sb6.append(hVar != null ? java.lang.Boolean.valueOf(hVar.a()) : null);
        sb6.append(", fakeStartTime:0, fakeEndTime:0");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (c18499x2fc2446b.T1) {
            return;
        }
        if4.h hVar2 = c18499x2fc2446b.W1;
        if (hVar2 == null || !hVar2.a()) {
        }
        c18499x2fc2446b.f271281q.mo69330x68ac462();
        c18499x2fc2446b.f271281q.mo69322xfae314df(new sf4.w1(c18499x2fc2446b));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    public int q(int i17, int i18) {
        if4.h hVar = this.f489148d.W1;
        if (hVar == null) {
            return 0;
        }
        hVar.a();
        return 0;
    }
}
