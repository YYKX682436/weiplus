package x51;

/* loaded from: classes12.dex */
public class s0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.g6 {

    /* renamed from: d, reason: collision with root package name */
    public int f533614d = 0;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f533615e = null;

    /* renamed from: f, reason: collision with root package name */
    public final x51.o0 f533616f;

    public s0(x51.o0 o0Var) {
        if (!x51.w0.b(o0Var)) {
            throw new java.lang.IllegalArgumentException("from net, picture strategy here must be validity");
        }
        this.f533616f = o0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    public boolean a() {
        java.lang.Throwable th6;
        java.io.OutputStream outputStream;
        java.io.InputStream inputStream;
        android.graphics.Bitmap b17;
        android.graphics.Bitmap bitmap;
        x51.o0 o0Var = this.f533616f;
        if (o0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMPictureLogic", "picStrategy == null");
            return true;
        }
        java.io.InputStream inputStream2 = null;
        android.graphics.Bitmap bitmap2 = null;
        r7 = null;
        r7 = null;
        inputStream2 = null;
        java.lang.String str = null;
        try {
            o0Var.f();
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(o0Var.k());
            outputStream = com.p314xaae8f345.mm.vfs.w6.K(r6Var.o() + "_tmp", false);
            try {
                com.p314xaae8f345.mm.p971x6de15a2e.h2 d17 = com.p314xaae8f345.mm.p971x6de15a2e.n.d(o0Var.g(), null);
                if (m11.n1.g() && m11.n1.h(o0Var.g())) {
                    d17.d(m11.n1.a(o45.wf.f424562g));
                }
                d17.g(10000);
                d17.k(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059);
                d17.c("GET");
                inputStream = com.p314xaae8f345.mm.p971x6de15a2e.n.a(d17) == 0 ? d17.mo48349xc7995ab4() : null;
                try {
                    try {
                        java.lang.String e17 = d17.e();
                        try {
                            if (inputStream == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMPictureLogic", "download %s error, can not open http stream", o0Var.g());
                                o0Var.j(e17, false);
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (java.io.IOException e18) {
                                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMPictureLogic", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
                                    }
                                }
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (java.io.IOException e19) {
                                        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMPictureLogic", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e19));
                                    }
                                }
                                return true;
                            }
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                this.f533614d += read;
                                outputStream.write(bArr, 0, read);
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPictureLogic", "get url[%s] ok, bufSize[%d]", o0Var.g(), java.lang.Integer.valueOf(this.f533614d));
                            o0Var.j(e17, true);
                            try {
                                inputStream.close();
                            } catch (java.io.IOException e27) {
                                boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMPictureLogic", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e27));
                            }
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (java.io.IOException e28) {
                                    boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMPictureLogic", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e28));
                                }
                            }
                            try {
                                com.p314xaae8f345.mm.vfs.w6.p(r6Var.o() + "_tmp");
                                x51.n0 b18 = o0Var.b();
                                if (b18 != null) {
                                    b17 = b18.a(r6Var.o() + "_tmp");
                                } else {
                                    b17 = x51.v0.b(r6Var.o() + "_tmp");
                                }
                                x51.m0 m0Var = x51.m0.NET;
                                if (b17 != null) {
                                    bitmap = o0Var.l(b17, m0Var, r6Var.o() + "_tmp");
                                } else {
                                    o0Var.h(m0Var, e17);
                                    bitmap = null;
                                }
                                if (bitmap != b17 && !b17.isRecycled()) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPictureLogic", "recycle bitmap:%s", b17.toString());
                                    b17.recycle();
                                }
                                x51.v0.INSTANCE.f(o0Var, bitmap);
                                com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(r6Var.o() + "_tmp");
                                java.lang.String str2 = a17.f294812f;
                                if (str2 != null) {
                                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                                    if (!str2.equals(l17)) {
                                        a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                                    }
                                }
                                com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                                if (m17.a()) {
                                    m17.f294799a.d(m17.f294800b);
                                }
                                bitmap2 = bitmap;
                            } catch (java.lang.Exception e29) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMPictureLogic", "update pic for %s, error", o0Var.g());
                                boolean z28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMPictureLogic", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e29));
                            }
                            this.f533615e = bitmap2;
                            return true;
                        } catch (java.lang.Exception e37) {
                            e = e37;
                            str = e17;
                            boolean z29 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMPictureLogic", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e));
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMPictureLogic", "get url:%s failed.", o0Var.g());
                            o0Var.j(str, false);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (java.io.IOException e38) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMPictureLogic", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e38));
                                }
                            }
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (java.io.IOException e39) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMPictureLogic", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e39));
                                }
                            }
                            return true;
                        }
                    } catch (java.lang.Throwable th7) {
                        th6 = th7;
                        inputStream2 = inputStream;
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (java.io.IOException e47) {
                                boolean z37 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMPictureLogic", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e47));
                            }
                        }
                        if (outputStream == null) {
                            throw th6;
                        }
                        try {
                            outputStream.close();
                            throw th6;
                        } catch (java.io.IOException e48) {
                            boolean z38 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMPictureLogic", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e48));
                            throw th6;
                        }
                    }
                } catch (java.lang.Exception e49) {
                    e = e49;
                }
            } catch (java.lang.Exception e57) {
                e = e57;
                inputStream = null;
            } catch (java.lang.Throwable th8) {
                th6 = th8;
            }
        } catch (java.lang.Exception e58) {
            e = e58;
            outputStream = null;
            inputStream = null;
        } catch (java.lang.Throwable th9) {
            th6 = th9;
            outputStream = null;
        }
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    public boolean b() {
        try {
            ((com.p314xaae8f345.mm.p959x883644fd.s0) c01.n8.f118881a).a(this.f533614d, 0, 0);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMPictureLogic", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
        x51.v0 v0Var = x51.v0.INSTANCE;
        x51.o0 o0Var = this.f533616f;
        x51.v0.a(v0Var, o0Var.g(), o0Var.c(), this.f533615e);
        this.f533615e = null;
        return false;
    }
}
