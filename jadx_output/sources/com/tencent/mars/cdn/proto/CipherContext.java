package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class CipherContext extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.CipherContext DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.CipherContext();
    private final boolean[] hasSetFields = new boolean[4];

    /* renamed from: iv, reason: collision with root package name */
    private java.lang.String f52525iv;
    private java.lang.String key;
    private com.tencent.mars.cdn.proto.CipherMethod method;

    public static com.tencent.mars.cdn.proto.CipherContext create() {
        return new com.tencent.mars.cdn.proto.CipherContext();
    }

    public static com.tencent.mars.cdn.proto.CipherContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.CipherContext newBuilder() {
        return new com.tencent.mars.cdn.proto.CipherContext();
    }

    public com.tencent.mars.cdn.proto.CipherContext build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.CipherContext)) {
            return false;
        }
        com.tencent.mars.cdn.proto.CipherContext cipherContext = (com.tencent.mars.cdn.proto.CipherContext) fVar;
        return n51.f.a(this.method, cipherContext.method) && n51.f.a(this.key, cipherContext.key) && n51.f.a(this.f52525iv, cipherContext.f52525iv);
    }

    public java.lang.String getIv() {
        return this.hasSetFields[3] ? this.f52525iv : "";
    }

    public java.lang.String getKey() {
        return this.hasSetFields[2] ? this.key : "";
    }

    public com.tencent.mars.cdn.proto.CipherMethod getMethod() {
        return this.hasSetFields[1] ? this.method : com.tencent.mars.cdn.proto.CipherMethod.CIPHER_METHOD_NONE;
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasIv() {
        return hasFieldNumber(3);
    }

    public boolean hasKey() {
        return hasFieldNumber(2);
    }

    public boolean hasMethod() {
        return hasFieldNumber(1);
    }

    public com.tencent.mars.cdn.proto.CipherContext mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.CipherContext();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mars.cdn.proto.CipherMethod cipherMethod = this.method;
            if (cipherMethod != null && this.hasSetFields[1]) {
                fVar.e(1, cipherMethod.value);
            }
            java.lang.String str = this.key;
            if (str != null && this.hasSetFields[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f52525iv;
            if (str2 != null && this.hasSetFields[3]) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mars.cdn.proto.CipherMethod cipherMethod2 = this.method;
            if (cipherMethod2 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.e(1, cipherMethod2.value);
            }
            java.lang.String str3 = this.key;
            if (str3 != null && this.hasSetFields[2]) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f52525iv;
            return (str4 == null || !this.hasSetFields[3]) ? i18 : i18 + b36.f.j(3, str4);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.method = com.tencent.mars.cdn.proto.CipherMethod.forNumber(aVar2.g(intValue));
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.key = aVar2.k(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f52525iv = aVar2.k(intValue);
        this.hasSetFields[3] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.CipherContext setIv(java.lang.String str) {
        this.f52525iv = str;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CipherContext setKey(java.lang.String str) {
        this.key = str;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CipherContext setMethod(com.tencent.mars.cdn.proto.CipherMethod cipherMethod) {
        this.method = cipherMethod;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CipherContext mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.CipherContext parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.CipherContext) super.parseFrom(bArr);
    }
}
