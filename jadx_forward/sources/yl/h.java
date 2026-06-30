package yl;

/* loaded from: classes12.dex */
public class h implements yl.b {

    /* renamed from: a, reason: collision with root package name */
    public java.io.OutputStream f544485a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f544486b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.p2920xf91f33c9.p2921xdfffa269.a f544487c;

    public h() {
        new java.util.concurrent.ArrayBlockingQueue(1024);
        cv.j1.a();
    }

    @Override // yl.b
    public int a(tl.h0 h0Var, int i17) {
        return e(h0Var, i17, false);
    }

    @Override // yl.b
    public boolean b(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SpeexWriter", "initWriter, path: " + str);
        if (str == null) {
            return false;
        }
        this.f544486b = str;
        try {
            this.f544485a = com.p314xaae8f345.mm.vfs.w6.K(str, false);
            com.p314xaae8f345.p2920xf91f33c9.p2921xdfffa269.a aVar = new com.p314xaae8f345.p2920xf91f33c9.p2921xdfffa269.a();
            this.f544487c = aVar;
            int e17 = aVar.e();
            if (e17 == 0) {
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SpeexWriter", "speexInit failed: " + e17);
            return false;
        } catch (java.lang.Exception e18) {
            java.io.OutputStream outputStream = this.f544485a;
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (java.io.IOException unused) {
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SpeexWriter", "Error on init file: ", e18);
            return false;
        }
    }

    @Override // yl.b
    public boolean c() {
        com.p314xaae8f345.p2920xf91f33c9.p2921xdfffa269.a aVar = this.f544487c;
        if (aVar != null) {
            aVar.f();
            this.f544487c = null;
        }
        com.p314xaae8f345.p2920xf91f33c9.p2921xdfffa269.a aVar2 = new com.p314xaae8f345.p2920xf91f33c9.p2921xdfffa269.a();
        this.f544487c = aVar2;
        int e17 = aVar2.e();
        if (e17 == 0) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SpeexWriter", "resetWriter speexInit failed: " + e17);
        return false;
    }

    @Override // yl.b
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SpeexWriter", "wait Stop");
        synchronized (this) {
        }
        com.p314xaae8f345.p2920xf91f33c9.p2921xdfffa269.a aVar = this.f544487c;
        if (aVar != null) {
            aVar.f();
            this.f544487c = null;
        }
        java.io.OutputStream outputStream = this.f544485a;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SpeexWriter", "close silk file: " + this.f544486b + "msg: " + e17.getMessage());
            }
            this.f544485a = null;
        }
    }

    @Override // yl.b
    public int e(tl.h0 h0Var, int i17, boolean z17) {
        byte[] bArr;
        int i18;
        com.p314xaae8f345.p2920xf91f33c9.p2921xdfffa269.a aVar = this.f544487c;
        if (aVar == null || (bArr = h0Var.f501581a) == null || (i18 = h0Var.f501582b) == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SpeexWriter", "try write invalid data to file");
            return -1;
        }
        try {
            byte[] d17 = aVar.d(bArr, 0, i18);
            if (d17 == null || d17.length <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SpeexWriter", "convert failed: ".concat(d17 == null ? "outBuffer is null" : "size is zero"));
                return -1;
            }
            this.f544485a.write(d17);
            this.f544485a.flush();
            return d17.length;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SpeexWriter", "write to file failed", e17);
            return -1;
        }
    }
}
