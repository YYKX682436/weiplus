package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes12.dex */
public class l1 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153594h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f153595i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f153596j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153597k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153598l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p971x6de15a2e.g1 f153599m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(com.p314xaae8f345.mm.p971x6de15a2e.g1 g1Var, long j17, java.lang.Integer num, java.lang.String str, int i17, long j18, java.lang.String str2, java.lang.String str3) {
        super(j17, num);
        this.f153599m = g1Var;
        this.f153594h = str;
        this.f153595i = i17;
        this.f153596j = j18;
        this.f153597k = str2;
        this.f153598l = str3;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.d8
    public java.lang.Object b() {
        com.p314xaae8f345.mm.p971x6de15a2e.g1 g1Var = this.f153599m;
        try {
            g1Var.f153524i.m40015x32c52b(2000L, "MMAutoAuth.uploadFile");
            int m40165xf17c8f1d = com.p314xaae8f345.p542x3306d5.p547xfbd5d8fe.C4561x5af5fd37.m40165xf17c8f1d(this.f153594h, 0, this.f153595i, this.f153596j, this.f153597k, this.f153598l);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "[+] uploadFile triggered, path: %s", this.f153594h);
            g1Var.f153524i.mo40017xcdd95364();
            return java.lang.Integer.valueOf(m40165xf17c8f1d);
        } catch (java.lang.Throwable th6) {
            g1Var.f153524i.mo40017xcdd95364();
            throw th6;
        }
    }
}
