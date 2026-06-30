package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29;

/* loaded from: classes4.dex */
public class c0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f240367d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f240368e;

    public c0(java.lang.String str, java.util.LinkedList linkedList, int i17, java.lang.String str2, double d17, double d18) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.rk();
        lVar.f152198b = new r45.sk();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/usrmsg/bizscangetactioninfo";
        lVar.f152200d = 1068;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f240368e = a17;
        r45.rk rkVar = (r45.rk) a17.f152243a.f152217a;
        rkVar.f466487d = str;
        rkVar.f466489f = i17;
        rkVar.f466490g = str2;
        rkVar.f466488e = linkedList;
        rkVar.f466492i = d18;
        rkVar.f466491h = d17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f240367d = u0Var;
        return mo9409x10f9447a(sVar, this.f240368e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1068;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetActionInfo", "onGYNetEnd errtype:" + i18 + " errcode:" + i19 + " errMsg:" + str);
        this.f240367d.mo815x76e0bfae(i18, i19, str, this);
    }
}
