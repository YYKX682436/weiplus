package com.tencent.mm.modelavatar;

/* loaded from: classes11.dex */
public class p implements com.tencent.mm.sdk.platformtools.g6 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelavatar.r0 f70508d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f70509e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Bitmap f70510f = null;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelavatar.r f70511g;

    public p(com.tencent.mm.modelavatar.r rVar, com.tencent.mm.modelavatar.r0 r0Var, byte[] bArr) {
        this.f70511g = rVar;
        this.f70508d = null;
        this.f70508d = r0Var;
        this.f70509e = bArr;
    }

    @Override // com.tencent.mm.sdk.platformtools.g6
    public boolean a() {
        com.tencent.mm.modelavatar.r0 r0Var = this.f70508d;
        if (r0Var == null || com.tencent.mm.sdk.platformtools.t8.K0(r0Var.e())) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AvatarService", "SaveAvatar imgFlag info is null");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(138L, 13L, 1L, true);
            return false;
        }
        int i17 = com.tencent.mm.modelavatar.r.f70520o;
        com.tencent.mm.modelavatar.r rVar = this.f70511g;
        com.tencent.mm.modelavatar.z e17 = rVar.e();
        if (e17 != null) {
            e17.p(r0Var.e(), false);
            e17.p(r0Var.e(), true);
            android.graphics.Bitmap r17 = e17.r(r0Var.e(), this.f70509e);
            this.f70510f = r17;
            if (r17 == null) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(138L, 14L, 1L, true);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AvatarService", "astg is null!!");
        }
        com.tencent.mm.modelavatar.s0 g17 = rVar.g();
        if (g17 != null) {
            com.tencent.mm.modelavatar.r0 n07 = g17.n0(r0Var.e());
            if (n07 != null) {
                java.lang.String d17 = n07.d();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(d17) && !com.tencent.mm.sdk.platformtools.t8.K0(r0Var.d()) && !d17.equals(r0Var.d())) {
                    if (e17 != null) {
                        e17.p(r0Var.e(), false);
                        e17.p(r0Var.e(), true);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.AvatarService", "small url is not same, must remove avatar file!! oldSmallUrl: %s, curSmallUrl: %s", r0Var.d(), d17);
                    return false;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AvatarService", "save avatar username: %s", r0Var.e());
            r0Var.f70530b = 3;
            r0Var.f70537i = -1;
            r0Var.f();
            r0Var.f70536h = 0;
            g17.y0(r0Var);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AvatarService", "istg is null!!");
        }
        return true;
    }

    @Override // com.tencent.mm.sdk.platformtools.g6
    public boolean b() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f70508d.e())) {
            return false;
        }
        com.tencent.mm.modelavatar.r rVar = this.f70511g;
        int i17 = com.tencent.mm.modelavatar.r.f70520o;
        com.tencent.mm.modelavatar.z e17 = rVar.e();
        if (e17 != null && this.f70510f != null) {
            e17.s(this.f70508d.e(), this.f70510f);
        }
        this.f70511g.f70522e.remove(this.f70508d.e());
        try {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_contact_get_check_avatar_expire_sw, 1) == 1) {
                ((lt0.f) this.f70511g.f70523f).remove(this.f70508d.e());
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AvatarService", "SaveAvatar %s", e18.getMessage());
        }
        java.util.Iterator it = ((java.util.HashSet) this.f70511g.f70526i).iterator();
        while (it.hasNext()) {
            kv.d0 d0Var = (kv.d0) it.next();
            java.lang.String username = this.f70508d.e();
            c61.ga gaVar = (c61.ga) d0Var;
            gaVar.getClass();
            kotlin.jvm.internal.o.g(username, "username");
            com.tencent.mars.xlog.Log.i("MicroMsg.AvatarChangedEventReceiver", "onAvatarChanged: ".concat(username));
            ((ku5.t0) ku5.t0.f312615d).B(new c61.ea(gaVar, username));
        }
        return false;
    }
}
