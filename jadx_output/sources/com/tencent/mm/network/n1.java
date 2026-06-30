package com.tencent.mm.network;

/* loaded from: classes12.dex */
public class n1 extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f72086h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.network.g1 f72087i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(com.tencent.mm.network.g1 g1Var, long j17, java.lang.Integer num, int i17) {
        super(j17, num);
        this.f72087i = g1Var;
        this.f72086h = i17;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        int i17 = this.f72086h;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "[+] Cancel upload log %s, ret = %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(com.tencent.mars.magicbox.IPxxLogic.cancelUpload(i17)));
        return 0;
    }
}
