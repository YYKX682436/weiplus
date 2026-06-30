package t46;

/* loaded from: classes13.dex */
public class b extends java.io.Writer implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.StringBuilder f497211d;

    public b() {
        this.f497211d = new java.lang.StringBuilder();
    }

    @Override // java.io.Writer, java.lang.Appendable
    public java.io.Writer append(char c17) {
        this.f497211d.append(c17);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    /* renamed from: toString */
    public java.lang.String m165877x9616526c() {
        return this.f497211d.toString();
    }

    @Override // java.io.Writer
    public void write(java.lang.String str) {
        if (str != null) {
            this.f497211d.append(str);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public java.lang.Appendable append(char c17) {
        this.f497211d.append(c17);
        return this;
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i17, int i18) {
        if (cArr != null) {
            this.f497211d.append(cArr, i17, i18);
        }
    }

    public b(int i17) {
        this.f497211d = new java.lang.StringBuilder(i17);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public java.io.Writer append(java.lang.CharSequence charSequence) {
        this.f497211d.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public java.lang.Appendable append(java.lang.CharSequence charSequence) {
        this.f497211d.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public java.io.Writer append(java.lang.CharSequence charSequence, int i17, int i18) {
        this.f497211d.append(charSequence, i17, i18);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public java.lang.Appendable append(java.lang.CharSequence charSequence, int i17, int i18) {
        this.f497211d.append(charSequence, i17, i18);
        return this;
    }
}
