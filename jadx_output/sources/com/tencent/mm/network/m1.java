package com.tencent.mm.network;

/* loaded from: classes12.dex */
public class m1 extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f72074h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f72075i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int[] f72076j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f72077k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f72078l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f72079m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f72080n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f72081o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.network.g1 f72082p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(com.tencent.mm.network.g1 g1Var, long j17, java.lang.Integer num, int i17, int i18, int[] iArr, boolean z17, long j18, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(j17, num);
        this.f72082p = g1Var;
        this.f72074h = i17;
        this.f72075i = i18;
        this.f72076j = iArr;
        this.f72077k = z17;
        this.f72078l = j18;
        this.f72079m = str;
        this.f72080n = str2;
        this.f72081o = str3;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        com.tencent.mm.network.g1 g1Var = this.f72082p;
        try {
            g1Var.f71991i.lock(2000L, "MMAutoAuth.uploadLog");
            com.tencent.mars.xlog.Log.appenderFlush();
            com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "[+] uploadLog triggered, hours: [%s, %s].", java.lang.Integer.valueOf(this.f72074h), java.lang.Integer.valueOf(this.f72075i));
            int uploadLog = com.tencent.mars.magicbox.IPxxLogic.uploadLog(0, this.f72076j, this.f72077k, this.f72078l, "", this.f72079m, this.f72074h, this.f72075i, this.f72080n, this.f72081o);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "[+] uploadLog triggered.");
            g1Var.f71991i.unLock();
            return java.lang.Integer.valueOf(uploadLog);
        } catch (java.lang.Throwable th6) {
            g1Var.f71991i.unLock();
            throw th6;
        }
    }
}
