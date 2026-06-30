package com.tencent.mm.modelavatar;

/* loaded from: classes11.dex */
public class q implements com.tencent.mm.sdk.platformtools.g6 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelavatar.r0 f70514d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelavatar.r f70515e;

    public q(com.tencent.mm.modelavatar.r rVar, com.tencent.mm.modelavatar.r0 r0Var) {
        this.f70515e = rVar;
        this.f70514d = null;
        this.f70514d = r0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.g6
    public boolean a() {
        com.tencent.mm.modelavatar.r0 r0Var = this.f70514d;
        if (r0Var == null || com.tencent.mm.sdk.platformtools.t8.K0(r0Var.e())) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AvatarService", "SaveNoImgAvatar imgFlag info is null");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(138L, 13L, 1L, true);
            return false;
        }
        com.tencent.mm.modelavatar.r rVar = this.f70515e;
        com.tencent.mm.modelavatar.s0 g17 = rVar.g();
        if (g17 != null) {
            com.tencent.mm.modelavatar.r0 n07 = g17.n0(r0Var.e());
            if (n07 != null) {
                java.lang.String d17 = n07.d();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
                    com.tencent.mm.modelavatar.z e17 = rVar.e();
                    if (e17 != null) {
                        e17.p(r0Var.e(), false);
                        e17.p(r0Var.e(), true);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.AvatarService", "SaveNoImgAvatar, small url is not same, must remove avatar file!! oldSmallUrl: %s, curSmallUrl: %s", r0Var.d(), d17);
                    return false;
                }
                n07.f70530b = 4;
                n07.f70536h = 0;
                n07.f70537i = -1;
                n07.f();
                g17.y0(n07);
                com.tencent.mars.xlog.Log.i("MicroMsg.AvatarService", "save no heading avatar curImgFlag username: %s", n07.e());
            } else {
                r0Var.f70530b = 4;
                r0Var.f70536h = 0;
                r0Var.f70537i = -1;
                r0Var.f();
                g17.y0(r0Var);
                com.tencent.mars.xlog.Log.i("MicroMsg.AvatarService", "save no heading avatar imgFlag username: %s", r0Var.e());
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AvatarService", "istg is null!!");
        }
        return true;
    }

    @Override // com.tencent.mm.sdk.platformtools.g6
    public boolean b() {
        com.tencent.mm.modelavatar.r0 r0Var = this.f70514d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(r0Var.e())) {
            return false;
        }
        this.f70515e.f70522e.remove(r0Var.e());
        return false;
    }
}
