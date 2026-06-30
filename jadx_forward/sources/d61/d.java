package d61;

/* loaded from: classes14.dex */
public final class d extends d61.a {

    /* renamed from: w, reason: collision with root package name */
    public final java.util.List f308247w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.List f308248x;

    public d(int i17, long j17, int i18, long j18) {
        super(i17, j17, i18, j18);
        this.f308247w = new java.util.ArrayList();
        this.f308248x = new java.util.ArrayList();
    }

    public final void b(java.io.RandomAccessFile source, byte[] atomHead) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(atomHead, "atomHead");
        if (source.read(atomHead) >= 8) {
            d61.c.e(atomHead, 0);
            if (d61.c.e(atomHead, 4) == d61.a.f308230m) {
                byte[] bArr = new byte[4];
                source.read(bArr);
                byte b17 = bArr[0];
                source.read(bArr);
                int e17 = d61.c.e(bArr, 0);
                if (b17 == 1) {
                    bArr = new byte[8];
                }
                for (int i17 = 0; i17 < e17; i17++) {
                    java.util.List list = this.f308248x;
                    java.util.List list2 = this.f308247w;
                    if (b17 == 1) {
                        source.read(bArr);
                        ((java.util.ArrayList) list2).add(java.lang.Long.valueOf(d61.c.f(bArr, 0)));
                        source.read(bArr);
                        ((java.util.ArrayList) list).add(java.lang.Long.valueOf(d61.c.f(bArr, 0)));
                    } else {
                        source.read(bArr);
                        ((java.util.ArrayList) list2).add(java.lang.Long.valueOf(d61.c.e(bArr, 0)));
                        source.read(bArr);
                        ((java.util.ArrayList) list).add(java.lang.Long.valueOf(d61.c.e(bArr, 0)));
                    }
                    d61.c.h(source, 4L);
                }
            }
        }
    }
}
