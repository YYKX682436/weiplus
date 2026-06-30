package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes8.dex */
public final class f3 extends java.io.Writer {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.StringBuilder f92848d = new java.lang.StringBuilder(128);

    public f3(java.lang.String str) {
    }

    public final void a() {
        java.lang.StringBuilder sb6 = this.f92848d;
        if (sb6.length() > 0) {
            sb6.toString();
            sb6.delete(0, sb6.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i17, int i18) {
        for (int i19 = 0; i19 < i18; i19++) {
            char c17 = cArr[i17 + i19];
            if (c17 == '\n') {
                a();
            } else {
                this.f92848d.append(c17);
            }
        }
    }
}
