package com.tencent.mm.modelbase;

/* loaded from: classes12.dex */
public class n3 {

    /* renamed from: a, reason: collision with root package name */
    public final h36.d f70708a;

    /* renamed from: b, reason: collision with root package name */
    public long f70709b = 0;

    public n3() {
        this.f70708a = null;
        try {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.System.currentTimeMillis();
            if (oicq.wlogin_sdk.tools.util.p(com.tencent.mm.sdk.platformtools.x2.f193071a).length == 0) {
                oicq.wlogin_sdk.tools.util.w(com.tencent.mm.sdk.platformtools.x2.f193071a, wo.w0.k().getBytes());
            }
            this.f70708a = new h36.d(com.tencent.mm.sdk.platformtools.x2.f193071a, o45.wf.f343029g);
            oicq.wlogin_sdk.tools.util.f345663a = 1;
            oicq.wlogin_sdk.tools.util.f345664b = new com.tencent.mm.modelbase.m3(this);
            java.lang.System.currentTimeMillis();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WtloginMgr", e17, "Failed initializing WtloginMgr.", new java.lang.Object[0]);
        }
    }

    public void a(long j17) {
        long j18 = this.f70709b;
        if (j17 != j18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WtloginMgr", "dkwt clearUserWtInfo Error uin ReqUin:%d RespUin:%d", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17));
            return;
        }
        try {
            this.f70708a.b(j17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WtloginMgr", "dkwt clearUserWtInfo e:%s", e17.getMessage());
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.WtloginMgr", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    public byte[] b(long j17) {
        oicq.wlogin_sdk.request.WUserSigInfo wUserSigInfo;
        long j18 = this.f70709b;
        if (j17 != j18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WtloginMgr", "dkwt getA2KeyByRespBuf Error uin ReqUin:%d RespUin:%d", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17));
            return new byte[0];
        }
        try {
            oicq.wlogin_sdk.sharemem.WloginSigInfo a17 = this.f70708a.f278578a.a(j17, 522017402L);
            if (a17 == null) {
                wUserSigInfo = null;
            } else {
                oicq.wlogin_sdk.request.WUserSigInfo wUserSigInfo2 = new oicq.wlogin_sdk.request.WUserSigInfo();
                wUserSigInfo2.get_clone(a17);
                wUserSigInfo = wUserSigInfo2;
            }
            return wUserSigInfo == null ? new byte[0] : wUserSigInfo._A2;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WtloginMgr", "dkwt getA2KeyByRespBuf e:%s", e17.getMessage());
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.WtloginMgr", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return new byte[0];
        }
    }

    public byte[] c(long j17, java.lang.String str) {
        long j18 = this.f70709b;
        if (j17 != j18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WtloginMgr", "dkwt getReqLoginBufbyVerifyImg Error uin ReqUin:%d RespUin:%d", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17));
            return new byte[0];
        }
        try {
            return this.f70708a.a(j17, com.tencent.mm.sdk.platformtools.t8.K0(str) ? "****".getBytes() : str.getBytes());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WtloginMgr", "dkwt getReqLoginBufbyVerifyImg e:%s", e17.getMessage());
            com.tencent.mars.xlog.Log.e("MicroMsg.WtloginMgr", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return new byte[0];
        }
    }

    public byte[] d(long j17, java.lang.String str, boolean z17) {
        boolean z18 = x51.o1.f452042a;
        boolean z19 = x51.o1.f452042a;
        if (x51.o1.f452064q == 10006) {
            int i17 = x51.o1.f452065r;
            if (i17 == 1) {
                x51.o1.f452065r = 0;
                return new byte[0];
            }
            if (i17 == 2) {
                return new byte[0];
            }
        }
        if (!z17) {
            try {
                if (gm0.j1.a()) {
                    if ((j62.e.g().i("clicfg_wtlogin_buf_expr", 0, true, true) == 0) && !gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_MANUAL_AUTH_AS_QQ_ACCOUNT_BOOLEAN_SYNC, true)) {
                        return new byte[0];
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WtloginMgr", "dkwt getReqLoginBuf e:%s", e17.getMessage());
                boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.WtloginMgr", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                return new byte[0];
            }
        }
        this.f70709b = j17;
        byte[] e18 = z17 ? null : this.f70708a.e(j17, 522017402L, 8256, h36.c.USER_WITH_A1, "");
        com.tencent.mm.sdk.platformtools.t8.M0(e18);
        if (!com.tencent.mm.sdk.platformtools.t8.M0(e18)) {
            jx3.f.INSTANCE.u(2122L, 3L);
            return e18;
        }
        byte[] e19 = this.f70708a.e(j17, 522017402L, 8256, h36.c.USER_WITH_MD5, new java.lang.String(com.tencent.mm.sdk.platformtools.t8.h(str), com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET));
        if (z17 || e19 != null) {
            jx3.f.INSTANCE.u(2122L, 3L);
        } else {
            jx3.f.INSTANCE.u(2122L, 2L);
        }
        return e19;
    }

    public byte[] e(long j17) {
        long j18 = this.f70709b;
        if (j17 != j18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WtloginMgr", "dkwt getVerifyImg Error uin ReqUin:%d RespUin:%d", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17));
            return new byte[0];
        }
        try {
            return this.f70708a.d(j17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WtloginMgr", "dkwt getVerifyImg e:%s", e17.getMessage());
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.WtloginMgr", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return new byte[0];
        }
    }

    public boolean f(long j17, byte[] bArr) {
        long j18 = this.f70709b;
        if (j17 != j18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WtloginMgr", "dkwt parseRespLoginBuf Error uin ReqUin:%d RespUin:%d", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17));
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.M0(bArr)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WtloginMgr", "dkwt parseRespLoginBuf respBuf is null.");
            return false;
        }
        try {
            int f17 = this.f70708a.f(bArr);
            int length = bArr.length;
            return f17 == 0;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WtloginMgr", "dkwt parseRespLoginBuf e:%s", e17.getMessage());
            com.tencent.mars.xlog.Log.e("MicroMsg.WtloginMgr", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return false;
        }
    }
}
