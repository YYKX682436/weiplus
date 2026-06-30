package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public class y6 extends java.io.FilterOutputStream {
    public y6(java.lang.String str) {
        super(com.p314xaae8f345.mm.vfs.w6.K(str, false));
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((java.io.FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i17) {
        ((java.io.FilterOutputStream) this).out.write(i17);
    }

    public y6(com.p314xaae8f345.mm.vfs.r6 r6Var) {
        super(com.p314xaae8f345.mm.vfs.w6.I(r6Var.f294699d, r6Var.M(), false));
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        ((java.io.FilterOutputStream) this).out.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i17, int i18) {
        ((java.io.FilterOutputStream) this).out.write(bArr, i17, i18);
    }
}
