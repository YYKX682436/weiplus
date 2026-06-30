package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes12.dex */
public class n3 {

    /* renamed from: a, reason: collision with root package name */
    public final h36.d f152241a;

    /* renamed from: b, reason: collision with root package name */
    public long f152242b = 0;

    public n3() {
        this.f152241a = null;
        try {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            java.lang.System.currentTimeMillis();
            if (p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.p(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).length == 0) {
                p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.w(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, wo.w0.k().getBytes());
            }
            this.f152241a = new h36.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, o45.wf.f424562g);
            p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.f427196a = 1;
            p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.f427197b = new com.p314xaae8f345.mm.p944x882e457a.m3(this);
            java.lang.System.currentTimeMillis();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WtloginMgr", e17, "Failed initializing WtloginMgr.", new java.lang.Object[0]);
        }
    }

    public void a(long j17) {
        long j18 = this.f152242b;
        if (j17 != j18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WtloginMgr", "dkwt clearUserWtInfo Error uin ReqUin:%d RespUin:%d", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17));
            return;
        }
        try {
            this.f152241a.b(j17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WtloginMgr", "dkwt clearUserWtInfo e:%s", e17.getMessage());
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WtloginMgr", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    public byte[] b(long j17) {
        p3335x340bc8.p3336x27ae93cd.p3337x414ef28f.C29270x6b3281fd c29270x6b3281fd;
        long j18 = this.f152242b;
        if (j17 != j18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WtloginMgr", "dkwt getA2KeyByRespBuf Error uin ReqUin:%d RespUin:%d", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17));
            return new byte[0];
        }
        try {
            p3335x340bc8.p3336x27ae93cd.p3338xd3ab5596.C29273x78a22b4d a17 = this.f152241a.f360111a.a(j17, 522017402L);
            if (a17 == null) {
                c29270x6b3281fd = null;
            } else {
                p3335x340bc8.p3336x27ae93cd.p3337x414ef28f.C29270x6b3281fd c29270x6b3281fd2 = new p3335x340bc8.p3336x27ae93cd.p3337x414ef28f.C29270x6b3281fd();
                c29270x6b3281fd2.m151440x43747734(a17);
                c29270x6b3281fd = c29270x6b3281fd2;
            }
            return c29270x6b3281fd == null ? new byte[0] : c29270x6b3281fd._A2;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WtloginMgr", "dkwt getA2KeyByRespBuf e:%s", e17.getMessage());
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WtloginMgr", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return new byte[0];
        }
    }

    public byte[] c(long j17, java.lang.String str) {
        long j18 = this.f152242b;
        if (j17 != j18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WtloginMgr", "dkwt getReqLoginBufbyVerifyImg Error uin ReqUin:%d RespUin:%d", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17));
            return new byte[0];
        }
        try {
            return this.f152241a.a(j17, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? "****".getBytes() : str.getBytes());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WtloginMgr", "dkwt getReqLoginBufbyVerifyImg e:%s", e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WtloginMgr", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return new byte[0];
        }
    }

    public byte[] d(long j17, java.lang.String str, boolean z17) {
        boolean z18 = x51.o1.f533575a;
        boolean z19 = x51.o1.f533575a;
        if (x51.o1.f533597q == 10006) {
            int i17 = x51.o1.f533598r;
            if (i17 == 1) {
                x51.o1.f533598r = 0;
                return new byte[0];
            }
            if (i17 == 2) {
                return new byte[0];
            }
        }
        if (!z17) {
            try {
                if (gm0.j1.a()) {
                    if ((j62.e.g().i("clicfg_wtlogin_buf_expr", 0, true, true) == 0) && !gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MANUAL_AUTH_AS_QQ_ACCOUNT_BOOLEAN_SYNC, true)) {
                        return new byte[0];
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WtloginMgr", "dkwt getReqLoginBuf e:%s", e17.getMessage());
                boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WtloginMgr", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                return new byte[0];
            }
        }
        this.f152242b = j17;
        byte[] e18 = z17 ? null : this.f152241a.e(j17, 522017402L, 8256, h36.c.USER_WITH_A1, "");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(e18);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(e18)) {
            jx3.f.INSTANCE.u(2122L, 3L);
            return e18;
        }
        byte[] e19 = this.f152241a.e(j17, 522017402L, 8256, h36.c.USER_WITH_MD5, new java.lang.String(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(str), com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3125x9fd75533.f11976x3730806a));
        if (z17 || e19 != null) {
            jx3.f.INSTANCE.u(2122L, 3L);
        } else {
            jx3.f.INSTANCE.u(2122L, 2L);
        }
        return e19;
    }

    public byte[] e(long j17) {
        long j18 = this.f152242b;
        if (j17 != j18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WtloginMgr", "dkwt getVerifyImg Error uin ReqUin:%d RespUin:%d", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17));
            return new byte[0];
        }
        try {
            return this.f152241a.d(j17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WtloginMgr", "dkwt getVerifyImg e:%s", e17.getMessage());
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WtloginMgr", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return new byte[0];
        }
    }

    public boolean f(long j17, byte[] bArr) {
        long j18 = this.f152242b;
        if (j17 != j18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WtloginMgr", "dkwt parseRespLoginBuf Error uin ReqUin:%d RespUin:%d", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17));
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WtloginMgr", "dkwt parseRespLoginBuf respBuf is null.");
            return false;
        }
        try {
            int f17 = this.f152241a.f(bArr);
            int length = bArr.length;
            return f17 == 0;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WtloginMgr", "dkwt parseRespLoginBuf e:%s", e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WtloginMgr", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return false;
        }
    }
}
