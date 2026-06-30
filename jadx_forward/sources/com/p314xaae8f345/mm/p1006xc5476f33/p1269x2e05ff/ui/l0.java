package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui;

/* loaded from: classes14.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f174842d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.ResultReceiver f174843e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0 f174844f;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0 q0Var, boolean z17, android.os.ResultReceiver resultReceiver) {
        this.f174844f = q0Var;
        this.f174842d = z17;
        this.f174843e = resultReceiver;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = this.f174844f.f174879d;
        if (nVar != null) {
            op1.a aVar = nVar.f174861m;
            aVar.getClass();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            aVar.f428768a = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0 = nVar.f174851c;
            if (c12929x567537a0 == null || nVar.f174852d == null) {
                return;
            }
            c12929x567537a0.H(false, null);
            nVar.f174852d.m54206xad762f83(false);
            nVar.f174852d.m54205xd1284e35(true);
            nVar.f174852d.i(null, this.f174843e);
            nVar.f174863o = this.f174842d;
        }
    }
}
