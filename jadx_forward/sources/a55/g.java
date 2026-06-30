package a55;

/* loaded from: classes12.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final a55.g f83147b = new a55.g();

    /* renamed from: c, reason: collision with root package name */
    public static final a55.e f83148c = new a55.e(0, -1);

    /* renamed from: a, reason: collision with root package name */
    public final android.util.SparseArray f83149a = new android.util.SparseArray(50);

    public int a(int i17, byte[] bArr, int[] iArr, int[] iArr2, int i18) {
        synchronized (this.f83149a) {
            a55.f fVar = (a55.f) this.f83149a.get(i17);
            if (fVar == null) {
                return -1;
            }
            int i19 = com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.f19574x3a145b5c;
            try {
                byte[] K6 = fVar.f83142a.mo48049x2d63726f().K6();
                long mo48038x11b0e25a = fVar.f83142a.mo48049x2d63726f().mo48038x11b0e25a();
                o45.kg mo48050x7f35c2d1 = fVar.f83142a.mo48050x7f35c2d1();
                boolean Zd = mo48050x7f35c2d1.Zd(fVar.f83142a.mo48052xfb85f7b0(), bArr, K6, mo48038x11b0e25a);
                if (fVar.f83142a.mo48049x2d63726f().V7()) {
                    d55.u.b("MicroMsg.MarsNetTasks", "axauth cgi is axcgi", new java.lang.Object[0]);
                } else {
                    d55.u.b("MicroMsg.MarsNetTasks", "axauth cgi is not axcgi", new java.lang.Object[0]);
                }
                if (Zd) {
                    int dc6 = mo48050x7f35c2d1.dc();
                    iArr2[0] = 0;
                    mo48050x7f35c2d1.n8();
                    if ((dc6 & 2) == 0) {
                        iArr2[0] = iArr2[0] | 2;
                    }
                    if ((dc6 & 4) == 0) {
                        iArr2[0] = iArr2[0] | 4;
                    }
                    if (mo48050x7f35c2d1.o() != null && -13 == mo48050x7f35c2d1.n8() && fVar.f83142a.mo48049x2d63726f().V7()) {
                        d55.u.d("MicroMsg.MarsNetTasks", "axsession cgi sessionkey timeout", new java.lang.Object[0]);
                    }
                    if (-13 == mo48050x7f35c2d1.n8()) {
                        i19 = com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.f19577x3eb546b3;
                        iArr[0] = mo48050x7f35c2d1.n8();
                    } else {
                        if (-3002 != mo48050x7f35c2d1.n8() && -3003 != mo48050x7f35c2d1.n8() && -3006 != mo48050x7f35c2d1.n8()) {
                            if (-3001 == mo48050x7f35c2d1.n8()) {
                                i19 = com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.f19577x3eb546b3;
                                iArr[0] = mo48050x7f35c2d1.n8();
                            } else {
                                i19 = com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.f19576x5593244c;
                            }
                        }
                        i19 = com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.f19578xc9b14d26;
                        iArr[0] = mo48050x7f35c2d1.n8();
                    }
                    java.lang.String mo48053xb5887636 = fVar.f83142a.mo48053xb5887636();
                    if (mo48050x7f35c2d1.n8() == -3800 && fVar.f83142a.mo48049x2d63726f().b3()) {
                        d55.u.d("MicroMsg.MarsNetTasks", "ecdh decode failed 3800, " + mo48053xb5887636, new java.lang.Object[0]);
                        ((com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.class)).m40233x6bfeee24();
                        i19 = com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.f19575x8296306;
                        iArr[0] = mo48050x7f35c2d1.n8();
                    }
                } else {
                    d55.u.d("MicroMsg.MarsNetTasks", "buf to resp failed, change server and try again", new java.lang.Object[0]);
                }
            } catch (android.os.RemoteException e17) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                d55.u.d("MicroMsg.MarsNetTasks", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            } catch (java.lang.Exception e18) {
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                d55.u.d("MicroMsg.MarsNetTasks", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
            }
            return i19;
        }
    }

    public int b(int i17) {
        synchronized (this.f83149a) {
            a55.f fVar = (a55.f) this.f83149a.get(i17);
            if (fVar == null) {
                return 0;
            }
            try {
                return fVar.f83142a.mo48050x7f35c2d1().n8();
            } catch (java.lang.Exception e17) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                d55.u.d("MicroMsg.MarsNetTasks", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
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
        synchronized (this.f83149a) {
            a55.f fVar = (a55.f) this.f83149a.get(i17);
            if (fVar == null) {
                return false;
            }
            try {
                boolean x17 = fVar.f83144c.x(str);
                int O = fVar.f83144c.O(str);
                if (x17) {
                    O = fVar.f83144c.U0(str);
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getBoolean("SM4GCM_SWITCH", true) && O == 14) {
                    fVar.f83142a.mo48057x42fed7ec(false);
                    fVar.f83142a.mo48049x2d63726f().zb(fVar.f83144c.r(2));
                }
                if (fVar.f83142a.mo48054x74080c24()) {
                    i19 = 1;
                } else {
                    fVar.f83142a.mo48049x2d63726f().L8(fVar.f83144c.r(3));
                    d55.u.b("MicroMsg.MarsNetTasks", "summerauths isSingleSession false type:[%s]", java.lang.Integer.valueOf(fVar.f83142a.mo48052xfb85f7b0()));
                    i19 = 2;
                }
                if (x17) {
                    d55.u.b("MicroMsg.MarsNetTasks", "set axauth sessionkey " + str, new java.lang.Object[0]);
                    fVar.f83142a.mo48049x2d63726f().L8(fVar.f83144c.L0(str));
                    byte[] c17 = fVar.f83144c.c1(str);
                    o17 = fVar.f83144c.f0(str);
                    fVar.f83142a.mo48049x2d63726f().li(true);
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
                    byte[] r17 = fVar.f83144c.r(i19);
                    o17 = fVar.f83144c.o();
                    bArr = r17;
                }
                byte[] bArr2 = o17;
                fVar.f83142a.mo48049x2d63726f().zb(bArr);
                if (i19 == 1 && !c(fVar.f83142a.mo48052xfb85f7b0())) {
                    fVar.f83142a.mo48049x2d63726f().L8(null);
                }
                if (fVar.f83142a.mo48048xb6805570() != 0) {
                    fVar.f83142a.mo48049x2d63726f().U2(fVar.f83142a.mo48048xb6805570());
                    fVar.f83142a.mo48049x2d63726f().J6(fVar.f83142a.mo48051x2ee16a1f());
                }
                fVar.f83142a.mo48049x2d63726f().a(fVar.f83144c.mo9862xb5887524());
                if (i19 != 2) {
                    O = 0;
                } else if (O != 0) {
                    d55.u.b("MicroMsg.MarsNetTasks", "summerauths sm4gcm seesionKeyType=%d, hostAlgo=%d, encryptType=%d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(O), java.lang.Integer.valueOf(O));
                } else {
                    O = 13;
                }
                fVar.f83142a.mo48056xf2792ca4(str);
                fVar.f83142a.mo48055x85346096(O);
                z17 = fVar.f83142a.mo48049x2d63726f().D2(fVar.f83142a.mo48052xfb85f7b0(), bArr, O, bArr2, fVar.f83144c.s(), 0, fVar.f83144c.mo9864xf7b3660d());
                d55.u.b("MicroMsg.MarsNetTasks", "link: %d req2Buf somr isfg:%b  cookie: %s, type:%d, host:%s, encryptAlgo:%s, cgi:%s", java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(fVar.f83144c.mo9864xf7b3660d()), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(fVar.f83144c.o())), java.lang.Integer.valueOf(fVar.f83142a.mo48052xfb85f7b0()), str, java.lang.Integer.valueOf(O), fVar.f83142a.mo48053xb5887636());
                if (z17) {
                    byteArrayOutputStream.write(fVar.f83142a.mo48049x2d63726f().sa());
                } else {
                    iArr[0] = 0;
                    d55.u.d("MicroMsg.MarsNetTasks", "request to buffer using jni failed", new java.lang.Object[0]);
                }
            } catch (android.os.RemoteException e17) {
                iArr[0] = 1;
                d55.u.d("MicroMsg.MarsNetTasks", "RemoteException:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M1(e17));
                z17 = false;
                d55.u.b("MicroMsg.MarsNetTasks", "req2Buf bOk: %b", java.lang.Boolean.valueOf(z17));
                return z17;
            } catch (java.io.IOException e18) {
                iArr[0] = 2;
                d55.u.d("MicroMsg.MarsNetTasks", "IOException:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M1(e18));
                z17 = false;
                d55.u.b("MicroMsg.MarsNetTasks", "req2Buf bOk: %b", java.lang.Boolean.valueOf(z17));
                return z17;
            } catch (java.lang.Exception e19) {
                iArr[0] = 3;
                d55.u.d("MicroMsg.MarsNetTasks", "Exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M1(e19));
                z17 = false;
                d55.u.b("MicroMsg.MarsNetTasks", "req2Buf bOk: %b", java.lang.Boolean.valueOf(z17));
                return z17;
            }
            d55.u.b("MicroMsg.MarsNetTasks", "req2Buf bOk: %b", java.lang.Boolean.valueOf(z17));
            return z17;
        }
    }

    /* renamed from: finalize */
    public void m695xd764dc1e() {
        super.finalize();
    }
}
