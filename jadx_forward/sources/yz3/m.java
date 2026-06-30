package yz3;

@j95.b
/* loaded from: classes.dex */
public final class m extends i95.w implements kd0.r2 {

    /* renamed from: d, reason: collision with root package name */
    public int f550067d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f550068e;

    public m() {
        try {
            Ai();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanEntryConfigService", th6, "updateConfig exception", new java.lang.Object[0]);
        }
    }

    public void Ai() {
        int nj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2566x35c67d.C20665xf5921d6());
        this.f550067d = nj6;
        this.f550068e = nj6 == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanEntryConfigService", "updateConfig weDropConfig: " + this.f550067d + ", showSendFileEntry: " + this.f550068e);
    }

    public int wi() {
        if (!this.f550068e) {
            yz3.p[] pVarArr = yz3.p.f550073d;
            yz3.p[] pVarArr2 = yz3.p.f550073d;
            yz3.p[] pVarArr3 = yz3.p.f550073d;
            return 11;
        }
        yz3.p[] pVarArr4 = yz3.p.f550073d;
        yz3.p[] pVarArr5 = yz3.p.f550073d;
        yz3.p[] pVarArr6 = yz3.p.f550073d;
        yz3.p[] pVarArr7 = yz3.p.f550073d;
        return 15;
    }
}
