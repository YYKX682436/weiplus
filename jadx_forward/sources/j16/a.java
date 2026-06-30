package j16;

/* loaded from: classes13.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final j16.b a(java.io.InputStream stream) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stream, "stream");
        java.io.DataInputStream dataInputStream = new java.io.DataInputStream(stream);
        e06.k kVar = new e06.k(1, dataInputStream.readInt());
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(kVar, 10));
        java.util.Iterator it = kVar.iterator();
        while (it.hasNext()) {
            ((kz5.x0) it).b();
            arrayList.add(java.lang.Integer.valueOf(dataInputStream.readInt()));
        }
        int[] R0 = kz5.n0.R0(arrayList);
        return new j16.b(java.util.Arrays.copyOf(R0, R0.length));
    }
}
