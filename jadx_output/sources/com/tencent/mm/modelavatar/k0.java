package com.tencent.mm.modelavatar;

/* loaded from: classes11.dex */
public class k0 extends com.tencent.mm.modelavatar.j0 {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelavatar.r0 f70460e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f70461f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f70462g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f70463h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f70464i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelavatar.m0 f70465m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.tencent.mm.modelavatar.m0 m0Var, com.tencent.mm.modelavatar.r0 r0Var, java.lang.String str, java.lang.String str2, boolean z17) {
        super(m0Var.f70487i);
        this.f70465m = m0Var;
        this.f70463h = true;
        this.f70464i = false;
        this.f70460e = r0Var;
        this.f70461f = str;
        this.f70462g = str2;
    }

    @Override // com.tencent.mm.sdk.platformtools.g6
    public boolean a() {
        java.lang.String str = this.f70462g;
        if (com.tencent.mm.sdk.platformtools.y1.g(str)) {
            this.f70464i = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.GetHDHeadImgHelper", "DecryptAvatar: hevc to pic start");
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.A(138, 63);
            java.lang.String str2 = str + "_hevc";
            boolean x17 = com.tencent.mm.vfs.w6.x(str, str2, true);
            boolean e17 = com.tencent.mm.vfs.w6.e(str);
            java.lang.String i17 = com.tencent.mm.vfs.w6.i(str, true);
            java.lang.String i18 = com.tencent.mm.vfs.w6.i(str2, false);
            if (i17 == null || i18 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GetHDHeadImgHelper", "DecryptAvatar: uri is null %s, %s; path %s, %s; result %s, %s", i17, i18, this.f70462g, str2, java.lang.Boolean.valueOf(x17), java.lang.Boolean.valueOf(e17));
                g0Var.A(138, 65);
                return true;
            }
            int aj6 = ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).aj(i18, i17, 3);
            com.tencent.mm.vfs.w6.h(str2);
            if (aj6 != 0) {
                g0Var.A(138, 64);
                com.tencent.mars.xlog.Log.i("MicroMsg.GetHDHeadImgHelper", "DecryptAvatar: hevc to pic failed");
                return true;
            }
        }
        this.f70463h = false;
        return true;
    }

    @Override // com.tencent.mm.sdk.platformtools.g6
    public boolean b() {
        com.tencent.mm.modelavatar.m0 m0Var = this.f70465m;
        m0Var.getClass();
        boolean z17 = this.f70463h;
        com.tencent.mm.modelavatar.r0 r0Var = this.f70460e;
        if (!z17) {
            java.lang.String str = this.f70461f;
            com.tencent.mm.vfs.w6.h(str);
            com.tencent.mm.vfs.w6.w(this.f70462g, str);
            com.tencent.mm.modelavatar.u0.I(str, r0Var.e());
            m0Var.f70483e.a(0, 0);
            return true;
        }
        if (this.f70464i && m0Var.f70485g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GetHDHeadImgHelper", "onPostExecute: first request hevc failed");
            m0Var.f70485g = false;
            m0Var.f70486h = false;
            ((ku5.t0) ku5.t0.f312615d).r(new com.tencent.mm.modelavatar.l0(m0Var, r0Var), "get-hd-headimg");
        } else {
            m0Var.f70483e.a(3, -1);
        }
        return false;
    }
}
