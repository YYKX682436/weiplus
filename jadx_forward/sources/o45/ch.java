package o45;

/* loaded from: classes9.dex */
public class ch extends o45.zg implements o45.xg {

    /* renamed from: a, reason: collision with root package name */
    public int f424445a;

    /* renamed from: b, reason: collision with root package name */
    public int f424446b = 0;

    @Override // o45.zg
    /* renamed from: getCmdId */
    public int mo13850x7443ca3f() {
        return 312;
    }

    @Override // o45.xg
    /* renamed from: getFuncId */
    public int mo13851x19c9adf5() {
        return 0;
    }

    @Override // o45.zg
    /* renamed from: getShortSupport */
    public boolean mo150590x4bad6229() {
        return false;
    }

    @Override // o45.zg, o45.xg
    /* renamed from: isRawData */
    public boolean mo150591x182b0f68() {
        return true;
    }

    @Override // o45.xg
    /* renamed from: toProtoBuf */
    public byte[] mo13852xc3d7db06() {
        r45.hh hhVar = new r45.hh();
        hhVar.f457675d = o45.wf.f424562g;
        hhVar.f457676e = 2;
        hhVar.f457677f = this.f424445a;
        int i17 = this.f424446b;
        hhVar.f457678g = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMBgFg", "somr online:%d nettype:%d ver:%d devid:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(hhVar.f457677f), java.lang.Integer.valueOf(hhVar.f457675d), java.lang.Integer.valueOf(hhVar.f457676e));
        try {
            return hhVar.mo14344x5f01b1f6();
        } catch (java.io.IOException e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMBgFg", "MMBgfg toProtoBuf exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return null;
        }
    }
}
