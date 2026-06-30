package nq;

/* loaded from: classes8.dex */
public class v extends java.io.Writer {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.StringBuilder f420453d = new java.lang.StringBuilder();

    public final void a() {
        java.lang.StringBuilder sb6 = this.f420453d;
        if (sb6.length() > 0) {
            java.lang.String sb7 = sb6.toString();
            java.lang.Object[] objArr = new java.lang.Object[0];
            if (mq.h.f412044a != null) {
                java.lang.String format = java.lang.String.format(sb7, objArr);
                if (format == null) {
                    format = "";
                }
                mq.h.f412044a.v("GLSurfaceView", format);
            }
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
                this.f420453d.append(c17);
            }
        }
    }
}
