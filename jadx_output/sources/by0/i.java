package by0;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f36332a;

    /* renamed from: b, reason: collision with root package name */
    public final java.nio.Buffer f36333b;

    public i(android.graphics.Bitmap bitmap, java.nio.Buffer buffer) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        kotlin.jvm.internal.o.g(buffer, "buffer");
        this.f36332a = bitmap;
        this.f36333b = buffer;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof by0.i)) {
            return false;
        }
        by0.i iVar = (by0.i) obj;
        return kotlin.jvm.internal.o.b(this.f36332a, iVar.f36332a) && kotlin.jvm.internal.o.b(this.f36333b, iVar.f36333b);
    }

    public int hashCode() {
        return (this.f36332a.hashCode() * 31) + this.f36333b.hashCode();
    }

    public java.lang.String toString() {
        return "BufferResult(bitmap=" + this.f36332a + ", buffer=" + this.f36333b + ')';
    }
}
