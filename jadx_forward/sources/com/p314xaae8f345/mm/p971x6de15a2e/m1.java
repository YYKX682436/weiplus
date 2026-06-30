package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes12.dex */
public class m1 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f153607h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f153608i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int[] f153609j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f153610k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f153611l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153612m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153613n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153614o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p971x6de15a2e.g1 f153615p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(com.p314xaae8f345.mm.p971x6de15a2e.g1 g1Var, long j17, java.lang.Integer num, int i17, int i18, int[] iArr, boolean z17, long j18, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(j17, num);
        this.f153615p = g1Var;
        this.f153607h = i17;
        this.f153608i = i18;
        this.f153609j = iArr;
        this.f153610k = z17;
        this.f153611l = j18;
        this.f153612m = str;
        this.f153613n = str2;
        this.f153614o = str3;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.d8
    public java.lang.Object b() {
        com.p314xaae8f345.mm.p971x6de15a2e.g1 g1Var = this.f153615p;
        try {
            g1Var.f153524i.m40015x32c52b(2000L, "MMAutoAuth.uploadLog");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40529x312e01fd();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "[+] uploadLog triggered, hours: [%s, %s].", java.lang.Integer.valueOf(this.f153607h), java.lang.Integer.valueOf(this.f153608i));
            int m40166x49dad183 = com.p314xaae8f345.p542x3306d5.p547xfbd5d8fe.C4561x5af5fd37.m40166x49dad183(0, this.f153609j, this.f153610k, this.f153611l, "", this.f153612m, this.f153607h, this.f153608i, this.f153613n, this.f153614o);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "[+] uploadLog triggered.");
            g1Var.f153524i.mo40017xcdd95364();
            return java.lang.Integer.valueOf(m40166x49dad183);
        } catch (java.lang.Throwable th6) {
            g1Var.f153524i.mo40017xcdd95364();
            throw th6;
        }
    }
}
