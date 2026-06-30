package iy4;

/* loaded from: classes5.dex */
public class w0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f377551g;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f377552d;

    /* renamed from: e, reason: collision with root package name */
    public final int f377553e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f377554f;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f377551g = hashMap;
        hashMap.put(14, 1);
        hashMap.put(15, 2);
        hashMap.put(37, 37);
        hashMap.put(38, 38);
        hashMap.put(39, 39);
    }

    public w0(int i17, int i18, java.lang.String str, int i19) {
        this.f377553e = i17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.pm0 pm0Var = new r45.pm0();
        r45.qm0 qm0Var = new r45.qm0();
        lVar.f152197a = pm0Var;
        lVar.f152198b = qm0Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/extdevicecontrol";
        lVar.f152200d = gd1.w.f69815x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        pm0Var.f464707d = i17;
        pm0Var.f464708e = i18;
        pm0Var.f464709f = str;
        pm0Var.f464710g = i19;
        this.f377554f = lVar.a();
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = str != null ? java.lang.Integer.valueOf(str.length()) : "-1";
        objArr[3] = java.lang.Integer.valueOf(i19);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneExtDeviceControl", "NetSceneExtDeviceControl() called with opCode:%s device:%s uuid:%s scene:%s", objArr);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f377552d = u0Var;
        return mo9409x10f9447a(sVar, this.f377554f, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return gd1.w.f69815x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f377552d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
