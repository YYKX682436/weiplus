package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes4.dex */
public class s2 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f99058d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f99059e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f99060f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f99061g;

    /* renamed from: h, reason: collision with root package name */
    public final int f99062h;

    public s2(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        this.f99061g = str3;
        this.f99059e = str;
        this.f99060f = str2;
        this.f99062h = i17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f99058d = u0Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.hs6();
        lVar.f70665b = new r45.is6();
        lVar.f70666c = "/cgi-bin/mmoc-bin/hardware/updatemydeviceattr";
        lVar.f70667d = 1263;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        r45.hs6 hs6Var = (r45.hs6) a17.f70710a.f70684a;
        hs6Var.f376439f = this.f99061g;
        hs6Var.f376438e = this.f99059e;
        hs6Var.f376437d = this.f99060f;
        hs6Var.f376440g = this.f99062h;
        return dispatch(sVar, a17, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1263;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f99058d.onSceneEnd(i18, i19, str, this);
    }
}
