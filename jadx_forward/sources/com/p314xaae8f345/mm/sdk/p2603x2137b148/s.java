package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes8.dex */
public class s extends java.io.Writer {

    /* renamed from: d, reason: collision with root package name */
    public java.io.StringWriter f274497d;

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        flush();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        java.io.StringWriter stringWriter = this.f274497d;
        if (stringWriter == null) {
            return;
        }
        java.lang.String stringWriter2 = stringWriter.toString();
        this.f274497d = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BitmapTracer", stringWriter2);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i17, int i18) {
        if (this.f274497d == null) {
            this.f274497d = new java.io.StringWriter();
        }
        this.f274497d.write(cArr, i17, i18);
    }
}
