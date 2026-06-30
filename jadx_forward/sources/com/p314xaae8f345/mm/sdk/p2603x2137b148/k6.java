package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes.dex */
public class k6 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.p6 f274343d;

    public k6(com.p314xaae8f345.mm.sdk.p2603x2137b148.p6 p6Var) {
        this.f274343d = p6Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f274343d.a(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RWCache", "summer timer onTimerExpired e appendAll takes: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " ms");
        return false;
    }
}
