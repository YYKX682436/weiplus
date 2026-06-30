package com.p314xaae8f345.mm.p943x351df9c2;

/* loaded from: classes11.dex */
public class k0 extends com.p314xaae8f345.mm.p943x351df9c2.j0 {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p943x351df9c2.r0 f151993e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f151994f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f151995g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f151996h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f151997i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p943x351df9c2.m0 f151998m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.p314xaae8f345.mm.p943x351df9c2.m0 m0Var, com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var, java.lang.String str, java.lang.String str2, boolean z17) {
        super(m0Var.f152020i);
        this.f151998m = m0Var;
        this.f151996h = true;
        this.f151997i = false;
        this.f151993e = r0Var;
        this.f151994f = str;
        this.f151995g = str2;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    public boolean a() {
        java.lang.String str = this.f151995g;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.g(str)) {
            this.f151997i = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetHDHeadImgHelper", "DecryptAvatar: hevc to pic start");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.A(138, 63);
            java.lang.String str2 = str + "_hevc";
            boolean x17 = com.p314xaae8f345.mm.vfs.w6.x(str, str2, true);
            boolean e17 = com.p314xaae8f345.mm.vfs.w6.e(str);
            java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(str, true);
            java.lang.String i18 = com.p314xaae8f345.mm.vfs.w6.i(str2, false);
            if (i17 == null || i18 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetHDHeadImgHelper", "DecryptAvatar: uri is null %s, %s; path %s, %s; result %s, %s", i17, i18, this.f151995g, str2, java.lang.Boolean.valueOf(x17), java.lang.Boolean.valueOf(e17));
                g0Var.A(138, 65);
                return true;
            }
            int aj6 = ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).aj(i18, i17, 3);
            com.p314xaae8f345.mm.vfs.w6.h(str2);
            if (aj6 != 0) {
                g0Var.A(138, 64);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetHDHeadImgHelper", "DecryptAvatar: hevc to pic failed");
                return true;
            }
        }
        this.f151996h = false;
        return true;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    public boolean b() {
        com.p314xaae8f345.mm.p943x351df9c2.m0 m0Var = this.f151998m;
        m0Var.getClass();
        boolean z17 = this.f151996h;
        com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var = this.f151993e;
        if (!z17) {
            java.lang.String str = this.f151994f;
            com.p314xaae8f345.mm.vfs.w6.h(str);
            com.p314xaae8f345.mm.vfs.w6.w(this.f151995g, str);
            com.p314xaae8f345.mm.p943x351df9c2.u0.I(str, r0Var.e());
            m0Var.f152016e.a(0, 0);
            return true;
        }
        if (this.f151997i && m0Var.f152018g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetHDHeadImgHelper", "onPostExecute: first request hevc failed");
            m0Var.f152018g = false;
            m0Var.f152019h = false;
            ((ku5.t0) ku5.t0.f394148d).r(new com.p314xaae8f345.mm.p943x351df9c2.l0(m0Var, r0Var), "get-hd-headimg");
        } else {
            m0Var.f152016e.a(3, -1);
        }
        return false;
    }
}
