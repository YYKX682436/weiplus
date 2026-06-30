package com.tencent.mm.modelbase;

/* loaded from: classes16.dex */
public class l2 implements com.tencent.mm.network.o {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.network.r f70683d;

    public l2(com.tencent.mm.network.r rVar) {
        this.f70683d = rVar;
    }

    @Override // com.tencent.mm.network.o
    public void E(byte[] bArr, byte[] bArr2, byte[] bArr3, int i17, long j17) {
        try {
            this.f70683d.E(bArr, bArr2, bArr3, i17, j17);
        } catch (android.os.RemoteException e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RAccInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.o
    public void I0(boolean z17) {
        try {
            this.f70683d.I0(z17);
        } catch (android.os.RemoteException e17) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RAccInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.o
    public byte[] L0(java.lang.String str) {
        try {
            return this.f70683d.L0(str);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RAccInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return null;
        }
    }

    @Override // com.tencent.mm.network.o
    public int O(java.lang.String str) {
        try {
            return this.f70683d.O(str);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RAccInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return 0;
        }
    }

    @Override // com.tencent.mm.network.o
    public int U0(java.lang.String str) {
        try {
            return this.f70683d.U0(str);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RAccInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return 0;
        }
    }

    @Override // com.tencent.mm.network.o
    public void a(int i17) {
        try {
            this.f70683d.a(i17);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RAccInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.o
    public byte[] c1(java.lang.String str) {
        try {
            return this.f70683d.c1(str);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RAccInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return null;
        }
    }

    @Override // com.tencent.mm.network.o
    public byte[] f0(java.lang.String str) {
        try {
            return this.f70683d.f0(str);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RAccInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return null;
        }
    }

    @Override // com.tencent.mm.network.o
    public int getUin() {
        try {
            return this.f70683d.getUin();
        } catch (android.os.RemoteException e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RAccInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return 0;
        }
    }

    @Override // com.tencent.mm.network.o
    public java.lang.String getUsername() {
        try {
            return this.f70683d.getUsername();
        } catch (android.os.RemoteException e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RAccInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return null;
        }
    }

    @Override // com.tencent.mm.network.o
    public void i0() {
        try {
            this.f70683d.i0();
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RAccInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.o
    public boolean isForeground() {
        try {
            return this.f70683d.isForeground();
        } catch (android.os.RemoteException e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RAccInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return true;
        }
    }

    @Override // com.tencent.mm.network.o
    public boolean isLogin() {
        try {
            return this.f70683d.isLogin();
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RAccInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return false;
        }
    }

    @Override // com.tencent.mm.network.o
    public void l1(java.lang.String str, byte[] bArr) {
        try {
            this.f70683d.l1(str, bArr);
        } catch (android.os.RemoteException e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RAccInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.o
    public byte[] o() {
        try {
            return this.f70683d.o();
        } catch (android.os.RemoteException e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RAccInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return null;
        }
    }

    @Override // com.tencent.mm.network.o
    public java.lang.String q() {
        try {
            return this.f70683d.q();
        } catch (android.os.RemoteException e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RAccInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return null;
        }
    }

    @Override // com.tencent.mm.network.o
    public byte[] r(int i17) {
        try {
            return this.f70683d.r(i17);
        } catch (android.os.RemoteException e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RAccInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return null;
        }
    }

    @Override // com.tencent.mm.network.o
    public void reset() {
        try {
            this.f70683d.reset();
        } catch (android.os.RemoteException e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RAccInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.o
    public byte[] s() {
        try {
            return this.f70683d.s();
        } catch (android.os.RemoteException e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RAccInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return null;
        }
    }

    public java.lang.String toString() {
        return (((((("RAccInfo:\n|-uin     =" + getUin() + "\n") + "|-user    =" + getUsername() + "\n") + "|-singlesession =" + com.tencent.mm.sdk.platformtools.t8.j(r(1)) + "\n") + "|-clientsession =" + com.tencent.mm.sdk.platformtools.t8.j(r(2)) + "\n") + "|-serversession =" + com.tencent.mm.sdk.platformtools.t8.j(r(3)) + "\n") + "|-ecdhkey =" + com.tencent.mm.sdk.platformtools.t8.j(s()) + "\n") + "`-cookie  =" + com.tencent.mm.sdk.platformtools.t8.j(o());
    }

    @Override // com.tencent.mm.network.o
    public byte[] v(java.lang.String str) {
        try {
            return this.f70683d.v(str);
        } catch (android.os.RemoteException e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RAccInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return null;
        }
    }

    @Override // com.tencent.mm.network.o
    public void v0(com.tencent.mm.network.AccInfo accInfo) {
        try {
            this.f70683d.v0(accInfo);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RAccInfo", "recoveryAccInfo:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.o
    public boolean x(java.lang.String str) {
        try {
            return this.f70683d.x(str);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RAccInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return false;
        }
    }

    @Override // com.tencent.mm.network.o
    public byte[] y0() {
        try {
            return this.f70683d.y0();
        } catch (android.os.RemoteException e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RAccInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return null;
        }
    }
}
