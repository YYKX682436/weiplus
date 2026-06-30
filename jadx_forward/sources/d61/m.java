package d61;

/* loaded from: classes14.dex */
public final class m extends d61.a {

    /* renamed from: w, reason: collision with root package name */
    public long f308285w;

    public final void b(java.io.RandomAccessFile source, byte[] atomHead) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(atomHead, "atomHead");
        byte[] bArr = new byte[4];
        d61.c.h(source, 12L);
        source.read(bArr);
        this.f308285w = d61.c.e(bArr, 0);
        source.read(bArr);
        d61.c.e(bArr, 0);
    }
}
