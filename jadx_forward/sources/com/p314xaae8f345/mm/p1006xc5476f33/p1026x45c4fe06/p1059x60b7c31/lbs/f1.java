package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs;

/* loaded from: classes7.dex */
public class f1 extends k75.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.j1 f162945d;

    public f1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.j1 j1Var) {
        this.f162945d = j1Var;
    }

    @Override // k75.c
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RuntimeLocationUpdateStateManager", "enter stateNotListening");
        lk1.c cVar = (lk1.c) nd.f.a(lk1.c.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.j1 j1Var = this.f162945d;
        cVar.ia(j1Var.f162971n, j1Var.f162969i, j1Var.f162970m);
        this.f162945d.f162973p = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.i1 i1Var = this.f162945d.f162975r;
        if (i1Var != null) {
            i1Var.a("StateNotListening");
        }
    }

    @Override // k75.c
    public boolean c(android.os.Message message) {
        int i17 = message.what;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.j1 j1Var = this.f162945d;
        if (1 == i17) {
            j1Var.o(j1Var.f162977t);
            return true;
        }
        if (4 != i17) {
            return false;
        }
        j1Var.o(j1Var.f162977t);
        return true;
    }

    @Override // k75.c, k75.a
    /* renamed from: getName */
    public java.lang.String mo51017xfb82e301() {
        return this.f162945d.f386379d + "$StateListening";
    }
}
