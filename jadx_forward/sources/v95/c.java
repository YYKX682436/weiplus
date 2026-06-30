package v95;

/* loaded from: classes12.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Comparator f515711a = new v95.b();

    public static java.util.List a(u95.a aVar) {
        int min = (int) java.lang.Math.min(32768, aVar.f507424h);
        byte[] bArr = new byte[min];
        long j17 = min;
        long j18 = aVar.f507424h - j17;
        aVar.a(j18, j17);
        int i17 = 0;
        v95.d.d(aVar, bArr, 0, min);
        int i18 = min - 1;
        int i19 = 0;
        while (true) {
            if (i18 < 0) {
                i18 = -1;
                break;
            }
            i19 = (i19 << 8) | bArr[i18];
            if (i19 == 101010256) {
                break;
            }
            i18--;
        }
        long j19 = i18 == -1 ? -1L : j18 + i18;
        if (j19 == -1) {
            throw new java.util.zip.ZipException("EOCD record not found in last 32k of archive, giving up");
        }
        aVar.a(j19, aVar.f507424h - j19);
        if (((int) v95.d.b(aVar)) != 101010256) {
            throw new java.util.zip.ZipException("Bad eocd header");
        }
        v95.d.e(aVar, 6L);
        int a17 = v95.d.a(aVar);
        if (a17 == 65535) {
            throw new java.util.zip.ZipException("No support for zip64");
        }
        long b17 = v95.d.b(aVar);
        long b18 = v95.d.b(aVar);
        aVar.a(b18, b17);
        java.util.ArrayList arrayList = new java.util.ArrayList(a17);
        int i27 = 0;
        while (i27 < a17) {
            if (((int) v95.d.b(aVar)) != 33639248) {
                throw new java.util.zip.ZipException("Bad central directory header");
            }
            v95.d.e(aVar, 4L);
            int a18 = v95.d.a(aVar);
            int a19 = v95.d.a(aVar);
            v95.d.e(aVar, 4L);
            long b19 = v95.d.b(aVar);
            long b27 = v95.d.b(aVar);
            long b28 = v95.d.b(aVar);
            int a27 = v95.d.a(aVar);
            int a28 = v95.d.a(aVar);
            int a29 = v95.d.a(aVar);
            long j27 = b18;
            v95.d.e(aVar, 8L);
            long b29 = v95.d.b(aVar);
            byte[] bArr2 = new byte[a27];
            v95.d.d(aVar, bArr2, 0, a27);
            v95.d.e(aVar, a28 + a29);
            arrayList.add(new v95.a(a19, b19, b27, b28, bArr2, (a18 & 1024) != 0, b29, false));
            i27++;
            b18 = j27;
        }
        long j28 = b18;
        java.util.Collections.sort(arrayList, f515711a);
        while (i17 < arrayList.size()) {
            v95.a aVar2 = (v95.a) arrayList.get(i17);
            long j29 = i17 < arrayList.size() - 1 ? ((v95.a) arrayList.get(i17 + 1)).f515708g : j28;
            long j37 = aVar2.f515708g;
            aVar.a(j37, j29 - j37);
            if (((int) v95.d.b(aVar)) != 67324752) {
                throw new java.util.zip.ZipException("Bad local entry header");
            }
            v95.d.e(aVar, 22);
            aVar2.f515709h = aVar2.f515708g + v95.d.a(aVar) + 30 + v95.d.a(aVar);
            i17++;
        }
        return arrayList;
    }
}
