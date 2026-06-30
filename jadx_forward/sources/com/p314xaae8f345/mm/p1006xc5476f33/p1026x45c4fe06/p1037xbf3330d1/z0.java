package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1;

/* loaded from: classes7.dex */
public class z0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.h5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.b1 f158536a;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.b1 b1Var) {
        this.f158536a = b1Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.h5
    public void a(int i17) {
        if (i17 == 1 || i17 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMBackgroundRunningManagerService", "onPhoneCall, kill voip, state:%s", java.lang.Integer.valueOf(i17));
            this.f158536a.wi();
        }
    }
}
