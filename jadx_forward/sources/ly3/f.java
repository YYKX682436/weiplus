package ly3;

/* loaded from: classes11.dex */
public class f extends z73.a implements ly3.e {
    public f(java.lang.String str, java.lang.String str2, boolean z17) {
        this.f552105i = "rtosconfig";
        this.f552102f = str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str2);
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274648k ? "_arm64-v8a" : "_armeabi-v7a");
        this.f552103g = sb6.toString();
        java.util.LinkedList c17 = z73.h.c();
        this.f552104h = c17;
        r45.e35 e35Var = new r45.e35();
        e35Var.f454501d = "patchId";
        e35Var.f454502e = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getString("patch_id", "").toString();
        c17.add(e35Var);
        this.f552108o = !z17 ? 1 : 0;
    }

    @Override // z73.a, com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.NetSceneCheckSoRes", "doScene type:%s, baseId:%s, patchId:%s, scene:%d", this.f552105i, this.f552102f, this.f552103g, java.lang.Integer.valueOf(this.f552108o));
        return super.mo807x6c193ac1(sVar, u0Var);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.NetSceneCheckSoRes", "errType:%d errCode:%d errMsg:%s ", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f552101e.mo815x76e0bfae(i18, i19, str, this);
    }
}
