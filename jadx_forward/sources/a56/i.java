package a56;

/* loaded from: classes16.dex */
public class i implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final java.nio.channels.FileChannel f83171d;

    public i(java.io.File file) {
        if (file == null || !file.exists()) {
            throw new java.lang.IllegalArgumentException("File is null or does not exist");
        }
        this.f83171d = new java.io.FileInputStream(file).getChannel();
    }

    public void a(java.nio.ByteBuffer byteBuffer, long j17, int i17) {
        byteBuffer.position(0);
        byteBuffer.limit(i17);
        long j18 = 0;
        while (j18 < i17) {
            int read = this.f83171d.read(byteBuffer, j17 + j18);
            if (read == -1) {
                throw new java.io.EOFException();
            }
            j18 += read;
        }
        byteBuffer.position(0);
    }

    public int b(java.nio.ByteBuffer byteBuffer, long j17) {
        a(byteBuffer, j17, 2);
        return byteBuffer.getShort() & 65535;
    }

    public java.util.List c() {
        a56.d hVar;
        long j17;
        a56.c a17;
        java.nio.channels.FileChannel fileChannel = this.f83171d;
        fileChannel.position(0L);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        fileChannel.position(0L);
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(8);
        java.nio.ByteOrder byteOrder = java.nio.ByteOrder.LITTLE_ENDIAN;
        allocate.order(byteOrder);
        if (f(allocate, 0L) != 1179403647) {
            throw new java.lang.IllegalArgumentException("Invalid ELF Magic!");
        }
        a(allocate, 4L, 1);
        short s17 = (short) (allocate.get() & 255);
        a(allocate, 5L, 1);
        boolean z17 = ((short) (allocate.get() & 255)) == 2;
        if (s17 == 1) {
            hVar = new a56.g(z17, this);
        } else {
            if (s17 != 2) {
                throw new java.lang.IllegalStateException("Invalid class type!");
            }
            hVar = new a56.h(z17, this);
        }
        java.nio.ByteBuffer allocate2 = java.nio.ByteBuffer.allocate(8);
        if (hVar.f83158a) {
            byteOrder = java.nio.ByteOrder.BIG_ENDIAN;
        }
        allocate2.order(byteOrder);
        long j18 = hVar.f83162e;
        if (j18 == 65535) {
            j18 = hVar.c(0).f83168a;
        }
        long j19 = 0;
        while (true) {
            if (j19 >= j18) {
                j17 = 0;
                break;
            }
            a56.e b17 = hVar.b(j19);
            if (b17.f83164a == 2) {
                j17 = b17.f83165b;
                break;
            }
            j19++;
        }
        if (j17 == 0) {
            return java.util.Collections.unmodifiableList(arrayList);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        long j27 = 0;
        int i17 = 0;
        do {
            a17 = hVar.a(j17, i17);
            long j28 = a17.f83156a;
            if (j28 == 1) {
                arrayList2.add(java.lang.Long.valueOf(a17.f83157b));
            } else if (j28 == 5) {
                j27 = a17.f83157b;
            }
            i17++;
        } while (a17.f83156a != 0);
        if (j27 == 0) {
            throw new java.lang.IllegalStateException("String table offset not found!");
        }
        for (long j29 = 0; j29 < j18; j29++) {
            a56.e b18 = hVar.b(j29);
            if (b18.f83164a == 1) {
                long j37 = b18.f83166c;
                if (j37 <= j27 && j27 <= b18.f83167d + j37) {
                    long j38 = (j27 - j37) + b18.f83165b;
                    java.util.Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        long longValue = ((java.lang.Long) it.next()).longValue() + j38;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        while (true) {
                            long j39 = longValue + 1;
                            a(allocate2, longValue, 1);
                            short s18 = (short) (allocate2.get() & 255);
                            if (s18 != 0) {
                                sb6.append((char) s18);
                                longValue = j39;
                            }
                        }
                        arrayList.add(sb6.toString());
                    }
                    return arrayList;
                }
            }
        }
        throw new java.lang.IllegalStateException("Could not map vma to file offset!");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f83171d.close();
    }

    public long f(java.nio.ByteBuffer byteBuffer, long j17) {
        a(byteBuffer, j17, 4);
        return byteBuffer.getInt() & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
    }
}
