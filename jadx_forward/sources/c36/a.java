package c36;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final d36.b f119792a;

    /* renamed from: b, reason: collision with root package name */
    public final e36.a f119793b;

    /* renamed from: c, reason: collision with root package name */
    public int f119794c;

    public a(byte[] bArr, d36.b unknownTagHandler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unknownTagHandler, "unknownTagHandler");
        this.f119793b = new e36.a(bArr, 0, bArr.length);
        this.f119792a = unknownTagHandler;
    }

    public final int a() {
        int f17;
        e36.a aVar = this.f119793b;
        if (aVar.f329129c == aVar.f329128b) {
            f17 = 0;
            aVar.i(false);
        } else {
            f17 = aVar.f();
            if (f17 == 0) {
                throw new e36.b("Protocol message contained an invalid tag (zero).");
            }
        }
        this.f119794c = f17;
        return f17 >>> 3;
    }

    public final void b() {
        int i17 = this.f119794c & 7;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("FieldNumber: ");
        stringBuffer.append(this.f119794c >>> 3);
        stringBuffer.append(" - ");
        e36.a aVar = this.f119793b;
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
        this.f119792a.getClass();
    }

    public final boolean c(int i17) {
        return this.f119793b.f() != 0;
    }

    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g d(int i17) {
        e36.a aVar = this.f119793b;
        int f17 = aVar.f();
        int i18 = aVar.f329128b;
        int i19 = aVar.f329129c;
        if (f17 >= i18 - i19 || f17 <= 0) {
            return com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(aVar.e(f17));
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(aVar.f329127a, i19, f17);
        aVar.f329129c += f17;
        return gVar;
    }

    public final double e(int i17) {
        return this.f119793b.a();
    }

    public final float f(int i17) {
        return this.f119793b.b();
    }

    public final int g(int i17) {
        return this.f119793b.f();
    }

    public final int h(int i17) {
        return g(i17);
    }

    public final long i(int i17) {
        return this.f119793b.g();
    }

    public final java.util.LinkedList j(int i17) {
        e36.a aVar = this.f119793b;
        aVar.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int f17 = aVar.f();
        try {
            byte[] bArr = new byte[f17];
            int i18 = aVar.f329129c;
            byte[] bArr2 = aVar.f329127a;
            java.lang.System.arraycopy(bArr2, i18, bArr, 0, f17);
            linkedList.add(bArr);
            int i19 = aVar.f329129c + f17;
            aVar.f329129c = i19;
            if (i19 != aVar.f329128b) {
                int[] c17 = aVar.c(i19);
                int i27 = c17[0];
                while ((i27 >>> 3) == i17) {
                    aVar.f329129c = c17[1];
                    int f18 = aVar.f();
                    byte[] bArr3 = new byte[f18];
                    java.lang.System.arraycopy(bArr2, aVar.f329129c, bArr3, 0, f18);
                    linkedList.add(bArr3);
                    int i28 = aVar.f329129c + f18;
                    aVar.f329129c = i28;
                    if (i28 == aVar.f329128b) {
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
        return this.f119793b.h();
    }
}
