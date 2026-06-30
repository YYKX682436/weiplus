package com.tencent.mm.modelsimple;

/* loaded from: classes9.dex */
public class c0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f71293d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f71294e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f71295f;

    /* renamed from: g, reason: collision with root package name */
    public final int f71296g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f71297h;

    public c0(int i17, java.util.List list, java.lang.String str) {
        this.f71296g = i17;
        this.f71295f = list;
        this.f71297h = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x01f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[SYNTHETIC] */
    @Override // com.tencent.mm.modelbase.m1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int doScene(com.tencent.mm.network.s r33, com.tencent.mm.modelbase.u0 r34) {
        /*
            Method dump skipped, instructions count: 1153
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelsimple.c0.doScene(com.tencent.mm.network.s, com.tencent.mm.modelbase.u0):int");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 837;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCheckSysShare", "errType %d, errCode %d, errMsg", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f71293d.onSceneEnd(i18, i19, str, this);
    }
}
