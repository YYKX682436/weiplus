package com.tencent.mm.network;

/* loaded from: classes12.dex */
public class l1 extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f72061h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f72062i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f72063j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f72064k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f72065l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.network.g1 f72066m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(com.tencent.mm.network.g1 g1Var, long j17, java.lang.Integer num, java.lang.String str, int i17, long j18, java.lang.String str2, java.lang.String str3) {
        super(j17, num);
        this.f72066m = g1Var;
        this.f72061h = str;
        this.f72062i = i17;
        this.f72063j = j18;
        this.f72064k = str2;
        this.f72065l = str3;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        com.tencent.mm.network.g1 g1Var = this.f72066m;
        try {
            g1Var.f71991i.lock(2000L, "MMAutoAuth.uploadFile");
            int uploadFile = com.tencent.mars.magicbox.IPxxLogic.uploadFile(this.f72061h, 0, this.f72062i, this.f72063j, this.f72064k, this.f72065l);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "[+] uploadFile triggered, path: %s", this.f72061h);
            g1Var.f71991i.unLock();
            return java.lang.Integer.valueOf(uploadFile);
        } catch (java.lang.Throwable th6) {
            g1Var.f71991i.unLock();
            throw th6;
        }
    }
}
