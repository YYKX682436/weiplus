package com.google.protobuf;

/* loaded from: classes16.dex */
public abstract class f implements com.google.protobuf.o8 {
    protected int memoizedHashCode = 0;

    @java.lang.Deprecated
    public static <T> void addAll(java.lang.Iterable<T> iterable, java.util.Collection<? super T> collection) {
        com.google.protobuf.e.addAll((java.lang.Iterable) iterable, (java.util.List) collection);
    }

    public static void checkByteStringIsUtf8(com.google.protobuf.y yVar) {
        if (!yVar.l()) {
            throw new java.lang.IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    public final java.lang.String a(java.lang.String str) {
        java.lang.String name = getClass().getName();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(name.length() + 62 + java.lang.String.valueOf(str).length());
        sb6.append("Serializing ");
        sb6.append(name);
        sb6.append(" to a ");
        sb6.append(str);
        sb6.append(" threw an IOException (should never happen).");
        return sb6.toString();
    }

    public abstract int getMemoizedSerializedSize();

    public int getSerializedSize(com.google.protobuf.q9 q9Var) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int f17 = q9Var.f(this);
        setMemoizedSerializedSize(f17);
        return f17;
    }

    public com.google.protobuf.pa newUninitializedMessageException() {
        return new com.google.protobuf.pa(this);
    }

    public abstract void setMemoizedSerializedSize(int i17);

    @Override // com.google.protobuf.o8
    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            java.util.logging.Logger logger = com.google.protobuf.k0.f45246b;
            com.google.protobuf.h0 h0Var = new com.google.protobuf.h0(bArr, 0, serializedSize);
            writeTo(h0Var);
            if (h0Var.v() == 0) {
                return bArr;
            }
            throw new java.lang.IllegalStateException("Did not write as much data as expected.");
        } catch (java.io.IOException e17) {
            throw new java.lang.RuntimeException(a("byte array"), e17);
        }
    }

    public com.google.protobuf.y toByteString() {
        try {
            int serializedSize = getSerializedSize();
            com.google.protobuf.y yVar = com.google.protobuf.y.f45712e;
            byte[] bArr = new byte[serializedSize];
            java.util.logging.Logger logger = com.google.protobuf.k0.f45246b;
            com.google.protobuf.h0 h0Var = new com.google.protobuf.h0(bArr, 0, serializedSize);
            writeTo(h0Var);
            if (h0Var.v() == 0) {
                return new com.google.protobuf.w(bArr);
            }
            throw new java.lang.IllegalStateException("Did not write as much data as expected.");
        } catch (java.io.IOException e17) {
            throw new java.lang.RuntimeException(a("ByteString"), e17);
        }
    }

    public void writeDelimitedTo(java.io.OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        int r17 = com.google.protobuf.k0.r(serializedSize) + serializedSize;
        if (r17 > 4096) {
            r17 = 4096;
        }
        com.google.protobuf.j0 j0Var = new com.google.protobuf.j0(outputStream, r17);
        j0Var.S(serializedSize);
        writeTo(j0Var);
        if (j0Var.f45094f > 0) {
            j0Var.a0();
        }
    }

    public void writeTo(java.io.OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        java.util.logging.Logger logger = com.google.protobuf.k0.f45246b;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        com.google.protobuf.j0 j0Var = new com.google.protobuf.j0(outputStream, serializedSize);
        writeTo(j0Var);
        if (j0Var.f45094f > 0) {
            j0Var.a0();
        }
    }

    public static <T> void addAll(java.lang.Iterable<T> iterable, java.util.List<? super T> list) {
        com.google.protobuf.e.addAll((java.lang.Iterable) iterable, (java.util.List) list);
    }
}
