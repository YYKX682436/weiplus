package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5;

/* loaded from: classes7.dex */
public class m implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f129009a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a f129010b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r f129011c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f129012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 f129013e;

    public m(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f fVar, ik1.b0 b0Var, com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r rVar, java.lang.String str, com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081) {
        this.f129009a = b0Var;
        this.f129010b = c19762x487075a;
        this.f129011c = rVar;
        this.f129012d = str;
        this.f129013e = c19772x1c2cd081;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c3
    public void a(cl.k1 k1Var) {
        this.f129009a.f373357a = k1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b3
    public void b(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "injectSdkScript-injectWithFd, contextId:%d, path:%s, onFailure:%s", java.lang.Integer.valueOf(this.f129011c.o()), this.f129012d, str);
        this.f129013e.f38869x6ac9171 = str;
        this.f129010b.f38859x6ac9171 = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b3
    /* renamed from: onSuccess */
    public void mo1150xe05b4124(java.lang.String str) {
        this.f129010b.f38859x6ac9171 = true;
    }
}
