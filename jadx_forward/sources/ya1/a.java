package ya1;

/* loaded from: classes7.dex */
public class a extends java.io.FilterInputStream {

    /* renamed from: d, reason: collision with root package name */
    public long f541950d;

    public a(java.io.FileInputStream fileInputStream) {
        super(fileInputStream);
        this.f541950d = 0L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i17) {
        try {
            this.f541950d = ((java.io.FileInputStream) ((java.io.FilterInputStream) this).in).getChannel().position();
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e("Luggage.ViewAttributeHelper", e17, "fail to mark position.");
            this.f541950d = -1L;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.f541950d < 0) {
            throw new java.io.IOException("Illegal marked position: " + this.f541950d);
        }
        ((java.io.FileInputStream) ((java.io.FilterInputStream) this).in).getChannel().position(this.f541950d);
    }
}
