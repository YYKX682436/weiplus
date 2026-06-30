package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* loaded from: classes8.dex */
public class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264117d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f264118e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 f264119f;

    public o1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var, java.lang.String str, int i17) {
        this.f264119f = e0Var;
        this.f264117d = str;
        this.f264118e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var = this.f264119f;
        if (e0Var.f263719t != null) {
            java.lang.String str = this.f264117d;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                e0Var.f263719t.m74264xdc742163(str);
            }
            int i17 = this.f264118e;
            if (i17 != 0) {
                e0Var.f263719t.m74263xb124d9ed(i17);
            }
        }
    }
}
