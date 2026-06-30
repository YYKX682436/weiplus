package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes7.dex */
public class b4 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: f, reason: collision with root package name */
    public static int f274006f;

    /* renamed from: a, reason: collision with root package name */
    public final int f274007a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f274008b;

    /* renamed from: c, reason: collision with root package name */
    public long f274009c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f274010d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 f274011e;

    public b4(com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 a4Var, boolean z17) {
        this.f274009c = 0L;
        this.f274010d = false;
        this.f274011e = a4Var;
        this.f274007a = b();
        this.f274008b = z17;
        if (java.lang.Thread.currentThread().getName().equals("initThread") || "initThread".equals(xu5.b.e())) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MTimerHandler", "MTimerHandler can not init handler with initThread, stack %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        }
    }

    public static int b() {
        if (f274006f >= 8192) {
            f274006f = 0;
        }
        int i17 = f274006f + 1;
        f274006f = i17;
        return i17;
    }

    public void c(long j17, long j18) {
        this.f274009c = j18;
        d();
        this.f274010d = false;
        mo50307xb9e94560(this.f274007a, j17);
    }

    public void d() {
        mo50303x856b99f0(this.f274007a);
        this.f274010d = true;
    }

    public boolean e() {
        return this.f274010d || !mo50285x8fc9be06(this.f274007a);
    }

    /* renamed from: finalize */
    public void m77725xd764dc1e() {
        d();
        super.finalize();
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 a4Var;
        int i17 = message.what;
        int i18 = this.f274007a;
        if (i17 == i18 && (a4Var = this.f274011e) != null && a4Var.mo322xdd48fb9f() && this.f274008b && !this.f274010d) {
            mo50307xb9e94560(i18, this.f274009c);
        }
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: toString */
    public java.lang.String mo77726x9616526c() {
        if (this.f274011e == null) {
            return "MTimerHandler(" + getClass().getName() + "){mCallBack = null}";
        }
        return "MTimerHandler(" + getClass().getName() + "){mCallBack = " + this.f274011e.getClass().getName() + "}";
    }

    public b4(android.os.Looper looper, com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 a4Var, boolean z17) {
        super(looper);
        this.f274009c = 0L;
        this.f274010d = false;
        this.f274011e = a4Var;
        this.f274007a = b();
        this.f274008b = z17;
        if (java.lang.Thread.currentThread().getName().equals("initThread") || "initThread".equals(xu5.b.e())) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MTimerHandler", "MTimerHandler can not init handler with initThread, stack %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        }
    }

    public b4(java.lang.String str, com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 a4Var, boolean z17) {
        super(str);
        this.f274009c = 0L;
        this.f274010d = false;
        this.f274011e = a4Var;
        this.f274007a = b();
        this.f274008b = z17;
    }

    public b4(xu5.b bVar, com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 a4Var, boolean z17) {
        super(bVar);
        this.f274009c = 0L;
        this.f274010d = false;
        this.f274011e = a4Var;
        this.f274007a = b();
        this.f274008b = z17;
    }
}
