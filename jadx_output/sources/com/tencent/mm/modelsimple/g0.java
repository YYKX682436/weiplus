package com.tencent.mm.modelsimple;

/* loaded from: classes12.dex */
public class g0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f71322d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.network.v0 f71323e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f71324f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f71325g;

    public g0(int i17, java.util.List list, byte[] bArr) {
        this.f71324f = "";
        iz5.a.g(null, (list == null || list.size() <= 0 || bArr == null) ? false : true);
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
        java.lang.String str = (java.lang.String) list.get(0);
        for (int i18 = 1; i18 < list.size(); i18++) {
            str = str + "," + ((java.lang.String) list.get(i18)).trim();
        }
        com.tencent.mm.modelsimple.f0 f0Var = new com.tencent.mm.modelsimple.f0();
        this.f71323e = f0Var;
        o45.ih ihVar = (o45.ih) f0Var.getReqObj();
        ihVar.f342956a = i17;
        ihVar.f342957b = 0;
        ihVar.f342958c = currentTimeMillis;
        iz5.a.g(null, str != null);
        ihVar.f342959d = str;
        iz5.a.g(null, bArr != null);
        ihVar.f342960e = bArr;
        kk.u.a(bArr, 0);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f71322d = u0Var;
        return dispatch(sVar, this.f71323e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 10;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f71322d.onSceneEnd(i18, i19, str, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public boolean uniqueInNetsceneQueue() {
        return true;
    }

    public g0(o45.ah ahVar) {
        this.f71324f = "";
        o45.jh jhVar = (o45.jh) ahVar;
        this.f71324f = jhVar.f342969a;
        this.f71325g = jhVar.f342970b;
    }
}
