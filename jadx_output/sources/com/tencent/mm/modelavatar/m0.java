package com.tencent.mm.modelavatar;

/* loaded from: classes11.dex */
public class m0 implements com.tencent.mm.modelbase.u0, kv.h0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelavatar.r0 f70482d = null;

    /* renamed from: e, reason: collision with root package name */
    public kv.g0 f70483e = null;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelavatar.u0 f70484f = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f70485g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f70486h = true;

    /* renamed from: i, reason: collision with root package name */
    public android.os.Handler f70487i = null;

    public m0() {
        gm0.j1.d().a(158, this);
    }

    public int a(java.lang.String str, kv.g0 g0Var) {
        iz5.a.g("GetHDHeadImg must set callback", g0Var != null);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            g0Var.a(3, -101);
            return -101;
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17.s2() || n17.o2()) {
            g0Var.a(3, -104);
            return -104;
        }
        this.f70483e = g0Var;
        java.lang.String Y4 = com.tencent.mm.storage.z3.H3(str) ? com.tencent.mm.storage.z3.Y4(str) : str;
        com.tencent.mm.modelavatar.r0 n07 = com.tencent.mm.modelavatar.d1.Ni().n0(Y4);
        this.f70482d = n07;
        if (n07 == null || !n07.e().equals(Y4)) {
            com.tencent.mm.modelavatar.r0 r0Var = new com.tencent.mm.modelavatar.r0();
            this.f70482d = r0Var;
            r0Var.f70529a = Y4;
            if (!android.text.TextUtils.isEmpty("")) {
                this.f70482d.f70533e = "";
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f70482d.c())) {
            com.tencent.mm.modelavatar.r0 r0Var2 = this.f70482d;
            if (this.f70487i == null) {
                this.f70487i = new android.os.Handler(android.os.Looper.myLooper());
            }
            ((ku5.t0) ku5.t0.f312615d).r(new com.tencent.mm.modelavatar.l0(this, r0Var2), "get-hd-headimg");
            return 0;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.GetHDHeadImgHelper", "dkhurl [%s] has NO URL flag:%d !", str, java.lang.Integer.valueOf(this.f70482d.f70530b));
        this.f70484f = new com.tencent.mm.modelavatar.u0(Y4);
        if (gm0.j1.d().h(this.f70484f, 0)) {
            return 0;
        }
        g0Var.a(3, -102);
        return -102;
    }

    public void b() {
        gm0.j1.d().q(158, this);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        kv.g0 g0Var = this.f70483e;
        if (g0Var != null) {
            g0Var.a(i17, i18);
        }
    }
}
