package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* loaded from: classes7.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.a0 f264248d;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.a0 a0Var) {
        this.f264248d = a0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.a0 a0Var = this.f264248d;
        java.io.InputStream inputStream = null;
        try {
            try {
                inputStream = com.p314xaae8f345.mm.vfs.w6.E(a0Var.f263673d.f263658h);
                java.io.PipedOutputStream pipedOutputStream = a0Var.f263674e;
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    } else {
                        pipedOutputStream.write(bArr, 0, read);
                    }
                }
                inputStream.close();
            } catch (java.lang.Exception unused) {
                return;
            }
        } catch (java.lang.Exception unused2) {
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (java.lang.Throwable th6) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.lang.Exception unused3) {
                    throw th6;
                }
            }
            a0Var.f263674e.close();
            throw th6;
        }
        a0Var.f263674e.close();
    }
}
