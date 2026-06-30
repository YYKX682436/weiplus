package kl;

/* loaded from: classes13.dex */
public class f extends kl.e {

    /* renamed from: p, reason: collision with root package name */
    public final hl.d f390257p;

    /* renamed from: q, reason: collision with root package name */
    public java.io.OutputStream f390258q;

    /* renamed from: r, reason: collision with root package name */
    public java.io.InputStream f390259r;

    public f(hl.d dVar, int i17, int i18, int i19, java.lang.String str) {
        super(1);
        java.lang.Object[] objArr = {str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19)};
        int i27 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioFixedConvertProcess", "AudioFixedConvertProcess src:%s, sample:%d, channels:%d, encodeBit:%d", objArr);
        kl.d.a();
        this.f390257p = dVar;
        java.lang.String a17 = rl.a.a(str);
        this.f390254l = a17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioFixedConvertProcess", "outFile:%s", a17);
        com.p314xaae8f345.mm.vfs.w6.h(this.f390254l);
        il.e.c().a(dVar.f363553c);
        try {
            this.f390258q = com.p314xaae8f345.mm.vfs.w6.H(rl.a.b(this.f390254l));
        } catch (java.io.FileNotFoundException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Mix.AudioFixedConvertProcess", e17, "VFSFileOp.openWrite", new java.lang.Object[0]);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Mix.AudioFixedConvertProcess", e18, "VFSFileOp.openWrite", new java.lang.Object[0]);
        }
        try {
            this.f390259r = com.p314xaae8f345.mm.vfs.w6.C(rl.a.b(this.f390254l));
        } catch (java.io.FileNotFoundException e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Mix.AudioFixedConvertProcess", e19, "VFSFileOp.openRead", new java.lang.Object[0]);
        } catch (java.lang.Exception e27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Mix.AudioFixedConvertProcess", e27, "VFSFileOp.openRead", new java.lang.Object[0]);
        }
        this.f390248f = 44100;
        this.f390249g = 2;
        this.f390250h = 2;
        g(i17, i18, i19);
    }

    @Override // kl.e, kl.k
    public byte[] a(byte[] bArr) {
        if (bArr == null) {
            return bArr;
        }
        byte[] a17 = super.a(bArr);
        java.io.OutputStream outputStream = this.f390258q;
        if (outputStream == null) {
            return a17;
        }
        if (a17 == null) {
            int i17 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.AudioFixedConvertProcess", "desdata is null", null);
            return null;
        }
        try {
            outputStream.write(a17, 0, a17.length);
        } catch (java.lang.Exception e17) {
            int i18 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Mix.AudioFixedConvertProcess", e17, "write", new java.lang.Object[0]);
        }
        return a17;
    }

    @Override // kl.e, kl.k
    public void b() {
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioFixedConvertProcess", "flushCache", null);
        if (this.f390259r == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.AudioFixedConvertProcess", "flushCache, inputStream is null", null);
            return;
        }
        hl.d dVar = this.f390257p;
        if (dVar.f363552b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.AudioFixedConvertProcess", "flushCache, cache is complete", null);
            return;
        }
        int i18 = 0;
        while (i18 != -1) {
            byte[] bArr = new byte[3536];
            try {
                i18 = this.f390259r.read(bArr, 0, 3536);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Mix.AudioFixedConvertProcess", e17, "readPcmDataTrack", new java.lang.Object[0]);
            }
            if (i18 > 0) {
                hl.e b17 = il.i.a().b();
                b17.f363571f = bArr;
                dVar.m(b17);
            }
        }
        dVar.a();
    }

    @Override // kl.e, kl.k
    public hl.e c(int i17) {
        java.io.InputStream inputStream = this.f390259r;
        if (inputStream == null) {
            int i18 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.AudioFixedConvertProcess", "readPcmDataTrack, inputStream is null", null);
            return null;
        }
        if (i17 > 0) {
            byte[] bArr = new byte[i17];
            try {
                if (inputStream.read(bArr, 0, i17) > 0) {
                    hl.e b17 = il.i.a().b();
                    b17.f363571f = bArr;
                    return b17;
                }
                int i19 = rl.b.f478676a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.AudioFixedConvertProcess", "readPcmDataTrack readSize is 0", null);
            } catch (java.lang.Exception e17) {
                int i27 = rl.b.f478676a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Mix.AudioFixedConvertProcess", e17, "readPcmDataTrack", new java.lang.Object[0]);
            }
        }
        return null;
    }

    @Override // kl.e, kl.k
    public void d() {
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioFixedConvertProcess", "finishProcess", null);
        try {
            java.io.OutputStream outputStream = this.f390258q;
            if (outputStream != null) {
                outputStream.flush();
                this.f390258q.close();
                this.f390258q = null;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Mix.AudioFixedConvertProcess", e17, "finishProcess", new java.lang.Object[0]);
        }
        java.lang.Runtime.getRuntime().gc();
    }

    @Override // kl.e
    public kl.l e() {
        return kl.c.a(1);
    }

    @Override // kl.e, kl.k
    /* renamed from: release */
    public void mo143607x41012807() {
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioFixedConvertProcess", "release", null);
        super.mo143607x41012807();
        try {
            java.io.OutputStream outputStream = this.f390258q;
            if (outputStream != null) {
                outputStream.flush();
                this.f390258q.close();
                this.f390258q = null;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Mix.AudioFixedConvertProcess", e17, "outputStream close", new java.lang.Object[0]);
        }
        try {
            java.io.InputStream inputStream = this.f390259r;
            if (inputStream != null) {
                inputStream.close();
                this.f390259r = null;
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Mix.AudioFixedConvertProcess", e18, "inputStream close", new java.lang.Object[0]);
        }
    }
}
