package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public abstract class g implements com.p176xb6135e39.p283xc50a8b8b.e9 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.t4 f126624a = com.p176xb6135e39.p283xc50a8b8b.t4.a();

    public final com.p176xb6135e39.p283xc50a8b8b.o8 a(com.p176xb6135e39.p283xc50a8b8b.o8 o8Var) {
        if (o8Var == null || o8Var.mo20562xf582434a()) {
            return o8Var;
        }
        com.p176xb6135e39.p283xc50a8b8b.pa mo20589xb3590f03 = o8Var instanceof com.p176xb6135e39.p283xc50a8b8b.f ? ((com.p176xb6135e39.p283xc50a8b8b.f) o8Var).mo20589xb3590f03() : new com.p176xb6135e39.p283xc50a8b8b.pa(o8Var);
        mo20589xb3590f03.getClass();
        com.p176xb6135e39.p283xc50a8b8b.y6 y6Var = new com.p176xb6135e39.p283xc50a8b8b.y6(mo20589xb3590f03.getMessage());
        y6Var.f127272d = o8Var;
        throw y6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e9
    /* renamed from: parseDelimitedFrom */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20633x4a829d50(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        com.p176xb6135e39.p283xc50a8b8b.o8 m20666xd020e495 = m20666xd020e495(inputStream, t4Var);
        a(m20666xd020e495);
        return m20666xd020e495;
    }

    /* renamed from: parsePartialDelimitedFrom, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.o8 m20666xd020e495(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return m20680xc7f9c18((java.io.InputStream) new com.p176xb6135e39.p283xc50a8b8b.d(inputStream, com.p176xb6135e39.p283xc50a8b8b.d0.y(read, inputStream)), t4Var);
        } catch (java.io.IOException e17) {
            throw new com.p176xb6135e39.p283xc50a8b8b.y6(e17);
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e9
    /* renamed from: parseDelimitedFrom */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20632x4a829d50(java.io.InputStream inputStream) {
        return mo20633x4a829d50(inputStream, f126624a);
    }

    /* renamed from: parsePartialDelimitedFrom, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.o8 m20665xd020e495(java.io.InputStream inputStream) {
        return m20666xd020e495(inputStream, f126624a);
    }

    /* renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.o8 m20676xc7f9c18(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return (com.p176xb6135e39.p283xc50a8b8b.o8) mo20549xc7f9c18(d0Var, f126624a);
    }

    /* renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.o8 m20678xc7f9c18(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        com.p176xb6135e39.p283xc50a8b8b.d0 m17 = yVar.m();
        com.p176xb6135e39.p283xc50a8b8b.o8 o8Var = (com.p176xb6135e39.p283xc50a8b8b.o8) mo20549xc7f9c18(m17, t4Var);
        try {
            m17.a(0);
            return o8Var;
        } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
            e17.f127272d = o8Var;
            throw e17;
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e9
    /* renamed from: parseFrom */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20635x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        com.p176xb6135e39.p283xc50a8b8b.o8 o8Var = (com.p176xb6135e39.p283xc50a8b8b.o8) mo20549xc7f9c18(d0Var, t4Var);
        a(o8Var);
        return o8Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e9
    /* renamed from: parseFrom */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20634x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return mo20635x92b714fd(d0Var, f126624a);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e9
    /* renamed from: parseFrom */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20637x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        com.p176xb6135e39.p283xc50a8b8b.o8 m20678xc7f9c18 = m20678xc7f9c18(yVar, t4Var);
        a(m20678xc7f9c18);
        return m20678xc7f9c18;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e9
    /* renamed from: parseFrom */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20636x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        return mo20637x92b714fd(yVar, f126624a);
    }

    /* renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.o8 m20677xc7f9c18(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        return m20678xc7f9c18(yVar, f126624a);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e9
    /* renamed from: parseFrom */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20640x92b714fd(java.nio.ByteBuffer byteBuffer) {
        return mo20641x92b714fd(byteBuffer, f126624a);
    }

    @Override // 
    /* renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20683xc7f9c18(byte[] bArr, int i17, int i18, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        com.p176xb6135e39.p283xc50a8b8b.d0 i19 = com.p176xb6135e39.p283xc50a8b8b.d0.i(bArr, i17, i18, false);
        com.p176xb6135e39.p283xc50a8b8b.o8 o8Var = (com.p176xb6135e39.p283xc50a8b8b.o8) mo20549xc7f9c18(i19, t4Var);
        try {
            i19.a(0);
            return o8Var;
        } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
            e17.f127272d = o8Var;
            throw e17;
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e9
    /* renamed from: parseFrom */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20641x92b714fd(java.nio.ByteBuffer byteBuffer, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        com.p176xb6135e39.p283xc50a8b8b.d0 h17 = com.p176xb6135e39.p283xc50a8b8b.d0.h(byteBuffer, false);
        com.p176xb6135e39.p283xc50a8b8b.o8 o8Var = (com.p176xb6135e39.p283xc50a8b8b.o8) mo20549xc7f9c18(h17, t4Var);
        try {
            h17.a(0);
            a(o8Var);
            return o8Var;
        } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
            e17.f127272d = o8Var;
            throw e17;
        }
    }

    /* renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.o8 m20682xc7f9c18(byte[] bArr, int i17, int i18) {
        return mo20683xc7f9c18(bArr, i17, i18, f126624a);
    }

    /* renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.o8 m20684xc7f9c18(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return mo20683xc7f9c18(bArr, 0, bArr.length, t4Var);
    }

    /* renamed from: parseFrom, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.o8 m20662x92b714fd(byte[] bArr, int i17, int i18, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        com.p176xb6135e39.p283xc50a8b8b.o8 mo20683xc7f9c18 = mo20683xc7f9c18(bArr, i17, i18, t4Var);
        a(mo20683xc7f9c18);
        return mo20683xc7f9c18;
    }

    /* renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.o8 m20681xc7f9c18(byte[] bArr) {
        return mo20683xc7f9c18(bArr, 0, bArr.length, f126624a);
    }

    /* renamed from: parseFrom, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.o8 m20661x92b714fd(byte[] bArr, int i17, int i18) {
        return m20662x92b714fd(bArr, i17, i18, f126624a);
    }

    /* renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.o8 m20680xc7f9c18(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        com.p176xb6135e39.p283xc50a8b8b.d0 g17 = com.p176xb6135e39.p283xc50a8b8b.d0.g(inputStream);
        com.p176xb6135e39.p283xc50a8b8b.o8 o8Var = (com.p176xb6135e39.p283xc50a8b8b.o8) mo20549xc7f9c18(g17, t4Var);
        try {
            g17.a(0);
            return o8Var;
        } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
            e17.f127272d = o8Var;
            throw e17;
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e9
    /* renamed from: parseFrom */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20643x92b714fd(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return m20662x92b714fd(bArr, 0, bArr.length, t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e9
    /* renamed from: parseFrom */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20642x92b714fd(byte[] bArr) {
        return mo20643x92b714fd(bArr, f126624a);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e9
    /* renamed from: parseFrom */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20639x92b714fd(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        com.p176xb6135e39.p283xc50a8b8b.o8 m20680xc7f9c18 = m20680xc7f9c18(inputStream, t4Var);
        a(m20680xc7f9c18);
        return m20680xc7f9c18;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e9
    /* renamed from: parseFrom */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20638x92b714fd(java.io.InputStream inputStream) {
        return mo20639x92b714fd(inputStream, f126624a);
    }

    /* renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.o8 m20679xc7f9c18(java.io.InputStream inputStream) {
        return m20680xc7f9c18(inputStream, f126624a);
    }
}
