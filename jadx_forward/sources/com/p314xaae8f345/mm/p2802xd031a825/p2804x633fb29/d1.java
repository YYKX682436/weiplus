package com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29;

/* loaded from: classes9.dex */
public abstract class d1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: mBundle */
    private android.os.Bundle f39846xfd4b574f;

    /* renamed from: mRequestTime */
    private long f39849xee99eb4f;

    /* renamed from: mCmdId */
    private int f39847xbde36f88 = 0;

    /* renamed from: mProcessName */
    private java.lang.String f39848xb61c4eed = "";

    /* renamed from: sessionId */
    public long f39851x243a3e51 = 0;

    /* renamed from: mScene */
    private int f39850xbec0641f = 0;

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: dispatch */
    public int mo9409x10f9447a(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, com.p314xaae8f345.mm.p971x6de15a2e.l0 l0Var) {
        this.f39849xee99eb4f = java.lang.System.currentTimeMillis();
        rp3.c.a().getClass();
        com.p314xaae8f345.mm.p2802xd031a825.ui.b0.g(v0Var.mo13822xfb85f7b0());
        if (v0Var.mo47976x1de73f19() == 0) {
            v0Var.mo47987xb512c125(2);
        }
        return super.mo9409x10f9447a(sVar, v0Var, l0Var);
    }

    /* renamed from: getCgicmdForKV */
    public int mo66101xe8b43d29() {
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a3  */
    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo804x5f9cdc6f(int r31, int r32, int r33, java.lang.String r34, com.p314xaae8f345.mm.p971x6de15a2e.v0 r35, byte[] r36) {
        /*
            Method dump skipped, instructions count: 1475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1.mo804x5f9cdc6f(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    /* renamed from: onGYNetEnd */
    public abstract void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17);

    /* renamed from: setCmdId */
    public void m82987x52d1e4b3(int i17) {
        this.f39847xbde36f88 = i17;
    }

    /* renamed from: setProcessBundle */
    public void m82988x820c8e8f(android.os.Bundle bundle) {
        this.f39846xfd4b574f = bundle;
    }

    /* renamed from: setProcessName */
    public void m82989x7c4af7d8(java.lang.String str) {
        this.f39848xb61c4eed = str;
    }

    /* renamed from: setProcessSessionId */
    public void m82990x6fae0924(long j17) {
        this.f39851x243a3e51 = j17;
    }

    /* renamed from: setScene */
    public void m82991x53aed94a(int i17) {
        this.f39850xbec0641f = i17;
    }
}
