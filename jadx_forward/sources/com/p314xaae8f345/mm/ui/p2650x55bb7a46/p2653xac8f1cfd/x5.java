package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class x5 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d f281749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f281750e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f281751f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.c6 f281752g;

    public x5(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.c6 c6Var, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.util.HashSet hashSet) {
        this.f281752g = c6Var;
        this.f281749d = dVar;
        this.f281750e = f9Var;
        this.f281751f = hashSet;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = this.f281749d;
        if (i17 == 0 && gVar != null) {
            dVar.f68109x90a9378 = gVar.f69496x83ec3dd;
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().mo9952xce0038c9(dVar, new java.lang.String[0]);
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.c6 c6Var = this.f281752g;
        java.util.HashSet hashSet = this.f281751f;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f281750e;
        if (i17 == 0 && hVar != null && hVar.f69553xb5f54fe9 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingMoreBtnBarHelper", "oreh downloadTpFileAndFav success msgID:%d", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
            dVar.f68112x10a0fed7 = 199L;
            dVar.f68109x90a9378 = dVar.f68113xeb1a61d6;
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().mo9952xce0038c9(dVar, new java.lang.String[0]);
            f9Var.r1(3);
            ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).bb(f9Var.m124847x74d37ac6(), f9Var);
            hashSet.remove(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
            c6Var.a(hashSet);
        }
        if (i17 != 0 || (hVar != null && hVar.f69553xb5f54fe9 != 0)) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Long.valueOf(f9Var.m124847x74d37ac6());
            objArr[1] = java.lang.Integer.valueOf(i17);
            objArr[2] = java.lang.Integer.valueOf(hVar == null ? 0 : hVar.f69553xb5f54fe9);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingMoreBtnBarHelper", "oreh downloadTpFileAndFav success msgID:%d, error(%d,%d)", objArr);
            hashSet.remove(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
            c6Var.a(hashSet);
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
