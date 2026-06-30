package com.p314xaae8f345.mm.p943x351df9c2;

/* loaded from: classes11.dex */
public class q implements com.p314xaae8f345.mm.sdk.p2603x2137b148.g6 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p943x351df9c2.r0 f152047d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p943x351df9c2.r f152048e;

    public q(com.p314xaae8f345.mm.p943x351df9c2.r rVar, com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var) {
        this.f152048e = rVar;
        this.f152047d = null;
        this.f152047d = r0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    public boolean a() {
        com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var = this.f152047d;
        if (r0Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0Var.e())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AvatarService", "SaveNoImgAvatar imgFlag info is null");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(138L, 13L, 1L, true);
            return false;
        }
        com.p314xaae8f345.mm.p943x351df9c2.r rVar = this.f152048e;
        com.p314xaae8f345.mm.p943x351df9c2.s0 g17 = rVar.g();
        if (g17 != null) {
            com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = g17.n0(r0Var.e());
            if (n07 != null) {
                java.lang.String d17 = n07.d();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
                    com.p314xaae8f345.mm.p943x351df9c2.z e17 = rVar.e();
                    if (e17 != null) {
                        e17.p(r0Var.e(), false);
                        e17.p(r0Var.e(), true);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarService", "SaveNoImgAvatar, small url is not same, must remove avatar file!! oldSmallUrl: %s, curSmallUrl: %s", r0Var.d(), d17);
                    return false;
                }
                n07.f152063b = 4;
                n07.f152069h = 0;
                n07.f152070i = -1;
                n07.f();
                g17.y0(n07);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarService", "save no heading avatar curImgFlag username: %s", n07.e());
            } else {
                r0Var.f152063b = 4;
                r0Var.f152069h = 0;
                r0Var.f152070i = -1;
                r0Var.f();
                g17.y0(r0Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarService", "save no heading avatar imgFlag username: %s", r0Var.e());
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarService", "istg is null!!");
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    public boolean b() {
        com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var = this.f152047d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0Var.e())) {
            return false;
        }
        this.f152048e.f152055e.remove(r0Var.e());
        return false;
    }
}
