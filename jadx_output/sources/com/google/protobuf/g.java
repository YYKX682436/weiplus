package com.google.protobuf;

/* loaded from: classes16.dex */
public abstract class g implements com.google.protobuf.e9 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.protobuf.t4 f45091a = com.google.protobuf.t4.a();

    public final com.google.protobuf.o8 a(com.google.protobuf.o8 o8Var) {
        if (o8Var == null || o8Var.isInitialized()) {
            return o8Var;
        }
        com.google.protobuf.pa newUninitializedMessageException = o8Var instanceof com.google.protobuf.f ? ((com.google.protobuf.f) o8Var).newUninitializedMessageException() : new com.google.protobuf.pa(o8Var);
        newUninitializedMessageException.getClass();
        com.google.protobuf.y6 y6Var = new com.google.protobuf.y6(newUninitializedMessageException.getMessage());
        y6Var.f45739d = o8Var;
        throw y6Var;
    }

    @Override // com.google.protobuf.e9
    public com.google.protobuf.o8 parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        com.google.protobuf.o8 m25parsePartialDelimitedFrom = m25parsePartialDelimitedFrom(inputStream, t4Var);
        a(m25parsePartialDelimitedFrom);
        return m25parsePartialDelimitedFrom;
    }

    /* renamed from: parsePartialDelimitedFrom, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.o8 m25parsePartialDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return m30parsePartialFrom((java.io.InputStream) new com.google.protobuf.d(inputStream, com.google.protobuf.d0.y(read, inputStream)), t4Var);
        } catch (java.io.IOException e17) {
            throw new com.google.protobuf.y6(e17);
        }
    }

    @Override // com.google.protobuf.e9
    public com.google.protobuf.o8 parseDelimitedFrom(java.io.InputStream inputStream) {
        return parseDelimitedFrom(inputStream, f45091a);
    }

    /* renamed from: parsePartialDelimitedFrom, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.o8 m24parsePartialDelimitedFrom(java.io.InputStream inputStream) {
        return m25parsePartialDelimitedFrom(inputStream, f45091a);
    }

    /* renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.o8 m26parsePartialFrom(com.google.protobuf.d0 d0Var) {
        return (com.google.protobuf.o8) parsePartialFrom(d0Var, f45091a);
    }

    /* renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.o8 m28parsePartialFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        com.google.protobuf.d0 m17 = yVar.m();
        com.google.protobuf.o8 o8Var = (com.google.protobuf.o8) parsePartialFrom(m17, t4Var);
        try {
            m17.a(0);
            return o8Var;
        } catch (com.google.protobuf.y6 e17) {
            e17.f45739d = o8Var;
            throw e17;
        }
    }

    @Override // com.google.protobuf.e9
    public com.google.protobuf.o8 parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        com.google.protobuf.o8 o8Var = (com.google.protobuf.o8) parsePartialFrom(d0Var, t4Var);
        a(o8Var);
        return o8Var;
    }

    @Override // com.google.protobuf.e9
    public com.google.protobuf.o8 parseFrom(com.google.protobuf.d0 d0Var) {
        return parseFrom(d0Var, f45091a);
    }

    @Override // com.google.protobuf.e9
    public com.google.protobuf.o8 parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        com.google.protobuf.o8 m28parsePartialFrom = m28parsePartialFrom(yVar, t4Var);
        a(m28parsePartialFrom);
        return m28parsePartialFrom;
    }

    @Override // com.google.protobuf.e9
    public com.google.protobuf.o8 parseFrom(com.google.protobuf.y yVar) {
        return parseFrom(yVar, f45091a);
    }

    /* renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.o8 m27parsePartialFrom(com.google.protobuf.y yVar) {
        return m28parsePartialFrom(yVar, f45091a);
    }

    @Override // com.google.protobuf.e9
    public com.google.protobuf.o8 parseFrom(java.nio.ByteBuffer byteBuffer) {
        return parseFrom(byteBuffer, f45091a);
    }

    @Override // 
    /* renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.o8 mo33parsePartialFrom(byte[] bArr, int i17, int i18, com.google.protobuf.t4 t4Var) {
        com.google.protobuf.d0 i19 = com.google.protobuf.d0.i(bArr, i17, i18, false);
        com.google.protobuf.o8 o8Var = (com.google.protobuf.o8) parsePartialFrom(i19, t4Var);
        try {
            i19.a(0);
            return o8Var;
        } catch (com.google.protobuf.y6 e17) {
            e17.f45739d = o8Var;
            throw e17;
        }
    }

    @Override // com.google.protobuf.e9
    public com.google.protobuf.o8 parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        com.google.protobuf.d0 h17 = com.google.protobuf.d0.h(byteBuffer, false);
        com.google.protobuf.o8 o8Var = (com.google.protobuf.o8) parsePartialFrom(h17, t4Var);
        try {
            h17.a(0);
            a(o8Var);
            return o8Var;
        } catch (com.google.protobuf.y6 e17) {
            e17.f45739d = o8Var;
            throw e17;
        }
    }

    /* renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.o8 m32parsePartialFrom(byte[] bArr, int i17, int i18) {
        return mo33parsePartialFrom(bArr, i17, i18, f45091a);
    }

    /* renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.o8 m34parsePartialFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return mo33parsePartialFrom(bArr, 0, bArr.length, t4Var);
    }

    /* renamed from: parseFrom, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.o8 m23parseFrom(byte[] bArr, int i17, int i18, com.google.protobuf.t4 t4Var) {
        com.google.protobuf.o8 mo33parsePartialFrom = mo33parsePartialFrom(bArr, i17, i18, t4Var);
        a(mo33parsePartialFrom);
        return mo33parsePartialFrom;
    }

    /* renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.o8 m31parsePartialFrom(byte[] bArr) {
        return mo33parsePartialFrom(bArr, 0, bArr.length, f45091a);
    }

    /* renamed from: parseFrom, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.o8 m22parseFrom(byte[] bArr, int i17, int i18) {
        return m23parseFrom(bArr, i17, i18, f45091a);
    }

    /* renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.o8 m30parsePartialFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        com.google.protobuf.d0 g17 = com.google.protobuf.d0.g(inputStream);
        com.google.protobuf.o8 o8Var = (com.google.protobuf.o8) parsePartialFrom(g17, t4Var);
        try {
            g17.a(0);
            return o8Var;
        } catch (com.google.protobuf.y6 e17) {
            e17.f45739d = o8Var;
            throw e17;
        }
    }

    @Override // com.google.protobuf.e9
    public com.google.protobuf.o8 parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return m23parseFrom(bArr, 0, bArr.length, t4Var);
    }

    @Override // com.google.protobuf.e9
    public com.google.protobuf.o8 parseFrom(byte[] bArr) {
        return parseFrom(bArr, f45091a);
    }

    @Override // com.google.protobuf.e9
    public com.google.protobuf.o8 parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        com.google.protobuf.o8 m30parsePartialFrom = m30parsePartialFrom(inputStream, t4Var);
        a(m30parsePartialFrom);
        return m30parsePartialFrom;
    }

    @Override // com.google.protobuf.e9
    public com.google.protobuf.o8 parseFrom(java.io.InputStream inputStream) {
        return parseFrom(inputStream, f45091a);
    }

    /* renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.o8 m29parsePartialFrom(java.io.InputStream inputStream) {
        return m30parsePartialFrom(inputStream, f45091a);
    }
}
