package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes12.dex */
public class o1 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f153624h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f153625i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f153626j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p971x6de15a2e.g1 f153627k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(com.p314xaae8f345.mm.p971x6de15a2e.g1 g1Var, long j17, java.lang.Object obj, java.util.Map map, boolean z17, boolean z18) {
        super(j17, obj);
        this.f153627k = g1Var;
        this.f153624h = map;
        this.f153625i = z17;
        this.f153626j = z18;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.d8
    public java.lang.Object b() {
        java.util.Map<java.lang.String, java.lang.Integer> map = this.f153624h;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(map.size());
        boolean z17 = this.f153625i;
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z17);
        boolean z18 = this.f153626j;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "paymmtls: dispatchPayMmtlsCtrlInfo in synctask, payMMTlsHostMap size: %s, payMMTlsValid: %s, usePayMMTls: %s", valueOf, valueOf2, java.lang.Boolean.valueOf(z18));
        ((com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80) com.p314xaae8f345.p2841xd11c237d.C23005xa52e04fa.m84213x6f964b77(com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.class)).m84339xf0b7bb06(map, z18, z17);
        return null;
    }
}
