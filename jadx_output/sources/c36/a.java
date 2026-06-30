package c36;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final d36.b f38259a;

    /* renamed from: b, reason: collision with root package name */
    public final e36.a f38260b;

    /* renamed from: c, reason: collision with root package name */
    public int f38261c;

    public a(byte[] bArr, d36.b unknownTagHandler) {
        kotlin.jvm.internal.o.g(unknownTagHandler, "unknownTagHandler");
        this.f38260b = new e36.a(bArr, 0, bArr.length);
        this.f38259a = unknownTagHandler;
    }

    public final int a() {
        int f17;
        e36.a aVar = this.f38260b;
        if (aVar.f247596c == aVar.f247595b) {
            f17 = 0;
            aVar.i(false);
        } else {
            f17 = aVar.f();
            if (f17 == 0) {
                throw new e36.b("Protocol message contained an invalid tag (zero).");
            }
        }
        this.f38261c = f17;
        return f17 >>> 3;
    }

    public final void b() {
        int i17 = this.f38261c & 7;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("FieldNumber: ");
        stringBuffer.append(this.f38261c >>> 3);
        stringBuffer.append(" - ");
        e36.a aVar = this.f38260b;
        if (i17 == 0) {
            stringBuffer.append("varint (long, int or boolean) value: ");
            stringBuffer.append(aVar.g());
        } else if (i17 == 1) {
            stringBuffer.append("double value: ");
            stringBuffer.append(java.lang.String.valueOf(aVar.a()));
        } else if (i17 == 2) {
            stringBuffer.append("Length delimited (String or ByteString) value: ");
            stringBuffer.append(aVar.h());
        } else if (i17 == 5) {
            stringBuffer.append("float value: ");
            stringBuffer.append(java.lang.String.valueOf(aVar.b()));
        }
        this.f38259a.getClass();
    }

    public final boolean c(int i17) {
        return this.f38260b.f() != 0;
    }

    public final com.tencent.mm.protobuf.g d(int i17) {
        e36.a aVar = this.f38260b;
        int f17 = aVar.f();
        int i18 = aVar.f247595b;
        int i19 = aVar.f247596c;
        if (f17 >= i18 - i19 || f17 <= 0) {
            return com.tencent.mm.protobuf.g.b(aVar.e(f17));
        }
        com.tencent.mm.protobuf.g gVar = new com.tencent.mm.protobuf.g(aVar.f247594a, i19, f17);
        aVar.f247596c += f17;
        return gVar;
    }

    public final double e(int i17) {
        return this.f38260b.a();
    }

    public final float f(int i17) {
        return this.f38260b.b();
    }

    public final int g(int i17) {
        return this.f38260b.f();
    }

    public final int h(int i17) {
        return g(i17);
    }

    public final long i(int i17) {
        return this.f38260b.g();
    }

    public final java.util.LinkedList j(int i17) {
        e36.a aVar = this.f38260b;
        aVar.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int f17 = aVar.f();
        try {
            byte[] bArr = new byte[f17];
            int i18 = aVar.f247596c;
            byte[] bArr2 = aVar.f247594a;
            java.lang.System.arraycopy(bArr2, i18, bArr, 0, f17);
            linkedList.add(bArr);
            int i19 = aVar.f247596c + f17;
            aVar.f247596c = i19;
            if (i19 != aVar.f247595b) {
                int[] c17 = aVar.c(i19);
                int i27 = c17[0];
                while ((i27 >>> 3) == i17) {
                    aVar.f247596c = c17[1];
                    int f18 = aVar.f();
                    byte[] bArr3 = new byte[f18];
                    java.lang.System.arraycopy(bArr2, aVar.f247596c, bArr3, 0, f18);
                    linkedList.add(bArr3);
                    int i28 = aVar.f247596c + f18;
                    aVar.f247596c = i28;
                    if (i28 == aVar.f247595b) {
                        break;
                    }
                    c17 = aVar.c(i28);
                    i27 = c17[0];
                }
            }
            return linkedList;
        } catch (java.lang.OutOfMemoryError unused) {
            throw new java.lang.OutOfMemoryError("alloc bytes:" + f17);
        }
    }

    public final java.lang.String k(int i17) {
        return this.f38260b.h();
    }
}
