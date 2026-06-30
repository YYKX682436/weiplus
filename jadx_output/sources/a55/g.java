package a55;

/* loaded from: classes12.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final a55.g f1614b = new a55.g();

    /* renamed from: c, reason: collision with root package name */
    public static final a55.e f1615c = new a55.e(0, -1);

    /* renamed from: a, reason: collision with root package name */
    public final android.util.SparseArray f1616a = new android.util.SparseArray(50);

    public int a(int i17, byte[] bArr, int[] iArr, int[] iArr2, int i18) {
        synchronized (this.f1616a) {
            a55.f fVar = (a55.f) this.f1616a.get(i17);
            if (fVar == null) {
                return -1;
            }
            int i19 = com.tencent.mars.stn.StnManager.RESP_FAIL_HANDLE_DEFAULT;
            try {
                byte[] K6 = fVar.f1609a.getReqObj().K6();
                long eCDHEngine = fVar.f1609a.getReqObj().getECDHEngine();
                o45.kg respObj = fVar.f1609a.getRespObj();
                boolean Zd = respObj.Zd(fVar.f1609a.getType(), bArr, K6, eCDHEngine);
                if (fVar.f1609a.getReqObj().V7()) {
                    d55.u.b("MicroMsg.MarsNetTasks", "axauth cgi is axcgi", new java.lang.Object[0]);
                } else {
                    d55.u.b("MicroMsg.MarsNetTasks", "axauth cgi is not axcgi", new java.lang.Object[0]);
                }
                if (Zd) {
                    int dc6 = respObj.dc();
                    iArr2[0] = 0;
                    respObj.n8();
                    if ((dc6 & 2) == 0) {
                        iArr2[0] = iArr2[0] | 2;
                    }
                    if ((dc6 & 4) == 0) {
                        iArr2[0] = iArr2[0] | 4;
                    }
                    if (respObj.o() != null && -13 == respObj.n8() && fVar.f1609a.getReqObj().V7()) {
                        d55.u.d("MicroMsg.MarsNetTasks", "axsession cgi sessionkey timeout", new java.lang.Object[0]);
                    }
                    if (-13 == respObj.n8()) {
                        i19 = com.tencent.mars.stn.StnManager.RESP_FAIL_HANDLE_SESSION_TIMEOUT;
                        iArr[0] = respObj.n8();
                    } else {
                        if (-3002 != respObj.n8() && -3003 != respObj.n8() && -3006 != respObj.n8()) {
                            if (-3001 == respObj.n8()) {
                                i19 = com.tencent.mars.stn.StnManager.RESP_FAIL_HANDLE_SESSION_TIMEOUT;
                                iArr[0] = respObj.n8();
                            } else {
                                i19 = com.tencent.mars.stn.StnManager.RESP_FAIL_HANDLE_NORMAL;
                            }
                        }
                        i19 = com.tencent.mars.stn.StnManager.RESP_FAIL_HANDLE_TASK_END;
                        iArr[0] = respObj.n8();
                    }
                    java.lang.String uri = fVar.f1609a.getUri();
                    if (respObj.n8() == -3800 && fVar.f1609a.getReqObj().b3()) {
                        d55.u.d("MicroMsg.MarsNetTasks", "ecdh decode failed 3800, " + uri, new java.lang.Object[0]);
                        ((com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class)).clearMMtlsForbidenHostAndPsk();
                        i19 = com.tencent.mars.stn.StnManager.RESP_FAIL_HANDLE_ECDH_VERSON_MISMATCH;
                        iArr[0] = respObj.n8();
                    }
                } else {
                    d55.u.d("MicroMsg.MarsNetTasks", "buf to resp failed, change server and try again", new java.lang.Object[0]);
                }
            } catch (android.os.RemoteException e17) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                d55.u.d("MicroMsg.MarsNetTasks", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            } catch (java.lang.Exception e18) {
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                d55.u.d("MicroMsg.MarsNetTasks", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e18));
            }
            return i19;
        }
    }

    public int b(int i17) {
        synchronized (this.f1616a) {
            a55.f fVar = (a55.f) this.f1616a.get(i17);
            if (fVar == null) {
                return 0;
            }
            try {
                return fVar.f1609a.getRespObj().n8();
            } catch (java.lang.Exception e17) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                d55.u.d("MicroMsg.MarsNetTasks", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                return 0;
            }
        }
    }

    public final boolean c(int i17) {
        return i17 == 1000 || i17 == 502 || i17 == 930 || i17 == 503 || i17 == 654 || i17 == 755 || i17 == 931 || i17 == 733 || i17 == 784 || i17 == 722 || i17 == 627 || i17 == 12106;
    }

    public boolean d(int i17, java.io.ByteArrayOutputStream byteArrayOutputStream, int[] iArr, int i18, java.lang.String str) {
        boolean z17;
        int i19;
        byte[] o17;
        byte[] bArr;
        d55.u.b("MicroMsg.MarsNetTasks", "req2Buf.", new java.lang.Object[0]);
        synchronized (this.f1616a) {
            a55.f fVar = (a55.f) this.f1616a.get(i17);
            if (fVar == null) {
                return false;
            }
            try {
                boolean x17 = fVar.f1611c.x(str);
                int O = fVar.f1611c.O(str);
                if (x17) {
                    O = fVar.f1611c.U0(str);
                }
                if (com.tencent.mm.sdk.platformtools.o4.L().getBoolean("SM4GCM_SWITCH", true) && O == 14) {
                    fVar.f1609a.setSingleSession(false);
                    fVar.f1609a.getReqObj().zb(fVar.f1611c.r(2));
                }
                if (fVar.f1609a.isSingleSession()) {
                    i19 = 1;
                } else {
                    fVar.f1609a.getReqObj().L8(fVar.f1611c.r(3));
                    d55.u.b("MicroMsg.MarsNetTasks", "summerauths isSingleSession false type:[%s]", java.lang.Integer.valueOf(fVar.f1609a.getType()));
                    i19 = 2;
                }
                if (x17) {
                    d55.u.b("MicroMsg.MarsNetTasks", "set axauth sessionkey " + str, new java.lang.Object[0]);
                    fVar.f1609a.getReqObj().L8(fVar.f1611c.L0(str));
                    byte[] c17 = fVar.f1611c.c1(str);
                    o17 = fVar.f1611c.f0(str);
                    fVar.f1609a.getReqObj().li(true);
                    if (c17 != null) {
                        d55.u.b("MicroMsg.MarsNetTasks", "axauth sessionkey length[%d]", java.lang.Integer.valueOf(c17.length));
                    } else {
                        d55.u.d("MicroMsg.MarsNetTasks", "axauth axsessionkey is null", new java.lang.Object[0]);
                    }
                    if (o17 != null) {
                        d55.u.b("MicroMsg.MarsNetTasks", "axauth cookie length[%d]", java.lang.Integer.valueOf(o17.length));
                    } else {
                        d55.u.d("MicroMsg.MarsNetTasks", "axauth cookie is null", new java.lang.Object[0]);
                    }
                    bArr = c17;
                    i19 = 2;
                } else {
                    byte[] r17 = fVar.f1611c.r(i19);
                    o17 = fVar.f1611c.o();
                    bArr = r17;
                }
                byte[] bArr2 = o17;
                fVar.f1609a.getReqObj().zb(bArr);
                if (i19 == 1 && !c(fVar.f1609a.getType())) {
                    fVar.f1609a.getReqObj().L8(null);
                }
                if (fVar.f1609a.getNewExtFlags() != 0) {
                    fVar.f1609a.getReqObj().U2(fVar.f1609a.getNewExtFlags());
                    fVar.f1609a.getReqObj().J6(fVar.f1609a.getTransHeader());
                }
                fVar.f1609a.getReqObj().a(fVar.f1611c.getUin());
                if (i19 != 2) {
                    O = 0;
                } else if (O != 0) {
                    d55.u.b("MicroMsg.MarsNetTasks", "summerauths sm4gcm seesionKeyType=%d, hostAlgo=%d, encryptType=%d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(O), java.lang.Integer.valueOf(O));
                } else {
                    O = 13;
                }
                fVar.f1609a.setReqHost(str);
                fVar.f1609a.setEncryptAlgo(O);
                z17 = fVar.f1609a.getReqObj().D2(fVar.f1609a.getType(), bArr, O, bArr2, fVar.f1611c.s(), 0, fVar.f1611c.isForeground());
                d55.u.b("MicroMsg.MarsNetTasks", "link: %d req2Buf somr isfg:%b  cookie: %s, type:%d, host:%s, encryptAlgo:%s, cgi:%s", java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(fVar.f1611c.isForeground()), com.tencent.mm.sdk.platformtools.t8.G1(com.tencent.mm.sdk.platformtools.t8.l(fVar.f1611c.o())), java.lang.Integer.valueOf(fVar.f1609a.getType()), str, java.lang.Integer.valueOf(O), fVar.f1609a.getUri());
                if (z17) {
                    byteArrayOutputStream.write(fVar.f1609a.getReqObj().sa());
                } else {
                    iArr[0] = 0;
                    d55.u.d("MicroMsg.MarsNetTasks", "request to buffer using jni failed", new java.lang.Object[0]);
                }
            } catch (android.os.RemoteException e17) {
                iArr[0] = 1;
                d55.u.d("MicroMsg.MarsNetTasks", "RemoteException:%s", com.tencent.mm.sdk.platformtools.t8.M1(e17));
                z17 = false;
                d55.u.b("MicroMsg.MarsNetTasks", "req2Buf bOk: %b", java.lang.Boolean.valueOf(z17));
                return z17;
            } catch (java.io.IOException e18) {
                iArr[0] = 2;
                d55.u.d("MicroMsg.MarsNetTasks", "IOException:%s", com.tencent.mm.sdk.platformtools.t8.M1(e18));
                z17 = false;
                d55.u.b("MicroMsg.MarsNetTasks", "req2Buf bOk: %b", java.lang.Boolean.valueOf(z17));
                return z17;
            } catch (java.lang.Exception e19) {
                iArr[0] = 3;
                d55.u.d("MicroMsg.MarsNetTasks", "Exception:%s", com.tencent.mm.sdk.platformtools.t8.M1(e19));
                z17 = false;
                d55.u.b("MicroMsg.MarsNetTasks", "req2Buf bOk: %b", java.lang.Boolean.valueOf(z17));
                return z17;
            }
            d55.u.b("MicroMsg.MarsNetTasks", "req2Buf bOk: %b", java.lang.Boolean.valueOf(z17));
            return z17;
        }
    }

    public void finalize() {
        super.finalize();
    }
}
