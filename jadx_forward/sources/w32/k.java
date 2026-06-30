package w32;

/* loaded from: classes13.dex */
public class k extends com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o3 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f524215d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f524216e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f524217f;

    /* renamed from: g, reason: collision with root package name */
    public final int f524218g;

    public k(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        this.f524215d = null;
        this.f524216e = null;
        this.f524217f = null;
        this.f524218g = -1;
        this.f524215d = str;
        this.f524216e = str2;
        this.f524217f = str3;
        this.f524218g = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o3
    public boolean a(u32.n0 n0Var, w32.d dVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("execute MMWifiStatusSubscribeTaskExcuter. brandName=");
        java.lang.String str = this.f524215d;
        sb6.append(str);
        sb6.append(",deviceType=");
        java.lang.String str2 = this.f524216e;
        sb6.append(str2);
        sb6.append(",deviceId=");
        java.lang.String str3 = this.f524217f;
        sb6.append(str3);
        sb6.append(",reqType=");
        int i17 = this.f524218g;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.MMWifiStatusSubscribeTaskExcuter", sb6.toString());
        gm0.j1.n().f354821b.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.h0.f33958x366c91de, this);
        gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l2(str, str2, str3, i17));
        return false;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.MMWifiStatusSubscribeTaskExcuter", "onSceneEnd. errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.h0.f33958x366c91de, this);
    }
}
