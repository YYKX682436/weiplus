package kh1;

/* loaded from: classes13.dex */
public class h extends kh1.c {

    /* renamed from: g, reason: collision with root package name */
    public java.io.OutputStream f389514g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.vfs.r6 f389515h;

    @Override // kh1.e
    /* renamed from: close */
    public void mo51970x5a5ddf8() {
        java.io.OutputStream outputStream = this.f389514g;
        if (outputStream != null) {
            try {
                outputStream.flush();
                this.f389514g.close();
            } catch (java.io.IOException unused) {
            }
            this.f389514g = null;
        }
    }

    @Override // kh1.e
    public boolean d(boolean z17, byte[] bArr, int i17) {
        e(bArr, i17, z17);
        try {
            java.io.OutputStream outputStream = this.f389514g;
            if (outputStream == null) {
                return true;
            }
            outputStream.write(bArr);
            return true;
        } catch (java.lang.Exception unused) {
            return true;
        }
    }

    @Override // kh1.e
    /* renamed from: flush */
    public void mo51971x5d03b04() {
        e(new byte[0], 0, true);
    }

    @Override // kh1.e
    /* renamed from: init */
    public boolean mo51972x316510(java.lang.String str, int i17, int i18, int i19) {
        try {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
            this.f389515h = r6Var;
            if (r6Var.m()) {
                this.f389515h.l();
            }
            this.f389515h.k();
            this.f389514g = new java.io.DataOutputStream(com.p314xaae8f345.mm.vfs.w6.K(str, false));
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("Luggage.PCMAudioEncoder", "", e17);
            return true;
        }
    }
}
