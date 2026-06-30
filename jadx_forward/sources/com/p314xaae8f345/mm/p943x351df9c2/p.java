package com.p314xaae8f345.mm.p943x351df9c2;

/* loaded from: classes11.dex */
public class p implements com.p314xaae8f345.mm.sdk.p2603x2137b148.g6 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p943x351df9c2.r0 f152041d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f152042e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Bitmap f152043f = null;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p943x351df9c2.r f152044g;

    public p(com.p314xaae8f345.mm.p943x351df9c2.r rVar, com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var, byte[] bArr) {
        this.f152044g = rVar;
        this.f152041d = null;
        this.f152041d = r0Var;
        this.f152042e = bArr;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    public boolean a() {
        com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var = this.f152041d;
        if (r0Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0Var.e())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AvatarService", "SaveAvatar imgFlag info is null");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(138L, 13L, 1L, true);
            return false;
        }
        int i17 = com.p314xaae8f345.mm.p943x351df9c2.r.f152053o;
        com.p314xaae8f345.mm.p943x351df9c2.r rVar = this.f152044g;
        com.p314xaae8f345.mm.p943x351df9c2.z e17 = rVar.e();
        if (e17 != null) {
            e17.p(r0Var.e(), false);
            e17.p(r0Var.e(), true);
            android.graphics.Bitmap r17 = e17.r(r0Var.e(), this.f152042e);
            this.f152043f = r17;
            if (r17 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(138L, 14L, 1L, true);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarService", "astg is null!!");
        }
        com.p314xaae8f345.mm.p943x351df9c2.s0 g17 = rVar.g();
        if (g17 != null) {
            com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = g17.n0(r0Var.e());
            if (n07 != null) {
                java.lang.String d17 = n07.d();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0Var.d()) && !d17.equals(r0Var.d())) {
                    if (e17 != null) {
                        e17.p(r0Var.e(), false);
                        e17.p(r0Var.e(), true);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarService", "small url is not same, must remove avatar file!! oldSmallUrl: %s, curSmallUrl: %s", r0Var.d(), d17);
                    return false;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarService", "save avatar username: %s", r0Var.e());
            r0Var.f152063b = 3;
            r0Var.f152070i = -1;
            r0Var.f();
            r0Var.f152069h = 0;
            g17.y0(r0Var);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarService", "istg is null!!");
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    public boolean b() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f152041d.e())) {
            return false;
        }
        com.p314xaae8f345.mm.p943x351df9c2.r rVar = this.f152044g;
        int i17 = com.p314xaae8f345.mm.p943x351df9c2.r.f152053o;
        com.p314xaae8f345.mm.p943x351df9c2.z e17 = rVar.e();
        if (e17 != null && this.f152043f != null) {
            e17.s(this.f152041d.e(), this.f152043f);
        }
        this.f152044g.f152055e.remove(this.f152041d.e());
        try {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_contact_get_check_avatar_expire_sw, 1) == 1) {
                ((lt0.f) this.f152044g.f152056f).mo141381xc84af884(this.f152041d.e());
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AvatarService", "SaveAvatar %s", e18.getMessage());
        }
        java.util.Iterator it = ((java.util.HashSet) this.f152044g.f152059i).iterator();
        while (it.hasNext()) {
            kv.d0 d0Var = (kv.d0) it.next();
            java.lang.String username = this.f152041d.e();
            c61.ga gaVar = (c61.ga) d0Var;
            gaVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarChangedEventReceiver", "onAvatarChanged: ".concat(username));
            ((ku5.t0) ku5.t0.f394148d).B(new c61.ea(gaVar, username));
        }
        return false;
    }
}
